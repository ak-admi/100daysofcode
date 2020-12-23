var obj={
    meaningoflife:42, foo:"bar", child:{me:"you", other:{him:"her"}}, toString: Object.prototype.toString};

var str=obj+"";
console.log(str);

var objtostring=function(obj, indent){
    obj=obj||this;
    indent=indent||"";
    var res="";
    for(var k in obj){
        if(typeof obj[k]=="object"){
            res+= indent+k+"={\n";
            res+=objtostring(obj[k],indent+"- ");
            res+=indent+ "}";
        }else if(typeof obj[k]!="function"){
            res+=indent+k+"="+obj[k];
        }else{
            continue;
        }
        res+="\n";

    }
    return res;

}

obj.toString=objtostring;
obj+"";
