# Introduction #

TransformTools is a suite of tools for:

  * Model inference from logs
  * Test generation that take FSMs models and domain input specifications as inputs and generates executable test cases in:
    1. Selenium Webdriver http://seleniumhq.org for Web Apps
    1. Robotium http://code.google.com/p/robotium for Android Apps

The tools are available as standalone Java programs and are also integrated in an Eclipse Plugin, called eu.fittest.transformtools.standalone. It's enough to install the plugin into an Eclipse environment to get all the transformation features.

Moreover, these transformation tools are integrated in the ITE as well, thereforem, all the features are available in ITE.

# Installation #
  * For individual tools, you can download the source code and use Maven to build from the root project.
  * For the plugin, please use the [Update Site](http://selab.fbk.eu/magic/update/)

  1. In Eclipse, open Help > Install New Software ...
  1. Copy and Page the link of the update site above into the Work With address box
  1. Follow the eclipse instructions

For the plugin, you can also build it from source code and drag/drop the build of the plugin to the plugins folder of Eclipse.

# How to use the plugin #

## Quick ##
  1. Create or reuse an Eclipse project
  1. Import logs (in FITTEST format) or model (FSM, FITTEST format) into a folder
  1. Use the folder to infer model
  1. Use the model to infer a draft of domain input specifications, detail the output file as needed
  1. Use the model & the domain input spec file to generate classification trees
  1. Use the trees to generate executable test cases

If you install the plugin together with ITE, you benefit from the all-in-one wizard to generate tests from logs, no need to follow the step by step process as described above.

## Long ##

To be written.

