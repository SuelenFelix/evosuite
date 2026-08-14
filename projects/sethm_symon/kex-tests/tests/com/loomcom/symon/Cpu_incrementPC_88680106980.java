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

public class Cpu_incrementPC_88680106980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203055;

    public Cpu_incrementPC_88680106980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term203150 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term203149 = ((Class) term203150).getDeclaredField((String) "NMOS_6502");
        ((Field) term203149).setAccessible(true);
        Object enum260 = ((Field) term203149).get((Object) null);
        HashMap term203081 = new HashMap();
        HashMap term203115 = new HashMap();
        term203055 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term203070 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term203073 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term203075 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term203078 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term203086 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term203087 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term203095 = (int[]) newIntArray(2);
        int[] term203098 = (int[]) newIntArray(2);
        Object[] term203120 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term203121 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term203129 = (int[]) newIntArray(2);
        int[] term203132 = (int[]) newIntArray(2);
        setLongField(term203055, term203055.getClass(), "clockPeriodInNs", 1000L);
        setField(term203055, term203055.getClass(), "behavior", enum260);
        setIntField(term203070, term203070.getClass(), "startAddress", 1269448265);
        setIntField(term203070, term203070.getClass(), "endAddress", 1407128598);
        setLongField(term203073, term203073.getClass(), "clockPeriodInNs", 1000L);
        setField(term203073, term203073.getClass(), "behavior", enum260);
        setIntField(term203075, term203075.getClass(), "startAddress", -799093829);
        setIntField(term203075, term203075.getClass(), "endAddress", 432526848);
        setLongField(term203078, term203078.getClass(), "clockPeriodInNs", 1000L);
        setField(term203078, term203078.getClass(), "behavior", enum260);
        setField(term203078, term203078.getClass(), "bus", null);
        setField(term203078, term203078.getClass(), "state", null);
        setLongField(term203078, term203078.getClass(), "opBeginTime", -3672309483214533219L);
        setField(term203075, term203075.getClass(), "cpu", term203078);
        setField(term203075, term203075.getClass(), "deviceMap", term203081);
        setField(term203075, term203075.getClass(), "deviceAddressArray", term203086);
        setField(term203073, term203073.getClass(), "bus", term203075);
        setIntField(term203087, term203087.getClass(), "a", 0);
        setIntField(term203087, term203087.getClass(), "x", 0);
        setIntField(term203087, term203087.getClass(), "y", 0);
        setIntField(term203087, term203087.getClass(), "sp", 0);
        setIntField(term203087, term203087.getClass(), "pc", 0);
        setIntField(term203087, term203087.getClass(), "ir", 0);
        setIntField(term203087, term203087.getClass(), "nextIr", 0);
        setField(term203087, term203087.getClass(), "args", term203095);
        setField(term203087, term203087.getClass(), "nextArgs", term203098);
        setIntField(term203087, term203087.getClass(), "instSize", 0);
        setBooleanField(term203087, term203087.getClass(), "opTrap", false);
        setBooleanField(term203087, term203087.getClass(), "irqAsserted", false);
        setBooleanField(term203087, term203087.getClass(), "nmiAsserted", false);
        setIntField(term203087, term203087.getClass(), "lastPc", 0);
        setBooleanField(term203087, term203087.getClass(), "carryFlag", false);
        setBooleanField(term203087, term203087.getClass(), "negativeFlag", false);
        setBooleanField(term203087, term203087.getClass(), "zeroFlag", false);
        setBooleanField(term203087, term203087.getClass(), "irqDisableFlag", false);
        setBooleanField(term203087, term203087.getClass(), "decimalModeFlag", false);
        setBooleanField(term203087, term203087.getClass(), "breakFlag", false);
        setBooleanField(term203087, term203087.getClass(), "overflowFlag", false);
        setLongField(term203087, term203087.getClass(), "stepCounter", 0L);
        setField(term203073, term203073.getClass(), "state", term203087);
        setLongField(term203073, term203073.getClass(), "opBeginTime", -2448708288718122671L);
        setField(term203070, term203070.getClass(), "cpu", term203073);
        setField(term203070, term203070.getClass(), "deviceMap", term203115);
        setField(term203070, term203070.getClass(), "deviceAddressArray", term203120);
        setField(term203055, term203055.getClass(), "bus", term203070);
        setIntField(term203121, term203121.getClass(), "a", 0);
        setIntField(term203121, term203121.getClass(), "x", 0);
        setIntField(term203121, term203121.getClass(), "y", 0);
        setIntField(term203121, term203121.getClass(), "sp", 0);
        setIntField(term203121, term203121.getClass(), "pc", 0);
        setIntField(term203121, term203121.getClass(), "ir", 0);
        setIntField(term203121, term203121.getClass(), "nextIr", 0);
        setField(term203121, term203121.getClass(), "args", term203129);
        setField(term203121, term203121.getClass(), "nextArgs", term203132);
        setIntField(term203121, term203121.getClass(), "instSize", 0);
        setBooleanField(term203121, term203121.getClass(), "opTrap", false);
        setBooleanField(term203121, term203121.getClass(), "irqAsserted", false);
        setBooleanField(term203121, term203121.getClass(), "nmiAsserted", false);
        setIntField(term203121, term203121.getClass(), "lastPc", 0);
        setBooleanField(term203121, term203121.getClass(), "carryFlag", false);
        setBooleanField(term203121, term203121.getClass(), "negativeFlag", false);
        setBooleanField(term203121, term203121.getClass(), "zeroFlag", false);
        setBooleanField(term203121, term203121.getClass(), "irqDisableFlag", false);
        setBooleanField(term203121, term203121.getClass(), "decimalModeFlag", false);
        setBooleanField(term203121, term203121.getClass(), "breakFlag", false);
        setBooleanField(term203121, term203121.getClass(), "overflowFlag", false);
        setLongField(term203121, term203121.getClass(), "stepCounter", 0L);
        setField(term203055, term203055.getClass(), "state", term203121);
        setLongField(term203055, term203055.getClass(), "opBeginTime", 7391856662550454315L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "incrementPC", argTypes, term203055, args);
    }

};


