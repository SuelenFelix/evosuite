package com.loomcom.symon.devices;

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
import static com.loomcom.symon.devices.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Integer;

public class Acia6551_setCommandRegister_14458249483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21944;
     Object term22051;

    public Acia6551_setCommandRegister_14458249483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22064 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term22063 = ((Class) term22064).getDeclaredField((String) "CMOS_65816");
        ((Field) term22063).setAccessible(true);
        Object enum60 = ((Field) term22063).get((Object) null);
        HashMap term22002 = new HashMap();
        HashMap term22036 = new HashMap();
        HashMap term22043 = new HashMap();
        Set<Object> term22334 =  ((Map) term22043).keySet();
        HashSet term22042 = new HashSet((Collection<? extends Object>) term22334);
        term21944 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6551"));
        Object term21973 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term21988 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term21991 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term21996 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term21999 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term22007 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term22008 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term22016 = (int[]) newIntArray(2);
        int[] term22019 = (int[]) newIntArray(2);
        Object[] term22041 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        setIntField(term21944, term21944.getClass(), "commandRegister", 1139078354);
        setIntField(term21944, term21944.getClass(), "controlRegister", -691164974);
        setField(term21944, term21944.getClass(), "name", "wGmYcqUkgE");
        setIntField(term21944, term21944.getClass(), "baseAddress", -761675396);
        setBooleanField(term21944, term21944.getClass(), "receiveIrqEnabled", false);
        setBooleanField(term21944, term21944.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term21944, term21944.getClass(), "overrun", false);
        setBooleanField(term21944, term21944.getClass(), "interrupt", true);
        setLongField(term21944, term21944.getClass(), "lastTxWrite", 860079646007397083L);
        setLongField(term21944, term21944.getClass(), "lastRxRead", 3230472384687362867L);
        setIntField(term21944, term21944.getClass(), "baudRate", -1954860951);
        setLongField(term21944, term21944.getClass(), "baudRateDelay", -1145146470850585022L);
        setIntField(term21944, term21944.getClass(), "rxChar", -2078879114);
        setIntField(term21944, term21944.getClass(), "txChar", -1186882318);
        setBooleanField(term21944, term21944.getClass(), "rxFull", true);
        setBooleanField(term21944, term21944.getClass(), "txEmpty", false);
        setIntField(term21944, term21944.getClass(), "size", 1077647088);
        setIntField(term21973, term21973.getClass(), "startAddress", -705176810);
        setIntField(term21973, term21973.getClass(), "endAddress", -1584779593);
        setField(term21944, term21944.getClass(), "memoryRange", term21973);
        setIntField(term21988, term21988.getClass(), "startAddress", 303007547);
        setIntField(term21988, term21988.getClass(), "endAddress", 1498738343);
        setLongField(term21991, term21991.getClass(), "clockPeriodInNs", 1000L);
        setField(term21991, term21991.getClass(), "behavior", enum60);
        setIntField(term21996, term21996.getClass(), "startAddress", -1635571857);
        setIntField(term21996, term21996.getClass(), "endAddress", 1407309162);
        setLongField(term21999, term21999.getClass(), "clockPeriodInNs", 1000L);
        setField(term21999, term21999.getClass(), "behavior", enum60);
        setField(term21999, term21999.getClass(), "bus", null);
        setField(term21999, term21999.getClass(), "state", null);
        setLongField(term21999, term21999.getClass(), "opBeginTime", -419800263764810394L);
        setField(term21996, term21996.getClass(), "cpu", term21999);
        setField(term21996, term21996.getClass(), "deviceMap", term22002);
        setField(term21996, term21996.getClass(), "deviceAddressArray", term22007);
        setField(term21991, term21991.getClass(), "bus", term21996);
        setIntField(term22008, term22008.getClass(), "a", 0);
        setIntField(term22008, term22008.getClass(), "x", 0);
        setIntField(term22008, term22008.getClass(), "y", 0);
        setIntField(term22008, term22008.getClass(), "sp", 0);
        setIntField(term22008, term22008.getClass(), "pc", 0);
        setIntField(term22008, term22008.getClass(), "ir", 0);
        setIntField(term22008, term22008.getClass(), "nextIr", 0);
        setField(term22008, term22008.getClass(), "args", term22016);
        setField(term22008, term22008.getClass(), "nextArgs", term22019);
        setIntField(term22008, term22008.getClass(), "instSize", 0);
        setBooleanField(term22008, term22008.getClass(), "opTrap", false);
        setBooleanField(term22008, term22008.getClass(), "irqAsserted", false);
        setBooleanField(term22008, term22008.getClass(), "nmiAsserted", false);
        setIntField(term22008, term22008.getClass(), "lastPc", 0);
        setBooleanField(term22008, term22008.getClass(), "carryFlag", false);
        setBooleanField(term22008, term22008.getClass(), "negativeFlag", false);
        setBooleanField(term22008, term22008.getClass(), "zeroFlag", false);
        setBooleanField(term22008, term22008.getClass(), "irqDisableFlag", false);
        setBooleanField(term22008, term22008.getClass(), "decimalModeFlag", false);
        setBooleanField(term22008, term22008.getClass(), "breakFlag", false);
        setBooleanField(term22008, term22008.getClass(), "overflowFlag", false);
        setLongField(term22008, term22008.getClass(), "stepCounter", 0L);
        setField(term21991, term21991.getClass(), "state", term22008);
        setLongField(term21991, term21991.getClass(), "opBeginTime", 5904678961906211249L);
        setField(term21988, term21988.getClass(), "cpu", term21991);
        setField(term21988, term21988.getClass(), "deviceMap", term22036);
        setField(term21988, term21988.getClass(), "deviceAddressArray", term22041);
        setField(term21944, term21944.getClass(), "bus", term21988);
        setField(term21944, term21944.getClass(), "deviceChangeListeners", term22042);
        term22051 = new Integer(1064185088);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6551");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22051;
        callMethod(klass, "setCommandRegister", argTypes, term21944, args);
    }

};


