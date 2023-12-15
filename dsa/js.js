// // let n=4;
// // let col;
// // let result=""
// // for(let i=1;i<=2*n-1;i++){
// //     if (i>n){
// //         col=2*n-i
// //     }
// //     else{
// //         col=i
// //     }
// //     for(let j=1;j<=col;j++){
// //         result=result+" "+j
// //     }
// //     result=result+"\n"
// // }

// //     console.log(result)

// // // let n=5;
// // // let col;
// // // let result=""
// // // for(let i=1;i<=2*n-1;i++){
// // //     if (i>n){
// // //         col=2*n-i
// // //     }
// // //     else{
// // //         col=i
// // //     }
// // //     for(let j=1;j<=col;j++){
// // //         result=result+" "+i
// // //     }
// // //     result=result+"\n"
// // // }
// // // console.log(result)
// // console.log(global)
// // let global="steffy";
// // // let n=4;
// // // let col;
// // // let result=""
// // // for(let i=1;i<=2*n-1;i++){
// // //     if (i>n){
// // //         col=2*n-i
// // //     }
// // //     else{
// // //         col=i
// // //     }
// // //     for(let j=1;j<=col;j++){
// // //         result=result+" "+col
// // //     }
// // //     result=result+"\n"
// // //     let local="bharath"
// // //     console.log(local);
// // // }

// // let b="";
// // let n=5

// // for(let i=1; i<=n; i++)
// // {
// //     b = b + i+ "";
// // }

// // for(let i=n-1; i>=1; i-- ){
// //     b = b + i+ "";
// // }
// // console.log(b)

// // let a=""
// // let n=5
// // for(let i=n; i>=1;i-- ){
// //     a = a + i+ "";
// // }
// // console.log(a)

// // let n = 6;
// // for (let i = 1; i <= n; i++) {
// //     let string = " ";
// //     for (let j = 1; j <= n; j++) {
// //         if (j < i) {
// //             string = string + "  ";
// //         }
// //         else {
// //             string = string + j +" ";
// //         }
// //     }
// //     console.log(string)
// // }

// // let n =4;
// // for( let i=1;i <=n;i++){
// //     let a="";
// //     for(let j =1; j<=i;j++){
// //        a+= " "+j;
// //     }
// //     for(let h=i;h<n;h++){   // left space loop
// //         a+= "  "
// //     }
// //     for(let l=i;l<n;l++){   //right space loop
// //         a+= "  ";
// //      }
// //      for(let m=i;m>=1;m--){
// //          a+= " "+m;
// //      }
// //     console.log(a);
// // }

// // let n=5
// // for(let i=1; i<=n; i++){
// //     string=" "
// //     for(let j=1; j<=i; j++){
// //         string= string + "  "
// //     }
// //     for(let k=i; k>=i; k--){
// //         string= string + k;
// //     }
// //     console.log(string)
// // }

// // for(let i=1; i<=5; i++){
// //     string=" "
// //     for(let j=1; j<=i; j++){
// //         string=string+" "
// //     }
// //     for(let k=i; k<=i; k++){
// //         string =  string+k;
// //     }
// //     console.log(string)
// // }

// // const n =4;

// // let string = " "

// // for(let i=1; i<=n; i++){

// //     string = string + ".";

// //     console.log(string+i);
// // }

// // for(let j=n-1; j>=1; j--){

// //     string = string + "."
// //     console.log(string+j);

// // }
// // let a=10
// // for(let i=10;i<=a;i++){
// //     for( let j=1;j<=a;j++){
// //         console.log(j +"x"+i+ "=" +i*j)
// //     }
// // }
// // let n=4
// // for(let i=1;i<=10;i++){

// //     if(n!=i){
// //      console.log(i)
// //     }
// // }

// // let a=[7,10,12,15]
// // let add = 0;
// // for(let i=0; i<a.length;i++ ){
// //     if (a[i]%2 == 0 ) {
// //         add =add + a[i]
// //     }
// // }
// // console.log(add);

// // let a=[7,10,12,15]
// // let b= 0;
// // for(let i=0;i<a.length;i++){
// //     if (a[i]%2==0){
// //      b= b +a[i]
// //     }
// // }
// // console.log(b);

// // let a=[1,2,3,4,5,6]
// // let g=2;
// // let n= a.length - (g-1);
// // for(i=0;i<n;i++ ){
// //  let add= 0;
// //  for(j=i;j<(i+g);j++){
// //     add+= a[j]
// //  }

// //  if(max){
// //     if(max<add){
// //         max=add
// //     }
// //  }
// //  else{
// //     let max;
// //     max = add
// //  }
// //  console.log(max);
// // }

// // let a=[12,10,3,4,6]
// // let adding=0;

