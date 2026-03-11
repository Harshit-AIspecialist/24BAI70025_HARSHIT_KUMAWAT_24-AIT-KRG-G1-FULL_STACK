const fetchDataPromise = new Promise((resolve, reject) => {
  setTimeout(() => {
    resolve("Data fetched successfully");
  }, 2000);
});

fetchDataPromise
  .then((message) => {
    console.log(message); 
  })
  .catch((error) => {
    console.error("An error occurred:", error);
  });
