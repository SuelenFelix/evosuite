package com.loomcom.symon.devices;

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
import static com.loomcom.symon.devices.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;
import java.lang.Boolean;

public class Acia6850_read_15606233861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9811;
     Object term9916;
     Object term9918;

    public Acia6850_read_15606233861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9931 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term9930 = ((Class) term9931).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term9930).setAccessible(true);
        Object enum21 = ((Field) term9930).get((Object) null);
        HashMap term9867 = new HashMap();
        HashMap term9901 = new HashMap();
        HashMap term9908 = new HashMap();
        Set<Object> term10222 =  ((Map) term9908).keySet();
        HashSet term9907 = new HashSet((Collection<? extends Object>) term10222);
        term9811 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6850"));
        Object term9838 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term9853 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term9856 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term9861 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term9864 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term9872 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term9873 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term9881 = (int[]) newIntArray(2);
        int[] term9884 = (int[]) newIntArray(2);
        Object[] term9906 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        setField(term9811, term9811.getClass(), "name", "UlajhuVLaP");
        setIntField(term9811, term9811.getClass(), "baseAddress", 852806940);
        setBooleanField(term9811, term9811.getClass(), "receiveIrqEnabled", false);
        setBooleanField(term9811, term9811.getClass(), "transmitIrqEnabled", true);
        setBooleanField(term9811, term9811.getClass(), "overrun", true);
        setBooleanField(term9811, term9811.getClass(), "interrupt", false);
        setLongField(term9811, term9811.getClass(), "lastTxWrite", 1084801489398441516L);
        setLongField(term9811, term9811.getClass(), "lastRxRead", 6273754186658578034L);
        setIntField(term9811, term9811.getClass(), "baudRate", 698551724);
        setLongField(term9811, term9811.getClass(), "baudRateDelay", 3620247240684476031L);
        setIntField(term9811, term9811.getClass(), "rxChar", -1631048635);
        setIntField(term9811, term9811.getClass(), "txChar", 1342808731);
        setBooleanField(term9811, term9811.getClass(), "rxFull", false);
        setBooleanField(term9811, term9811.getClass(), "txEmpty", true);
        setIntField(term9811, term9811.getClass(), "size", -64893740);
        setIntField(term9838, term9838.getClass(), "startAddress", -222012928);
        setIntField(term9838, term9838.getClass(), "endAddress", -146564963);
        setField(term9811, term9811.getClass(), "memoryRange", term9838);
        setIntField(term9853, term9853.getClass(), "startAddress", -83178716);
        setIntField(term9853, term9853.getClass(), "endAddress", -1292704466);
        setLongField(term9856, term9856.getClass(), "clockPeriodInNs", 1000L);
        setField(term9856, term9856.getClass(), "behavior", enum21);
        setIntField(term9861, term9861.getClass(), "startAddress", 1991858584);
        setIntField(term9861, term9861.getClass(), "endAddress", -1300947782);
        setLongField(term9864, term9864.getClass(), "clockPeriodInNs", 1000L);
        setField(term9864, term9864.getClass(), "behavior", enum21);
        setField(term9864, term9864.getClass(), "bus", null);
        setField(term9864, term9864.getClass(), "state", null);
        setLongField(term9864, term9864.getClass(), "opBeginTime", -1214968196781083707L);
        setField(term9861, term9861.getClass(), "cpu", term9864);
        setField(term9861, term9861.getClass(), "deviceMap", term9867);
        setField(term9861, term9861.getClass(), "deviceAddressArray", term9872);
        setField(term9856, term9856.getClass(), "bus", term9861);
        setIntField(term9873, term9873.getClass(), "a", 0);
        setIntField(term9873, term9873.getClass(), "x", 0);
        setIntField(term9873, term9873.getClass(), "y", 0);
        setIntField(term9873, term9873.getClass(), "sp", 0);
        setIntField(term9873, term9873.getClass(), "pc", 0);
        setIntField(term9873, term9873.getClass(), "ir", 0);
        setIntField(term9873, term9873.getClass(), "nextIr", 0);
        setField(term9873, term9873.getClass(), "args", term9881);
        setField(term9873, term9873.getClass(), "nextArgs", term9884);
        setIntField(term9873, term9873.getClass(), "instSize", 0);
        setBooleanField(term9873, term9873.getClass(), "opTrap", false);
        setBooleanField(term9873, term9873.getClass(), "irqAsserted", false);
        setBooleanField(term9873, term9873.getClass(), "nmiAsserted", false);
        setIntField(term9873, term9873.getClass(), "lastPc", 0);
        setBooleanField(term9873, term9873.getClass(), "carryFlag", false);
        setBooleanField(term9873, term9873.getClass(), "negativeFlag", false);
        setBooleanField(term9873, term9873.getClass(), "zeroFlag", false);
        setBooleanField(term9873, term9873.getClass(), "irqDisableFlag", false);
        setBooleanField(term9873, term9873.getClass(), "decimalModeFlag", false);
        setBooleanField(term9873, term9873.getClass(), "breakFlag", false);
        setBooleanField(term9873, term9873.getClass(), "overflowFlag", false);
        setLongField(term9873, term9873.getClass(), "stepCounter", 0L);
        setField(term9856, term9856.getClass(), "state", term9873);
        setLongField(term9856, term9856.getClass(), "opBeginTime", -1804015692891701666L);
        setField(term9853, term9853.getClass(), "cpu", term9856);
        setField(term9853, term9853.getClass(), "deviceMap", term9901);
        setField(term9853, term9853.getClass(), "deviceAddressArray", term9906);
        setField(term9811, term9811.getClass(), "bus", term9853);
        setField(term9811, term9811.getClass(), "deviceChangeListeners", term9907);
        term9916 = new Integer(1105016932);
        term9918 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6850");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term9916;
        args[1] = term9918;
        callMethod(klass, "read", argTypes, term9811, args);
    }

};