// // for(let i=0;i<a.length;i++)
// // {
// //     if(a[i]%2==0){
// //         adding=adding+a[i]
// //     }

// // }
// // console.log(adding)

// // function isEvenorOdd(num) {

// //     if(num % 2 == 0){
// //       console.log(num+"is a even")
// //     }
// //     else{
// //       console.log(num+"is a odd")
// //     }
// //   }

// // isEvenorOdd(10) //"10 is a Even number"
// // isEvenorOdd(19) //"19 is a Odd number"

// // Check if input variable is a number or not

// // function  isValidNumber(num){
// //     if(isNaN(num)){
// //         console.log(num+"is a number")
// //     }
// //     else{
// //         console.log(num+"is not num")
// //     }
// // }

// // isValidNumber("a")
// // isValidNumber(12)
// // isValidNumber("d")

// // Find the largest of two number

// // function largestnum(num1, num2){
// //     if(num1 > num2){
// //         console.log(num1+ " is the largest number")
// //     }
// //     if(num2 > num1){
// //         console.log(num2 + " is the largest number")
// //     }
// //     else{
// //         console.log(num1+ "is equal to" +num2);
// //     }

// // }

// // largestnum(14,12)
// // largestnum(4,94)
// // largestnum(4.5,4.8)

// // Find the largest of three number

// // function largestnum(num1,num2,num3) {
// //     if(num1 > num2 && num1>num3){
// //         console.log(num1+" is the largest num")
// //     }
// //     if(num2 >num3){
// //         console.log(num2+" is the largest num")
// //     }
// //     else{
// //         console.log(num3+"is the largest num")
// //     }

// // }
// // largestnum(4.5,4.8,10)
// // largestnum(5,18,13)

// //Given a array of student objects //

// // JSON JavaScript Object Notation
// //Given a array of student objects
// // 0. Find a student whose name is Aravind.
// // 1. Find the eldest student
// // 2. Find the students whose physics score is more than 80
// // 3. Count the number of students whose total average is more than 70.

// // let array_student_obj
// //  = [{name:"Aravind",
// // 	 age:19,
// // 	 salary: 10000,
// // 	 marks:{
// // 			maths:80,
// // 			physics: 78,
// // 			chemistry:90
// // 		}
// // 	 },
// // 	 {name:"Parameshwari",
// // 	 age:18,
// // 	 salary: 10000,
// // 	 marks:{
// // 			maths:95,
// // 			physics: 95,
// // 			chemistry:89
// // 		}
// // 	 },
// // 	 {name:"Barath",
// // 	 age:21,
// // 	 salary: 10000,
// // 	 marks:{
// // 			maths:76,
// // 			physics: 81,
// // 			chemistry:76
// // 		}
// // 	 },{name:"Saran",
// // 	 age:22,
// // 	 salary: 10000,
// // 	 marks:{
// // 			maths:67,
// // 			physics: 51,
// // 			chemistry:39
// // 		}
// // 	 }];

// // Hints:
// //  console.log(array_student_obj[3].salary);
// // let i=1;
// //  console.log(array_student_obj[i].name=="Nanda");

// // ----------------
// // let user_name="Aravind";

// // for(let i=0; i<array_student_obj.length; i++){
// //    user_name==array_student_obj[i].name
// // }
// // console.log(user_name)

// // ------------------

// // 1. Find the eldest student

// // let user_name;
// // let user_age=0;
// // for(let i=0; i <array_student_obj.length; i++){

// //     if(user_age <array_student_obj[i].age){
// //         user_age=array_student_obj[i].age
// //         user_name=array_student_obj[i].name
// //     }

// // }
// // console.log(user_name)

// // ----------//

// //2. Find the students whose physics score is more than 80

// // let physics=80;
// // let user_name;

// // for(let i=0; i<=array_student_obj.length; i++){
// //     if(array_student_obj[i]["marks"]["physics"]>80){
// //         user_name = (array_student_obj[i]);
// //     }
// // }
// // console.log( user_name)

// // or//

// // array_student_obj.find(e=>{
// //     if(
// //        e["marks"]["physics"]>80){
// //         console.log(e["name"])
// //        }

// // })

// // ---------------------//

// // 3. Count the number of students whose total average is more than 70.

// // array_student_obj.find (e=>{
// // 	let count=0;
// //        if(
// //           (e["marks"]["physics"]+e["marks"]["maths"]+e["marks"]["chemistry"]/3)>70){

// // for(i=0; i<array_student_obj; i++){

// // }

// // 	// 		console.log(e["name"])
// //  	// console.log((e["marks"]["physics"]+e["marks"]["maths"]+e["marks"]["chemistry"])/3)

// //           }
// // 		  console.log(count)

