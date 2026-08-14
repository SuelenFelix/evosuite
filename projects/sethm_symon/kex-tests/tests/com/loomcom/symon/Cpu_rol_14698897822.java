package com.loomcom.symon;

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
import static com.loomcom.symon.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class Cpu_rol_14698897822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181799;
     Object term181893;

    public Cpu_rol_14698897822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term181896 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term181895 = ((Class) term181896).getDeclaredField((String) "NMOS_6502");
        ((Field) term181895).setAccessible(true);
        Object enum202 = ((Field) term181895).get((Object) null);
        HashMap term181825 = new HashMap();
        HashMap term181859 = new HashMap();
        term181799 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term181814 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term181817 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term181819 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term181822 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term181830 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term181831 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term181839 = (int[]) newIntArray(2);
        int[] term181842 = (int[]) newIntArray(2);
        Object[] term181864 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term181865 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term181873 = (int[]) newIntArray(2);
        int[] term181876 = (int[]) newIntArray(2);
        setLongField(term181799, term181799.getClass(), "clockPeriodInNs", 1000L);
        setField(term181799, term181799.getClass(), "behavior", enum202);
        setIntField(term181814, term181814.getClass(), "startAddress", 632440696);
        setIntField(term181814, term181814.getClass(), "endAddress", 1176303286);
        setLongField(term181817, term181817.getClass(), "clockPeriodInNs", 1000L);
        setField(term181817, term181817.getClass(), "behavior", enum202);
        setIntField(term181819, term181819.getClass(), "startAddress", -1738480762);
        setIntField(term181819, term181819.getClass(), "endAddress", -1175470028);
        setLongField(term181822, term181822.getClass(), "clockPeriodInNs", 1000L);
        setField(term181822, term181822.getClass(), "behavior", enum202);
        setField(term181822, term181822.getClass(), "bus", null);
        setField(term181822, term181822.getClass(), "state", null);
        setLongField(term181822, term181822.getClass(), "opBeginTime", 1747819662947425876L);
        setField(term181819, term181819.getClass(), "cpu", term181822);
        setField(term181819, term181819.getClass(), "deviceMap", term181825);
        setField(term181819, term181819.getClass(), "deviceAddressArray", term181830);
        setField(term181817, term181817.getClass(), "bus", term181819);
        setIntField(term181831, term181831.getClass(), "a", 0);
        setIntField(term181831, term181831.getClass(), "x", 0);
        setIntField(term181831, term181831.getClass(), "y", 0);
        setIntField(term181831, term181831.getClass(), "sp", 0);
        setIntField(term181831, term181831.getClass(), "pc", 0);
        setIntField(term181831, term181831.getClass(), "ir", 0);
        setIntField(term181831, term181831.getClass(), "nextIr", 0);
        setField(term181831, term181831.getClass(), "args", term181839);
        setField(term181831, term181831.getClass(), "nextArgs", term181842);
        setIntField(term181831, term181831.getClass(), "instSize", 0);
        setBooleanField(term181831, term181831.getClass(), "opTrap", false);
        setBooleanField(term181831, term181831.getClass(), "irqAsserted", false);
        setBooleanField(term181831, term181831.getClass(), "nmiAsserted", false);
        setIntField(term181831, term181831.getClass(), "lastPc", 0);
        setBooleanField(term181831, term181831.getClass(), "carryFlag", false);
        setBooleanField(term181831, term181831.getClass(), "negativeFlag", false);
        setBooleanField(term181831, term181831.getClass(), "zeroFlag", false);
        setBooleanField(term181831, term181831.getClass(), "irqDisableFlag", false);
        setBooleanField(term181831, term181831.getClass(), "decimalModeFlag", false);
        setBooleanField(term181831, term181831.getClass(), "breakFlag", false);
        setBooleanField(term181831, term181831.getClass(), "overflowFlag", false);
        setLongField(term181831, term181831.getClass(), "stepCounter", 0L);
        setField(term181817, term181817.getClass(), "state", term181831);
        setLongField(term181817, term181817.getClass(), "opBeginTime", 8085945615925723302L);
        setField(term181814, term181814.getClass(), "cpu", term181817);
        setField(term181814, term181814.getClass(), "deviceMap", term181859);
        setField(term181814, term181814.getClass(), "deviceAddressArray", term181864);
        setField(term181799, term181799.getClass(), "bus", term181814);
        setIntField(term181865, term181865.getClass(), "a", 0);
        setIntField(term181865, term181865.getClass(), "x", 0);
        setIntField(term181865, term181865.getClass(), "y", 0);
        setIntField(term181865, term181865.getClass(), "sp", 0);
        setIntField(term181865, term181865.getClass(), "pc", 0);
        setIntField(term181865, term181865.getClass(), "ir", 0);
        setIntField(term181865, term181865.getClass(), "nextIr", 0);
        setField(term181865, term181865.getClass(), "args", term181873);
        setField(term181865, term181865.getClass(), "nextArgs", term181876);
        setIntField(term181865, term181865.getClass(), "instSize", 0);
        setBooleanField(term181865, term181865.getClass(), "opTrap", false);
        setBooleanField(term181865, term181865.getClass(), "irqAsserted", false);
        setBooleanField(term181865, term181865.getClass(), "nmiAsserted", false);
        setIntField(term181865, term181865.getClass(), "lastPc", 0);
        setBooleanField(term181865, term181865.getClass(), "carryFlag", false);
        setBooleanField(term181865, term181865.getClass(), "negativeFlag", false);
        setBooleanField(term181865, term181865.getClass(), "zeroFlag", false);
        setBooleanField(term181865, term181865.getClass(), "irqDisableFlag", false);
        setBooleanField(term181865, term181865.getClass(), "decimalModeFlag", false);
        setBooleanField(term181865, term181865.getClass(), "breakFlag", false);
        setBooleanField(term181865, term181865.getClass(), "overflowFlag", false);
        setLongField(term181865, term181865.getClass(), "stepCounter", 0L);
        setField(term181799, term181799.getClass(), "state", term181865);
        setLongField(term181799, term181799.getClass(), "opBeginTime", 5874242482849721868L);
        term181893 = new Integer(-1235710002);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term181893;
        callMethod(klass, "rol", argTypes, term181799, args);
    }

};


