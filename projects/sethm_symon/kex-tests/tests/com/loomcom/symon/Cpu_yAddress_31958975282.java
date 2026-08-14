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
import java.lang.Integer;

public class Cpu_yAddress_31958975282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203791;
     Object term203885;
     Object term203887;

    public Cpu_yAddress_31958975282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term203890 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term203889 = ((Class) term203890).getDeclaredField((String) "NMOS_6502");
        ((Field) term203889).setAccessible(true);
        Object enum262 = ((Field) term203889).get((Object) null);
        HashMap term203817 = new HashMap();
        HashMap term203851 = new HashMap();
        term203791 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term203806 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term203809 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term203811 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term203814 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term203822 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term203823 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term203831 = (int[]) newIntArray(2);
        int[] term203834 = (int[]) newIntArray(2);
        Object[] term203856 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term203857 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term203865 = (int[]) newIntArray(2);
        int[] term203868 = (int[]) newIntArray(2);
        setLongField(term203791, term203791.getClass(), "clockPeriodInNs", 1000L);
        setField(term203791, term203791.getClass(), "behavior", enum262);
        setIntField(term203806, term203806.getClass(), "startAddress", 1159262757);
        setIntField(term203806, term203806.getClass(), "endAddress", 967155072);
        setLongField(term203809, term203809.getClass(), "clockPeriodInNs", 1000L);
        setField(term203809, term203809.getClass(), "behavior", enum262);
        setIntField(term203811, term203811.getClass(), "startAddress", 1011025023);
        setIntField(term203811, term203811.getClass(), "endAddress", 921803217);
        setLongField(term203814, term203814.getClass(), "clockPeriodInNs", 1000L);
        setField(term203814, term203814.getClass(), "behavior", enum262);
        setField(term203814, term203814.getClass(), "bus", null);
        setField(term203814, term203814.getClass(), "state", null);
        setLongField(term203814, term203814.getClass(), "opBeginTime", 7329701902499669605L);
        setField(term203811, term203811.getClass(), "cpu", term203814);
        setField(term203811, term203811.getClass(), "deviceMap", term203817);
        setField(term203811, term203811.getClass(), "deviceAddressArray", term203822);
        setField(term203809, term203809.getClass(), "bus", term203811);
        setIntField(term203823, term203823.getClass(), "a", 0);
        setIntField(term203823, term203823.getClass(), "x", 0);
        setIntField(term203823, term203823.getClass(), "y", 0);
        setIntField(term203823, term203823.getClass(), "sp", 0);
        setIntField(term203823, term203823.getClass(), "pc", 0);
        setIntField(term203823, term203823.getClass(), "ir", 0);
        setIntField(term203823, term203823.getClass(), "nextIr", 0);
        setField(term203823, term203823.getClass(), "args", term203831);
        setField(term203823, term203823.getClass(), "nextArgs", term203834);
        setIntField(term203823, term203823.getClass(), "instSize", 0);
        setBooleanField(term203823, term203823.getClass(), "opTrap", false);
        setBooleanField(term203823, term203823.getClass(), "irqAsserted", false);
        setBooleanField(term203823, term203823.getClass(), "nmiAsserted", false);
        setIntField(term203823, term203823.getClass(), "lastPc", 0);
        setBooleanField(term203823, term203823.getClass(), "carryFlag", false);
        setBooleanField(term203823, term203823.getClass(), "negativeFlag", false);
        setBooleanField(term203823, term203823.getClass(), "zeroFlag", false);
        setBooleanField(term203823, term203823.getClass(), "irqDisableFlag", false);
        setBooleanField(term203823, term203823.getClass(), "decimalModeFlag", false);
        setBooleanField(term203823, term203823.getClass(), "breakFlag", false);
        setBooleanField(term203823, term203823.getClass(), "overflowFlag", false);
        setLongField(term203823, term203823.getClass(), "stepCounter", 0L);
        setField(term203809, term203809.getClass(), "state", term203823);
        setLongField(term203809, term203809.getClass(), "opBeginTime", 596630330404532696L);
        setField(term203806, term203806.getClass(), "cpu", term203809);
        setField(term203806, term203806.getClass(), "deviceMap", term203851);
        setField(term203806, term203806.getClass(), "deviceAddressArray", term203856);
        setField(term203791, term203791.getClass(), "bus", term203806);
        setIntField(term203857, term203857.getClass(), "a", 0);
        setIntField(term203857, term203857.getClass(), "x", 0);
        setIntField(term203857, term203857.getClass(), "y", 0);
        setIntField(term203857, term203857.getClass(), "sp", 0);
        setIntField(term203857, term203857.getClass(), "pc", 0);
        setIntField(term203857, term203857.getClass(), "ir", 0);
        setIntField(term203857, term203857.getClass(), "nextIr", 0);
        setField(term203857, term203857.getClass(), "args", term203865);
        setField(term203857, term203857.getClass(), "nextArgs", term203868);
        setIntField(term203857, term203857.getClass(), "instSize", 0);
        setBooleanField(term203857, term203857.getClass(), "opTrap", false);
        setBooleanField(term203857, term203857.getClass(), "irqAsserted", false);
        setBooleanField(term203857, term203857.getClass(), "nmiAsserted", false);
        setIntField(term203857, term203857.getClass(), "lastPc", 0);
        setBooleanField(term203857, term203857.getClass(), "carryFlag", false);
        setBooleanField(term203857, term203857.getClass(), "negativeFlag", false);
        setBooleanField(term203857, term203857.getClass(), "zeroFlag", false);
        setBooleanField(term203857, term203857.getClass(), "irqDisableFlag", false);
        setBooleanField(term203857, term203857.getClass(), "decimalModeFlag", false);
        setBooleanField(term203857, term203857.getClass(), "breakFlag", false);
        setBooleanField(term203857, term203857.getClass(), "overflowFlag", false);
        setLongField(term203857, term203857.getClass(), "stepCounter", 0L);
        setField(term203791, term203791.getClass(), "state", term203857);
        setLongField(term203791, term203791.getClass(), "opBeginTime", 3628778546975266226L);
        term203885 = new Integer(-664242488);
        term203887 = new Integer(1562272299);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term203885;
        args[1] = term203887;
        callMethod(klass, "yAddress", argTypes, term203791, args);
    }

};


