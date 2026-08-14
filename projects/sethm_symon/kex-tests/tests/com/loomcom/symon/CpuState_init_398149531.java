package com.loomcom.symon;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static com.loomcom.symon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CpuState_init_398149531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82630;

    public CpuState_init_398149531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82630 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term82638 = (int[]) newIntArray(2);
        int[] term82641 = (int[]) newIntArray(2);
        setIntField(term82630, term82630.getClass(), "a", -444451515);
        setIntField(term82630, term82630.getClass(), "x", -545419660);
        setIntField(term82630, term82630.getClass(), "y", -1917689550);
        setIntField(term82630, term82630.getClass(), "sp", 1829428325);
        setIntField(term82630, term82630.getClass(), "pc", -1881843694);
        setIntField(term82630, term82630.getClass(), "ir", -1134250665);
        setIntField(term82630, term82630.getClass(), "nextIr", -1607263638);
        setField(term82630, term82630.getClass(), "args", term82638);
        setField(term82630, term82630.getClass(), "nextArgs", term82641);
        setIntField(term82630, term82630.getClass(), "instSize", 691469974);
        setBooleanField(term82630, term82630.getClass(), "opTrap", false);
        setBooleanField(term82630, term82630.getClass(), "irqAsserted", true);
        setBooleanField(term82630, term82630.getClass(), "nmiAsserted", false);
        setIntField(term82630, term82630.getClass(), "lastPc", -2080503799);
        setBooleanField(term82630, term82630.getClass(), "carryFlag", false);
        setBooleanField(term82630, term82630.getClass(), "negativeFlag", true);
        setBooleanField(term82630, term82630.getClass(), "zeroFlag", false);
        setBooleanField(term82630, term82630.getClass(), "irqDisableFlag", true);
        setBooleanField(term82630, term82630.getClass(), "decimalModeFlag", true);
        setBooleanField(term82630, term82630.getClass(), "breakFlag", false);
        setBooleanField(term82630, term82630.getClass(), "overflowFlag", true);
        setLongField(term82630, term82630.getClass(), "stepCounter", 1950957495500453461L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.CpuState");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.CpuState");
        Object[] args = new Object[1];
        args[0] = term82630;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


