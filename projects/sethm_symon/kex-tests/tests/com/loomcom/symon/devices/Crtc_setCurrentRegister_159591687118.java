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

public class Crtc_setCurrentRegister_159591687118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8183;
     Object term8340;

    public Crtc_setCurrentRegister_159591687118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8355 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term8354 = ((Class) term8355).getDeclaredField((String) "CMOS_6502");
        ((Field) term8354).setAccessible(true);
        Object enum18 = ((Field) term8354).get((Object) null);
        HashMap term8251 = new HashMap();
        HashMap term8258 = new HashMap();
        Set<Object> term8618 =  ((Map) term8258).keySet();
        HashSet term8257 = new HashSet((Collection<? extends Object>) term8618);
        HashMap term8291 = new HashMap();
        HashMap term8325 = new HashMap();
        HashMap term8332 = new HashMap();
        Set<Object> term8633 =  ((Map) term8332).keySet();
        HashSet term8331 = new HashSet((Collection<? extends Object>) term8633);
        term8183 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term8198 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term8200 = (int[]) newIntArray(2);
        Object term8204 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term8219 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term8222 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term8226 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term8229 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term8256 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term8265 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term8280 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term8283 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term8285 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term8288 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term8296 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term8297 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term8305 = (int[]) newIntArray(2);
        int[] term8308 = (int[]) newIntArray(2);
        Object[] term8330 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        setIntField(term8183, term8183.getClass(), "horizontalDisplayed", 1414025609);
        setIntField(term8183, term8183.getClass(), "verticalDisplayed", 255145822);
        setIntField(term8183, term8183.getClass(), "scanLinesPerRow", -573608449);
        setIntField(term8183, term8183.getClass(), "cursorStartLine", -1660057757);
        setBooleanField(term8183, term8183.getClass(), "cursorEnabled", false);
        setIntField(term8183, term8183.getClass(), "cursorBlinkRate", 1816273440);
        setIntField(term8183, term8183.getClass(), "cursorStopLine", -96541009);
        setIntField(term8183, term8183.getClass(), "startAddress", -43719302);
        setIntField(term8183, term8183.getClass(), "cursorPosition", 1024134939);
        setIntField(term8183, term8183.getClass(), "pageSize", 109078154);
        setIntField(term8183, term8183.getClass(), "currentRegister", -314165467);
        setBooleanField(term8183, term8183.getClass(), "rowColumnAddressing", false);
        setBooleanField(term8183, term8183.getClass(), "displayEnableSkew", true);
        setBooleanField(term8183, term8183.getClass(), "cursorSkew", true);
        setBooleanField(term8198, term8198.getClass(), "readOnly", true);
        setIntElement(term8200, 0, 963694071);
        setIntElement(term8200, 1, -995785731);
        setField(term8198, term8198.getClass(), "mem", term8200);
        setIntField(term8198, term8198.getClass(), "size", 2128383340);
        setIntField(term8204, term8204.getClass(), "startAddress", 1238598518);
        setIntField(term8204, term8204.getClass(), "endAddress", -558146961);
        setField(term8198, term8198.getClass(), "memoryRange", term8204);
        setField(term8198, term8198.getClass(), "name", "Ghbwtircqb");
        setIntField(term8219, term8219.getClass(), "startAddress", 1505480070);
        setIntField(term8219, term8219.getClass(), "endAddress", -829088844);
        setLongField(term8222, term8222.getClass(), "clockPeriodInNs", 1000L);
        setField(term8222, term8222.getClass(), "behavior", enum18);
        setIntField(term8226, term8226.getClass(), "startAddress", -31751777);
        setIntField(term8226, term8226.getClass(), "endAddress", -246967963);
        setField(term8226, term8226.getClass(), "cpu", null);
        setField(term8226, term8226.getClass(), "deviceMap", null);
        setField(term8226, term8226.getClass(), "deviceAddressArray", null);
        setField(term8222, term8222.getClass(), "bus", term8226);
        setIntField(term8229, term8229.getClass(), "a", 0);
        setIntField(term8229, term8229.getClass(), "x", 0);
        setIntField(term8229, term8229.getClass(), "y", 0);
        setIntField(term8229, term8229.getClass(), "sp", 0);
        setIntField(term8229, term8229.getClass(), "pc", 0);
        setIntField(term8229, term8229.getClass(), "ir", 0);
        setIntField(term8229, term8229.getClass(), "nextIr", 0);
        setField(term8229, term8229.getClass(), "args", null);
        setField(term8229, term8229.getClass(), "nextArgs", null);
        setIntField(term8229, term8229.getClass(), "instSize", 0);
        setBooleanField(term8229, term8229.getClass(), "opTrap", false);
        setBooleanField(term8229, term8229.getClass(), "irqAsserted", false);
        setBooleanField(term8229, term8229.getClass(), "nmiAsserted", false);
        setIntField(term8229, term8229.getClass(), "lastPc", 0);
        setBooleanField(term8229, term8229.getClass(), "carryFlag", false);
        setBooleanField(term8229, term8229.getClass(), "negativeFlag", false);
        setBooleanField(term8229, term8229.getClass(), "zeroFlag", false);
        setBooleanField(term8229, term8229.getClass(), "irqDisableFlag", false);
        setBooleanField(term8229, term8229.getClass(), "decimalModeFlag", false);
        setBooleanField(term8229, term8229.getClass(), "breakFlag", false);
        setBooleanField(term8229, term8229.getClass(), "overflowFlag", false);
        setLongField(term8229, term8229.getClass(), "stepCounter", 0L);
        setField(term8222, term8222.getClass(), "state", term8229);
        setLongField(term8222, term8222.getClass(), "opBeginTime", -3936701866695933852L);
        setField(term8219, term8219.getClass(), "cpu", term8222);
        setField(term8219, term8219.getClass(), "deviceMap", term8251);
        setField(term8219, term8219.getClass(), "deviceAddressArray", term8256);
        setField(term8198, term8198.getClass(), "bus", term8219);
        setField(term8198, term8198.getClass(), "deviceChangeListeners", term8257);
        setField(term8183, term8183.getClass(), "memory", term8198);
        setIntField(term8183, term8183.getClass(), "size", 872295704);
        setIntField(term8265, term8265.getClass(), "startAddress", 86041387);
        setIntField(term8265, term8265.getClass(), "endAddress", 1010721666);
        setField(term8183, term8183.getClass(), "memoryRange", term8265);
        setField(term8183, term8183.getClass(), "name", "xrwlQZdwCp");
        setIntField(term8280, term8280.getClass(), "startAddress", 27043781);
        setIntField(term8280, term8280.getClass(), "endAddress", -1367122405);
        setLongField(term8283, term8283.getClass(), "clockPeriodInNs", 1000L);
        setField(term8283, term8283.getClass(), "behavior", enum18);
        setIntField(term8285, term8285.getClass(), "startAddress", -1703625118);
        setIntField(term8285, term8285.getClass(), "endAddress", 1104108112);
        setLongField(term8288, term8288.getClass(), "clockPeriodInNs", 1000L);
        setField(term8288, term8288.getClass(), "behavior", enum18);
        setField(term8288, term8288.getClass(), "bus", null);
        setField(term8288, term8288.getClass(), "state", null);
        setLongField(term8288, term8288.getClass(), "opBeginTime", 1597484336218508869L);
        setField(term8285, term8285.getClass(), "cpu", term8288);
        setField(term8285, term8285.getClass(), "deviceMap", term8291);
        setField(term8285, term8285.getClass(), "deviceAddressArray", term8296);
        setField(term8283, term8283.getClass(), "bus", term8285);
        setIntField(term8297, term8297.getClass(), "a", 0);
        setIntField(term8297, term8297.getClass(), "x", 0);
        setIntField(term8297, term8297.getClass(), "y", 0);
        setIntField(term8297, term8297.getClass(), "sp", 0);
        setIntField(term8297, term8297.getClass(), "pc", 0);
        setIntField(term8297, term8297.getClass(), "ir", 0);
        setIntField(term8297, term8297.getClass(), "nextIr", 0);
        setField(term8297, term8297.getClass(), "args", term8305);
        setField(term8297, term8297.getClass(), "nextArgs", term8308);
        setIntField(term8297, term8297.getClass(), "instSize", 0);
        setBooleanField(term8297, term8297.getClass(), "opTrap", false);
        setBooleanField(term8297, term8297.getClass(), "irqAsserted", false);
        setBooleanField(term8297, term8297.getClass(), "nmiAsserted", false);
        setIntField(term8297, term8297.getClass(), "lastPc", 0);
        setBooleanField(term8297, term8297.getClass(), "carryFlag", false);
        setBooleanField(term8297, term8297.getClass(), "negativeFlag", false);
        setBooleanField(term8297, term8297.getClass(), "zeroFlag", false);
        setBooleanField(term8297, term8297.getClass(), "irqDisableFlag", false);
        setBooleanField(term8297, term8297.getClass(), "decimalModeFlag", false);
        setBooleanField(term8297, term8297.getClass(), "breakFlag", false);
        setBooleanField(term8297, term8297.getClass(), "overflowFlag", false);
        setLongField(term8297, term8297.getClass(), "stepCounter", 0L);
        setField(term8283, term8283.getClass(), "state", term8297);
        setLongField(term8283, term8283.getClass(), "opBeginTime", -685023850445639859L);
        setField(term8280, term8280.getClass(), "cpu", term8283);
        setField(term8280, term8280.getClass(), "deviceMap", term8325);
        setField(term8280, term8280.getClass(), "deviceAddressArray", term8330);
        setField(term8183, term8183.getClass(), "bus", term8280);
        setField(term8183, term8183.getClass(), "deviceChangeListeners", term8331);
        term8340 = new Integer(1671229683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8340;
        callMethod(klass, "setCurrentRegister", argTypes, term8183, args);
    }

};


