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

public class Cpu_getAccumulatorStatus_89105702067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198295;

    public Cpu_getAccumulatorStatus_89105702067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term198390 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term198389 = ((Class) term198390).getDeclaredField((String) "NMOS_6502");
        ((Field) term198389).setAccessible(true);
        Object enum247 = ((Field) term198389).get((Object) null);
        HashMap term198321 = new HashMap();
        HashMap term198355 = new HashMap();
        term198295 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term198310 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term198313 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term198315 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term198318 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term198326 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term198327 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term198335 = (int[]) newIntArray(2);
        int[] term198338 = (int[]) newIntArray(2);
        Object[] term198360 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term198361 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term198369 = (int[]) newIntArray(2);
        int[] term198372 = (int[]) newIntArray(2);
        setLongField(term198295, term198295.getClass(), "clockPeriodInNs", 1000L);
        setField(term198295, term198295.getClass(), "behavior", enum247);
        setIntField(term198310, term198310.getClass(), "startAddress", 299991969);
        setIntField(term198310, term198310.getClass(), "endAddress", -314712088);
        setLongField(term198313, term198313.getClass(), "clockPeriodInNs", 1000L);
        setField(term198313, term198313.getClass(), "behavior", enum247);
        setIntField(term198315, term198315.getClass(), "startAddress", 673401830);
        setIntField(term198315, term198315.getClass(), "endAddress", 274393548);
        setLongField(term198318, term198318.getClass(), "clockPeriodInNs", 1000L);
        setField(term198318, term198318.getClass(), "behavior", enum247);
        setField(term198318, term198318.getClass(), "bus", null);
        setField(term198318, term198318.getClass(), "state", null);
        setLongField(term198318, term198318.getClass(), "opBeginTime", 4157679554798000555L);
        setField(term198315, term198315.getClass(), "cpu", term198318);
        setField(term198315, term198315.getClass(), "deviceMap", term198321);
        setField(term198315, term198315.getClass(), "deviceAddressArray", term198326);
        setField(term198313, term198313.getClass(), "bus", term198315);
        setIntField(term198327, term198327.getClass(), "a", 0);
        setIntField(term198327, term198327.getClass(), "x", 0);
        setIntField(term198327, term198327.getClass(), "y", 0);
        setIntField(term198327, term198327.getClass(), "sp", 0);
        setIntField(term198327, term198327.getClass(), "pc", 0);
        setIntField(term198327, term198327.getClass(), "ir", 0);
        setIntField(term198327, term198327.getClass(), "nextIr", 0);
        setField(term198327, term198327.getClass(), "args", term198335);
        setField(term198327, term198327.getClass(), "nextArgs", term198338);
        setIntField(term198327, term198327.getClass(), "instSize", 0);
        setBooleanField(term198327, term198327.getClass(), "opTrap", false);
        setBooleanField(term198327, term198327.getClass(), "irqAsserted", false);
        setBooleanField(term198327, term198327.getClass(), "nmiAsserted", false);
        setIntField(term198327, term198327.getClass(), "lastPc", 0);
        setBooleanField(term198327, term198327.getClass(), "carryFlag", false);
        setBooleanField(term198327, term198327.getClass(), "negativeFlag", false);
        setBooleanField(term198327, term198327.getClass(), "zeroFlag", false);
        setBooleanField(term198327, term198327.getClass(), "irqDisableFlag", false);
        setBooleanField(term198327, term198327.getClass(), "decimalModeFlag", false);
        setBooleanField(term198327, term198327.getClass(), "breakFlag", false);
        setBooleanField(term198327, term198327.getClass(), "overflowFlag", false);
        setLongField(term198327, term198327.getClass(), "stepCounter", 0L);
        setField(term198313, term198313.getClass(), "state", term198327);
        setLongField(term198313, term198313.getClass(), "opBeginTime", -6869725878798445523L);
        setField(term198310, term198310.getClass(), "cpu", term198313);
        setField(term198310, term198310.getClass(), "deviceMap", term198355);
        setField(term198310, term198310.getClass(), "deviceAddressArray", term198360);
        setField(term198295, term198295.getClass(), "bus", term198310);
        setIntField(term198361, term198361.getClass(), "a", 0);
        setIntField(term198361, term198361.getClass(), "x", 0);
        setIntField(term198361, term198361.getClass(), "y", 0);
        setIntField(term198361, term198361.getClass(), "sp", 0);
        setIntField(term198361, term198361.getClass(), "pc", 0);
        setIntField(term198361, term198361.getClass(), "ir", 0);
        setIntField(term198361, term198361.getClass(), "nextIr", 0);
        setField(term198361, term198361.getClass(), "args", term198369);
        setField(term198361, term198361.getClass(), "nextArgs", term198372);
        setIntField(term198361, term198361.getClass(), "instSize", 0);
        setBooleanField(term198361, term198361.getClass(), "opTrap", false);
        setBooleanField(term198361, term198361.getClass(), "irqAsserted", false);
        setBooleanField(term198361, term198361.getClass(), "nmiAsserted", false);
        setIntField(term198361, term198361.getClass(), "lastPc", 0);
        setBooleanField(term198361, term198361.getClass(), "carryFlag", false);
        setBooleanField(term198361, term198361.getClass(), "negativeFlag", false);
        setBooleanField(term198361, term198361.getClass(), "zeroFlag", false);
        setBooleanField(term198361, term198361.getClass(), "irqDisableFlag", false);
        setBooleanField(term198361, term198361.getClass(), "decimalModeFlag", false);
        setBooleanField(term198361, term198361.getClass(), "breakFlag", false);
        setBooleanField(term198361, term198361.getClass(), "overflowFlag", false);
        setLongField(term198361, term198361.getClass(), "stepCounter", 0L);
        setField(term198295, term198295.getClass(), "state", term198361);
        setLongField(term198295, term198295.getClass(), "opBeginTime", -1338195308090100406L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAccumulatorStatus", argTypes, term198295, args);
    }

};


