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

public class Cpu_sbc_14640180716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179585;
     Object term179679;
     Object term179681;

    public Cpu_sbc_14640180716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term179684 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term179683 = ((Class) term179684).getDeclaredField((String) "NMOS_6502");
        ((Field) term179683).setAccessible(true);
        Object enum196 = ((Field) term179683).get((Object) null);
        HashMap term179611 = new HashMap();
        HashMap term179645 = new HashMap();
        term179585 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term179600 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term179603 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term179605 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term179608 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term179616 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term179617 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term179625 = (int[]) newIntArray(2);
        int[] term179628 = (int[]) newIntArray(2);
        Object[] term179650 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term179651 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term179659 = (int[]) newIntArray(2);
        int[] term179662 = (int[]) newIntArray(2);
        setLongField(term179585, term179585.getClass(), "clockPeriodInNs", 1000L);
        setField(term179585, term179585.getClass(), "behavior", enum196);
        setIntField(term179600, term179600.getClass(), "startAddress", -2041534507);
        setIntField(term179600, term179600.getClass(), "endAddress", 2090333247);
        setLongField(term179603, term179603.getClass(), "clockPeriodInNs", 1000L);
        setField(term179603, term179603.getClass(), "behavior", enum196);
        setIntField(term179605, term179605.getClass(), "startAddress", 1612944193);
        setIntField(term179605, term179605.getClass(), "endAddress", 1274552070);
        setLongField(term179608, term179608.getClass(), "clockPeriodInNs", 1000L);
        setField(term179608, term179608.getClass(), "behavior", enum196);
        setField(term179608, term179608.getClass(), "bus", null);
        setField(term179608, term179608.getClass(), "state", null);
        setLongField(term179608, term179608.getClass(), "opBeginTime", 6427987239762071453L);
        setField(term179605, term179605.getClass(), "cpu", term179608);
        setField(term179605, term179605.getClass(), "deviceMap", term179611);
        setField(term179605, term179605.getClass(), "deviceAddressArray", term179616);
        setField(term179603, term179603.getClass(), "bus", term179605);
        setIntField(term179617, term179617.getClass(), "a", 0);
        setIntField(term179617, term179617.getClass(), "x", 0);
        setIntField(term179617, term179617.getClass(), "y", 0);
        setIntField(term179617, term179617.getClass(), "sp", 0);
        setIntField(term179617, term179617.getClass(), "pc", 0);
        setIntField(term179617, term179617.getClass(), "ir", 0);
        setIntField(term179617, term179617.getClass(), "nextIr", 0);
        setField(term179617, term179617.getClass(), "args", term179625);
        setField(term179617, term179617.getClass(), "nextArgs", term179628);
        setIntField(term179617, term179617.getClass(), "instSize", 0);
        setBooleanField(term179617, term179617.getClass(), "opTrap", false);
        setBooleanField(term179617, term179617.getClass(), "irqAsserted", false);
        setBooleanField(term179617, term179617.getClass(), "nmiAsserted", false);
        setIntField(term179617, term179617.getClass(), "lastPc", 0);
        setBooleanField(term179617, term179617.getClass(), "carryFlag", false);
        setBooleanField(term179617, term179617.getClass(), "negativeFlag", false);
        setBooleanField(term179617, term179617.getClass(), "zeroFlag", false);
        setBooleanField(term179617, term179617.getClass(), "irqDisableFlag", false);
        setBooleanField(term179617, term179617.getClass(), "decimalModeFlag", false);
        setBooleanField(term179617, term179617.getClass(), "breakFlag", false);
        setBooleanField(term179617, term179617.getClass(), "overflowFlag", false);
        setLongField(term179617, term179617.getClass(), "stepCounter", 0L);
        setField(term179603, term179603.getClass(), "state", term179617);
        setLongField(term179603, term179603.getClass(), "opBeginTime", 9216691136820489449L);
        setField(term179600, term179600.getClass(), "cpu", term179603);
        setField(term179600, term179600.getClass(), "deviceMap", term179645);
        setField(term179600, term179600.getClass(), "deviceAddressArray", term179650);
        setField(term179585, term179585.getClass(), "bus", term179600);
        setIntField(term179651, term179651.getClass(), "a", 0);
        setIntField(term179651, term179651.getClass(), "x", 0);
        setIntField(term179651, term179651.getClass(), "y", 0);
        setIntField(term179651, term179651.getClass(), "sp", 0);
        setIntField(term179651, term179651.getClass(), "pc", 0);
        setIntField(term179651, term179651.getClass(), "ir", 0);
        setIntField(term179651, term179651.getClass(), "nextIr", 0);
        setField(term179651, term179651.getClass(), "args", term179659);
        setField(term179651, term179651.getClass(), "nextArgs", term179662);
        setIntField(term179651, term179651.getClass(), "instSize", 0);
        setBooleanField(term179651, term179651.getClass(), "opTrap", false);
        setBooleanField(term179651, term179651.getClass(), "irqAsserted", false);
        setBooleanField(term179651, term179651.getClass(), "nmiAsserted", false);
        setIntField(term179651, term179651.getClass(), "lastPc", 0);
        setBooleanField(term179651, term179651.getClass(), "carryFlag", false);
        setBooleanField(term179651, term179651.getClass(), "negativeFlag", false);
        setBooleanField(term179651, term179651.getClass(), "zeroFlag", false);
        setBooleanField(term179651, term179651.getClass(), "irqDisableFlag", false);
        setBooleanField(term179651, term179651.getClass(), "decimalModeFlag", false);
        setBooleanField(term179651, term179651.getClass(), "breakFlag", false);
        setBooleanField(term179651, term179651.getClass(), "overflowFlag", false);
        setLongField(term179651, term179651.getClass(), "stepCounter", 0L);
        setField(term179585, term179585.getClass(), "state", term179651);
        setLongField(term179585, term179585.getClass(), "opBeginTime", 6460434640369527093L);
        term179679 = new Integer(-266762167);
        term179681 = new Integer(-1341806138);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term179679;
        args[1] = term179681;
        callMethod(klass, "sbc", argTypes, term179585, args);
    }

};


