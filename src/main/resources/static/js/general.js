 $(document).ready(function () {

     // used in all pages
    $(".icon").click(function(){
        document.getElementById("mySidenav").style.width = "100%";

    })

    $(".closebtn").click(function(){
        document.getElementById("mySidenav").style.width = "0";
    })


    $(".button-load").click(function () {

        $(".card-container").removeClass("card-state");
        $(this).css("display", "none");

    });

    /////Index page /////

     //Pop-up Effect for the cards
    $(".card").hover(function () {
            $(this).css("box-shadow"," 3px 3px 8px #aaaaaa").css("transform", "scale(1.1)")
        },
        function () {
            $(this).css("box-shadow","none").css("transform", "scale(1)")
        });

     /////Discover page /////

     // Select categories
     $("select").change(function () {
         var category = $(this).val();

         if(category == "all"){
             $(".list-group-item").removeClass("card-state");
         }else{
             $(".list-group-item").addClass("card-state");
             $("small[name='"+category+"']").closest(".list-group-item").removeClass("card-state");
         }
     });


    //change badges colours
     var page = $("title").text();
     if(page != "Homepage"){
         $(".nav-item").removeClass("active");
         $("#" + page).addClass("active");
     }

     $("span[name='Beginner']").addClass("badge-primary")
     $("span[name='Intermediate']").addClass("badge-info")
     $("span[name='Advanced']").addClass("badge-success")

});