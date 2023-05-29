const navBar = document.querySelector("nav"),
  menuBtns = document.querySelectorAll(".menu-icon"),
  overlay = document.querySelector(".overlay");

menuBtns.forEach((menuBtn) => {
  menuBtn.addEventListener("click", () => {
    navBar.classList.toggle("open");
  });
});

overlay.addEventListener("click", () => {
  navBar.classList.remove("open");
});

// let list = document.querySelectorAll(".tbody .tr");
let thispage = 1;
let limit = 3;

console.log(list.length);

function loadItem() {
  let beginGet = limit * (thispage - 1);
  let endGet = limit * thispage - 1;

  list.forEach((item, key) => {
    if (key >= beginGet && key <= endGet) {
      item.style.display = "block";
    } else {
      item.style.display = "none";
    }
  });
  listPage();
}

loadItem();

function listPage() {
  let count = Math.ceil(list.length / limit);
  document.querySelector(".listPage").innerHTML = "";

  // if(this.page != 1) {

  // }

  for (i = 1; i <= count; i++) {
    let newPage = document.createElement("li");
    newPage.innerText = i;
    if (i == thispage) {
      newPage.classList.add("active");
    }
    newPage.setAttribute("onclick", "changePage(" + i + ")");
    document.querySelector(".listPage").appendChild(newPage);
  }

  //   if (thispage != count) {
  //     let next = document.createElement("li");
  //     next.innerText = "NEXT";
  //     next.setAttribute("onclick", "changePage(" + (thispage + 1) + ")");
  //     document.querySelector(".listPage").appendChild(next);
  //   }
}

function changePage(i) {
  thispage = i;
  loadItem();
}

// document.getElementById("span").addEventListener("click", () => {
//   document.querySelector('.des').classList.toggle('active')
// });

var options = {
  series: [
    {
      name: "sales",
      data: [
        {
          x: "2019/01/01",
          y: 400,
        },
        {
          x: "2019/04/01",
          y: 430,
        },
        {
          x: "2019/07/01",
          y: 448,
        },
        {
          x: "2019/10/01",
          y: 470,
        },
        {
          x: "2020/01/01",
          y: 540,
        },
        {
          x: "2020/04/01",
          y: 580,
        },
        {
          x: "2020/07/01",
          y: 690,
        },
        {
          x: "2020/10/01",
          y: 690,
        },
      ],
    },
  ],
  chart: {
    type: "bar",
    height: 380,
  },
  xaxis: {
    type: "category",
    labels: {
      formatter: function (val) {
        return "Q" + dayjs(val).quarter();
      },
    },
    group: {
      style: {
        fontSize: "10px",
        fontWeight: 700,
      },
      groups: [
        { title: "2019", cols: 4 },
        { title: "2020", cols: 4 },
      ],
    },
  },
  title: {
    text: "Grouped Labels on the X-axis",
  },
  tooltip: {
    x: {
      formatter: function (val) {
        return "Q" + dayjs(val).quarter() + " " + dayjs(val).format("YYYY");
      },
    },
  },
};

var chart = new ApexCharts(document.querySelector("#chart"), options);
chart.render();
