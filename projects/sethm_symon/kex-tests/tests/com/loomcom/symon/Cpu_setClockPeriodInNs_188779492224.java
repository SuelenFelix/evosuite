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
import java.lang.Long;

public class Cpu_setClockPeriodInNs_188779492224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182535;
     Object term182629;

    public Cpu_setClockPeriodInNs_188779492224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term182632 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term182631 = ((Class) term182632).getDeclaredField((String) "NMOS_6502");
        ((Field) term182631).setAccessible(true);
        Object enum204 = ((Field) term182631).get((Object) null);
        HashMap term182561 = new HashMap();
        HashMap term182595 = new HashMap();
        term182535 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term182550 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term182553 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term182555 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term182558 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term182566 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term182567 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term182575 = (int[]) newIntArray(2);
        int[] term182578 = (int[]) newIntArray(2);
        Object[] term182600 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term182601 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term182609 = (int[]) newIntArray(2);
        int[] term182612 = (int[]) newIntArray(2);
        setLongField(term182535, term182535.getClass(), "clockPeriodInNs", 1000L);
        setField(term182535, term182535.getClass(), "behavior", enum204);
        setIntField(term182550, term182550.getClass(), "startAddress", -1938624293);
        setIntField(term182550, term182550.getClass(), "endAddress", 1289551510);
        setLongField(term182553, term182553.getClass(), "clockPeriodInNs", 1000L);
        setField(term182553, term182553.getClass(), "behavior", enum204);
        setIntField(term182555, term182555.getClass(), "startAddress", 1397954481);
        setIntField(term182555, term182555.getClass(), "endAddress", -394854340);
        setLongField(term182558, term182558.getClass(), "clockPeriodInNs", 1000L);
        setField(term182558, term182558.getClass(), "behavior", enum204);
        setField(term182558, term182558.getClass(), "bus", null);
        setField(term182558, term182558.getClass(), "state", null);
        setLongField(term182558, term182558.getClass(), "opBeginTime", 60910260492008727L);
        setField(term182555, term182555.getClass(), "cpu", term182558);
        setField(term182555, term182555.getClass(), "deviceMap", term182561);
        setField(term182555, term182555.getClass(), "deviceAddressArray", term182566);
        setField(term182553, term182553.getClass(), "bus", term182555);
        setIntField(term182567, term182567.getClass(), "a", 0);
        setIntField(term182567, term182567.getClass(), "x", 0);
        setIntField(term182567, term182567.getClass(), "y", 0);
        setIntField(term182567, term182567.getClass(), "sp", 0);
        setIntField(term182567, term182567.getClass(), "pc", 0);
        setIntField(term182567, term182567.getClass(), "ir", 0);
        setIntField(term182567, term182567.getClass(), "nextIr", 0);
        setField(term182567, term182567.getClass(), "args", term182575);
        setField(term182567, term182567.getClass(), "nextArgs", term182578);
        setIntField(term182567, term182567.getClass(), "instSize", 0);
        setBooleanField(term182567, term182567.getClass(), "opTrap", false);
        setBooleanField(term182567, term182567.getClass(), "irqAsserted", false);
        setBooleanField(term182567, term182567.getClass(), "nmiAsserted", false);
        setIntField(term182567, term182567.getClass(), "lastPc", 0);
        setBooleanField(term182567, term182567.getClass(), "carryFlag", false);
        setBooleanField(term182567, term182567.getClass(), "negativeFlag", false);
        setBooleanField(term182567, term182567.getClass(), "zeroFlag", false);
        setBooleanField(term182567, term182567.getClass(), "irqDisableFlag", false);
        setBooleanField(term182567, term182567.getClass(), "decimalModeFlag", false);
        setBooleanField(term182567, term182567.getClass(), "breakFlag", false);
        setBooleanField(term182567, term182567.getClass(), "overflowFlag", false);
        setLongField(term182567, term182567.getClass(), "stepCounter", 0L);
        setField(term182553, term182553.getClass(), "state", term182567);
        setLongField(term182553, term182553.getClass(), "opBeginTime", 1696831840206676000L);
        setField(term182550, term182550.getClass(), "cpu", term182553);
        setField(term182550, term182550.getClass(), "deviceMap", term182595);
        setField(term182550, term182550.getClass(), "deviceAddressArray", term182600);
        setField(term182535, term182535.getClass(), "bus", term182550);
        setIntField(term182601, term182601.getClass(), "a", 0);
        setIntField(term182601, term182601.getClass(), "x", 0);
        setIntField(term182601, term182601.getClass(), "y", 0);
        setIntField(term182601, term182601.getClass(), "sp", 0);
        setIntField(term182601, term182601.getClass(), "pc", 0);
        setIntField(term182601, term182601.getClass(), "ir", 0);
        setIntField(term182601, term182601.getClass(), "nextIr", 0);
        setField(term182601, term182601.getClass(), "args", term182609);
        setField(term182601, term182601.getClass(), "nextArgs", term182612);
        setIntField(term182601, term182601.getClass(), "instSize", 0);
        setBooleanField(term182601, term182601.getClass(), "opTrap", false);
        setBooleanField(term182601, term182601.getClass(), "irqAsserted", false);
        setBooleanField(term182601, term182601.getClass(), "nmiAsserted", false);
        setIntField(term182601, term182601.getClass(), "lastPc", 0);
        setBooleanField(term182601, term182601.getClass(), "carryFlag", false);
        setBooleanField(term182601, term182601.getClass(), "negativeFlag", false);
        setBooleanField(term182601, term182601.getClass(), "zeroFlag", false);
        setBooleanField(term182601, term182601.getClass(), "irqDisableFlag", false);
        setBooleanField(term182601, term182601.getClass(), "decimalModeFlag", false);
        setBooleanField(term182601, term182601.getClass(), "breakFlag", false);
        setBooleanField(term182601, term182601.getClass(), "overflowFlag", false);
        setLongField(term182601, term182601.getClass(), "stepCounter", 0L);
        setField(term182535, term182535.getClass(), "state", term182601);
        setLongField(term182535, term182535.getClass(), "opBeginTime", 6079978726138581731L);
        term182629 = new Long(2001497540145118L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term182629;
        callMethod(klass, "setClockPeriodInNs", argTypes, term182535, args);
    }

};


