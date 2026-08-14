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

public class Cpu_stackPeek_199191603279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202689;

    public Cpu_stackPeek_199191603279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term202784 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term202783 = ((Class) term202784).getDeclaredField((String) "NMOS_6502");
        ((Field) term202783).setAccessible(true);
        Object enum259 = ((Field) term202783).get((Object) null);
        HashMap term202715 = new HashMap();
        HashMap term202749 = new HashMap();
        term202689 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term202704 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term202707 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term202709 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term202712 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term202720 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term202721 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term202729 = (int[]) newIntArray(2);
        int[] term202732 = (int[]) newIntArray(2);
        Object[] term202754 = (Object[]) newArray("com.loomcom.symon.devices.Device", 8);
        Object term202755 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term202763 = (int[]) newIntArray(2);
        int[] term202766 = (int[]) newIntArray(2);
        setLongField(term202689, term202689.getClass(), "clockPeriodInNs", 1000L);
        setField(term202689, term202689.getClass(), "behavior", enum259);
        setIntField(term202704, term202704.getClass(), "startAddress", -904648920);
        setIntField(term202704, term202704.getClass(), "endAddress", -457236509);
        setLongField(term202707, term202707.getClass(), "clockPeriodInNs", 1000L);
        setField(term202707, term202707.getClass(), "behavior", enum259);
        setIntField(term202709, term202709.getClass(), "startAddress", 1719352674);
        setIntField(term202709, term202709.getClass(), "endAddress", 1551152450);
        setLongField(term202712, term202712.getClass(), "clockPeriodInNs", 1000L);
        setField(term202712, term202712.getClass(), "behavior", enum259);
        setField(term202712, term202712.getClass(), "bus", null);
        setField(term202712, term202712.getClass(), "state", null);
        setLongField(term202712, term202712.getClass(), "opBeginTime", 7437006125284633666L);
        setField(term202709, term202709.getClass(), "cpu", term202712);
        setField(term202709, term202709.getClass(), "deviceMap", term202715);
        setField(term202709, term202709.getClass(), "deviceAddressArray", term202720);
        setField(term202707, term202707.getClass(), "bus", term202709);
        setIntField(term202721, term202721.getClass(), "a", 0);
        setIntField(term202721, term202721.getClass(), "x", 0);
        setIntField(term202721, term202721.getClass(), "y", 0);
        setIntField(term202721, term202721.getClass(), "sp", 0);
        setIntField(term202721, term202721.getClass(), "pc", 0);
        setIntField(term202721, term202721.getClass(), "ir", 0);
        setIntField(term202721, term202721.getClass(), "nextIr", 0);
        setField(term202721, term202721.getClass(), "args", term202729);
        setField(term202721, term202721.getClass(), "nextArgs", term202732);
        setIntField(term202721, term202721.getClass(), "instSize", 0);
        setBooleanField(term202721, term202721.getClass(), "opTrap", false);
        setBooleanField(term202721, term202721.getClass(), "irqAsserted", false);
        setBooleanField(term202721, term202721.getClass(), "nmiAsserted", false);
        setIntField(term202721, term202721.getClass(), "lastPc", 0);
        setBooleanField(term202721, term202721.getClass(), "carryFlag", false);
        setBooleanField(term202721, term202721.getClass(), "negativeFlag", false);
        setBooleanField(term202721, term202721.getClass(), "zeroFlag", false);
        setBooleanField(term202721, term202721.getClass(), "irqDisableFlag", false);
        setBooleanField(term202721, term202721.getClass(), "decimalModeFlag", false);
        setBooleanField(term202721, term202721.getClass(), "breakFlag", false);
        setBooleanField(term202721, term202721.getClass(), "overflowFlag", false);
        setLongField(term202721, term202721.getClass(), "stepCounter", 0L);
        setField(term202707, term202707.getClass(), "state", term202721);
        setLongField(term202707, term202707.getClass(), "opBeginTime", 7426144489061842120L);
        setField(term202704, term202704.getClass(), "cpu", term202707);
        setField(term202704, term202704.getClass(), "deviceMap", term202749);
        setField(term202704, term202704.getClass(), "deviceAddressArray", term202754);
        setField(term202689, term202689.getClass(), "bus", term202704);
        setIntField(term202755, term202755.getClass(), "a", 0);
        setIntField(term202755, term202755.getClass(), "x", 0);
        setIntField(term202755, term202755.getClass(), "y", 0);
        setIntField(term202755, term202755.getClass(), "sp", 0);
        setIntField(term202755, term202755.getClass(), "pc", 0);
        setIntField(term202755, term202755.getClass(), "ir", 0);
        setIntField(term202755, term202755.getClass(), "nextIr", 0);
        setField(term202755, term202755.getClass(), "args", term202763);
        setField(term202755, term202755.getClass(), "nextArgs", term202766);
        setIntField(term202755, term202755.getClass(), "instSize", 0);
        setBooleanField(term202755, term202755.getClass(), "opTrap", false);
        setBooleanField(term202755, term202755.getClass(), "irqAsserted", false);
        setBooleanField(term202755, term202755.getClass(), "nmiAsserted", false);
        setIntField(term202755, term202755.getClass(), "lastPc", 0);
        setBooleanField(term202755, term202755.getClass(), "carryFlag", false);
        setBooleanField(term202755, term202755.getClass(), "negativeFlag", false);
        setBooleanField(term202755, term202755.getClass(), "zeroFlag", false);
        setBooleanField(term202755, term202755.getClass(), "irqDisableFlag", false);
        setBooleanField(term202755, term202755.getClass(), "decimalModeFlag", false);
        setBooleanField(term202755, term202755.getClass(), "breakFlag", false);
        setBooleanField(term202755, term202755.getClass(), "overflowFlag", false);
        setLongField(term202755, term202755.getClass(), "stepCounter", 0L);
        setField(term202689, term202689.getClass(), "state", term202755);
        setLongField(term202689, term202689.getClass(), "opBeginTime", -7501037219137334101L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "stackPeek", argTypes, term202689, args);
    }

};


