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

public class Cpu_setProcessorStatus_50416087566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term197927;
     Object term198021;

    public Cpu_setProcessorStatus_50416087566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term198024 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term198023 = ((Class) term198024).getDeclaredField((String) "NMOS_6502");
        ((Field) term198023).setAccessible(true);
        Object enum246 = ((Field) term198023).get((Object) null);
        HashMap term197953 = new HashMap();
        HashMap term197987 = new HashMap();
        term197927 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term197942 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term197945 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term197947 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term197950 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term197958 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term197959 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term197967 = (int[]) newIntArray(2);
        int[] term197970 = (int[]) newIntArray(2);
        Object[] term197992 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term197993 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term198001 = (int[]) newIntArray(2);
        int[] term198004 = (int[]) newIntArray(2);
        setLongField(term197927, term197927.getClass(), "clockPeriodInNs", 1000L);
        setField(term197927, term197927.getClass(), "behavior", enum246);
        setIntField(term197942, term197942.getClass(), "startAddress", 977791910);
        setIntField(term197942, term197942.getClass(), "endAddress", 1763791756);
        setLongField(term197945, term197945.getClass(), "clockPeriodInNs", 1000L);
        setField(term197945, term197945.getClass(), "behavior", enum246);
        setIntField(term197947, term197947.getClass(), "startAddress", 1902011317);
        setIntField(term197947, term197947.getClass(), "endAddress", 739273183);
        setLongField(term197950, term197950.getClass(), "clockPeriodInNs", 1000L);
        setField(term197950, term197950.getClass(), "behavior", enum246);
        setField(term197950, term197950.getClass(), "bus", null);
        setField(term197950, term197950.getClass(), "state", null);
        setLongField(term197950, term197950.getClass(), "opBeginTime", 8562037929535808010L);
        setField(term197947, term197947.getClass(), "cpu", term197950);
        setField(term197947, term197947.getClass(), "deviceMap", term197953);
        setField(term197947, term197947.getClass(), "deviceAddressArray", term197958);
        setField(term197945, term197945.getClass(), "bus", term197947);
        setIntField(term197959, term197959.getClass(), "a", 0);
        setIntField(term197959, term197959.getClass(), "x", 0);
        setIntField(term197959, term197959.getClass(), "y", 0);
        setIntField(term197959, term197959.getClass(), "sp", 0);
        setIntField(term197959, term197959.getClass(), "pc", 0);
        setIntField(term197959, term197959.getClass(), "ir", 0);
        setIntField(term197959, term197959.getClass(), "nextIr", 0);
        setField(term197959, term197959.getClass(), "args", term197967);
        setField(term197959, term197959.getClass(), "nextArgs", term197970);
        setIntField(term197959, term197959.getClass(), "instSize", 0);
        setBooleanField(term197959, term197959.getClass(), "opTrap", false);
        setBooleanField(term197959, term197959.getClass(), "irqAsserted", false);
        setBooleanField(term197959, term197959.getClass(), "nmiAsserted", false);
        setIntField(term197959, term197959.getClass(), "lastPc", 0);
        setBooleanField(term197959, term197959.getClass(), "carryFlag", false);
        setBooleanField(term197959, term197959.getClass(), "negativeFlag", false);
        setBooleanField(term197959, term197959.getClass(), "zeroFlag", false);
        setBooleanField(term197959, term197959.getClass(), "irqDisableFlag", false);
        setBooleanField(term197959, term197959.getClass(), "decimalModeFlag", false);
        setBooleanField(term197959, term197959.getClass(), "breakFlag", false);
        setBooleanField(term197959, term197959.getClass(), "overflowFlag", false);
        setLongField(term197959, term197959.getClass(), "stepCounter", 0L);
        setField(term197945, term197945.getClass(), "state", term197959);
        setLongField(term197945, term197945.getClass(), "opBeginTime", 3881743260573639770L);
        setField(term197942, term197942.getClass(), "cpu", term197945);
        setField(term197942, term197942.getClass(), "deviceMap", term197987);
        setField(term197942, term197942.getClass(), "deviceAddressArray", term197992);
        setField(term197927, term197927.getClass(), "bus", term197942);
        setIntField(term197993, term197993.getClass(), "a", 0);
        setIntField(term197993, term197993.getClass(), "x", 0);
        setIntField(term197993, term197993.getClass(), "y", 0);
        setIntField(term197993, term197993.getClass(), "sp", 0);
        setIntField(term197993, term197993.getClass(), "pc", 0);
        setIntField(term197993, term197993.getClass(), "ir", 0);
        setIntField(term197993, term197993.getClass(), "nextIr", 0);
        setField(term197993, term197993.getClass(), "args", term198001);
        setField(term197993, term197993.getClass(), "nextArgs", term198004);
        setIntField(term197993, term197993.getClass(), "instSize", 0);
        setBooleanField(term197993, term197993.getClass(), "opTrap", false);
        setBooleanField(term197993, term197993.getClass(), "irqAsserted", false);
        setBooleanField(term197993, term197993.getClass(), "nmiAsserted", false);
        setIntField(term197993, term197993.getClass(), "lastPc", 0);
        setBooleanField(term197993, term197993.getClass(), "carryFlag", false);
        setBooleanField(term197993, term197993.getClass(), "negativeFlag", false);
        setBooleanField(term197993, term197993.getClass(), "zeroFlag", false);
        setBooleanField(term197993, term197993.getClass(), "irqDisableFlag", false);
        setBooleanField(term197993, term197993.getClass(), "decimalModeFlag", false);
        setBooleanField(term197993, term197993.getClass(), "breakFlag", false);
        setBooleanField(term197993, term197993.getClass(), "overflowFlag", false);
        setLongField(term197993, term197993.getClass(), "stepCounter", 0L);
        setField(term197927, term197927.getClass(), "state", term197993);
        setLongField(term197927, term197927.getClass(), "opBeginTime", 4805317099230920805L);
        term198021 = new Integer(-1439138016);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term198021;
        callMethod(klass, "setProcessorStatus", argTypes, term197927, args);
    }

};


