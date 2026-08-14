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

public class Bus_clearIrq_100526324413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39828;

    public Bus_clearIrq_100526324413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term39917 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term39916 = ((Class) term39917).getDeclaredField((String) "NMOS_6502");
        ((Field) term39916).setAccessible(true);
        Object enum33 = ((Field) term39916).get((Object) null);
        HashMap term39876 = new HashMap();
        HashMap term39910 = new HashMap();
        term39828 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term39831 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term39846 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term39849 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term39851 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term39854 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term39881 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term39882 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term39890 = (int[]) newIntArray(2);
        int[] term39893 = (int[]) newIntArray(2);
        Object[] term39915 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        setIntField(term39828, term39828.getClass(), "startAddress", 1169519385);
        setIntField(term39828, term39828.getClass(), "endAddress", 1846078344);
        setLongField(term39831, term39831.getClass(), "clockPeriodInNs", 1000L);
        setField(term39831, term39831.getClass(), "behavior", enum33);
        setIntField(term39846, term39846.getClass(), "startAddress", 1692543802);
        setIntField(term39846, term39846.getClass(), "endAddress", 376341151);
        setLongField(term39849, term39849.getClass(), "clockPeriodInNs", 1000L);
        setField(term39849, term39849.getClass(), "behavior", enum33);
        setIntField(term39851, term39851.getClass(), "startAddress", -1607267243);
        setIntField(term39851, term39851.getClass(), "endAddress", 1641377218);
        setField(term39851, term39851.getClass(), "cpu", null);
        setField(term39851, term39851.getClass(), "deviceMap", null);
        setField(term39851, term39851.getClass(), "deviceAddressArray", null);
        setField(term39849, term39849.getClass(), "bus", term39851);
        setIntField(term39854, term39854.getClass(), "a", 0);
        setIntField(term39854, term39854.getClass(), "x", 0);
        setIntField(term39854, term39854.getClass(), "y", 0);
        setIntField(term39854, term39854.getClass(), "sp", 0);
        setIntField(term39854, term39854.getClass(), "pc", 0);
        setIntField(term39854, term39854.getClass(), "ir", 0);
        setIntField(term39854, term39854.getClass(), "nextIr", 0);
        setField(term39854, term39854.getClass(), "args", null);
        setField(term39854, term39854.getClass(), "nextArgs", null);
        setIntField(term39854, term39854.getClass(), "instSize", 0);
        setBooleanField(term39854, term39854.getClass(), "opTrap", false);
        setBooleanField(term39854, term39854.getClass(), "irqAsserted", false);
        setBooleanField(term39854, term39854.getClass(), "nmiAsserted", false);
        setIntField(term39854, term39854.getClass(), "lastPc", 0);
        setBooleanField(term39854, term39854.getClass(), "carryFlag", false);
        setBooleanField(term39854, term39854.getClass(), "negativeFlag", false);
        setBooleanField(term39854, term39854.getClass(), "zeroFlag", false);
        setBooleanField(term39854, term39854.getClass(), "irqDisableFlag", false);
        setBooleanField(term39854, term39854.getClass(), "decimalModeFlag", false);
        setBooleanField(term39854, term39854.getClass(), "breakFlag", false);
        setBooleanField(term39854, term39854.getClass(), "overflowFlag", false);
        setLongField(term39854, term39854.getClass(), "stepCounter", 0L);
        setField(term39849, term39849.getClass(), "state", term39854);
        setLongField(term39849, term39849.getClass(), "opBeginTime", 5904678961906211249L);
        setField(term39846, term39846.getClass(), "cpu", term39849);
        setField(term39846, term39846.getClass(), "deviceMap", term39876);
        setField(term39846, term39846.getClass(), "deviceAddressArray", term39881);
        setField(term39831, term39831.getClass(), "bus", term39846);
        setIntField(term39882, term39882.getClass(), "a", 0);
        setIntField(term39882, term39882.getClass(), "x", 0);
        setIntField(term39882, term39882.getClass(), "y", 0);
        setIntField(term39882, term39882.getClass(), "sp", 0);
        setIntField(term39882, term39882.getClass(), "pc", 0);
        setIntField(term39882, term39882.getClass(), "ir", 0);
        setIntField(term39882, term39882.getClass(), "nextIr", 0);
        setField(term39882, term39882.getClass(), "args", term39890);
        setField(term39882, term39882.getClass(), "nextArgs", term39893);
        setIntField(term39882, term39882.getClass(), "instSize", 0);
        setBooleanField(term39882, term39882.getClass(), "opTrap", false);
        setBooleanField(term39882, term39882.getClass(), "irqAsserted", false);
        setBooleanField(term39882, term39882.getClass(), "nmiAsserted", false);
        setIntField(term39882, term39882.getClass(), "lastPc", 0);
        setBooleanField(term39882, term39882.getClass(), "carryFlag", false);
        setBooleanField(term39882, term39882.getClass(), "negativeFlag", false);
        setBooleanField(term39882, term39882.getClass(), "zeroFlag", false);
        setBooleanField(term39882, term39882.getClass(), "irqDisableFlag", false);
        setBooleanField(term39882, term39882.getClass(), "decimalModeFlag", false);
        setBooleanField(term39882, term39882.getClass(), "breakFlag", false);
        setBooleanField(term39882, term39882.getClass(), "overflowFlag", false);
        setLongField(term39882, term39882.getClass(), "stepCounter", 0L);
        setField(term39831, term39831.getClass(), "state", term39882);
        setLongField(term39831, term39831.getClass(), "opBeginTime", -1820639665251914495L);
        setField(term39828, term39828.getClass(), "cpu", term39831);
        setField(term39828, term39828.getClass(), "deviceMap", term39910);
        setField(term39828, term39828.getClass(), "deviceAddressArray", term39915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearIrq", argTypes, term39828, args);
    }

};


