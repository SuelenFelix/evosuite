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

public class Cpu_adcDecimal_15462535815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179215;
     Object term179309;
     Object term179311;

    public Cpu_adcDecimal_15462535815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term179314 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term179313 = ((Class) term179314).getDeclaredField((String) "NMOS_6502");
        ((Field) term179313).setAccessible(true);
        Object enum195 = ((Field) term179313).get((Object) null);
        HashMap term179241 = new HashMap();
        HashMap term179275 = new HashMap();
        term179215 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term179230 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term179233 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term179235 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term179238 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term179246 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term179247 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term179255 = (int[]) newIntArray(2);
        int[] term179258 = (int[]) newIntArray(2);
        Object[] term179280 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term179281 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term179289 = (int[]) newIntArray(2);
        int[] term179292 = (int[]) newIntArray(2);
        setLongField(term179215, term179215.getClass(), "clockPeriodInNs", 1000L);
        setField(term179215, term179215.getClass(), "behavior", enum195);
        setIntField(term179230, term179230.getClass(), "startAddress", -206826041);
        setIntField(term179230, term179230.getClass(), "endAddress", -866061427);
        setLongField(term179233, term179233.getClass(), "clockPeriodInNs", 1000L);
        setField(term179233, term179233.getClass(), "behavior", enum195);
        setIntField(term179235, term179235.getClass(), "startAddress", 1628734156);
        setIntField(term179235, term179235.getClass(), "endAddress", -578890556);
        setLongField(term179238, term179238.getClass(), "clockPeriodInNs", 1000L);
        setField(term179238, term179238.getClass(), "behavior", enum195);
        setField(term179238, term179238.getClass(), "bus", null);
        setField(term179238, term179238.getClass(), "state", null);
        setLongField(term179238, term179238.getClass(), "opBeginTime", -4645802432501468482L);
        setField(term179235, term179235.getClass(), "cpu", term179238);
        setField(term179235, term179235.getClass(), "deviceMap", term179241);
        setField(term179235, term179235.getClass(), "deviceAddressArray", term179246);
        setField(term179233, term179233.getClass(), "bus", term179235);
        setIntField(term179247, term179247.getClass(), "a", 0);
        setIntField(term179247, term179247.getClass(), "x", 0);
        setIntField(term179247, term179247.getClass(), "y", 0);
        setIntField(term179247, term179247.getClass(), "sp", 0);
        setIntField(term179247, term179247.getClass(), "pc", 0);
        setIntField(term179247, term179247.getClass(), "ir", 0);
        setIntField(term179247, term179247.getClass(), "nextIr", 0);
        setField(term179247, term179247.getClass(), "args", term179255);
        setField(term179247, term179247.getClass(), "nextArgs", term179258);
        setIntField(term179247, term179247.getClass(), "instSize", 0);
        setBooleanField(term179247, term179247.getClass(), "opTrap", false);
        setBooleanField(term179247, term179247.getClass(), "irqAsserted", false);
        setBooleanField(term179247, term179247.getClass(), "nmiAsserted", false);
        setIntField(term179247, term179247.getClass(), "lastPc", 0);
        setBooleanField(term179247, term179247.getClass(), "carryFlag", false);
        setBooleanField(term179247, term179247.getClass(), "negativeFlag", false);
        setBooleanField(term179247, term179247.getClass(), "zeroFlag", false);
        setBooleanField(term179247, term179247.getClass(), "irqDisableFlag", false);
        setBooleanField(term179247, term179247.getClass(), "decimalModeFlag", false);
        setBooleanField(term179247, term179247.getClass(), "breakFlag", false);
        setBooleanField(term179247, term179247.getClass(), "overflowFlag", false);
        setLongField(term179247, term179247.getClass(), "stepCounter", 0L);
        setField(term179233, term179233.getClass(), "state", term179247);
        setLongField(term179233, term179233.getClass(), "opBeginTime", 797348855178248421L);
        setField(term179230, term179230.getClass(), "cpu", term179233);
        setField(term179230, term179230.getClass(), "deviceMap", term179275);
        setField(term179230, term179230.getClass(), "deviceAddressArray", term179280);
        setField(term179215, term179215.getClass(), "bus", term179230);
        setIntField(term179281, term179281.getClass(), "a", 0);
        setIntField(term179281, term179281.getClass(), "x", 0);
        setIntField(term179281, term179281.getClass(), "y", 0);
        setIntField(term179281, term179281.getClass(), "sp", 0);
        setIntField(term179281, term179281.getClass(), "pc", 0);
        setIntField(term179281, term179281.getClass(), "ir", 0);
        setIntField(term179281, term179281.getClass(), "nextIr", 0);
        setField(term179281, term179281.getClass(), "args", term179289);
        setField(term179281, term179281.getClass(), "nextArgs", term179292);
        setIntField(term179281, term179281.getClass(), "instSize", 0);
        setBooleanField(term179281, term179281.getClass(), "opTrap", false);
        setBooleanField(term179281, term179281.getClass(), "irqAsserted", false);
        setBooleanField(term179281, term179281.getClass(), "nmiAsserted", false);
        setIntField(term179281, term179281.getClass(), "lastPc", 0);
        setBooleanField(term179281, term179281.getClass(), "carryFlag", false);
        setBooleanField(term179281, term179281.getClass(), "negativeFlag", false);
        setBooleanField(term179281, term179281.getClass(), "zeroFlag", false);
        setBooleanField(term179281, term179281.getClass(), "irqDisableFlag", false);
        setBooleanField(term179281, term179281.getClass(), "decimalModeFlag", false);
        setBooleanField(term179281, term179281.getClass(), "breakFlag", false);
        setBooleanField(term179281, term179281.getClass(), "overflowFlag", false);
        setLongField(term179281, term179281.getClass(), "stepCounter", 0L);
        setField(term179215, term179215.getClass(), "state", term179281);
        setLongField(term179215, term179215.getClass(), "opBeginTime", 4140938707845767186L);
        term179309 = new Integer(1857474216);
        term179311 = new Integer(-53071149);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term179309;
        args[1] = term179311;
        callMethod(klass, "adcDecimal", argTypes, term179215, args);
    }

};


