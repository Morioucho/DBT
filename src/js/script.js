// Adding an event listener to the page so that
// we can listen for events (self explanatory..)
document.addEventListener("DOMContentLoaded", function () {
  // Since we made a buttons class, we're using that to retrieve
  // ALL of the buttons. (that's why its querySelectorALL)
  //                                                  ^^^
  const buttons = document.querySelectorAll(".image_button");

  // For this section I just turned it into English for simplicity.
  // For each button...
  buttons.forEach((button) => {
    // Add an event listener for when the mouse enters its area...
    button.addEventListener("mouseenter", () => {
      // And create a new sound from our sounds folder...
      const hoverSound = new Audio("sounds/Hover Sound.mp3")
      // And play it.
      hoverSound.play();
    });
  });
});
