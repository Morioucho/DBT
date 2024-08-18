// Same principle as script.js, you got this...
document.addEventListener("DOMContentLoaded", function () {
    const overlayButton = document.getElementById('overlay_button');
    const overlay = document.getElementById('overlay');
    const buttonsSection = document.getElementById('buttons');

    overlayButton.addEventListener('click', () => {
        // Induce the css fade in style.css.
        overlay.classList.add('hidden');
        // Make sure the buttons are actually in view.
        buttonsSection.scrollIntoView({
            behavior: 'smooth'
        });
    });
});