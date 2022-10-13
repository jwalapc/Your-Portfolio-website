console.log("script running....");

document.querySelector(".cross").addEventListener("click", () => {
    document.querySelector(".sidebar").classList.toggle("sidebarGo");
    setTimeout(() => {   
        document.querySelector(".ham").style.visibility = "visible";
    }, 300);
    document.querySelector(".cross").style.visibility = "hidden";
});

document.querySelector(".ham").addEventListener("click", () => {
  document.querySelector(".sidebar").classList.toggle("sidebarGo");
  setTimeout(() => {   
    document.querySelector(".cross").style.visibility = "visible";
}, 300);
  document.querySelector(".ham").style.visibility = "hidden";
});
