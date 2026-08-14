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

public class Cpu_ror_14698321223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term182167;
     Object term182261;

    public Cpu_ror_14698321223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term182264 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term182263 = ((Class) term182264).getDeclaredField((String) "NMOS_6502");
        ((Field) term182263).setAccessible(true);
        Object enum203 = ((Field) term182263).get((Object) null);
        HashMap term182193 = new HashMap();
        HashMap term182227 = new HashMap();
        term182167 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term182182 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term182185 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term182187 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term182190 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term182198 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term182199 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term182207 = (int[]) newIntArray(2);
        int[] term182210 = (int[]) newIntArray(2);
        Object[] term182232 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term182233 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term182241 = (int[]) newIntArray(2);
        int[] term182244 = (int[]) newIntArray(2);
        setLongField(term182167, term182167.getClass(), "clockPeriodInNs", 1000L);
        setField(term182167, term182167.getClass(), "behavior", enum203);
        setIntField(term182182, term182182.getClass(), "startAddress", -1092087194);
        setIntField(term182182, term182182.getClass(), "endAddress", 287049516);
        setLongField(term182185, term182185.getClass(), "clockPeriodInNs", 1000L);
        setField(term182185, term182185.getClass(), "behavior", enum203);
        setIntField(term182187, term182187.getClass(), "startAddress", -2118245549);
        setIntField(term182187, term182187.getClass(), "endAddress", -974734669);
        setLongField(term182190, term182190.getClass(), "clockPeriodInNs", 1000L);
        setField(term182190, term182190.getClass(), "behavior", enum203);
        setField(term182190, term182190.getClass(), "bus", null);
        setField(term182190, term182190.getClass(), "state", null);
        setLongField(term182190, term182190.getClass(), "opBeginTime", 4331712795558033930L);
        setField(term182187, term182187.getClass(), "cpu", term182190);
        setField(term182187, term182187.getClass(), "deviceMap", term182193);
        setField(term182187, term182187.getClass(), "deviceAddressArray", term182198);
        setField(term182185, term182185.getClass(), "bus", term182187);
        setIntField(term182199, term182199.getClass(), "a", 0);
        setIntField(term182199, term182199.getClass(), "x", 0);
        setIntField(term182199, term182199.getClass(), "y", 0);
        setIntField(term182199, term182199.getClass(), "sp", 0);
        setIntField(term182199, term182199.getClass(), "pc", 0);
        setIntField(term182199, term182199.getClass(), "ir", 0);
        setIntField(term182199, term182199.getClass(), "nextIr", 0);
        setField(term182199, term182199.getClass(), "args", term182207);
        setField(term182199, term182199.getClass(), "nextArgs", term182210);
        setIntField(term182199, term182199.getClass(), "instSize", 0);
        setBooleanField(term182199, term182199.getClass(), "opTrap", false);
        setBooleanField(term182199, term182199.getClass(), "irqAsserted", false);
        setBooleanField(term182199, term182199.getClass(), "nmiAsserted", false);
        setIntField(term182199, term182199.getClass(), "lastPc", 0);
        setBooleanField(term182199, term182199.getClass(), "carryFlag", false);
        setBooleanField(term182199, term182199.getClass(), "negativeFlag", false);
        setBooleanField(term182199, term182199.getClass(), "zeroFlag", false);
        setBooleanField(term182199, term182199.getClass(), "irqDisableFlag", false);
        setBooleanField(term182199, term182199.getClass(), "decimalModeFlag", false);
        setBooleanField(term182199, term182199.getClass(), "breakFlag", false);
        setBooleanField(term182199, term182199.getClass(), "overflowFlag", false);
        setLongField(term182199, term182199.getClass(), "stepCounter", 0L);
        setField(term182185, term182185.getClass(), "state", term182199);
        setLongField(term182185, term182185.getClass(), "opBeginTime", 8180021874498524998L);
        setField(term182182, term182182.getClass(), "cpu", term182185);
        setField(term182182, term182182.getClass(), "deviceMap", term182227);
        setField(term182182, term182182.getClass(), "deviceAddressArray", term182232);
        setField(term182167, term182167.getClass(), "bus", term182182);
        setIntField(term182233, term182233.getClass(), "a", 0);
        setIntField(term182233, term182233.getClass(), "x", 0);
        setIntField(term182233, term182233.getClass(), "y", 0);
        setIntField(term182233, term182233.getClass(), "sp", 0);
        setIntField(term182233, term182233.getClass(), "pc", 0);
        setIntField(term182233, term182233.getClass(), "ir", 0);
        setIntField(term182233, term182233.getClass(), "nextIr", 0);
        setField(term182233, term182233.getClass(), "args", term182241);
        setField(term182233, term182233.getClass(), "nextArgs", term182244);
        setIntField(term182233, term182233.getClass(), "instSize", 0);
        setBooleanField(term182233, term182233.getClass(), "opTrap", false);
        setBooleanField(term182233, term182233.getClass(), "irqAsserted", false);
        setBooleanField(term182233, term182233.getClass(), "nmiAsserted", false);
        setIntField(term182233, term182233.getClass(), "lastPc", 0);
        setBooleanField(term182233, term182233.getClass(), "carryFlag", false);
        setBooleanField(term182233, term182233.getClass(), "negativeFlag", false);
        setBooleanField(term182233, term182233.getClass(), "zeroFlag", false);
        setBooleanField(term182233, term182233.getClass(), "irqDisableFlag", false);
        setBooleanField(term182233, term182233.getClass(), "decimalModeFlag", false);
        setBooleanField(term182233, term182233.getClass(), "breakFlag", false);
        setBooleanField(term182233, term182233.getClass(), "overflowFlag", false);
        setLongField(term182233, term182233.getClass(), "stepCounter", 0L);
        setField(term182167, term182167.getClass(), "state", term182233);
        setLongField(term182167, term182167.getClass(), "opBeginTime", 732331270654896650L);
        term182261 = new Integer(-605646727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term182261;
        callMethod(klass, "ror", argTypes, term182167, args);
    }

};


