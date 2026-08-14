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

public class Bus_assertNmi_13699858914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40184;

    public Bus_assertNmi_13699858914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40273 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term40272 = ((Class) term40273).getDeclaredField((String) "NMOS_6502");
        ((Field) term40272).setAccessible(true);
        Object enum34 = ((Field) term40272).get((Object) null);
        HashMap term40232 = new HashMap();
        HashMap term40266 = new HashMap();
        term40184 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term40187 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term40202 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term40205 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term40207 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term40210 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term40237 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term40238 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term40246 = (int[]) newIntArray(2);
        int[] term40249 = (int[]) newIntArray(2);
        Object[] term40271 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        setIntField(term40184, term40184.getClass(), "startAddress", 680714112);
        setIntField(term40184, term40184.getClass(), "endAddress", 385297023);
        setLongField(term40187, term40187.getClass(), "clockPeriodInNs", 1000L);
        setField(term40187, term40187.getClass(), "behavior", enum34);
        setIntField(term40202, term40202.getClass(), "startAddress", -134092543);
        setIntField(term40202, term40202.getClass(), "endAddress", -1703642288);
        setLongField(term40205, term40205.getClass(), "clockPeriodInNs", 1000L);
        setField(term40205, term40205.getClass(), "behavior", enum34);
        setIntField(term40207, term40207.getClass(), "startAddress", 2075139747);
        setIntField(term40207, term40207.getClass(), "endAddress", 2092881418);
        setField(term40207, term40207.getClass(), "cpu", null);
        setField(term40207, term40207.getClass(), "deviceMap", null);
        setField(term40207, term40207.getClass(), "deviceAddressArray", null);
        setField(term40205, term40205.getClass(), "bus", term40207);
        setIntField(term40210, term40210.getClass(), "a", 0);
        setIntField(term40210, term40210.getClass(), "x", 0);
        setIntField(term40210, term40210.getClass(), "y", 0);
        setIntField(term40210, term40210.getClass(), "sp", 0);
        setIntField(term40210, term40210.getClass(), "pc", 0);
        setIntField(term40210, term40210.getClass(), "ir", 0);
        setIntField(term40210, term40210.getClass(), "nextIr", 0);
        setField(term40210, term40210.getClass(), "args", null);
        setField(term40210, term40210.getClass(), "nextArgs", null);
        setIntField(term40210, term40210.getClass(), "instSize", 0);
        setBooleanField(term40210, term40210.getClass(), "opTrap", false);
        setBooleanField(term40210, term40210.getClass(), "irqAsserted", false);
        setBooleanField(term40210, term40210.getClass(), "nmiAsserted", false);
        setIntField(term40210, term40210.getClass(), "lastPc", 0);
        setBooleanField(term40210, term40210.getClass(), "carryFlag", false);
        setBooleanField(term40210, term40210.getClass(), "negativeFlag", false);
        setBooleanField(term40210, term40210.getClass(), "zeroFlag", false);
        setBooleanField(term40210, term40210.getClass(), "irqDisableFlag", false);
        setBooleanField(term40210, term40210.getClass(), "decimalModeFlag", false);
        setBooleanField(term40210, term40210.getClass(), "breakFlag", false);
        setBooleanField(term40210, term40210.getClass(), "overflowFlag", false);
        setLongField(term40210, term40210.getClass(), "stepCounter", 0L);
        setField(term40205, term40205.getClass(), "state", term40210);
        setLongField(term40205, term40205.getClass(), "opBeginTime", -8019730974733786399L);
        setField(term40202, term40202.getClass(), "cpu", term40205);
        setField(term40202, term40202.getClass(), "deviceMap", term40232);
        setField(term40202, term40202.getClass(), "deviceAddressArray", term40237);
        setField(term40187, term40187.getClass(), "bus", term40202);
        setIntField(term40238, term40238.getClass(), "a", 0);
        setIntField(term40238, term40238.getClass(), "x", 0);
        setIntField(term40238, term40238.getClass(), "y", 0);
        setIntField(term40238, term40238.getClass(), "sp", 0);
        setIntField(term40238, term40238.getClass(), "pc", 0);
        setIntField(term40238, term40238.getClass(), "ir", 0);
        setIntField(term40238, term40238.getClass(), "nextIr", 0);
        setField(term40238, term40238.getClass(), "args", term40246);
        setField(term40238, term40238.getClass(), "nextArgs", term40249);
        setIntField(term40238, term40238.getClass(), "instSize", 0);
        setBooleanField(term40238, term40238.getClass(), "opTrap", false);
        setBooleanField(term40238, term40238.getClass(), "irqAsserted", false);
        setBooleanField(term40238, term40238.getClass(), "nmiAsserted", false);
        setIntField(term40238, term40238.getClass(), "lastPc", 0);
        setBooleanField(term40238, term40238.getClass(), "carryFlag", false);
        setBooleanField(term40238, term40238.getClass(), "negativeFlag", false);
        setBooleanField(term40238, term40238.getClass(), "zeroFlag", false);
        setBooleanField(term40238, term40238.getClass(), "irqDisableFlag", false);
        setBooleanField(term40238, term40238.getClass(), "decimalModeFlag", false);
        setBooleanField(term40238, term40238.getClass(), "breakFlag", false);
        setBooleanField(term40238, term40238.getClass(), "overflowFlag", false);
        setLongField(term40238, term40238.getClass(), "stepCounter", 0L);
        setField(term40187, term40187.getClass(), "state", term40238);
        setLongField(term40187, term40187.getClass(), "opBeginTime", 394960377236392159L);
        setField(term40184, term40184.getClass(), "cpu", term40187);
        setField(term40184, term40184.getClass(), "deviceMap", term40266);
        setField(term40184, term40184.getClass(), "deviceAddressArray", term40271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "assertNmi", argTypes, term40184, args);
    }

};


