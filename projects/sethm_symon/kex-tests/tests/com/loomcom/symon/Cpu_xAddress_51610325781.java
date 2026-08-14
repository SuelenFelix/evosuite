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

public class Cpu_xAddress_51610325781 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203421;
     Object term203515;
     Object term203517;

    public Cpu_xAddress_51610325781() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term203520 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term203519 = ((Class) term203520).getDeclaredField((String) "NMOS_6502");
        ((Field) term203519).setAccessible(true);
        Object enum261 = ((Field) term203519).get((Object) null);
        HashMap term203447 = new HashMap();
        HashMap term203481 = new HashMap();
        term203421 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term203436 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term203439 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term203441 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term203444 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term203452 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term203453 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term203461 = (int[]) newIntArray(2);
        int[] term203464 = (int[]) newIntArray(2);
        Object[] term203486 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term203487 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term203495 = (int[]) newIntArray(2);
        int[] term203498 = (int[]) newIntArray(2);
        setLongField(term203421, term203421.getClass(), "clockPeriodInNs", 1000L);
        setField(term203421, term203421.getClass(), "behavior", enum261);
        setIntField(term203436, term203436.getClass(), "startAddress", 627813167);
        setIntField(term203436, term203436.getClass(), "endAddress", -2047312469);
        setLongField(term203439, term203439.getClass(), "clockPeriodInNs", 1000L);
        setField(term203439, term203439.getClass(), "behavior", enum261);
        setIntField(term203441, term203441.getClass(), "startAddress", 38231753);
        setIntField(term203441, term203441.getClass(), "endAddress", 1404509429);
        setLongField(term203444, term203444.getClass(), "clockPeriodInNs", 1000L);
        setField(term203444, term203444.getClass(), "behavior", enum261);
        setField(term203444, term203444.getClass(), "bus", null);
        setField(term203444, term203444.getClass(), "state", null);
        setLongField(term203444, term203444.getClass(), "opBeginTime", 6091220404570069089L);
        setField(term203441, term203441.getClass(), "cpu", term203444);
        setField(term203441, term203441.getClass(), "deviceMap", term203447);
        setField(term203441, term203441.getClass(), "deviceAddressArray", term203452);
        setField(term203439, term203439.getClass(), "bus", term203441);
        setIntField(term203453, term203453.getClass(), "a", 0);
        setIntField(term203453, term203453.getClass(), "x", 0);
        setIntField(term203453, term203453.getClass(), "y", 0);
        setIntField(term203453, term203453.getClass(), "sp", 0);
        setIntField(term203453, term203453.getClass(), "pc", 0);
        setIntField(term203453, term203453.getClass(), "ir", 0);
        setIntField(term203453, term203453.getClass(), "nextIr", 0);
        setField(term203453, term203453.getClass(), "args", term203461);
        setField(term203453, term203453.getClass(), "nextArgs", term203464);
        setIntField(term203453, term203453.getClass(), "instSize", 0);
        setBooleanField(term203453, term203453.getClass(), "opTrap", false);
        setBooleanField(term203453, term203453.getClass(), "irqAsserted", false);
        setBooleanField(term203453, term203453.getClass(), "nmiAsserted", false);
        setIntField(term203453, term203453.getClass(), "lastPc", 0);
        setBooleanField(term203453, term203453.getClass(), "carryFlag", false);
        setBooleanField(term203453, term203453.getClass(), "negativeFlag", false);
        setBooleanField(term203453, term203453.getClass(), "zeroFlag", false);
        setBooleanField(term203453, term203453.getClass(), "irqDisableFlag", false);
        setBooleanField(term203453, term203453.getClass(), "decimalModeFlag", false);
        setBooleanField(term203453, term203453.getClass(), "breakFlag", false);
        setBooleanField(term203453, term203453.getClass(), "overflowFlag", false);
        setLongField(term203453, term203453.getClass(), "stepCounter", 0L);
        setField(term203439, term203439.getClass(), "state", term203453);
        setLongField(term203439, term203439.getClass(), "opBeginTime", 8116689826697820264L);
        setField(term203436, term203436.getClass(), "cpu", term203439);
        setField(term203436, term203436.getClass(), "deviceMap", term203481);
        setField(term203436, term203436.getClass(), "deviceAddressArray", term203486);
        setField(term203421, term203421.getClass(), "bus", term203436);
        setIntField(term203487, term203487.getClass(), "a", 0);
        setIntField(term203487, term203487.getClass(), "x", 0);
        setIntField(term203487, term203487.getClass(), "y", 0);
        setIntField(term203487, term203487.getClass(), "sp", 0);
        setIntField(term203487, term203487.getClass(), "pc", 0);
        setIntField(term203487, term203487.getClass(), "ir", 0);
        setIntField(term203487, term203487.getClass(), "nextIr", 0);
        setField(term203487, term203487.getClass(), "args", term203495);
        setField(term203487, term203487.getClass(), "nextArgs", term203498);
        setIntField(term203487, term203487.getClass(), "instSize", 0);
        setBooleanField(term203487, term203487.getClass(), "opTrap", false);
        setBooleanField(term203487, term203487.getClass(), "irqAsserted", false);
        setBooleanField(term203487, term203487.getClass(), "nmiAsserted", false);
        setIntField(term203487, term203487.getClass(), "lastPc", 0);
        setBooleanField(term203487, term203487.getClass(), "carryFlag", false);
        setBooleanField(term203487, term203487.getClass(), "negativeFlag", false);
        setBooleanField(term203487, term203487.getClass(), "zeroFlag", false);
        setBooleanField(term203487, term203487.getClass(), "irqDisableFlag", false);
        setBooleanField(term203487, term203487.getClass(), "decimalModeFlag", false);
        setBooleanField(term203487, term203487.getClass(), "breakFlag", false);
        setBooleanField(term203487, term203487.getClass(), "overflowFlag", false);
        setLongField(term203487, term203487.getClass(), "stepCounter", 0L);
        setField(term203421, term203421.getClass(), "state", term203487);
        setLongField(term203421, term203421.getClass(), "opBeginTime", 6594952836231202437L);
        term203515 = new Integer(201236178);
        term203517 = new Integer(985775690);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term203515;
        args[1] = term203517;
        callMethod(klass, "xAddress", argTypes, term203421, args);
    }

};


