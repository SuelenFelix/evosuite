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

public class Memory_loadFromFile_3765779685 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24208;
     Object term24299;

    public Memory_loadFromFile_3765779685() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term24344 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term24343 = ((Class) term24344).getDeclaredField((String) "CMOS_6502");
        ((Field) term24343).setAccessible(true);
        Object enum66 = ((Field) term24343).get((Object) null);
        HashMap term24250 = new HashMap();
        HashMap term24284 = new HashMap();
        HashMap term24291 = new HashMap();
        Set<Object> term24611 =  ((Map) term24291).keySet();
        HashSet term24290 = new HashSet((Collection<? extends Object>) term24611);
        term24208 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term24210 = (int[]) newIntArray(9);
        Object term24221 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term24236 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term24239 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term24244 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term24247 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term24255 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term24256 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term24264 = (int[]) newIntArray(2);
        int[] term24267 = (int[]) newIntArray(2);
        Object[] term24289 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        setBooleanField(term24208, term24208.getClass(), "readOnly", true);
        setIntElement(term24210, 0, -137577510);
        setIntElement(term24210, 1, 719185716);
        setIntElement(term24210, 2, 1624820010);
        setIntElement(term24210, 3, -831921156);
        setIntElement(term24210, 4, -2085566906);
        setIntElement(term24210, 5, 1773193728);
        setIntElement(term24210, 6, -1341357647);
        setIntElement(term24210, 7, 138447019);
        setIntElement(term24210, 8, 114915275);
        setField(term24208, term24208.getClass(), "mem", term24210);
        setIntField(term24208, term24208.getClass(), "size", 2025566580);
        setIntField(term24221, term24221.getClass(), "startAddress", -1231122778);
        setIntField(term24221, term24221.getClass(), "endAddress", 1923558221);
        setField(term24208, term24208.getClass(), "memoryRange", term24221);
        setField(term24208, term24208.getClass(), "name", "PkWMRdJcBb");
        setIntField(term24236, term24236.getClass(), "startAddress", 1762934060);
        setIntField(term24236, term24236.getClass(), "endAddress", -859828739);
        setLongField(term24239, term24239.getClass(), "clockPeriodInNs", 1000L);
        setField(term24239, term24239.getClass(), "behavior", enum66);
        setIntField(term24244, term24244.getClass(), "startAddress", 1986855642);
        setIntField(term24244, term24244.getClass(), "endAddress", 1280322790);
        setLongField(term24247, term24247.getClass(), "clockPeriodInNs", 1000L);
        setField(term24247, term24247.getClass(), "behavior", enum66);
        setField(term24247, term24247.getClass(), "bus", null);
        setField(term24247, term24247.getClass(), "state", null);
        setLongField(term24247, term24247.getClass(), "opBeginTime", 4576699120365923235L);
        setField(term24244, term24244.getClass(), "cpu", term24247);
        setField(term24244, term24244.getClass(), "deviceMap", term24250);
        setField(term24244, term24244.getClass(), "deviceAddressArray", term24255);
        setField(term24239, term24239.getClass(), "bus", term24244);
        setIntField(term24256, term24256.getClass(), "a", 0);
        setIntField(term24256, term24256.getClass(), "x", 0);
        setIntField(term24256, term24256.getClass(), "y", 0);
        setIntField(term24256, term24256.getClass(), "sp", 0);
        setIntField(term24256, term24256.getClass(), "pc", 0);
        setIntField(term24256, term24256.getClass(), "ir", 0);
        setIntField(term24256, term24256.getClass(), "nextIr", 0);
        setField(term24256, term24256.getClass(), "args", term24264);
        setField(term24256, term24256.getClass(), "nextArgs", term24267);
        setIntField(term24256, term24256.getClass(), "instSize", 0);
        setBooleanField(term24256, term24256.getClass(), "opTrap", false);
        setBooleanField(term24256, term24256.getClass(), "irqAsserted", false);
        setBooleanField(term24256, term24256.getClass(), "nmiAsserted", false);
        setIntField(term24256, term24256.getClass(), "lastPc", 0);
        setBooleanField(term24256, term24256.getClass(), "carryFlag", false);
        setBooleanField(term24256, term24256.getClass(), "negativeFlag", false);
        setBooleanField(term24256, term24256.getClass(), "zeroFlag", false);
        setBooleanField(term24256, term24256.getClass(), "irqDisableFlag", false);
        setBooleanField(term24256, term24256.getClass(), "decimalModeFlag", false);
        setBooleanField(term24256, term24256.getClass(), "breakFlag", false);
        setBooleanField(term24256, term24256.getClass(), "overflowFlag", false);
        setLongField(term24256, term24256.getClass(), "stepCounter", 0L);
        setField(term24239, term24239.getClass(), "state", term24256);
        setLongField(term24239, term24239.getClass(), "opBeginTime", -1635471392209071620L);
        setField(term24236, term24236.getClass(), "cpu", term24239);
        setField(term24236, term24236.getClass(), "deviceMap", term24284);
        setField(term24236, term24236.getClass(), "deviceAddressArray", term24289);
        setField(term24208, term24208.getClass(), "bus", term24236);
        setField(term24208, term24208.getClass(), "deviceChangeListeners", term24290);
        Class<? extends Object> term24623 = Class.forName((String) "java.io.File$PathStatus");
        Field term24622 = ((Class) term24623).getDeclaredField((String) "CHECKED");
        ((Field) term24622).setAccessible(true);
        Object enum67 = ((Field) term24622).get((Object) null);
        term24299 = newInstance(Class.forName("java.io.File"));
        setField(term24299, term24299.getClass(), "path", "jSpAteRute");
        setField(term24299, term24299.getClass(), "status", enum67);
        setIntField(term24299, term24299.getClass(), "prefixLength", -1855819749);
        setField(term24299, term24299.getClass(), "filePath", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.File");
        Object[] args = new Object[1];
        args[0] = term24299;
        callMethod(klass, "loadFromFile", argTypes, term24208, args);
    }

};


