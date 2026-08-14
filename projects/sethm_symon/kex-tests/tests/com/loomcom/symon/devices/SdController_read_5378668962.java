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

public class SdController_read_5378668962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13574;
     Object term13708;
     Object term13710;

    public SdController_read_5378668962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13723 = Class.forName((String) "java.io.File$PathStatus");
        Field term13722 = ((Class) term13723).getDeclaredField((String) "INVALID");
        ((Field) term13722).setAccessible(true);
        Object enum31 = ((Field) term13722).get((Object) null);
        Class<? extends Object> term13866 = Class.forName((String) "com.loomcom.symon.devices.SdController$Status");
        Field term13865 = ((Class) term13866).getDeclaredField((String) "WRITE");
        ((Field) term13865).setAccessible(true);
        Object enum32 = ((Field) term13865).get((Object) null);
        Class<? extends Object> term14134 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term14133 = ((Class) term14134).getDeclaredField((String) "CMOS_65816");
        ((Field) term14133).setAccessible(true);
        Object enum33 = ((Field) term14133).get((Object) null);
        HashMap term13659 = new HashMap();
        HashMap term13693 = new HashMap();
        HashMap term13700 = new HashMap();
        Set<Object> term14404 =  ((Map) term13700).keySet();
        HashSet term13699 = new HashSet((Collection<? extends Object>) term14404);
        term13574 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        Object term13576 = newInstance(Class.forName("java.io.File"));
        byte[] term13614 = (byte[]) newByteArray(4);
        byte[] term13619 = (byte[]) newByteArray(7);
        Object term13630 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term13645 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term13648 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term13653 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term13656 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term13664 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term13665 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term13673 = (int[]) newIntArray(2);
        int[] term13676 = (int[]) newIntArray(2);
        Object[] term13698 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        setIntField(term13574, term13574.getClass(), "SECTOR_SIZE", 710986341);
        setField(term13576, term13576.getClass(), "path", "ffYhPOzlUs");
        setField(term13576, term13576.getClass(), "status", enum31);
        setIntField(term13576, term13576.getClass(), "prefixLength", -873958002);
        setField(term13576, term13576.getClass(), "filePath", null);
        setField(term13574, term13574.getClass(), "sdImageFile", term13576);
        setIntField(term13574, term13574.getClass(), "lba0", -1780848958);
        setIntField(term13574, term13574.getClass(), "lba1", 1235045850);
        setIntField(term13574, term13574.getClass(), "lba2", -75143033);
        setIntField(term13574, term13574.getClass(), "position", 797015478);
        setField(term13574, term13574.getClass(), "status", enum32);
        setByteElement(term13614, 0, (byte) 74);
        setByteElement(term13614, 1, (byte) -71);
        setByteElement(term13614, 2, (byte) 49);
        setByteElement(term13614, 3, (byte) -54);
        setField(term13574, term13574.getClass(), "readBuffer", term13614);
        setByteElement(term13619, 0, (byte) 67);
        setByteElement(term13619, 1, (byte) 78);
        setByteElement(term13619, 2, (byte) 87);
        setByteElement(term13619, 3, (byte) 121);
        setByteElement(term13619, 4, (byte) -99);
        setByteElement(term13619, 5, (byte) -2);
        setByteElement(term13619, 6, (byte) -16);
        setField(term13574, term13574.getClass(), "writeBuffer", term13619);
        setIntField(term13574, term13574.getClass(), "readPosition", 717574276);
        setIntField(term13574, term13574.getClass(), "writePosition", 1795369860);
        setIntField(term13574, term13574.getClass(), "size", -570164389);
        setIntField(term13630, term13630.getClass(), "startAddress", 43200329);
        setIntField(term13630, term13630.getClass(), "endAddress", 998679955);
        setField(term13574, term13574.getClass(), "memoryRange", term13630);
        setField(term13574, term13574.getClass(), "name", "MLqYREekMl");
        setIntField(term13645, term13645.getClass(), "startAddress", 953741504);
        setIntField(term13645, term13645.getClass(), "endAddress", 1389452261);
        setLongField(term13648, term13648.getClass(), "clockPeriodInNs", 1000L);
        setField(term13648, term13648.getClass(), "behavior", enum33);
        setIntField(term13653, term13653.getClass(), "startAddress", 1615957955);
        setIntField(term13653, term13653.getClass(), "endAddress", 1779370220);
        setLongField(term13656, term13656.getClass(), "clockPeriodInNs", 1000L);
        setField(term13656, term13656.getClass(), "behavior", enum33);
        setField(term13656, term13656.getClass(), "bus", null);
        setField(term13656, term13656.getClass(), "state", null);
        setLongField(term13656, term13656.getClass(), "opBeginTime", -948292411727204525L);
        setField(term13653, term13653.getClass(), "cpu", term13656);
        setField(term13653, term13653.getClass(), "deviceMap", term13659);
        setField(term13653, term13653.getClass(), "deviceAddressArray", term13664);
        setField(term13648, term13648.getClass(), "bus", term13653);
        setIntField(term13665, term13665.getClass(), "a", 0);
        setIntField(term13665, term13665.getClass(), "x", 0);
        setIntField(term13665, term13665.getClass(), "y", 0);
        setIntField(term13665, term13665.getClass(), "sp", 0);
        setIntField(term13665, term13665.getClass(), "pc", 0);
        setIntField(term13665, term13665.getClass(), "ir", 0);
        setIntField(term13665, term13665.getClass(), "nextIr", 0);
        setField(term13665, term13665.getClass(), "args", term13673);
        setField(term13665, term13665.getClass(), "nextArgs", term13676);
        setIntField(term13665, term13665.getClass(), "instSize", 0);
        setBooleanField(term13665, term13665.getClass(), "opTrap", false);
        setBooleanField(term13665, term13665.getClass(), "irqAsserted", false);
        setBooleanField(term13665, term13665.getClass(), "nmiAsserted", false);
        setIntField(term13665, term13665.getClass(), "lastPc", 0);
        setBooleanField(term13665, term13665.getClass(), "carryFlag", false);
        setBooleanField(term13665, term13665.getClass(), "negativeFlag", false);
        setBooleanField(term13665, term13665.getClass(), "zeroFlag", false);
        setBooleanField(term13665, term13665.getClass(), "irqDisableFlag", false);
        setBooleanField(term13665, term13665.getClass(), "decimalModeFlag", false);
        setBooleanField(term13665, term13665.getClass(), "breakFlag", false);
        setBooleanField(term13665, term13665.getClass(), "overflowFlag", false);
        setLongField(term13665, term13665.getClass(), "stepCounter", 0L);
        setField(term13648, term13648.getClass(), "state", term13665);
        setLongField(term13648, term13648.getClass(), "opBeginTime", -8892586408602479513L);
        setField(term13645, term13645.getClass(), "cpu", term13648);
        setField(term13645, term13645.getClass(), "deviceMap", term13693);
        setField(term13645, term13645.getClass(), "deviceAddressArray", term13698);
        setField(term13574, term13574.getClass(), "bus", term13645);
        setField(term13574, term13574.getClass(), "deviceChangeListeners", term13699);
        term13708 = new Integer(277855691);
        term13710 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term13708;
        args[1] = term13710;
        callMethod(klass, "read", argTypes, term13574, args);
    }

};


