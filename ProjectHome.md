# FITTEST Project's Software Home #

FITTEST is an FP7 European research project no 257574 on Future Internet Testing, carried out in 2011 - 2013. This site is the home of the tools that together consitute the FITTEST Testing Tool Suite. The open source tools can be downloaded from here, the other proprtietary tools will be linked to the web of the owning company.

The FITTEST Testing Tool Suite consists of tools for:

  1. Continuous Testing - The FITTEST Integrated Testing Environment (ITE)
  1. Regression Testing - The Change Sensitivity Test Prioritization (CSTP)
  1. Graphical User Interface Testing - The Rogue User Testing tool (RU)
  1. Combinatorial Testing - (The CTE Profesional of B&M, CTD/Focus of IBM, and HHSA of UCL)
  1. Concurrency Testing - Contest of IBM

The Project's Publications and other material can be found [here](http://crest.cs.ucl.ac.uk/fittest/)


## 1. Continuous Testing: the FITTEST Integrated Testing Environment (ITE) ##

The [FITTEST Integrated Testing Environment](FittestIte.md) (ITE) for Continuous Testing is delivred as an integrated whole. Hoewever, individual componentes that make up the solution can be downloaded, installed and used separately.

### Tools and Libraries ###

These are ITE components and other tools and libraries that we also provide individually. e.g. for usage in other tool.


  * **Logging and Reporting Tools**
| _Flash_ | FlashLogger (automatic logger for Flash applications)|
|:--------|:-----------------------------------------------------|
|         | [FCC](https://code.google.com/p/fittest/wiki/FCC)  (code coverage tool for Flash applications) |
| _PHP_   | [PHPLogger](https://code.google.com/p/fittest/wiki/PHPLogger) (automatic logger for PHP applications) |
| _Java_  | [TrT](TrT.md) (tool for compact and traceable logging) |

  * **Instrumenter Tools**
| _Flash_ | [ABCI](ABCI.md) (ActionScript Byte Code Instrumenter) |
|:--------|:------------------------------------------------------|

  * **Oracle Tools**
| | [Haslog suite](HaslogSuite.md) (a set of tools to process FITTEST logs and infer oracles) |
|:|:------------------------------------------------------------------------------------------|
| | [LOPI](Lopi.md) (Log-based pattern Inference tool)                                        |

  * **Model Inference and Transformer Tools**
| _FSM-based_ | [Logs2FSM](Logs2FSM.md) (tool to infer Finite State Machine) |
|:------------|:-------------------------------------------------------------|
|             | [XinputMiner](XinputMiner.md) (input domains miner)          |
|             | [FSM2CT](FSM2CT.md) (FSM to Classification Trees transformer) |
|             | [CT2Selenium](CT2Selenium.md) (Classification Trees to Selenium JUnit-tests transformer) |
| _EFSM-based_ | [Logs2EFSM](Logs2EFSM.md) (tool to infer extended FSM)       |
|             | [EFSM2Selenium](Efsm2Selenium.md) (tool to generate Selenium tests from extended FSM) |

## 2. Regression Testing - The Change Sensitivity Test Prioritization (CSTP) ##

Audit testing of Future Internet services differs from traditional regression testing because the testing budget is typically much more limited (only a very small subset of the regression test suite can be executed) and because the kind of changes that are expected in the service composition is known and quite specific. In fact, audit testing is used to check the proper functioning of a service composition when some external services change. Some adaptations of the service composition that are required to make the composition work are trivially detected at the syntactical level, by the compiler which will immediately report any interface change that needs adaptation on the composition side. It is only those semantic changes that do not affect the service API description (for example WSDL) that may go undetected and require audit testing. The FITTEST approach to test case prioritization for audit testing of services, called **Change Sensitivity Test Prioritization** (CSTP), is based on the idea that the most important test cases are those that can detect mutations of the service responses, when such mutations affect the semantics, while leaving the WSDL syntax unchanged.


Read more about the [Change Sensitivity Test Prioritization (CSTP)](CSTP.md).

## 3. GUI Testing - The Rogue User Testing tool (RU) ##

Modern Graphical User Interfaces (GUIs) are large, complex and difficult to access programmatically which poses great challenges for their testability. The Rogue User is a technique that allows completely unattended testing of large and complex gui-based SUTs.

Read more about the [Rogue user](Rogue.md).


## 4. Combinatorial Testing ##

Combinatorial testing can be a very efficient and effective strategy for testing software systems. Given a System Under Test (SUT) with k parameters, t-way combinatorial testing requires all combinations of values of t (out of k) parameters be covered at least once, where t is usually a small integer. Consequently, if the test parameters are modeled properly, all faults caused by interactions involving no more than t parameters will be detected.


### The CTE XL Profesional of B&M ###

The Classification Tree Editor (CTE) is a software tool for test design. It implements the Classification Tree Method presented by Grimm and Grochtmann.

Read more about the [CTE XL Professional](CTE.md).

### Focus/CTD of IBM ###

IBM Focus offers a Combinatorial Test Design (CTD) technique based on a
Cartesian product based methodology and technology that assist in defining a complete and consistent test space for CTD.


Read more about the [IBM FOCUS CTD](CTD.md).

### HHSA of UCL ###

The HHSA hyperheuristic algorithm is a promising way to relocate CIT design intelligence from human to machine. It learns CIT strategies and provides a single generalist approach.

Read more about the [UCL HHSA algorithm](HHSA.md).

## 5. Concurrency Testing - Contest of IBM ##


Read more about the [IBM Concurrency Testing](ConTest.md).




## Credits ##

_Participating partners:_
[Universidad Politecnica De Valencia](http://www.upv.es/index-en.html),
[University College London](http://www.ucl.ac.uk/),
[Berner & Mattner Systemtechnik](http://www.berner-mattner.com/en/berner-mattner-home/company/index.html),
[IBM Israel](https://www.research.ibm.com/haifa/research.shtml),
[Fondazione Bruno Kessler](http://www.fbk.eu/),
[Universiteit Utrecht](http://www.cs.uu.nl/),
[Softeam](http://www.softeam.fr/).