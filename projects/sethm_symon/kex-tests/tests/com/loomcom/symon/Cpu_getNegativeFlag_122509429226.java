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

public class Cpu_getNegativeFlag_122509429226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183269;

    public Cpu_getNegativeFlag_122509429226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term183364 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term183363 = ((Class) term183364).getDeclaredField((String) "NMOS_6502");
        ((Field) term183363).setAccessible(true);
        Object enum206 = ((Field) term183363).get((Object) null);
        HashMap term183295 = new HashMap();
        HashMap term183329 = new HashMap();
        term183269 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term183284 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term183287 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term183289 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term183292 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term183300 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term183301 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term183309 = (int[]) newIntArray(2);
        int[] term183312 = (int[]) newIntArray(2);
        Object[] term183334 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term183335 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term183343 = (int[]) newIntArray(2);
        int[] term183346 = (int[]) newIntArray(2);
        setLongField(term183269, term183269.getClass(), "clockPeriodInNs", 1000L);
        setField(term183269, term183269.getClass(), "behavior", enum206);
        setIntField(term183284, term183284.getClass(), "startAddress", 1011940597);
        setIntField(term183284, term183284.getClass(), "endAddress", -404969989);
        setLongField(term183287, term183287.getClass(), "clockPeriodInNs", 1000L);
        setField(term183287, term183287.getClass(), "behavior", enum206);
        setIntField(term183289, term183289.getClass(), "startAddress", 1371124822);
        setIntField(term183289, term183289.getClass(), "endAddress", 1936895143);
        setLongField(term183292, term183292.getClass(), "clockPeriodInNs", 1000L);
        setField(term183292, term183292.getClass(), "behavior", enum206);
        setField(term183292, term183292.getClass(), "bus", null);
        setField(term183292, term183292.getClass(), "state", null);
        setLongField(term183292, term183292.getClass(), "opBeginTime", -3646702249834556847L);
        setField(term183289, term183289.getClass(), "cpu", term183292);
        setField(term183289, term183289.getClass(), "deviceMap", term183295);
        setField(term183289, term183289.getClass(), "deviceAddressArray", term183300);
        setField(term183287, term183287.getClass(), "bus", term183289);
        setIntField(term183301, term183301.getClass(), "a", 0);
        setIntField(term183301, term183301.getClass(), "x", 0);
        setIntField(term183301, term183301.getClass(), "y", 0);
        setIntField(term183301, term183301.getClass(), "sp", 0);
        setIntField(term183301, term183301.getClass(), "pc", 0);
        setIntField(term183301, term183301.getClass(), "ir", 0);
        setIntField(term183301, term183301.getClass(), "nextIr", 0);
        setField(term183301, term183301.getClass(), "args", term183309);
        setField(term183301, term183301.getClass(), "nextArgs", term183312);
        setIntField(term183301, term183301.getClass(), "instSize", 0);
        setBooleanField(term183301, term183301.getClass(), "opTrap", false);
        setBooleanField(term183301, term183301.getClass(), "irqAsserted", false);
        setBooleanField(term183301, term183301.getClass(), "nmiAsserted", false);
        setIntField(term183301, term183301.getClass(), "lastPc", 0);
        setBooleanField(term183301, term183301.getClass(), "carryFlag", false);
        setBooleanField(term183301, term183301.getClass(), "negativeFlag", false);
        setBooleanField(term183301, term183301.getClass(), "zeroFlag", false);
        setBooleanField(term183301, term183301.getClass(), "irqDisableFlag", false);
        setBooleanField(term183301, term183301.getClass(), "decimalModeFlag", false);
        setBooleanField(term183301, term183301.getClass(), "breakFlag", false);
        setBooleanField(term183301, term183301.getClass(), "overflowFlag", false);
        setLongField(term183301, term183301.getClass(), "stepCounter", 0L);
        setField(term183287, term183287.getClass(), "state", term183301);
        setLongField(term183287, term183287.getClass(), "opBeginTime", 2701558556303760915L);
        setField(term183284, term183284.getClass(), "cpu", term183287);
        setField(term183284, term183284.getClass(), "deviceMap", term183329);
        setField(term183284, term183284.getClass(), "deviceAddressArray", term183334);
        setField(term183269, term183269.getClass(), "bus", term183284);
        setIntField(term183335, term183335.getClass(), "a", 0);
        setIntField(term183335, term183335.getClass(), "x", 0);
        setIntField(term183335, term183335.getClass(), "y", 0);
        setIntField(term183335, term183335.getClass(), "sp", 0);
        setIntField(term183335, term183335.getClass(), "pc", 0);
        setIntField(term183335, term183335.getClass(), "ir", 0);
        setIntField(term183335, term183335.getClass(), "nextIr", 0);
        setField(term183335, term183335.getClass(), "args", term183343);
        setField(term183335, term183335.getClass(), "nextArgs", term183346);
        setIntField(term183335, term183335.getClass(), "instSize", 0);
        setBooleanField(term183335, term183335.getClass(), "opTrap", false);
        setBooleanField(term183335, term183335.getClass(), "irqAsserted", false);
        setBooleanField(term183335, term183335.getClass(), "nmiAsserted", false);
        setIntField(term183335, term183335.getClass(), "lastPc", 0);
        setBooleanField(term183335, term183335.getClass(), "carryFlag", false);
        setBooleanField(term183335, term183335.getClass(), "negativeFlag", false);
        setBooleanField(term183335, term183335.getClass(), "zeroFlag", false);
        setBooleanField(term183335, term183335.getClass(), "irqDisableFlag", false);
        setBooleanField(term183335, term183335.getClass(), "decimalModeFlag", false);
        setBooleanField(term183335, term183335.getClass(), "breakFlag", false);
        setBooleanField(term183335, term183335.getClass(), "overflowFlag", false);
        setLongField(term183335, term183335.getClass(), "stepCounter", 0L);
        setField(term183269, term183269.getClass(), "state", term183335);
        setLongField(term183269, term183269.getClass(), "opBeginTime", 4187385369384657492L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNegativeFlag", argTypes, term183269, args);
    }

};


