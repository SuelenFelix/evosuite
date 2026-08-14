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

public class Cpu_clearBreakFlag_162745806547 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190961;

    public Cpu_clearBreakFlag_162745806547() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term191056 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term191055 = ((Class) term191056).getDeclaredField((String) "NMOS_6502");
        ((Field) term191055).setAccessible(true);
        Object enum227 = ((Field) term191055).get((Object) null);
        HashMap term190987 = new HashMap();
        HashMap term191021 = new HashMap();
        term190961 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term190976 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term190979 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term190981 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term190984 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term190992 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        Object term190993 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term191001 = (int[]) newIntArray(2);
        int[] term191004 = (int[]) newIntArray(2);
        Object[] term191026 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term191027 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term191035 = (int[]) newIntArray(2);
        int[] term191038 = (int[]) newIntArray(2);
        setLongField(term190961, term190961.getClass(), "clockPeriodInNs", 1000L);
        setField(term190961, term190961.getClass(), "behavior", enum227);
        setIntField(term190976, term190976.getClass(), "startAddress", 492120544);
        setIntField(term190976, term190976.getClass(), "endAddress", -832143098);
        setLongField(term190979, term190979.getClass(), "clockPeriodInNs", 1000L);
        setField(term190979, term190979.getClass(), "behavior", enum227);
        setIntField(term190981, term190981.getClass(), "startAddress", 919518312);
        setIntField(term190981, term190981.getClass(), "endAddress", 363743117);
        setLongField(term190984, term190984.getClass(), "clockPeriodInNs", 1000L);
        setField(term190984, term190984.getClass(), "behavior", enum227);
        setField(term190984, term190984.getClass(), "bus", null);
        setField(term190984, term190984.getClass(), "state", null);
        setLongField(term190984, term190984.getClass(), "opBeginTime", 3900637824492447206L);
        setField(term190981, term190981.getClass(), "cpu", term190984);
        setField(term190981, term190981.getClass(), "deviceMap", term190987);
        setField(term190981, term190981.getClass(), "deviceAddressArray", term190992);
        setField(term190979, term190979.getClass(), "bus", term190981);
        setIntField(term190993, term190993.getClass(), "a", 0);
        setIntField(term190993, term190993.getClass(), "x", 0);
        setIntField(term190993, term190993.getClass(), "y", 0);
        setIntField(term190993, term190993.getClass(), "sp", 0);
        setIntField(term190993, term190993.getClass(), "pc", 0);
        setIntField(term190993, term190993.getClass(), "ir", 0);
        setIntField(term190993, term190993.getClass(), "nextIr", 0);
        setField(term190993, term190993.getClass(), "args", term191001);
        setField(term190993, term190993.getClass(), "nextArgs", term191004);
        setIntField(term190993, term190993.getClass(), "instSize", 0);
        setBooleanField(term190993, term190993.getClass(), "opTrap", false);
        setBooleanField(term190993, term190993.getClass(), "irqAsserted", false);
        setBooleanField(term190993, term190993.getClass(), "nmiAsserted", false);
        setIntField(term190993, term190993.getClass(), "lastPc", 0);
        setBooleanField(term190993, term190993.getClass(), "carryFlag", false);
        setBooleanField(term190993, term190993.getClass(), "negativeFlag", false);
        setBooleanField(term190993, term190993.getClass(), "zeroFlag", false);
        setBooleanField(term190993, term190993.getClass(), "irqDisableFlag", false);
        setBooleanField(term190993, term190993.getClass(), "decimalModeFlag", false);
        setBooleanField(term190993, term190993.getClass(), "breakFlag", false);
        setBooleanField(term190993, term190993.getClass(), "overflowFlag", false);
        setLongField(term190993, term190993.getClass(), "stepCounter", 0L);
        setField(term190979, term190979.getClass(), "state", term190993);
        setLongField(term190979, term190979.getClass(), "opBeginTime", 5914809586547397675L);
        setField(term190976, term190976.getClass(), "cpu", term190979);
        setField(term190976, term190976.getClass(), "deviceMap", term191021);
        setField(term190976, term190976.getClass(), "deviceAddressArray", term191026);
        setField(term190961, term190961.getClass(), "bus", term190976);
        setIntField(term191027, term191027.getClass(), "a", 0);
        setIntField(term191027, term191027.getClass(), "x", 0);
        setIntField(term191027, term191027.getClass(), "y", 0);
        setIntField(term191027, term191027.getClass(), "sp", 0);
        setIntField(term191027, term191027.getClass(), "pc", 0);
        setIntField(term191027, term191027.getClass(), "ir", 0);
        setIntField(term191027, term191027.getClass(), "nextIr", 0);
        setField(term191027, term191027.getClass(), "args", term191035);
        setField(term191027, term191027.getClass(), "nextArgs", term191038);
        setIntField(term191027, term191027.getClass(), "instSize", 0);
        setBooleanField(term191027, term191027.getClass(), "opTrap", false);
        setBooleanField(term191027, term191027.getClass(), "irqAsserted", false);
        setBooleanField(term191027, term191027.getClass(), "nmiAsserted", false);
        setIntField(term191027, term191027.getClass(), "lastPc", 0);
        setBooleanField(term191027, term191027.getClass(), "carryFlag", false);
        setBooleanField(term191027, term191027.getClass(), "negativeFlag", false);
        setBooleanField(term191027, term191027.getClass(), "zeroFlag", false);
        setBooleanField(term191027, term191027.getClass(), "irqDisableFlag", false);
        setBooleanField(term191027, term191027.getClass(), "decimalModeFlag", false);
        setBooleanField(term191027, term191027.getClass(), "breakFlag", false);
        setBooleanField(term191027, term191027.getClass(), "overflowFlag", false);
        setLongField(term191027, term191027.getClass(), "stepCounter", 0L);
        setField(term190961, term190961.getClass(), "state", term191027);
        setLongField(term190961, term190961.getClass(), "opBeginTime", -8946539398468447729L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.Cpu");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearBreakFlag", argTypes, term190961, args);
    }

};


