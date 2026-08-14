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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class Cpu_sbcDecimal_177704972217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179955;
     Object term180049;
     Object term180051;

    public Cpu_sbcDecimal_177704972217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term180054 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term180053 = ((Class) term180054).getDeclaredField((String) "NMOS_6502");
        ((Field) term180053).setAccessible(true);
        Object enum197 = ((Field) term180053).get((Object) null);
        HashMap term179981 = new HashMap();
        HashMap term180015 = new HashMap();
        term179955 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term179970 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term179973 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term179975 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term179978 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term179986 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term179987 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term179995 = (int[]) newIntArray(2);
        int[] term179998 = (int[]) newIntArray(2);
        Object[] term180020 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term180021 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term180029 = (int[]) newIntArray(2);
        int[] term180032 = (int[]) newIntArray(2);
        setLongField(term179955, term179955.getClass(), "clockPeriodInNs", 1000L);
        setField(term179955, term179955.getClass(), "behavior", enum197);
        setIntField(term179970, term179970.getClass(), "startAddress", 684728176);
        setIntField(term179970, term179970.getClass(), "endAddress", 2089342829);
        setLongField(term179973, term179973.getClass(), "clockPeriodInNs", 1000L);
        setField(term179973, term179973.getClass(), "behavior", enum197);
        setIntField(term179975, term179975.getClass(), "startAddress", 1201220971);
        setIntField(term179975, term179975.getClass(), "endAddress", -811460564);
        setLongField(term179978, term179978.getClass(), "clockPeriodInNs", 1000L);
        setField(term179978, term179978.getClass(), "behavior", enum197);
        setField(term179978, term179978.getClass(), "bus", null);
        setField(term179978, term179978.getClass(), "state", null);
        setLongField(term179978, term179978.getClass(), "opBeginTime", 7899092949241236700L);
        setField(term179975, term179975.getClass(), "cpu", term179978);
        setField(term179975, term179975.getClass(), "deviceMap", term179981);
        setField(term179975, term179975.getClass(), "deviceAddressArray", term179986);
        setField(term179973, term179973.getClass(), "bus", term179975);
        setIntField(term179987, term179987.getClass(), "a", 0);
        setIntField(term179987, term179987.getClass(), "x", 0);
        setIntField(term179987, term179987.getClass(), "y", 0);
        setIntField(term179987, term179987.getClass(), "sp", 0);
        setIntField(term179987, term179987.getClass(), "pc", 0);
        setIntField(term179987, term179987.getClass(), "ir", 0);
        setIntField(term179987, term179987.getClass(), "nextIr", 0);
        setField(term179987, term179987.getClass(), "args", term179995);
        setField(term179987, term179987.getClass(), "nextArgs", term179998);
        setIntField(term179987, term179987.getClass(), "instSize", 0);
        setBooleanField(term179987, term179987.getClass(), "opTrap", false);
        setBooleanField(term179987, term179987.getClass(), "irqAsserted", false);
        setBooleanField(term179987, term179987.getClass(), "nmiAsserted", false);
        setIntField(term179987, term179987.getClass(), "lastPc", 0);
        setBooleanField(term179987, term179987.getClass(), "carryFlag", false);
        setBooleanField(term179987, term179987.getClass(), "negativeFlag", false);
        setBooleanField(term179987, term179987.getClass(), "zeroFlag", false);
        setBooleanField(term179987, term179987.getClass(), "irqDisableFlag", false);
        setBooleanField(term179987, term179987.getClass(), "decimalModeFlag", false);
        setBooleanField(term179987, term179987.getClass(), "breakFlag", false);
        setBooleanField(term179987, term179987.getClass(), "overflowFlag", false);
        setLongField(term179987, term179987.getClass(), "stepCounter", 0L);
        setField(term179973, term179973.getClass(), "state", term179987);
        setLongField(term179973, term179973.getClass(), "opBeginTime", 3369965039136843143L);
        setField(term179970, term179970.getClass(), "cpu", term179973);
        setField(term179970, term179970.getClass(), "deviceMap", term180015);
        setField(term179970, term179970.getClass(), "deviceAddressArray", term180020);
        setField(term179955, term179955.getClass(), "bus", term179970);
        setIntField(term180021, term180021.getClass(), "a", 0);
        setIntField(term180021, term180021.getClass(), "x", 0);
        setIntField(term180021, term180021.getClass(), "y", 0);
        setIntField(term180021, term180021.getClass(), "sp", 0);
        setIntField(term180021, term180021.getClass(), "pc", 0);
        setIntField(term180021, term180021.getClass(), "ir", 0);
        setIntField(term180021, term180021.getClass(), "nextIr", 0);
        setField(term180021, term180021.getClass(), "args", term180029);
        setField(term180021, term180021.getClass(), "nextArgs", term180032);
        setIntField(term180021, term180021.getClass(), "instSize", 0);
        setBooleanField(term180021, term180021.getClass(), "opTrap", false);
        setBooleanField(term180021, term180021.getClass(), "irqAsserted", false);
        setBooleanField(term180021, term180021.getClass(), "nmiAsserted", false);
        setIntField(term180021, term180021.getClass(), "lastPc", 0);
        setBooleanField(term180021, term180021.getClass(), "carryFlag", false);
        setBooleanField(term180021, term180021.getClass(), "negativeFlag", false);
        setBooleanField(term180021, term180021.getClass(), "zeroFlag", false);
        setBooleanField(term180021, term180021.getClass(), "irqDisableFlag", false);
        setBooleanField(term180021, term180021.getClass(), "decimalModeFlag", false);
        setBooleanField(term180021, term180021.getClass(), "breakFlag", false);
        setBooleanField(term180021, term180021.getClass(), "overflowFlag", false);
        setLongField(term180021, term180021.getClass(), "stepCounter", 0L);
        setField(term179955, term179955.getClass(), "state", term180021);
        setLongField(term179955, term179955.getClass(), "opBeginTime", -383809899410674609L);
        term180049 = new Integer(-586625757);
        term180051 = new Integer(-111956576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term180049;
        args[1] = term180051;
        callMethod(klass, "sbcDecimal", argTypes, term179955, args);
    }

};


