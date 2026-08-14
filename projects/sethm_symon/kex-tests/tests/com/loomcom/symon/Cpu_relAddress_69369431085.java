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

public class Cpu_relAddress_69369431085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204897;
     Object term204991;

    public Cpu_relAddress_69369431085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term204994 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term204993 = ((Class) term204994).getDeclaredField((String) "NMOS_6502");
        ((Field) term204993).setAccessible(true);
        Object enum265 = ((Field) term204993).get((Object) null);
        HashMap term204923 = new HashMap();
        HashMap term204957 = new HashMap();
        term204897 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term204912 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term204915 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term204917 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term204920 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term204928 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term204929 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term204937 = (int[]) newIntArray(2);
        int[] term204940 = (int[]) newIntArray(2);
        Object[] term204962 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term204963 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term204971 = (int[]) newIntArray(2);
        int[] term204974 = (int[]) newIntArray(2);
        setLongField(term204897, term204897.getClass(), "clockPeriodInNs", 1000L);
        setField(term204897, term204897.getClass(), "behavior", enum265);
        setIntField(term204912, term204912.getClass(), "startAddress", -1249891722);
        setIntField(term204912, term204912.getClass(), "endAddress", -402850097);
        setLongField(term204915, term204915.getClass(), "clockPeriodInNs", 1000L);
        setField(term204915, term204915.getClass(), "behavior", enum265);
        setIntField(term204917, term204917.getClass(), "startAddress", 1012166312);
        setIntField(term204917, term204917.getClass(), "endAddress", 1625194278);
        setLongField(term204920, term204920.getClass(), "clockPeriodInNs", 1000L);
        setField(term204920, term204920.getClass(), "behavior", enum265);
        setField(term204920, term204920.getClass(), "bus", null);
        setField(term204920, term204920.getClass(), "state", null);
        setLongField(term204920, term204920.getClass(), "opBeginTime", 8761438573959719489L);
        setField(term204917, term204917.getClass(), "cpu", term204920);
        setField(term204917, term204917.getClass(), "deviceMap", term204923);
        setField(term204917, term204917.getClass(), "deviceAddressArray", term204928);
        setField(term204915, term204915.getClass(), "bus", term204917);
        setIntField(term204929, term204929.getClass(), "a", 0);
        setIntField(term204929, term204929.getClass(), "x", 0);
        setIntField(term204929, term204929.getClass(), "y", 0);
        setIntField(term204929, term204929.getClass(), "sp", 0);
        setIntField(term204929, term204929.getClass(), "pc", 0);
        setIntField(term204929, term204929.getClass(), "ir", 0);
        setIntField(term204929, term204929.getClass(), "nextIr", 0);
        setField(term204929, term204929.getClass(), "args", term204937);
        setField(term204929, term204929.getClass(), "nextArgs", term204940);
        setIntField(term204929, term204929.getClass(), "instSize", 0);
        setBooleanField(term204929, term204929.getClass(), "opTrap", false);
        setBooleanField(term204929, term204929.getClass(), "irqAsserted", false);
        setBooleanField(term204929, term204929.getClass(), "nmiAsserted", false);
        setIntField(term204929, term204929.getClass(), "lastPc", 0);
        setBooleanField(term204929, term204929.getClass(), "carryFlag", false);
        setBooleanField(term204929, term204929.getClass(), "negativeFlag", false);
        setBooleanField(term204929, term204929.getClass(), "zeroFlag", false);
        setBooleanField(term204929, term204929.getClass(), "irqDisableFlag", false);
        setBooleanField(term204929, term204929.getClass(), "decimalModeFlag", false);
        setBooleanField(term204929, term204929.getClass(), "breakFlag", false);
        setBooleanField(term204929, term204929.getClass(), "overflowFlag", false);
        setLongField(term204929, term204929.getClass(), "stepCounter", 0L);
        setField(term204915, term204915.getClass(), "state", term204929);
        setLongField(term204915, term204915.getClass(), "opBeginTime", -6772311116874630960L);
        setField(term204912, term204912.getClass(), "cpu", term204915);
        setField(term204912, term204912.getClass(), "deviceMap", term204957);
        setField(term204912, term204912.getClass(), "deviceAddressArray", term204962);
        setField(term204897, term204897.getClass(), "bus", term204912);
        setIntField(term204963, term204963.getClass(), "a", 0);
        setIntField(term204963, term204963.getClass(), "x", 0);
        setIntField(term204963, term204963.getClass(), "y", 0);
        setIntField(term204963, term204963.getClass(), "sp", 0);
        setIntField(term204963, term204963.getClass(), "pc", 0);
        setIntField(term204963, term204963.getClass(), "ir", 0);
        setIntField(term204963, term204963.getClass(), "nextIr", 0);
        setField(term204963, term204963.getClass(), "args", term204971);
        setField(term204963, term204963.getClass(), "nextArgs", term204974);
        setIntField(term204963, term204963.getClass(), "instSize", 0);
        setBooleanField(term204963, term204963.getClass(), "opTrap", false);
        setBooleanField(term204963, term204963.getClass(), "irqAsserted", false);
        setBooleanField(term204963, term204963.getClass(), "nmiAsserted", false);
        setIntField(term204963, term204963.getClass(), "lastPc", 0);
        setBooleanField(term204963, term204963.getClass(), "carryFlag", false);
        setBooleanField(term204963, term204963.getClass(), "negativeFlag", false);
        setBooleanField(term204963, term204963.getClass(), "zeroFlag", false);
        setBooleanField(term204963, term204963.getClass(), "irqDisableFlag", false);
        setBooleanField(term204963, term204963.getClass(), "decimalModeFlag", false);
        setBooleanField(term204963, term204963.getClass(), "breakFlag", false);
        setBooleanField(term204963, term204963.getClass(), "overflowFlag", false);
        setLongField(term204963, term204963.getClass(), "stepCounter", 0L);
        setField(term204897, term204897.getClass(), "state", term204963);
        setLongField(term204897, term204897.getClass(), "opBeginTime", 6971596090562280868L);
        term204991 = new Integer(1080095535);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term204991;
        callMethod(klass, "relAddress", argTypes, term204897, args);
    }

};


