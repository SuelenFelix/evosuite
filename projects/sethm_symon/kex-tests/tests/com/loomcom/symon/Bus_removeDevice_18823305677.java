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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Bus_removeDevice_18823305677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37595;

    public Bus_removeDevice_18823305677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37684 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term37683 = ((Class) term37684).getDeclaredField((String) "NMOS_6502");
        ((Field) term37683).setAccessible(true);
        Object enum27 = ((Field) term37683).get((Object) null);
        HashMap term37643 = new HashMap();
        HashMap term37677 = new HashMap();
        term37595 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term37598 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term37613 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term37616 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term37618 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term37621 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term37648 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term37649 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term37657 = (int[]) newIntArray(2);
        int[] term37660 = (int[]) newIntArray(2);
        Object[] term37682 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        setIntField(term37595, term37595.getClass(), "startAddress", 298082829);
        setIntField(term37595, term37595.getClass(), "endAddress", -1494372780);
        setLongField(term37598, term37598.getClass(), "clockPeriodInNs", 1000L);
        setField(term37598, term37598.getClass(), "behavior", enum27);
        setIntField(term37613, term37613.getClass(), "startAddress", 703799187);
        setIntField(term37613, term37613.getClass(), "endAddress", -1305898281);
        setLongField(term37616, term37616.getClass(), "clockPeriodInNs", 1000L);
        setField(term37616, term37616.getClass(), "behavior", enum27);
        setIntField(term37618, term37618.getClass(), "startAddress", 140501130);
        setIntField(term37618, term37618.getClass(), "endAddress", -1458890291);
        setField(term37618, term37618.getClass(), "cpu", null);
        setField(term37618, term37618.getClass(), "deviceMap", null);
        setField(term37618, term37618.getClass(), "deviceAddressArray", null);
        setField(term37616, term37616.getClass(), "bus", term37618);
        setIntField(term37621, term37621.getClass(), "a", 0);
        setIntField(term37621, term37621.getClass(), "x", 0);
        setIntField(term37621, term37621.getClass(), "y", 0);
        setIntField(term37621, term37621.getClass(), "sp", 0);
        setIntField(term37621, term37621.getClass(), "pc", 0);
        setIntField(term37621, term37621.getClass(), "ir", 0);
        setIntField(term37621, term37621.getClass(), "nextIr", 0);
        setField(term37621, term37621.getClass(), "args", null);
        setField(term37621, term37621.getClass(), "nextArgs", null);
        setIntField(term37621, term37621.getClass(), "instSize", 0);
        setBooleanField(term37621, term37621.getClass(), "opTrap", false);
        setBooleanField(term37621, term37621.getClass(), "irqAsserted", false);
        setBooleanField(term37621, term37621.getClass(), "nmiAsserted", false);
        setIntField(term37621, term37621.getClass(), "lastPc", 0);
        setBooleanField(term37621, term37621.getClass(), "carryFlag", false);
        setBooleanField(term37621, term37621.getClass(), "negativeFlag", false);
        setBooleanField(term37621, term37621.getClass(), "zeroFlag", false);
        setBooleanField(term37621, term37621.getClass(), "irqDisableFlag", false);
        setBooleanField(term37621, term37621.getClass(), "decimalModeFlag", false);
        setBooleanField(term37621, term37621.getClass(), "breakFlag", false);
        setBooleanField(term37621, term37621.getClass(), "overflowFlag", false);
        setLongField(term37621, term37621.getClass(), "stepCounter", 0L);
        setField(term37616, term37616.getClass(), "state", term37621);
        setLongField(term37616, term37616.getClass(), "opBeginTime", 3412644969878030772L);
        setField(term37613, term37613.getClass(), "cpu", term37616);
        setField(term37613, term37613.getClass(), "deviceMap", term37643);
        setField(term37613, term37613.getClass(), "deviceAddressArray", term37648);
        setField(term37598, term37598.getClass(), "bus", term37613);
        setIntField(term37649, term37649.getClass(), "a", 0);
        setIntField(term37649, term37649.getClass(), "x", 0);
        setIntField(term37649, term37649.getClass(), "y", 0);
        setIntField(term37649, term37649.getClass(), "sp", 0);
        setIntField(term37649, term37649.getClass(), "pc", 0);
        setIntField(term37649, term37649.getClass(), "ir", 0);
        setIntField(term37649, term37649.getClass(), "nextIr", 0);
        setField(term37649, term37649.getClass(), "args", term37657);
        setField(term37649, term37649.getClass(), "nextArgs", term37660);
        setIntField(term37649, term37649.getClass(), "instSize", 0);
        setBooleanField(term37649, term37649.getClass(), "opTrap", false);
        setBooleanField(term37649, term37649.getClass(), "irqAsserted", false);
        setBooleanField(term37649, term37649.getClass(), "nmiAsserted", false);
        setIntField(term37649, term37649.getClass(), "lastPc", 0);
        setBooleanField(term37649, term37649.getClass(), "carryFlag", false);
        setBooleanField(term37649, term37649.getClass(), "negativeFlag", false);
        setBooleanField(term37649, term37649.getClass(), "zeroFlag", false);
        setBooleanField(term37649, term37649.getClass(), "irqDisableFlag", false);
        setBooleanField(term37649, term37649.getClass(), "decimalModeFlag", false);
        setBooleanField(term37649, term37649.getClass(), "breakFlag", false);
        setBooleanField(term37649, term37649.getClass(), "overflowFlag", false);
        setLongField(term37649, term37649.getClass(), "stepCounter", 0L);
        setField(term37598, term37598.getClass(), "state", term37649);
        setLongField(term37598, term37598.getClass(), "opBeginTime", 6698455537431331246L);
        setField(term37595, term37595.getClass(), "cpu", term37598);
        setField(term37595, term37595.getClass(), "deviceMap", term37677);
        setField(term37595, term37595.getClass(), "deviceAddressArray", term37682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.loomcom.symon.devices.Device");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "removeDevice", argTypes, term37595, args);
    }

};


