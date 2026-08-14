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

public class SdController_prepareRead_15665752114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15239;

    public SdController_prepareRead_15665752114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15387 = Class.forName((String) "java.io.File$PathStatus");
        Field term15386 = ((Class) term15387).getDeclaredField((String) "INVALID");
        ((Field) term15386).setAccessible(true);
        Object enum37 = ((Field) term15386).get((Object) null);
        Class<? extends Object> term15530 = Class.forName((String) "com.loomcom.symon.devices.SdController$Status");
        Field term15529 = ((Class) term15530).getDeclaredField((String) "WRITE");
        ((Field) term15529).setAccessible(true);
        Object enum38 = ((Field) term15529).get((Object) null);
        Class<? extends Object> term15801 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term15800 = ((Class) term15801).getDeclaredField((String) "NMOS_6502");
        ((Field) term15800).setAccessible(true);
        Object enum39 = ((Field) term15800).get((Object) null);
        HashMap term15327 = new HashMap();
        HashMap term15361 = new HashMap();
        HashMap term15368 = new HashMap();
        Set<Object> term16068 =  ((Map) term15368).keySet();
        HashSet term15367 = new HashSet((Collection<? extends Object>) term16068);
        term15239 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        Object term15241 = newInstance(Class.forName("java.io.File"));
        byte[] term15279 = (byte[]) newByteArray(6);
        byte[] term15286 = (byte[]) newByteArray(8);
        Object term15298 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term15313 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term15316 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term15321 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term15324 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term15332 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term15333 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term15341 = (int[]) newIntArray(2);
        int[] term15344 = (int[]) newIntArray(2);
        Object[] term15366 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        setIntField(term15239, term15239.getClass(), "SECTOR_SIZE", -511248284);
        setField(term15241, term15241.getClass(), "path", "ieCtQFdkii");
        setField(term15241, term15241.getClass(), "status", enum37);
        setIntField(term15241, term15241.getClass(), "prefixLength", 788630042);
        setField(term15241, term15241.getClass(), "filePath", null);
        setField(term15239, term15239.getClass(), "sdImageFile", term15241);
        setIntField(term15239, term15239.getClass(), "lba0", 1430066560);
        setIntField(term15239, term15239.getClass(), "lba1", 836734074);
        setIntField(term15239, term15239.getClass(), "lba2", -1747711865);
        setIntField(term15239, term15239.getClass(), "position", 682812715);
        setField(term15239, term15239.getClass(), "status", enum38);
        setByteElement(term15279, 0, (byte) -12);
        setByteElement(term15279, 1, (byte) -61);
        setByteElement(term15279, 2, (byte) -85);
        setByteElement(term15279, 3, (byte) -22);
        setByteElement(term15279, 4, (byte) 93);
        setByteElement(term15279, 5, (byte) 69);
        setField(term15239, term15239.getClass(), "readBuffer", term15279);
        setByteElement(term15286, 0, (byte) -74);
        setByteElement(term15286, 1, (byte) -123);
        setByteElement(term15286, 2, (byte) -23);
        setByteElement(term15286, 3, (byte) 100);
        setByteElement(term15286, 4, (byte) 106);
        setByteElement(term15286, 5, (byte) -57);
        setByteElement(term15286, 6, (byte) -103);
        setByteElement(term15286, 7, (byte) 98);
        setField(term15239, term15239.getClass(), "writeBuffer", term15286);
        setIntField(term15239, term15239.getClass(), "readPosition", -1092883950);
        setIntField(term15239, term15239.getClass(), "writePosition", 950385621);
        setIntField(term15239, term15239.getClass(), "size", -232352320);
        setIntField(term15298, term15298.getClass(), "startAddress", -232333014);
        setIntField(term15298, term15298.getClass(), "endAddress", -139694079);
        setField(term15239, term15239.getClass(), "memoryRange", term15298);
        setField(term15239, term15239.getClass(), "name", "dEnhdmILtU");
        setIntField(term15313, term15313.getClass(), "startAddress", -1602072035);
        setIntField(term15313, term15313.getClass(), "endAddress", 1902624392);
        setLongField(term15316, term15316.getClass(), "clockPeriodInNs", 1000L);
        setField(term15316, term15316.getClass(), "behavior", enum39);
        setIntField(term15321, term15321.getClass(), "startAddress", 904607217);
        setIntField(term15321, term15321.getClass(), "endAddress", 434914590);
        setLongField(term15324, term15324.getClass(), "clockPeriodInNs", 1000L);
        setField(term15324, term15324.getClass(), "behavior", enum39);
        setField(term15324, term15324.getClass(), "bus", null);
        setField(term15324, term15324.getClass(), "state", null);
        setLongField(term15324, term15324.getClass(), "opBeginTime", -5724112525188606013L);
        setField(term15321, term15321.getClass(), "cpu", term15324);
        setField(term15321, term15321.getClass(), "deviceMap", term15327);
        setField(term15321, term15321.getClass(), "deviceAddressArray", term15332);
        setField(term15316, term15316.getClass(), "bus", term15321);
        setIntField(term15333, term15333.getClass(), "a", 0);
        setIntField(term15333, term15333.getClass(), "x", 0);
        setIntField(term15333, term15333.getClass(), "y", 0);
        setIntField(term15333, term15333.getClass(), "sp", 0);
        setIntField(term15333, term15333.getClass(), "pc", 0);
        setIntField(term15333, term15333.getClass(), "ir", 0);
        setIntField(term15333, term15333.getClass(), "nextIr", 0);
        setField(term15333, term15333.getClass(), "args", term15341);
        setField(term15333, term15333.getClass(), "nextArgs", term15344);
        setIntField(term15333, term15333.getClass(), "instSize", 0);
        setBooleanField(term15333, term15333.getClass(), "opTrap", false);
        setBooleanField(term15333, term15333.getClass(), "irqAsserted", false);
        setBooleanField(term15333, term15333.getClass(), "nmiAsserted", false);
        setIntField(term15333, term15333.getClass(), "lastPc", 0);
        setBooleanField(term15333, term15333.getClass(), "carryFlag", false);
        setBooleanField(term15333, term15333.getClass(), "negativeFlag", false);
        setBooleanField(term15333, term15333.getClass(), "zeroFlag", false);
        setBooleanField(term15333, term15333.getClass(), "irqDisableFlag", false);
        setBooleanField(term15333, term15333.getClass(), "decimalModeFlag", false);
        setBooleanField(term15333, term15333.getClass(), "breakFlag", false);
        setBooleanField(term15333, term15333.getClass(), "overflowFlag", false);
        setLongField(term15333, term15333.getClass(), "stepCounter", 0L);
        setField(term15316, term15316.getClass(), "state", term15333);
        setLongField(term15316, term15316.getClass(), "opBeginTime", -6100012593724108983L);
        setField(term15313, term15313.getClass(), "cpu", term15316);
        setField(term15313, term15313.getClass(), "deviceMap", term15361);
        setField(term15313, term15313.getClass(), "deviceAddressArray", term15366);
        setField(term15239, term15239.getClass(), "bus", term15313);
        setField(term15239, term15239.getClass(), "deviceChangeListeners", term15367);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prepareRead", argTypes, term15239, args);
    }

};


