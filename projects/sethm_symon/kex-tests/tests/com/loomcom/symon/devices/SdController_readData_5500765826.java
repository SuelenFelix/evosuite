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

public class SdController_readData_5500765826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16913;

    public SdController_readData_5500765826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17051 = Class.forName((String) "java.io.File$PathStatus");
        Field term17050 = ((Class) term17051).getDeclaredField((String) "CHECKED");
        ((Field) term17050).setAccessible(true);
        Object enum43 = ((Field) term17050).get((Object) null);
        Class<? extends Object> term17194 = Class.forName((String) "com.loomcom.symon.devices.SdController$Status");
        Field term17193 = ((Class) term17194).getDeclaredField((String) "READ");
        ((Field) term17193).setAccessible(true);
        Object enum44 = ((Field) term17193).get((Object) null);
        Class<? extends Object> term17453 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term17452 = ((Class) term17453).getDeclaredField((String) "NMOS_6502");
        ((Field) term17452).setAccessible(true);
        Object enum45 = ((Field) term17452).get((Object) null);
        HashMap term16991 = new HashMap();
        HashMap term17025 = new HashMap();
        HashMap term17032 = new HashMap();
        Set<Object> term17720 =  ((Map) term17032).keySet();
        HashSet term17031 = new HashSet((Collection<? extends Object>) term17720);
        term16913 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        Object term16915 = newInstance(Class.forName("java.io.File"));
        byte[] term16952 = (byte[]) newByteArray(5);
        byte[] term16958 = (byte[]) newByteArray(0);
        Object term16962 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term16977 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term16980 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term16985 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term16988 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term16996 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term16997 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term17005 = (int[]) newIntArray(2);
        int[] term17008 = (int[]) newIntArray(2);
        Object[] term17030 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        setIntField(term16913, term16913.getClass(), "SECTOR_SIZE", -1130401612);
        setField(term16915, term16915.getClass(), "path", "fhkbdRViHi");
        setField(term16915, term16915.getClass(), "status", enum43);
        setIntField(term16915, term16915.getClass(), "prefixLength", -316771104);
        setField(term16915, term16915.getClass(), "filePath", null);
        setField(term16913, term16913.getClass(), "sdImageFile", term16915);
        setIntField(term16913, term16913.getClass(), "lba0", -1374527319);
        setIntField(term16913, term16913.getClass(), "lba1", -1735276919);
        setIntField(term16913, term16913.getClass(), "lba2", -712023865);
        setIntField(term16913, term16913.getClass(), "position", 613256157);
        setField(term16913, term16913.getClass(), "status", enum44);
        setByteElement(term16952, 0, (byte) -89);
        setByteElement(term16952, 1, (byte) 13);
        setByteElement(term16952, 2, (byte) 44);
        setByteElement(term16952, 3, (byte) -63);
        setByteElement(term16952, 4, (byte) 15);
        setField(term16913, term16913.getClass(), "readBuffer", term16952);
        setField(term16913, term16913.getClass(), "writeBuffer", term16958);
        setIntField(term16913, term16913.getClass(), "readPosition", 454242689);
        setIntField(term16913, term16913.getClass(), "writePosition", 1798354517);
        setIntField(term16913, term16913.getClass(), "size", -1495693617);
        setIntField(term16962, term16962.getClass(), "startAddress", -890538258);
        setIntField(term16962, term16962.getClass(), "endAddress", -1085899912);
        setField(term16913, term16913.getClass(), "memoryRange", term16962);
        setField(term16913, term16913.getClass(), "name", "uWHnvSvaPl");
        setIntField(term16977, term16977.getClass(), "startAddress", -1458980236);
        setIntField(term16977, term16977.getClass(), "endAddress", 890505372);
        setLongField(term16980, term16980.getClass(), "clockPeriodInNs", 1000L);
        setField(term16980, term16980.getClass(), "behavior", enum45);
        setIntField(term16985, term16985.getClass(), "startAddress", 2044137055);
        setIntField(term16985, term16985.getClass(), "endAddress", -1452324619);
        setLongField(term16988, term16988.getClass(), "clockPeriodInNs", 1000L);
        setField(term16988, term16988.getClass(), "behavior", enum45);
        setField(term16988, term16988.getClass(), "bus", null);
        setField(term16988, term16988.getClass(), "state", null);
        setLongField(term16988, term16988.getClass(), "opBeginTime", -4030863184426321096L);
        setField(term16985, term16985.getClass(), "cpu", term16988);
        setField(term16985, term16985.getClass(), "deviceMap", term16991);
        setField(term16985, term16985.getClass(), "deviceAddressArray", term16996);
        setField(term16980, term16980.getClass(), "bus", term16985);
        setIntField(term16997, term16997.getClass(), "a", 0);
        setIntField(term16997, term16997.getClass(), "x", 0);
        setIntField(term16997, term16997.getClass(), "y", 0);
        setIntField(term16997, term16997.getClass(), "sp", 0);
        setIntField(term16997, term16997.getClass(), "pc", 0);
        setIntField(term16997, term16997.getClass(), "ir", 0);
        setIntField(term16997, term16997.getClass(), "nextIr", 0);
        setField(term16997, term16997.getClass(), "args", term17005);
        setField(term16997, term16997.getClass(), "nextArgs", term17008);
        setIntField(term16997, term16997.getClass(), "instSize", 0);
        setBooleanField(term16997, term16997.getClass(), "opTrap", false);
        setBooleanField(term16997, term16997.getClass(), "irqAsserted", false);
        setBooleanField(term16997, term16997.getClass(), "nmiAsserted", false);
        setIntField(term16997, term16997.getClass(), "lastPc", 0);
        setBooleanField(term16997, term16997.getClass(), "carryFlag", false);
        setBooleanField(term16997, term16997.getClass(), "negativeFlag", false);
        setBooleanField(term16997, term16997.getClass(), "zeroFlag", false);
        setBooleanField(term16997, term16997.getClass(), "irqDisableFlag", false);
        setBooleanField(term16997, term16997.getClass(), "decimalModeFlag", false);
        setBooleanField(term16997, term16997.getClass(), "breakFlag", false);
        setBooleanField(term16997, term16997.getClass(), "overflowFlag", false);
        setLongField(term16997, term16997.getClass(), "stepCounter", 0L);
        setField(term16980, term16980.getClass(), "state", term16997);
        setLongField(term16980, term16980.getClass(), "opBeginTime", -8010214112439224349L);
        setField(term16977, term16977.getClass(), "cpu", term16980);
        setField(term16977, term16977.getClass(), "deviceMap", term17025);
        setField(term16977, term16977.getClass(), "deviceAddressArray", term17030);
        setField(term16913, term16913.getClass(), "bus", term16977);
        setField(term16913, term16913.getClass(), "deviceChangeListeners", term17031);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readData", argTypes, term16913, args);
    }

};


