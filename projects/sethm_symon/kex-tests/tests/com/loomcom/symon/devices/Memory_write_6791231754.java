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

public class Memory_write_6791231754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23835;
     Object term23918;
     Object term23920;

    public Memory_write_6791231754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23937 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term23936 = ((Class) term23937).getDeclaredField((String) "CMOS_65816");
        ((Field) term23936).setAccessible(true);
        Object enum65 = ((Field) term23936).get((Object) null);
        HashMap term23872 = new HashMap();
        HashMap term23906 = new HashMap();
        HashMap term23913 = new HashMap();
        Set<Object> term24207 =  ((Map) term23913).keySet();
        HashSet term23912 = new HashSet((Collection<? extends Object>) term24207);
        term23835 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term23837 = (int[]) newIntArray(4);
        Object term23843 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term23858 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term23861 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term23866 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term23869 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term23877 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term23878 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term23886 = (int[]) newIntArray(2);
        int[] term23889 = (int[]) newIntArray(2);
        Object[] term23911 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        setBooleanField(term23835, term23835.getClass(), "readOnly", false);
        setIntElement(term23837, 0, -191639503);
        setIntElement(term23837, 1, -1563700756);
        setIntElement(term23837, 2, -208314837);
        setIntElement(term23837, 3, 697841387);
        setField(term23835, term23835.getClass(), "mem", term23837);
        setIntField(term23835, term23835.getClass(), "size", 1703093401);
        setIntField(term23843, term23843.getClass(), "startAddress", 47607734);
        setIntField(term23843, term23843.getClass(), "endAddress", 1717232691);
        setField(term23835, term23835.getClass(), "memoryRange", term23843);
        setField(term23835, term23835.getClass(), "name", "TimdotUuNC");
        setIntField(term23858, term23858.getClass(), "startAddress", -938127737);
        setIntField(term23858, term23858.getClass(), "endAddress", -1408678076);
        setLongField(term23861, term23861.getClass(), "clockPeriodInNs", 1000L);
        setField(term23861, term23861.getClass(), "behavior", enum65);
        setIntField(term23866, term23866.getClass(), "startAddress", 1201413899);
        setIntField(term23866, term23866.getClass(), "endAddress", -376722373);
        setLongField(term23869, term23869.getClass(), "clockPeriodInNs", 1000L);
        setField(term23869, term23869.getClass(), "behavior", enum65);
        setField(term23869, term23869.getClass(), "bus", null);
        setField(term23869, term23869.getClass(), "state", null);
        setLongField(term23869, term23869.getClass(), "opBeginTime", 1860789353508856614L);
        setField(term23866, term23866.getClass(), "cpu", term23869);
        setField(term23866, term23866.getClass(), "deviceMap", term23872);
        setField(term23866, term23866.getClass(), "deviceAddressArray", term23877);
        setField(term23861, term23861.getClass(), "bus", term23866);
        setIntField(term23878, term23878.getClass(), "a", 0);
        setIntField(term23878, term23878.getClass(), "x", 0);
        setIntField(term23878, term23878.getClass(), "y", 0);
        setIntField(term23878, term23878.getClass(), "sp", 0);
        setIntField(term23878, term23878.getClass(), "pc", 0);
        setIntField(term23878, term23878.getClass(), "ir", 0);
        setIntField(term23878, term23878.getClass(), "nextIr", 0);
        setField(term23878, term23878.getClass(), "args", term23886);
        setField(term23878, term23878.getClass(), "nextArgs", term23889);
        setIntField(term23878, term23878.getClass(), "instSize", 0);
        setBooleanField(term23878, term23878.getClass(), "opTrap", false);
        setBooleanField(term23878, term23878.getClass(), "irqAsserted", false);
        setBooleanField(term23878, term23878.getClass(), "nmiAsserted", false);
        setIntField(term23878, term23878.getClass(), "lastPc", 0);
        setBooleanField(term23878, term23878.getClass(), "carryFlag", false);
        setBooleanField(term23878, term23878.getClass(), "negativeFlag", false);
        setBooleanField(term23878, term23878.getClass(), "zeroFlag", false);
        setBooleanField(term23878, term23878.getClass(), "irqDisableFlag", false);
        setBooleanField(term23878, term23878.getClass(), "decimalModeFlag", false);
        setBooleanField(term23878, term23878.getClass(), "breakFlag", false);
        setBooleanField(term23878, term23878.getClass(), "overflowFlag", false);
        setLongField(term23878, term23878.getClass(), "stepCounter", 0L);
        setField(term23861, term23861.getClass(), "state", term23878);
        setLongField(term23861, term23861.getClass(), "opBeginTime", -7456852906235966771L);
        setField(term23858, term23858.getClass(), "cpu", term23861);
        setField(term23858, term23858.getClass(), "deviceMap", term23906);
        setField(term23858, term23858.getClass(), "deviceAddressArray", term23911);
        setField(term23835, term23835.getClass(), "bus", term23858);
        setField(term23835, term23835.getClass(), "deviceChangeListeners", term23912);
        term23918 = new Integer(-2025555268);
        term23920 = new Integer(-746950289);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Memory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term23918;
        args[1] = term23920;
        callMethod(klass, "write", argTypes, term23835, args);
    }

};


