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

public class Cpu_assertIrq_13256267573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200491;

    public Cpu_assertIrq_13256267573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term200586 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term200585 = ((Class) term200586).getDeclaredField((String) "NMOS_6502");
        ((Field) term200585).setAccessible(true);
        Object enum253 = ((Field) term200585).get((Object) null);
        HashMap term200517 = new HashMap();
        HashMap term200551 = new HashMap();
        term200491 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term200506 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term200509 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term200511 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term200514 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term200522 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term200523 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term200531 = (int[]) newIntArray(2);
        int[] term200534 = (int[]) newIntArray(2);
        Object[] term200556 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term200557 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term200565 = (int[]) newIntArray(2);
        int[] term200568 = (int[]) newIntArray(2);
        setLongField(term200491, term200491.getClass(), "clockPeriodInNs", 1000L);
        setField(term200491, term200491.getClass(), "behavior", enum253);
        setIntField(term200506, term200506.getClass(), "startAddress", -718673454);
        setIntField(term200506, term200506.getClass(), "endAddress", -662035181);
        setLongField(term200509, term200509.getClass(), "clockPeriodInNs", 1000L);
        setField(term200509, term200509.getClass(), "behavior", enum253);
        setIntField(term200511, term200511.getClass(), "startAddress", 430345693);
        setIntField(term200511, term200511.getClass(), "endAddress", -516065529);
        setLongField(term200514, term200514.getClass(), "clockPeriodInNs", 1000L);
        setField(term200514, term200514.getClass(), "behavior", enum253);
        setField(term200514, term200514.getClass(), "bus", null);
        setField(term200514, term200514.getClass(), "state", null);
        setLongField(term200514, term200514.getClass(), "opBeginTime", -5803004674995774129L);
        setField(term200511, term200511.getClass(), "cpu", term200514);
        setField(term200511, term200511.getClass(), "deviceMap", term200517);
        setField(term200511, term200511.getClass(), "deviceAddressArray", term200522);
        setField(term200509, term200509.getClass(), "bus", term200511);
        setIntField(term200523, term200523.getClass(), "a", 0);
        setIntField(term200523, term200523.getClass(), "x", 0);
        setIntField(term200523, term200523.getClass(), "y", 0);
        setIntField(term200523, term200523.getClass(), "sp", 0);
        setIntField(term200523, term200523.getClass(), "pc", 0);
        setIntField(term200523, term200523.getClass(), "ir", 0);
        setIntField(term200523, term200523.getClass(), "nextIr", 0);
        setField(term200523, term200523.getClass(), "args", term200531);
        setField(term200523, term200523.getClass(), "nextArgs", term200534);
        setIntField(term200523, term200523.getClass(), "instSize", 0);
        setBooleanField(term200523, term200523.getClass(), "opTrap", false);
        setBooleanField(term200523, term200523.getClass(), "irqAsserted", false);
        setBooleanField(term200523, term200523.getClass(), "nmiAsserted", false);
        setIntField(term200523, term200523.getClass(), "lastPc", 0);
        setBooleanField(term200523, term200523.getClass(), "carryFlag", false);
        setBooleanField(term200523, term200523.getClass(), "negativeFlag", false);
        setBooleanField(term200523, term200523.getClass(), "zeroFlag", false);
        setBooleanField(term200523, term200523.getClass(), "irqDisableFlag", false);
        setBooleanField(term200523, term200523.getClass(), "decimalModeFlag", false);
        setBooleanField(term200523, term200523.getClass(), "breakFlag", false);
        setBooleanField(term200523, term200523.getClass(), "overflowFlag", false);
        setLongField(term200523, term200523.getClass(), "stepCounter", 0L);
        setField(term200509, term200509.getClass(), "state", term200523);
        setLongField(term200509, term200509.getClass(), "opBeginTime", 5467431248910278098L);
        setField(term200506, term200506.getClass(), "cpu", term200509);
        setField(term200506, term200506.getClass(), "deviceMap", term200551);
        setField(term200506, term200506.getClass(), "deviceAddressArray", term200556);
        setField(term200491, term200491.getClass(), "bus", term200506);
        setIntField(term200557, term200557.getClass(), "a", 0);
        setIntField(term200557, term200557.getClass(), "x", 0);
        setIntField(term200557, term200557.getClass(), "y", 0);
        setIntField(term200557, term200557.getClass(), "sp", 0);
        setIntField(term200557, term200557.getClass(), "pc", 0);
        setIntField(term200557, term200557.getClass(), "ir", 0);
        setIntField(term200557, term200557.getClass(), "nextIr", 0);
        setField(term200557, term200557.getClass(), "args", term200565);
        setField(term200557, term200557.getClass(), "nextArgs", term200568);
        setIntField(term200557, term200557.getClass(), "instSize", 0);
        setBooleanField(term200557, term200557.getClass(), "opTrap", false);
        setBooleanField(term200557, term200557.getClass(), "irqAsserted", false);
        setBooleanField(term200557, term200557.getClass(), "nmiAsserted", false);
        setIntField(term200557, term200557.getClass(), "lastPc", 0);
        setBooleanField(term200557, term200557.getClass(), "carryFlag", false);
        setBooleanField(term200557, term200557.getClass(), "negativeFlag", false);
        setBooleanField(term200557, term200557.getClass(), "zeroFlag", false);
        setBooleanField(term200557, term200557.getClass(), "irqDisableFlag", false);
        setBooleanField(term200557, term200557.getClass(), "decimalModeFlag", false);
        setBooleanField(term200557, term200557.getClass(), "breakFlag", false);
        setBooleanField(term200557, term200557.getClass(), "overflowFlag", false);
        setLongField(term200557, term200557.getClass(), "stepCounter", 0L);
        setField(term200491, term200491.getClass(), "state", term200557);
        setLongField(term200491, term200491.getClass(), "opBeginTime", -6624097117784103684L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "assertIrq", argTypes, term200491, args);
    }

};


