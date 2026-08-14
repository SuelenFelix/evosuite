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

public class Cpu_delayLoop_31373191086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205265;
     Object term205359;

    public Cpu_delayLoop_31373191086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term205362 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term205361 = ((Class) term205362).getDeclaredField((String) "NMOS_6502");
        ((Field) term205361).setAccessible(true);
        Object enum266 = ((Field) term205361).get((Object) null);
        HashMap term205291 = new HashMap();
        HashMap term205325 = new HashMap();
        term205265 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term205280 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term205283 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term205285 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term205288 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term205296 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term205297 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term205305 = (int[]) newIntArray(2);
        int[] term205308 = (int[]) newIntArray(2);
        Object[] term205330 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term205331 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term205339 = (int[]) newIntArray(2);
        int[] term205342 = (int[]) newIntArray(2);
        setLongField(term205265, term205265.getClass(), "clockPeriodInNs", 1000L);
        setField(term205265, term205265.getClass(), "behavior", enum266);
        setIntField(term205280, term205280.getClass(), "startAddress", 750963355);
        setIntField(term205280, term205280.getClass(), "endAddress", -1939304192);
        setLongField(term205283, term205283.getClass(), "clockPeriodInNs", 1000L);
        setField(term205283, term205283.getClass(), "behavior", enum266);
        setIntField(term205285, term205285.getClass(), "startAddress", 2062007036);
        setIntField(term205285, term205285.getClass(), "endAddress", 2099511779);
        setLongField(term205288, term205288.getClass(), "clockPeriodInNs", 1000L);
        setField(term205288, term205288.getClass(), "behavior", enum266);
        setField(term205288, term205288.getClass(), "bus", null);
        setField(term205288, term205288.getClass(), "state", null);
        setLongField(term205288, term205288.getClass(), "opBeginTime", 7685476896447838804L);
        setField(term205285, term205285.getClass(), "cpu", term205288);
        setField(term205285, term205285.getClass(), "deviceMap", term205291);
        setField(term205285, term205285.getClass(), "deviceAddressArray", term205296);
        setField(term205283, term205283.getClass(), "bus", term205285);
        setIntField(term205297, term205297.getClass(), "a", 0);
        setIntField(term205297, term205297.getClass(), "x", 0);
        setIntField(term205297, term205297.getClass(), "y", 0);
        setIntField(term205297, term205297.getClass(), "sp", 0);
        setIntField(term205297, term205297.getClass(), "pc", 0);
        setIntField(term205297, term205297.getClass(), "ir", 0);
        setIntField(term205297, term205297.getClass(), "nextIr", 0);
        setField(term205297, term205297.getClass(), "args", term205305);
        setField(term205297, term205297.getClass(), "nextArgs", term205308);
        setIntField(term205297, term205297.getClass(), "instSize", 0);
        setBooleanField(term205297, term205297.getClass(), "opTrap", false);
        setBooleanField(term205297, term205297.getClass(), "irqAsserted", false);
        setBooleanField(term205297, term205297.getClass(), "nmiAsserted", false);
        setIntField(term205297, term205297.getClass(), "lastPc", 0);
        setBooleanField(term205297, term205297.getClass(), "carryFlag", false);
        setBooleanField(term205297, term205297.getClass(), "negativeFlag", false);
        setBooleanField(term205297, term205297.getClass(), "zeroFlag", false);
        setBooleanField(term205297, term205297.getClass(), "irqDisableFlag", false);
        setBooleanField(term205297, term205297.getClass(), "decimalModeFlag", false);
        setBooleanField(term205297, term205297.getClass(), "breakFlag", false);
        setBooleanField(term205297, term205297.getClass(), "overflowFlag", false);
        setLongField(term205297, term205297.getClass(), "stepCounter", 0L);
        setField(term205283, term205283.getClass(), "state", term205297);
        setLongField(term205283, term205283.getClass(), "opBeginTime", -7583612555465533678L);
        setField(term205280, term205280.getClass(), "cpu", term205283);
        setField(term205280, term205280.getClass(), "deviceMap", term205325);
        setField(term205280, term205280.getClass(), "deviceAddressArray", term205330);
        setField(term205265, term205265.getClass(), "bus", term205280);
        setIntField(term205331, term205331.getClass(), "a", 0);
        setIntField(term205331, term205331.getClass(), "x", 0);
        setIntField(term205331, term205331.getClass(), "y", 0);
        setIntField(term205331, term205331.getClass(), "sp", 0);
        setIntField(term205331, term205331.getClass(), "pc", 0);
        setIntField(term205331, term205331.getClass(), "ir", 0);
        setIntField(term205331, term205331.getClass(), "nextIr", 0);
        setField(term205331, term205331.getClass(), "args", term205339);
        setField(term205331, term205331.getClass(), "nextArgs", term205342);
        setIntField(term205331, term205331.getClass(), "instSize", 0);
        setBooleanField(term205331, term205331.getClass(), "opTrap", false);
        setBooleanField(term205331, term205331.getClass(), "irqAsserted", false);
        setBooleanField(term205331, term205331.getClass(), "nmiAsserted", false);
        setIntField(term205331, term205331.getClass(), "lastPc", 0);
        setBooleanField(term205331, term205331.getClass(), "carryFlag", false);
        setBooleanField(term205331, term205331.getClass(), "negativeFlag", false);
        setBooleanField(term205331, term205331.getClass(), "zeroFlag", false);
        setBooleanField(term205331, term205331.getClass(), "irqDisableFlag", false);
        setBooleanField(term205331, term205331.getClass(), "decimalModeFlag", false);
        setBooleanField(term205331, term205331.getClass(), "breakFlag", false);
        setBooleanField(term205331, term205331.getClass(), "overflowFlag", false);
        setLongField(term205331, term205331.getClass(), "stepCounter", 0L);
        setField(term205265, term205265.getClass(), "state", term205331);
        setLongField(term205265, term205265.getClass(), "opBeginTime", -1040140369921518682L);
        term205359 = new Integer(-101025934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term205359;
        callMethod(klass, "delayLoop", argTypes, term205265, args);
    }

};


