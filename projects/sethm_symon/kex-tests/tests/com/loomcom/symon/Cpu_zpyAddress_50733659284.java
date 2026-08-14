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

public class Cpu_zpyAddress_50733659284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204529;
     Object term204623;

    public Cpu_zpyAddress_50733659284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term204626 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term204625 = ((Class) term204626).getDeclaredField((String) "NMOS_6502");
        ((Field) term204625).setAccessible(true);
        Object enum264 = ((Field) term204625).get((Object) null);
        HashMap term204555 = new HashMap();
        HashMap term204589 = new HashMap();
        term204529 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term204544 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term204547 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term204549 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term204552 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term204560 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term204561 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term204569 = (int[]) newIntArray(2);
        int[] term204572 = (int[]) newIntArray(2);
        Object[] term204594 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term204595 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term204603 = (int[]) newIntArray(2);
        int[] term204606 = (int[]) newIntArray(2);
        setLongField(term204529, term204529.getClass(), "clockPeriodInNs", 1000L);
        setField(term204529, term204529.getClass(), "behavior", enum264);
        setIntField(term204544, term204544.getClass(), "startAddress", -1774385073);
        setIntField(term204544, term204544.getClass(), "endAddress", -1095327334);
        setLongField(term204547, term204547.getClass(), "clockPeriodInNs", 1000L);
        setField(term204547, term204547.getClass(), "behavior", enum264);
        setIntField(term204549, term204549.getClass(), "startAddress", -401456020);
        setIntField(term204549, term204549.getClass(), "endAddress", 333219682);
        setLongField(term204552, term204552.getClass(), "clockPeriodInNs", 1000L);
        setField(term204552, term204552.getClass(), "behavior", enum264);
        setField(term204552, term204552.getClass(), "bus", null);
        setField(term204552, term204552.getClass(), "state", null);
        setLongField(term204552, term204552.getClass(), "opBeginTime", 3774876119567638995L);
        setField(term204549, term204549.getClass(), "cpu", term204552);
        setField(term204549, term204549.getClass(), "deviceMap", term204555);
        setField(term204549, term204549.getClass(), "deviceAddressArray", term204560);
        setField(term204547, term204547.getClass(), "bus", term204549);
        setIntField(term204561, term204561.getClass(), "a", 0);
        setIntField(term204561, term204561.getClass(), "x", 0);
        setIntField(term204561, term204561.getClass(), "y", 0);
        setIntField(term204561, term204561.getClass(), "sp", 0);
        setIntField(term204561, term204561.getClass(), "pc", 0);
        setIntField(term204561, term204561.getClass(), "ir", 0);
        setIntField(term204561, term204561.getClass(), "nextIr", 0);
        setField(term204561, term204561.getClass(), "args", term204569);
        setField(term204561, term204561.getClass(), "nextArgs", term204572);
        setIntField(term204561, term204561.getClass(), "instSize", 0);
        setBooleanField(term204561, term204561.getClass(), "opTrap", false);
        setBooleanField(term204561, term204561.getClass(), "irqAsserted", false);
        setBooleanField(term204561, term204561.getClass(), "nmiAsserted", false);
        setIntField(term204561, term204561.getClass(), "lastPc", 0);
        setBooleanField(term204561, term204561.getClass(), "carryFlag", false);
        setBooleanField(term204561, term204561.getClass(), "negativeFlag", false);
        setBooleanField(term204561, term204561.getClass(), "zeroFlag", false);
        setBooleanField(term204561, term204561.getClass(), "irqDisableFlag", false);
        setBooleanField(term204561, term204561.getClass(), "decimalModeFlag", false);
        setBooleanField(term204561, term204561.getClass(), "breakFlag", false);
        setBooleanField(term204561, term204561.getClass(), "overflowFlag", false);
        setLongField(term204561, term204561.getClass(), "stepCounter", 0L);
        setField(term204547, term204547.getClass(), "state", term204561);
        setLongField(term204547, term204547.getClass(), "opBeginTime", -5849140391879955934L);
        setField(term204544, term204544.getClass(), "cpu", term204547);
        setField(term204544, term204544.getClass(), "deviceMap", term204589);
        setField(term204544, term204544.getClass(), "deviceAddressArray", term204594);
        setField(term204529, term204529.getClass(), "bus", term204544);
        setIntField(term204595, term204595.getClass(), "a", 0);
        setIntField(term204595, term204595.getClass(), "x", 0);
        setIntField(term204595, term204595.getClass(), "y", 0);
        setIntField(term204595, term204595.getClass(), "sp", 0);
        setIntField(term204595, term204595.getClass(), "pc", 0);
        setIntField(term204595, term204595.getClass(), "ir", 0);
        setIntField(term204595, term204595.getClass(), "nextIr", 0);
        setField(term204595, term204595.getClass(), "args", term204603);
        setField(term204595, term204595.getClass(), "nextArgs", term204606);
        setIntField(term204595, term204595.getClass(), "instSize", 0);
        setBooleanField(term204595, term204595.getClass(), "opTrap", false);
        setBooleanField(term204595, term204595.getClass(), "irqAsserted", false);
        setBooleanField(term204595, term204595.getClass(), "nmiAsserted", false);
        setIntField(term204595, term204595.getClass(), "lastPc", 0);
        setBooleanField(term204595, term204595.getClass(), "carryFlag", false);
        setBooleanField(term204595, term204595.getClass(), "negativeFlag", false);
        setBooleanField(term204595, term204595.getClass(), "zeroFlag", false);
        setBooleanField(term204595, term204595.getClass(), "irqDisableFlag", false);
        setBooleanField(term204595, term204595.getClass(), "decimalModeFlag", false);
        setBooleanField(term204595, term204595.getClass(), "breakFlag", false);
        setBooleanField(term204595, term204595.getClass(), "overflowFlag", false);
        setLongField(term204595, term204595.getClass(), "stepCounter", 0L);
        setField(term204529, term204529.getClass(), "state", term204595);
        setLongField(term204529, term204529.getClass(), "opBeginTime", 5257982794400938524L);
        term204623 = new Integer(-1436225528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term204623;
        callMethod(klass, "zpyAddress", argTypes, term204529, args);
    }

};


