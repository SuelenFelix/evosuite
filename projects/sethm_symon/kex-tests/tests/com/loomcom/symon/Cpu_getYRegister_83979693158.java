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

public class Cpu_getYRegister_83979693158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194993;

    public Cpu_getYRegister_83979693158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term195088 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term195087 = ((Class) term195088).getDeclaredField((String) "NMOS_6502");
        ((Field) term195087).setAccessible(true);
        Object enum238 = ((Field) term195087).get((Object) null);
        HashMap term195019 = new HashMap();
        HashMap term195053 = new HashMap();
        term194993 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term195008 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term195011 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term195013 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term195016 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term195024 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term195025 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term195033 = (int[]) newIntArray(2);
        int[] term195036 = (int[]) newIntArray(2);
        Object[] term195058 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term195059 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term195067 = (int[]) newIntArray(2);
        int[] term195070 = (int[]) newIntArray(2);
        setLongField(term194993, term194993.getClass(), "clockPeriodInNs", 1000L);
        setField(term194993, term194993.getClass(), "behavior", enum238);
        setIntField(term195008, term195008.getClass(), "startAddress", -555983707);
        setIntField(term195008, term195008.getClass(), "endAddress", -606116015);
        setLongField(term195011, term195011.getClass(), "clockPeriodInNs", 1000L);
        setField(term195011, term195011.getClass(), "behavior", enum238);
        setIntField(term195013, term195013.getClass(), "startAddress", -181890457);
        setIntField(term195013, term195013.getClass(), "endAddress", -944465027);
        setLongField(term195016, term195016.getClass(), "clockPeriodInNs", 1000L);
        setField(term195016, term195016.getClass(), "behavior", enum238);
        setField(term195016, term195016.getClass(), "bus", null);
        setField(term195016, term195016.getClass(), "state", null);
        setLongField(term195016, term195016.getClass(), "opBeginTime", -5921915827741960720L);
        setField(term195013, term195013.getClass(), "cpu", term195016);
        setField(term195013, term195013.getClass(), "deviceMap", term195019);
        setField(term195013, term195013.getClass(), "deviceAddressArray", term195024);
        setField(term195011, term195011.getClass(), "bus", term195013);
        setIntField(term195025, term195025.getClass(), "a", 0);
        setIntField(term195025, term195025.getClass(), "x", 0);
        setIntField(term195025, term195025.getClass(), "y", 0);
        setIntField(term195025, term195025.getClass(), "sp", 0);
        setIntField(term195025, term195025.getClass(), "pc", 0);
        setIntField(term195025, term195025.getClass(), "ir", 0);
        setIntField(term195025, term195025.getClass(), "nextIr", 0);
        setField(term195025, term195025.getClass(), "args", term195033);
        setField(term195025, term195025.getClass(), "nextArgs", term195036);
        setIntField(term195025, term195025.getClass(), "instSize", 0);
        setBooleanField(term195025, term195025.getClass(), "opTrap", false);
        setBooleanField(term195025, term195025.getClass(), "irqAsserted", false);
        setBooleanField(term195025, term195025.getClass(), "nmiAsserted", false);
        setIntField(term195025, term195025.getClass(), "lastPc", 0);
        setBooleanField(term195025, term195025.getClass(), "carryFlag", false);
        setBooleanField(term195025, term195025.getClass(), "negativeFlag", false);
        setBooleanField(term195025, term195025.getClass(), "zeroFlag", false);
        setBooleanField(term195025, term195025.getClass(), "irqDisableFlag", false);
        setBooleanField(term195025, term195025.getClass(), "decimalModeFlag", false);
        setBooleanField(term195025, term195025.getClass(), "breakFlag", false);
        setBooleanField(term195025, term195025.getClass(), "overflowFlag", false);
        setLongField(term195025, term195025.getClass(), "stepCounter", 0L);
        setField(term195011, term195011.getClass(), "state", term195025);
        setLongField(term195011, term195011.getClass(), "opBeginTime", -2480054455719869328L);
        setField(term195008, term195008.getClass(), "cpu", term195011);
        setField(term195008, term195008.getClass(), "deviceMap", term195053);
        setField(term195008, term195008.getClass(), "deviceAddressArray", term195058);
        setField(term194993, term194993.getClass(), "bus", term195008);
        setIntField(term195059, term195059.getClass(), "a", 0);
        setIntField(term195059, term195059.getClass(), "x", 0);
        setIntField(term195059, term195059.getClass(), "y", 0);
        setIntField(term195059, term195059.getClass(), "sp", 0);
        setIntField(term195059, term195059.getClass(), "pc", 0);
        setIntField(term195059, term195059.getClass(), "ir", 0);
        setIntField(term195059, term195059.getClass(), "nextIr", 0);
        setField(term195059, term195059.getClass(), "args", term195067);
        setField(term195059, term195059.getClass(), "nextArgs", term195070);
        setIntField(term195059, term195059.getClass(), "instSize", 0);
        setBooleanField(term195059, term195059.getClass(), "opTrap", false);
        setBooleanField(term195059, term195059.getClass(), "irqAsserted", false);
        setBooleanField(term195059, term195059.getClass(), "nmiAsserted", false);
        setIntField(term195059, term195059.getClass(), "lastPc", 0);
        setBooleanField(term195059, term195059.getClass(), "carryFlag", false);
        setBooleanField(term195059, term195059.getClass(), "negativeFlag", false);
        setBooleanField(term195059, term195059.getClass(), "zeroFlag", false);
        setBooleanField(term195059, term195059.getClass(), "irqDisableFlag", false);
        setBooleanField(term195059, term195059.getClass(), "decimalModeFlag", false);
        setBooleanField(term195059, term195059.getClass(), "breakFlag", false);
        setBooleanField(term195059, term195059.getClass(), "overflowFlag", false);
        setLongField(term195059, term195059.getClass(), "stepCounter", 0L);
        setField(term194993, term194993.getClass(), "state", term195059);
        setLongField(term194993, term194993.getClass(), "opBeginTime", 8637380632328451251L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getYRegister", argTypes, term194993, args);
    }

};


