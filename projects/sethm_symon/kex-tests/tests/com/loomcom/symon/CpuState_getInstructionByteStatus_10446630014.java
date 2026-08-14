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

public class CpuState_getInstructionByteStatus_10446630014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82723;

    public CpuState_getInstructionByteStatus_10446630014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82723 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term82731 = (int[]) newIntArray(2);
        int[] term82734 = (int[]) newIntArray(2);
        setIntField(term82723, term82723.getClass(), "a", -1075257608);
        setIntField(term82723, term82723.getClass(), "x", -693529847);
        setIntField(term82723, term82723.getClass(), "y", -325187625);
        setIntField(term82723, term82723.getClass(), "sp", -317484961);
        setIntField(term82723, term82723.getClass(), "pc", 418080259);
        setIntField(term82723, term82723.getClass(), "ir", 657195865);
        setIntField(term82723, term82723.getClass(), "nextIr", 1397647176);
        setField(term82723, term82723.getClass(), "args", term82731);
        setField(term82723, term82723.getClass(), "nextArgs", term82734);
        setIntField(term82723, term82723.getClass(), "instSize", -1375675721);
        setBooleanField(term82723, term82723.getClass(), "opTrap", false);
        setBooleanField(term82723, term82723.getClass(), "irqAsserted", true);
        setBooleanField(term82723, term82723.getClass(), "nmiAsserted", true);
        setIntField(term82723, term82723.getClass(), "lastPc", 456313553);
        setBooleanField(term82723, term82723.getClass(), "carryFlag", false);
        setBooleanField(term82723, term82723.getClass(), "negativeFlag", false);
        setBooleanField(term82723, term82723.getClass(), "zeroFlag", false);
        setBooleanField(term82723, term82723.getClass(), "irqDisableFlag", false);
        setBooleanField(term82723, term82723.getClass(), "decimalModeFlag", false);
        setBooleanField(term82723, term82723.getClass(), "breakFlag", false);
        setBooleanField(term82723, term82723.getClass(), "overflowFlag", false);
        setLongField(term82723, term82723.getClass(), "stepCounter", 3824691451696451167L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.CpuState");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getInstructionByteStatus", argTypes, term82723, args);
    }

};


