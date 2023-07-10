/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{html,js}"],
  theme: {
    extend: {
      colors: {
        'dark': '#121212',
        'light': '#f1f1f1',
        'purple': '#6432BE',
        'purple-light': '#7243D4',
        'dark-light': '#222222'
      },
    },
  },
  plugins: [],
}