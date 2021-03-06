package learn.java.cleber.lecheta.oop;

import learn.java.cleber.lecheta.pc.emmaus.ComputerTypeEnum;
import learn.java.cleber.lecheta.pc.Cpu;
import learn.java.cleber.lecheta.pc.Memory;

/**
 * Interface to force all computer concrete classes
 * to have methods and/or attributes common for all PCs.
 *
 * @author Cleber Lecheta
 * https://encontreijesus.com
 */
public interface Computer {

    /**
     * all attributes in a interface are final, and so cannot be changed
     * https://pt.wikipedia.org/wiki/X8
     */
    String architecture = "x86_x64";

    /**
     * all classes that inherit from Computer will have to implement the interface methods
     */
    ComputerTypeEnum getFormat();

    /**
     * all methods in a interface must be public
     */
    Cpu getCpu();

    Memory getMemory();

}
