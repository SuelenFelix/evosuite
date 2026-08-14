package com.loomcom.symon.ui;

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
import static com.loomcom.symon.ui.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.lang.Integer;

public class MemoryWindow_MemoryTableModel_setPageNumber_5486235951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59918;
     Object term59976;

    public MemoryWindow_MemoryTableModel_setPageNumber_5486235951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59979 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term59978 = ((Class) term59979).getDeclaredField((String) "CMOS_65816");
        ((Field) term59978).setAccessible(true);
        Object enum11 = ((Field) term59978).get((Object) null);
        HashMap term59933 = new HashMap();
        HashMap term59967 = new HashMap();
        term59918 = newInstance(Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel"));
        Object term59919 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term59922 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term59927 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term59930 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term59938 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term59939 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term59947 = (int[]) newIntArray(2);
        int[] term59950 = (int[]) newIntArray(2);
        Object[] term59972 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term59974 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term59975 = (Object[]) newArray("java.lang.Object", 0);
        setIntField(term59919, term59919.getClass(), "startAddress", 1985432430);
        setIntField(term59919, term59919.getClass(), "endAddress", -1769933499);
        setLongField(term59922, term59922.getClass(), "clockPeriodInNs", 1000L);
        setField(term59922, term59922.getClass(), "behavior", enum11);
        setIntField(term59927, term59927.getClass(), "startAddress", -1510932472);
        setIntField(term59927, term59927.getClass(), "endAddress", 1970654816);
        setLongField(term59930, term59930.getClass(), "clockPeriodInNs", 1000L);
        setField(term59930, term59930.getClass(), "behavior", enum11);
        setField(term59930, term59930.getClass(), "bus", null);
        setField(term59930, term59930.getClass(), "state", null);
        setLongField(term59930, term59930.getClass(), "opBeginTime", -5963439350418910964L);
        setField(term59927, term59927.getClass(), "cpu", term59930);
        setField(term59927, term59927.getClass(), "deviceMap", term59933);
        setField(term59927, term59927.getClass(), "deviceAddressArray", term59938);
        setField(term59922, term59922.getClass(), "bus", term59927);
        setIntField(term59939, term59939.getClass(), "a", 0);
        setIntField(term59939, term59939.getClass(), "x", 0);
        setIntField(term59939, term59939.getClass(), "y", 0);
        setIntField(term59939, term59939.getClass(), "sp", 0);
        setIntField(term59939, term59939.getClass(), "pc", 0);
        setIntField(term59939, term59939.getClass(), "ir", 0);
        setIntField(term59939, term59939.getClass(), "nextIr", 0);
        setField(term59939, term59939.getClass(), "args", term59947);
        setField(term59939, term59939.getClass(), "nextArgs", term59950);
        setIntField(term59939, term59939.getClass(), "instSize", 0);
        setBooleanField(term59939, term59939.getClass(), "opTrap", false);
        setBooleanField(term59939, term59939.getClass(), "irqAsserted", false);
        setBooleanField(term59939, term59939.getClass(), "nmiAsserted", false);
        setIntField(term59939, term59939.getClass(), "lastPc", 0);
        setBooleanField(term59939, term59939.getClass(), "carryFlag", false);
        setBooleanField(term59939, term59939.getClass(), "negativeFlag", false);
        setBooleanField(term59939, term59939.getClass(), "zeroFlag", false);
        setBooleanField(term59939, term59939.getClass(), "irqDisableFlag", false);
        setBooleanField(term59939, term59939.getClass(), "decimalModeFlag", false);
        setBooleanField(term59939, term59939.getClass(), "breakFlag", false);
        setBooleanField(term59939, term59939.getClass(), "overflowFlag", false);
        setLongField(term59939, term59939.getClass(), "stepCounter", 0L);
        setField(term59922, term59922.getClass(), "state", term59939);
        setLongField(term59922, term59922.getClass(), "opBeginTime", 9013624480170062917L);
        setField(term59919, term59919.getClass(), "cpu", term59922);
        setField(term59919, term59919.getClass(), "deviceMap", term59967);
        setField(term59919, term59919.getClass(), "deviceAddressArray", term59972);
        setField(term59918, term59918.getClass(), "bus", term59919);
        setIntField(term59918, term59918.getClass(), "pageNumber", -1130401612);
        setField(term59974, term59974.getClass(), "listenerList", term59975);
        setField(term59918, term59918.getClass(), "listenerList", term59974);
        term59976 = new Integer(-316771104);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.ui.MemoryWindow$MemoryTableModel");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term59976;
        callMethod(klass, "setPageNumber", argTypes, term59918, args);
    }

};


