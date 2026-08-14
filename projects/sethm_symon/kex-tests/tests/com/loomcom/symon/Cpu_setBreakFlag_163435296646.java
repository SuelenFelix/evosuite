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

public class Cpu_setBreakFlag_163435296646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190595;

    public Cpu_setBreakFlag_163435296646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term190690 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term190689 = ((Class) term190690).getDeclaredField((String) "NMOS_6502");
        ((Field) term190689).setAccessible(true);
        Object enum226 = ((Field) term190689).get((Object) null);
        HashMap term190621 = new HashMap();
        HashMap term190655 = new HashMap();
        term190595 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term190610 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term190613 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term190615 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term190618 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term190626 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term190627 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term190635 = (int[]) newIntArray(2);
        int[] term190638 = (int[]) newIntArray(2);
        Object[] term190660 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term190661 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term190669 = (int[]) newIntArray(2);
        int[] term190672 = (int[]) newIntArray(2);
        setLongField(term190595, term190595.getClass(), "clockPeriodInNs", 1000L);
        setField(term190595, term190595.getClass(), "behavior", enum226);
        setIntField(term190610, term190610.getClass(), "startAddress", 258478328);
        setIntField(term190610, term190610.getClass(), "endAddress", 1079181683);
        setLongField(term190613, term190613.getClass(), "clockPeriodInNs", 1000L);
        setField(term190613, term190613.getClass(), "behavior", enum226);
        setIntField(term190615, term190615.getClass(), "startAddress", 62795043);
        setIntField(term190615, term190615.getClass(), "endAddress", 700442161);
        setLongField(term190618, term190618.getClass(), "clockPeriodInNs", 1000L);
        setField(term190618, term190618.getClass(), "behavior", enum226);
        setField(term190618, term190618.getClass(), "bus", null);
        setField(term190618, term190618.getClass(), "state", null);
        setLongField(term190618, term190618.getClass(), "opBeginTime", 7534205281044116098L);
        setField(term190615, term190615.getClass(), "cpu", term190618);
        setField(term190615, term190615.getClass(), "deviceMap", term190621);
        setField(term190615, term190615.getClass(), "deviceAddressArray", term190626);
        setField(term190613, term190613.getClass(), "bus", term190615);
        setIntField(term190627, term190627.getClass(), "a", 0);
        setIntField(term190627, term190627.getClass(), "x", 0);
        setIntField(term190627, term190627.getClass(), "y", 0);
        setIntField(term190627, term190627.getClass(), "sp", 0);
        setIntField(term190627, term190627.getClass(), "pc", 0);
        setIntField(term190627, term190627.getClass(), "ir", 0);
        setIntField(term190627, term190627.getClass(), "nextIr", 0);
        setField(term190627, term190627.getClass(), "args", term190635);
        setField(term190627, term190627.getClass(), "nextArgs", term190638);
        setIntField(term190627, term190627.getClass(), "instSize", 0);
        setBooleanField(term190627, term190627.getClass(), "opTrap", false);
        setBooleanField(term190627, term190627.getClass(), "irqAsserted", false);
        setBooleanField(term190627, term190627.getClass(), "nmiAsserted", false);
        setIntField(term190627, term190627.getClass(), "lastPc", 0);
        setBooleanField(term190627, term190627.getClass(), "carryFlag", false);
        setBooleanField(term190627, term190627.getClass(), "negativeFlag", false);
        setBooleanField(term190627, term190627.getClass(), "zeroFlag", false);
        setBooleanField(term190627, term190627.getClass(), "irqDisableFlag", false);
        setBooleanField(term190627, term190627.getClass(), "decimalModeFlag", false);
        setBooleanField(term190627, term190627.getClass(), "breakFlag", false);
        setBooleanField(term190627, term190627.getClass(), "overflowFlag", false);
        setLongField(term190627, term190627.getClass(), "stepCounter", 0L);
        setField(term190613, term190613.getClass(), "state", term190627);
        setLongField(term190613, term190613.getClass(), "opBeginTime", -4078647199307459633L);
        setField(term190610, term190610.getClass(), "cpu", term190613);
        setField(term190610, term190610.getClass(), "deviceMap", term190655);
        setField(term190610, term190610.getClass(), "deviceAddressArray", term190660);
        setField(term190595, term190595.getClass(), "bus", term190610);
        setIntField(term190661, term190661.getClass(), "a", 0);
        setIntField(term190661, term190661.getClass(), "x", 0);
        setIntField(term190661, term190661.getClass(), "y", 0);
        setIntField(term190661, term190661.getClass(), "sp", 0);
        setIntField(term190661, term190661.getClass(), "pc", 0);
        setIntField(term190661, term190661.getClass(), "ir", 0);
        setIntField(term190661, term190661.getClass(), "nextIr", 0);
        setField(term190661, term190661.getClass(), "args", term190669);
        setField(term190661, term190661.getClass(), "nextArgs", term190672);
        setIntField(term190661, term190661.getClass(), "instSize", 0);
        setBooleanField(term190661, term190661.getClass(), "opTrap", false);
        setBooleanField(term190661, term190661.getClass(), "irqAsserted", false);
        setBooleanField(term190661, term190661.getClass(), "nmiAsserted", false);
        setIntField(term190661, term190661.getClass(), "lastPc", 0);
        setBooleanField(term190661, term190661.getClass(), "carryFlag", false);
        setBooleanField(term190661, term190661.getClass(), "negativeFlag", false);
        setBooleanField(term190661, term190661.getClass(), "zeroFlag", false);
        setBooleanField(term190661, term190661.getClass(), "irqDisableFlag", false);
        setBooleanField(term190661, term190661.getClass(), "decimalModeFlag", false);
        setBooleanField(term190661, term190661.getClass(), "breakFlag", false);
        setBooleanField(term190661, term190661.getClass(), "overflowFlag", false);
        setLongField(term190661, term190661.getClass(), "stepCounter", 0L);
        setField(term190595, term190595.getClass(), "state", term190661);
        setLongField(term190595, term190595.getClass(), "opBeginTime", -2505751043723962819L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "setBreakFlag", argTypes, term190595, args);
    }

};


