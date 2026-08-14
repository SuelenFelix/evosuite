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
import java.lang.Boolean;

public class Cpu_handleInterrupt_160418018013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178471;
     Object term178565;
     Object term178567;
     Object term178569;
     Object term178571;

    public Cpu_handleInterrupt_160418018013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term178574 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term178573 = ((Class) term178574).getDeclaredField((String) "NMOS_6502");
        ((Field) term178573).setAccessible(true);
        Object enum193 = ((Field) term178573).get((Object) null);
        HashMap term178497 = new HashMap();
        HashMap term178531 = new HashMap();
        term178471 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term178486 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term178489 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term178491 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term178494 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term178502 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term178503 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term178511 = (int[]) newIntArray(2);
        int[] term178514 = (int[]) newIntArray(2);
        Object[] term178536 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term178537 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term178545 = (int[]) newIntArray(2);
        int[] term178548 = (int[]) newIntArray(2);
        setLongField(term178471, term178471.getClass(), "clockPeriodInNs", 1000L);
        setField(term178471, term178471.getClass(), "behavior", enum193);
        setIntField(term178486, term178486.getClass(), "startAddress", -1791051420);
        setIntField(term178486, term178486.getClass(), "endAddress", 98451832);
        setLongField(term178489, term178489.getClass(), "clockPeriodInNs", 1000L);
        setField(term178489, term178489.getClass(), "behavior", enum193);
        setIntField(term178491, term178491.getClass(), "startAddress", 584008261);
        setIntField(term178491, term178491.getClass(), "endAddress", -881683610);
        setLongField(term178494, term178494.getClass(), "clockPeriodInNs", 1000L);
        setField(term178494, term178494.getClass(), "behavior", enum193);
        setField(term178494, term178494.getClass(), "bus", null);
        setField(term178494, term178494.getClass(), "state", null);
        setLongField(term178494, term178494.getClass(), "opBeginTime", 8628710602325472259L);
        setField(term178491, term178491.getClass(), "cpu", term178494);
        setField(term178491, term178491.getClass(), "deviceMap", term178497);
        setField(term178491, term178491.getClass(), "deviceAddressArray", term178502);
        setField(term178489, term178489.getClass(), "bus", term178491);
        setIntField(term178503, term178503.getClass(), "a", 0);
        setIntField(term178503, term178503.getClass(), "x", 0);
        setIntField(term178503, term178503.getClass(), "y", 0);
        setIntField(term178503, term178503.getClass(), "sp", 0);
        setIntField(term178503, term178503.getClass(), "pc", 0);
        setIntField(term178503, term178503.getClass(), "ir", 0);
        setIntField(term178503, term178503.getClass(), "nextIr", 0);
        setField(term178503, term178503.getClass(), "args", term178511);
        setField(term178503, term178503.getClass(), "nextArgs", term178514);
        setIntField(term178503, term178503.getClass(), "instSize", 0);
        setBooleanField(term178503, term178503.getClass(), "opTrap", false);
        setBooleanField(term178503, term178503.getClass(), "irqAsserted", false);
        setBooleanField(term178503, term178503.getClass(), "nmiAsserted", false);
        setIntField(term178503, term178503.getClass(), "lastPc", 0);
        setBooleanField(term178503, term178503.getClass(), "carryFlag", false);
        setBooleanField(term178503, term178503.getClass(), "negativeFlag", false);
        setBooleanField(term178503, term178503.getClass(), "zeroFlag", false);
        setBooleanField(term178503, term178503.getClass(), "irqDisableFlag", false);
        setBooleanField(term178503, term178503.getClass(), "decimalModeFlag", false);
        setBooleanField(term178503, term178503.getClass(), "breakFlag", false);
        setBooleanField(term178503, term178503.getClass(), "overflowFlag", false);
        setLongField(term178503, term178503.getClass(), "stepCounter", 0L);
        setField(term178489, term178489.getClass(), "state", term178503);
        setLongField(term178489, term178489.getClass(), "opBeginTime", -6397802456253967096L);
        setField(term178486, term178486.getClass(), "cpu", term178489);
        setField(term178486, term178486.getClass(), "deviceMap", term178531);
        setField(term178486, term178486.getClass(), "deviceAddressArray", term178536);
        setField(term178471, term178471.getClass(), "bus", term178486);
        setIntField(term178537, term178537.getClass(), "a", 0);
        setIntField(term178537, term178537.getClass(), "x", 0);
        setIntField(term178537, term178537.getClass(), "y", 0);
        setIntField(term178537, term178537.getClass(), "sp", 0);
        setIntField(term178537, term178537.getClass(), "pc", 0);
        setIntField(term178537, term178537.getClass(), "ir", 0);
        setIntField(term178537, term178537.getClass(), "nextIr", 0);
        setField(term178537, term178537.getClass(), "args", term178545);
        setField(term178537, term178537.getClass(), "nextArgs", term178548);
        setIntField(term178537, term178537.getClass(), "instSize", 0);
        setBooleanField(term178537, term178537.getClass(), "opTrap", false);
        setBooleanField(term178537, term178537.getClass(), "irqAsserted", false);
        setBooleanField(term178537, term178537.getClass(), "nmiAsserted", false);
        setIntField(term178537, term178537.getClass(), "lastPc", 0);
        setBooleanField(term178537, term178537.getClass(), "carryFlag", false);
        setBooleanField(term178537, term178537.getClass(), "negativeFlag", false);
        setBooleanField(term178537, term178537.getClass(), "zeroFlag", false);
        setBooleanField(term178537, term178537.getClass(), "irqDisableFlag", false);
        setBooleanField(term178537, term178537.getClass(), "decimalModeFlag", false);
        setBooleanField(term178537, term178537.getClass(), "breakFlag", false);
        setBooleanField(term178537, term178537.getClass(), "overflowFlag", false);
        setLongField(term178537, term178537.getClass(), "stepCounter", 0L);
        setField(term178471, term178471.getClass(), "state", term178537);
        setLongField(term178471, term178471.getClass(), "opBeginTime", -5097855288490086692L);
        term178565 = new Integer(159996093);
        term178567 = new Integer(1937937383);
        term178569 = new Integer(-639813848);
        term178571 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term178565;
        args[1] = term178567;
        args[2] = term178569;
        args[3] = term178571;
        callMethod(klass, "handleInterrupt", argTypes, term178471, args);
    }

};


