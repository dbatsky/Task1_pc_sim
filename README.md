# Task1_pc_sim
## Idea:
   Application that allows the user to build a PC and perform various operations with it.
 PC has components: CPU, GPU, PSU.
 PC can exist in several states: OFF and ON
 PC can be decorated with added functionality: Streaming, Gaming, Mining
 
## Design Patterns:

*   Creational:
    * Builder - Several kinds of PCs can be quickly built using the builder pattern
    * Singleton - Facade class for executing low-level operations exists as a singleton

*   Structural:
    * Flyweight - Different PCs can have the same Model of GPU, which share different attributes such as default clock speeds, manufacturer etc
    * Decorator - PC can have added functionality
    * Facade - Conveniently interact with the subsystems, hiding immplementation of low-level operations such as flyweight initialization

*   Behavioral:
    * State - PC can exist in several states, exhibiting different behaviour when it is interacted with
    
