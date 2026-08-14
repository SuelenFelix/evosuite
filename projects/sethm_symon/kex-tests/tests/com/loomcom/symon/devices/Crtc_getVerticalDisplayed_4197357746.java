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

public class Crtc_getVerticalDisplayed_4197357746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2690;

    public Crtc_getVerticalDisplayed_4197357746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2870 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term2869 = ((Class) term2870).getDeclaredField((String) "CMOS_6502");
        ((Field) term2869).setAccessible(true);
        Object enum6 = ((Field) term2869).get((Object) null);
        HashMap term2763 = new HashMap();
        HashMap term2770 = new HashMap();
        Set<Object> term3133 =  ((Map) term2770).keySet();
        HashSet term2769 = new HashSet((Collection<? extends Object>) term3133);
        HashMap term2803 = new HashMap();
        HashMap term2837 = new HashMap();
        HashMap term2844 = new HashMap();
        Set<Object> term3148 =  ((Map) term2844).keySet();
        HashSet term2843 = new HashSet((Collection<? extends Object>) term3148);
        term2690 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term2705 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term2707 = (int[]) newIntArray(7);
        Object term2716 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term2731 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term2734 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term2738 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term2741 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term2768 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term2777 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term2792 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term2795 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term2797 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term2800 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term2808 = (Object[]) newArray("com.loomcom.symon.devices.Device", 0);
        Object term2809 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term2817 = (int[]) newIntArray(2);
        int[] term2820 = (int[]) newIntArray(2);
        Object[] term2842 = (Object[]) newArray("com.loomcom.symon.devices.Device", 6);
        setIntField(term2690, term2690.getClass(), "horizontalDisplayed", 1687361082);
        setIntField(term2690, term2690.getClass(), "verticalDisplayed", 584893196);
        setIntField(term2690, term2690.getClass(), "scanLinesPerRow", 497269071);
        setIntField(term2690, term2690.getClass(), "cursorStartLine", -1899301124);
        setBooleanField(term2690, term2690.getClass(), "cursorEnabled", false);
        setIntField(term2690, term2690.getClass(), "cursorBlinkRate", -1882480155);
        setIntField(term2690, term2690.getClass(), "cursorStopLine", -1410220680);
        setIntField(term2690, term2690.getClass(), "startAddress", 389427431);
        setIntField(term2690, term2690.getClass(), "cursorPosition", -1945706126);
        setIntField(term2690, term2690.getClass(), "pageSize", 1152356969);
        setIntField(term2690, term2690.getClass(), "currentRegister", -1667990367);
        setBooleanField(term2690, term2690.getClass(), "rowColumnAddressing", true);
        setBooleanField(term2690, term2690.getClass(), "displayEnableSkew", true);
        setBooleanField(term2690, term2690.getClass(), "cursorSkew", true);
        setBooleanField(term2705, term2705.getClass(), "readOnly", true);
        setIntElement(term2707, 0, -1214628358);
        setIntElement(term2707, 1, 1102721075);
        setIntElement(term2707, 2, -426764678);
        setIntElement(term2707, 3, -1222614956);
        setIntElement(term2707, 4, -1870495012);
        setIntElement(term2707, 5, -1310015129);
        setIntElement(term2707, 6, -2104981311);
        setField(term2705, term2705.getClass(), "mem", term2707);
        setIntField(term2705, term2705.getClass(), "size", 318591690);
        setIntField(term2716, term2716.getClass(), "startAddress", -165587447);
        setIntField(term2716, term2716.getClass(), "endAddress", -1347358701);
        setField(term2705, term2705.getClass(), "memoryRange", term2716);
        setField(term2705, term2705.getClass(), "name", "uuaPigETmJ");
        setIntField(term2731, term2731.getClass(), "startAddress", 806595993);
        setIntField(term2731, term2731.getClass(), "endAddress", 548228925);
        setLongField(term2734, term2734.getClass(), "clockPeriodInNs", 1000L);
        setField(term2734, term2734.getClass(), "behavior", enum6);
        setIntField(term2738, term2738.getClass(), "startAddress", -749861210);
        setIntField(term2738, term2738.getClass(), "endAddress", 1694224101);
        setField(term2738, term2738.getClass(), "cpu", null);
        setField(term2738, term2738.getClass(), "deviceMap", null);
        setField(term2738, term2738.getClass(), "deviceAddressArray", null);
        setField(term2734, term2734.getClass(), "bus", term2738);
        setIntField(term2741, term2741.getClass(), "a", 0);
        setIntField(term2741, term2741.getClass(), "x", 0);
        setIntField(term2741, term2741.getClass(), "y", 0);
        setIntField(term2741, term2741.getClass(), "sp", 0);
        setIntField(term2741, term2741.getClass(), "pc", 0);
        setIntField(term2741, term2741.getClass(), "ir", 0);
        setIntField(term2741, term2741.getClass(), "nextIr", 0);
        setField(term2741, term2741.getClass(), "args", null);
        setField(term2741, term2741.getClass(), "nextArgs", null);
        setIntField(term2741, term2741.getClass(), "instSize", 0);
        setBooleanField(term2741, term2741.getClass(), "opTrap", false);
        setBooleanField(term2741, term2741.getClass(), "irqAsserted", false);
        setBooleanField(term2741, term2741.getClass(), "nmiAsserted", false);
        setIntField(term2741, term2741.getClass(), "lastPc", 0);
        setBooleanField(term2741, term2741.getClass(), "carryFlag", false);
        setBooleanField(term2741, term2741.getClass(), "negativeFlag", false);
        setBooleanField(term2741, term2741.getClass(), "zeroFlag", false);
        setBooleanField(term2741, term2741.getClass(), "irqDisableFlag", false);
        setBooleanField(term2741, term2741.getClass(), "decimalModeFlag", false);
        setBooleanField(term2741, term2741.getClass(), "breakFlag", false);
        setBooleanField(term2741, term2741.getClass(), "overflowFlag", false);
        setLongField(term2741, term2741.getClass(), "stepCounter", 0L);
        setField(term2734, term2734.getClass(), "state", term2741);
        setLongField(term2734, term2734.getClass(), "opBeginTime", 6617340557564669657L);
        setField(term2731, term2731.getClass(), "cpu", term2734);
        setField(term2731, term2731.getClass(), "deviceMap", term2763);
        setField(term2731, term2731.getClass(), "deviceAddressArray", term2768);
        setField(term2705, term2705.getClass(), "bus", term2731);
        setField(term2705, term2705.getClass(), "deviceChangeListeners", term2769);
        setField(term2690, term2690.getClass(), "memory", term2705);
        setIntField(term2690, term2690.getClass(), "size", -2131181468);
        setIntField(term2777, term2777.getClass(), "startAddress", 282916351);
        setIntField(term2777, term2777.getClass(), "endAddress", 880977281);
        setField(term2690, term2690.getClass(), "memoryRange", term2777);
        setField(term2690, term2690.getClass(), "name", "MxlszYVzRf");
        setIntField(term2792, term2792.getClass(), "startAddress", 371943306);
        setIntField(term2792, term2792.getClass(), "endAddress", 982388293);
        setLongField(term2795, term2795.getClass(), "clockPeriodInNs", 1000L);
        setField(term2795, term2795.getClass(), "behavior", enum6);
        setIntField(term2797, term2797.getClass(), "startAddress", -159494544);
        setIntField(term2797, term2797.getClass(), "endAddress", -75206835);
        setLongField(term2800, term2800.getClass(), "clockPeriodInNs", 1000L);
        setField(term2800, term2800.getClass(), "behavior", enum6);
        setField(term2800, term2800.getClass(), "bus", null);
        setField(term2800, term2800.getClass(), "state", null);
        setLongField(term2800, term2800.getClass(), "opBeginTime", -8708192233349544946L);
        setField(term2797, term2797.getClass(), "cpu", term2800);
        setField(term2797, term2797.getClass(), "deviceMap", term2803);
        setField(term2797, term2797.getClass(), "deviceAddressArray", term2808);
        setField(term2795, term2795.getClass(), "bus", term2797);
        setIntField(term2809, term2809.getClass(), "a", 0);
        setIntField(term2809, term2809.getClass(), "x", 0);
        setIntField(term2809, term2809.getClass(), "y", 0);
        setIntField(term2809, term2809.getClass(), "sp", 0);
        setIntField(term2809, term2809.getClass(), "pc", 0);
        setIntField(term2809, term2809.getClass(), "ir", 0);
        setIntField(term2809, term2809.getClass(), "nextIr", 0);
        setField(term2809, term2809.getClass(), "args", term2817);
        setField(term2809, term2809.getClass(), "nextArgs", term2820);
        setIntField(term2809, term2809.getClass(), "instSize", 0);
        setBooleanField(term2809, term2809.getClass(), "opTrap", false);
        setBooleanField(term2809, term2809.getClass(), "irqAsserted", false);
        setBooleanField(term2809, term2809.getClass(), "nmiAsserted", false);
        setIntField(term2809, term2809.getClass(), "lastPc", 0);
        setBooleanField(term2809, term2809.getClass(), "carryFlag", false);
        setBooleanField(term2809, term2809.getClass(), "negativeFlag", false);
        setBooleanField(term2809, term2809.getClass(), "zeroFlag", false);
        setBooleanField(term2809, term2809.getClass(), "irqDisableFlag", false);
        setBooleanField(term2809, term2809.getClass(), "decimalModeFlag", false);
        setBooleanField(term2809, term2809.getClass(), "breakFlag", false);
        setBooleanField(term2809, term2809.getClass(), "overflowFlag", false);
        setLongField(term2809, term2809.getClass(), "stepCounter", 0L);
        setField(term2795, term2795.getClass(), "state", term2809);
        setLongField(term2795, term2795.getClass(), "opBeginTime", 5907001541142728739L);
        setField(term2792, term2792.getClass(), "cpu", term2795);
        setField(term2792, term2792.getClass(), "deviceMap", term2837);
        setField(term2792, term2792.getClass(), "deviceAddressArray", term2842);
        setField(term2690, term2690.getClass(), "bus", term2792);
        setField(term2690, term2690.getClass(), "deviceChangeListeners", term2843);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVerticalDisplayed", argTypes, term2690, args);
    }

};


