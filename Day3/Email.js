function sendEmail(name,age,comments){
    var age=Number(age);
    if(Number.isNaN(age)|| typeof name!="string"||typeof comments!="string"){
        return null;
    }
    var body=`A user has posted a comment from website: 
    name:${name}
    age:${age}
    status:${(age<18)?`${name} is not a valid user`:`${name} is a valid user`}
    comments:${comments}`;
    return body;
}
console.log(sendEmail("Alok",22,"I want a job"));