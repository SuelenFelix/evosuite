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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.lang.Integer;

public class Bus_write_135098028011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39112;
     Object term39200;
     Object term39202;

    public Bus_write_135098028011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39205 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term39204 = ((Class) term39205).getDeclaredField((String) "NMOS_6502");
        ((Field) term39204).setAccessible(true);
        Object enum31 = ((Field) term39204).get((Object) null);
        HashMap term39160 = new HashMap();
        HashMap term39194 = new HashMap();
        term39112 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term39115 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term39130 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term39133 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term39135 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term39138 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term39165 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term39166 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term39174 = (int[]) newIntArray(2);
        int[] term39177 = (int[]) newIntArray(2);
        Object[] term39199 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        setIntField(term39112, term39112.getClass(), "startAddress", 621910137);
        setIntField(term39112, term39112.getClass(), "endAddress", 241533020);
        setLongField(term39115, term39115.getClass(), "clockPeriodInNs", 1000L);
        setField(term39115, term39115.getClass(), "behavior", enum31);
        setIntField(term39130, term39130.getClass(), "startAddress", 2081679151);
        setIntField(term39130, term39130.getClass(), "endAddress", -1030167086);
        setLongField(term39133, term39133.getClass(), "clockPeriodInNs", 1000L);
        setField(term39133, term39133.getClass(), "behavior", enum31);
        setIntField(term39135, term39135.getClass(), "startAddress", -434230943);
        setIntField(term39135, term39135.getClass(), "endAddress", 698633875);
        setField(term39135, term39135.getClass(), "cpu", null);
        setField(term39135, term39135.getClass(), "deviceMap", null);
        setField(term39135, term39135.getClass(), "deviceAddressArray", null);
        setField(term39133, term39133.getClass(), "bus", term39135);
        setIntField(term39138, term39138.getClass(), "a", 0);
        setIntField(term39138, term39138.getClass(), "x", 0);
        setIntField(term39138, term39138.getClass(), "y", 0);
        setIntField(term39138, term39138.getClass(), "sp", 0);
        setIntField(term39138, term39138.getClass(), "pc", 0);
        setIntField(term39138, term39138.getClass(), "ir", 0);
        setIntField(term39138, term39138.getClass(), "nextIr", 0);
        setField(term39138, term39138.getClass(), "args", null);
        setField(term39138, term39138.getClass(), "nextArgs", null);
        setIntField(term39138, term39138.getClass(), "instSize", 0);
        setBooleanField(term39138, term39138.getClass(), "opTrap", false);
        setBooleanField(term39138, term39138.getClass(), "irqAsserted", false);
        setBooleanField(term39138, term39138.getClass(), "nmiAsserted", false);
        setIntField(term39138, term39138.getClass(), "lastPc", 0);
        setBooleanField(term39138, term39138.getClass(), "carryFlag", false);
        setBooleanField(term39138, term39138.getClass(), "negativeFlag", false);
        setBooleanField(term39138, term39138.getClass(), "zeroFlag", false);
        setBooleanField(term39138, term39138.getClass(), "irqDisableFlag", false);
        setBooleanField(term39138, term39138.getClass(), "decimalModeFlag", false);
        setBooleanField(term39138, term39138.getClass(), "breakFlag", false);
        setBooleanField(term39138, term39138.getClass(), "overflowFlag", false);
        setLongField(term39138, term39138.getClass(), "stepCounter", 0L);
        setField(term39133, term39133.getClass(), "state", term39138);
        setLongField(term39133, term39133.getClass(), "opBeginTime", 185793058502220865L);
        setField(term39130, term39130.getClass(), "cpu", term39133);
        setField(term39130, term39130.getClass(), "deviceMap", term39160);
        setField(term39130, term39130.getClass(), "deviceAddressArray", term39165);
        setField(term39115, term39115.getClass(), "bus", term39130);
        setIntField(term39166, term39166.getClass(), "a", 0);
        setIntField(term39166, term39166.getClass(), "x", 0);
        setIntField(term39166, term39166.getClass(), "y", 0);
        setIntField(term39166, term39166.getClass(), "sp", 0);
        setIntField(term39166, term39166.getClass(), "pc", 0);
        setIntField(term39166, term39166.getClass(), "ir", 0);
        setIntField(term39166, term39166.getClass(), "nextIr", 0);
        setField(term39166, term39166.getClass(), "args", term39174);
        setField(term39166, term39166.getClass(), "nextArgs", term39177);
        setIntField(term39166, term39166.getClass(), "instSize", 0);
        setBooleanField(term39166, term39166.getClass(), "opTrap", false);
        setBooleanField(term39166, term39166.getClass(), "irqAsserted", false);
        setBooleanField(term39166, term39166.getClass(), "nmiAsserted", false);
        setIntField(term39166, term39166.getClass(), "lastPc", 0);
        setBooleanField(term39166, term39166.getClass(), "carryFlag", false);
        setBooleanField(term39166, term39166.getClass(), "negativeFlag", false);
        setBooleanField(term39166, term39166.getClass(), "zeroFlag", false);
        setBooleanField(term39166, term39166.getClass(), "irqDisableFlag", false);
        setBooleanField(term39166, term39166.getClass(), "decimalModeFlag", false);
        setBooleanField(term39166, term39166.getClass(), "breakFlag", false);
        setBooleanField(term39166, term39166.getClass(), "overflowFlag", false);
        setLongField(term39166, term39166.getClass(), "stepCounter", 0L);
        setField(term39115, term39115.getClass(), "state", term39166);
        setLongField(term39115, term39115.getClass(), "opBeginTime", -7698746988132548371L);
        setField(term39112, term39112.getClass(), "cpu", term39115);
        setField(term39112, term39112.getClass(), "deviceMap", term39194);
        setField(term39112, term39112.getClass(), "deviceAddressArray", term39199);
        term39200 = new Integer(1253334988);
        term39202 = new Integer(1086709736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term39200;
        args[1] = term39202;
        callMethod(klass, "write", argTypes, term39112, args);
    }

};


