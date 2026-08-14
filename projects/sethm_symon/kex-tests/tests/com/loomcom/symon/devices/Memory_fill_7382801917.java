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

public class Memory_fill_7382801917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25134;
     Object term25214;

    public Memory_fill_7382801917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25228 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term25227 = ((Class) term25228).getDeclaredField((String) "NMOS_WITH_ROR_BUG");
        ((Field) term25227).setAccessible(true);
        Object enum69 = ((Field) term25227).get((Object) null);
        HashMap term25168 = new HashMap();
        HashMap term25202 = new HashMap();
        HashMap term25209 = new HashMap();
        Set<Object> term25519 =  ((Map) term25209).keySet();
        HashSet term25208 = new HashSet((Collection<? extends Object>) term25519);
        term25134 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term25136 = (int[]) newIntArray(1);
        Object term25139 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term25154 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term25157 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term25162 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term25165 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term25173 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term25174 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term25182 = (int[]) newIntArray(2);
        int[] term25185 = (int[]) newIntArray(2);
        Object[] term25207 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        setBooleanField(term25134, term25134.getClass(), "readOnly", true);
        setIntElement(term25136, 0, -269528550);
        setField(term25134, term25134.getClass(), "mem", term25136);
        setIntField(term25134, term25134.getClass(), "size", 1909966089);
        setIntField(term25139, term25139.getClass(), "startAddress", 1827255916);
        setIntField(term25139, term25139.getClass(), "endAddress", 2039815750);
        setField(term25134, term25134.getClass(), "memoryRange", term25139);
        setField(term25134, term25134.getClass(), "name", "xOcJIiQQDu");
        setIntField(term25154, term25154.getClass(), "startAddress", 2079590265);
        setIntField(term25154, term25154.getClass(), "endAddress", -435079567);
        setLongField(term25157, term25157.getClass(), "clockPeriodInNs", 1000L);
        setField(term25157, term25157.getClass(), "behavior", enum69);
        setIntField(term25162, term25162.getClass(), "startAddress", -1017617829);
        setIntField(term25162, term25162.getClass(), "endAddress", 270928865);
        setLongField(term25165, term25165.getClass(), "clockPeriodInNs", 1000L);
        setField(term25165, term25165.getClass(), "behavior", enum69);
        setField(term25165, term25165.getClass(), "bus", null);
        setField(term25165, term25165.getClass(), "state", null);
        setLongField(term25165, term25165.getClass(), "opBeginTime", 5184635470881147510L);
        setField(term25162, term25162.getClass(), "cpu", term25165);
        setField(term25162, term25162.getClass(), "deviceMap", term25168);
        setField(term25162, term25162.getClass(), "deviceAddressArray", term25173);
        setField(term25157, term25157.getClass(), "bus", term25162);
        setIntField(term25174, term25174.getClass(), "a", 0);
        setIntField(term25174, term25174.getClass(), "x", 0);
        setIntField(term25174, term25174.getClass(), "y", 0);
        setIntField(term25174, term25174.getClass(), "sp", 0);
        setIntField(term25174, term25174.getClass(), "pc", 0);
        setIntField(term25174, term25174.getClass(), "ir", 0);
        setIntField(term25174, term25174.getClass(), "nextIr", 0);
        setField(term25174, term25174.getClass(), "args", term25182);
        setField(term25174, term25174.getClass(), "nextArgs", term25185);
        setIntField(term25174, term25174.getClass(), "instSize", 0);
        setBooleanField(term25174, term25174.getClass(), "opTrap", false);
        setBooleanField(term25174, term25174.getClass(), "irqAsserted", false);
        setBooleanField(term25174, term25174.getClass(), "nmiAsserted", false);
        setIntField(term25174, term25174.getClass(), "lastPc", 0);
        setBooleanField(term25174, term25174.getClass(), "carryFlag", false);
        setBooleanField(term25174, term25174.getClass(), "negativeFlag", false);
        setBooleanField(term25174, term25174.getClass(), "zeroFlag", false);
        setBooleanField(term25174, term25174.getClass(), "irqDisableFlag", false);
        setBooleanField(term25174, term25174.getClass(), "decimalModeFlag", false);
        setBooleanField(term25174, term25174.getClass(), "breakFlag", false);
        setBooleanField(term25174, term25174.getClass(), "overflowFlag", false);
        setLongField(term25174, term25174.getClass(), "stepCounter", 0L);
        setField(term25157, term25157.getClass(), "state", term25174);
        setLongField(term25157, term25157.getClass(), "opBeginTime", 918397384129253729L);
        setField(term25154, term25154.getClass(), "cpu", term25157);
        setField(term25154, term25154.getClass(), "deviceMap", term25202);
        setField(term25154, term25154.getClass(), "deviceAddressArray", term25207);
        setField(term25134, term25134.getClass(), "bus", term25154);
        setField(term25134, term25134.getClass(), "deviceChangeListeners", term25208);
        term25214 = new Integer(-1362132929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Memory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25214;
        callMethod(klass, "fill", argTypes, term25134, args);
    }

};


