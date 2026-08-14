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

public class SdController_writeData_13659821697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17721;
     Object term17856;

    public SdController_writeData_13659821697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17869 = Class.forName((String) "java.io.File$PathStatus");
        Field term17868 = ((Class) term17869).getDeclaredField((String) "CHECKED");
        ((Field) term17868).setAccessible(true);
        Object enum46 = ((Field) term17868).get((Object) null);
        Class<? extends Object> term18012 = Class.forName((String) "com.loomcom.symon.devices.SdController$Status");
        Field term18011 = ((Class) term18012).getDeclaredField((String) "WRITE");
        ((Field) term18011).setAccessible(true);
        Object enum47 = ((Field) term18011).get((Object) null);
        Class<? extends Object> term18281 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term18280 = ((Class) term18281).getDeclaredField((String) "CMOS_65816");
        ((Field) term18280).setAccessible(true);
        Object enum48 = ((Field) term18280).get((Object) null);
        HashMap term17807 = new HashMap();
        HashMap term17841 = new HashMap();
        HashMap term17848 = new HashMap();
        Set<Object> term18551 =  ((Map) term17848).keySet();
        HashSet term17847 = new HashSet((Collection<? extends Object>) term18551);
        term17721 = newInstance(Class.forName("com.loomcom.symon.devices.SdController"));
        Object term17723 = newInstance(Class.forName("java.io.File"));
        byte[] term17761 = (byte[]) newByteArray(9);
        byte[] term17771 = (byte[]) newByteArray(3);
        Object term17778 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term17793 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term17796 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term17801 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term17804 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term17812 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term17813 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term17821 = (int[]) newIntArray(2);
        int[] term17824 = (int[]) newIntArray(2);
        Object[] term17846 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        setIntField(term17721, term17721.getClass(), "SECTOR_SIZE", -897937940);
        setField(term17723, term17723.getClass(), "path", "kBdSllIBVz");
        setField(term17723, term17723.getClass(), "status", enum46);
        setIntField(term17723, term17723.getClass(), "prefixLength", 1523261232);
        setField(term17723, term17723.getClass(), "filePath", null);
        setField(term17721, term17721.getClass(), "sdImageFile", term17723);
        setIntField(term17721, term17721.getClass(), "lba0", -428988337);
        setIntField(term17721, term17721.getClass(), "lba1", 48047085);
        setIntField(term17721, term17721.getClass(), "lba2", 1902784843);
        setIntField(term17721, term17721.getClass(), "position", 2021136615);
        setField(term17721, term17721.getClass(), "status", enum47);
        setByteElement(term17761, 0, (byte) 45);
        setByteElement(term17761, 1, (byte) -39);
        setByteElement(term17761, 2, (byte) -20);
        setByteElement(term17761, 3, (byte) 10);
        setByteElement(term17761, 4, (byte) 77);
        setByteElement(term17761, 5, (byte) 14);
        setByteElement(term17761, 6, (byte) -101);
        setByteElement(term17761, 7, (byte) 35);
        setByteElement(term17761, 8, (byte) 66);
        setField(term17721, term17721.getClass(), "readBuffer", term17761);
        setByteElement(term17771, 0, (byte) 123);
        setByteElement(term17771, 1, (byte) -5);
        setByteElement(term17771, 2, (byte) 84);
        setField(term17721, term17721.getClass(), "writeBuffer", term17771);
        setIntField(term17721, term17721.getClass(), "readPosition", 1778570695);
        setIntField(term17721, term17721.getClass(), "writePosition", -1142164411);
        setIntField(term17721, term17721.getClass(), "size", -1619435313);
        setIntField(term17778, term17778.getClass(), "startAddress", 1013801066);
        setIntField(term17778, term17778.getClass(), "endAddress", 1512541853);
        setField(term17721, term17721.getClass(), "memoryRange", term17778);
        setField(term17721, term17721.getClass(), "name", "TJmVBGfTML");
        setIntField(term17793, term17793.getClass(), "startAddress", -965421502);
        setIntField(term17793, term17793.getClass(), "endAddress", 1319026002);
        setLongField(term17796, term17796.getClass(), "clockPeriodInNs", 1000L);
        setField(term17796, term17796.getClass(), "behavior", enum48);
        setIntField(term17801, term17801.getClass(), "startAddress", -1368173231);
        setIntField(term17801, term17801.getClass(), "endAddress", 1956006038);
        setLongField(term17804, term17804.getClass(), "clockPeriodInNs", 1000L);
        setField(term17804, term17804.getClass(), "behavior", enum48);
        setField(term17804, term17804.getClass(), "bus", null);
        setField(term17804, term17804.getClass(), "state", null);
        setLongField(term17804, term17804.getClass(), "opBeginTime", 6698455537431331246L);
        setField(term17801, term17801.getClass(), "cpu", term17804);
        setField(term17801, term17801.getClass(), "deviceMap", term17807);
        setField(term17801, term17801.getClass(), "deviceAddressArray", term17812);
        setField(term17796, term17796.getClass(), "bus", term17801);
        setIntField(term17813, term17813.getClass(), "a", 0);
        setIntField(term17813, term17813.getClass(), "x", 0);
        setIntField(term17813, term17813.getClass(), "y", 0);
        setIntField(term17813, term17813.getClass(), "sp", 0);
        setIntField(term17813, term17813.getClass(), "pc", 0);
        setIntField(term17813, term17813.getClass(), "ir", 0);
        setIntField(term17813, term17813.getClass(), "nextIr", 0);
        setField(term17813, term17813.getClass(), "args", term17821);
        setField(term17813, term17813.getClass(), "nextArgs", term17824);
        setIntField(term17813, term17813.getClass(), "instSize", 0);
        setBooleanField(term17813, term17813.getClass(), "opTrap", false);
        setBooleanField(term17813, term17813.getClass(), "irqAsserted", false);
        setBooleanField(term17813, term17813.getClass(), "nmiAsserted", false);
        setIntField(term17813, term17813.getClass(), "lastPc", 0);
        setBooleanField(term17813, term17813.getClass(), "carryFlag", false);
        setBooleanField(term17813, term17813.getClass(), "negativeFlag", false);
        setBooleanField(term17813, term17813.getClass(), "zeroFlag", false);
        setBooleanField(term17813, term17813.getClass(), "irqDisableFlag", false);
        setBooleanField(term17813, term17813.getClass(), "decimalModeFlag", false);
        setBooleanField(term17813, term17813.getClass(), "breakFlag", false);
        setBooleanField(term17813, term17813.getClass(), "overflowFlag", false);
        setLongField(term17813, term17813.getClass(), "stepCounter", 0L);
        setField(term17796, term17796.getClass(), "state", term17813);
        setLongField(term17796, term17796.getClass(), "opBeginTime", -8327432141027603933L);
        setField(term17793, term17793.getClass(), "cpu", term17796);
        setField(term17793, term17793.getClass(), "deviceMap", term17841);
        setField(term17793, term17793.getClass(), "deviceAddressArray", term17846);
        setField(term17721, term17721.getClass(), "bus", term17793);
        setField(term17721, term17721.getClass(), "deviceChangeListeners", term17847);
        term17856 = new Integer(892205855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.SdController");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term17856;
        callMethod(klass, "writeData", argTypes, term17721, args);
    }

};


