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

public class Cpu_getStackPointerStatus_138296134571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199759;

    public Cpu_getStackPointerStatus_138296134571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term199854 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term199853 = ((Class) term199854).getDeclaredField((String) "NMOS_6502");
        ((Field) term199853).setAccessible(true);
        Object enum251 = ((Field) term199853).get((Object) null);
        HashMap term199785 = new HashMap();
        HashMap term199819 = new HashMap();
        term199759 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term199774 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term199777 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term199779 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term199782 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term199790 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term199791 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term199799 = (int[]) newIntArray(2);
        int[] term199802 = (int[]) newIntArray(2);
        Object[] term199824 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term199825 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term199833 = (int[]) newIntArray(2);
        int[] term199836 = (int[]) newIntArray(2);
        setLongField(term199759, term199759.getClass(), "clockPeriodInNs", 1000L);
        setField(term199759, term199759.getClass(), "behavior", enum251);
        setIntField(term199774, term199774.getClass(), "startAddress", 83060289);
        setIntField(term199774, term199774.getClass(), "endAddress", -2109132583);
        setLongField(term199777, term199777.getClass(), "clockPeriodInNs", 1000L);
        setField(term199777, term199777.getClass(), "behavior", enum251);
        setIntField(term199779, term199779.getClass(), "startAddress", -1992824713);
        setIntField(term199779, term199779.getClass(), "endAddress", 1482207601);
        setLongField(term199782, term199782.getClass(), "clockPeriodInNs", 1000L);
        setField(term199782, term199782.getClass(), "behavior", enum251);
        setField(term199782, term199782.getClass(), "bus", null);
        setField(term199782, term199782.getClass(), "state", null);
        setLongField(term199782, term199782.getClass(), "opBeginTime", -7089384741512135431L);
        setField(term199779, term199779.getClass(), "cpu", term199782);
        setField(term199779, term199779.getClass(), "deviceMap", term199785);
        setField(term199779, term199779.getClass(), "deviceAddressArray", term199790);
        setField(term199777, term199777.getClass(), "bus", term199779);
        setIntField(term199791, term199791.getClass(), "a", 0);
        setIntField(term199791, term199791.getClass(), "x", 0);
        setIntField(term199791, term199791.getClass(), "y", 0);
        setIntField(term199791, term199791.getClass(), "sp", 0);
        setIntField(term199791, term199791.getClass(), "pc", 0);
        setIntField(term199791, term199791.getClass(), "ir", 0);
        setIntField(term199791, term199791.getClass(), "nextIr", 0);
        setField(term199791, term199791.getClass(), "args", term199799);
        setField(term199791, term199791.getClass(), "nextArgs", term199802);
        setIntField(term199791, term199791.getClass(), "instSize", 0);
        setBooleanField(term199791, term199791.getClass(), "opTrap", false);
        setBooleanField(term199791, term199791.getClass(), "irqAsserted", false);
        setBooleanField(term199791, term199791.getClass(), "nmiAsserted", false);
        setIntField(term199791, term199791.getClass(), "lastPc", 0);
        setBooleanField(term199791, term199791.getClass(), "carryFlag", false);
        setBooleanField(term199791, term199791.getClass(), "negativeFlag", false);
        setBooleanField(term199791, term199791.getClass(), "zeroFlag", false);
        setBooleanField(term199791, term199791.getClass(), "irqDisableFlag", false);
        setBooleanField(term199791, term199791.getClass(), "decimalModeFlag", false);
        setBooleanField(term199791, term199791.getClass(), "breakFlag", false);
        setBooleanField(term199791, term199791.getClass(), "overflowFlag", false);
        setLongField(term199791, term199791.getClass(), "stepCounter", 0L);
        setField(term199777, term199777.getClass(), "state", term199791);
        setLongField(term199777, term199777.getClass(), "opBeginTime", 7207062884131909895L);
        setField(term199774, term199774.getClass(), "cpu", term199777);
        setField(term199774, term199774.getClass(), "deviceMap", term199819);
        setField(term199774, term199774.getClass(), "deviceAddressArray", term199824);
        setField(term199759, term199759.getClass(), "bus", term199774);
        setIntField(term199825, term199825.getClass(), "a", 0);
        setIntField(term199825, term199825.getClass(), "x", 0);
        setIntField(term199825, term199825.getClass(), "y", 0);
        setIntField(term199825, term199825.getClass(), "sp", 0);
        setIntField(term199825, term199825.getClass(), "pc", 0);
        setIntField(term199825, term199825.getClass(), "ir", 0);
        setIntField(term199825, term199825.getClass(), "nextIr", 0);
        setField(term199825, term199825.getClass(), "args", term199833);
        setField(term199825, term199825.getClass(), "nextArgs", term199836);
        setIntField(term199825, term199825.getClass(), "instSize", 0);
        setBooleanField(term199825, term199825.getClass(), "opTrap", false);
        setBooleanField(term199825, term199825.getClass(), "irqAsserted", false);
        setBooleanField(term199825, term199825.getClass(), "nmiAsserted", false);
        setIntField(term199825, term199825.getClass(), "lastPc", 0);
        setBooleanField(term199825, term199825.getClass(), "carryFlag", false);
        setBooleanField(term199825, term199825.getClass(), "negativeFlag", false);
        setBooleanField(term199825, term199825.getClass(), "zeroFlag", false);
        setBooleanField(term199825, term199825.getClass(), "irqDisableFlag", false);
        setBooleanField(term199825, term199825.getClass(), "decimalModeFlag", false);
        setBooleanField(term199825, term199825.getClass(), "breakFlag", false);
        setBooleanField(term199825, term199825.getClass(), "overflowFlag", false);
        setLongField(term199825, term199825.getClass(), "stepCounter", 0L);
        setField(term199759, term199759.getClass(), "state", term199825);
        setLongField(term199759, term199759.getClass(), "opBeginTime", 9005525882295990505L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStackPointerStatus", argTypes, term199759, args);
    }

};


