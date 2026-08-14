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

public class Crtc_getCursorSkew_160213078517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7730;

    public Crtc_getCursorSkew_160213078517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7904 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term7903 = ((Class) term7904).getDeclaredField((String) "NMOS_6502");
        ((Field) term7903).setAccessible(true);
        Object enum17 = ((Field) term7903).get((Object) null);
        HashMap term7800 = new HashMap();
        HashMap term7807 = new HashMap();
        Set<Object> term8167 =  ((Map) term7807).keySet();
        HashSet term7806 = new HashSet((Collection<? extends Object>) term8167);
        HashMap term7840 = new HashMap();
        HashMap term7874 = new HashMap();
        HashMap term7881 = new HashMap();
        Set<Object> term8182 =  ((Map) term7881).keySet();
        HashSet term7880 = new HashSet((Collection<? extends Object>) term8182);
        term7730 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term7745 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term7747 = (int[]) newIntArray(4);
        Object term7753 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term7768 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term7771 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term7775 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term7778 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term7805 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        Object term7814 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term7829 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term7832 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term7834 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term7837 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term7845 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term7846 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term7854 = (int[]) newIntArray(2);
        int[] term7857 = (int[]) newIntArray(2);
        Object[] term7879 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        setIntField(term7730, term7730.getClass(), "horizontalDisplayed", 1981860404);
        setIntField(term7730, term7730.getClass(), "verticalDisplayed", 732174235);
        setIntField(term7730, term7730.getClass(), "scanLinesPerRow", 470895808);
        setIntField(term7730, term7730.getClass(), "cursorStartLine", 1787325291);
        setBooleanField(term7730, term7730.getClass(), "cursorEnabled", true);
        setIntField(term7730, term7730.getClass(), "cursorBlinkRate", 1470349147);
        setIntField(term7730, term7730.getClass(), "cursorStopLine", -255317272);
        setIntField(term7730, term7730.getClass(), "startAddress", -706253892);
        setIntField(term7730, term7730.getClass(), "cursorPosition", -1341439819);
        setIntField(term7730, term7730.getClass(), "pageSize", -728760750);
        setIntField(term7730, term7730.getClass(), "currentRegister", -1617383807);
        setBooleanField(term7730, term7730.getClass(), "rowColumnAddressing", false);
        setBooleanField(term7730, term7730.getClass(), "displayEnableSkew", true);
        setBooleanField(term7730, term7730.getClass(), "cursorSkew", false);
        setBooleanField(term7745, term7745.getClass(), "readOnly", true);
        setIntElement(term7747, 0, -1244386281);
        setIntElement(term7747, 1, -885788574);
        setIntElement(term7747, 2, -865722613);
        setIntElement(term7747, 3, -1551355284);
        setField(term7745, term7745.getClass(), "mem", term7747);
        setIntField(term7745, term7745.getClass(), "size", 1213549815);
        setIntField(term7753, term7753.getClass(), "startAddress", -1518419301);
        setIntField(term7753, term7753.getClass(), "endAddress", 674879025);
        setField(term7745, term7745.getClass(), "memoryRange", term7753);
        setField(term7745, term7745.getClass(), "name", "SbAoxhfrkn");
        setIntField(term7768, term7768.getClass(), "startAddress", -1538936030);
        setIntField(term7768, term7768.getClass(), "endAddress", -752870423);
        setLongField(term7771, term7771.getClass(), "clockPeriodInNs", 1000L);
        setField(term7771, term7771.getClass(), "behavior", enum17);
        setIntField(term7775, term7775.getClass(), "startAddress", -1698809299);
        setIntField(term7775, term7775.getClass(), "endAddress", 401512128);
        setField(term7775, term7775.getClass(), "cpu", null);
        setField(term7775, term7775.getClass(), "deviceMap", null);
        setField(term7775, term7775.getClass(), "deviceAddressArray", null);
        setField(term7771, term7771.getClass(), "bus", term7775);
        setIntField(term7778, term7778.getClass(), "a", 0);
        setIntField(term7778, term7778.getClass(), "x", 0);
        setIntField(term7778, term7778.getClass(), "y", 0);
        setIntField(term7778, term7778.getClass(), "sp", 0);
        setIntField(term7778, term7778.getClass(), "pc", 0);
        setIntField(term7778, term7778.getClass(), "ir", 0);
        setIntField(term7778, term7778.getClass(), "nextIr", 0);
        setField(term7778, term7778.getClass(), "args", null);
        setField(term7778, term7778.getClass(), "nextArgs", null);
        setIntField(term7778, term7778.getClass(), "instSize", 0);
        setBooleanField(term7778, term7778.getClass(), "opTrap", false);
        setBooleanField(term7778, term7778.getClass(), "irqAsserted", false);
        setBooleanField(term7778, term7778.getClass(), "nmiAsserted", false);
        setIntField(term7778, term7778.getClass(), "lastPc", 0);
        setBooleanField(term7778, term7778.getClass(), "carryFlag", false);
        setBooleanField(term7778, term7778.getClass(), "negativeFlag", false);
        setBooleanField(term7778, term7778.getClass(), "zeroFlag", false);
        setBooleanField(term7778, term7778.getClass(), "irqDisableFlag", false);
        setBooleanField(term7778, term7778.getClass(), "decimalModeFlag", false);
        setBooleanField(term7778, term7778.getClass(), "breakFlag", false);
        setBooleanField(term7778, term7778.getClass(), "overflowFlag", false);
        setLongField(term7778, term7778.getClass(), "stepCounter", 0L);
        setField(term7771, term7771.getClass(), "state", term7778);
        setLongField(term7771, term7771.getClass(), "opBeginTime", -8033714905181142681L);
        setField(term7768, term7768.getClass(), "cpu", term7771);
        setField(term7768, term7768.getClass(), "deviceMap", term7800);
        setField(term7768, term7768.getClass(), "deviceAddressArray", term7805);
        setField(term7745, term7745.getClass(), "bus", term7768);
        setField(term7745, term7745.getClass(), "deviceChangeListeners", term7806);
        setField(term7730, term7730.getClass(), "memory", term7745);
        setIntField(term7730, term7730.getClass(), "size", -1385748168);
        setIntField(term7814, term7814.getClass(), "startAddress", -270592367);
        setIntField(term7814, term7814.getClass(), "endAddress", 178847646);
        setField(term7730, term7730.getClass(), "memoryRange", term7814);
        setField(term7730, term7730.getClass(), "name", "kuTXqwMtDB");
        setIntField(term7829, term7829.getClass(), "startAddress", 273590437);
        setIntField(term7829, term7829.getClass(), "endAddress", -348612876);
        setLongField(term7832, term7832.getClass(), "clockPeriodInNs", 1000L);
        setField(term7832, term7832.getClass(), "behavior", enum17);
        setIntField(term7834, term7834.getClass(), "startAddress", 1302807565);
        setIntField(term7834, term7834.getClass(), "endAddress", -838848221);
        setLongField(term7837, term7837.getClass(), "clockPeriodInNs", 1000L);
        setField(term7837, term7837.getClass(), "behavior", enum17);
        setField(term7837, term7837.getClass(), "bus", null);
        setField(term7837, term7837.getClass(), "state", null);
        setLongField(term7837, term7837.getClass(), "opBeginTime", 1368340889161782793L);
        setField(term7834, term7834.getClass(), "cpu", term7837);
        setField(term7834, term7834.getClass(), "deviceMap", term7840);
        setField(term7834, term7834.getClass(), "deviceAddressArray", term7845);
        setField(term7832, term7832.getClass(), "bus", term7834);
        setIntField(term7846, term7846.getClass(), "a", 0);
        setIntField(term7846, term7846.getClass(), "x", 0);
        setIntField(term7846, term7846.getClass(), "y", 0);
        setIntField(term7846, term7846.getClass(), "sp", 0);
        setIntField(term7846, term7846.getClass(), "pc", 0);
        setIntField(term7846, term7846.getClass(), "ir", 0);
        setIntField(term7846, term7846.getClass(), "nextIr", 0);
        setField(term7846, term7846.getClass(), "args", term7854);
        setField(term7846, term7846.getClass(), "nextArgs", term7857);
        setIntField(term7846, term7846.getClass(), "instSize", 0);
        setBooleanField(term7846, term7846.getClass(), "opTrap", false);
        setBooleanField(term7846, term7846.getClass(), "irqAsserted", false);
        setBooleanField(term7846, term7846.getClass(), "nmiAsserted", false);
        setIntField(term7846, term7846.getClass(), "lastPc", 0);
        setBooleanField(term7846, term7846.getClass(), "carryFlag", false);
        setBooleanField(term7846, term7846.getClass(), "negativeFlag", false);
        setBooleanField(term7846, term7846.getClass(), "zeroFlag", false);
        setBooleanField(term7846, term7846.getClass(), "irqDisableFlag", false);
        setBooleanField(term7846, term7846.getClass(), "decimalModeFlag", false);
        setBooleanField(term7846, term7846.getClass(), "breakFlag", false);
        setBooleanField(term7846, term7846.getClass(), "overflowFlag", false);
        setLongField(term7846, term7846.getClass(), "stepCounter", 0L);
        setField(term7832, term7832.getClass(), "state", term7846);
        setLongField(term7832, term7832.getClass(), "opBeginTime", -5786861555969446503L);
        setField(term7829, term7829.getClass(), "cpu", term7832);
        setField(term7829, term7829.getClass(), "deviceMap", term7874);
        setField(term7829, term7829.getClass(), "deviceAddressArray", term7879);
        setField(term7730, term7730.getClass(), "bus", term7829);
        setField(term7730, term7730.getClass(), "deviceChangeListeners", term7880);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCursorSkew", argTypes, term7730, args);
    }

};


