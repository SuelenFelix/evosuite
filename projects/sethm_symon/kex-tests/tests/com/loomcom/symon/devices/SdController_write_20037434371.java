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

public class SdController_write_20037434371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12675;
     Object term12810;
     Object term12812;

    public SdController_write_20037434371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12847 = Class.forName((String) "java.io.File$PathStatus");
        Field term12846 = ((Class) term12847).getDeclaredField((String) "INVALID");
        ((Field) term12846).setAccessible(true);
        Object enum28 = ((Field) term12846).get((Object) null);
        Class<? extends Object> term13015 = Class.forName((String) "com.loomcom.symon.devices.SdController$Status");
        Field term13014 = ((Class) term13015).getDeclaredField((String) "READ");
        ((Field) term13014).setAccessible(true);
        Object enum29 = ((Field) term13014).get((Object) null);
        Class<? extends Object> term13282 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term13281 = ((Class) term13282).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term13281).setAccessible(true);
        Object enum30 = ((Field) term13281).get((Object) null);
        HashMap term12761 = new HashMap();
        HashMap term12795 = new HashMap();
        HashMap term12802 = new HashMap();
        Set<Object> term13573 =  ((Map) term12802).keySet();
        HashSet term12801 = new HashSet((Collection<? extends Object>) term13573);
        term12675 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        Object term12677 = newInstance(Class.forName("java.io.File"));
        byte[] term12714 = (byte[]) newByteArray(9);
        byte[] term12724 = (byte[]) newByteArray(4);
        Object term12732 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term12747 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term12750 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term12755 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term12758 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term12766 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term12767 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term12775 = (int[]) newIntArray(2);
        int[] term12778 = (int[]) newIntArray(2);
        Object[] term12800 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        setIntField(term12675, term12675.getClass(), "SECTOR_SIZE", 1865070548);
        setField(term12677, term12677.getClass(), "path", "onpbIeEKoi");
        setField(term12677, term12677.getClass(), "status", enum28);
        setIntField(term12677, term12677.getClass(), "prefixLength", 1904515443);
        setField(term12677, term12677.getClass(), "filePath", null);
        setField(term12675, term12675.getClass(), "sdImageFile", term12677);
        setIntField(term12675, term12675.getClass(), "lba0", 1361126430);
        setIntField(term12675, term12675.getClass(), "lba1", 1728588701);
        setIntField(term12675, term12675.getClass(), "lba2", -355769268);
        setIntField(term12675, term12675.getClass(), "position", -114460662);
        setField(term12675, term12675.getClass(), "status", enum29);
        setByteElement(term12714, 0, (byte) 47);
        setByteElement(term12714, 1, (byte) 48);
        setByteElement(term12714, 2, (byte) 89);
        setByteElement(term12714, 3, (byte) 75);
        setByteElement(term12714, 4, (byte) 18);
        setByteElement(term12714, 5, (byte) -58);
        setByteElement(term12714, 6, (byte) -29);
        setByteElement(term12714, 7, (byte) -54);
        setByteElement(term12714, 8, (byte) -10);
        setField(term12675, term12675.getClass(), "readBuffer", term12714);
        setByteElement(term12724, 0, (byte) 79);
        setByteElement(term12724, 1, (byte) -119);
        setByteElement(term12724, 2, (byte) -66);
        setByteElement(term12724, 3, (byte) 83);
        setField(term12675, term12675.getClass(), "writeBuffer", term12724);
        setIntField(term12675, term12675.getClass(), "readPosition", -355376034);
        setIntField(term12675, term12675.getClass(), "writePosition", 588390599);
        setIntField(term12675, term12675.getClass(), "size", -95969566);
        setIntField(term12732, term12732.getClass(), "startAddress", -68615285);
        setIntField(term12732, term12732.getClass(), "endAddress", -337504086);
        setField(term12675, term12675.getClass(), "memoryRange", term12732);
        setField(term12675, term12675.getClass(), "name", "YRHGsAkhxb");
        setIntField(term12747, term12747.getClass(), "startAddress", 2074130991);
        setIntField(term12747, term12747.getClass(), "endAddress", 532588266);
        setLongField(term12750, term12750.getClass(), "clockPeriodInNs", 1000L);
        setField(term12750, term12750.getClass(), "behavior", enum30);
        setIntField(term12755, term12755.getClass(), "startAddress", -1286686332);
        setIntField(term12755, term12755.getClass(), "endAddress", -284885486);
        setLongField(term12758, term12758.getClass(), "clockPeriodInNs", 1000L);
        setField(term12758, term12758.getClass(), "behavior", enum30);
        setField(term12758, term12758.getClass(), "bus", null);
        setField(term12758, term12758.getClass(), "state", null);
        setLongField(term12758, term12758.getClass(), "opBeginTime", -7291742736502427077L);
        setField(term12755, term12755.getClass(), "cpu", term12758);
        setField(term12755, term12755.getClass(), "deviceMap", term12761);
        setField(term12755, term12755.getClass(), "deviceAddressArray", term12766);
        setField(term12750, term12750.getClass(), "bus", term12755);
        setIntField(term12767, term12767.getClass(), "a", 0);
        setIntField(term12767, term12767.getClass(), "x", 0);
        setIntField(term12767, term12767.getClass(), "y", 0);
        setIntField(term12767, term12767.getClass(), "sp", 0);
        setIntField(term12767, term12767.getClass(), "pc", 0);
        setIntField(term12767, term12767.getClass(), "ir", 0);
        setIntField(term12767, term12767.getClass(), "nextIr", 0);
        setField(term12767, term12767.getClass(), "args", term12775);
        setField(term12767, term12767.getClass(), "nextArgs", term12778);
        setIntField(term12767, term12767.getClass(), "instSize", 0);
        setBooleanField(term12767, term12767.getClass(), "opTrap", false);
        setBooleanField(term12767, term12767.getClass(), "irqAsserted", false);
        setBooleanField(term12767, term12767.getClass(), "nmiAsserted", false);
        setIntField(term12767, term12767.getClass(), "lastPc", 0);
        setBooleanField(term12767, term12767.getClass(), "carryFlag", false);
        setBooleanField(term12767, term12767.getClass(), "negativeFlag", false);
        setBooleanField(term12767, term12767.getClass(), "zeroFlag", false);
        setBooleanField(term12767, term12767.getClass(), "irqDisableFlag", false);
        setBooleanField(term12767, term12767.getClass(), "decimalModeFlag", false);
        setBooleanField(term12767, term12767.getClass(), "breakFlag", false);
        setBooleanField(term12767, term12767.getClass(), "overflowFlag", false);
        setLongField(term12767, term12767.getClass(), "stepCounter", 0L);
        setField(term12750, term12750.getClass(), "state", term12767);
        setLongField(term12750, term12750.getClass(), "opBeginTime", -8121849829073967555L);
        setField(term12747, term12747.getClass(), "cpu", term12750);
        setField(term12747, term12747.getClass(), "deviceMap", term12795);
        setField(term12747, term12747.getClass(), "deviceAddressArray", term12800);
        setField(term12675, term12675.getClass(), "bus", term12747);
        setField(term12675, term12675.getClass(), "deviceChangeListeners", term12801);
        term12810 = new Integer(1949983666);
        term12812 = new Integer(154111854);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term12810;
        args[1] = term12812;
        callMethod(klass, "write", argTypes, term12675, args);
    }

};


