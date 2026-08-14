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

public class Cpu_getCarryBit_67858333331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185101;

    public Cpu_getCarryBit_67858333331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term185196 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term185195 = ((Class) term185196).getDeclaredField((String) "NMOS_6502");
        ((Field) term185195).setAccessible(true);
        Object enum211 = ((Field) term185195).get((Object) null);
        HashMap term185127 = new HashMap();
        HashMap term185161 = new HashMap();
        term185101 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term185116 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term185119 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term185121 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term185124 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term185132 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term185133 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term185141 = (int[]) newIntArray(2);
        int[] term185144 = (int[]) newIntArray(2);
        Object[] term185166 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term185167 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term185175 = (int[]) newIntArray(2);
        int[] term185178 = (int[]) newIntArray(2);
        setLongField(term185101, term185101.getClass(), "clockPeriodInNs", 1000L);
        setField(term185101, term185101.getClass(), "behavior", enum211);
        setIntField(term185116, term185116.getClass(), "startAddress", -1104495882);
        setIntField(term185116, term185116.getClass(), "endAddress", 723475216);
        setLongField(term185119, term185119.getClass(), "clockPeriodInNs", 1000L);
        setField(term185119, term185119.getClass(), "behavior", enum211);
        setIntField(term185121, term185121.getClass(), "startAddress", 1267820908);
        setIntField(term185121, term185121.getClass(), "endAddress", 1119020608);
        setLongField(term185124, term185124.getClass(), "clockPeriodInNs", 1000L);
        setField(term185124, term185124.getClass(), "behavior", enum211);
        setField(term185124, term185124.getClass(), "bus", null);
        setField(term185124, term185124.getClass(), "state", null);
        setLongField(term185124, term185124.getClass(), "opBeginTime", 5406702435763021326L);
        setField(term185121, term185121.getClass(), "cpu", term185124);
        setField(term185121, term185121.getClass(), "deviceMap", term185127);
        setField(term185121, term185121.getClass(), "deviceAddressArray", term185132);
        setField(term185119, term185119.getClass(), "bus", term185121);
        setIntField(term185133, term185133.getClass(), "a", 0);
        setIntField(term185133, term185133.getClass(), "x", 0);
        setIntField(term185133, term185133.getClass(), "y", 0);
        setIntField(term185133, term185133.getClass(), "sp", 0);
        setIntField(term185133, term185133.getClass(), "pc", 0);
        setIntField(term185133, term185133.getClass(), "ir", 0);
        setIntField(term185133, term185133.getClass(), "nextIr", 0);
        setField(term185133, term185133.getClass(), "args", term185141);
        setField(term185133, term185133.getClass(), "nextArgs", term185144);
        setIntField(term185133, term185133.getClass(), "instSize", 0);
        setBooleanField(term185133, term185133.getClass(), "opTrap", false);
        setBooleanField(term185133, term185133.getClass(), "irqAsserted", false);
        setBooleanField(term185133, term185133.getClass(), "nmiAsserted", false);
        setIntField(term185133, term185133.getClass(), "lastPc", 0);
        setBooleanField(term185133, term185133.getClass(), "carryFlag", false);
        setBooleanField(term185133, term185133.getClass(), "negativeFlag", false);
        setBooleanField(term185133, term185133.getClass(), "zeroFlag", false);
        setBooleanField(term185133, term185133.getClass(), "irqDisableFlag", false);
        setBooleanField(term185133, term185133.getClass(), "decimalModeFlag", false);
        setBooleanField(term185133, term185133.getClass(), "breakFlag", false);
        setBooleanField(term185133, term185133.getClass(), "overflowFlag", false);
        setLongField(term185133, term185133.getClass(), "stepCounter", 0L);
        setField(term185119, term185119.getClass(), "state", term185133);
        setLongField(term185119, term185119.getClass(), "opBeginTime", 2674610463314008194L);
        setField(term185116, term185116.getClass(), "cpu", term185119);
        setField(term185116, term185116.getClass(), "deviceMap", term185161);
        setField(term185116, term185116.getClass(), "deviceAddressArray", term185166);
        setField(term185101, term185101.getClass(), "bus", term185116);
        setIntField(term185167, term185167.getClass(), "a", 0);
        setIntField(term185167, term185167.getClass(), "x", 0);
        setIntField(term185167, term185167.getClass(), "y", 0);
        setIntField(term185167, term185167.getClass(), "sp", 0);
        setIntField(term185167, term185167.getClass(), "pc", 0);
        setIntField(term185167, term185167.getClass(), "ir", 0);
        setIntField(term185167, term185167.getClass(), "nextIr", 0);
        setField(term185167, term185167.getClass(), "args", term185175);
        setField(term185167, term185167.getClass(), "nextArgs", term185178);
        setIntField(term185167, term185167.getClass(), "instSize", 0);
        setBooleanField(term185167, term185167.getClass(), "opTrap", false);
        setBooleanField(term185167, term185167.getClass(), "irqAsserted", false);
        setBooleanField(term185167, term185167.getClass(), "nmiAsserted", false);
        setIntField(term185167, term185167.getClass(), "lastPc", 0);
        setBooleanField(term185167, term185167.getClass(), "carryFlag", false);
        setBooleanField(term185167, term185167.getClass(), "negativeFlag", false);
        setBooleanField(term185167, term185167.getClass(), "zeroFlag", false);
        setBooleanField(term185167, term185167.getClass(), "irqDisableFlag", false);
        setBooleanField(term185167, term185167.getClass(), "decimalModeFlag", false);
        setBooleanField(term185167, term185167.getClass(), "breakFlag", false);
        setBooleanField(term185167, term185167.getClass(), "overflowFlag", false);
        setLongField(term185167, term185167.getClass(), "stepCounter", 0L);
        setField(term185101, term185101.getClass(), "state", term185167);
        setLongField(term185101, term185101.getClass(), "opBeginTime", 4782766292773586077L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCarryBit", argTypes, term185101, args);
    }

};


