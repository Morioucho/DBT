document.addEventListener("DOMContentLoaded", function () {
    const overlayButton = document.getElementById('overlay_button');
    const overlay = document.getElementById('overlay');
    const buttonsSection = document.getElementById('buttons');

    overlayButton.addEventListener('click', () => {
        // Smoothly fade out the overlay
        overlay.classList.add('hidden');
        // Optionally, scroll to the buttons section if needed
        buttonsSection.scrollIntoView({
            behavior: 'smooth'
        });
    });
});