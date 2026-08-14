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

public class Crtc_isCursorEnabled_65129841011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4979;

    public Crtc_isCursorEnabled_65129841011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5153 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term5152 = ((Class) term5153).getDeclaredField((String) "NMOS_6502");
        ((Field) term5152).setAccessible(true);
        Object enum11 = ((Field) term5152).get((Object) null);
        HashMap term5049 = new HashMap();
        HashMap term5056 = new HashMap();
        Set<Object> term5416 =  ((Map) term5056).keySet();
        HashSet term5055 = new HashSet((Collection<? extends Object>) term5416);
        HashMap term5089 = new HashMap();
        HashMap term5123 = new HashMap();
        HashMap term5130 = new HashMap();
        Set<Object> term5431 =  ((Map) term5130).keySet();
        HashSet term5129 = new HashSet((Collection<? extends Object>) term5431);
        term4979 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term4994 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term4996 = (int[]) newIntArray(4);
        Object term5002 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term5017 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term5020 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term5024 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term5027 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term5054 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term5063 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term5078 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term5081 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term5083 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term5086 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term5094 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term5095 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term5103 = (int[]) newIntArray(2);
        int[] term5106 = (int[]) newIntArray(2);
        Object[] term5128 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        setIntField(term4979, term4979.getClass(), "horizontalDisplayed", -1148142995);
        setIntField(term4979, term4979.getClass(), "verticalDisplayed", -233024044);
        setIntField(term4979, term4979.getClass(), "scanLinesPerRow", 1820784228);
        setIntField(term4979, term4979.getClass(), "cursorStartLine", 1390820006);
        setBooleanField(term4979, term4979.getClass(), "cursorEnabled", true);
        setIntField(term4979, term4979.getClass(), "cursorBlinkRate", -828982065);
        setIntField(term4979, term4979.getClass(), "cursorStopLine", 1221443226);
        setIntField(term4979, term4979.getClass(), "startAddress", 908108726);
        setIntField(term4979, term4979.getClass(), "cursorPosition", 1023209512);
        setIntField(term4979, term4979.getClass(), "pageSize", 1084849225);
        setIntField(term4979, term4979.getClass(), "currentRegister", -1702055571);
        setBooleanField(term4979, term4979.getClass(), "rowColumnAddressing", false);
        setBooleanField(term4979, term4979.getClass(), "displayEnableSkew", true);
        setBooleanField(term4979, term4979.getClass(), "cursorSkew", false);
        setBooleanField(term4994, term4994.getClass(), "readOnly", false);
        setIntElement(term4996, 0, -944542900);
        setIntElement(term4996, 1, 2063762142);
        setIntElement(term4996, 2, 1658391716);
        setIntElement(term4996, 3, 2143282300);
        setField(term4994, term4994.getClass(), "mem", term4996);
        setIntField(term4994, term4994.getClass(), "size", 977862393);
        setIntField(term5002, term5002.getClass(), "startAddress", 301401782);
        setIntField(term5002, term5002.getClass(), "endAddress", 1988605357);
        setField(term4994, term4994.getClass(), "memoryRange", term5002);
        setField(term4994, term4994.getClass(), "name", "RkybSrpybU");
        setIntField(term5017, term5017.getClass(), "startAddress", 808203320);
        setIntField(term5017, term5017.getClass(), "endAddress", -544382127);
        setLongField(term5020, term5020.getClass(), "clockPeriodInNs", 1000L);
        setField(term5020, term5020.getClass(), "behavior", enum11);
        setIntField(term5024, term5024.getClass(), "startAddress", -1830198043);
        setIntField(term5024, term5024.getClass(), "endAddress", -439048495);
        setField(term5024, term5024.getClass(), "cpu", null);
        setField(term5024, term5024.getClass(), "deviceMap", null);
        setField(term5024, term5024.getClass(), "deviceAddressArray", null);
        setField(term5020, term5020.getClass(), "bus", term5024);
        setIntField(term5027, term5027.getClass(), "a", 0);
        setIntField(term5027, term5027.getClass(), "x", 0);
        setIntField(term5027, term5027.getClass(), "y", 0);
        setIntField(term5027, term5027.getClass(), "sp", 0);
        setIntField(term5027, term5027.getClass(), "pc", 0);
        setIntField(term5027, term5027.getClass(), "ir", 0);
        setIntField(term5027, term5027.getClass(), "nextIr", 0);
        setField(term5027, term5027.getClass(), "args", null);
        setField(term5027, term5027.getClass(), "nextArgs", null);
        setIntField(term5027, term5027.getClass(), "instSize", 0);
        setBooleanField(term5027, term5027.getClass(), "opTrap", false);
        setBooleanField(term5027, term5027.getClass(), "irqAsserted", false);
        setBooleanField(term5027, term5027.getClass(), "nmiAsserted", false);
        setIntField(term5027, term5027.getClass(), "lastPc", 0);
        setBooleanField(term5027, term5027.getClass(), "carryFlag", false);
        setBooleanField(term5027, term5027.getClass(), "negativeFlag", false);
        setBooleanField(term5027, term5027.getClass(), "zeroFlag", false);
        setBooleanField(term5027, term5027.getClass(), "irqDisableFlag", false);
        setBooleanField(term5027, term5027.getClass(), "decimalModeFlag", false);
        setBooleanField(term5027, term5027.getClass(), "breakFlag", false);
        setBooleanField(term5027, term5027.getClass(), "overflowFlag", false);
        setLongField(term5027, term5027.getClass(), "stepCounter", 0L);
        setField(term5020, term5020.getClass(), "state", term5027);
        setLongField(term5020, term5020.getClass(), "opBeginTime", 414749984815662075L);
        setField(term5017, term5017.getClass(), "cpu", term5020);
        setField(term5017, term5017.getClass(), "deviceMap", term5049);
        setField(term5017, term5017.getClass(), "deviceAddressArray", term5054);
        setField(term4994, term4994.getClass(), "bus", term5017);
        setField(term4994, term4994.getClass(), "deviceChangeListeners", term5055);
        setField(term4979, term4979.getClass(), "memory", term4994);
        setIntField(term4979, term4979.getClass(), "size", 917513193);
        setIntField(term5063, term5063.getClass(), "startAddress", 787278105);
        setIntField(term5063, term5063.getClass(), "endAddress", -2063843486);
        setField(term4979, term4979.getClass(), "memoryRange", term5063);
        setField(term4979, term4979.getClass(), "name", "xOEqzGAmDU");
        setIntField(term5078, term5078.getClass(), "startAddress", 833762980);
        setIntField(term5078, term5078.getClass(), "endAddress", 320711637);
        setLongField(term5081, term5081.getClass(), "clockPeriodInNs", 1000L);
        setField(term5081, term5081.getClass(), "behavior", enum11);
        setIntField(term5083, term5083.getClass(), "startAddress", 1241164745);
        setIntField(term5083, term5083.getClass(), "endAddress", 1723148410);
        setLongField(term5086, term5086.getClass(), "clockPeriodInNs", 1000L);
        setField(term5086, term5086.getClass(), "behavior", enum11);
        setField(term5086, term5086.getClass(), "bus", null);
        setField(term5086, term5086.getClass(), "state", null);
        setLongField(term5086, term5086.getClass(), "opBeginTime", 305759998609888272L);
        setField(term5083, term5083.getClass(), "cpu", term5086);
        setField(term5083, term5083.getClass(), "deviceMap", term5089);
        setField(term5083, term5083.getClass(), "deviceAddressArray", term5094);
        setField(term5081, term5081.getClass(), "bus", term5083);
        setIntField(term5095, term5095.getClass(), "a", 0);
        setIntField(term5095, term5095.getClass(), "x", 0);
        setIntField(term5095, term5095.getClass(), "y", 0);
        setIntField(term5095, term5095.getClass(), "sp", 0);
        setIntField(term5095, term5095.getClass(), "pc", 0);
        setIntField(term5095, term5095.getClass(), "ir", 0);
        setIntField(term5095, term5095.getClass(), "nextIr", 0);
        setField(term5095, term5095.getClass(), "args", term5103);
        setField(term5095, term5095.getClass(), "nextArgs", term5106);
        setIntField(term5095, term5095.getClass(), "instSize", 0);
        setBooleanField(term5095, term5095.getClass(), "opTrap", false);
        setBooleanField(term5095, term5095.getClass(), "irqAsserted", false);
        setBooleanField(term5095, term5095.getClass(), "nmiAsserted", false);
        setIntField(term5095, term5095.getClass(), "lastPc", 0);
        setBooleanField(term5095, term5095.getClass(), "carryFlag", false);
        setBooleanField(term5095, term5095.getClass(), "negativeFlag", false);
        setBooleanField(term5095, term5095.getClass(), "zeroFlag", false);
        setBooleanField(term5095, term5095.getClass(), "irqDisableFlag", false);
        setBooleanField(term5095, term5095.getClass(), "decimalModeFlag", false);
        setBooleanField(term5095, term5095.getClass(), "breakFlag", false);
        setBooleanField(term5095, term5095.getClass(), "overflowFlag", false);
        setLongField(term5095, term5095.getClass(), "stepCounter", 0L);
        setField(term5081, term5081.getClass(), "state", term5095);
        setLongField(term5081, term5081.getClass(), "opBeginTime", -8654565919063661957L);
        setField(term5078, term5078.getClass(), "cpu", term5081);
        setField(term5078, term5078.getClass(), "deviceMap", term5123);
        setField(term5078, term5078.getClass(), "deviceAddressArray", term5128);
        setField(term4979, term4979.getClass(), "bus", term5078);
        setField(term4979, term4979.getClass(), "deviceChangeListeners", term5129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isCursorEnabled", argTypes, term4979, args);
    }

};


