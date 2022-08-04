## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## ΠΟΙΟΣ ΕΙΝΑΙ Ο ΡΟΛΟΣ ΤΟΥ ΚΑΘΕ ΑΝΤΙΚΕΙΜΕΝΟΥ ? 
Αρχικά να θυμίσουμε ότι από τα σόκετς περνάνε μόνο bytes , αυτό σημαίνει δλδ ότι από την μερία του κλιεντ χρειαζόμαστε αντικείμενα που να μετατρέπουν char -> bytes και να τα στέλνουν 
και από την μερία του server θέλουμε από bytes->char  και μάλιστα να είναι και κάπως tokenized γιατί μέσα από τα tcp sockets παιρνάνε μόνο byteStreams και όχι πακέτα και μηνήματα. 

## ΠΩΣ ΞΕΡΩ ΟΤΙ ΕΧΩ ΦΤΙΑΞΕΙ ΣΤΡΕΑΜ ΣΟΚΕΤΣ ΚΑΙ ΟΧΙ DATAGRAM ΣΟΚΕΤΣ ? 
    =>επειδη για τα datagram φτιαχνεις αλλη κλασση , την datagramSocket.