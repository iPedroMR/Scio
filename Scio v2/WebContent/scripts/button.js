crossBtnClick = () => {
    let mainContainer = document.getElementById("mainHolder");
    if(mainContainer.className == "animate_main") {
        mainContainer.className = "reverse_animate";
    } else {
        mainContainer.className = "animate_main";
    }
}

cameraClick = () => {alert("camera clicked")}
micClick = () => {alert("mic clicked")}
musicClick = () => {alert("music clicked")}