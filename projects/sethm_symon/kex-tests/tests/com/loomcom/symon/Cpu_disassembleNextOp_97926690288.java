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

public class Cpu_disassembleNextOp_97926690288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205638;

    public Cpu_disassembleNextOp_97926690288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term205733 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term205732 = ((Class) term205733).getDeclaredField((String) "NMOS_6502");
        ((Field) term205732).setAccessible(true);
        Object enum267 = ((Field) term205732).get((Object) null);
        HashMap term205664 = new HashMap();
        HashMap term205698 = new HashMap();
        term205638 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term205653 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term205656 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term205658 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term205661 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term205669 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term205670 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term205678 = (int[]) newIntArray(2);
        int[] term205681 = (int[]) newIntArray(2);
        Object[] term205703 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term205704 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term205712 = (int[]) newIntArray(2);
        int[] term205715 = (int[]) newIntArray(2);
        setLongField(term205638, term205638.getClass(), "clockPeriodInNs", 1000L);
        setField(term205638, term205638.getClass(), "behavior", enum267);
        setIntField(term205653, term205653.getClass(), "startAddress", 1541842334);
        setIntField(term205653, term205653.getClass(), "endAddress", 947697692);
        setLongField(term205656, term205656.getClass(), "clockPeriodInNs", 1000L);
        setField(term205656, term205656.getClass(), "behavior", enum267);
        setIntField(term205658, term205658.getClass(), "startAddress", -372056343);
        setIntField(term205658, term205658.getClass(), "endAddress", 625501454);
        setLongField(term205661, term205661.getClass(), "clockPeriodInNs", 1000L);
        setField(term205661, term205661.getClass(), "behavior", enum267);
        setField(term205661, term205661.getClass(), "bus", null);
        setField(term205661, term205661.getClass(), "state", null);
        setLongField(term205661, term205661.getClass(), "opBeginTime", 4992284695861622180L);
        setField(term205658, term205658.getClass(), "cpu", term205661);
        setField(term205658, term205658.getClass(), "deviceMap", term205664);
        setField(term205658, term205658.getClass(), "deviceAddressArray", term205669);
        setField(term205656, term205656.getClass(), "bus", term205658);
        setIntField(term205670, term205670.getClass(), "a", 0);
        setIntField(term205670, term205670.getClass(), "x", 0);
        setIntField(term205670, term205670.getClass(), "y", 0);
        setIntField(term205670, term205670.getClass(), "sp", 0);
        setIntField(term205670, term205670.getClass(), "pc", 0);
        setIntField(term205670, term205670.getClass(), "ir", 0);
        setIntField(term205670, term205670.getClass(), "nextIr", 0);
        setField(term205670, term205670.getClass(), "args", term205678);
        setField(term205670, term205670.getClass(), "nextArgs", term205681);
        setIntField(term205670, term205670.getClass(), "instSize", 0);
        setBooleanField(term205670, term205670.getClass(), "opTrap", false);
        setBooleanField(term205670, term205670.getClass(), "irqAsserted", false);
        setBooleanField(term205670, term205670.getClass(), "nmiAsserted", false);
        setIntField(term205670, term205670.getClass(), "lastPc", 0);
        setBooleanField(term205670, term205670.getClass(), "carryFlag", false);
        setBooleanField(term205670, term205670.getClass(), "negativeFlag", false);
        setBooleanField(term205670, term205670.getClass(), "zeroFlag", false);
        setBooleanField(term205670, term205670.getClass(), "irqDisableFlag", false);
        setBooleanField(term205670, term205670.getClass(), "decimalModeFlag", false);
        setBooleanField(term205670, term205670.getClass(), "breakFlag", false);
        setBooleanField(term205670, term205670.getClass(), "overflowFlag", false);
        setLongField(term205670, term205670.getClass(), "stepCounter", 0L);
        setField(term205656, term205656.getClass(), "state", term205670);
        setLongField(term205656, term205656.getClass(), "opBeginTime", -6376003179103732362L);
        setField(term205653, term205653.getClass(), "cpu", term205656);
        setField(term205653, term205653.getClass(), "deviceMap", term205698);
        setField(term205653, term205653.getClass(), "deviceAddressArray", term205703);
        setField(term205638, term205638.getClass(), "bus", term205653);
        setIntField(term205704, term205704.getClass(), "a", 0);
        setIntField(term205704, term205704.getClass(), "x", 0);
        setIntField(term205704, term205704.getClass(), "y", 0);
        setIntField(term205704, term205704.getClass(), "sp", 0);
        setIntField(term205704, term205704.getClass(), "pc", 0);
        setIntField(term205704, term205704.getClass(), "ir", 0);
        setIntField(term205704, term205704.getClass(), "nextIr", 0);
        setField(term205704, term205704.getClass(), "args", term205712);
        setField(term205704, term205704.getClass(), "nextArgs", term205715);
        setIntField(term205704, term205704.getClass(), "instSize", 0);
        setBooleanField(term205704, term205704.getClass(), "opTrap", false);
        setBooleanField(term205704, term205704.getClass(), "irqAsserted", false);
        setBooleanField(term205704, term205704.getClass(), "nmiAsserted", false);
        setIntField(term205704, term205704.getClass(), "lastPc", 0);
        setBooleanField(term205704, term205704.getClass(), "carryFlag", false);
        setBooleanField(term205704, term205704.getClass(), "negativeFlag", false);
        setBooleanField(term205704, term205704.getClass(), "zeroFlag", false);
        setBooleanField(term205704, term205704.getClass(), "irqDisableFlag", false);
        setBooleanField(term205704, term205704.getClass(), "decimalModeFlag", false);
        setBooleanField(term205704, term205704.getClass(), "breakFlag", false);
        setBooleanField(term205704, term205704.getClass(), "overflowFlag", false);
        setLongField(term205704, term205704.getClass(), "stepCounter", 0L);
        setField(term205638, term205638.getClass(), "state", term205704);
        setLongField(term205638, term205638.getClass(), "opBeginTime", -2050936198165389315L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "disassembleNextOp", argTypes, term205638, args);
    }

};


