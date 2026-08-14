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

public class SdController_prepareWrite_15885989065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16069;

    public SdController_prepareWrite_15885989065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16213 = Class.forName((String) "java.io.File$PathStatus");
        Field term16212 = ((Class) term16213).getDeclaredField((String) "CHECKED");
        ((Field) term16212).setAccessible(true);
        Object enum40 = ((Field) term16212).get((Object) null);
        Class<? extends Object> term16356 = Class.forName((String) "com.loomcom.symon.devices.SdController$Status");
        Field term16355 = ((Class) term16356).getDeclaredField((String) "IDLE");
        ((Field) term16355).setAccessible(true);
        Object enum41 = ((Field) term16355).get((Object) null);
        Class<? extends Object> term16621 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term16620 = ((Class) term16621).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term16620).setAccessible(true);
        Object enum42 = ((Field) term16620).get((Object) null);
        HashMap term16153 = new HashMap();
        HashMap term16187 = new HashMap();
        HashMap term16194 = new HashMap();
        Set<Object> term16912 =  ((Map) term16194).keySet();
        HashSet term16193 = new HashSet((Collection<? extends Object>) term16912);
        term16069 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        Object term16071 = newInstance(Class.forName("java.io.File"));
        byte[] term16108 = (byte[]) newByteArray(6);
        byte[] term16115 = (byte[]) newByteArray(5);
        Object term16124 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term16139 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term16142 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term16147 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term16150 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term16158 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term16159 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term16167 = (int[]) newIntArray(2);
        int[] term16170 = (int[]) newIntArray(2);
        Object[] term16192 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        setIntField(term16069, term16069.getClass(), "SECTOR_SIZE", -489441521);
        setField(term16071, term16071.getClass(), "path", "hoicvmsovO");
        setField(term16071, term16071.getClass(), "status", enum40);
        setIntField(term16071, term16071.getClass(), "prefixLength", 225873732);
        setField(term16071, term16071.getClass(), "filePath", null);
        setField(term16069, term16069.getClass(), "sdImageFile", term16071);
        setIntField(term16069, term16069.getClass(), "lba0", 529879356);
        setIntField(term16069, term16069.getClass(), "lba1", 18072182);
        setIntField(term16069, term16069.getClass(), "lba2", 1544768934);
        setIntField(term16069, term16069.getClass(), "position", -383508597);
        setField(term16069, term16069.getClass(), "status", enum41);
        setByteElement(term16108, 0, (byte) 79);
        setByteElement(term16108, 1, (byte) 61);
        setByteElement(term16108, 2, (byte) -92);
        setByteElement(term16108, 3, (byte) -42);
        setByteElement(term16108, 4, (byte) 116);
        setByteElement(term16108, 5, (byte) -81);
        setField(term16069, term16069.getClass(), "readBuffer", term16108);
        setByteElement(term16115, 0, (byte) 102);
        setByteElement(term16115, 1, (byte) -118);
        setByteElement(term16115, 2, (byte) -126);
        setByteElement(term16115, 3, (byte) -91);
        setByteElement(term16115, 4, (byte) -104);
        setField(term16069, term16069.getClass(), "writeBuffer", term16115);
        setIntField(term16069, term16069.getClass(), "readPosition", -819372164);
        setIntField(term16069, term16069.getClass(), "writePosition", 958132675);
        setIntField(term16069, term16069.getClass(), "size", -689879283);
        setIntField(term16124, term16124.getClass(), "startAddress", 1985432430);
        setIntField(term16124, term16124.getClass(), "endAddress", -1769933499);
        setField(term16069, term16069.getClass(), "memoryRange", term16124);
        setField(term16069, term16069.getClass(), "name", "eqJfYWRaEL");
        setIntField(term16139, term16139.getClass(), "startAddress", -1510932472);
        setIntField(term16139, term16139.getClass(), "endAddress", 1970654816);
        setLongField(term16142, term16142.getClass(), "clockPeriodInNs", 1000L);
        setField(term16142, term16142.getClass(), "behavior", enum42);
        setIntField(term16147, term16147.getClass(), "startAddress", 1354781442);
        setIntField(term16147, term16147.getClass(), "endAddress", -393590701);
        setLongField(term16150, term16150.getClass(), "clockPeriodInNs", 1000L);
        setField(term16150, term16150.getClass(), "behavior", enum42);
        setField(term16150, term16150.getClass(), "bus", null);
        setField(term16150, term16150.getClass(), "state", null);
        setLongField(term16150, term16150.getClass(), "opBeginTime", -78240609295693193L);
        setField(term16147, term16147.getClass(), "cpu", term16150);
        setField(term16147, term16147.getClass(), "deviceMap", term16153);
        setField(term16147, term16147.getClass(), "deviceAddressArray", term16158);
        setField(term16142, term16142.getClass(), "bus", term16147);
        setIntField(term16159, term16159.getClass(), "a", 0);
        setIntField(term16159, term16159.getClass(), "x", 0);
        setIntField(term16159, term16159.getClass(), "y", 0);
        setIntField(term16159, term16159.getClass(), "sp", 0);
        setIntField(term16159, term16159.getClass(), "pc", 0);
        setIntField(term16159, term16159.getClass(), "ir", 0);
        setIntField(term16159, term16159.getClass(), "nextIr", 0);
        setField(term16159, term16159.getClass(), "args", term16167);
        setField(term16159, term16159.getClass(), "nextArgs", term16170);
        setIntField(term16159, term16159.getClass(), "instSize", 0);
        setBooleanField(term16159, term16159.getClass(), "opTrap", false);
        setBooleanField(term16159, term16159.getClass(), "irqAsserted", false);
        setBooleanField(term16159, term16159.getClass(), "nmiAsserted", false);
        setIntField(term16159, term16159.getClass(), "lastPc", 0);
        setBooleanField(term16159, term16159.getClass(), "carryFlag", false);
        setBooleanField(term16159, term16159.getClass(), "negativeFlag", false);
        setBooleanField(term16159, term16159.getClass(), "zeroFlag", false);
        setBooleanField(term16159, term16159.getClass(), "irqDisableFlag", false);
        setBooleanField(term16159, term16159.getClass(), "decimalModeFlag", false);
        setBooleanField(term16159, term16159.getClass(), "breakFlag", false);
        setBooleanField(term16159, term16159.getClass(), "overflowFlag", false);
        setLongField(term16159, term16159.getClass(), "stepCounter", 0L);
        setField(term16142, term16142.getClass(), "state", term16159);
        setLongField(term16142, term16142.getClass(), "opBeginTime", 3090901538358721367L);
        setField(term16139, term16139.getClass(), "cpu", term16142);
        setField(term16139, term16139.getClass(), "deviceMap", term16187);
        setField(term16139, term16139.getClass(), "deviceAddressArray", term16192);
        setField(term16069, term16069.getClass(), "bus", term16139);
        setField(term16069, term16069.getClass(), "deviceChangeListeners", term16193);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "prepareWrite", argTypes, term16069, args);
    }

};


