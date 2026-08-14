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

public class Cpu_getProgramCounter_71985688560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195727;

    public Cpu_getProgramCounter_71985688560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term195822 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term195821 = ((Class) term195822).getDeclaredField((String) "NMOS_6502");
        ((Field) term195821).setAccessible(true);
        Object enum240 = ((Field) term195821).get((Object) null);
        HashMap term195753 = new HashMap();
        HashMap term195787 = new HashMap();
        term195727 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term195742 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term195745 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term195747 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term195750 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term195758 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term195759 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term195767 = (int[]) newIntArray(2);
        int[] term195770 = (int[]) newIntArray(2);
        Object[] term195792 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term195793 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term195801 = (int[]) newIntArray(2);
        int[] term195804 = (int[]) newIntArray(2);
        setLongField(term195727, term195727.getClass(), "clockPeriodInNs", 1000L);
        setField(term195727, term195727.getClass(), "behavior", enum240);
        setIntField(term195742, term195742.getClass(), "startAddress", 137516958);
        setIntField(term195742, term195742.getClass(), "endAddress", -1233770688);
        setLongField(term195745, term195745.getClass(), "clockPeriodInNs", 1000L);
        setField(term195745, term195745.getClass(), "behavior", enum240);
        setIntField(term195747, term195747.getClass(), "startAddress", 722935077);
        setIntField(term195747, term195747.getClass(), "endAddress", -304660297);
        setLongField(term195750, term195750.getClass(), "clockPeriodInNs", 1000L);
        setField(term195750, term195750.getClass(), "behavior", enum240);
        setField(term195750, term195750.getClass(), "bus", null);
        setField(term195750, term195750.getClass(), "state", null);
        setLongField(term195750, term195750.getClass(), "opBeginTime", -5583016716246948935L);
        setField(term195747, term195747.getClass(), "cpu", term195750);
        setField(term195747, term195747.getClass(), "deviceMap", term195753);
        setField(term195747, term195747.getClass(), "deviceAddressArray", term195758);
        setField(term195745, term195745.getClass(), "bus", term195747);
        setIntField(term195759, term195759.getClass(), "a", 0);
        setIntField(term195759, term195759.getClass(), "x", 0);
        setIntField(term195759, term195759.getClass(), "y", 0);
        setIntField(term195759, term195759.getClass(), "sp", 0);
        setIntField(term195759, term195759.getClass(), "pc", 0);
        setIntField(term195759, term195759.getClass(), "ir", 0);
        setIntField(term195759, term195759.getClass(), "nextIr", 0);
        setField(term195759, term195759.getClass(), "args", term195767);
        setField(term195759, term195759.getClass(), "nextArgs", term195770);
        setIntField(term195759, term195759.getClass(), "instSize", 0);
        setBooleanField(term195759, term195759.getClass(), "opTrap", false);
        setBooleanField(term195759, term195759.getClass(), "irqAsserted", false);
        setBooleanField(term195759, term195759.getClass(), "nmiAsserted", false);
        setIntField(term195759, term195759.getClass(), "lastPc", 0);
        setBooleanField(term195759, term195759.getClass(), "carryFlag", false);
        setBooleanField(term195759, term195759.getClass(), "negativeFlag", false);
        setBooleanField(term195759, term195759.getClass(), "zeroFlag", false);
        setBooleanField(term195759, term195759.getClass(), "irqDisableFlag", false);
        setBooleanField(term195759, term195759.getClass(), "decimalModeFlag", false);
        setBooleanField(term195759, term195759.getClass(), "breakFlag", false);
        setBooleanField(term195759, term195759.getClass(), "overflowFlag", false);
        setLongField(term195759, term195759.getClass(), "stepCounter", 0L);
        setField(term195745, term195745.getClass(), "state", term195759);
        setLongField(term195745, term195745.getClass(), "opBeginTime", -5567719604161729601L);
        setField(term195742, term195742.getClass(), "cpu", term195745);
        setField(term195742, term195742.getClass(), "deviceMap", term195787);
        setField(term195742, term195742.getClass(), "deviceAddressArray", term195792);
        setField(term195727, term195727.getClass(), "bus", term195742);
        setIntField(term195793, term195793.getClass(), "a", 0);
        setIntField(term195793, term195793.getClass(), "x", 0);
        setIntField(term195793, term195793.getClass(), "y", 0);
        setIntField(term195793, term195793.getClass(), "sp", 0);
        setIntField(term195793, term195793.getClass(), "pc", 0);
        setIntField(term195793, term195793.getClass(), "ir", 0);
        setIntField(term195793, term195793.getClass(), "nextIr", 0);
        setField(term195793, term195793.getClass(), "args", term195801);
        setField(term195793, term195793.getClass(), "nextArgs", term195804);
        setIntField(term195793, term195793.getClass(), "instSize", 0);
        setBooleanField(term195793, term195793.getClass(), "opTrap", false);
        setBooleanField(term195793, term195793.getClass(), "irqAsserted", false);
        setBooleanField(term195793, term195793.getClass(), "nmiAsserted", false);
        setIntField(term195793, term195793.getClass(), "lastPc", 0);
        setBooleanField(term195793, term195793.getClass(), "carryFlag", false);
        setBooleanField(term195793, term195793.getClass(), "negativeFlag", false);
        setBooleanField(term195793, term195793.getClass(), "zeroFlag", false);
        setBooleanField(term195793, term195793.getClass(), "irqDisableFlag", false);
        setBooleanField(term195793, term195793.getClass(), "decimalModeFlag", false);
        setBooleanField(term195793, term195793.getClass(), "breakFlag", false);
        setBooleanField(term195793, term195793.getClass(), "overflowFlag", false);
        setLongField(term195793, term195793.getClass(), "stepCounter", 0L);
        setField(term195727, term195727.getClass(), "state", term195793);
        setLongField(term195727, term195727.getClass(), "opBeginTime", -8754542710304507750L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProgramCounter", argTypes, term195727, args);
    }

};


