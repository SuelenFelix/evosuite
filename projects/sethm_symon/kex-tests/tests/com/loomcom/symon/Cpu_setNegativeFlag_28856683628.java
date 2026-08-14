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

public class Cpu_setNegativeFlag_28856683628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184003;

    public Cpu_setNegativeFlag_28856683628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term184098 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term184097 = ((Class) term184098).getDeclaredField((String) "NMOS_6502");
        ((Field) term184097).setAccessible(true);
        Object enum208 = ((Field) term184097).get((Object) null);
        HashMap term184029 = new HashMap();
        HashMap term184063 = new HashMap();
        term184003 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term184018 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term184021 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term184023 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term184026 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term184034 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term184035 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term184043 = (int[]) newIntArray(2);
        int[] term184046 = (int[]) newIntArray(2);
        Object[] term184068 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term184069 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term184077 = (int[]) newIntArray(2);
        int[] term184080 = (int[]) newIntArray(2);
        setLongField(term184003, term184003.getClass(), "clockPeriodInNs", 1000L);
        setField(term184003, term184003.getClass(), "behavior", enum208);
        setIntField(term184018, term184018.getClass(), "startAddress", -1368246630);
        setIntField(term184018, term184018.getClass(), "endAddress", -217114557);
        setLongField(term184021, term184021.getClass(), "clockPeriodInNs", 1000L);
        setField(term184021, term184021.getClass(), "behavior", enum208);
        setIntField(term184023, term184023.getClass(), "startAddress", 2000296922);
        setIntField(term184023, term184023.getClass(), "endAddress", 356697128);
        setLongField(term184026, term184026.getClass(), "clockPeriodInNs", 1000L);
        setField(term184026, term184026.getClass(), "behavior", enum208);
        setField(term184026, term184026.getClass(), "bus", null);
        setField(term184026, term184026.getClass(), "state", null);
        setLongField(term184026, term184026.getClass(), "opBeginTime", -3259323558419605103L);
        setField(term184023, term184023.getClass(), "cpu", term184026);
        setField(term184023, term184023.getClass(), "deviceMap", term184029);
        setField(term184023, term184023.getClass(), "deviceAddressArray", term184034);
        setField(term184021, term184021.getClass(), "bus", term184023);
        setIntField(term184035, term184035.getClass(), "a", 0);
        setIntField(term184035, term184035.getClass(), "x", 0);
        setIntField(term184035, term184035.getClass(), "y", 0);
        setIntField(term184035, term184035.getClass(), "sp", 0);
        setIntField(term184035, term184035.getClass(), "pc", 0);
        setIntField(term184035, term184035.getClass(), "ir", 0);
        setIntField(term184035, term184035.getClass(), "nextIr", 0);
        setField(term184035, term184035.getClass(), "args", term184043);
        setField(term184035, term184035.getClass(), "nextArgs", term184046);
        setIntField(term184035, term184035.getClass(), "instSize", 0);
        setBooleanField(term184035, term184035.getClass(), "opTrap", false);
        setBooleanField(term184035, term184035.getClass(), "irqAsserted", false);
        setBooleanField(term184035, term184035.getClass(), "nmiAsserted", false);
        setIntField(term184035, term184035.getClass(), "lastPc", 0);
        setBooleanField(term184035, term184035.getClass(), "carryFlag", false);
        setBooleanField(term184035, term184035.getClass(), "negativeFlag", false);
        setBooleanField(term184035, term184035.getClass(), "zeroFlag", false);
        setBooleanField(term184035, term184035.getClass(), "irqDisableFlag", false);
        setBooleanField(term184035, term184035.getClass(), "decimalModeFlag", false);
        setBooleanField(term184035, term184035.getClass(), "breakFlag", false);
        setBooleanField(term184035, term184035.getClass(), "overflowFlag", false);
        setLongField(term184035, term184035.getClass(), "stepCounter", 0L);
        setField(term184021, term184021.getClass(), "state", term184035);
        setLongField(term184021, term184021.getClass(), "opBeginTime", 7299361469288644847L);
        setField(term184018, term184018.getClass(), "cpu", term184021);
        setField(term184018, term184018.getClass(), "deviceMap", term184063);
        setField(term184018, term184018.getClass(), "deviceAddressArray", term184068);
        setField(term184003, term184003.getClass(), "bus", term184018);
        setIntField(term184069, term184069.getClass(), "a", 0);
        setIntField(term184069, term184069.getClass(), "x", 0);
        setIntField(term184069, term184069.getClass(), "y", 0);
        setIntField(term184069, term184069.getClass(), "sp", 0);
        setIntField(term184069, term184069.getClass(), "pc", 0);
        setIntField(term184069, term184069.getClass(), "ir", 0);
        setIntField(term184069, term184069.getClass(), "nextIr", 0);
        setField(term184069, term184069.getClass(), "args", term184077);
        setField(term184069, term184069.getClass(), "nextArgs", term184080);
        setIntField(term184069, term184069.getClass(), "instSize", 0);
        setBooleanField(term184069, term184069.getClass(), "opTrap", false);
        setBooleanField(term184069, term184069.getClass(), "irqAsserted", false);
        setBooleanField(term184069, term184069.getClass(), "nmiAsserted", false);
        setIntField(term184069, term184069.getClass(), "lastPc", 0);
        setBooleanField(term184069, term184069.getClass(), "carryFlag", false);
        setBooleanField(term184069, term184069.getClass(), "negativeFlag", false);
        setBooleanField(term184069, term184069.getClass(), "zeroFlag", false);
        setBooleanField(term184069, term184069.getClass(), "irqDisableFlag", false);
        setBooleanField(term184069, term184069.getClass(), "decimalModeFlag", false);
        setBooleanField(term184069, term184069.getClass(), "breakFlag", false);
        setBooleanField(term184069, term184069.getClass(), "overflowFlag", false);
        setLongField(term184069, term184069.getClass(), "stepCounter", 0L);
        setField(term184003, term184003.getClass(), "state", term184069);
        setLongField(term184003, term184003.getClass(), "opBeginTime", -5822755741902532021L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setNegativeFlag", argTypes, term184003, args);
    }

};


