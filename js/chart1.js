const ctx = document.getElementById("soldproduct");

new Chart(ctx, {
  type: "bar",
  data: {
    labels: ["25/5/2023", "26/5/2023", "27/5/2023", "28/5/2023", "29/5/2023", "30/5/2023"],
    datasets: [
      {
        label: "Sold Product",
        data: [12, 19, 3, 5, 0, 0],
        backgroundColor: [
            'blue',
            'blue',
            'blue',
            'blue',
            'blue',
            'blue'
        ],
        borderWidth: 1,
      },
    ],
  },
  options: {
    scales: {
      y: {
        beginAtZero: true,
      },
    },
  },
});
