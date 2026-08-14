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

public class Cpu_reset_8450165126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175903;

    public Cpu_reset_8450165126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term175998 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term175997 = ((Class) term175998).getDeclaredField((String) "NMOS_6502");
        ((Field) term175997).setAccessible(true);
        Object enum186 = ((Field) term175997).get((Object) null);
        HashMap term175929 = new HashMap();
        HashMap term175963 = new HashMap();
        term175903 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term175918 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term175921 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term175923 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term175926 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term175934 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term175935 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term175943 = (int[]) newIntArray(2);
        int[] term175946 = (int[]) newIntArray(2);
        Object[] term175968 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term175969 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term175977 = (int[]) newIntArray(2);
        int[] term175980 = (int[]) newIntArray(2);
        setLongField(term175903, term175903.getClass(), "clockPeriodInNs", 1000L);
        setField(term175903, term175903.getClass(), "behavior", enum186);
        setIntField(term175918, term175918.getClass(), "startAddress", 1513185438);
        setIntField(term175918, term175918.getClass(), "endAddress", 2065870022);
        setLongField(term175921, term175921.getClass(), "clockPeriodInNs", 1000L);
        setField(term175921, term175921.getClass(), "behavior", enum186);
        setIntField(term175923, term175923.getClass(), "startAddress", 945426732);
        setIntField(term175923, term175923.getClass(), "endAddress", 202749749);
        setLongField(term175926, term175926.getClass(), "clockPeriodInNs", 1000L);
        setField(term175926, term175926.getClass(), "behavior", enum186);
        setField(term175926, term175926.getClass(), "bus", null);
        setField(term175926, term175926.getClass(), "state", null);
        setLongField(term175926, term175926.getClass(), "opBeginTime", -1435639144971145612L);
        setField(term175923, term175923.getClass(), "cpu", term175926);
        setField(term175923, term175923.getClass(), "deviceMap", term175929);
        setField(term175923, term175923.getClass(), "deviceAddressArray", term175934);
        setField(term175921, term175921.getClass(), "bus", term175923);
        setIntField(term175935, term175935.getClass(), "a", 0);
        setIntField(term175935, term175935.getClass(), "x", 0);
        setIntField(term175935, term175935.getClass(), "y", 0);
        setIntField(term175935, term175935.getClass(), "sp", 0);
        setIntField(term175935, term175935.getClass(), "pc", 0);
        setIntField(term175935, term175935.getClass(), "ir", 0);
        setIntField(term175935, term175935.getClass(), "nextIr", 0);
        setField(term175935, term175935.getClass(), "args", term175943);
        setField(term175935, term175935.getClass(), "nextArgs", term175946);
        setIntField(term175935, term175935.getClass(), "instSize", 0);
        setBooleanField(term175935, term175935.getClass(), "opTrap", false);
        setBooleanField(term175935, term175935.getClass(), "irqAsserted", false);
        setBooleanField(term175935, term175935.getClass(), "nmiAsserted", false);
        setIntField(term175935, term175935.getClass(), "lastPc", 0);
        setBooleanField(term175935, term175935.getClass(), "carryFlag", false);
        setBooleanField(term175935, term175935.getClass(), "negativeFlag", false);
        setBooleanField(term175935, term175935.getClass(), "zeroFlag", false);
        setBooleanField(term175935, term175935.getClass(), "irqDisableFlag", false);
        setBooleanField(term175935, term175935.getClass(), "decimalModeFlag", false);
        setBooleanField(term175935, term175935.getClass(), "breakFlag", false);
        setBooleanField(term175935, term175935.getClass(), "overflowFlag", false);
        setLongField(term175935, term175935.getClass(), "stepCounter", 0L);
        setField(term175921, term175921.getClass(), "state", term175935);
        setLongField(term175921, term175921.getClass(), "opBeginTime", -921066654455496205L);
        setField(term175918, term175918.getClass(), "cpu", term175921);
        setField(term175918, term175918.getClass(), "deviceMap", term175963);
        setField(term175918, term175918.getClass(), "deviceAddressArray", term175968);
        setField(term175903, term175903.getClass(), "bus", term175918);
        setIntField(term175969, term175969.getClass(), "a", 0);
        setIntField(term175969, term175969.getClass(), "x", 0);
        setIntField(term175969, term175969.getClass(), "y", 0);
        setIntField(term175969, term175969.getClass(), "sp", 0);
        setIntField(term175969, term175969.getClass(), "pc", 0);
        setIntField(term175969, term175969.getClass(), "ir", 0);
        setIntField(term175969, term175969.getClass(), "nextIr", 0);
        setField(term175969, term175969.getClass(), "args", term175977);
        setField(term175969, term175969.getClass(), "nextArgs", term175980);
        setIntField(term175969, term175969.getClass(), "instSize", 0);
        setBooleanField(term175969, term175969.getClass(), "opTrap", false);
        setBooleanField(term175969, term175969.getClass(), "irqAsserted", false);
        setBooleanField(term175969, term175969.getClass(), "nmiAsserted", false);
        setIntField(term175969, term175969.getClass(), "lastPc", 0);
        setBooleanField(term175969, term175969.getClass(), "carryFlag", false);
        setBooleanField(term175969, term175969.getClass(), "negativeFlag", false);
        setBooleanField(term175969, term175969.getClass(), "zeroFlag", false);
        setBooleanField(term175969, term175969.getClass(), "irqDisableFlag", false);
        setBooleanField(term175969, term175969.getClass(), "decimalModeFlag", false);
        setBooleanField(term175969, term175969.getClass(), "breakFlag", false);
        setBooleanField(term175969, term175969.getClass(), "overflowFlag", false);
        setLongField(term175969, term175969.getClass(), "stepCounter", 0L);
        setField(term175903, term175903.getClass(), "state", term175969);
        setLongField(term175903, term175903.getClass(), "opBeginTime", 7622401904339010124L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term175903, args);
    }

};


