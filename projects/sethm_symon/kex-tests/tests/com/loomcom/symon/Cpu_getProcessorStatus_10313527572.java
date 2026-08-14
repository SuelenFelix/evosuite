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

public class Cpu_getProcessorStatus_10313527572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200125;

    public Cpu_getProcessorStatus_10313527572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term200220 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term200219 = ((Class) term200220).getDeclaredField((String) "NMOS_6502");
        ((Field) term200219).setAccessible(true);
        Object enum252 = ((Field) term200219).get((Object) null);
        HashMap term200151 = new HashMap();
        HashMap term200185 = new HashMap();
        term200125 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term200140 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term200143 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term200145 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term200148 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term200156 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term200157 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term200165 = (int[]) newIntArray(2);
        int[] term200168 = (int[]) newIntArray(2);
        Object[] term200190 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term200191 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term200199 = (int[]) newIntArray(2);
        int[] term200202 = (int[]) newIntArray(2);
        setLongField(term200125, term200125.getClass(), "clockPeriodInNs", 1000L);
        setField(term200125, term200125.getClass(), "behavior", enum252);
        setIntField(term200140, term200140.getClass(), "startAddress", 875017307);
        setIntField(term200140, term200140.getClass(), "endAddress", 523540965);
        setLongField(term200143, term200143.getClass(), "clockPeriodInNs", 1000L);
        setField(term200143, term200143.getClass(), "behavior", enum252);
        setIntField(term200145, term200145.getClass(), "startAddress", -633850097);
        setIntField(term200145, term200145.getClass(), "endAddress", -1643146660);
        setLongField(term200148, term200148.getClass(), "clockPeriodInNs", 1000L);
        setField(term200148, term200148.getClass(), "behavior", enum252);
        setField(term200148, term200148.getClass(), "bus", null);
        setField(term200148, term200148.getClass(), "state", null);
        setLongField(term200148, term200148.getClass(), "opBeginTime", 9164041864010757052L);
        setField(term200145, term200145.getClass(), "cpu", term200148);
        setField(term200145, term200145.getClass(), "deviceMap", term200151);
        setField(term200145, term200145.getClass(), "deviceAddressArray", term200156);
        setField(term200143, term200143.getClass(), "bus", term200145);
        setIntField(term200157, term200157.getClass(), "a", 0);
        setIntField(term200157, term200157.getClass(), "x", 0);
        setIntField(term200157, term200157.getClass(), "y", 0);
        setIntField(term200157, term200157.getClass(), "sp", 0);
        setIntField(term200157, term200157.getClass(), "pc", 0);
        setIntField(term200157, term200157.getClass(), "ir", 0);
        setIntField(term200157, term200157.getClass(), "nextIr", 0);
        setField(term200157, term200157.getClass(), "args", term200165);
        setField(term200157, term200157.getClass(), "nextArgs", term200168);
        setIntField(term200157, term200157.getClass(), "instSize", 0);
        setBooleanField(term200157, term200157.getClass(), "opTrap", false);
        setBooleanField(term200157, term200157.getClass(), "irqAsserted", false);
        setBooleanField(term200157, term200157.getClass(), "nmiAsserted", false);
        setIntField(term200157, term200157.getClass(), "lastPc", 0);
        setBooleanField(term200157, term200157.getClass(), "carryFlag", false);
        setBooleanField(term200157, term200157.getClass(), "negativeFlag", false);
        setBooleanField(term200157, term200157.getClass(), "zeroFlag", false);
        setBooleanField(term200157, term200157.getClass(), "irqDisableFlag", false);
        setBooleanField(term200157, term200157.getClass(), "decimalModeFlag", false);
        setBooleanField(term200157, term200157.getClass(), "breakFlag", false);
        setBooleanField(term200157, term200157.getClass(), "overflowFlag", false);
        setLongField(term200157, term200157.getClass(), "stepCounter", 0L);
        setField(term200143, term200143.getClass(), "state", term200157);
        setLongField(term200143, term200143.getClass(), "opBeginTime", -4710087184100544875L);
        setField(term200140, term200140.getClass(), "cpu", term200143);
        setField(term200140, term200140.getClass(), "deviceMap", term200185);
        setField(term200140, term200140.getClass(), "deviceAddressArray", term200190);
        setField(term200125, term200125.getClass(), "bus", term200140);
        setIntField(term200191, term200191.getClass(), "a", 0);
        setIntField(term200191, term200191.getClass(), "x", 0);
        setIntField(term200191, term200191.getClass(), "y", 0);
        setIntField(term200191, term200191.getClass(), "sp", 0);
        setIntField(term200191, term200191.getClass(), "pc", 0);
        setIntField(term200191, term200191.getClass(), "ir", 0);
        setIntField(term200191, term200191.getClass(), "nextIr", 0);
        setField(term200191, term200191.getClass(), "args", term200199);
        setField(term200191, term200191.getClass(), "nextArgs", term200202);
        setIntField(term200191, term200191.getClass(), "instSize", 0);
        setBooleanField(term200191, term200191.getClass(), "opTrap", false);
        setBooleanField(term200191, term200191.getClass(), "irqAsserted", false);
        setBooleanField(term200191, term200191.getClass(), "nmiAsserted", false);
        setIntField(term200191, term200191.getClass(), "lastPc", 0);
        setBooleanField(term200191, term200191.getClass(), "carryFlag", false);
        setBooleanField(term200191, term200191.getClass(), "negativeFlag", false);
        setBooleanField(term200191, term200191.getClass(), "zeroFlag", false);
        setBooleanField(term200191, term200191.getClass(), "irqDisableFlag", false);
        setBooleanField(term200191, term200191.getClass(), "decimalModeFlag", false);
        setBooleanField(term200191, term200191.getClass(), "breakFlag", false);
        setBooleanField(term200191, term200191.getClass(), "overflowFlag", false);
        setLongField(term200191, term200191.getClass(), "stepCounter", 0L);
        setField(term200125, term200125.getClass(), "state", term200191);
        setLongField(term200125, term200125.getClass(), "opBeginTime", 8351267378333718210L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getProcessorStatus", argTypes, term200125, args);
    }

};


