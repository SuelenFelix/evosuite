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

public class Cpu_getZeroFlag_202476333535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186567;

    public Cpu_getZeroFlag_202476333535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term186662 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term186661 = ((Class) term186662).getDeclaredField((String) "NMOS_6502");
        ((Field) term186661).setAccessible(true);
        Object enum215 = ((Field) term186661).get((Object) null);
        HashMap term186593 = new HashMap();
        HashMap term186627 = new HashMap();
        term186567 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term186582 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term186585 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term186587 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term186590 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term186598 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term186599 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term186607 = (int[]) newIntArray(2);
        int[] term186610 = (int[]) newIntArray(2);
        Object[] term186632 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term186633 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term186641 = (int[]) newIntArray(2);
        int[] term186644 = (int[]) newIntArray(2);
        setLongField(term186567, term186567.getClass(), "clockPeriodInNs", 1000L);
        setField(term186567, term186567.getClass(), "behavior", enum215);
        setIntField(term186582, term186582.getClass(), "startAddress", -340318694);
        setIntField(term186582, term186582.getClass(), "endAddress", 53069810);
        setLongField(term186585, term186585.getClass(), "clockPeriodInNs", 1000L);
        setField(term186585, term186585.getClass(), "behavior", enum215);
        setIntField(term186587, term186587.getClass(), "startAddress", 399386520);
        setIntField(term186587, term186587.getClass(), "endAddress", 1509169467);
        setLongField(term186590, term186590.getClass(), "clockPeriodInNs", 1000L);
        setField(term186590, term186590.getClass(), "behavior", enum215);
        setField(term186590, term186590.getClass(), "bus", null);
        setField(term186590, term186590.getClass(), "state", null);
        setLongField(term186590, term186590.getClass(), "opBeginTime", 7492997886327124063L);
        setField(term186587, term186587.getClass(), "cpu", term186590);
        setField(term186587, term186587.getClass(), "deviceMap", term186593);
        setField(term186587, term186587.getClass(), "deviceAddressArray", term186598);
        setField(term186585, term186585.getClass(), "bus", term186587);
        setIntField(term186599, term186599.getClass(), "a", 0);
        setIntField(term186599, term186599.getClass(), "x", 0);
        setIntField(term186599, term186599.getClass(), "y", 0);
        setIntField(term186599, term186599.getClass(), "sp", 0);
        setIntField(term186599, term186599.getClass(), "pc", 0);
        setIntField(term186599, term186599.getClass(), "ir", 0);
        setIntField(term186599, term186599.getClass(), "nextIr", 0);
        setField(term186599, term186599.getClass(), "args", term186607);
        setField(term186599, term186599.getClass(), "nextArgs", term186610);
        setIntField(term186599, term186599.getClass(), "instSize", 0);
        setBooleanField(term186599, term186599.getClass(), "opTrap", false);
        setBooleanField(term186599, term186599.getClass(), "irqAsserted", false);
        setBooleanField(term186599, term186599.getClass(), "nmiAsserted", false);
        setIntField(term186599, term186599.getClass(), "lastPc", 0);
        setBooleanField(term186599, term186599.getClass(), "carryFlag", false);
        setBooleanField(term186599, term186599.getClass(), "negativeFlag", false);
        setBooleanField(term186599, term186599.getClass(), "zeroFlag", false);
        setBooleanField(term186599, term186599.getClass(), "irqDisableFlag", false);
        setBooleanField(term186599, term186599.getClass(), "decimalModeFlag", false);
        setBooleanField(term186599, term186599.getClass(), "breakFlag", false);
        setBooleanField(term186599, term186599.getClass(), "overflowFlag", false);
        setLongField(term186599, term186599.getClass(), "stepCounter", 0L);
        setField(term186585, term186585.getClass(), "state", term186599);
        setLongField(term186585, term186585.getClass(), "opBeginTime", -8520099975744950197L);
        setField(term186582, term186582.getClass(), "cpu", term186585);
        setField(term186582, term186582.getClass(), "deviceMap", term186627);
        setField(term186582, term186582.getClass(), "deviceAddressArray", term186632);
        setField(term186567, term186567.getClass(), "bus", term186582);
        setIntField(term186633, term186633.getClass(), "a", 0);
        setIntField(term186633, term186633.getClass(), "x", 0);
        setIntField(term186633, term186633.getClass(), "y", 0);
        setIntField(term186633, term186633.getClass(), "sp", 0);
        setIntField(term186633, term186633.getClass(), "pc", 0);
        setIntField(term186633, term186633.getClass(), "ir", 0);
        setIntField(term186633, term186633.getClass(), "nextIr", 0);
        setField(term186633, term186633.getClass(), "args", term186641);
        setField(term186633, term186633.getClass(), "nextArgs", term186644);
        setIntField(term186633, term186633.getClass(), "instSize", 0);
        setBooleanField(term186633, term186633.getClass(), "opTrap", false);
        setBooleanField(term186633, term186633.getClass(), "irqAsserted", false);
        setBooleanField(term186633, term186633.getClass(), "nmiAsserted", false);
        setIntField(term186633, term186633.getClass(), "lastPc", 0);
        setBooleanField(term186633, term186633.getClass(), "carryFlag", false);
        setBooleanField(term186633, term186633.getClass(), "negativeFlag", false);
        setBooleanField(term186633, term186633.getClass(), "zeroFlag", false);
        setBooleanField(term186633, term186633.getClass(), "irqDisableFlag", false);
        setBooleanField(term186633, term186633.getClass(), "decimalModeFlag", false);
        setBooleanField(term186633, term186633.getClass(), "breakFlag", false);
        setBooleanField(term186633, term186633.getClass(), "overflowFlag", false);
        setLongField(term186633, term186633.getClass(), "stepCounter", 0L);
        setField(term186567, term186567.getClass(), "state", term186633);
        setLongField(term186567, term186567.getClass(), "opBeginTime", 3505714875198206555L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getZeroFlag", argTypes, term186567, args);
    }

};


