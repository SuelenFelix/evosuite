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

public class Cpu_clearIrq_100523819674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200857;

    public Cpu_clearIrq_100523819674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term200952 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term200951 = ((Class) term200952).getDeclaredField((String) "NMOS_6502");
        ((Field) term200951).setAccessible(true);
        Object enum254 = ((Field) term200951).get((Object) null);
        HashMap term200883 = new HashMap();
        HashMap term200917 = new HashMap();
        term200857 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term200872 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term200875 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term200877 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term200880 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term200888 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term200889 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term200897 = (int[]) newIntArray(2);
        int[] term200900 = (int[]) newIntArray(2);
        Object[] term200922 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term200923 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term200931 = (int[]) newIntArray(2);
        int[] term200934 = (int[]) newIntArray(2);
        setLongField(term200857, term200857.getClass(), "clockPeriodInNs", 1000L);
        setField(term200857, term200857.getClass(), "behavior", enum254);
        setIntField(term200872, term200872.getClass(), "startAddress", -923019123);
        setIntField(term200872, term200872.getClass(), "endAddress", 1425210363);
        setLongField(term200875, term200875.getClass(), "clockPeriodInNs", 1000L);
        setField(term200875, term200875.getClass(), "behavior", enum254);
        setIntField(term200877, term200877.getClass(), "startAddress", 656143415);
        setIntField(term200877, term200877.getClass(), "endAddress", 1654162366);
        setLongField(term200880, term200880.getClass(), "clockPeriodInNs", 1000L);
        setField(term200880, term200880.getClass(), "behavior", enum254);
        setField(term200880, term200880.getClass(), "bus", null);
        setField(term200880, term200880.getClass(), "state", null);
        setLongField(term200880, term200880.getClass(), "opBeginTime", -5802364286448544947L);
        setField(term200877, term200877.getClass(), "cpu", term200880);
        setField(term200877, term200877.getClass(), "deviceMap", term200883);
        setField(term200877, term200877.getClass(), "deviceAddressArray", term200888);
        setField(term200875, term200875.getClass(), "bus", term200877);
        setIntField(term200889, term200889.getClass(), "a", 0);
        setIntField(term200889, term200889.getClass(), "x", 0);
        setIntField(term200889, term200889.getClass(), "y", 0);
        setIntField(term200889, term200889.getClass(), "sp", 0);
        setIntField(term200889, term200889.getClass(), "pc", 0);
        setIntField(term200889, term200889.getClass(), "ir", 0);
        setIntField(term200889, term200889.getClass(), "nextIr", 0);
        setField(term200889, term200889.getClass(), "args", term200897);
        setField(term200889, term200889.getClass(), "nextArgs", term200900);
        setIntField(term200889, term200889.getClass(), "instSize", 0);
        setBooleanField(term200889, term200889.getClass(), "opTrap", false);
        setBooleanField(term200889, term200889.getClass(), "irqAsserted", false);
        setBooleanField(term200889, term200889.getClass(), "nmiAsserted", false);
        setIntField(term200889, term200889.getClass(), "lastPc", 0);
        setBooleanField(term200889, term200889.getClass(), "carryFlag", false);
        setBooleanField(term200889, term200889.getClass(), "negativeFlag", false);
        setBooleanField(term200889, term200889.getClass(), "zeroFlag", false);
        setBooleanField(term200889, term200889.getClass(), "irqDisableFlag", false);
        setBooleanField(term200889, term200889.getClass(), "decimalModeFlag", false);
        setBooleanField(term200889, term200889.getClass(), "breakFlag", false);
        setBooleanField(term200889, term200889.getClass(), "overflowFlag", false);
        setLongField(term200889, term200889.getClass(), "stepCounter", 0L);
        setField(term200875, term200875.getClass(), "state", term200889);
        setLongField(term200875, term200875.getClass(), "opBeginTime", 7633060281229939158L);
        setField(term200872, term200872.getClass(), "cpu", term200875);
        setField(term200872, term200872.getClass(), "deviceMap", term200917);
        setField(term200872, term200872.getClass(), "deviceAddressArray", term200922);
        setField(term200857, term200857.getClass(), "bus", term200872);
        setIntField(term200923, term200923.getClass(), "a", 0);
        setIntField(term200923, term200923.getClass(), "x", 0);
        setIntField(term200923, term200923.getClass(), "y", 0);
        setIntField(term200923, term200923.getClass(), "sp", 0);
        setIntField(term200923, term200923.getClass(), "pc", 0);
        setIntField(term200923, term200923.getClass(), "ir", 0);
        setIntField(term200923, term200923.getClass(), "nextIr", 0);
        setField(term200923, term200923.getClass(), "args", term200931);
        setField(term200923, term200923.getClass(), "nextArgs", term200934);
        setIntField(term200923, term200923.getClass(), "instSize", 0);
        setBooleanField(term200923, term200923.getClass(), "opTrap", false);
        setBooleanField(term200923, term200923.getClass(), "irqAsserted", false);
        setBooleanField(term200923, term200923.getClass(), "nmiAsserted", false);
        setIntField(term200923, term200923.getClass(), "lastPc", 0);
        setBooleanField(term200923, term200923.getClass(), "carryFlag", false);
        setBooleanField(term200923, term200923.getClass(), "negativeFlag", false);
        setBooleanField(term200923, term200923.getClass(), "zeroFlag", false);
        setBooleanField(term200923, term200923.getClass(), "irqDisableFlag", false);
        setBooleanField(term200923, term200923.getClass(), "decimalModeFlag", false);
        setBooleanField(term200923, term200923.getClass(), "breakFlag", false);
        setBooleanField(term200923, term200923.getClass(), "overflowFlag", false);
        setLongField(term200923, term200923.getClass(), "stepCounter", 0L);
        setField(term200857, term200857.getClass(), "state", term200923);
        setLongField(term200857, term200857.getClass(), "opBeginTime", 4171742078739516731L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearIrq", argTypes, term200857, args);
    }

};


