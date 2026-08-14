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

public class Cpu_clearZeroFlag_155581633838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187667;

    public Cpu_clearZeroFlag_155581633838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term187762 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term187761 = ((Class) term187762).getDeclaredField((String) "NMOS_6502");
        ((Field) term187761).setAccessible(true);
        Object enum218 = ((Field) term187761).get((Object) null);
        HashMap term187693 = new HashMap();
        HashMap term187727 = new HashMap();
        term187667 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term187682 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term187685 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term187687 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term187690 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term187698 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term187699 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term187707 = (int[]) newIntArray(2);
        int[] term187710 = (int[]) newIntArray(2);
        Object[] term187732 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term187733 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term187741 = (int[]) newIntArray(2);
        int[] term187744 = (int[]) newIntArray(2);
        setLongField(term187667, term187667.getClass(), "clockPeriodInNs", 1000L);
        setField(term187667, term187667.getClass(), "behavior", enum218);
        setIntField(term187682, term187682.getClass(), "startAddress", -1935030297);
        setIntField(term187682, term187682.getClass(), "endAddress", -1877013372);
        setLongField(term187685, term187685.getClass(), "clockPeriodInNs", 1000L);
        setField(term187685, term187685.getClass(), "behavior", enum218);
        setIntField(term187687, term187687.getClass(), "startAddress", 1193388232);
        setIntField(term187687, term187687.getClass(), "endAddress", 1908942563);
        setLongField(term187690, term187690.getClass(), "clockPeriodInNs", 1000L);
        setField(term187690, term187690.getClass(), "behavior", enum218);
        setField(term187690, term187690.getClass(), "bus", null);
        setField(term187690, term187690.getClass(), "state", null);
        setLongField(term187690, term187690.getClass(), "opBeginTime", 7218261959613569082L);
        setField(term187687, term187687.getClass(), "cpu", term187690);
        setField(term187687, term187687.getClass(), "deviceMap", term187693);
        setField(term187687, term187687.getClass(), "deviceAddressArray", term187698);
        setField(term187685, term187685.getClass(), "bus", term187687);
        setIntField(term187699, term187699.getClass(), "a", 0);
        setIntField(term187699, term187699.getClass(), "x", 0);
        setIntField(term187699, term187699.getClass(), "y", 0);
        setIntField(term187699, term187699.getClass(), "sp", 0);
        setIntField(term187699, term187699.getClass(), "pc", 0);
        setIntField(term187699, term187699.getClass(), "ir", 0);
        setIntField(term187699, term187699.getClass(), "nextIr", 0);
        setField(term187699, term187699.getClass(), "args", term187707);
        setField(term187699, term187699.getClass(), "nextArgs", term187710);
        setIntField(term187699, term187699.getClass(), "instSize", 0);
        setBooleanField(term187699, term187699.getClass(), "opTrap", false);
        setBooleanField(term187699, term187699.getClass(), "irqAsserted", false);
        setBooleanField(term187699, term187699.getClass(), "nmiAsserted", false);
        setIntField(term187699, term187699.getClass(), "lastPc", 0);
        setBooleanField(term187699, term187699.getClass(), "carryFlag", false);
        setBooleanField(term187699, term187699.getClass(), "negativeFlag", false);
        setBooleanField(term187699, term187699.getClass(), "zeroFlag", false);
        setBooleanField(term187699, term187699.getClass(), "irqDisableFlag", false);
        setBooleanField(term187699, term187699.getClass(), "decimalModeFlag", false);
        setBooleanField(term187699, term187699.getClass(), "breakFlag", false);
        setBooleanField(term187699, term187699.getClass(), "overflowFlag", false);
        setLongField(term187699, term187699.getClass(), "stepCounter", 0L);
        setField(term187685, term187685.getClass(), "state", term187699);
        setLongField(term187685, term187685.getClass(), "opBeginTime", 8997626143537750821L);
        setField(term187682, term187682.getClass(), "cpu", term187685);
        setField(term187682, term187682.getClass(), "deviceMap", term187727);
        setField(term187682, term187682.getClass(), "deviceAddressArray", term187732);
        setField(term187667, term187667.getClass(), "bus", term187682);
        setIntField(term187733, term187733.getClass(), "a", 0);
        setIntField(term187733, term187733.getClass(), "x", 0);
        setIntField(term187733, term187733.getClass(), "y", 0);
        setIntField(term187733, term187733.getClass(), "sp", 0);
        setIntField(term187733, term187733.getClass(), "pc", 0);
        setIntField(term187733, term187733.getClass(), "ir", 0);
        setIntField(term187733, term187733.getClass(), "nextIr", 0);
        setField(term187733, term187733.getClass(), "args", term187741);
        setField(term187733, term187733.getClass(), "nextArgs", term187744);
        setIntField(term187733, term187733.getClass(), "instSize", 0);
        setBooleanField(term187733, term187733.getClass(), "opTrap", false);
        setBooleanField(term187733, term187733.getClass(), "irqAsserted", false);
        setBooleanField(term187733, term187733.getClass(), "nmiAsserted", false);
        setIntField(term187733, term187733.getClass(), "lastPc", 0);
        setBooleanField(term187733, term187733.getClass(), "carryFlag", false);
        setBooleanField(term187733, term187733.getClass(), "negativeFlag", false);
        setBooleanField(term187733, term187733.getClass(), "zeroFlag", false);
        setBooleanField(term187733, term187733.getClass(), "irqDisableFlag", false);
        setBooleanField(term187733, term187733.getClass(), "decimalModeFlag", false);
        setBooleanField(term187733, term187733.getClass(), "breakFlag", false);
        setBooleanField(term187733, term187733.getClass(), "overflowFlag", false);
        setLongField(term187733, term187733.getClass(), "stepCounter", 0L);
        setField(term187667, term187667.getClass(), "state", term187733);
        setLongField(term187667, term187667.getClass(), "opBeginTime", -671374290989371865L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearZeroFlag", argTypes, term187667, args);
    }

};


