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
import java.lang.Boolean;

public class Bus_read_119063005310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38752;
     Object term38840;
     Object term38842;

    public Bus_read_119063005310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38845 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term38844 = ((Class) term38845).getDeclaredField((String) "NMOS_6502");
        ((Field) term38844).setAccessible(true);
        Object enum30 = ((Field) term38844).get((Object) null);
        HashMap term38800 = new HashMap();
        HashMap term38834 = new HashMap();
        term38752 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term38755 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term38770 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term38773 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term38775 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term38778 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term38805 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term38806 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term38814 = (int[]) newIntArray(2);
        int[] term38817 = (int[]) newIntArray(2);
        Object[] term38839 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        setIntField(term38752, term38752.getClass(), "startAddress", 1702404702);
        setIntField(term38752, term38752.getClass(), "endAddress", 1141592999);
        setLongField(term38755, term38755.getClass(), "clockPeriodInNs", 1000L);
        setField(term38755, term38755.getClass(), "behavior", enum30);
        setIntField(term38770, term38770.getClass(), "startAddress", 848113442);
        setIntField(term38770, term38770.getClass(), "endAddress", 793974213);
        setLongField(term38773, term38773.getClass(), "clockPeriodInNs", 1000L);
        setField(term38773, term38773.getClass(), "behavior", enum30);
        setIntField(term38775, term38775.getClass(), "startAddress", 722546287);
        setIntField(term38775, term38775.getClass(), "endAddress", -2060284160);
        setField(term38775, term38775.getClass(), "cpu", null);
        setField(term38775, term38775.getClass(), "deviceMap", null);
        setField(term38775, term38775.getClass(), "deviceAddressArray", null);
        setField(term38773, term38773.getClass(), "bus", term38775);
        setIntField(term38778, term38778.getClass(), "a", 0);
        setIntField(term38778, term38778.getClass(), "x", 0);
        setIntField(term38778, term38778.getClass(), "y", 0);
        setIntField(term38778, term38778.getClass(), "sp", 0);
        setIntField(term38778, term38778.getClass(), "pc", 0);
        setIntField(term38778, term38778.getClass(), "ir", 0);
        setIntField(term38778, term38778.getClass(), "nextIr", 0);
        setField(term38778, term38778.getClass(), "args", null);
        setField(term38778, term38778.getClass(), "nextArgs", null);
        setIntField(term38778, term38778.getClass(), "instSize", 0);
        setBooleanField(term38778, term38778.getClass(), "opTrap", false);
        setBooleanField(term38778, term38778.getClass(), "irqAsserted", false);
        setBooleanField(term38778, term38778.getClass(), "nmiAsserted", false);
        setIntField(term38778, term38778.getClass(), "lastPc", 0);
        setBooleanField(term38778, term38778.getClass(), "carryFlag", false);
        setBooleanField(term38778, term38778.getClass(), "negativeFlag", false);
        setBooleanField(term38778, term38778.getClass(), "zeroFlag", false);
        setBooleanField(term38778, term38778.getClass(), "irqDisableFlag", false);
        setBooleanField(term38778, term38778.getClass(), "decimalModeFlag", false);
        setBooleanField(term38778, term38778.getClass(), "breakFlag", false);
        setBooleanField(term38778, term38778.getClass(), "overflowFlag", false);
        setLongField(term38778, term38778.getClass(), "stepCounter", 0L);
        setField(term38773, term38773.getClass(), "state", term38778);
        setLongField(term38773, term38773.getClass(), "opBeginTime", -3954795081650780841L);
        setField(term38770, term38770.getClass(), "cpu", term38773);
        setField(term38770, term38770.getClass(), "deviceMap", term38800);
        setField(term38770, term38770.getClass(), "deviceAddressArray", term38805);
        setField(term38755, term38755.getClass(), "bus", term38770);
        setIntField(term38806, term38806.getClass(), "a", 0);
        setIntField(term38806, term38806.getClass(), "x", 0);
        setIntField(term38806, term38806.getClass(), "y", 0);
        setIntField(term38806, term38806.getClass(), "sp", 0);
        setIntField(term38806, term38806.getClass(), "pc", 0);
        setIntField(term38806, term38806.getClass(), "ir", 0);
        setIntField(term38806, term38806.getClass(), "nextIr", 0);
        setField(term38806, term38806.getClass(), "args", term38814);
        setField(term38806, term38806.getClass(), "nextArgs", term38817);
        setIntField(term38806, term38806.getClass(), "instSize", 0);
        setBooleanField(term38806, term38806.getClass(), "opTrap", false);
        setBooleanField(term38806, term38806.getClass(), "irqAsserted", false);
        setBooleanField(term38806, term38806.getClass(), "nmiAsserted", false);
        setIntField(term38806, term38806.getClass(), "lastPc", 0);
        setBooleanField(term38806, term38806.getClass(), "carryFlag", false);
        setBooleanField(term38806, term38806.getClass(), "negativeFlag", false);
        setBooleanField(term38806, term38806.getClass(), "zeroFlag", false);
        setBooleanField(term38806, term38806.getClass(), "irqDisableFlag", false);
        setBooleanField(term38806, term38806.getClass(), "decimalModeFlag", false);
        setBooleanField(term38806, term38806.getClass(), "breakFlag", false);
        setBooleanField(term38806, term38806.getClass(), "overflowFlag", false);
        setLongField(term38806, term38806.getClass(), "stepCounter", 0L);
        setField(term38755, term38755.getClass(), "state", term38806);
        setLongField(term38755, term38755.getClass(), "opBeginTime", 3288791194263207397L);
        setField(term38752, term38752.getClass(), "cpu", term38755);
        setField(term38752, term38752.getClass(), "deviceMap", term38834);
        setField(term38752, term38752.getClass(), "deviceAddressArray", term38839);
        term38840 = new Integer(-154210001);
        term38842 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term38840;
        args[1] = term38842;
        callMethod(klass, "read", argTypes, term38752, args);
    }

};


