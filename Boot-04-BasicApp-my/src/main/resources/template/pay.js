const { data, type } = require("jquery");


const paymentStart=()=>{

    console.log("payment started");
    let amount= $("#payment_field").val();
    console.log(amount);
    

    if(amount=="" || amount == null){
        alert("amount is required !");
        return;
    }

    $.ajax(
        URL='/user/create_order',
        data:{amount:amount},
        contentType:"application/json",
        type:'POST',
        
    )

};