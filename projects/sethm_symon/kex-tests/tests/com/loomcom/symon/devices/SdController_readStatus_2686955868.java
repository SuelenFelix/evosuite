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

public class SdController_readStatus_2686955868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18552;

    public SdController_readStatus_2686955868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18693 = Class.forName((String) "java.io.File$PathStatus");
        Field term18692 = ((Class) term18693).getDeclaredField((String) "CHECKED");
        ((Field) term18692).setAccessible(true);
        Object enum49 = ((Field) term18692).get((Object) null);
        Class<? extends Object> term18836 = Class.forName((String) "com.loomcom.symon.devices.SdController$Status");
        Field term18835 = ((Class) term18836).getDeclaredField((String) "IDLE");
        ((Field) term18835).setAccessible(true);
        Object enum50 = ((Field) term18835).get((Object) null);
        Class<? extends Object> term19098 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term19097 = ((Class) term19098).getDeclaredField((String) "CMOS_6502");
        ((Field) term19097).setAccessible(true);
        Object enum51 = ((Field) term19097).get((Object) null);
        HashMap term18633 = new HashMap();
        HashMap term18667 = new HashMap();
        HashMap term18674 = new HashMap();
        Set<Object> term19365 =  ((Map) term18674).keySet();
        HashSet term18673 = new HashSet((Collection<? extends Object>) term19365);
        term18552 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        Object term18554 = newInstance(Class.forName("java.io.File"));
        byte[] term18591 = (byte[]) newByteArray(3);
        byte[] term18595 = (byte[]) newByteArray(5);
        Object term18604 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term18619 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term18622 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term18627 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term18630 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term18638 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term18639 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term18647 = (int[]) newIntArray(2);
        int[] term18650 = (int[]) newIntArray(2);
        Object[] term18672 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        setIntField(term18552, term18552.getClass(), "SECTOR_SIZE", 1955560079);
        setField(term18554, term18554.getClass(), "path", "tPlsykYBqO");
        setField(term18554, term18554.getClass(), "status", enum49);
        setIntField(term18554, term18554.getClass(), "prefixLength", -1330529019);
        setField(term18554, term18554.getClass(), "filePath", null);
        setField(term18552, term18552.getClass(), "sdImageFile", term18554);
        setIntField(term18552, term18552.getClass(), "lba0", 237134844);
        setIntField(term18552, term18552.getClass(), "lba1", 2076413861);
        setIntField(term18552, term18552.getClass(), "lba2", 66817373);
        setIntField(term18552, term18552.getClass(), "position", 1459628013);
        setField(term18552, term18552.getClass(), "status", enum50);
        setByteElement(term18591, 0, (byte) -97);
        setByteElement(term18591, 1, (byte) -24);
        setByteElement(term18591, 2, (byte) 88);
        setField(term18552, term18552.getClass(), "readBuffer", term18591);
        setByteElement(term18595, 0, (byte) 96);
        setByteElement(term18595, 1, (byte) 70);
        setByteElement(term18595, 2, (byte) 48);
        setByteElement(term18595, 3, (byte) -46);
        setByteElement(term18595, 4, (byte) -128);
        setField(term18552, term18552.getClass(), "writeBuffer", term18595);
        setIntField(term18552, term18552.getClass(), "readPosition", -1641507499);
        setIntField(term18552, term18552.getClass(), "writePosition", -33436796);
        setIntField(term18552, term18552.getClass(), "size", -1527326823);
        setIntField(term18604, term18604.getClass(), "startAddress", 469871899);
        setIntField(term18604, term18604.getClass(), "endAddress", -1348703436);
        setField(term18552, term18552.getClass(), "memoryRange", term18604);
        setField(term18552, term18552.getClass(), "name", "bLPjGVBhlX");
        setIntField(term18619, term18619.getClass(), "startAddress", -2027012650);
        setIntField(term18619, term18619.getClass(), "endAddress", 1343432022);
        setLongField(term18622, term18622.getClass(), "clockPeriodInNs", 1000L);
        setField(term18622, term18622.getClass(), "behavior", enum51);
        setIntField(term18627, term18627.getClass(), "startAddress", -1767079160);
        setIntField(term18627, term18627.getClass(), "endAddress", -201010601);
        setLongField(term18630, term18630.getClass(), "clockPeriodInNs", 1000L);
        setField(term18630, term18630.getClass(), "behavior", enum51);
        setField(term18630, term18630.getClass(), "bus", null);
        setField(term18630, term18630.getClass(), "state", null);
        setLongField(term18630, term18630.getClass(), "opBeginTime", -1000830646340880796L);
        setField(term18627, term18627.getClass(), "cpu", term18630);
        setField(term18627, term18627.getClass(), "deviceMap", term18633);
        setField(term18627, term18627.getClass(), "deviceAddressArray", term18638);
        setField(term18622, term18622.getClass(), "bus", term18627);
        setIntField(term18639, term18639.getClass(), "a", 0);
        setIntField(term18639, term18639.getClass(), "x", 0);
        setIntField(term18639, term18639.getClass(), "y", 0);
        setIntField(term18639, term18639.getClass(), "sp", 0);
        setIntField(term18639, term18639.getClass(), "pc", 0);
        setIntField(term18639, term18639.getClass(), "ir", 0);
        setIntField(term18639, term18639.getClass(), "nextIr", 0);
        setField(term18639, term18639.getClass(), "args", term18647);
        setField(term18639, term18639.getClass(), "nextArgs", term18650);
        setIntField(term18639, term18639.getClass(), "instSize", 0);
        setBooleanField(term18639, term18639.getClass(), "opTrap", false);
        setBooleanField(term18639, term18639.getClass(), "irqAsserted", false);
        setBooleanField(term18639, term18639.getClass(), "nmiAsserted", false);
        setIntField(term18639, term18639.getClass(), "lastPc", 0);
        setBooleanField(term18639, term18639.getClass(), "carryFlag", false);
        setBooleanField(term18639, term18639.getClass(), "negativeFlag", false);
        setBooleanField(term18639, term18639.getClass(), "zeroFlag", false);
        setBooleanField(term18639, term18639.getClass(), "irqDisableFlag", false);
        setBooleanField(term18639, term18639.getClass(), "decimalModeFlag", false);
        setBooleanField(term18639, term18639.getClass(), "breakFlag", false);
        setBooleanField(term18639, term18639.getClass(), "overflowFlag", false);
        setLongField(term18639, term18639.getClass(), "stepCounter", 0L);
        setField(term18622, term18622.getClass(), "state", term18639);
        setLongField(term18622, term18622.getClass(), "opBeginTime", 5973526439563541711L);
        setField(term18619, term18619.getClass(), "cpu", term18622);
        setField(term18619, term18619.getClass(), "deviceMap", term18667);
        setField(term18619, term18619.getClass(), "deviceAddressArray", term18672);
        setField(term18552, term18552.getClass(), "bus", term18619);
        setField(term18552, term18552.getClass(), "deviceChangeListeners", term18673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "readStatus", argTypes, term18552, args);
    }

};


