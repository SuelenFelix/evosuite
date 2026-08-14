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

public class Cpu_clearOverflowFlag_129965800451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192427;

    public Cpu_clearOverflowFlag_129965800451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term192522 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term192521 = ((Class) term192522).getDeclaredField((String) "NMOS_6502");
        ((Field) term192521).setAccessible(true);
        Object enum231 = ((Field) term192521).get((Object) null);
        HashMap term192453 = new HashMap();
        HashMap term192487 = new HashMap();
        term192427 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term192442 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term192445 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term192447 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term192450 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term192458 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term192459 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term192467 = (int[]) newIntArray(2);
        int[] term192470 = (int[]) newIntArray(2);
        Object[] term192492 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term192493 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term192501 = (int[]) newIntArray(2);
        int[] term192504 = (int[]) newIntArray(2);
        setLongField(term192427, term192427.getClass(), "clockPeriodInNs", 1000L);
        setField(term192427, term192427.getClass(), "behavior", enum231);
        setIntField(term192442, term192442.getClass(), "startAddress", 2062913883);
        setIntField(term192442, term192442.getClass(), "endAddress", 873881120);
        setLongField(term192445, term192445.getClass(), "clockPeriodInNs", 1000L);
        setField(term192445, term192445.getClass(), "behavior", enum231);
        setIntField(term192447, term192447.getClass(), "startAddress", 1451809092);
        setIntField(term192447, term192447.getClass(), "endAddress", -274316319);
        setLongField(term192450, term192450.getClass(), "clockPeriodInNs", 1000L);
        setField(term192450, term192450.getClass(), "behavior", enum231);
        setField(term192450, term192450.getClass(), "bus", null);
        setField(term192450, term192450.getClass(), "state", null);
        setLongField(term192450, term192450.getClass(), "opBeginTime", 3058795643782579829L);
        setField(term192447, term192447.getClass(), "cpu", term192450);
        setField(term192447, term192447.getClass(), "deviceMap", term192453);
        setField(term192447, term192447.getClass(), "deviceAddressArray", term192458);
        setField(term192445, term192445.getClass(), "bus", term192447);
        setIntField(term192459, term192459.getClass(), "a", 0);
        setIntField(term192459, term192459.getClass(), "x", 0);
        setIntField(term192459, term192459.getClass(), "y", 0);
        setIntField(term192459, term192459.getClass(), "sp", 0);
        setIntField(term192459, term192459.getClass(), "pc", 0);
        setIntField(term192459, term192459.getClass(), "ir", 0);
        setIntField(term192459, term192459.getClass(), "nextIr", 0);
        setField(term192459, term192459.getClass(), "args", term192467);
        setField(term192459, term192459.getClass(), "nextArgs", term192470);
        setIntField(term192459, term192459.getClass(), "instSize", 0);
        setBooleanField(term192459, term192459.getClass(), "opTrap", false);
        setBooleanField(term192459, term192459.getClass(), "irqAsserted", false);
        setBooleanField(term192459, term192459.getClass(), "nmiAsserted", false);
        setIntField(term192459, term192459.getClass(), "lastPc", 0);
        setBooleanField(term192459, term192459.getClass(), "carryFlag", false);
        setBooleanField(term192459, term192459.getClass(), "negativeFlag", false);
        setBooleanField(term192459, term192459.getClass(), "zeroFlag", false);
        setBooleanField(term192459, term192459.getClass(), "irqDisableFlag", false);
        setBooleanField(term192459, term192459.getClass(), "decimalModeFlag", false);
        setBooleanField(term192459, term192459.getClass(), "breakFlag", false);
        setBooleanField(term192459, term192459.getClass(), "overflowFlag", false);
        setLongField(term192459, term192459.getClass(), "stepCounter", 0L);
        setField(term192445, term192445.getClass(), "state", term192459);
        setLongField(term192445, term192445.getClass(), "opBeginTime", 3729905560436815423L);
        setField(term192442, term192442.getClass(), "cpu", term192445);
        setField(term192442, term192442.getClass(), "deviceMap", term192487);
        setField(term192442, term192442.getClass(), "deviceAddressArray", term192492);
        setField(term192427, term192427.getClass(), "bus", term192442);
        setIntField(term192493, term192493.getClass(), "a", 0);
        setIntField(term192493, term192493.getClass(), "x", 0);
        setIntField(term192493, term192493.getClass(), "y", 0);
        setIntField(term192493, term192493.getClass(), "sp", 0);
        setIntField(term192493, term192493.getClass(), "pc", 0);
        setIntField(term192493, term192493.getClass(), "ir", 0);
        setIntField(term192493, term192493.getClass(), "nextIr", 0);
        setField(term192493, term192493.getClass(), "args", term192501);
        setField(term192493, term192493.getClass(), "nextArgs", term192504);
        setIntField(term192493, term192493.getClass(), "instSize", 0);
        setBooleanField(term192493, term192493.getClass(), "opTrap", false);
        setBooleanField(term192493, term192493.getClass(), "irqAsserted", false);
        setBooleanField(term192493, term192493.getClass(), "nmiAsserted", false);
        setIntField(term192493, term192493.getClass(), "lastPc", 0);
        setBooleanField(term192493, term192493.getClass(), "carryFlag", false);
        setBooleanField(term192493, term192493.getClass(), "negativeFlag", false);
        setBooleanField(term192493, term192493.getClass(), "zeroFlag", false);
        setBooleanField(term192493, term192493.getClass(), "irqDisableFlag", false);
        setBooleanField(term192493, term192493.getClass(), "decimalModeFlag", false);
        setBooleanField(term192493, term192493.getClass(), "breakFlag", false);
        setBooleanField(term192493, term192493.getClass(), "overflowFlag", false);
        setLongField(term192493, term192493.getClass(), "stepCounter", 0L);
        setField(term192427, term192427.getClass(), "state", term192493);
        setLongField(term192427, term192427.getClass(), "opBeginTime", 27732590148100485L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearOverflowFlag", argTypes, term192427, args);
    }

};


