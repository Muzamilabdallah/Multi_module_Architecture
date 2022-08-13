 
# Simpe Multi_module_Architecture app

 this is simple shopping app that implement MultiModule Architecture by managing gradle with buildSrc
 and Gradle dsl plugin.
 In this app I just followed modular by layer and when your app get bigger you can add more module as feature and make mixing between modularing by layer and feature.


 Managing this all modules is tough if not implemented the right way 
 you will face alot of gradle issues .
 so I created custom plugin in  buildSrc folder and used kotlin dsl plugin to manage all modules gradle from one place.
 and applied this plugin to every module.
 the **app** module work like navhost for all modules or features
 the  **Core** module contains common shared files or classes and utilites
 amongs the all modules

 

 

## Authors

- [@Muzamil](https://github.com/Muzamilabdallah)

 
## Tech Stack

**Jetpack Compose** -
**hilt** -
**Retrofit**-
**Mvvm**
 
## License

[MIT](https://choosealicense.com/licenses/mit/)


 


## Documentation

[Documentation](https://linktodocumentation)


## Badges

Add badges from somewhere like: [shields.io](https://shields.io/)

[![MIT License](https://img.shields.io/apm/l/atomic-design-ui.svg?)](https://github.com/tterb/atomic-design-ui/blob/master/LICENSEs)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)


## Screenshots

![App Screenshot](https://via.placeholder.com/468x300?text=App+Screenshot+Here)
