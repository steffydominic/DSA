let ab = document.getElementById("field");
let b = document.getElementById("btn");
let des = document.getElementById("description");
let deg = document.getElementById("degree");

b.addEventListener("click", () => {
  f(ab.value);
  // f()
  // Call the function f() with the city name when the button is clicked
});
const apikey = "2e1a1ef48e00f5a9cf203a01f134eab6";
async function f(city) {

  try {
    // Replace {lat}, {lon}, and {part} with actual values or remove them if not needed
    let fetchedData = await fetch(
      `https://api.openweathermap.org/data/2.5/weather?q=${city}&appid=${apikey}`
    );
    let data = await fetchedData.json();
    console.log(data);
    let weatherdes = data.weather[0].description;
    des.textContent = `Weather Description: ${weatherdes}`;
    let wind = data.wind.deg;
    deg.textContent = `wind deg: ${wind}`;
  } catch (error) {
    console.log(error);
  }
  
}

//absolute path
//relative path
// https://dummy.restapiexample.com/api/v1/employees

// function f(){
//     fetch('https://dummyjson.com/products/1')
//     .then(response=>response.json())
//     .then(res=>{
//         console.log(res)
//     })
//     .catch(error=>{
//         console.log("error");
//     });
// }
// f();

// const f = async () => {
//     try{
//        let a= await fetch('	https://dummy.restapiexample.com/api/v1/employee/21');
//         let b=await (a.json()) ;
//        console.log(b);
//     }
//     catch{error=>{
//        console.log("error");
//     }
//     };
// }
// f();

// const f=async()=>{
//     try{
//      let a=await fetch('https://dummy.restapiexample.com/api/v1/employee/1');
//      let b=await a.json();
//      console.log(b);
//     }
//      catch{
//         (error=>{
//        console.log("error");
//      })
//     }
// }
// f();

// const postReq = {
//     employee_name: 'Steffy Alexander',
//     employee_salary: 5000800,
//     employee_age: 19,
//     profile_image: ''
// };

// const f = async () => {
//     try {
//         // Fetch data from the API
//         let response = await fetch('https://dummy.restapiexample.com/api/v1/employee/1');

//         if (!response.ok) {
//             throw new Error(`HTTP error! Status: ${response.status}`);
//         }

//         let data = await response.json();

//         // Log fetched data
//         console.log("Fetched Data:", data);

//         // Send a POST request with postReq payload
//         let postResponse = await fetch('https://dummy.restapiexample.com/api/v1/create', {
//             method: 'POST',
//             headers: {
//                 'Content-Type': 'application/json',
//             },
//             body: JSON.stringify(postReq),
//         });

//         if (!postResponse.ok) {
//             throw new Error(`HTTP error! Status: ${postResponse.status}`);
//         }

//         let postData = await postResponse.json();

//         // Log data from the POST request
//         console.log("Posted Data:", postData);

//     } catch (error) {
//         console.error("Error:", error);
//     }
// };

// // Call the function
// f();

// const postReq = {
//     employee_name: 'Steffy Alexander',
//     employee_salary: 5000800,
//     employee_age: 19,
//     profile_image: ''
// };

// const f=async()=>{
//   try{
//     let a=await fetch('https://dummy.restapiexample.com/api/v1/employee/1');

//     if(!a.ok){
//         throw new Error(`HTTP error status :${a.status}`);
//     }
//     let b=await a.json();
//     console.log(b);

//   let res=await fetch('https://dummy.restapiexample.com/api/v1/create',{
//     method:'POST',
//     headers:{
//         'Content-Type': 'application/json',
//     },
//     body:JSON.stringify(postReq)

//   });
//  if(!res.ok){
//   console.log(`Http status error ${res.status}`);
//  }
//   let data=await res.json();
//   console.log(data);

// }
//  catch{
//  error=>{
//     console.log("errror",error);
//  }
//  }};

//practice
//post req ====create in the link...

// const postReq = {
//     employee_name: 'Steffy Alexander',
//     employee_salary: 5000800,
//     employee_age: 19,
//     profile_image: ''
// };

// const f=async()=>{
//     try{
//   let a=await fetch('https://dummy.restapiexample.com/api/v1/employee/1');
//   if(!a.ok){
//     console.log(`HTTP Status Error ${a.status}`);
//   }
//   let b=await a.json();
//   console.log(b);

//   let res=await fetch('https://dummy.restapiexample.com/api/v1/update',{
//     method:'POST',
//     headers:{
//         'Content-Type':'application/json',
//     },
//     body:JSON.stringify(postReq)
// });
//   if(!res.ok){
//     console.log(`HTTP Status Error ${res.status}`);
//   }
//   let d=await res.json();
//   console.log(d);
// }
//   catch(error){
//     console.log("error",error);
//   }
//   };

//   f();

//put request

//update in the link
// const postReq = {
//   id:1,
//   employee_name: "Steffy dominic",
//   employee_salary: 5000800,
//   employee_age: 19,
//   profile_image: "",
// };

// const f = async () => {
//   try {
//     let a = await fetch("https://dummy.restapiexample.com/api/v1/employee/1");
//     if (!a.ok) {
//       console.log(`HTTP Status Error ${a.status}`);
//     }
//     let b = await a.json();
//     console.log(b);

//     let dataa = { ...b, ...postReq };
//     let res = await fetch("https://dummy.restapiexample.com/api/v1/update/1", {
//       method: "PUT",
//       headers: {
//         "Content-Type": "application/json",
//       },
//       body: JSON.stringify(dataa),
//     });
//     if (!res.ok) {
//       console.log(`HTTP Status Error ${res.status}`);
//     }
//     let d = await res.json();
//     console.log(d);
//   } catch (error) {
//     console.log("error", error);
//   }
// };

// f();
