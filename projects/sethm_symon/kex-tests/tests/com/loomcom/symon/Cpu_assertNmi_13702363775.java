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

public class Cpu_assertNmi_13702363775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201223;

    public Cpu_assertNmi_13702363775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term201318 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term201317 = ((Class) term201318).getDeclaredField((String) "NMOS_6502");
        ((Field) term201317).setAccessible(true);
        Object enum255 = ((Field) term201317).get((Object) null);
        HashMap term201249 = new HashMap();
        HashMap term201283 = new HashMap();
        term201223 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term201238 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term201241 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term201243 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term201246 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term201254 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term201255 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term201263 = (int[]) newIntArray(2);
        int[] term201266 = (int[]) newIntArray(2);
        Object[] term201288 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term201289 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term201297 = (int[]) newIntArray(2);
        int[] term201300 = (int[]) newIntArray(2);
        setLongField(term201223, term201223.getClass(), "clockPeriodInNs", 1000L);
        setField(term201223, term201223.getClass(), "behavior", enum255);
        setIntField(term201238, term201238.getClass(), "startAddress", -1707996167);
        setIntField(term201238, term201238.getClass(), "endAddress", 1222265931);
        setLongField(term201241, term201241.getClass(), "clockPeriodInNs", 1000L);
        setField(term201241, term201241.getClass(), "behavior", enum255);
        setIntField(term201243, term201243.getClass(), "startAddress", 1684951870);
        setIntField(term201243, term201243.getClass(), "endAddress", -1511199281);
        setLongField(term201246, term201246.getClass(), "clockPeriodInNs", 1000L);
        setField(term201246, term201246.getClass(), "behavior", enum255);
        setField(term201246, term201246.getClass(), "bus", null);
        setField(term201246, term201246.getClass(), "state", null);
        setLongField(term201246, term201246.getClass(), "opBeginTime", 3415544654174435087L);
        setField(term201243, term201243.getClass(), "cpu", term201246);
        setField(term201243, term201243.getClass(), "deviceMap", term201249);
        setField(term201243, term201243.getClass(), "deviceAddressArray", term201254);
        setField(term201241, term201241.getClass(), "bus", term201243);
        setIntField(term201255, term201255.getClass(), "a", 0);
        setIntField(term201255, term201255.getClass(), "x", 0);
        setIntField(term201255, term201255.getClass(), "y", 0);
        setIntField(term201255, term201255.getClass(), "sp", 0);
        setIntField(term201255, term201255.getClass(), "pc", 0);
        setIntField(term201255, term201255.getClass(), "ir", 0);
        setIntField(term201255, term201255.getClass(), "nextIr", 0);
        setField(term201255, term201255.getClass(), "args", term201263);
        setField(term201255, term201255.getClass(), "nextArgs", term201266);
        setIntField(term201255, term201255.getClass(), "instSize", 0);
        setBooleanField(term201255, term201255.getClass(), "opTrap", false);
        setBooleanField(term201255, term201255.getClass(), "irqAsserted", false);
        setBooleanField(term201255, term201255.getClass(), "nmiAsserted", false);
        setIntField(term201255, term201255.getClass(), "lastPc", 0);
        setBooleanField(term201255, term201255.getClass(), "carryFlag", false);
        setBooleanField(term201255, term201255.getClass(), "negativeFlag", false);
        setBooleanField(term201255, term201255.getClass(), "zeroFlag", false);
        setBooleanField(term201255, term201255.getClass(), "irqDisableFlag", false);
        setBooleanField(term201255, term201255.getClass(), "decimalModeFlag", false);
        setBooleanField(term201255, term201255.getClass(), "breakFlag", false);
        setBooleanField(term201255, term201255.getClass(), "overflowFlag", false);
        setLongField(term201255, term201255.getClass(), "stepCounter", 0L);
        setField(term201241, term201241.getClass(), "state", term201255);
        setLongField(term201241, term201241.getClass(), "opBeginTime", -6444648462294378605L);
        setField(term201238, term201238.getClass(), "cpu", term201241);
        setField(term201238, term201238.getClass(), "deviceMap", term201283);
        setField(term201238, term201238.getClass(), "deviceAddressArray", term201288);
        setField(term201223, term201223.getClass(), "bus", term201238);
        setIntField(term201289, term201289.getClass(), "a", 0);
        setIntField(term201289, term201289.getClass(), "x", 0);
        setIntField(term201289, term201289.getClass(), "y", 0);
        setIntField(term201289, term201289.getClass(), "sp", 0);
        setIntField(term201289, term201289.getClass(), "pc", 0);
        setIntField(term201289, term201289.getClass(), "ir", 0);
        setIntField(term201289, term201289.getClass(), "nextIr", 0);
        setField(term201289, term201289.getClass(), "args", term201297);
        setField(term201289, term201289.getClass(), "nextArgs", term201300);
        setIntField(term201289, term201289.getClass(), "instSize", 0);
        setBooleanField(term201289, term201289.getClass(), "opTrap", false);
        setBooleanField(term201289, term201289.getClass(), "irqAsserted", false);
        setBooleanField(term201289, term201289.getClass(), "nmiAsserted", false);
        setIntField(term201289, term201289.getClass(), "lastPc", 0);
        setBooleanField(term201289, term201289.getClass(), "carryFlag", false);
        setBooleanField(term201289, term201289.getClass(), "negativeFlag", false);
        setBooleanField(term201289, term201289.getClass(), "zeroFlag", false);
        setBooleanField(term201289, term201289.getClass(), "irqDisableFlag", false);
        setBooleanField(term201289, term201289.getClass(), "decimalModeFlag", false);
        setBooleanField(term201289, term201289.getClass(), "breakFlag", false);
        setBooleanField(term201289, term201289.getClass(), "overflowFlag", false);
        setLongField(term201289, term201289.getClass(), "stepCounter", 0L);
        setField(term201223, term201223.getClass(), "state", term201289);
        setLongField(term201223, term201223.getClass(), "opBeginTime", 2399163633137062666L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "assertNmi", argTypes, term201223, args);
    }

};


