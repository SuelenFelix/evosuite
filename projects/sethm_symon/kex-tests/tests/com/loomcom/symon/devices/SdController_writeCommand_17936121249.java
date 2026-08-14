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

public class SdController_writeCommand_17936121249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19366;
     Object term19498;

    public SdController_writeCommand_17936121249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19511 = Class.forName((String) "java.io.File$PathStatus");
        Field term19510 = ((Class) term19511).getDeclaredField((String) "INVALID");
        ((Field) term19510).setAccessible(true);
        Object enum52 = ((Field) term19510).get((Object) null);
        Class<? extends Object> term19654 = Class.forName((String) "com.loomcom.symon.devices.SdController$Status");
        Field term19653 = ((Class) term19654).getDeclaredField((String) "IDLE");
        ((Field) term19653).setAccessible(true);
        Object enum53 = ((Field) term19653).get((Object) null);
        Class<? extends Object> term19921 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term19920 = ((Class) term19921).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term19920).setAccessible(true);
        Object enum54 = ((Field) term19920).get((Object) null);
        HashMap term19452 = new HashMap();
        HashMap term19486 = new HashMap();
        HashMap term19493 = new HashMap();
        Set<Object> term20212 =  ((Map) term19493).keySet();
        HashSet term19492 = new HashSet((Collection<? extends Object>) term20212);
        term19366 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        Object term19368 = newInstance(Class.forName("java.io.File"));
        byte[] term19405 = (byte[]) newByteArray(9);
        byte[] term19415 = (byte[]) newByteArray(4);
        Object term19423 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term19438 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term19441 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term19446 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term19449 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term19457 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term19458 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term19466 = (int[]) newIntArray(2);
        int[] term19469 = (int[]) newIntArray(2);
        Object[] term19491 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        setIntField(term19366, term19366.getClass(), "SECTOR_SIZE", -1042470635);
        setField(term19368, term19368.getClass(), "path", "whBvTVIIlC");
        setField(term19368, term19368.getClass(), "status", enum52);
        setIntField(term19368, term19368.getClass(), "prefixLength", -524352937);
        setField(term19368, term19368.getClass(), "filePath", null);
        setField(term19366, term19366.getClass(), "sdImageFile", term19368);
        setIntField(term19366, term19366.getClass(), "lba0", 1472218987);
        setIntField(term19366, term19366.getClass(), "lba1", 805176809);
        setIntField(term19366, term19366.getClass(), "lba2", -82632953);
        setIntField(term19366, term19366.getClass(), "position", -1473876284);
        setField(term19366, term19366.getClass(), "status", enum53);
        setByteElement(term19405, 0, (byte) 66);
        setByteElement(term19405, 1, (byte) -112);
        setByteElement(term19405, 2, (byte) 81);
        setByteElement(term19405, 3, (byte) 65);
        setByteElement(term19405, 4, (byte) -44);
        setByteElement(term19405, 5, (byte) 33);
        setByteElement(term19405, 6, (byte) -74);
        setByteElement(term19405, 7, (byte) -84);
        setByteElement(term19405, 8, (byte) -53);
        setField(term19366, term19366.getClass(), "readBuffer", term19405);
        setByteElement(term19415, 0, (byte) -93);
        setByteElement(term19415, 1, (byte) 82);
        setByteElement(term19415, 2, (byte) -89);
        setByteElement(term19415, 3, (byte) 24);
        setField(term19366, term19366.getClass(), "writeBuffer", term19415);
        setIntField(term19366, term19366.getClass(), "readPosition", -1389314671);
        setIntField(term19366, term19366.getClass(), "writePosition", -499699841);
        setIntField(term19366, term19366.getClass(), "size", 360972386);
        setIntField(term19423, term19423.getClass(), "startAddress", -2063884849);
        setIntField(term19423, term19423.getClass(), "endAddress", 1054887169);
        setField(term19366, term19366.getClass(), "memoryRange", term19423);
        setField(term19366, term19366.getClass(), "name", "IgRJUzaCwW");
        setIntField(term19438, term19438.getClass(), "startAddress", 692873905);
        setIntField(term19438, term19438.getClass(), "endAddress", 1734759369);
        setLongField(term19441, term19441.getClass(), "clockPeriodInNs", 1000L);
        setField(term19441, term19441.getClass(), "behavior", enum54);
        setIntField(term19446, term19446.getClass(), "startAddress", 1841493736);
        setIntField(term19446, term19446.getClass(), "endAddress", 320739944);
        setLongField(term19449, term19449.getClass(), "clockPeriodInNs", 1000L);
        setField(term19449, term19449.getClass(), "behavior", enum54);
        setField(term19449, term19449.getClass(), "bus", null);
        setField(term19449, term19449.getClass(), "state", null);
        setLongField(term19449, term19449.getClass(), "opBeginTime", -7310273014364148916L);
        setField(term19446, term19446.getClass(), "cpu", term19449);
        setField(term19446, term19446.getClass(), "deviceMap", term19452);
        setField(term19446, term19446.getClass(), "deviceAddressArray", term19457);
        setField(term19441, term19441.getClass(), "bus", term19446);
        setIntField(term19458, term19458.getClass(), "a", 0);
        setIntField(term19458, term19458.getClass(), "x", 0);
        setIntField(term19458, term19458.getClass(), "y", 0);
        setIntField(term19458, term19458.getClass(), "sp", 0);
        setIntField(term19458, term19458.getClass(), "pc", 0);
        setIntField(term19458, term19458.getClass(), "ir", 0);
        setIntField(term19458, term19458.getClass(), "nextIr", 0);
        setField(term19458, term19458.getClass(), "args", term19466);
        setField(term19458, term19458.getClass(), "nextArgs", term19469);
        setIntField(term19458, term19458.getClass(), "instSize", 0);
        setBooleanField(term19458, term19458.getClass(), "opTrap", false);
        setBooleanField(term19458, term19458.getClass(), "irqAsserted", false);
        setBooleanField(term19458, term19458.getClass(), "nmiAsserted", false);
        setIntField(term19458, term19458.getClass(), "lastPc", 0);
        setBooleanField(term19458, term19458.getClass(), "carryFlag", false);
        setBooleanField(term19458, term19458.getClass(), "negativeFlag", false);
        setBooleanField(term19458, term19458.getClass(), "zeroFlag", false);
        setBooleanField(term19458, term19458.getClass(), "irqDisableFlag", false);
        setBooleanField(term19458, term19458.getClass(), "decimalModeFlag", false);
        setBooleanField(term19458, term19458.getClass(), "breakFlag", false);
        setBooleanField(term19458, term19458.getClass(), "overflowFlag", false);
        setLongField(term19458, term19458.getClass(), "stepCounter", 0L);
        setField(term19441, term19441.getClass(), "state", term19458);
        setLongField(term19441, term19441.getClass(), "opBeginTime", 8863790908271299748L);
        setField(term19438, term19438.getClass(), "cpu", term19441);
        setField(term19438, term19438.getClass(), "deviceMap", term19486);
        setField(term19438, term19438.getClass(), "deviceAddressArray", term19491);
        setField(term19366, term19366.getClass(), "bus", term19438);
        setField(term19366, term19366.getClass(), "deviceChangeListeners", term19492);
        term19498 = new Integer(847207929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term19498;
        callMethod(klass, "writeCommand", argTypes, term19366, args);
    }

};


