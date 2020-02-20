<h1>Projet-Network simulation software</h1>

1. Context and definition of the problem
    
    Networks have many forms (electrical, road, social, administrative, urban, cerebral, logistics, organic, etc.). The management of these networks generates many positions which, although scattered in various fields, share important similarities.
    The ambition is to meet the representation needs of these networks, both in the generality of the basic principles and in the specifications specific to each. In this way, it is possible to pool the resources and challenges of professional players for the development of a powerful software tool.
    What is more, a common solution will be a good basis of exchange between the different users. They will then be able to share their experiences and enrich their technical skills, both in terms of software and networks.
One of the main motivations of this project is to realize a solution which can suit a large panel of different networks.

2. Objective of the project :
    We want to make a generic product that allows network management. This product will be applicable on several types of networks (computer network, road network, social network, etc.) We also want to implement it on an example of networks and develop a user interface that facilitates access to these features.

3. Functions implemented :
    Version 1 (Implementation of a network framework) 
    - User interface allowing the visualization of the network 
    - Add / Remove a node with the following characteristics 
        - name 
        - management of the sending and the reception of packets by priority lists 
        - store data 
    - Add / Remove a link with the following characteristics 
        - id 
        - attached nodes 
        - direction 
        - size and capacity 
        - can impose a maximum speed 
     - Send an object from one node to another with the following characteristics 
        - id 
        - data 
        - journey 
        - travel speed 
     Version 2 (Implementation of an internal hospital network based on the framework) 
     - Allow the user interface to create a hospital network 
     - Add / Remove the following objects 
        - Patients.es 
        - Doctors
     - Add / Remove the following nodes 
        - Waiting room 
        - Treatment room 
        - Physicians' rest room
     - Add / Remove the following links 
        - Corridor 
     - Create a library of characteristics for objects (diseases, professions)
     Version 3 (Development of the framework) 
     - Addition of the following characteristics for the links 
        - management of the rights of way 
     - Addition of the following characteristics for the objects 
        - management of the rights of passage
        - self-determination of the shortest route or faster depending on departure and arrival 
        - manage inter-object interactions 
     
4. Possible perspectives:
     Version 4 (Development of the hospital network) 
     - Add / Remove the following objects: 
        - Nurses 
        - Reception staff 
        - Stretcher 
     - Add / Remove the following nodes: 
        - Imaging rooms 
        - Operating rooms 
        - Pediatrics service 
        - Pharmacy 
     - Add / Remove the following links 
        - Lifts 
        - Stairs 
     - Adapt objects, nodes and links in v2 with inputs of v3 
     - Development of inter-object interactions according to their characteristics (profession, disease) 
     Version 5 (Development of the interface) 
     - Graphic development 
     - User-friendly content creation interface 
     Version 6 * (Development of statistics on the performance of hospital networks) 
     - Allow to see certain data in real time - average waiting time 
        - flow 
        - queue in the rooms 
     - Allow the visualization of the evolution of an object (doctor or patient)
