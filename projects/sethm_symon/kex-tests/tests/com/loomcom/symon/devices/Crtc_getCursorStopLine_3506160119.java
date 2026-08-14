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

public class Crtc_getCursorStopLine_3506160119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4057;

    public Crtc_getCursorStopLine_3506160119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term4237 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term4236 = ((Class) term4237).getDeclaredField((String) "NMOS_6502");
        ((Field) term4236).setAccessible(true);
        Object enum9 = ((Field) term4236).get((Object) null);
        HashMap term4130 = new HashMap();
        HashMap term4137 = new HashMap();
        Set<Object> term4500 =  ((Map) term4137).keySet();
        HashSet term4136 = new HashSet((Collection<? extends Object>) term4500);
        HashMap term4170 = new HashMap();
        HashMap term4204 = new HashMap();
        HashMap term4211 = new HashMap();
        Set<Object> term4515 =  ((Map) term4211).keySet();
        HashSet term4210 = new HashSet((Collection<? extends Object>) term4515);
        term4057 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term4072 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term4074 = (int[]) newIntArray(7);
        Object term4083 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term4098 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term4101 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term4105 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term4108 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term4135 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term4144 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term4159 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term4162 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term4164 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term4167 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term4175 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term4176 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term4184 = (int[]) newIntArray(2);
        int[] term4187 = (int[]) newIntArray(2);
        Object[] term4209 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        setIntField(term4057, term4057.getClass(), "horizontalDisplayed", -1015274146);
        setIntField(term4057, term4057.getClass(), "verticalDisplayed", -49052672);
        setIntField(term4057, term4057.getClass(), "scanLinesPerRow", 339372704);
        setIntField(term4057, term4057.getClass(), "cursorStartLine", -851097944);
        setBooleanField(term4057, term4057.getClass(), "cursorEnabled", true);
        setIntField(term4057, term4057.getClass(), "cursorBlinkRate", 803925431);
        setIntField(term4057, term4057.getClass(), "cursorStopLine", 76929641);
        setIntField(term4057, term4057.getClass(), "startAddress", -2003192918);
        setIntField(term4057, term4057.getClass(), "cursorPosition", -1362856620);
        setIntField(term4057, term4057.getClass(), "pageSize", -1835839814);
        setIntField(term4057, term4057.getClass(), "currentRegister", -1404350380);
        setBooleanField(term4057, term4057.getClass(), "rowColumnAddressing", true);
        setBooleanField(term4057, term4057.getClass(), "displayEnableSkew", false);
        setBooleanField(term4057, term4057.getClass(), "cursorSkew", true);
        setBooleanField(term4072, term4072.getClass(), "readOnly", true);
        setIntElement(term4074, 0, -2013924238);
        setIntElement(term4074, 1, 579006268);
        setIntElement(term4074, 2, -1694747156);
        setIntElement(term4074, 3, 1466373988);
        setIntElement(term4074, 4, -358526505);
        setIntElement(term4074, 5, 1843268026);
        setIntElement(term4074, 6, 954660603);
        setField(term4072, term4072.getClass(), "mem", term4074);
        setIntField(term4072, term4072.getClass(), "size", 278355793);
        setIntField(term4083, term4083.getClass(), "startAddress", -310648604);
        setIntField(term4083, term4083.getClass(), "endAddress", -648200466);
        setField(term4072, term4072.getClass(), "memoryRange", term4083);
        setField(term4072, term4072.getClass(), "name", "tbcdzjIfER");
        setIntField(term4098, term4098.getClass(), "startAddress", 2007134147);
        setIntField(term4098, term4098.getClass(), "endAddress", 993388358);
        setLongField(term4101, term4101.getClass(), "clockPeriodInNs", 1000L);
        setField(term4101, term4101.getClass(), "behavior", enum9);
        setIntField(term4105, term4105.getClass(), "startAddress", -765191335);
        setIntField(term4105, term4105.getClass(), "endAddress", -1697741155);
        setField(term4105, term4105.getClass(), "cpu", null);
        setField(term4105, term4105.getClass(), "deviceMap", null);
        setField(term4105, term4105.getClass(), "deviceAddressArray", null);
        setField(term4101, term4101.getClass(), "bus", term4105);
        setIntField(term4108, term4108.getClass(), "a", 0);
        setIntField(term4108, term4108.getClass(), "x", 0);
        setIntField(term4108, term4108.getClass(), "y", 0);
        setIntField(term4108, term4108.getClass(), "sp", 0);
        setIntField(term4108, term4108.getClass(), "pc", 0);
        setIntField(term4108, term4108.getClass(), "ir", 0);
        setIntField(term4108, term4108.getClass(), "nextIr", 0);
        setField(term4108, term4108.getClass(), "args", null);
        setField(term4108, term4108.getClass(), "nextArgs", null);
        setIntField(term4108, term4108.getClass(), "instSize", 0);
        setBooleanField(term4108, term4108.getClass(), "opTrap", false);
        setBooleanField(term4108, term4108.getClass(), "irqAsserted", false);
        setBooleanField(term4108, term4108.getClass(), "nmiAsserted", false);
        setIntField(term4108, term4108.getClass(), "lastPc", 0);
        setBooleanField(term4108, term4108.getClass(), "carryFlag", false);
        setBooleanField(term4108, term4108.getClass(), "negativeFlag", false);
        setBooleanField(term4108, term4108.getClass(), "zeroFlag", false);
        setBooleanField(term4108, term4108.getClass(), "irqDisableFlag", false);
        setBooleanField(term4108, term4108.getClass(), "decimalModeFlag", false);
        setBooleanField(term4108, term4108.getClass(), "breakFlag", false);
        setBooleanField(term4108, term4108.getClass(), "overflowFlag", false);
        setLongField(term4108, term4108.getClass(), "stepCounter", 0L);
        setField(term4101, term4101.getClass(), "state", term4108);
        setLongField(term4101, term4101.getClass(), "opBeginTime", -2644215923136513282L);
        setField(term4098, term4098.getClass(), "cpu", term4101);
        setField(term4098, term4098.getClass(), "deviceMap", term4130);
        setField(term4098, term4098.getClass(), "deviceAddressArray", term4135);
        setField(term4072, term4072.getClass(), "bus", term4098);
        setField(term4072, term4072.getClass(), "deviceChangeListeners", term4136);
        setField(term4057, term4057.getClass(), "memory", term4072);
        setIntField(term4057, term4057.getClass(), "size", -1560631747);
        setIntField(term4144, term4144.getClass(), "startAddress", 1215150180);
        setIntField(term4144, term4144.getClass(), "endAddress", -1422859977);
        setField(term4057, term4057.getClass(), "memoryRange", term4144);
        setField(term4057, term4057.getClass(), "name", "HyxfbSQYBe");
        setIntField(term4159, term4159.getClass(), "startAddress", -1972436591);
        setIntField(term4159, term4159.getClass(), "endAddress", 68922753);
        setLongField(term4162, term4162.getClass(), "clockPeriodInNs", 1000L);
        setField(term4162, term4162.getClass(), "behavior", enum9);
        setIntField(term4164, term4164.getClass(), "startAddress", -220791533);
        setIntField(term4164, term4164.getClass(), "endAddress", 1741500243);
        setLongField(term4167, term4167.getClass(), "clockPeriodInNs", 1000L);
        setField(term4167, term4167.getClass(), "behavior", enum9);
        setField(term4167, term4167.getClass(), "bus", null);
        setField(term4167, term4167.getClass(), "state", null);
        setLongField(term4167, term4167.getClass(), "opBeginTime", -7738503207562305297L);
        setField(term4164, term4164.getClass(), "cpu", term4167);
        setField(term4164, term4164.getClass(), "deviceMap", term4170);
        setField(term4164, term4164.getClass(), "deviceAddressArray", term4175);
        setField(term4162, term4162.getClass(), "bus", term4164);
        setIntField(term4176, term4176.getClass(), "a", 0);
        setIntField(term4176, term4176.getClass(), "x", 0);
        setIntField(term4176, term4176.getClass(), "y", 0);
        setIntField(term4176, term4176.getClass(), "sp", 0);
        setIntField(term4176, term4176.getClass(), "pc", 0);
        setIntField(term4176, term4176.getClass(), "ir", 0);
        setIntField(term4176, term4176.getClass(), "nextIr", 0);
        setField(term4176, term4176.getClass(), "args", term4184);
        setField(term4176, term4176.getClass(), "nextArgs", term4187);
        setIntField(term4176, term4176.getClass(), "instSize", 0);
        setBooleanField(term4176, term4176.getClass(), "opTrap", false);
        setBooleanField(term4176, term4176.getClass(), "irqAsserted", false);
        setBooleanField(term4176, term4176.getClass(), "nmiAsserted", false);
        setIntField(term4176, term4176.getClass(), "lastPc", 0);
        setBooleanField(term4176, term4176.getClass(), "carryFlag", false);
        setBooleanField(term4176, term4176.getClass(), "negativeFlag", false);
        setBooleanField(term4176, term4176.getClass(), "zeroFlag", false);
        setBooleanField(term4176, term4176.getClass(), "irqDisableFlag", false);
        setBooleanField(term4176, term4176.getClass(), "decimalModeFlag", false);
        setBooleanField(term4176, term4176.getClass(), "breakFlag", false);
        setBooleanField(term4176, term4176.getClass(), "overflowFlag", false);
        setLongField(term4176, term4176.getClass(), "stepCounter", 0L);
        setField(term4162, term4162.getClass(), "state", term4176);
        setLongField(term4162, term4162.getClass(), "opBeginTime", 3825396310311739952L);
        setField(term4159, term4159.getClass(), "cpu", term4162);
        setField(term4159, term4159.getClass(), "deviceMap", term4204);
        setField(term4159, term4159.getClass(), "deviceAddressArray", term4209);
        setField(term4057, term4057.getClass(), "bus", term4159);
        setField(term4057, term4057.getClass(), "deviceChangeListeners", term4210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCursorStopLine", argTypes, term4057, args);
    }

};


