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

public class Acia6551_write_9808976052 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21551;
     Object term21658;
     Object term21660;

    public Acia6551_write_9808976052() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21673 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term21672 = ((Class) term21673).getDeclaredField((String) "CMOS_65816");
        ((Field) term21672).setAccessible(true);
        Object enum59 = ((Field) term21672).get((Object) null);
        HashMap term21609 = new HashMap();
        HashMap term21643 = new HashMap();
        HashMap term21650 = new HashMap();
        Set<Object> term21943 =  ((Map) term21650).keySet();
        HashSet term21649 = new HashSet((Collection<? extends Object>) term21943);
        term21551 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6551"));
        Object term21580 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term21595 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term21598 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term21603 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term21606 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term21614 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term21615 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term21623 = (int[]) newIntArray(2);
        int[] term21626 = (int[]) newIntArray(2);
        Object[] term21648 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        setIntField(term21551, term21551.getClass(), "commandRegister", 2140388634);
        setIntField(term21551, term21551.getClass(), "controlRegister", 21095258);
        setField(term21551, term21551.getClass(), "name", "vQVyKLdtaz");
        setIntField(term21551, term21551.getClass(), "baseAddress", -1793997256);
        setBooleanField(term21551, term21551.getClass(), "receiveIrqEnabled", true);
        setBooleanField(term21551, term21551.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term21551, term21551.getClass(), "overrun", true);
        setBooleanField(term21551, term21551.getClass(), "interrupt", false);
        setLongField(term21551, term21551.getClass(), "lastTxWrite", 3288941170644426558L);
        setLongField(term21551, term21551.getClass(), "lastRxRead", -8338004844694486146L);
        setIntField(term21551, term21551.getClass(), "baudRate", -1271598018);
        setLongField(term21551, term21551.getClass(), "baudRateDelay", 6426732259596412988L);
        setIntField(term21551, term21551.getClass(), "rxChar", 157967613);
        setIntField(term21551, term21551.getClass(), "txChar", 811839399);
        setBooleanField(term21551, term21551.getClass(), "rxFull", false);
        setBooleanField(term21551, term21551.getClass(), "txEmpty", true);
        setIntField(term21551, term21551.getClass(), "size", 593962063);
        setIntField(term21580, term21580.getClass(), "startAddress", -1485826786);
        setIntField(term21580, term21580.getClass(), "endAddress", -1549952664);
        setField(term21551, term21551.getClass(), "memoryRange", term21580);
        setIntField(term21595, term21595.getClass(), "startAddress", 148394188);
        setIntField(term21595, term21595.getClass(), "endAddress", 504525721);
        setLongField(term21598, term21598.getClass(), "clockPeriodInNs", 1000L);
        setField(term21598, term21598.getClass(), "behavior", enum59);
        setIntField(term21603, term21603.getClass(), "startAddress", 1835568392);
        setIntField(term21603, term21603.getClass(), "endAddress", 457470807);
        setLongField(term21606, term21606.getClass(), "clockPeriodInNs", 1000L);
        setField(term21606, term21606.getClass(), "behavior", enum59);
        setField(term21606, term21606.getClass(), "bus", null);
        setField(term21606, term21606.getClass(), "state", null);
        setLongField(term21606, term21606.getClass(), "opBeginTime", 2145420811068634601L);
        setField(term21603, term21603.getClass(), "cpu", term21606);
        setField(term21603, term21603.getClass(), "deviceMap", term21609);
        setField(term21603, term21603.getClass(), "deviceAddressArray", term21614);
        setField(term21598, term21598.getClass(), "bus", term21603);
        setIntField(term21615, term21615.getClass(), "a", 0);
        setIntField(term21615, term21615.getClass(), "x", 0);
        setIntField(term21615, term21615.getClass(), "y", 0);
        setIntField(term21615, term21615.getClass(), "sp", 0);
        setIntField(term21615, term21615.getClass(), "pc", 0);
        setIntField(term21615, term21615.getClass(), "ir", 0);
        setIntField(term21615, term21615.getClass(), "nextIr", 0);
        setField(term21615, term21615.getClass(), "args", term21623);
        setField(term21615, term21615.getClass(), "nextArgs", term21626);
        setIntField(term21615, term21615.getClass(), "instSize", 0);
        setBooleanField(term21615, term21615.getClass(), "opTrap", false);
        setBooleanField(term21615, term21615.getClass(), "irqAsserted", false);
        setBooleanField(term21615, term21615.getClass(), "nmiAsserted", false);
        setIntField(term21615, term21615.getClass(), "lastPc", 0);
        setBooleanField(term21615, term21615.getClass(), "carryFlag", false);
        setBooleanField(term21615, term21615.getClass(), "negativeFlag", false);
        setBooleanField(term21615, term21615.getClass(), "zeroFlag", false);
        setBooleanField(term21615, term21615.getClass(), "irqDisableFlag", false);
        setBooleanField(term21615, term21615.getClass(), "decimalModeFlag", false);
        setBooleanField(term21615, term21615.getClass(), "breakFlag", false);
        setBooleanField(term21615, term21615.getClass(), "overflowFlag", false);
        setLongField(term21615, term21615.getClass(), "stepCounter", 0L);
        setField(term21598, term21598.getClass(), "state", term21615);
        setLongField(term21598, term21598.getClass(), "opBeginTime", 2191130532479601175L);
        setField(term21595, term21595.getClass(), "cpu", term21598);
        setField(term21595, term21595.getClass(), "deviceMap", term21643);
        setField(term21595, term21595.getClass(), "deviceAddressArray", term21648);
        setField(term21551, term21551.getClass(), "bus", term21595);
        setField(term21551, term21551.getClass(), "deviceChangeListeners", term21649);
        term21658 = new Integer(153009426);
        term21660 = new Integer(185751892);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6551");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term21658;
        args[1] = term21660;
        callMethod(klass, "write", argTypes, term21551, args);
    }

};


