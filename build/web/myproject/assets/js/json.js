var mybtn=document.getElementById("ajax_btn");
var view=document.getElementById("tab_moh");
var count=0;
mybtn.addEventListener("click",function(){
    var ourRequest=new XMLHttpRequest();
    ourRequest.open('GET','http://localhost:8080/bus_mgmt/View',true);
    ourRequest.send();
    count++;
    
    if(count<=1)
   {
    ourRequest.onload=function()
    {
        var data=JSON.parse(ourRequest.responseText);
        //console.log(data);
       renderHTML(data);
    };  
   }
});

function renderHTML(data)
{
var myTable="";
for( i=0;i<data.length;i++)
{
    myTable += "<tr>"+"<td>"+data[i].id+"</td>"+"<td>"+data[i].bus_no+"</td>"+"<td>"+data[i].route_no+"</td>"+"<td>"+data[i].dname+"</td>"+"<td>"+data[i].city+"</td>"+"<td>"+data[i].route+"</td>"+"</tr>";
}

 view.insertAdjacentHTML('beforeend',myTable);
}

  