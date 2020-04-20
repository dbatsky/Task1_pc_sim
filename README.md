# Task1_pc_sim
## Idea:
   Application that allows the user to build a PC (Personal Computer) that consists of a CPU, GPU, PSU etc.
 The PC can exist in several states - OFF and ON. It can also server several purposes, according
 to the needs of the user - it can be used for Streaming, for Gaming or for Mining.
 
## Design Patterns:

*   Creational:
    * Builder - PC is built part-by-part
    * Singleton - Facade as a Singleton

*   Structural:
    * Flyweight - Different PCs can have the same Brand/Model of GPU and CPU
    * Decorator - PC can have added functionality, according to its purpose that can be attached
    * Facade - Conveniently interact with the subsystems, additionally hiding their implementations

*   Behavioral:
    * State - PC exhibits different behaviour based on whether it is turned ON
    
