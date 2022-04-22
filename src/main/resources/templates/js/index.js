function setNewImage() {

    document.body.style.backgroundImage = "url(../img/背景4.png)";

}

function setOldImage() {
    document.body.style.backgroundImage = "url(../img/背景4.jpg)";
}






window.onload = function () {
    setInterval("toggleSound()", 100);
}

function toggleSound() {
    var music = document.getElementById("vd");//獲取ID

    if (music.paused) { //判讀是否播放
        music.paused = false;
        music.play(); //沒有就播放
    }
}