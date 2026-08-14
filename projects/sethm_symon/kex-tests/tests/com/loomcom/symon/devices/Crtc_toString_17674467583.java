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

public class Crtc_toString_17674467583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1343;

    public Crtc_toString_17674467583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1517 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term1516 = ((Class) term1517).getDeclaredField((String) "NMOS_6502");
        ((Field) term1516).setAccessible(true);
        Object enum3 = ((Field) term1516).get((Object) null);
        HashMap term1413 = new HashMap();
        HashMap term1420 = new HashMap();
        Set<Object> term1780 =  ((Map) term1420).keySet();
        HashSet term1419 = new HashSet((Collection<? extends Object>) term1780);
        HashMap term1453 = new HashMap();
        HashMap term1487 = new HashMap();
        HashMap term1494 = new HashMap();
        Set<Object> term1795 =  ((Map) term1494).keySet();
        HashSet term1493 = new HashSet((Collection<? extends Object>) term1795);
        term1343 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term1358 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term1360 = (int[]) newIntArray(4);
        Object term1366 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term1381 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term1384 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term1388 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term1391 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term1418 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term1427 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term1442 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term1445 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term1447 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term1450 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term1458 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term1459 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term1467 = (int[]) newIntArray(2);
        int[] term1470 = (int[]) newIntArray(2);
        Object[] term1492 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        setIntField(term1343, term1343.getClass(), "horizontalDisplayed", 1114000454);
        setIntField(term1343, term1343.getClass(), "verticalDisplayed", -556405712);
        setIntField(term1343, term1343.getClass(), "scanLinesPerRow", -1772434990);
        setIntField(term1343, term1343.getClass(), "cursorStartLine", -1845499264);
        setBooleanField(term1343, term1343.getClass(), "cursorEnabled", false);
        setIntField(term1343, term1343.getClass(), "cursorBlinkRate", -505439934);
        setIntField(term1343, term1343.getClass(), "cursorStopLine", -344842608);
        setIntField(term1343, term1343.getClass(), "startAddress", 941650513);
        setIntField(term1343, term1343.getClass(), "cursorPosition", 444029505);
        setIntField(term1343, term1343.getClass(), "pageSize", -1034506028);
        setIntField(term1343, term1343.getClass(), "currentRegister", -1263114719);
        setBooleanField(term1343, term1343.getClass(), "rowColumnAddressing", true);
        setBooleanField(term1343, term1343.getClass(), "displayEnableSkew", false);
        setBooleanField(term1343, term1343.getClass(), "cursorSkew", false);
        setBooleanField(term1358, term1358.getClass(), "readOnly", true);
        setIntElement(term1360, 0, -894662986);
        setIntElement(term1360, 1, 304775596);
        setIntElement(term1360, 2, -1347665717);
        setIntElement(term1360, 3, -1888585309);
        setField(term1358, term1358.getClass(), "mem", term1360);
        setIntField(term1358, term1358.getClass(), "size", 1596213415);
        setIntField(term1366, term1366.getClass(), "startAddress", -268815336);
        setIntField(term1366, term1366.getClass(), "endAddress", -1210583429);
        setField(term1358, term1358.getClass(), "memoryRange", term1366);
        setField(term1358, term1358.getClass(), "name", "EGtDIRbSSb");
        setIntField(term1381, term1381.getClass(), "startAddress", -663691365);
        setIntField(term1381, term1381.getClass(), "endAddress", 339854490);
        setLongField(term1384, term1384.getClass(), "clockPeriodInNs", 1000L);
        setField(term1384, term1384.getClass(), "behavior", enum3);
        setIntField(term1388, term1388.getClass(), "startAddress", -615654495);
        setIntField(term1388, term1388.getClass(), "endAddress", -1476117762);
        setField(term1388, term1388.getClass(), "cpu", null);
        setField(term1388, term1388.getClass(), "deviceMap", null);
        setField(term1388, term1388.getClass(), "deviceAddressArray", null);
        setField(term1384, term1384.getClass(), "bus", term1388);
        setIntField(term1391, term1391.getClass(), "a", 0);
        setIntField(term1391, term1391.getClass(), "x", 0);
        setIntField(term1391, term1391.getClass(), "y", 0);
        setIntField(term1391, term1391.getClass(), "sp", 0);
        setIntField(term1391, term1391.getClass(), "pc", 0);
        setIntField(term1391, term1391.getClass(), "ir", 0);
        setIntField(term1391, term1391.getClass(), "nextIr", 0);
        setField(term1391, term1391.getClass(), "args", null);
        setField(term1391, term1391.getClass(), "nextArgs", null);
        setIntField(term1391, term1391.getClass(), "instSize", 0);
        setBooleanField(term1391, term1391.getClass(), "opTrap", false);
        setBooleanField(term1391, term1391.getClass(), "irqAsserted", false);
        setBooleanField(term1391, term1391.getClass(), "nmiAsserted", false);
        setIntField(term1391, term1391.getClass(), "lastPc", 0);
        setBooleanField(term1391, term1391.getClass(), "carryFlag", false);
        setBooleanField(term1391, term1391.getClass(), "negativeFlag", false);
        setBooleanField(term1391, term1391.getClass(), "zeroFlag", false);
        setBooleanField(term1391, term1391.getClass(), "irqDisableFlag", false);
        setBooleanField(term1391, term1391.getClass(), "decimalModeFlag", false);
        setBooleanField(term1391, term1391.getClass(), "breakFlag", false);
        setBooleanField(term1391, term1391.getClass(), "overflowFlag", false);
        setLongField(term1391, term1391.getClass(), "stepCounter", 0L);
        setField(term1384, term1384.getClass(), "state", term1391);
        setLongField(term1384, term1384.getClass(), "opBeginTime", -6573104506744284592L);
        setField(term1381, term1381.getClass(), "cpu", term1384);
        setField(term1381, term1381.getClass(), "deviceMap", term1413);
        setField(term1381, term1381.getClass(), "deviceAddressArray", term1418);
        setField(term1358, term1358.getClass(), "bus", term1381);
        setField(term1358, term1358.getClass(), "deviceChangeListeners", term1419);
        setField(term1343, term1343.getClass(), "memory", term1358);
        setIntField(term1343, term1343.getClass(), "size", -1801760683);
        setIntField(term1427, term1427.getClass(), "startAddress", 1141317871);
        setIntField(term1427, term1427.getClass(), "endAddress", 890669485);
        setField(term1343, term1343.getClass(), "memoryRange", term1427);
        setField(term1343, term1343.getClass(), "name", "SzjVpOQTyS");
        setIntField(term1442, term1442.getClass(), "startAddress", 691577392);
        setIntField(term1442, term1442.getClass(), "endAddress", -893623680);
        setLongField(term1445, term1445.getClass(), "clockPeriodInNs", 1000L);
        setField(term1445, term1445.getClass(), "behavior", enum3);
        setIntField(term1447, term1447.getClass(), "startAddress", -1963434938);
        setIntField(term1447, term1447.getClass(), "endAddress", 906181092);
        setLongField(term1450, term1450.getClass(), "clockPeriodInNs", 1000L);
        setField(term1450, term1450.getClass(), "behavior", enum3);
        setField(term1450, term1450.getClass(), "bus", null);
        setField(term1450, term1450.getClass(), "state", null);
        setLongField(term1450, term1450.getClass(), "opBeginTime", 8428634514691209827L);
        setField(term1447, term1447.getClass(), "cpu", term1450);
        setField(term1447, term1447.getClass(), "deviceMap", term1453);
        setField(term1447, term1447.getClass(), "deviceAddressArray", term1458);
        setField(term1445, term1445.getClass(), "bus", term1447);
        setIntField(term1459, term1459.getClass(), "a", 0);
        setIntField(term1459, term1459.getClass(), "x", 0);
        setIntField(term1459, term1459.getClass(), "y", 0);
        setIntField(term1459, term1459.getClass(), "sp", 0);
        setIntField(term1459, term1459.getClass(), "pc", 0);
        setIntField(term1459, term1459.getClass(), "ir", 0);
        setIntField(term1459, term1459.getClass(), "nextIr", 0);
        setField(term1459, term1459.getClass(), "args", term1467);
        setField(term1459, term1459.getClass(), "nextArgs", term1470);
        setIntField(term1459, term1459.getClass(), "instSize", 0);
        setBooleanField(term1459, term1459.getClass(), "opTrap", false);
        setBooleanField(term1459, term1459.getClass(), "irqAsserted", false);
        setBooleanField(term1459, term1459.getClass(), "nmiAsserted", false);
        setIntField(term1459, term1459.getClass(), "lastPc", 0);
        setBooleanField(term1459, term1459.getClass(), "carryFlag", false);
        setBooleanField(term1459, term1459.getClass(), "negativeFlag", false);
        setBooleanField(term1459, term1459.getClass(), "zeroFlag", false);
        setBooleanField(term1459, term1459.getClass(), "irqDisableFlag", false);
        setBooleanField(term1459, term1459.getClass(), "decimalModeFlag", false);
        setBooleanField(term1459, term1459.getClass(), "breakFlag", false);
        setBooleanField(term1459, term1459.getClass(), "overflowFlag", false);
        setLongField(term1459, term1459.getClass(), "stepCounter", 0L);
        setField(term1445, term1445.getClass(), "state", term1459);
        setLongField(term1445, term1445.getClass(), "opBeginTime", -2585684163342970173L);
        setField(term1442, term1442.getClass(), "cpu", term1445);
        setField(term1442, term1442.getClass(), "deviceMap", term1487);
        setField(term1442, term1442.getClass(), "deviceAddressArray", term1492);
        setField(term1343, term1343.getClass(), "bus", term1442);
        setField(term1343, term1343.getClass(), "deviceChangeListeners", term1493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1343, args);
    }

};


