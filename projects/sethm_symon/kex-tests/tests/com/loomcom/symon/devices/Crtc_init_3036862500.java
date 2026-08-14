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
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class Crtc_init_3036862500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term3;

    public Crtc_init_3036862500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = new Integer(568599855);
        Class<? extends Object> term167 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term166 = ((Class) term167).getDeclaredField((String) "NMOS_6502");
        ((Field) term166).setAccessible(true);
        Object enum0 = ((Field) term166).get((Object) null);
        HashMap term41 = new HashMap();
        HashMap term75 = new HashMap();
        HashMap term82 = new HashMap();
        Set<Object> term434 =  ((Map) term82).keySet();
        HashSet term81 = new HashSet((Collection<? extends Object>) term434);
        term3 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term5 = (int[]) newIntArray(5);
        Object term12 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term27 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term30 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term35 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term38 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term46 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term47 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term55 = (int[]) newIntArray(2);
        int[] term58 = (int[]) newIntArray(2);
        Object[] term80 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        setBooleanField(term3, term3.getClass(), "readOnly", false);
        setIntElement(term5, 0, 1162663216);
        setIntElement(term5, 1, 1484323161);
        setIntElement(term5, 2, 391863371);
        setIntElement(term5, 3, -1922583790);
        setIntElement(term5, 4, -616727354);
        setField(term3, term3.getClass(), "mem", term5);
        setIntField(term3, term3.getClass(), "size", -2038273078);
        setIntField(term12, term12.getClass(), "startAddress", 1227103734);
        setIntField(term12, term12.getClass(), "endAddress", -1339778481);
        setField(term3, term3.getClass(), "memoryRange", term12);
        setField(term3, term3.getClass(), "name", "PAEBtnZtTD");
        setIntField(term27, term27.getClass(), "startAddress", 1725571209);
        setIntField(term27, term27.getClass(), "endAddress", -522618178);
        setLongField(term30, term30.getClass(), "clockPeriodInNs", 1000L);
        setField(term30, term30.getClass(), "behavior", enum0);
        setIntField(term35, term35.getClass(), "startAddress", 1134449235);
        setIntField(term35, term35.getClass(), "endAddress", -883034806);
        setLongField(term38, term38.getClass(), "clockPeriodInNs", 1000L);
        setField(term38, term38.getClass(), "behavior", enum0);
        setField(term38, term38.getClass(), "bus", null);
        setField(term38, term38.getClass(), "state", null);
        setLongField(term38, term38.getClass(), "opBeginTime", -8257434502486459194L);
        setField(term35, term35.getClass(), "cpu", term38);
        setField(term35, term35.getClass(), "deviceMap", term41);
        setField(term35, term35.getClass(), "deviceAddressArray", term46);
        setField(term30, term30.getClass(), "bus", term35);
        setIntField(term47, term47.getClass(), "a", 0);
        setIntField(term47, term47.getClass(), "x", 0);
        setIntField(term47, term47.getClass(), "y", 0);
        setIntField(term47, term47.getClass(), "sp", 0);
        setIntField(term47, term47.getClass(), "pc", 0);
        setIntField(term47, term47.getClass(), "ir", 0);
        setIntField(term47, term47.getClass(), "nextIr", 0);
        setField(term47, term47.getClass(), "args", term55);
        setField(term47, term47.getClass(), "nextArgs", term58);
        setIntField(term47, term47.getClass(), "instSize", 0);
        setBooleanField(term47, term47.getClass(), "opTrap", false);
        setBooleanField(term47, term47.getClass(), "irqAsserted", false);
        setBooleanField(term47, term47.getClass(), "nmiAsserted", false);
        setIntField(term47, term47.getClass(), "lastPc", 0);
        setBooleanField(term47, term47.getClass(), "carryFlag", false);
        setBooleanField(term47, term47.getClass(), "negativeFlag", false);
        setBooleanField(term47, term47.getClass(), "zeroFlag", false);
        setBooleanField(term47, term47.getClass(), "irqDisableFlag", false);
        setBooleanField(term47, term47.getClass(), "decimalModeFlag", false);
        setBooleanField(term47, term47.getClass(), "breakFlag", false);
        setBooleanField(term47, term47.getClass(), "overflowFlag", false);
        setLongField(term47, term47.getClass(), "stepCounter", 0L);
        setField(term30, term30.getClass(), "state", term47);
        setLongField(term30, term30.getClass(), "opBeginTime", -8400487765614892086L);
        setField(term27, term27.getClass(), "cpu", term30);
        setField(term27, term27.getClass(), "deviceMap", term75);
        setField(term27, term27.getClass(), "deviceAddressArray", term80);
        setField(term3, term3.getClass(), "bus", term27);
        setField(term3, term3.getClass(), "deviceChangeListeners", term81);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.loomcom.symon.devices.Memory");
        Object[] args = new Object[2];
        args[0] = term1;
        args[1] = term3;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


