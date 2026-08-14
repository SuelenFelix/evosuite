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

public class Cpu_adc_16296560314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178845;
     Object term178939;
     Object term178941;

    public Cpu_adc_16296560314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term178944 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term178943 = ((Class) term178944).getDeclaredField((String) "NMOS_6502");
        ((Field) term178943).setAccessible(true);
        Object enum194 = ((Field) term178943).get((Object) null);
        HashMap term178871 = new HashMap();
        HashMap term178905 = new HashMap();
        term178845 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term178860 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term178863 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term178865 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term178868 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term178876 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term178877 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term178885 = (int[]) newIntArray(2);
        int[] term178888 = (int[]) newIntArray(2);
        Object[] term178910 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term178911 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term178919 = (int[]) newIntArray(2);
        int[] term178922 = (int[]) newIntArray(2);
        setLongField(term178845, term178845.getClass(), "clockPeriodInNs", 1000L);
        setField(term178845, term178845.getClass(), "behavior", enum194);
        setIntField(term178860, term178860.getClass(), "startAddress", 1894367611);
        setIntField(term178860, term178860.getClass(), "endAddress", 2121003177);
        setLongField(term178863, term178863.getClass(), "clockPeriodInNs", 1000L);
        setField(term178863, term178863.getClass(), "behavior", enum194);
        setIntField(term178865, term178865.getClass(), "startAddress", 1093708386);
        setIntField(term178865, term178865.getClass(), "endAddress", 1609837057);
        setLongField(term178868, term178868.getClass(), "clockPeriodInNs", 1000L);
        setField(term178868, term178868.getClass(), "behavior", enum194);
        setField(term178868, term178868.getClass(), "bus", null);
        setField(term178868, term178868.getClass(), "state", null);
        setLongField(term178868, term178868.getClass(), "opBeginTime", 226516165063797489L);
        setField(term178865, term178865.getClass(), "cpu", term178868);
        setField(term178865, term178865.getClass(), "deviceMap", term178871);
        setField(term178865, term178865.getClass(), "deviceAddressArray", term178876);
        setField(term178863, term178863.getClass(), "bus", term178865);
        setIntField(term178877, term178877.getClass(), "a", 0);
        setIntField(term178877, term178877.getClass(), "x", 0);
        setIntField(term178877, term178877.getClass(), "y", 0);
        setIntField(term178877, term178877.getClass(), "sp", 0);
        setIntField(term178877, term178877.getClass(), "pc", 0);
        setIntField(term178877, term178877.getClass(), "ir", 0);
        setIntField(term178877, term178877.getClass(), "nextIr", 0);
        setField(term178877, term178877.getClass(), "args", term178885);
        setField(term178877, term178877.getClass(), "nextArgs", term178888);
        setIntField(term178877, term178877.getClass(), "instSize", 0);
        setBooleanField(term178877, term178877.getClass(), "opTrap", false);
        setBooleanField(term178877, term178877.getClass(), "irqAsserted", false);
        setBooleanField(term178877, term178877.getClass(), "nmiAsserted", false);
        setIntField(term178877, term178877.getClass(), "lastPc", 0);
        setBooleanField(term178877, term178877.getClass(), "carryFlag", false);
        setBooleanField(term178877, term178877.getClass(), "negativeFlag", false);
        setBooleanField(term178877, term178877.getClass(), "zeroFlag", false);
        setBooleanField(term178877, term178877.getClass(), "irqDisableFlag", false);
        setBooleanField(term178877, term178877.getClass(), "decimalModeFlag", false);
        setBooleanField(term178877, term178877.getClass(), "breakFlag", false);
        setBooleanField(term178877, term178877.getClass(), "overflowFlag", false);
        setLongField(term178877, term178877.getClass(), "stepCounter", 0L);
        setField(term178863, term178863.getClass(), "state", term178877);
        setLongField(term178863, term178863.getClass(), "opBeginTime", -5055043026089632641L);
        setField(term178860, term178860.getClass(), "cpu", term178863);
        setField(term178860, term178860.getClass(), "deviceMap", term178905);
        setField(term178860, term178860.getClass(), "deviceAddressArray", term178910);
        setField(term178845, term178845.getClass(), "bus", term178860);
        setIntField(term178911, term178911.getClass(), "a", 0);
        setIntField(term178911, term178911.getClass(), "x", 0);
        setIntField(term178911, term178911.getClass(), "y", 0);
        setIntField(term178911, term178911.getClass(), "sp", 0);
        setIntField(term178911, term178911.getClass(), "pc", 0);
        setIntField(term178911, term178911.getClass(), "ir", 0);
        setIntField(term178911, term178911.getClass(), "nextIr", 0);
        setField(term178911, term178911.getClass(), "args", term178919);
        setField(term178911, term178911.getClass(), "nextArgs", term178922);
        setIntField(term178911, term178911.getClass(), "instSize", 0);
        setBooleanField(term178911, term178911.getClass(), "opTrap", false);
        setBooleanField(term178911, term178911.getClass(), "irqAsserted", false);
        setBooleanField(term178911, term178911.getClass(), "nmiAsserted", false);
        setIntField(term178911, term178911.getClass(), "lastPc", 0);
        setBooleanField(term178911, term178911.getClass(), "carryFlag", false);
        setBooleanField(term178911, term178911.getClass(), "negativeFlag", false);
        setBooleanField(term178911, term178911.getClass(), "zeroFlag", false);
        setBooleanField(term178911, term178911.getClass(), "irqDisableFlag", false);
        setBooleanField(term178911, term178911.getClass(), "decimalModeFlag", false);
        setBooleanField(term178911, term178911.getClass(), "breakFlag", false);
        setBooleanField(term178911, term178911.getClass(), "overflowFlag", false);
        setLongField(term178911, term178911.getClass(), "stepCounter", 0L);
        setField(term178845, term178845.getClass(), "state", term178911);
        setLongField(term178845, term178845.getClass(), "opBeginTime", -3602145915631274444L);
        term178939 = new Integer(904392784);
        term178941 = new Integer(-165829430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term178939;
        args[1] = term178941;
        callMethod(klass, "adc", argTypes, term178845, args);
    }

};


