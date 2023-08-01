## Build Logic

The project's build logic is centralized and maintained in a single location, ensuring consistency across all modules of the application. To achieve this, we utilize an included build named `build-logic`, which incorporates convention plugins designed to be applied to each module selectively. This modularity allows each module to select and utilize only the components it requires.

## Approach and Inspiration

This approach is built upon personal experience gained from implementing similar patterns in substantial projects. We draw heavy inspiration from two primary sources:

1. [Now in Android App](https://github.com/android/nowinandroid/tree/main/build-logic): This repository showcases a similar build logic pattern for Android applications and serves as a reference for best practices.

2. [Slack Gradle Plugin](https://github.com/slackhq/slack-gradle-plugin): The Slack Gradle plugin exemplifies well-organized build logic and provides insights into creating a streamlined build system.

By combining the lessons learned from these sources with our own experiences, we aim to create an efficient and maintainable build system for this project.

## Usage

To apply the `build-logic` and its convention plugins to your module, follow the instructions provided in the corresponding documentation. This will enable your module to benefit from the consistent build logic shared across the entire project.
