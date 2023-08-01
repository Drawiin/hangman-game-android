# Hangman Game

Hangman is an engaging word-guessing game where players select letters one by one to guess a secret word. The objective is to solve the word in the minimum amount of time and with the fewest guesses possible. Beware, too many incorrect guesses, and you'll lose, leading to the infamous "hanging" outcome.

## Features

- Pre-loaded Word List: The game comes with a pre-loaded list of words fetched from a remote service, which is loaded only the first time. Additionally, users can customize and add their own words to enhance the gameplay.

- Share Results: Players have the option to share their game results with friends, allowing for friendly competition and sharing achievements.

- Multiplayer Mode: Enjoy the game with friends in either cooperative or player-versus-player mode, adding an element of social interaction and fun to the experience.

- Difficulty Levels: Words in the game have varying levels of difficulty, catering to players of all skill levels. Choose the difficulty level that suits you best and challenge yourself accordingly.

## Technologies

This project leverages the latest and most cutting-edge technologies in the Android development world, including:

- Modern UI with Jetpack Compose: Utilizing the power of Jetpack Compose to create elegant and interactive user interfaces, ensuring an immersive gameplay experience.

- Modular Project Organization: Employing multi-modules and convention plugins for a well-organized and maintainable project structure.

- Automated CI and Quality Checks: Implementing mobile development with automated Continuous Integration (CI) pipelines and thorough quality checks. This includes monitoring, build performance tests, and more, to ensure a smooth development process.

- Kotlin Multiplatform (KMM): Using Kotlin Multiplatform to share business logic across platforms, maximizing code reuse and minimizing redundancy.

- Automated Testing: The project features a comprehensive suite of automated tests, including unit tests, screenshot tests, and end-to-end tests, to maintain code quality and identify issues early.

### Specific Technologies

The specific technologies employed in this project include:

1. Platform Technologies:

    - KMM (Kotlin Multiplatform Mobile): Enabling the sharing of business logic between different platforms.

    - Compose Multiplatform: Facilitating the sharing of UI components across platforms.

    - Jetpack Compose: Creating Android-specific UI elements.

    - SwiftUI: Handling iOS-specific UI elements.

    - Gradle and Convention Plugins: Managing KMM and Android build logic efficiently.

    - CocoaPods & Xcode: Managing iOS-specific platform logic.

    - Ktor: Handling network requests.

    - SqlDelight: Providing local caching and storage.

    - Firebase SDK: Managing backend-related functionalities.

2. Design Patterns:

    - MVI (Model-View-Intent): Handling UI state and logic, ensuring a reactive and maintainable UI.

    - Clean Architecture: Organizing the project for better separation of concerns and scalability.

    - Modularization: Dividing features into cohesive units for better maintainability and collaboration.

3. Housekeeping and Code Quality:

    - Github Actions: Implementing Continuous Integration to streamline the development workflow.

    - Renovate: Automating dependency updates to ensure the project is using the latest versions.

    - Detekt: Performing code quality analysis to identify potential issues and ensure adherence to coding standards.

    - Kover: Monitoring code coverage to ensure adequate test coverage.

    - Gradle Profiler: Identifying and resolving build performance issues to optimize development speed.


## Contribution

This project is open to contributions, and we welcome any feedback, bug reports, or feature requests from the community. If you'd like to contribute, please fork the repository and create a pull request.


## License
