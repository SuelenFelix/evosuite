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

public class Cpu_getBreakFlag_13375787445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190229;

    public Cpu_getBreakFlag_13375787445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term190324 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term190323 = ((Class) term190324).getDeclaredField((String) "NMOS_6502");
        ((Field) term190323).setAccessible(true);
        Object enum225 = ((Field) term190323).get((Object) null);
        HashMap term190255 = new HashMap();
        HashMap term190289 = new HashMap();
        term190229 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term190244 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term190247 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term190249 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term190252 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term190260 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term190261 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term190269 = (int[]) newIntArray(2);
        int[] term190272 = (int[]) newIntArray(2);
        Object[] term190294 = (Object[]) newArray("com.loomcom.symon.devices.Device", 5);
        Object term190295 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term190303 = (int[]) newIntArray(2);
        int[] term190306 = (int[]) newIntArray(2);
        setLongField(term190229, term190229.getClass(), "clockPeriodInNs", 1000L);
        setField(term190229, term190229.getClass(), "behavior", enum225);
        setIntField(term190244, term190244.getClass(), "startAddress", -662026247);
        setIntField(term190244, term190244.getClass(), "endAddress", -549576351);
        setLongField(term190247, term190247.getClass(), "clockPeriodInNs", 1000L);
        setField(term190247, term190247.getClass(), "behavior", enum225);
        setIntField(term190249, term190249.getClass(), "startAddress", 903450678);
        setIntField(term190249, term190249.getClass(), "endAddress", -923344894);
        setLongField(term190252, term190252.getClass(), "clockPeriodInNs", 1000L);
        setField(term190252, term190252.getClass(), "behavior", enum225);
        setField(term190252, term190252.getClass(), "bus", null);
        setField(term190252, term190252.getClass(), "state", null);
        setLongField(term190252, term190252.getClass(), "opBeginTime", -8441035120108438069L);
        setField(term190249, term190249.getClass(), "cpu", term190252);
        setField(term190249, term190249.getClass(), "deviceMap", term190255);
        setField(term190249, term190249.getClass(), "deviceAddressArray", term190260);
        setField(term190247, term190247.getClass(), "bus", term190249);
        setIntField(term190261, term190261.getClass(), "a", 0);
        setIntField(term190261, term190261.getClass(), "x", 0);
        setIntField(term190261, term190261.getClass(), "y", 0);
        setIntField(term190261, term190261.getClass(), "sp", 0);
        setIntField(term190261, term190261.getClass(), "pc", 0);
        setIntField(term190261, term190261.getClass(), "ir", 0);
        setIntField(term190261, term190261.getClass(), "nextIr", 0);
        setField(term190261, term190261.getClass(), "args", term190269);
        setField(term190261, term190261.getClass(), "nextArgs", term190272);
        setIntField(term190261, term190261.getClass(), "instSize", 0);
        setBooleanField(term190261, term190261.getClass(), "opTrap", false);
        setBooleanField(term190261, term190261.getClass(), "irqAsserted", false);
        setBooleanField(term190261, term190261.getClass(), "nmiAsserted", false);
        setIntField(term190261, term190261.getClass(), "lastPc", 0);
        setBooleanField(term190261, term190261.getClass(), "carryFlag", false);
        setBooleanField(term190261, term190261.getClass(), "negativeFlag", false);
        setBooleanField(term190261, term190261.getClass(), "zeroFlag", false);
        setBooleanField(term190261, term190261.getClass(), "irqDisableFlag", false);
        setBooleanField(term190261, term190261.getClass(), "decimalModeFlag", false);
        setBooleanField(term190261, term190261.getClass(), "breakFlag", false);
        setBooleanField(term190261, term190261.getClass(), "overflowFlag", false);
        setLongField(term190261, term190261.getClass(), "stepCounter", 0L);
        setField(term190247, term190247.getClass(), "state", term190261);
        setLongField(term190247, term190247.getClass(), "opBeginTime", -715683813342234891L);
        setField(term190244, term190244.getClass(), "cpu", term190247);
        setField(term190244, term190244.getClass(), "deviceMap", term190289);
        setField(term190244, term190244.getClass(), "deviceAddressArray", term190294);
        setField(term190229, term190229.getClass(), "bus", term190244);
        setIntField(term190295, term190295.getClass(), "a", 0);
        setIntField(term190295, term190295.getClass(), "x", 0);
        setIntField(term190295, term190295.getClass(), "y", 0);
        setIntField(term190295, term190295.getClass(), "sp", 0);
        setIntField(term190295, term190295.getClass(), "pc", 0);
        setIntField(term190295, term190295.getClass(), "ir", 0);
        setIntField(term190295, term190295.getClass(), "nextIr", 0);
        setField(term190295, term190295.getClass(), "args", term190303);
        setField(term190295, term190295.getClass(), "nextArgs", term190306);
        setIntField(term190295, term190295.getClass(), "instSize", 0);
        setBooleanField(term190295, term190295.getClass(), "opTrap", false);
        setBooleanField(term190295, term190295.getClass(), "irqAsserted", false);
        setBooleanField(term190295, term190295.getClass(), "nmiAsserted", false);
        setIntField(term190295, term190295.getClass(), "lastPc", 0);
        setBooleanField(term190295, term190295.getClass(), "carryFlag", false);
        setBooleanField(term190295, term190295.getClass(), "negativeFlag", false);
        setBooleanField(term190295, term190295.getClass(), "zeroFlag", false);
        setBooleanField(term190295, term190295.getClass(), "irqDisableFlag", false);
        setBooleanField(term190295, term190295.getClass(), "decimalModeFlag", false);
        setBooleanField(term190295, term190295.getClass(), "breakFlag", false);
        setBooleanField(term190295, term190295.getClass(), "overflowFlag", false);
        setLongField(term190295, term190295.getClass(), "stepCounter", 0L);
        setField(term190229, term190229.getClass(), "state", term190295);
        setLongField(term190229, term190229.getClass(), "opBeginTime", -7012409967252303497L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBreakFlag", argTypes, term190229, args);
    }

};


