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

public class SdController_computePosition_8223879503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14405;

    public SdController_computePosition_8223879503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14556 = Class.forName((String) "java.io.File$PathStatus");
        Field term14555 = ((Class) term14556).getDeclaredField((String) "INVALID");
        ((Field) term14555).setAccessible(true);
        Object enum34 = ((Field) term14555).get((Object) null);
        Class<? extends Object> term14699 = Class.forName((String) "com.loomcom.symon.devices.SdController$Status");
        Field term14698 = ((Class) term14699).getDeclaredField((String) "READ");
        ((Field) term14698).setAccessible(true);
        Object enum35 = ((Field) term14698).get((Object) null);
        Class<? extends Object> term14971 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term14970 = ((Class) term14971).getDeclaredField((String) "NMOS_6502");
        ((Field) term14970).setAccessible(true);
        Object enum36 = ((Field) term14970).get((Object) null);
        HashMap term14496 = new HashMap();
        HashMap term14530 = new HashMap();
        HashMap term14537 = new HashMap();
        Set<Object> term15238 =  ((Map) term14537).keySet();
        HashSet term14536 = new HashSet((Collection<? extends Object>) term15238);
        term14405 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        Object term14407 = newInstance(Class.forName("java.io.File"));
        byte[] term14444 = (byte[]) newByteArray(9);
        byte[] term14454 = (byte[]) newByteArray(9);
        Object term14467 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term14482 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term14485 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term14490 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term14493 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term14501 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term14502 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term14510 = (int[]) newIntArray(2);
        int[] term14513 = (int[]) newIntArray(2);
        Object[] term14535 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        setIntField(term14405, term14405.getClass(), "SECTOR_SIZE", 675891483);
        setField(term14407, term14407.getClass(), "path", "ytSBIKXogI");
        setField(term14407, term14407.getClass(), "status", enum34);
        setIntField(term14407, term14407.getClass(), "prefixLength", -317900470);
        setField(term14407, term14407.getClass(), "filePath", null);
        setField(term14405, term14405.getClass(), "sdImageFile", term14407);
        setIntField(term14405, term14405.getClass(), "lba0", -979568);
        setIntField(term14405, term14405.getClass(), "lba1", -1422131197);
        setIntField(term14405, term14405.getClass(), "lba2", -20399281);
        setIntField(term14405, term14405.getClass(), "position", -830170410);
        setField(term14405, term14405.getClass(), "status", enum35);
        setByteElement(term14444, 0, (byte) -112);
        setByteElement(term14444, 1, (byte) -111);
        setByteElement(term14444, 2, (byte) 23);
        setByteElement(term14444, 3, (byte) -15);
        setByteElement(term14444, 4, (byte) 36);
        setByteElement(term14444, 5, (byte) 118);
        setByteElement(term14444, 6, (byte) 106);
        setByteElement(term14444, 7, (byte) 98);
        setByteElement(term14444, 8, (byte) 67);
        setField(term14405, term14405.getClass(), "readBuffer", term14444);
        setByteElement(term14454, 0, (byte) 66);
        setByteElement(term14454, 1, (byte) -121);
        setByteElement(term14454, 2, (byte) -119);
        setByteElement(term14454, 3, (byte) 71);
        setByteElement(term14454, 4, (byte) 80);
        setByteElement(term14454, 5, (byte) 42);
        setByteElement(term14454, 6, (byte) 72);
        setByteElement(term14454, 7, (byte) 111);
        setByteElement(term14454, 8, (byte) 99);
        setField(term14405, term14405.getClass(), "writeBuffer", term14454);
        setIntField(term14405, term14405.getClass(), "readPosition", -1742790308);
        setIntField(term14405, term14405.getClass(), "writePosition", -1592093430);
        setIntField(term14405, term14405.getClass(), "size", 1178214545);
        setIntField(term14467, term14467.getClass(), "startAddress", -985334541);
        setIntField(term14467, term14467.getClass(), "endAddress", -1870004228);
        setField(term14405, term14405.getClass(), "memoryRange", term14467);
        setField(term14405, term14405.getClass(), "name", "nHXjMycHlU");
        setIntField(term14482, term14482.getClass(), "startAddress", 380484139);
        setIntField(term14482, term14482.getClass(), "endAddress", 1822317628);
        setLongField(term14485, term14485.getClass(), "clockPeriodInNs", 1000L);
        setField(term14485, term14485.getClass(), "behavior", enum36);
        setIntField(term14490, term14490.getClass(), "startAddress", -608830309);
        setIntField(term14490, term14490.getClass(), "endAddress", -537786484);
        setLongField(term14493, term14493.getClass(), "clockPeriodInNs", 1000L);
        setField(term14493, term14493.getClass(), "behavior", enum36);
        setField(term14493, term14493.getClass(), "bus", null);
        setField(term14493, term14493.getClass(), "state", null);
        setLongField(term14493, term14493.getClass(), "opBeginTime", 4502292577098212311L);
        setField(term14490, term14490.getClass(), "cpu", term14493);
        setField(term14490, term14490.getClass(), "deviceMap", term14496);
        setField(term14490, term14490.getClass(), "deviceAddressArray", term14501);
        setField(term14485, term14485.getClass(), "bus", term14490);
        setIntField(term14502, term14502.getClass(), "a", 0);
        setIntField(term14502, term14502.getClass(), "x", 0);
        setIntField(term14502, term14502.getClass(), "y", 0);
        setIntField(term14502, term14502.getClass(), "sp", 0);
        setIntField(term14502, term14502.getClass(), "pc", 0);
        setIntField(term14502, term14502.getClass(), "ir", 0);
        setIntField(term14502, term14502.getClass(), "nextIr", 0);
        setField(term14502, term14502.getClass(), "args", term14510);
        setField(term14502, term14502.getClass(), "nextArgs", term14513);
        setIntField(term14502, term14502.getClass(), "instSize", 0);
        setBooleanField(term14502, term14502.getClass(), "opTrap", false);
        setBooleanField(term14502, term14502.getClass(), "irqAsserted", false);
        setBooleanField(term14502, term14502.getClass(), "nmiAsserted", false);
        setIntField(term14502, term14502.getClass(), "lastPc", 0);
        setBooleanField(term14502, term14502.getClass(), "carryFlag", false);
        setBooleanField(term14502, term14502.getClass(), "negativeFlag", false);
        setBooleanField(term14502, term14502.getClass(), "zeroFlag", false);
        setBooleanField(term14502, term14502.getClass(), "irqDisableFlag", false);
        setBooleanField(term14502, term14502.getClass(), "decimalModeFlag", false);
        setBooleanField(term14502, term14502.getClass(), "breakFlag", false);
        setBooleanField(term14502, term14502.getClass(), "overflowFlag", false);
        setLongField(term14502, term14502.getClass(), "stepCounter", 0L);
        setField(term14485, term14485.getClass(), "state", term14502);
        setLongField(term14485, term14485.getClass(), "opBeginTime", -3730936709704460408L);
        setField(term14482, term14482.getClass(), "cpu", term14485);
        setField(term14482, term14482.getClass(), "deviceMap", term14530);
        setField(term14482, term14482.getClass(), "deviceAddressArray", term14535);
        setField(term14405, term14405.getClass(), "bus", term14482);
        setField(term14405, term14405.getClass(), "deviceChangeListeners", term14536);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computePosition", argTypes, term14405, args);
    }

};


