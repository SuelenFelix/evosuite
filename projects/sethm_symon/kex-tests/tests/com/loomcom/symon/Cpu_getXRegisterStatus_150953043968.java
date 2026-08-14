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

public class Cpu_getXRegisterStatus_150953043968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198661;

    public Cpu_getXRegisterStatus_150953043968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term198756 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term198755 = ((Class) term198756).getDeclaredField((String) "NMOS_6502");
        ((Field) term198755).setAccessible(true);
        Object enum248 = ((Field) term198755).get((Object) null);
        HashMap term198687 = new HashMap();
        HashMap term198721 = new HashMap();
        term198661 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term198676 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term198679 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term198681 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term198684 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term198692 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term198693 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term198701 = (int[]) newIntArray(2);
        int[] term198704 = (int[]) newIntArray(2);
        Object[] term198726 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term198727 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term198735 = (int[]) newIntArray(2);
        int[] term198738 = (int[]) newIntArray(2);
        setLongField(term198661, term198661.getClass(), "clockPeriodInNs", 1000L);
        setField(term198661, term198661.getClass(), "behavior", enum248);
        setIntField(term198676, term198676.getClass(), "startAddress", -854423228);
        setIntField(term198676, term198676.getClass(), "endAddress", -135398430);
        setLongField(term198679, term198679.getClass(), "clockPeriodInNs", 1000L);
        setField(term198679, term198679.getClass(), "behavior", enum248);
        setIntField(term198681, term198681.getClass(), "startAddress", 1404546541);
        setIntField(term198681, term198681.getClass(), "endAddress", 1350945157);
        setLongField(term198684, term198684.getClass(), "clockPeriodInNs", 1000L);
        setField(term198684, term198684.getClass(), "behavior", enum248);
        setField(term198684, term198684.getClass(), "bus", null);
        setField(term198684, term198684.getClass(), "state", null);
        setLongField(term198684, term198684.getClass(), "opBeginTime", -6209056926999752933L);
        setField(term198681, term198681.getClass(), "cpu", term198684);
        setField(term198681, term198681.getClass(), "deviceMap", term198687);
        setField(term198681, term198681.getClass(), "deviceAddressArray", term198692);
        setField(term198679, term198679.getClass(), "bus", term198681);
        setIntField(term198693, term198693.getClass(), "a", 0);
        setIntField(term198693, term198693.getClass(), "x", 0);
        setIntField(term198693, term198693.getClass(), "y", 0);
        setIntField(term198693, term198693.getClass(), "sp", 0);
        setIntField(term198693, term198693.getClass(), "pc", 0);
        setIntField(term198693, term198693.getClass(), "ir", 0);
        setIntField(term198693, term198693.getClass(), "nextIr", 0);
        setField(term198693, term198693.getClass(), "args", term198701);
        setField(term198693, term198693.getClass(), "nextArgs", term198704);
        setIntField(term198693, term198693.getClass(), "instSize", 0);
        setBooleanField(term198693, term198693.getClass(), "opTrap", false);
        setBooleanField(term198693, term198693.getClass(), "irqAsserted", false);
        setBooleanField(term198693, term198693.getClass(), "nmiAsserted", false);
        setIntField(term198693, term198693.getClass(), "lastPc", 0);
        setBooleanField(term198693, term198693.getClass(), "carryFlag", false);
        setBooleanField(term198693, term198693.getClass(), "negativeFlag", false);
        setBooleanField(term198693, term198693.getClass(), "zeroFlag", false);
        setBooleanField(term198693, term198693.getClass(), "irqDisableFlag", false);
        setBooleanField(term198693, term198693.getClass(), "decimalModeFlag", false);
        setBooleanField(term198693, term198693.getClass(), "breakFlag", false);
        setBooleanField(term198693, term198693.getClass(), "overflowFlag", false);
        setLongField(term198693, term198693.getClass(), "stepCounter", 0L);
        setField(term198679, term198679.getClass(), "state", term198693);
        setLongField(term198679, term198679.getClass(), "opBeginTime", 475071242551560384L);
        setField(term198676, term198676.getClass(), "cpu", term198679);
        setField(term198676, term198676.getClass(), "deviceMap", term198721);
        setField(term198676, term198676.getClass(), "deviceAddressArray", term198726);
        setField(term198661, term198661.getClass(), "bus", term198676);
        setIntField(term198727, term198727.getClass(), "a", 0);
        setIntField(term198727, term198727.getClass(), "x", 0);
        setIntField(term198727, term198727.getClass(), "y", 0);
        setIntField(term198727, term198727.getClass(), "sp", 0);
        setIntField(term198727, term198727.getClass(), "pc", 0);
        setIntField(term198727, term198727.getClass(), "ir", 0);
        setIntField(term198727, term198727.getClass(), "nextIr", 0);
        setField(term198727, term198727.getClass(), "args", term198735);
        setField(term198727, term198727.getClass(), "nextArgs", term198738);
        setIntField(term198727, term198727.getClass(), "instSize", 0);
        setBooleanField(term198727, term198727.getClass(), "opTrap", false);
        setBooleanField(term198727, term198727.getClass(), "irqAsserted", false);
        setBooleanField(term198727, term198727.getClass(), "nmiAsserted", false);
        setIntField(term198727, term198727.getClass(), "lastPc", 0);
        setBooleanField(term198727, term198727.getClass(), "carryFlag", false);
        setBooleanField(term198727, term198727.getClass(), "negativeFlag", false);
        setBooleanField(term198727, term198727.getClass(), "zeroFlag", false);
        setBooleanField(term198727, term198727.getClass(), "irqDisableFlag", false);
        setBooleanField(term198727, term198727.getClass(), "decimalModeFlag", false);
        setBooleanField(term198727, term198727.getClass(), "breakFlag", false);
        setBooleanField(term198727, term198727.getClass(), "overflowFlag", false);
        setLongField(term198727, term198727.getClass(), "stepCounter", 0L);
        setField(term198661, term198661.getClass(), "state", term198727);
        setLongField(term198661, term198661.getClass(), "opBeginTime", 279205148356106270L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getXRegisterStatus", argTypes, term198661, args);
    }

};


