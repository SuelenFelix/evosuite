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

public class Cpu_getYRegisterStatus_15622074269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199027;

    public Cpu_getYRegisterStatus_15622074269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term199122 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term199121 = ((Class) term199122).getDeclaredField((String) "NMOS_6502");
        ((Field) term199121).setAccessible(true);
        Object enum249 = ((Field) term199121).get((Object) null);
        HashMap term199053 = new HashMap();
        HashMap term199087 = new HashMap();
        term199027 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term199042 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term199045 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term199047 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term199050 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term199058 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term199059 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term199067 = (int[]) newIntArray(2);
        int[] term199070 = (int[]) newIntArray(2);
        Object[] term199092 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term199093 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term199101 = (int[]) newIntArray(2);
        int[] term199104 = (int[]) newIntArray(2);
        setLongField(term199027, term199027.getClass(), "clockPeriodInNs", 1000L);
        setField(term199027, term199027.getClass(), "behavior", enum249);
        setIntField(term199042, term199042.getClass(), "startAddress", -881873928);
        setIntField(term199042, term199042.getClass(), "endAddress", 813195927);
        setLongField(term199045, term199045.getClass(), "clockPeriodInNs", 1000L);
        setField(term199045, term199045.getClass(), "behavior", enum249);
        setIntField(term199047, term199047.getClass(), "startAddress", 837178544);
        setIntField(term199047, term199047.getClass(), "endAddress", 933005179);
        setLongField(term199050, term199050.getClass(), "clockPeriodInNs", 1000L);
        setField(term199050, term199050.getClass(), "behavior", enum249);
        setField(term199050, term199050.getClass(), "bus", null);
        setField(term199050, term199050.getClass(), "state", null);
        setLongField(term199050, term199050.getClass(), "opBeginTime", -7876013692629304244L);
        setField(term199047, term199047.getClass(), "cpu", term199050);
        setField(term199047, term199047.getClass(), "deviceMap", term199053);
        setField(term199047, term199047.getClass(), "deviceAddressArray", term199058);
        setField(term199045, term199045.getClass(), "bus", term199047);
        setIntField(term199059, term199059.getClass(), "a", 0);
        setIntField(term199059, term199059.getClass(), "x", 0);
        setIntField(term199059, term199059.getClass(), "y", 0);
        setIntField(term199059, term199059.getClass(), "sp", 0);
        setIntField(term199059, term199059.getClass(), "pc", 0);
        setIntField(term199059, term199059.getClass(), "ir", 0);
        setIntField(term199059, term199059.getClass(), "nextIr", 0);
        setField(term199059, term199059.getClass(), "args", term199067);
        setField(term199059, term199059.getClass(), "nextArgs", term199070);
        setIntField(term199059, term199059.getClass(), "instSize", 0);
        setBooleanField(term199059, term199059.getClass(), "opTrap", false);
        setBooleanField(term199059, term199059.getClass(), "irqAsserted", false);
        setBooleanField(term199059, term199059.getClass(), "nmiAsserted", false);
        setIntField(term199059, term199059.getClass(), "lastPc", 0);
        setBooleanField(term199059, term199059.getClass(), "carryFlag", false);
        setBooleanField(term199059, term199059.getClass(), "negativeFlag", false);
        setBooleanField(term199059, term199059.getClass(), "zeroFlag", false);
        setBooleanField(term199059, term199059.getClass(), "irqDisableFlag", false);
        setBooleanField(term199059, term199059.getClass(), "decimalModeFlag", false);
        setBooleanField(term199059, term199059.getClass(), "breakFlag", false);
        setBooleanField(term199059, term199059.getClass(), "overflowFlag", false);
        setLongField(term199059, term199059.getClass(), "stepCounter", 0L);
        setField(term199045, term199045.getClass(), "state", term199059);
        setLongField(term199045, term199045.getClass(), "opBeginTime", 8129782425142702673L);
        setField(term199042, term199042.getClass(), "cpu", term199045);
        setField(term199042, term199042.getClass(), "deviceMap", term199087);
        setField(term199042, term199042.getClass(), "deviceAddressArray", term199092);
        setField(term199027, term199027.getClass(), "bus", term199042);
        setIntField(term199093, term199093.getClass(), "a", 0);
        setIntField(term199093, term199093.getClass(), "x", 0);
        setIntField(term199093, term199093.getClass(), "y", 0);
        setIntField(term199093, term199093.getClass(), "sp", 0);
        setIntField(term199093, term199093.getClass(), "pc", 0);
        setIntField(term199093, term199093.getClass(), "ir", 0);
        setIntField(term199093, term199093.getClass(), "nextIr", 0);
        setField(term199093, term199093.getClass(), "args", term199101);
        setField(term199093, term199093.getClass(), "nextArgs", term199104);
        setIntField(term199093, term199093.getClass(), "instSize", 0);
        setBooleanField(term199093, term199093.getClass(), "opTrap", false);
        setBooleanField(term199093, term199093.getClass(), "irqAsserted", false);
        setBooleanField(term199093, term199093.getClass(), "nmiAsserted", false);
        setIntField(term199093, term199093.getClass(), "lastPc", 0);
        setBooleanField(term199093, term199093.getClass(), "carryFlag", false);
        setBooleanField(term199093, term199093.getClass(), "negativeFlag", false);
        setBooleanField(term199093, term199093.getClass(), "zeroFlag", false);
        setBooleanField(term199093, term199093.getClass(), "irqDisableFlag", false);
        setBooleanField(term199093, term199093.getClass(), "decimalModeFlag", false);
        setBooleanField(term199093, term199093.getClass(), "breakFlag", false);
        setBooleanField(term199093, term199093.getClass(), "overflowFlag", false);
        setLongField(term199093, term199093.getClass(), "stepCounter", 0L);
        setField(term199027, term199027.getClass(), "state", term199093);
        setLongField(term199027, term199027.getClass(), "opBeginTime", -1348078265481224468L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getYRegisterStatus", argTypes, term199027, args);
    }

};


