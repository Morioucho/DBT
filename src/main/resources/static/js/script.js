document.addEventListener("DOMContentLoaded", function () {
  const buttons = document.querySelectorAll(".image_button");

  buttons.forEach((button) => {
    button.addEventListener("mouseenter", () => {
      const hoverSound = new Audio("sounds/Hover Sound.mp3")
      hoverSound.play();
    });
  });
});
