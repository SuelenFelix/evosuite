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

public class Acia6551_reset_4749087896 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23111;

    public Acia6551_reset_4749087896() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term23229 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term23228 = ((Class) term23229).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term23228).setAccessible(true);
        Object enum63 = ((Field) term23228).get((Object) null);
        HashMap term23169 = new HashMap();
        HashMap term23203 = new HashMap();
        HashMap term23210 = new HashMap();
        Set<Object> term23520 =  ((Map) term23210).keySet();
        HashSet term23209 = new HashSet((Collection<? extends Object>) term23520);
        term23111 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6551"));
        Object term23140 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term23155 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term23158 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term23163 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term23166 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term23174 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term23175 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term23183 = (int[]) newIntArray(2);
        int[] term23186 = (int[]) newIntArray(2);
        Object[] term23208 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        setIntField(term23111, term23111.getClass(), "commandRegister", 186472650);
        setIntField(term23111, term23111.getClass(), "controlRegister", 279675992);
        setField(term23111, term23111.getClass(), "name", "LvJFtLBaxj");
        setIntField(term23111, term23111.getClass(), "baseAddress", -1626074989);
        setBooleanField(term23111, term23111.getClass(), "receiveIrqEnabled", true);
        setBooleanField(term23111, term23111.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term23111, term23111.getClass(), "overrun", true);
        setBooleanField(term23111, term23111.getClass(), "interrupt", true);
        setLongField(term23111, term23111.getClass(), "lastTxWrite", -4867941246533901410L);
        setLongField(term23111, term23111.getClass(), "lastRxRead", 1044883697493326351L);
        setIntField(term23111, term23111.getClass(), "baudRate", -552272253);
        setLongField(term23111, term23111.getClass(), "baudRateDelay", -7406618974062419277L);
        setIntField(term23111, term23111.getClass(), "rxChar", -633523956);
        setIntField(term23111, term23111.getClass(), "txChar", 1761540885);
        setBooleanField(term23111, term23111.getClass(), "rxFull", false);
        setBooleanField(term23111, term23111.getClass(), "txEmpty", false);
        setIntField(term23111, term23111.getClass(), "size", -168498989);
        setIntField(term23140, term23140.getClass(), "startAddress", 388247095);
        setIntField(term23140, term23140.getClass(), "endAddress", -1320402633);
        setField(term23111, term23111.getClass(), "memoryRange", term23140);
        setIntField(term23155, term23155.getClass(), "startAddress", 919602316);
        setIntField(term23155, term23155.getClass(), "endAddress", 1833713431);
        setLongField(term23158, term23158.getClass(), "clockPeriodInNs", 1000L);
        setField(term23158, term23158.getClass(), "behavior", enum63);
        setIntField(term23163, term23163.getClass(), "startAddress", -706222608);
        setIntField(term23163, term23163.getClass(), "endAddress", -2003607923);
        setLongField(term23166, term23166.getClass(), "clockPeriodInNs", 1000L);
        setField(term23166, term23166.getClass(), "behavior", enum63);
        setField(term23166, term23166.getClass(), "bus", null);
        setField(term23166, term23166.getClass(), "state", null);
        setLongField(term23166, term23166.getClass(), "opBeginTime", 1253549421411622358L);
        setField(term23163, term23163.getClass(), "cpu", term23166);
        setField(term23163, term23163.getClass(), "deviceMap", term23169);
        setField(term23163, term23163.getClass(), "deviceAddressArray", term23174);
        setField(term23158, term23158.getClass(), "bus", term23163);
        setIntField(term23175, term23175.getClass(), "a", 0);
        setIntField(term23175, term23175.getClass(), "x", 0);
        setIntField(term23175, term23175.getClass(), "y", 0);
        setIntField(term23175, term23175.getClass(), "sp", 0);
        setIntField(term23175, term23175.getClass(), "pc", 0);
        setIntField(term23175, term23175.getClass(), "ir", 0);
        setIntField(term23175, term23175.getClass(), "nextIr", 0);
        setField(term23175, term23175.getClass(), "args", term23183);
        setField(term23175, term23175.getClass(), "nextArgs", term23186);
        setIntField(term23175, term23175.getClass(), "instSize", 0);
        setBooleanField(term23175, term23175.getClass(), "opTrap", false);
        setBooleanField(term23175, term23175.getClass(), "irqAsserted", false);
        setBooleanField(term23175, term23175.getClass(), "nmiAsserted", false);
        setIntField(term23175, term23175.getClass(), "lastPc", 0);
        setBooleanField(term23175, term23175.getClass(), "carryFlag", false);
        setBooleanField(term23175, term23175.getClass(), "negativeFlag", false);
        setBooleanField(term23175, term23175.getClass(), "zeroFlag", false);
        setBooleanField(term23175, term23175.getClass(), "irqDisableFlag", false);
        setBooleanField(term23175, term23175.getClass(), "decimalModeFlag", false);
        setBooleanField(term23175, term23175.getClass(), "breakFlag", false);
        setBooleanField(term23175, term23175.getClass(), "overflowFlag", false);
        setLongField(term23175, term23175.getClass(), "stepCounter", 0L);
        setField(term23158, term23158.getClass(), "state", term23175);
        setLongField(term23158, term23158.getClass(), "opBeginTime", 3666226122807672448L);
        setField(term23155, term23155.getClass(), "cpu", term23158);
        setField(term23155, term23155.getClass(), "deviceMap", term23203);
        setField(term23155, term23155.getClass(), "deviceAddressArray", term23208);
        setField(term23111, term23111.getClass(), "bus", term23155);
        setField(term23111, term23111.getClass(), "deviceChangeListeners", term23209);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6551");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term23111, args);
    }

};


