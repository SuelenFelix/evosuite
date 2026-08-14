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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Bus_startAddress_2644903912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35813;

    public Bus_startAddress_2644903912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term35902 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term35901 = ((Class) term35902).getDeclaredField((String) "NMOS_6502");
        ((Field) term35901).setAccessible(true);
        Object enum22 = ((Field) term35901).get((Object) null);
        HashMap term35861 = new HashMap();
        HashMap term35895 = new HashMap();
        term35813 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term35816 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term35831 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term35834 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term35836 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term35839 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term35866 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term35867 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term35875 = (int[]) newIntArray(2);
        int[] term35878 = (int[]) newIntArray(2);
        Object[] term35900 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        setIntField(term35813, term35813.getClass(), "startAddress", 172898580);
        setIntField(term35813, term35813.getClass(), "endAddress", -777833461);
        setLongField(term35816, term35816.getClass(), "clockPeriodInNs", 1000L);
        setField(term35816, term35816.getClass(), "behavior", enum22);
        setIntField(term35831, term35831.getClass(), "startAddress", 1583691829);
        setIntField(term35831, term35831.getClass(), "endAddress", -1468541076);
        setLongField(term35834, term35834.getClass(), "clockPeriodInNs", 1000L);
        setField(term35834, term35834.getClass(), "behavior", enum22);
        setIntField(term35836, term35836.getClass(), "startAddress", -1796760393);
        setIntField(term35836, term35836.getClass(), "endAddress", -2099267271);
        setField(term35836, term35836.getClass(), "cpu", null);
        setField(term35836, term35836.getClass(), "deviceMap", null);
        setField(term35836, term35836.getClass(), "deviceAddressArray", null);
        setField(term35834, term35834.getClass(), "bus", term35836);
        setIntField(term35839, term35839.getClass(), "a", 0);
        setIntField(term35839, term35839.getClass(), "x", 0);
        setIntField(term35839, term35839.getClass(), "y", 0);
        setIntField(term35839, term35839.getClass(), "sp", 0);
        setIntField(term35839, term35839.getClass(), "pc", 0);
        setIntField(term35839, term35839.getClass(), "ir", 0);
        setIntField(term35839, term35839.getClass(), "nextIr", 0);
        setField(term35839, term35839.getClass(), "args", null);
        setField(term35839, term35839.getClass(), "nextArgs", null);
        setIntField(term35839, term35839.getClass(), "instSize", 0);
        setBooleanField(term35839, term35839.getClass(), "opTrap", false);
        setBooleanField(term35839, term35839.getClass(), "irqAsserted", false);
        setBooleanField(term35839, term35839.getClass(), "nmiAsserted", false);
        setIntField(term35839, term35839.getClass(), "lastPc", 0);
        setBooleanField(term35839, term35839.getClass(), "carryFlag", false);
        setBooleanField(term35839, term35839.getClass(), "negativeFlag", false);
        setBooleanField(term35839, term35839.getClass(), "zeroFlag", false);
        setBooleanField(term35839, term35839.getClass(), "irqDisableFlag", false);
        setBooleanField(term35839, term35839.getClass(), "decimalModeFlag", false);
        setBooleanField(term35839, term35839.getClass(), "breakFlag", false);
        setBooleanField(term35839, term35839.getClass(), "overflowFlag", false);
        setLongField(term35839, term35839.getClass(), "stepCounter", 0L);
        setField(term35834, term35834.getClass(), "state", term35839);
        setLongField(term35834, term35834.getClass(), "opBeginTime", -2783999800714825789L);
        setField(term35831, term35831.getClass(), "cpu", term35834);
        setField(term35831, term35831.getClass(), "deviceMap", term35861);
        setField(term35831, term35831.getClass(), "deviceAddressArray", term35866);
        setField(term35816, term35816.getClass(), "bus", term35831);
        setIntField(term35867, term35867.getClass(), "a", 0);
        setIntField(term35867, term35867.getClass(), "x", 0);
        setIntField(term35867, term35867.getClass(), "y", 0);
        setIntField(term35867, term35867.getClass(), "sp", 0);
        setIntField(term35867, term35867.getClass(), "pc", 0);
        setIntField(term35867, term35867.getClass(), "ir", 0);
        setIntField(term35867, term35867.getClass(), "nextIr", 0);
        setField(term35867, term35867.getClass(), "args", term35875);
        setField(term35867, term35867.getClass(), "nextArgs", term35878);
        setIntField(term35867, term35867.getClass(), "instSize", 0);
        setBooleanField(term35867, term35867.getClass(), "opTrap", false);
        setBooleanField(term35867, term35867.getClass(), "irqAsserted", false);
        setBooleanField(term35867, term35867.getClass(), "nmiAsserted", false);
        setIntField(term35867, term35867.getClass(), "lastPc", 0);
        setBooleanField(term35867, term35867.getClass(), "carryFlag", false);
        setBooleanField(term35867, term35867.getClass(), "negativeFlag", false);
        setBooleanField(term35867, term35867.getClass(), "zeroFlag", false);
        setBooleanField(term35867, term35867.getClass(), "irqDisableFlag", false);
        setBooleanField(term35867, term35867.getClass(), "decimalModeFlag", false);
        setBooleanField(term35867, term35867.getClass(), "breakFlag", false);
        setBooleanField(term35867, term35867.getClass(), "overflowFlag", false);
        setLongField(term35867, term35867.getClass(), "stepCounter", 0L);
        setField(term35816, term35816.getClass(), "state", term35867);
        setLongField(term35816, term35816.getClass(), "opBeginTime", 4266570509071948633L);
        setField(term35813, term35813.getClass(), "cpu", term35816);
        setField(term35813, term35813.getClass(), "deviceMap", term35895);
        setField(term35813, term35813.getClass(), "deviceAddressArray", term35900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "startAddress", argTypes, term35813, args);
    }

};


