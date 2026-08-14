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

public class Cpu_step_11444275238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176637;

    public Cpu_step_11444275238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term176732 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term176731 = ((Class) term176732).getDeclaredField((String) "NMOS_6502");
        ((Field) term176731).setAccessible(true);
        Object enum188 = ((Field) term176731).get((Object) null);
        HashMap term176663 = new HashMap();
        HashMap term176697 = new HashMap();
        term176637 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term176652 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term176655 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term176657 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term176660 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term176668 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term176669 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term176677 = (int[]) newIntArray(2);
        int[] term176680 = (int[]) newIntArray(2);
        Object[] term176702 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term176703 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term176711 = (int[]) newIntArray(2);
        int[] term176714 = (int[]) newIntArray(2);
        setLongField(term176637, term176637.getClass(), "clockPeriodInNs", 1000L);
        setField(term176637, term176637.getClass(), "behavior", enum188);
        setIntField(term176652, term176652.getClass(), "startAddress", -253998401);
        setIntField(term176652, term176652.getClass(), "endAddress", 325883202);
        setLongField(term176655, term176655.getClass(), "clockPeriodInNs", 1000L);
        setField(term176655, term176655.getClass(), "behavior", enum188);
        setIntField(term176657, term176657.getClass(), "startAddress", -206493043);
        setIntField(term176657, term176657.getClass(), "endAddress", 1965551499);
        setLongField(term176660, term176660.getClass(), "clockPeriodInNs", 1000L);
        setField(term176660, term176660.getClass(), "behavior", enum188);
        setField(term176660, term176660.getClass(), "bus", null);
        setField(term176660, term176660.getClass(), "state", null);
        setLongField(term176660, term176660.getClass(), "opBeginTime", 4133412897876628646L);
        setField(term176657, term176657.getClass(), "cpu", term176660);
        setField(term176657, term176657.getClass(), "deviceMap", term176663);
        setField(term176657, term176657.getClass(), "deviceAddressArray", term176668);
        setField(term176655, term176655.getClass(), "bus", term176657);
        setIntField(term176669, term176669.getClass(), "a", 0);
        setIntField(term176669, term176669.getClass(), "x", 0);
        setIntField(term176669, term176669.getClass(), "y", 0);
        setIntField(term176669, term176669.getClass(), "sp", 0);
        setIntField(term176669, term176669.getClass(), "pc", 0);
        setIntField(term176669, term176669.getClass(), "ir", 0);
        setIntField(term176669, term176669.getClass(), "nextIr", 0);
        setField(term176669, term176669.getClass(), "args", term176677);
        setField(term176669, term176669.getClass(), "nextArgs", term176680);
        setIntField(term176669, term176669.getClass(), "instSize", 0);
        setBooleanField(term176669, term176669.getClass(), "opTrap", false);
        setBooleanField(term176669, term176669.getClass(), "irqAsserted", false);
        setBooleanField(term176669, term176669.getClass(), "nmiAsserted", false);
        setIntField(term176669, term176669.getClass(), "lastPc", 0);
        setBooleanField(term176669, term176669.getClass(), "carryFlag", false);
        setBooleanField(term176669, term176669.getClass(), "negativeFlag", false);
        setBooleanField(term176669, term176669.getClass(), "zeroFlag", false);
        setBooleanField(term176669, term176669.getClass(), "irqDisableFlag", false);
        setBooleanField(term176669, term176669.getClass(), "decimalModeFlag", false);
        setBooleanField(term176669, term176669.getClass(), "breakFlag", false);
        setBooleanField(term176669, term176669.getClass(), "overflowFlag", false);
        setLongField(term176669, term176669.getClass(), "stepCounter", 0L);
        setField(term176655, term176655.getClass(), "state", term176669);
        setLongField(term176655, term176655.getClass(), "opBeginTime", -4233021136506075526L);
        setField(term176652, term176652.getClass(), "cpu", term176655);
        setField(term176652, term176652.getClass(), "deviceMap", term176697);
        setField(term176652, term176652.getClass(), "deviceAddressArray", term176702);
        setField(term176637, term176637.getClass(), "bus", term176652);
        setIntField(term176703, term176703.getClass(), "a", 0);
        setIntField(term176703, term176703.getClass(), "x", 0);
        setIntField(term176703, term176703.getClass(), "y", 0);
        setIntField(term176703, term176703.getClass(), "sp", 0);
        setIntField(term176703, term176703.getClass(), "pc", 0);
        setIntField(term176703, term176703.getClass(), "ir", 0);
        setIntField(term176703, term176703.getClass(), "nextIr", 0);
        setField(term176703, term176703.getClass(), "args", term176711);
        setField(term176703, term176703.getClass(), "nextArgs", term176714);
        setIntField(term176703, term176703.getClass(), "instSize", 0);
        setBooleanField(term176703, term176703.getClass(), "opTrap", false);
        setBooleanField(term176703, term176703.getClass(), "irqAsserted", false);
        setBooleanField(term176703, term176703.getClass(), "nmiAsserted", false);
        setIntField(term176703, term176703.getClass(), "lastPc", 0);
        setBooleanField(term176703, term176703.getClass(), "carryFlag", false);
        setBooleanField(term176703, term176703.getClass(), "negativeFlag", false);
        setBooleanField(term176703, term176703.getClass(), "zeroFlag", false);
        setBooleanField(term176703, term176703.getClass(), "irqDisableFlag", false);
        setBooleanField(term176703, term176703.getClass(), "decimalModeFlag", false);
        setBooleanField(term176703, term176703.getClass(), "breakFlag", false);
        setBooleanField(term176703, term176703.getClass(), "overflowFlag", false);
        setLongField(term176703, term176703.getClass(), "stepCounter", 0L);
        setField(term176637, term176637.getClass(), "state", term176703);
        setLongField(term176637, term176637.getClass(), "opBeginTime", 9041534029896652168L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "step", argTypes, term176637, args);
    }

};


