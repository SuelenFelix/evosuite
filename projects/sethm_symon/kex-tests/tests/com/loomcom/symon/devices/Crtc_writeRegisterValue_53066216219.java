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

public class Crtc_writeRegisterValue_53066216219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8634;
     Object term8794;

    public Crtc_writeRegisterValue_53066216219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8812 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term8811 = ((Class) term8812).getDeclaredField((String) "NMOS_6502");
        ((Field) term8811).setAccessible(true);
        Object enum19 = ((Field) term8811).get((Object) null);
        HashMap term8705 = new HashMap();
        HashMap term8712 = new HashMap();
        Set<Object> term9075 =  ((Map) term8712).keySet();
        HashSet term8711 = new HashSet((Collection<? extends Object>) term9075);
        HashMap term8745 = new HashMap();
        HashMap term8779 = new HashMap();
        HashMap term8786 = new HashMap();
        Set<Object> term9090 =  ((Map) term8786).keySet();
        HashSet term8785 = new HashSet((Collection<? extends Object>) term9090);
        term8634 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term8649 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term8651 = (int[]) newIntArray(5);
        Object term8658 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term8673 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term8676 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term8680 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term8683 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term8710 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term8719 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term8734 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term8737 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term8739 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term8742 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term8750 = (Object[]) newArray("com.loomcom.symon.devices.Device", 7);
        Object term8751 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term8759 = (int[]) newIntArray(2);
        int[] term8762 = (int[]) newIntArray(2);
        Object[] term8784 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        setIntField(term8634, term8634.getClass(), "horizontalDisplayed", -514195141);
        setIntField(term8634, term8634.getClass(), "verticalDisplayed", -297946422);
        setIntField(term8634, term8634.getClass(), "scanLinesPerRow", 385463636);
        setIntField(term8634, term8634.getClass(), "cursorStartLine", -1677599962);
        setBooleanField(term8634, term8634.getClass(), "cursorEnabled", true);
        setIntField(term8634, term8634.getClass(), "cursorBlinkRate", -1790275458);
        setIntField(term8634, term8634.getClass(), "cursorStopLine", -497534255);
        setIntField(term8634, term8634.getClass(), "startAddress", 1588942911);
        setIntField(term8634, term8634.getClass(), "cursorPosition", -2129828854);
        setIntField(term8634, term8634.getClass(), "pageSize", -47438786);
        setIntField(term8634, term8634.getClass(), "currentRegister", -1955400589);
        setBooleanField(term8634, term8634.getClass(), "rowColumnAddressing", true);
        setBooleanField(term8634, term8634.getClass(), "displayEnableSkew", false);
        setBooleanField(term8634, term8634.getClass(), "cursorSkew", false);
        setBooleanField(term8649, term8649.getClass(), "readOnly", true);
        setIntElement(term8651, 0, 626179200);
        setIntElement(term8651, 1, -511077684);
        setIntElement(term8651, 2, -711507760);
        setIntElement(term8651, 3, 1053773809);
        setIntElement(term8651, 4, 924127883);
        setField(term8649, term8649.getClass(), "mem", term8651);
        setIntField(term8649, term8649.getClass(), "size", -110837188);
        setIntField(term8658, term8658.getClass(), "startAddress", -271094506);
        setIntField(term8658, term8658.getClass(), "endAddress", 455632030);
        setField(term8649, term8649.getClass(), "memoryRange", term8658);
        setField(term8649, term8649.getClass(), "name", "IDCWpPLRkE");
        setIntField(term8673, term8673.getClass(), "startAddress", -1632929393);
        setIntField(term8673, term8673.getClass(), "endAddress", -431440129);
        setLongField(term8676, term8676.getClass(), "clockPeriodInNs", 1000L);
        setField(term8676, term8676.getClass(), "behavior", enum19);
        setIntField(term8680, term8680.getClass(), "startAddress", -763576148);
        setIntField(term8680, term8680.getClass(), "endAddress", 1568948514);
        setField(term8680, term8680.getClass(), "cpu", null);
        setField(term8680, term8680.getClass(), "deviceMap", null);
        setField(term8680, term8680.getClass(), "deviceAddressArray", null);
        setField(term8676, term8676.getClass(), "bus", term8680);
        setIntField(term8683, term8683.getClass(), "a", 0);
        setIntField(term8683, term8683.getClass(), "x", 0);
        setIntField(term8683, term8683.getClass(), "y", 0);
        setIntField(term8683, term8683.getClass(), "sp", 0);
        setIntField(term8683, term8683.getClass(), "pc", 0);
        setIntField(term8683, term8683.getClass(), "ir", 0);
        setIntField(term8683, term8683.getClass(), "nextIr", 0);
        setField(term8683, term8683.getClass(), "args", null);
        setField(term8683, term8683.getClass(), "nextArgs", null);
        setIntField(term8683, term8683.getClass(), "instSize", 0);
        setBooleanField(term8683, term8683.getClass(), "opTrap", false);
        setBooleanField(term8683, term8683.getClass(), "irqAsserted", false);
        setBooleanField(term8683, term8683.getClass(), "nmiAsserted", false);
        setIntField(term8683, term8683.getClass(), "lastPc", 0);
        setBooleanField(term8683, term8683.getClass(), "carryFlag", false);
        setBooleanField(term8683, term8683.getClass(), "negativeFlag", false);
        setBooleanField(term8683, term8683.getClass(), "zeroFlag", false);
        setBooleanField(term8683, term8683.getClass(), "irqDisableFlag", false);
        setBooleanField(term8683, term8683.getClass(), "decimalModeFlag", false);
        setBooleanField(term8683, term8683.getClass(), "breakFlag", false);
        setBooleanField(term8683, term8683.getClass(), "overflowFlag", false);
        setLongField(term8683, term8683.getClass(), "stepCounter", 0L);
        setField(term8676, term8676.getClass(), "state", term8683);
        setLongField(term8676, term8676.getClass(), "opBeginTime", -6342139649364011743L);
        setField(term8673, term8673.getClass(), "cpu", term8676);
        setField(term8673, term8673.getClass(), "deviceMap", term8705);
        setField(term8673, term8673.getClass(), "deviceAddressArray", term8710);
        setField(term8649, term8649.getClass(), "bus", term8673);
        setField(term8649, term8649.getClass(), "deviceChangeListeners", term8711);
        setField(term8634, term8634.getClass(), "memory", term8649);
        setIntField(term8634, term8634.getClass(), "size", -1630069454);
        setIntField(term8719, term8719.getClass(), "startAddress", 1499735894);
        setIntField(term8719, term8719.getClass(), "endAddress", 716486048);
        setField(term8634, term8634.getClass(), "memoryRange", term8719);
        setField(term8634, term8634.getClass(), "name", "nyiiPDVjAc");
        setIntField(term8734, term8734.getClass(), "startAddress", -466708718);
        setIntField(term8734, term8734.getClass(), "endAddress", 1038029515);
        setLongField(term8737, term8737.getClass(), "clockPeriodInNs", 1000L);
        setField(term8737, term8737.getClass(), "behavior", enum19);
        setIntField(term8739, term8739.getClass(), "startAddress", 1137154606);
        setIntField(term8739, term8739.getClass(), "endAddress", -100681578);
        setLongField(term8742, term8742.getClass(), "clockPeriodInNs", 1000L);
        setField(term8742, term8742.getClass(), "behavior", enum19);
        setField(term8742, term8742.getClass(), "bus", null);
        setField(term8742, term8742.getClass(), "state", null);
        setLongField(term8742, term8742.getClass(), "opBeginTime", -4393710401270724527L);
        setField(term8739, term8739.getClass(), "cpu", term8742);
        setField(term8739, term8739.getClass(), "deviceMap", term8745);
        setField(term8739, term8739.getClass(), "deviceAddressArray", term8750);
        setField(term8737, term8737.getClass(), "bus", term8739);
        setIntField(term8751, term8751.getClass(), "a", 0);
        setIntField(term8751, term8751.getClass(), "x", 0);
        setIntField(term8751, term8751.getClass(), "y", 0);
        setIntField(term8751, term8751.getClass(), "sp", 0);
        setIntField(term8751, term8751.getClass(), "pc", 0);
        setIntField(term8751, term8751.getClass(), "ir", 0);
        setIntField(term8751, term8751.getClass(), "nextIr", 0);
        setField(term8751, term8751.getClass(), "args", term8759);
        setField(term8751, term8751.getClass(), "nextArgs", term8762);
        setIntField(term8751, term8751.getClass(), "instSize", 0);
        setBooleanField(term8751, term8751.getClass(), "opTrap", false);
        setBooleanField(term8751, term8751.getClass(), "irqAsserted", false);
        setBooleanField(term8751, term8751.getClass(), "nmiAsserted", false);
        setIntField(term8751, term8751.getClass(), "lastPc", 0);
        setBooleanField(term8751, term8751.getClass(), "carryFlag", false);
        setBooleanField(term8751, term8751.getClass(), "negativeFlag", false);
        setBooleanField(term8751, term8751.getClass(), "zeroFlag", false);
        setBooleanField(term8751, term8751.getClass(), "irqDisableFlag", false);
        setBooleanField(term8751, term8751.getClass(), "decimalModeFlag", false);
        setBooleanField(term8751, term8751.getClass(), "breakFlag", false);
        setBooleanField(term8751, term8751.getClass(), "overflowFlag", false);
        setLongField(term8751, term8751.getClass(), "stepCounter", 0L);
        setField(term8737, term8737.getClass(), "state", term8751);
        setLongField(term8737, term8737.getClass(), "opBeginTime", -4822736661741380518L);
        setField(term8734, term8734.getClass(), "cpu", term8737);
        setField(term8734, term8734.getClass(), "deviceMap", term8779);
        setField(term8734, term8734.getClass(), "deviceAddressArray", term8784);
        setField(term8634, term8634.getClass(), "bus", term8734);
        setField(term8634, term8634.getClass(), "deviceChangeListeners", term8785);
        term8794 = new Integer(401203924);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8794;
        callMethod(klass, "writeRegisterValue", argTypes, term8634, args);
    }

};


