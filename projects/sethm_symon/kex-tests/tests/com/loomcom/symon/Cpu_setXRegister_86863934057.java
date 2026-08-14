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

public class Cpu_setXRegister_86863934057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194625;
     Object term194719;

    public Cpu_setXRegister_86863934057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term194722 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term194721 = ((Class) term194722).getDeclaredField((String) "NMOS_6502");
        ((Field) term194721).setAccessible(true);
        Object enum237 = ((Field) term194721).get((Object) null);
        HashMap term194651 = new HashMap();
        HashMap term194685 = new HashMap();
        term194625 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term194640 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term194643 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term194645 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term194648 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term194656 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term194657 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term194665 = (int[]) newIntArray(2);
        int[] term194668 = (int[]) newIntArray(2);
        Object[] term194690 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term194691 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term194699 = (int[]) newIntArray(2);
        int[] term194702 = (int[]) newIntArray(2);
        setLongField(term194625, term194625.getClass(), "clockPeriodInNs", 1000L);
        setField(term194625, term194625.getClass(), "behavior", enum237);
        setIntField(term194640, term194640.getClass(), "startAddress", 286266173);
        setIntField(term194640, term194640.getClass(), "endAddress", 524985992);
        setLongField(term194643, term194643.getClass(), "clockPeriodInNs", 1000L);
        setField(term194643, term194643.getClass(), "behavior", enum237);
        setIntField(term194645, term194645.getClass(), "startAddress", 1329035477);
        setIntField(term194645, term194645.getClass(), "endAddress", 479749926);
        setLongField(term194648, term194648.getClass(), "clockPeriodInNs", 1000L);
        setField(term194648, term194648.getClass(), "behavior", enum237);
        setField(term194648, term194648.getClass(), "bus", null);
        setField(term194648, term194648.getClass(), "state", null);
        setLongField(term194648, term194648.getClass(), "opBeginTime", -2253606887164749750L);
        setField(term194645, term194645.getClass(), "cpu", term194648);
        setField(term194645, term194645.getClass(), "deviceMap", term194651);
        setField(term194645, term194645.getClass(), "deviceAddressArray", term194656);
        setField(term194643, term194643.getClass(), "bus", term194645);
        setIntField(term194657, term194657.getClass(), "a", 0);
        setIntField(term194657, term194657.getClass(), "x", 0);
        setIntField(term194657, term194657.getClass(), "y", 0);
        setIntField(term194657, term194657.getClass(), "sp", 0);
        setIntField(term194657, term194657.getClass(), "pc", 0);
        setIntField(term194657, term194657.getClass(), "ir", 0);
        setIntField(term194657, term194657.getClass(), "nextIr", 0);
        setField(term194657, term194657.getClass(), "args", term194665);
        setField(term194657, term194657.getClass(), "nextArgs", term194668);
        setIntField(term194657, term194657.getClass(), "instSize", 0);
        setBooleanField(term194657, term194657.getClass(), "opTrap", false);
        setBooleanField(term194657, term194657.getClass(), "irqAsserted", false);
        setBooleanField(term194657, term194657.getClass(), "nmiAsserted", false);
        setIntField(term194657, term194657.getClass(), "lastPc", 0);
        setBooleanField(term194657, term194657.getClass(), "carryFlag", false);
        setBooleanField(term194657, term194657.getClass(), "negativeFlag", false);
        setBooleanField(term194657, term194657.getClass(), "zeroFlag", false);
        setBooleanField(term194657, term194657.getClass(), "irqDisableFlag", false);
        setBooleanField(term194657, term194657.getClass(), "decimalModeFlag", false);
        setBooleanField(term194657, term194657.getClass(), "breakFlag", false);
        setBooleanField(term194657, term194657.getClass(), "overflowFlag", false);
        setLongField(term194657, term194657.getClass(), "stepCounter", 0L);
        setField(term194643, term194643.getClass(), "state", term194657);
        setLongField(term194643, term194643.getClass(), "opBeginTime", 8324238777146638579L);
        setField(term194640, term194640.getClass(), "cpu", term194643);
        setField(term194640, term194640.getClass(), "deviceMap", term194685);
        setField(term194640, term194640.getClass(), "deviceAddressArray", term194690);
        setField(term194625, term194625.getClass(), "bus", term194640);
        setIntField(term194691, term194691.getClass(), "a", 0);
        setIntField(term194691, term194691.getClass(), "x", 0);
        setIntField(term194691, term194691.getClass(), "y", 0);
        setIntField(term194691, term194691.getClass(), "sp", 0);
        setIntField(term194691, term194691.getClass(), "pc", 0);
        setIntField(term194691, term194691.getClass(), "ir", 0);
        setIntField(term194691, term194691.getClass(), "nextIr", 0);
        setField(term194691, term194691.getClass(), "args", term194699);
        setField(term194691, term194691.getClass(), "nextArgs", term194702);
        setIntField(term194691, term194691.getClass(), "instSize", 0);
        setBooleanField(term194691, term194691.getClass(), "opTrap", false);
        setBooleanField(term194691, term194691.getClass(), "irqAsserted", false);
        setBooleanField(term194691, term194691.getClass(), "nmiAsserted", false);
        setIntField(term194691, term194691.getClass(), "lastPc", 0);
        setBooleanField(term194691, term194691.getClass(), "carryFlag", false);
        setBooleanField(term194691, term194691.getClass(), "negativeFlag", false);
        setBooleanField(term194691, term194691.getClass(), "zeroFlag", false);
        setBooleanField(term194691, term194691.getClass(), "irqDisableFlag", false);
        setBooleanField(term194691, term194691.getClass(), "decimalModeFlag", false);
        setBooleanField(term194691, term194691.getClass(), "breakFlag", false);
        setBooleanField(term194691, term194691.getClass(), "overflowFlag", false);
        setLongField(term194691, term194691.getClass(), "stepCounter", 0L);
        setField(term194625, term194625.getClass(), "state", term194691);
        setLongField(term194625, term194625.getClass(), "opBeginTime", 8580739755779561159L);
        term194719 = new Integer(-190426986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term194719;
        callMethod(klass, "setXRegister", argTypes, term194625, args);
    }

};


