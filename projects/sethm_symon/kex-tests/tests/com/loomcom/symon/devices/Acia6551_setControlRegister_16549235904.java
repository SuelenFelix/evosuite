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

public class Acia6551_setControlRegister_16549235904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22335;
     Object term22442;

    public Acia6551_setControlRegister_16549235904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22455 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term22454 = ((Class) term22455).getDeclaredField((String) "CMOS_6502");
        ((Field) term22454).setAccessible(true);
        Object enum61 = ((Field) term22454).get((Object) null);
        HashMap term22393 = new HashMap();
        HashMap term22427 = new HashMap();
        HashMap term22434 = new HashMap();
        Set<Object> term22722 =  ((Map) term22434).keySet();
        HashSet term22433 = new HashSet((Collection<? extends Object>) term22722);
        term22335 = newInstance(Class.forName("com.loomcom.symon.devices.Acia6551"));
        Object term22364 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term22379 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term22382 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term22387 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term22390 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term22398 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term22399 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term22407 = (int[]) newIntArray(2);
        int[] term22410 = (int[]) newIntArray(2);
        Object[] term22432 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        setIntField(term22335, term22335.getClass(), "commandRegister", 399302934);
        setIntField(term22335, term22335.getClass(), "controlRegister", -1823255084);
        setField(term22335, term22335.getClass(), "name", "VgZnGoIFwQ");
        setIntField(term22335, term22335.getClass(), "baseAddress", 793345010);
        setBooleanField(term22335, term22335.getClass(), "receiveIrqEnabled", true);
        setBooleanField(term22335, term22335.getClass(), "transmitIrqEnabled", true);
        setBooleanField(term22335, term22335.getClass(), "overrun", false);
        setBooleanField(term22335, term22335.getClass(), "interrupt", false);
        setLongField(term22335, term22335.getClass(), "lastTxWrite", -1820639665251914495L);
        setLongField(term22335, term22335.getClass(), "lastRxRead", 3238645206498300107L);
        setIntField(term22335, term22335.getClass(), "baudRate", -2092117838);
        setLongField(term22335, term22335.getClass(), "baudRateDelay", -1592696983130738594L);
        setIntField(term22335, term22335.getClass(), "rxChar", 1524590776);
        setIntField(term22335, term22335.getClass(), "txChar", 1523896653);
        setBooleanField(term22335, term22335.getClass(), "rxFull", false);
        setBooleanField(term22335, term22335.getClass(), "txEmpty", true);
        setIntField(term22335, term22335.getClass(), "size", -1731921726);
        setIntField(term22364, term22364.getClass(), "startAddress", 919994471);
        setIntField(term22364, term22364.getClass(), "endAddress", 183531701);
        setField(term22335, term22335.getClass(), "memoryRange", term22364);
        setIntField(term22379, term22379.getClass(), "startAddress", -974923743);
        setIntField(term22379, term22379.getClass(), "endAddress", 1876738932);
        setLongField(term22382, term22382.getClass(), "clockPeriodInNs", 1000L);
        setField(term22382, term22382.getClass(), "behavior", enum61);
        setIntField(term22387, term22387.getClass(), "startAddress", -1870339027);
        setIntField(term22387, term22387.getClass(), "endAddress", -1549603566);
        setLongField(term22390, term22390.getClass(), "clockPeriodInNs", 1000L);
        setField(term22390, term22390.getClass(), "behavior", enum61);
        setField(term22390, term22390.getClass(), "bus", null);
        setField(term22390, term22390.getClass(), "state", null);
        setLongField(term22390, term22390.getClass(), "opBeginTime", 394960377236392159L);
        setField(term22387, term22387.getClass(), "cpu", term22390);
        setField(term22387, term22387.getClass(), "deviceMap", term22393);
        setField(term22387, term22387.getClass(), "deviceAddressArray", term22398);
        setField(term22382, term22382.getClass(), "bus", term22387);
        setIntField(term22399, term22399.getClass(), "a", 0);
        setIntField(term22399, term22399.getClass(), "x", 0);
        setIntField(term22399, term22399.getClass(), "y", 0);
        setIntField(term22399, term22399.getClass(), "sp", 0);
        setIntField(term22399, term22399.getClass(), "pc", 0);
        setIntField(term22399, term22399.getClass(), "ir", 0);
        setIntField(term22399, term22399.getClass(), "nextIr", 0);
        setField(term22399, term22399.getClass(), "args", term22407);
        setField(term22399, term22399.getClass(), "nextArgs", term22410);
        setIntField(term22399, term22399.getClass(), "instSize", 0);
        setBooleanField(term22399, term22399.getClass(), "opTrap", false);
        setBooleanField(term22399, term22399.getClass(), "irqAsserted", false);
        setBooleanField(term22399, term22399.getClass(), "nmiAsserted", false);
        setIntField(term22399, term22399.getClass(), "lastPc", 0);
        setBooleanField(term22399, term22399.getClass(), "carryFlag", false);
        setBooleanField(term22399, term22399.getClass(), "negativeFlag", false);
        setBooleanField(term22399, term22399.getClass(), "zeroFlag", false);
        setBooleanField(term22399, term22399.getClass(), "irqDisableFlag", false);
        setBooleanField(term22399, term22399.getClass(), "decimalModeFlag", false);
        setBooleanField(term22399, term22399.getClass(), "breakFlag", false);
        setBooleanField(term22399, term22399.getClass(), "overflowFlag", false);
        setLongField(term22399, term22399.getClass(), "stepCounter", 0L);
        setField(term22382, term22382.getClass(), "state", term22399);
        setLongField(term22382, term22382.getClass(), "opBeginTime", -2955854401507097864L);
        setField(term22379, term22379.getClass(), "cpu", term22382);
        setField(term22379, term22379.getClass(), "deviceMap", term22427);
        setField(term22379, term22379.getClass(), "deviceAddressArray", term22432);
        setField(term22335, term22335.getClass(), "bus", term22379);
        setField(term22335, term22335.getClass(), "deviceChangeListeners", term22433);
        term22442 = new Integer(-1270258033);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Acia6551");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term22442;
        callMethod(klass, "setControlRegister", argTypes, term22335, args);
    }

};


