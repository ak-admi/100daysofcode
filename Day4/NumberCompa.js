function grade(ave) {
    if(ave<35){
        return "F";
    }
    else if(ave>35 && ave<44){
        return "D";

    }
    else if(ave>45 && ave<59){
        return "C";
    }
    else if(ave>60 && ave<74){
        return "B";

    }
    else{
        return "A";
    }

    
}

var ave=0;
sum=0;
a=[70,89,76,50,98,67];
for(var i=0;i<a.length;i++){
    sum=sum+a[i];
}
ave=(sum*100)/600;
console.log(grade(ave));