// //     })

// // let topper = [];
// //      let learner = [];
// //      for(let i=0; i<array_student_obj.length; i++){
// //          student=array_student_obj[i];
// //         //  console.log(student.marks);
// //          let marks = student.marks;
// //         //  console.log(Object.keys(marks).length );
// //         //  console.log(Object.keys(marks).keys );
// //          let values = [];
// //          for (let key in marks) {
// //             // console.log(marks[key]);
// //            values.push(marks[key]);
// //          }
// //         // console.log(values);
// //         let average = sumOfArray(values);
// //         // console.log(average);
// //         if(average == true){
// //           topper.push(student.name);
// //         }else{
// //             learner.push(student.name);
// //         }
// //     }
// //     console.log(`Greater than 70 -${topper.length}`);
// //     console.log(`Less than 70 -  ${learner.length}`);
// //     function sumOfArray(arr) {
// //         let sum = 0;
// //         for (let i = 0; i < arr.length; i++) {
// //             sum += arr[i];
// //         }
// //         let avg = sum/arr.length;
// //         console.log(avg);
// //         if (avg > 70) {
// //             return true;
// //         }else{
// //             return false;
// //         }
// //     }

// // let a=[1,2,3,4]
// // // function reverseArray(a) {
// // 	for(let i=a.length-1;i>=0;i--){
// // 		console.log(a[i])
// // 	}

// //  }

// // let n = 6;
// // for (let i = 1; i <= n; i++) {
// //     let string = " ";
// //     for (let j = 1; j <= n; j++) {
// //         if (n < i) {
// //             string = string + i +" ";
// //         }
// //         else {

// // 			string = string + "  ";
// //         }
// //     }
// //     console.log(string)
// // }

// // let arr = [-4, 3, -9, 0, 4, 1]
// // function plusMinus(arr) {
// //    let total = arr.length;
// //    let positive =0;
// //    let negative =0;
// //    let zero=0;

// //    let pos;
// //    let neg;
// //    let ze;

// //    for (let i=0; i<arr.length; i++){
// //        if(arr[i]>0){
// //            positive++
// //        }

// //         else if(arr[i]<0){
// //           negative++
// //        }
// //         else {
// //           zero++
// //        }

// //        pos=(positive/total).toFixed(6);
// //        neg=(negative/total).toFixed(6);
// //        ze=(zero/total).toFixed(6);

// //    }

// //    console.log(pos+"\n"+neg+"\n"+ze);

// // }

// // let n=6;
// // let string="";

// //    for(let i= 1; i<=n; i++ ){

// //     for(let j=1; j<= n -i; j++){
// //         string +=" "

// //     }
// //     for(let k=0; k< 1 * i; k++){
// //         string += "#"+ ""
// //     }
// //   string+= "\n";
// //    }
// //    console.log(string)

// // let arr = [6, 2, 3, 4, 5];
// // let total = 0;
// // let sub =0;

// // let temp;

// // function sort(){
// //    temp = arr[i];
// //    arr[i]= arr[i+1];
// //    arr[i+1]=temp
// // }

// // sort(arr)

// // for (let i = 0; i < arr.length; i++) {

// //     total = total + arr[i];

// // }

// // for(let j=0; j<arr.length-1; j++){

// //   sub =Math.abs (sub + arr[j])

// // }
// // console.log(total)
// // console.log(sub)

// // let arr = [6, 2, 3, 4, 5];
// // let min=0;
// // let max=0;

// // for(let i=0; i<arr.length;i++){
// // arr= arr.sort()
// // }
// // for(let j=0; j<arr.length-1;j++){
// //   min =min+arr[j]
// // }
// // for(let k=1; k<arr.length;k++){
// //   max =max+arr[k]
// // }
// // console.log(min+" "+max)

// //  let newarr = []
// //  for(let i = 0; i < arr.length; i++){
// //      let total = 0;
// //      for(let j = 0; j < arr.length; j++){
// //          total +=             arr[j]
// //      }
// //      total -= arr[i]
// //      newarr.push(total)
// //  }
// //  let minmax = [Math.min(...newarr), Math.max(...newarr)]
// //  console.log(...minmax);

// let arr="learning"
// for(let i=0; i<arr.length; i++){

// }

// function sortby(hbvfc,b){
//   let c =hbvfc +b
//   return c
// }

// // div====

// let a = sortby("name", "gyyt")

// // divv========
// let b=sortby("number", "gyyt")
// console.log(a);
// console.log(b);

// let res=0;

// let num=50
// let a=[1,2,3,4,5]
// a.forEach(e=>{
// res+=e;

// })
// res=num-res
// console.log(res)

// let arr=[3,1,5,7,9]

