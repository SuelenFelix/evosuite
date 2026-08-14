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

public class Cpu_getCpuState_136474827725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182903;

    public Cpu_getCpuState_136474827725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term182998 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term182997 = ((Class) term182998).getDeclaredField((String) "NMOS_6502");
        ((Field) term182997).setAccessible(true);
        Object enum205 = ((Field) term182997).get((Object) null);
        HashMap term182929 = new HashMap();
        HashMap term182963 = new HashMap();
        term182903 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term182918 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term182921 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term182923 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term182926 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term182934 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term182935 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term182943 = (int[]) newIntArray(2);
        int[] term182946 = (int[]) newIntArray(2);
        Object[] term182968 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term182969 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term182977 = (int[]) newIntArray(2);
        int[] term182980 = (int[]) newIntArray(2);
        setLongField(term182903, term182903.getClass(), "clockPeriodInNs", 1000L);
        setField(term182903, term182903.getClass(), "behavior", enum205);
        setIntField(term182918, term182918.getClass(), "startAddress", 489378978);
        setIntField(term182918, term182918.getClass(), "endAddress", -1498567410);
        setLongField(term182921, term182921.getClass(), "clockPeriodInNs", 1000L);
        setField(term182921, term182921.getClass(), "behavior", enum205);
        setIntField(term182923, term182923.getClass(), "startAddress", 1977510197);
        setIntField(term182923, term182923.getClass(), "endAddress", 1801307871);
        setLongField(term182926, term182926.getClass(), "clockPeriodInNs", 1000L);
        setField(term182926, term182926.getClass(), "behavior", enum205);
        setField(term182926, term182926.getClass(), "bus", null);
        setField(term182926, term182926.getClass(), "state", null);
        setLongField(term182926, term182926.getClass(), "opBeginTime", 4376251358600000238L);
        setField(term182923, term182923.getClass(), "cpu", term182926);
        setField(term182923, term182923.getClass(), "deviceMap", term182929);
        setField(term182923, term182923.getClass(), "deviceAddressArray", term182934);
        setField(term182921, term182921.getClass(), "bus", term182923);
        setIntField(term182935, term182935.getClass(), "a", 0);
        setIntField(term182935, term182935.getClass(), "x", 0);
        setIntField(term182935, term182935.getClass(), "y", 0);
        setIntField(term182935, term182935.getClass(), "sp", 0);
        setIntField(term182935, term182935.getClass(), "pc", 0);
        setIntField(term182935, term182935.getClass(), "ir", 0);
        setIntField(term182935, term182935.getClass(), "nextIr", 0);
        setField(term182935, term182935.getClass(), "args", term182943);
        setField(term182935, term182935.getClass(), "nextArgs", term182946);
        setIntField(term182935, term182935.getClass(), "instSize", 0);
        setBooleanField(term182935, term182935.getClass(), "opTrap", false);
        setBooleanField(term182935, term182935.getClass(), "irqAsserted", false);
        setBooleanField(term182935, term182935.getClass(), "nmiAsserted", false);
        setIntField(term182935, term182935.getClass(), "lastPc", 0);
        setBooleanField(term182935, term182935.getClass(), "carryFlag", false);
        setBooleanField(term182935, term182935.getClass(), "negativeFlag", false);
        setBooleanField(term182935, term182935.getClass(), "zeroFlag", false);
        setBooleanField(term182935, term182935.getClass(), "irqDisableFlag", false);
        setBooleanField(term182935, term182935.getClass(), "decimalModeFlag", false);
        setBooleanField(term182935, term182935.getClass(), "breakFlag", false);
        setBooleanField(term182935, term182935.getClass(), "overflowFlag", false);
        setLongField(term182935, term182935.getClass(), "stepCounter", 0L);
        setField(term182921, term182921.getClass(), "state", term182935);
        setLongField(term182921, term182921.getClass(), "opBeginTime", -3708632729138387526L);
        setField(term182918, term182918.getClass(), "cpu", term182921);
        setField(term182918, term182918.getClass(), "deviceMap", term182963);
        setField(term182918, term182918.getClass(), "deviceAddressArray", term182968);
        setField(term182903, term182903.getClass(), "bus", term182918);
        setIntField(term182969, term182969.getClass(), "a", 0);
        setIntField(term182969, term182969.getClass(), "x", 0);
        setIntField(term182969, term182969.getClass(), "y", 0);
        setIntField(term182969, term182969.getClass(), "sp", 0);
        setIntField(term182969, term182969.getClass(), "pc", 0);
        setIntField(term182969, term182969.getClass(), "ir", 0);
        setIntField(term182969, term182969.getClass(), "nextIr", 0);
        setField(term182969, term182969.getClass(), "args", term182977);
        setField(term182969, term182969.getClass(), "nextArgs", term182980);
        setIntField(term182969, term182969.getClass(), "instSize", 0);
        setBooleanField(term182969, term182969.getClass(), "opTrap", false);
        setBooleanField(term182969, term182969.getClass(), "irqAsserted", false);
        setBooleanField(term182969, term182969.getClass(), "nmiAsserted", false);
        setIntField(term182969, term182969.getClass(), "lastPc", 0);
        setBooleanField(term182969, term182969.getClass(), "carryFlag", false);
        setBooleanField(term182969, term182969.getClass(), "negativeFlag", false);
        setBooleanField(term182969, term182969.getClass(), "zeroFlag", false);
        setBooleanField(term182969, term182969.getClass(), "irqDisableFlag", false);
        setBooleanField(term182969, term182969.getClass(), "decimalModeFlag", false);
        setBooleanField(term182969, term182969.getClass(), "breakFlag", false);
        setBooleanField(term182969, term182969.getClass(), "overflowFlag", false);
        setLongField(term182969, term182969.getClass(), "stepCounter", 0L);
        setField(term182903, term182903.getClass(), "state", term182969);
        setLongField(term182903, term182903.getClass(), "opBeginTime", 2359134970522271046L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCpuState", argTypes, term182903, args);
    }

};


