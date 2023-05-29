const labels = ['2017','2018','2019','2020','2021','2022','2023'];

const data = {
  labels: labels,
  datasets: [
    {
      label: "Revenue",
      data: [65, 59, 80, 81, 56, 55, 40],
      fill: false,
      borderColor: "rgb(75, 192, 192)",
      tension: 0.1,
    },
  ],
};

const config = {
  type: "line",
  data: data,
};

var myChart = new Chart(document.getElementById('revenue'), config)