// //    console.log(sort)
// arr.sort()
// let min=0;
// let max=0;
// let sort=arr.sort()

// for(let j=0;j<sort.length-1;j++) {
//     min=min+sort[j];

// }
// for(let k=1;k<sort.length;k++) {
//     max=max+sort[k];

// }
// console.log(min +" "+max)

//  let candels=[4,4,1,3]
//  let ans;
//  let count=0;
//  max=Math.max(...candels)

// for(let i=0;i<candels.length;i++){
//  if(candels[i]==max){
//     count=count+1;

//  }

// }
// console.log(count);

// a = [3, 3, 3]
// b = [1, 2, 1]

// let count=0;
// let count_1=0;

// for(let i=0;i<a.length;i++){
//     if(a[i]>b[i]){
//         count++
//        }
// }

// for(let j=0;j<b.length;j++){
//     if(b[j]>a[j]){
//         count_1++
//        }
// }
// console.log(count+" "+count_1)

// for(let j=0;j<arr.length-1;j++) {
//     min=sum+sort[j];

// }
// for(let k=1;k<arr.length;k++) {
//     max=res+sort[k];

// }
// console.log(min +""+max)
// }

// let steffy=[9,8,7,6,3]
// let min=0
// let swap
// for(let i=0; i<steffy.length; i++){

//     if(min<steffy[i]){
//         swap=min
//         min=steffy[i];
//         steffy[i]=swap

//     }
// }
// console.log(min)
// let b;
// let a="steffy"
// b=a.slice(0,3);
// console.log(b)

// let b;
// let a="steffy"
// b=a.indexOf("f")
// console.log(b)

// let b;
// let a="steffy"
// b=a.lastIndexOf("f")
// console.log(b)

// let b;
// let a="steffy"

// console.log(a.charCodeAt(3))

// let b;
// let c;
// let a="steffy"
// b=a.slice(0,2);
// c=a.slice(4,6);
// console.table(b+c);

// let b=0;
// let a=[1,2,3,8,4]
// for(let i=0;i<a.length;i++){
//     if(b>a[i]){
//         b=a[i]
//     }
// }
// console.log(b)

// let arr=[1,2,3,8,4]
// let b=Math.min(...arr)
// console.log(b)
// let cut;
// let fruits=["apple","orange","pineapple","papaya","guava","mango"]
// cut=fruits.slice(0,4)
// console.log(cut)

// let d=4;
// let arr=[1,2,3,4,5]
// let splice;
// let slice;
// let ans;
// splice=arr.splice(d)
// console.log(splice)

// slice=arr.slice(0,d)
// console.log(slice)

// ans=splice.concat(slice)

// console.log(ans)

//factorail//

// let n=10;

// function factor(n){
//     console.log(n)
//     if(n==1){
//        return 1
//     }
//     else{
//    return factor(n-1);
//     }

// }
// factor(n)

// let url = "https://jsonplaceholder.typicode.com/users";

// fetch(url)
// .then(
// response=>{
//     console.log("huytcghv b")
// console.log(response)
// }
// )
// .catch(
//    e=>{
//     console.log(e)
//    }
// )

// function factorial(a){

//     if(a==1){
// return 1;
//     }
//     return a*factorial(a-1);
// }

// console.log(factorial(5));

// let a =[2,3,4,5,56,6]
// let output=1;
// a.forEach(e=>{
// output*=e;
// }
// )

// console.log(output)

//jj

// var source = [
//     { name: "Paul", age: 24 },
//     { name: "Mary", age: 31 },
//     { name: "Peter", age: 24 },
//     { name: "John", age: 31 }
// ];

// //
// groupedNames={};

// source.forEach(function (person){
// if(!groupedNames[person.age]){
//     groupedNames[person.age]=[];

// }
// groupedNames[person.age].push(person.name);
// });
// console.log(groupedNames);

// var source = [
//     { name: "Paul", age: 24 },
//     { name: "Mary", age: 31 },
//     { name: "Peter", age: 24 },
//     { name: "John", age: 31 }
// ];

// source.unshift({name:"steffy", age: 20});
// source.shift(source[1])

// console.log(source[1].name)

// const map1 = new Map();

// map1.set('0', 'foo');
// map1.set(1, 'bar');

// const iterator1 = map1[Symbol.iterator]();

// for (const item of iterator1) {
//   console.log(item);
// }

// class Example {
//     constructor() {
//         this.items = [{ my: "1" }, { my: "12" }, { my: "3" }];
//         this.totalValue = this.items
//             .filter((item) => item.my)
//             .map((item) => +item.my)
//             .reduce((sum, current) => sum + current, 0); // Added initial value for reduce
//     }
// }

// const exampleInstance = new Example();
// console.log(exampleInstance.totalValue);