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

public class Cpu_handleIrq_122108539511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177737;
     Object term177831;

    public Cpu_handleIrq_122108539511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term177834 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term177833 = ((Class) term177834).getDeclaredField((String) "NMOS_6502");
        ((Field) term177833).setAccessible(true);
        Object enum191 = ((Field) term177833).get((Object) null);
        HashMap term177763 = new HashMap();
        HashMap term177797 = new HashMap();
        term177737 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term177752 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term177755 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term177757 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term177760 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term177768 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term177769 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term177777 = (int[]) newIntArray(2);
        int[] term177780 = (int[]) newIntArray(2);
        Object[] term177802 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term177803 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term177811 = (int[]) newIntArray(2);
        int[] term177814 = (int[]) newIntArray(2);
        setLongField(term177737, term177737.getClass(), "clockPeriodInNs", 1000L);
        setField(term177737, term177737.getClass(), "behavior", enum191);
        setIntField(term177752, term177752.getClass(), "startAddress", -1460137915);
        setIntField(term177752, term177752.getClass(), "endAddress", 2048263826);
        setLongField(term177755, term177755.getClass(), "clockPeriodInNs", 1000L);
        setField(term177755, term177755.getClass(), "behavior", enum191);
        setIntField(term177757, term177757.getClass(), "startAddress", -1353079280);
        setIntField(term177757, term177757.getClass(), "endAddress", -1053470670);
        setLongField(term177760, term177760.getClass(), "clockPeriodInNs", 1000L);
        setField(term177760, term177760.getClass(), "behavior", enum191);
        setField(term177760, term177760.getClass(), "bus", null);
        setField(term177760, term177760.getClass(), "state", null);
        setLongField(term177760, term177760.getClass(), "opBeginTime", 9219442829218784847L);
        setField(term177757, term177757.getClass(), "cpu", term177760);
        setField(term177757, term177757.getClass(), "deviceMap", term177763);
        setField(term177757, term177757.getClass(), "deviceAddressArray", term177768);
        setField(term177755, term177755.getClass(), "bus", term177757);
        setIntField(term177769, term177769.getClass(), "a", 0);
        setIntField(term177769, term177769.getClass(), "x", 0);
        setIntField(term177769, term177769.getClass(), "y", 0);
        setIntField(term177769, term177769.getClass(), "sp", 0);
        setIntField(term177769, term177769.getClass(), "pc", 0);
        setIntField(term177769, term177769.getClass(), "ir", 0);
        setIntField(term177769, term177769.getClass(), "nextIr", 0);
        setField(term177769, term177769.getClass(), "args", term177777);
        setField(term177769, term177769.getClass(), "nextArgs", term177780);
        setIntField(term177769, term177769.getClass(), "instSize", 0);
        setBooleanField(term177769, term177769.getClass(), "opTrap", false);
        setBooleanField(term177769, term177769.getClass(), "irqAsserted", false);
        setBooleanField(term177769, term177769.getClass(), "nmiAsserted", false);
        setIntField(term177769, term177769.getClass(), "lastPc", 0);
        setBooleanField(term177769, term177769.getClass(), "carryFlag", false);
        setBooleanField(term177769, term177769.getClass(), "negativeFlag", false);
        setBooleanField(term177769, term177769.getClass(), "zeroFlag", false);
        setBooleanField(term177769, term177769.getClass(), "irqDisableFlag", false);
        setBooleanField(term177769, term177769.getClass(), "decimalModeFlag", false);
        setBooleanField(term177769, term177769.getClass(), "breakFlag", false);
        setBooleanField(term177769, term177769.getClass(), "overflowFlag", false);
        setLongField(term177769, term177769.getClass(), "stepCounter", 0L);
        setField(term177755, term177755.getClass(), "state", term177769);
        setLongField(term177755, term177755.getClass(), "opBeginTime", 5153056225441125523L);
        setField(term177752, term177752.getClass(), "cpu", term177755);
        setField(term177752, term177752.getClass(), "deviceMap", term177797);
        setField(term177752, term177752.getClass(), "deviceAddressArray", term177802);
        setField(term177737, term177737.getClass(), "bus", term177752);
        setIntField(term177803, term177803.getClass(), "a", 0);
        setIntField(term177803, term177803.getClass(), "x", 0);
        setIntField(term177803, term177803.getClass(), "y", 0);
        setIntField(term177803, term177803.getClass(), "sp", 0);
        setIntField(term177803, term177803.getClass(), "pc", 0);
        setIntField(term177803, term177803.getClass(), "ir", 0);
        setIntField(term177803, term177803.getClass(), "nextIr", 0);
        setField(term177803, term177803.getClass(), "args", term177811);
        setField(term177803, term177803.getClass(), "nextArgs", term177814);
        setIntField(term177803, term177803.getClass(), "instSize", 0);
        setBooleanField(term177803, term177803.getClass(), "opTrap", false);
        setBooleanField(term177803, term177803.getClass(), "irqAsserted", false);
        setBooleanField(term177803, term177803.getClass(), "nmiAsserted", false);
        setIntField(term177803, term177803.getClass(), "lastPc", 0);
        setBooleanField(term177803, term177803.getClass(), "carryFlag", false);
        setBooleanField(term177803, term177803.getClass(), "negativeFlag", false);
        setBooleanField(term177803, term177803.getClass(), "zeroFlag", false);
        setBooleanField(term177803, term177803.getClass(), "irqDisableFlag", false);
        setBooleanField(term177803, term177803.getClass(), "decimalModeFlag", false);
        setBooleanField(term177803, term177803.getClass(), "breakFlag", false);
        setBooleanField(term177803, term177803.getClass(), "overflowFlag", false);
        setLongField(term177803, term177803.getClass(), "stepCounter", 0L);
        setField(term177737, term177737.getClass(), "state", term177803);
        setLongField(term177737, term177737.getClass(), "opBeginTime", 8082286259336326914L);
        term177831 = new Integer(1206636813);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177831;
        callMethod(klass, "handleIrq", argTypes, term177737, args);
    }

};


