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

public class Cpu_clearDecimalModeFlag_32224678044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189863;

    public Cpu_clearDecimalModeFlag_32224678044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term189958 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term189957 = ((Class) term189958).getDeclaredField((String) "NMOS_6502");
        ((Field) term189957).setAccessible(true);
        Object enum224 = ((Field) term189957).get((Object) null);
        HashMap term189889 = new HashMap();
        HashMap term189923 = new HashMap();
        term189863 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term189878 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term189881 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term189883 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term189886 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term189894 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term189895 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term189903 = (int[]) newIntArray(2);
        int[] term189906 = (int[]) newIntArray(2);
        Object[] term189928 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term189929 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term189937 = (int[]) newIntArray(2);
        int[] term189940 = (int[]) newIntArray(2);
        setLongField(term189863, term189863.getClass(), "clockPeriodInNs", 1000L);
        setField(term189863, term189863.getClass(), "behavior", enum224);
        setIntField(term189878, term189878.getClass(), "startAddress", 274867099);
        setIntField(term189878, term189878.getClass(), "endAddress", -1432735615);
        setLongField(term189881, term189881.getClass(), "clockPeriodInNs", 1000L);
        setField(term189881, term189881.getClass(), "behavior", enum224);
        setIntField(term189883, term189883.getClass(), "startAddress", 472705336);
        setIntField(term189883, term189883.getClass(), "endAddress", 988659735);
        setLongField(term189886, term189886.getClass(), "clockPeriodInNs", 1000L);
        setField(term189886, term189886.getClass(), "behavior", enum224);
        setField(term189886, term189886.getClass(), "bus", null);
        setField(term189886, term189886.getClass(), "state", null);
        setLongField(term189886, term189886.getClass(), "opBeginTime", 4813306236521164153L);
        setField(term189883, term189883.getClass(), "cpu", term189886);
        setField(term189883, term189883.getClass(), "deviceMap", term189889);
        setField(term189883, term189883.getClass(), "deviceAddressArray", term189894);
        setField(term189881, term189881.getClass(), "bus", term189883);
        setIntField(term189895, term189895.getClass(), "a", 0);
        setIntField(term189895, term189895.getClass(), "x", 0);
        setIntField(term189895, term189895.getClass(), "y", 0);
        setIntField(term189895, term189895.getClass(), "sp", 0);
        setIntField(term189895, term189895.getClass(), "pc", 0);
        setIntField(term189895, term189895.getClass(), "ir", 0);
        setIntField(term189895, term189895.getClass(), "nextIr", 0);
        setField(term189895, term189895.getClass(), "args", term189903);
        setField(term189895, term189895.getClass(), "nextArgs", term189906);
        setIntField(term189895, term189895.getClass(), "instSize", 0);
        setBooleanField(term189895, term189895.getClass(), "opTrap", false);
        setBooleanField(term189895, term189895.getClass(), "irqAsserted", false);
        setBooleanField(term189895, term189895.getClass(), "nmiAsserted", false);
        setIntField(term189895, term189895.getClass(), "lastPc", 0);
        setBooleanField(term189895, term189895.getClass(), "carryFlag", false);
        setBooleanField(term189895, term189895.getClass(), "negativeFlag", false);
        setBooleanField(term189895, term189895.getClass(), "zeroFlag", false);
        setBooleanField(term189895, term189895.getClass(), "irqDisableFlag", false);
        setBooleanField(term189895, term189895.getClass(), "decimalModeFlag", false);
        setBooleanField(term189895, term189895.getClass(), "breakFlag", false);
        setBooleanField(term189895, term189895.getClass(), "overflowFlag", false);
        setLongField(term189895, term189895.getClass(), "stepCounter", 0L);
        setField(term189881, term189881.getClass(), "state", term189895);
        setLongField(term189881, term189881.getClass(), "opBeginTime", -7136884452108210749L);
        setField(term189878, term189878.getClass(), "cpu", term189881);
        setField(term189878, term189878.getClass(), "deviceMap", term189923);
        setField(term189878, term189878.getClass(), "deviceAddressArray", term189928);
        setField(term189863, term189863.getClass(), "bus", term189878);
        setIntField(term189929, term189929.getClass(), "a", 0);
        setIntField(term189929, term189929.getClass(), "x", 0);
        setIntField(term189929, term189929.getClass(), "y", 0);
        setIntField(term189929, term189929.getClass(), "sp", 0);
        setIntField(term189929, term189929.getClass(), "pc", 0);
        setIntField(term189929, term189929.getClass(), "ir", 0);
        setIntField(term189929, term189929.getClass(), "nextIr", 0);
        setField(term189929, term189929.getClass(), "args", term189937);
        setField(term189929, term189929.getClass(), "nextArgs", term189940);
        setIntField(term189929, term189929.getClass(), "instSize", 0);
        setBooleanField(term189929, term189929.getClass(), "opTrap", false);
        setBooleanField(term189929, term189929.getClass(), "irqAsserted", false);
        setBooleanField(term189929, term189929.getClass(), "nmiAsserted", false);
        setIntField(term189929, term189929.getClass(), "lastPc", 0);
        setBooleanField(term189929, term189929.getClass(), "carryFlag", false);
        setBooleanField(term189929, term189929.getClass(), "negativeFlag", false);
        setBooleanField(term189929, term189929.getClass(), "zeroFlag", false);
        setBooleanField(term189929, term189929.getClass(), "irqDisableFlag", false);
        setBooleanField(term189929, term189929.getClass(), "decimalModeFlag", false);
        setBooleanField(term189929, term189929.getClass(), "breakFlag", false);
        setBooleanField(term189929, term189929.getClass(), "overflowFlag", false);
        setLongField(term189929, term189929.getClass(), "stepCounter", 0L);
        setField(term189863, term189863.getClass(), "state", term189929);
        setLongField(term189863, term189863.getClass(), "opBeginTime", 9152536589169023749L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearDecimalModeFlag", argTypes, term189863, args);
    }

};


