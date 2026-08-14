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
import java.lang.Boolean;

public class Acia6551_statusReg_15294464425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22723;
     Object term22830;

    public Acia6551_statusReg_15294464425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22843 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term22842 = ((Class) term22843).getDeclaredField((String) "CMOS_6502");
        ((Field) term22842).setAccessible(true);
        Object enum62 = ((Field) term22842).get((Object) null);
        HashMap term22781 = new HashMap();
        HashMap term22815 = new HashMap();
        HashMap term22822 = new HashMap();
        Set<Object> term23110 =  ((Map) term22822).keySet();
        HashSet term22821 = new HashSet((Collection<? extends Object>) term23110);
        term22723 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6551"));
        Object term22752 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term22767 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term22770 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term22775 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term22778 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term22786 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term22787 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term22795 = (int[]) newIntArray(2);
        int[] term22798 = (int[]) newIntArray(2);
        Object[] term22820 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        setIntField(term22723, term22723.getClass(), "commandRegister", -439999692);
        setIntField(term22723, term22723.getClass(), "controlRegister", 924095007);
        setField(term22723, term22723.getClass(), "name", "bWWfajKbEX");
        setIntField(term22723, term22723.getClass(), "baseAddress", 1302110708);
        setBooleanField(term22723, term22723.getClass(), "receiveIrqEnabled", false);
        setBooleanField(term22723, term22723.getClass(), "transmitIrqEnabled", false);
        setBooleanField(term22723, term22723.getClass(), "overrun", false);
        setBooleanField(term22723, term22723.getClass(), "interrupt", true);
        setLongField(term22723, term22723.getClass(), "lastTxWrite", 329213208496958131L);
        setLongField(term22723, term22723.getClass(), "lastRxRead", 8107921244631636572L);
        setIntField(term22723, term22723.getClass(), "baudRate", 594705497);
        setLongField(term22723, term22723.getClass(), "baudRateDelay", -7904053112604879960L);
        setIntField(term22723, term22723.getClass(), "rxChar", -600102466);
        setIntField(term22723, term22723.getClass(), "txChar", -899986714);
        setBooleanField(term22723, term22723.getClass(), "rxFull", false);
        setBooleanField(term22723, term22723.getClass(), "txEmpty", false);
        setIntField(term22723, term22723.getClass(), "size", 1307244466);
        setIntField(term22752, term22752.getClass(), "startAddress", -252262096);
        setIntField(term22752, term22752.getClass(), "endAddress", -37129068);
        setField(term22723, term22723.getClass(), "memoryRange", term22752);
        setIntField(term22767, term22767.getClass(), "startAddress", -861014847);
        setIntField(term22767, term22767.getClass(), "endAddress", 2132934139);
        setLongField(term22770, term22770.getClass(), "clockPeriodInNs", 1000L);
        setField(term22770, term22770.getClass(), "behavior", enum62);
        setIntField(term22775, term22775.getClass(), "startAddress", -1261824381);
        setIntField(term22775, term22775.getClass(), "endAddress", 1594426218);
        setLongField(term22778, term22778.getClass(), "clockPeriodInNs", 1000L);
        setField(term22778, term22778.getClass(), "behavior", enum62);
        setField(term22778, term22778.getClass(), "bus", null);
        setField(term22778, term22778.getClass(), "state", null);
        setLongField(term22778, term22778.getClass(), "opBeginTime", -8862087040734407227L);
        setField(term22775, term22775.getClass(), "cpu", term22778);
        setField(term22775, term22775.getClass(), "deviceMap", term22781);
        setField(term22775, term22775.getClass(), "deviceAddressArray", term22786);
        setField(term22770, term22770.getClass(), "bus", term22775);
        setIntField(term22787, term22787.getClass(), "a", 0);
        setIntField(term22787, term22787.getClass(), "x", 0);
        setIntField(term22787, term22787.getClass(), "y", 0);
        setIntField(term22787, term22787.getClass(), "sp", 0);
        setIntField(term22787, term22787.getClass(), "pc", 0);
        setIntField(term22787, term22787.getClass(), "ir", 0);
        setIntField(term22787, term22787.getClass(), "nextIr", 0);
        setField(term22787, term22787.getClass(), "args", term22795);
        setField(term22787, term22787.getClass(), "nextArgs", term22798);
        setIntField(term22787, term22787.getClass(), "instSize", 0);
        setBooleanField(term22787, term22787.getClass(), "opTrap", false);
        setBooleanField(term22787, term22787.getClass(), "irqAsserted", false);
        setBooleanField(term22787, term22787.getClass(), "nmiAsserted", false);
        setIntField(term22787, term22787.getClass(), "lastPc", 0);
        setBooleanField(term22787, term22787.getClass(), "carryFlag", false);
        setBooleanField(term22787, term22787.getClass(), "negativeFlag", false);
        setBooleanField(term22787, term22787.getClass(), "zeroFlag", false);
        setBooleanField(term22787, term22787.getClass(), "irqDisableFlag", false);
        setBooleanField(term22787, term22787.getClass(), "decimalModeFlag", false);
        setBooleanField(term22787, term22787.getClass(), "breakFlag", false);
        setBooleanField(term22787, term22787.getClass(), "overflowFlag", false);
        setLongField(term22787, term22787.getClass(), "stepCounter", 0L);
        setField(term22770, term22770.getClass(), "state", term22787);
        setLongField(term22770, term22770.getClass(), "opBeginTime", -6394943900800506753L);
        setField(term22767, term22767.getClass(), "cpu", term22770);
        setField(term22767, term22767.getClass(), "deviceMap", term22815);
        setField(term22767, term22767.getClass(), "deviceAddressArray", term22820);
        setField(term22723, term22723.getClass(), "bus", term22767);
        setField(term22723, term22723.getClass(), "deviceChangeListeners", term22821);
        term22830 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6551");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term22830;
        callMethod(klass, "statusReg", argTypes, term22723, args);
    }

};


