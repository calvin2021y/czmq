/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Read the zproject/README.md for information about making permanent changes. #
################################################################################
*/
package org.zeromq.czmq;

import java.util.stream.Stream;
import org.scijava.nativelib.NativeLoader;

public class Ziflist implements AutoCloseable{
    static {
        if (System.getProperty("java.vm.vendor").contains("Android")) {
            System.loadLibrary("czmqjni");
        } else {
            Stream.of(
                "zmq",
                "uuid",
                "libsystemd",
                "lz4",
                "curl",
                "microhttpd",
                "czmq"
            )
            .forEach(lib -> {
                try {
                    NativeLoader.loadLibrary(lib);
                } catch (Exception e) {
                    System.err.println("[WARN] " + e.getMessage() +" from jar. Assuming it is installed on the system.");
                }
            });
            try {
                NativeLoader.loadLibrary("czmqjni");
            } catch (Exception e) {
                System.exit (-1);
            }
        }
    }
    public long self;
    /*
    Get a list of network interfaces currently defined on the system
    */
    native static long __new ();
    public Ziflist () {
        /*  TODO: if __new fails, self is null...            */
        self = __new ();
    }
    public Ziflist (long pointer) {
        self = pointer;
    }
    /*
    Destroy a ziflist instance
    */
    native static void __destroy (long self);
    @Override
    public void close () {
        __destroy (self);
        self = 0;
    }
    /*
    Reload network interfaces from system
    */
    native static void __reload (long self);
    public void reload () {
        __reload (self);
    }
    /*
    Return the number of network interfaces on system
    */
    native static long __size (long self);
    public long size () {
        return __size (self);
    }
    /*
    Get first network interface, return NULL if there are none
    */
    native static String __first (long self);
    public String first () {
        return __first (self);
    }
    /*
    Get next network interface, return NULL if we hit the last one
    */
    native static String __next (long self);
    public String next () {
        return __next (self);
    }
    /*
    Return the current interface IP address as a printable string
    */
    native static String __address (long self);
    public String address () {
        return __address (self);
    }
    /*
    Return the current interface broadcast address as a printable string
    */
    native static String __broadcast (long self);
    public String broadcast () {
        return __broadcast (self);
    }
    /*
    Return the current interface network mask as a printable string
    */
    native static String __netmask (long self);
    public String netmask () {
        return __netmask (self);
    }
    /*
    Return the list of interfaces.
    */
    native static void __print (long self);
    public void print () {
        __print (self);
    }
    /*
    Get a list of network interfaces currently defined on the system
    Includes IPv6 interfaces
    */
    native static long __newIpv6 ();
    public static Ziflist newIpv6 () {
        return new Ziflist (__newIpv6 ());
    }
    /*
    Reload network interfaces from system, including IPv6
    */
    native static void __reloadIpv6 (long self);
    public void reloadIpv6 () {
        __reloadIpv6 (self);
    }
    /*
    Return true if the current interface uses IPv6
    */
    native static boolean __isIpv6 (long self);
    public boolean isIpv6 () {
        return __isIpv6 (self);
    }
    /*
    Self test of this class.
    */
    native static void __test (boolean verbose);
    public static void test (boolean verbose) {
        __test (verbose);
    }
}
