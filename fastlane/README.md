fastlane documentation
================
# Installation

Make sure you have the latest version of the Xcode command line tools installed:

```
xcode-select --install
```

Install _fastlane_ using
```
[sudo] gem install fastlane -NV
```
or alternatively using `brew cask install fastlane`

# Available Actions
### test
```
fastlane test
```
Runs all the tests
### beta
```
fastlane beta
```
Submit a new Beta Build to Crashlytics Beta
### deploy
```
fastlane deploy
```
Deploy a new version to the Google Play
### makeDebug
```
fastlane makeDebug
```
Just build debug version

----

This README.md is auto-generated and will be re-generated every time [fastlane](https://fastlane.tools) is run.
More information about fastlane can be found on [fastlane.tools](https://fastlane.tools).
The documentation of fastlane can be found on [docs.fastlane.tools](https://docs.fastlane.tools).
