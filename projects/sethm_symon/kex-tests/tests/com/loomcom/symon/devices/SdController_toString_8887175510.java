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

public class SdController_toString_8887175510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20213;

    public SdController_toString_8887175510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term20356 = Class.forName((String) "java.io.File$PathStatus");
        Field term20355 = ((Class) term20356).getDeclaredField((String) "CHECKED");
        ((Field) term20355).setAccessible(true);
        Object enum55 = ((Field) term20355).get((Object) null);
        Class<? extends Object> term20499 = Class.forName((String) "com.loomcom.symon.devices.SdController$Status");
        Field term20498 = ((Class) term20499).getDeclaredField((String) "IDLE");
        ((Field) term20498).setAccessible(true);
        Object enum56 = ((Field) term20498).get((Object) null);
        Class<? extends Object> term20763 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term20762 = ((Class) term20763).getDeclaredField((String) "NMOS_6502");
        ((Field) term20762).setAccessible(true);
        Object enum57 = ((Field) term20762).get((Object) null);
        HashMap term20296 = new HashMap();
        HashMap term20330 = new HashMap();
        HashMap term20337 = new HashMap();
        Set<Object> term21030 =  ((Map) term20337).keySet();
        HashSet term20336 = new HashSet((Collection<? extends Object>) term21030);
        term20213 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        Object term20215 = newInstance(Class.forName("java.io.File"));
        byte[] term20252 = (byte[]) newByteArray(6);
        byte[] term20259 = (byte[]) newByteArray(4);
        Object term20267 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term20282 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term20285 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term20290 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term20293 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term20301 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term20302 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term20310 = (int[]) newIntArray(2);
        int[] term20313 = (int[]) newIntArray(2);
        Object[] term20335 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        setIntField(term20213, term20213.getClass(), "SECTOR_SIZE", -1665928103);
        setField(term20215, term20215.getClass(), "path", "JUmudUmaaV");
        setField(term20215, term20215.getClass(), "status", enum55);
        setIntField(term20215, term20215.getClass(), "prefixLength", 1574458332);
        setField(term20215, term20215.getClass(), "filePath", null);
        setField(term20213, term20213.getClass(), "sdImageFile", term20215);
        setIntField(term20213, term20213.getClass(), "lba0", -975856245);
        setIntField(term20213, term20213.getClass(), "lba1", -1023366103);
        setIntField(term20213, term20213.getClass(), "lba2", 81427089);
        setIntField(term20213, term20213.getClass(), "position", 755951489);
        setField(term20213, term20213.getClass(), "status", enum56);
        setByteElement(term20252, 0, (byte) 123);
        setByteElement(term20252, 1, (byte) -101);
        setByteElement(term20252, 2, (byte) -102);
        setByteElement(term20252, 3, (byte) -95);
        setByteElement(term20252, 4, (byte) -2);
        setByteElement(term20252, 5, (byte) 28);
        setField(term20213, term20213.getClass(), "readBuffer", term20252);
        setByteElement(term20259, 0, (byte) 84);
        setByteElement(term20259, 1, (byte) 85);
        setByteElement(term20259, 2, (byte) -17);
        setByteElement(term20259, 3, (byte) -83);
        setField(term20213, term20213.getClass(), "writeBuffer", term20259);
        setIntField(term20213, term20213.getClass(), "readPosition", 1175146356);
        setIntField(term20213, term20213.getClass(), "writePosition", -2137419728);
        setIntField(term20213, term20213.getClass(), "size", 1558810715);
        setIntField(term20267, term20267.getClass(), "startAddress", -382652403);
        setIntField(term20267, term20267.getClass(), "endAddress", -2126539433);
        setField(term20213, term20213.getClass(), "memoryRange", term20267);
        setField(term20213, term20213.getClass(), "name", "KoyGrUJeJW");
        setIntField(term20282, term20282.getClass(), "startAddress", 196952878);
        setIntField(term20282, term20282.getClass(), "endAddress", 802673242);
        setLongField(term20285, term20285.getClass(), "clockPeriodInNs", 1000L);
        setField(term20285, term20285.getClass(), "behavior", enum57);
        setIntField(term20290, term20290.getClass(), "startAddress", -1808638031);
        setIntField(term20290, term20290.getClass(), "endAddress", -1514240086);
        setLongField(term20293, term20293.getClass(), "clockPeriodInNs", 1000L);
        setField(term20293, term20293.getClass(), "behavior", enum57);
        setField(term20293, term20293.getClass(), "bus", null);
        setField(term20293, term20293.getClass(), "state", null);
        setLongField(term20293, term20293.getClass(), "opBeginTime", 8540994973773607992L);
        setField(term20290, term20290.getClass(), "cpu", term20293);
        setField(term20290, term20290.getClass(), "deviceMap", term20296);
        setField(term20290, term20290.getClass(), "deviceAddressArray", term20301);
        setField(term20285, term20285.getClass(), "bus", term20290);
        setIntField(term20302, term20302.getClass(), "a", 0);
        setIntField(term20302, term20302.getClass(), "x", 0);
        setIntField(term20302, term20302.getClass(), "y", 0);
        setIntField(term20302, term20302.getClass(), "sp", 0);
        setIntField(term20302, term20302.getClass(), "pc", 0);
        setIntField(term20302, term20302.getClass(), "ir", 0);
        setIntField(term20302, term20302.getClass(), "nextIr", 0);
        setField(term20302, term20302.getClass(), "args", term20310);
        setField(term20302, term20302.getClass(), "nextArgs", term20313);
        setIntField(term20302, term20302.getClass(), "instSize", 0);
        setBooleanField(term20302, term20302.getClass(), "opTrap", false);
        setBooleanField(term20302, term20302.getClass(), "irqAsserted", false);
        setBooleanField(term20302, term20302.getClass(), "nmiAsserted", false);
        setIntField(term20302, term20302.getClass(), "lastPc", 0);
        setBooleanField(term20302, term20302.getClass(), "carryFlag", false);
        setBooleanField(term20302, term20302.getClass(), "negativeFlag", false);
        setBooleanField(term20302, term20302.getClass(), "zeroFlag", false);
        setBooleanField(term20302, term20302.getClass(), "irqDisableFlag", false);
        setBooleanField(term20302, term20302.getClass(), "decimalModeFlag", false);
        setBooleanField(term20302, term20302.getClass(), "breakFlag", false);
        setBooleanField(term20302, term20302.getClass(), "overflowFlag", false);
        setLongField(term20302, term20302.getClass(), "stepCounter", 0L);
        setField(term20285, term20285.getClass(), "state", term20302);
        setLongField(term20285, term20285.getClass(), "opBeginTime", -2338103433822116635L);
        setField(term20282, term20282.getClass(), "cpu", term20285);
        setField(term20282, term20282.getClass(), "deviceMap", term20330);
        setField(term20282, term20282.getClass(), "deviceAddressArray", term20335);
        setField(term20213, term20213.getClass(), "bus", term20282);
        setField(term20213, term20213.getClass(), "deviceChangeListeners", term20336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term20213, args);
    }

};


