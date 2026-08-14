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
import java.lang.Integer;

public class Bus_addDevice_5115896345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36881;
     Object term36969;

    public Bus_addDevice_5115896345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36972 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term36971 = ((Class) term36972).getDeclaredField((String) "NMOS_6502");
        ((Field) term36971).setAccessible(true);
        Object enum25 = ((Field) term36971).get((Object) null);
        HashMap term36929 = new HashMap();
        HashMap term36963 = new HashMap();
        term36881 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term36884 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term36899 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term36902 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term36904 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term36907 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term36934 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term36935 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term36943 = (int[]) newIntArray(2);
        int[] term36946 = (int[]) newIntArray(2);
        Object[] term36968 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        setIntField(term36881, term36881.getClass(), "startAddress", 750084083);
        setIntField(term36881, term36881.getClass(), "endAddress", -1603460382);
        setLongField(term36884, term36884.getClass(), "clockPeriodInNs", 1000L);
        setField(term36884, term36884.getClass(), "behavior", enum25);
        setIntField(term36899, term36899.getClass(), "startAddress", -298939768);
        setIntField(term36899, term36899.getClass(), "endAddress", -767031634);
        setLongField(term36902, term36902.getClass(), "clockPeriodInNs", 1000L);
        setField(term36902, term36902.getClass(), "behavior", enum25);
        setIntField(term36904, term36904.getClass(), "startAddress", -2072469750);
        setIntField(term36904, term36904.getClass(), "endAddress", 2106616847);
        setField(term36904, term36904.getClass(), "cpu", null);
        setField(term36904, term36904.getClass(), "deviceMap", null);
        setField(term36904, term36904.getClass(), "deviceAddressArray", null);
        setField(term36902, term36902.getClass(), "bus", term36904);
        setIntField(term36907, term36907.getClass(), "a", 0);
        setIntField(term36907, term36907.getClass(), "x", 0);
        setIntField(term36907, term36907.getClass(), "y", 0);
        setIntField(term36907, term36907.getClass(), "sp", 0);
        setIntField(term36907, term36907.getClass(), "pc", 0);
        setIntField(term36907, term36907.getClass(), "ir", 0);
        setIntField(term36907, term36907.getClass(), "nextIr", 0);
        setField(term36907, term36907.getClass(), "args", null);
        setField(term36907, term36907.getClass(), "nextArgs", null);
        setIntField(term36907, term36907.getClass(), "instSize", 0);
        setBooleanField(term36907, term36907.getClass(), "opTrap", false);
        setBooleanField(term36907, term36907.getClass(), "irqAsserted", false);
        setBooleanField(term36907, term36907.getClass(), "nmiAsserted", false);
        setIntField(term36907, term36907.getClass(), "lastPc", 0);
        setBooleanField(term36907, term36907.getClass(), "carryFlag", false);
        setBooleanField(term36907, term36907.getClass(), "negativeFlag", false);
        setBooleanField(term36907, term36907.getClass(), "zeroFlag", false);
        setBooleanField(term36907, term36907.getClass(), "irqDisableFlag", false);
        setBooleanField(term36907, term36907.getClass(), "decimalModeFlag", false);
        setBooleanField(term36907, term36907.getClass(), "breakFlag", false);
        setBooleanField(term36907, term36907.getClass(), "overflowFlag", false);
        setLongField(term36907, term36907.getClass(), "stepCounter", 0L);
        setField(term36902, term36902.getClass(), "state", term36907);
        setLongField(term36902, term36902.getClass(), "opBeginTime", -6100012593724108983L);
        setField(term36899, term36899.getClass(), "cpu", term36902);
        setField(term36899, term36899.getClass(), "deviceMap", term36929);
        setField(term36899, term36899.getClass(), "deviceAddressArray", term36934);
        setField(term36884, term36884.getClass(), "bus", term36899);
        setIntField(term36935, term36935.getClass(), "a", 0);
        setIntField(term36935, term36935.getClass(), "x", 0);
        setIntField(term36935, term36935.getClass(), "y", 0);
        setIntField(term36935, term36935.getClass(), "sp", 0);
        setIntField(term36935, term36935.getClass(), "pc", 0);
        setIntField(term36935, term36935.getClass(), "ir", 0);
        setIntField(term36935, term36935.getClass(), "nextIr", 0);
        setField(term36935, term36935.getClass(), "args", term36943);
        setField(term36935, term36935.getClass(), "nextArgs", term36946);
        setIntField(term36935, term36935.getClass(), "instSize", 0);
        setBooleanField(term36935, term36935.getClass(), "opTrap", false);
        setBooleanField(term36935, term36935.getClass(), "irqAsserted", false);
        setBooleanField(term36935, term36935.getClass(), "nmiAsserted", false);
        setIntField(term36935, term36935.getClass(), "lastPc", 0);
        setBooleanField(term36935, term36935.getClass(), "carryFlag", false);
        setBooleanField(term36935, term36935.getClass(), "negativeFlag", false);
        setBooleanField(term36935, term36935.getClass(), "zeroFlag", false);
        setBooleanField(term36935, term36935.getClass(), "irqDisableFlag", false);
        setBooleanField(term36935, term36935.getClass(), "decimalModeFlag", false);
        setBooleanField(term36935, term36935.getClass(), "breakFlag", false);
        setBooleanField(term36935, term36935.getClass(), "overflowFlag", false);
        setLongField(term36935, term36935.getClass(), "stepCounter", 0L);
        setField(term36884, term36884.getClass(), "state", term36935);
        setLongField(term36884, term36884.getClass(), "opBeginTime", 5465527210299101732L);
        setField(term36881, term36881.getClass(), "cpu", term36884);
        setField(term36881, term36881.getClass(), "deviceMap", term36963);
        setField(term36881, term36881.getClass(), "deviceAddressArray", term36968);
        term36969 = new Integer(-378436487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Bus");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.loomcom.symon.devices.Device");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term36969;
        callMethod(klass, "addDevice", argTypes, term36881, args);
    }

};


