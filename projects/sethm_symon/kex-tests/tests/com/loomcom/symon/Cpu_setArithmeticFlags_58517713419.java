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

public class Cpu_setArithmeticFlags_58517713419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180695;
     Object term180789;

    public Cpu_setArithmeticFlags_58517713419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term180792 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term180791 = ((Class) term180792).getDeclaredField((String) "NMOS_6502");
        ((Field) term180791).setAccessible(true);
        Object enum199 = ((Field) term180791).get((Object) null);
        HashMap term180721 = new HashMap();
        HashMap term180755 = new HashMap();
        term180695 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term180710 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term180713 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term180715 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term180718 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term180726 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term180727 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term180735 = (int[]) newIntArray(2);
        int[] term180738 = (int[]) newIntArray(2);
        Object[] term180760 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term180761 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term180769 = (int[]) newIntArray(2);
        int[] term180772 = (int[]) newIntArray(2);
        setLongField(term180695, term180695.getClass(), "clockPeriodInNs", 1000L);
        setField(term180695, term180695.getClass(), "behavior", enum199);
        setIntField(term180710, term180710.getClass(), "startAddress", 972415791);
        setIntField(term180710, term180710.getClass(), "endAddress", -263062220);
        setLongField(term180713, term180713.getClass(), "clockPeriodInNs", 1000L);
        setField(term180713, term180713.getClass(), "behavior", enum199);
        setIntField(term180715, term180715.getClass(), "startAddress", -814910184);
        setIntField(term180715, term180715.getClass(), "endAddress", -82425798);
        setLongField(term180718, term180718.getClass(), "clockPeriodInNs", 1000L);
        setField(term180718, term180718.getClass(), "behavior", enum199);
        setField(term180718, term180718.getClass(), "bus", null);
        setField(term180718, term180718.getClass(), "state", null);
        setLongField(term180718, term180718.getClass(), "opBeginTime", 5841040494527118725L);
        setField(term180715, term180715.getClass(), "cpu", term180718);
        setField(term180715, term180715.getClass(), "deviceMap", term180721);
        setField(term180715, term180715.getClass(), "deviceAddressArray", term180726);
        setField(term180713, term180713.getClass(), "bus", term180715);
        setIntField(term180727, term180727.getClass(), "a", 0);
        setIntField(term180727, term180727.getClass(), "x", 0);
        setIntField(term180727, term180727.getClass(), "y", 0);
        setIntField(term180727, term180727.getClass(), "sp", 0);
        setIntField(term180727, term180727.getClass(), "pc", 0);
        setIntField(term180727, term180727.getClass(), "ir", 0);
        setIntField(term180727, term180727.getClass(), "nextIr", 0);
        setField(term180727, term180727.getClass(), "args", term180735);
        setField(term180727, term180727.getClass(), "nextArgs", term180738);
        setIntField(term180727, term180727.getClass(), "instSize", 0);
        setBooleanField(term180727, term180727.getClass(), "opTrap", false);
        setBooleanField(term180727, term180727.getClass(), "irqAsserted", false);
        setBooleanField(term180727, term180727.getClass(), "nmiAsserted", false);
        setIntField(term180727, term180727.getClass(), "lastPc", 0);
        setBooleanField(term180727, term180727.getClass(), "carryFlag", false);
        setBooleanField(term180727, term180727.getClass(), "negativeFlag", false);
        setBooleanField(term180727, term180727.getClass(), "zeroFlag", false);
        setBooleanField(term180727, term180727.getClass(), "irqDisableFlag", false);
        setBooleanField(term180727, term180727.getClass(), "decimalModeFlag", false);
        setBooleanField(term180727, term180727.getClass(), "breakFlag", false);
        setBooleanField(term180727, term180727.getClass(), "overflowFlag", false);
        setLongField(term180727, term180727.getClass(), "stepCounter", 0L);
        setField(term180713, term180713.getClass(), "state", term180727);
        setLongField(term180713, term180713.getClass(), "opBeginTime", 5535938323123427777L);
        setField(term180710, term180710.getClass(), "cpu", term180713);
        setField(term180710, term180710.getClass(), "deviceMap", term180755);
        setField(term180710, term180710.getClass(), "deviceAddressArray", term180760);
        setField(term180695, term180695.getClass(), "bus", term180710);
        setIntField(term180761, term180761.getClass(), "a", 0);
        setIntField(term180761, term180761.getClass(), "x", 0);
        setIntField(term180761, term180761.getClass(), "y", 0);
        setIntField(term180761, term180761.getClass(), "sp", 0);
        setIntField(term180761, term180761.getClass(), "pc", 0);
        setIntField(term180761, term180761.getClass(), "ir", 0);
        setIntField(term180761, term180761.getClass(), "nextIr", 0);
        setField(term180761, term180761.getClass(), "args", term180769);
        setField(term180761, term180761.getClass(), "nextArgs", term180772);
        setIntField(term180761, term180761.getClass(), "instSize", 0);
        setBooleanField(term180761, term180761.getClass(), "opTrap", false);
        setBooleanField(term180761, term180761.getClass(), "irqAsserted", false);
        setBooleanField(term180761, term180761.getClass(), "nmiAsserted", false);
        setIntField(term180761, term180761.getClass(), "lastPc", 0);
        setBooleanField(term180761, term180761.getClass(), "carryFlag", false);
        setBooleanField(term180761, term180761.getClass(), "negativeFlag", false);
        setBooleanField(term180761, term180761.getClass(), "zeroFlag", false);
        setBooleanField(term180761, term180761.getClass(), "irqDisableFlag", false);
        setBooleanField(term180761, term180761.getClass(), "decimalModeFlag", false);
        setBooleanField(term180761, term180761.getClass(), "breakFlag", false);
        setBooleanField(term180761, term180761.getClass(), "overflowFlag", false);
        setLongField(term180761, term180761.getClass(), "stepCounter", 0L);
        setField(term180695, term180695.getClass(), "state", term180761);
        setLongField(term180695, term180695.getClass(), "opBeginTime", 1292632924316952683L);
        term180789 = new Integer(-415493508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term180789;
        callMethod(klass, "setArithmeticFlags", argTypes, term180695, args);
    }

};


