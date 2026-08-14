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

public class Crtc_read_19007818872 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term887;
     Object term1044;
     Object term1046;

    public Crtc_read_19007818872() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1061 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term1060 = ((Class) term1061).getDeclaredField((String) "CMOS_65816");
        ((Field) term1060).setAccessible(true);
        Object enum2 = ((Field) term1060).get((Object) null);
        HashMap term955 = new HashMap();
        HashMap term962 = new HashMap();
        Set<Object> term1327 =  ((Map) term962).keySet();
        HashSet term961 = new HashSet((Collection<? extends Object>) term1327);
        HashMap term995 = new HashMap();
        HashMap term1029 = new HashMap();
        HashMap term1036 = new HashMap();
        Set<Object> term1342 =  ((Map) term1036).keySet();
        HashSet term1035 = new HashSet((Collection<? extends Object>) term1342);
        term887 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term902 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term904 = (int[]) newIntArray(2);
        Object term908 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term923 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term926 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term930 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term933 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term960 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term969 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term984 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term987 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term989 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term992 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term1000 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term1001 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term1009 = (int[]) newIntArray(2);
        int[] term1012 = (int[]) newIntArray(2);
        Object[] term1034 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        setIntField(term887, term887.getClass(), "horizontalDisplayed", 2055867847);
        setIntField(term887, term887.getClass(), "verticalDisplayed", -1048298087);
        setIntField(term887, term887.getClass(), "scanLinesPerRow", 292681826);
        setIntField(term887, term887.getClass(), "cursorStartLine", 458147407);
        setBooleanField(term887, term887.getClass(), "cursorEnabled", true);
        setIntField(term887, term887.getClass(), "cursorBlinkRate", -184153539);
        setIntField(term887, term887.getClass(), "cursorStopLine", 493620644);
        setIntField(term887, term887.getClass(), "startAddress", 1328271830);
        setIntField(term887, term887.getClass(), "cursorPosition", 1596070772);
        setIntField(term887, term887.getClass(), "pageSize", 97029295);
        setIntField(term887, term887.getClass(), "currentRegister", -1371869594);
        setBooleanField(term887, term887.getClass(), "rowColumnAddressing", true);
        setBooleanField(term887, term887.getClass(), "displayEnableSkew", false);
        setBooleanField(term887, term887.getClass(), "cursorSkew", true);
        setBooleanField(term902, term902.getClass(), "readOnly", false);
        setIntElement(term904, 0, -2095575670);
        setIntElement(term904, 1, 1225272962);
        setField(term902, term902.getClass(), "mem", term904);
        setIntField(term902, term902.getClass(), "size", -1588772968);
        setIntField(term908, term908.getClass(), "startAddress", -93135961);
        setIntField(term908, term908.getClass(), "endAddress", -112921587);
        setField(term902, term902.getClass(), "memoryRange", term908);
        setField(term902, term902.getClass(), "name", "xxtlPwDYFs");
        setIntField(term923, term923.getClass(), "startAddress", 933028652);
        setIntField(term923, term923.getClass(), "endAddress", 287287233);
        setLongField(term926, term926.getClass(), "clockPeriodInNs", 1000L);
        setField(term926, term926.getClass(), "behavior", enum2);
        setIntField(term930, term930.getClass(), "startAddress", 962840079);
        setIntField(term930, term930.getClass(), "endAddress", 1540719661);
        setField(term930, term930.getClass(), "cpu", null);
        setField(term930, term930.getClass(), "deviceMap", null);
        setField(term930, term930.getClass(), "deviceAddressArray", null);
        setField(term926, term926.getClass(), "bus", term930);
        setIntField(term933, term933.getClass(), "a", 0);
        setIntField(term933, term933.getClass(), "x", 0);
        setIntField(term933, term933.getClass(), "y", 0);
        setIntField(term933, term933.getClass(), "sp", 0);
        setIntField(term933, term933.getClass(), "pc", 0);
        setIntField(term933, term933.getClass(), "ir", 0);
        setIntField(term933, term933.getClass(), "nextIr", 0);
        setField(term933, term933.getClass(), "args", null);
        setField(term933, term933.getClass(), "nextArgs", null);
        setIntField(term933, term933.getClass(), "instSize", 0);
        setBooleanField(term933, term933.getClass(), "opTrap", false);
        setBooleanField(term933, term933.getClass(), "irqAsserted", false);
        setBooleanField(term933, term933.getClass(), "nmiAsserted", false);
        setIntField(term933, term933.getClass(), "lastPc", 0);
        setBooleanField(term933, term933.getClass(), "carryFlag", false);
        setBooleanField(term933, term933.getClass(), "negativeFlag", false);
        setBooleanField(term933, term933.getClass(), "zeroFlag", false);
        setBooleanField(term933, term933.getClass(), "irqDisableFlag", false);
        setBooleanField(term933, term933.getClass(), "decimalModeFlag", false);
        setBooleanField(term933, term933.getClass(), "breakFlag", false);
        setBooleanField(term933, term933.getClass(), "overflowFlag", false);
        setLongField(term933, term933.getClass(), "stepCounter", 0L);
        setField(term926, term926.getClass(), "state", term933);
        setLongField(term926, term926.getClass(), "opBeginTime", -4325723315152823407L);
        setField(term923, term923.getClass(), "cpu", term926);
        setField(term923, term923.getClass(), "deviceMap", term955);
        setField(term923, term923.getClass(), "deviceAddressArray", term960);
        setField(term902, term902.getClass(), "bus", term923);
        setField(term902, term902.getClass(), "deviceChangeListeners", term961);
        setField(term887, term887.getClass(), "memory", term902);
        setIntField(term887, term887.getClass(), "size", 1551099402);
        setIntField(term969, term969.getClass(), "startAddress", -2027534003);
        setIntField(term969, term969.getClass(), "endAddress", 1063420942);
        setField(term887, term887.getClass(), "memoryRange", term969);
        setField(term887, term887.getClass(), "name", "jJCZpVmanW");
        setIntField(term984, term984.getClass(), "startAddress", 1375330971);
        setIntField(term984, term984.getClass(), "endAddress", -478195677);
        setLongField(term987, term987.getClass(), "clockPeriodInNs", 1000L);
        setField(term987, term987.getClass(), "behavior", enum2);
        setIntField(term989, term989.getClass(), "startAddress", 972867650);
        setIntField(term989, term989.getClass(), "endAddress", 1655935355);
        setLongField(term992, term992.getClass(), "clockPeriodInNs", 1000L);
        setField(term992, term992.getClass(), "behavior", enum2);
        setField(term992, term992.getClass(), "bus", null);
        setField(term992, term992.getClass(), "state", null);
        setLongField(term992, term992.getClass(), "opBeginTime", -5476826692763582090L);
        setField(term989, term989.getClass(), "cpu", term992);
        setField(term989, term989.getClass(), "deviceMap", term995);
        setField(term989, term989.getClass(), "deviceAddressArray", term1000);
        setField(term987, term987.getClass(), "bus", term989);
        setIntField(term1001, term1001.getClass(), "a", 0);
        setIntField(term1001, term1001.getClass(), "x", 0);
        setIntField(term1001, term1001.getClass(), "y", 0);
        setIntField(term1001, term1001.getClass(), "sp", 0);
        setIntField(term1001, term1001.getClass(), "pc", 0);
        setIntField(term1001, term1001.getClass(), "ir", 0);
        setIntField(term1001, term1001.getClass(), "nextIr", 0);
        setField(term1001, term1001.getClass(), "args", term1009);
        setField(term1001, term1001.getClass(), "nextArgs", term1012);
        setIntField(term1001, term1001.getClass(), "instSize", 0);
        setBooleanField(term1001, term1001.getClass(), "opTrap", false);
        setBooleanField(term1001, term1001.getClass(), "irqAsserted", false);
        setBooleanField(term1001, term1001.getClass(), "nmiAsserted", false);
        setIntField(term1001, term1001.getClass(), "lastPc", 0);
        setBooleanField(term1001, term1001.getClass(), "carryFlag", false);
        setBooleanField(term1001, term1001.getClass(), "negativeFlag", false);
        setBooleanField(term1001, term1001.getClass(), "zeroFlag", false);
        setBooleanField(term1001, term1001.getClass(), "irqDisableFlag", false);
        setBooleanField(term1001, term1001.getClass(), "decimalModeFlag", false);
        setBooleanField(term1001, term1001.getClass(), "breakFlag", false);
        setBooleanField(term1001, term1001.getClass(), "overflowFlag", false);
        setLongField(term1001, term1001.getClass(), "stepCounter", 0L);
        setField(term987, term987.getClass(), "state", term1001);
        setLongField(term987, term987.getClass(), "opBeginTime", -872011222785455006L);
        setField(term984, term984.getClass(), "cpu", term987);
        setField(term984, term984.getClass(), "deviceMap", term1029);
        setField(term984, term984.getClass(), "deviceAddressArray", term1034);
        setField(term887, term887.getClass(), "bus", term984);
        setField(term887, term887.getClass(), "deviceChangeListeners", term1035);
        term1044 = new Integer(-1547384488);
        term1046 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1044;
        args[1] = term1046;
        callMethod(klass, "read", argTypes, term887, args);
    }

};


