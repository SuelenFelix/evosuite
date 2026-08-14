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

public class Crtc_getRowColumnAddressing_102928158315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6822;

    public Crtc_getRowColumnAddressing_102928158315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6994 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term6993 = ((Class) term6994).getDeclaredField((String) "NMOS_6502");
        ((Field) term6993).setAccessible(true);
        Object enum15 = ((Field) term6993).get((Object) null);
        HashMap term6891 = new HashMap();
        HashMap term6898 = new HashMap();
        Set<Object> term7257 =  ((Map) term6898).keySet();
        HashSet term6897 = new HashSet((Collection<? extends Object>) term7257);
        HashMap term6931 = new HashMap();
        HashMap term6965 = new HashMap();
        HashMap term6972 = new HashMap();
        Set<Object> term7272 =  ((Map) term6972).keySet();
        HashSet term6971 = new HashSet((Collection<? extends Object>) term7272);
        term6822 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term6837 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term6839 = (int[]) newIntArray(3);
        Object term6844 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term6859 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term6862 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term6866 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term6869 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term6896 = (Object[]) newArray("com.loomcom.symon.devices.Device", 2);
        Object term6905 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term6920 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term6923 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term6925 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term6928 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term6936 = (Object[]) newArray("com.loomcom.symon.devices.Device", 9);
        Object term6937 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term6945 = (int[]) newIntArray(2);
        int[] term6948 = (int[]) newIntArray(2);
        Object[] term6970 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        setIntField(term6822, term6822.getClass(), "horizontalDisplayed", 1713573821);
        setIntField(term6822, term6822.getClass(), "verticalDisplayed", 1956590498);
        setIntField(term6822, term6822.getClass(), "scanLinesPerRow", 1467356494);
        setIntField(term6822, term6822.getClass(), "cursorStartLine", -26316536);
        setBooleanField(term6822, term6822.getClass(), "cursorEnabled", false);
        setIntField(term6822, term6822.getClass(), "cursorBlinkRate", 1716165145);
        setIntField(term6822, term6822.getClass(), "cursorStopLine", 1692937831);
        setIntField(term6822, term6822.getClass(), "startAddress", -1539747985);
        setIntField(term6822, term6822.getClass(), "cursorPosition", -1982489643);
        setIntField(term6822, term6822.getClass(), "pageSize", 550892835);
        setIntField(term6822, term6822.getClass(), "currentRegister", 1237549886);
        setBooleanField(term6822, term6822.getClass(), "rowColumnAddressing", false);
        setBooleanField(term6822, term6822.getClass(), "displayEnableSkew", false);
        setBooleanField(term6822, term6822.getClass(), "cursorSkew", false);
        setBooleanField(term6837, term6837.getClass(), "readOnly", true);
        setIntElement(term6839, 0, -1945635750);
        setIntElement(term6839, 1, -1622760744);
        setIntElement(term6839, 2, 2068435279);
        setField(term6837, term6837.getClass(), "mem", term6839);
        setIntField(term6837, term6837.getClass(), "size", 895255351);
        setIntField(term6844, term6844.getClass(), "startAddress", -1317044799);
        setIntField(term6844, term6844.getClass(), "endAddress", -1428063820);
        setField(term6837, term6837.getClass(), "memoryRange", term6844);
        setField(term6837, term6837.getClass(), "name", "TEParAifyi");
        setIntField(term6859, term6859.getClass(), "startAddress", -1271375703);
        setIntField(term6859, term6859.getClass(), "endAddress", 1136208236);
        setLongField(term6862, term6862.getClass(), "clockPeriodInNs", 1000L);
        setField(term6862, term6862.getClass(), "behavior", enum15);
        setIntField(term6866, term6866.getClass(), "startAddress", -1220630391);
        setIntField(term6866, term6866.getClass(), "endAddress", -995822131);
        setField(term6866, term6866.getClass(), "cpu", null);
        setField(term6866, term6866.getClass(), "deviceMap", null);
        setField(term6866, term6866.getClass(), "deviceAddressArray", null);
        setField(term6862, term6862.getClass(), "bus", term6866);
        setIntField(term6869, term6869.getClass(), "a", 0);
        setIntField(term6869, term6869.getClass(), "x", 0);
        setIntField(term6869, term6869.getClass(), "y", 0);
        setIntField(term6869, term6869.getClass(), "sp", 0);
        setIntField(term6869, term6869.getClass(), "pc", 0);
        setIntField(term6869, term6869.getClass(), "ir", 0);
        setIntField(term6869, term6869.getClass(), "nextIr", 0);
        setField(term6869, term6869.getClass(), "args", null);
        setField(term6869, term6869.getClass(), "nextArgs", null);
        setIntField(term6869, term6869.getClass(), "instSize", 0);
        setBooleanField(term6869, term6869.getClass(), "opTrap", false);
        setBooleanField(term6869, term6869.getClass(), "irqAsserted", false);
        setBooleanField(term6869, term6869.getClass(), "nmiAsserted", false);
        setIntField(term6869, term6869.getClass(), "lastPc", 0);
        setBooleanField(term6869, term6869.getClass(), "carryFlag", false);
        setBooleanField(term6869, term6869.getClass(), "negativeFlag", false);
        setBooleanField(term6869, term6869.getClass(), "zeroFlag", false);
        setBooleanField(term6869, term6869.getClass(), "irqDisableFlag", false);
        setBooleanField(term6869, term6869.getClass(), "decimalModeFlag", false);
        setBooleanField(term6869, term6869.getClass(), "breakFlag", false);
        setBooleanField(term6869, term6869.getClass(), "overflowFlag", false);
        setLongField(term6869, term6869.getClass(), "stepCounter", 0L);
        setField(term6862, term6862.getClass(), "state", term6869);
        setLongField(term6862, term6862.getClass(), "opBeginTime", 6689117472719450333L);
        setField(term6859, term6859.getClass(), "cpu", term6862);
        setField(term6859, term6859.getClass(), "deviceMap", term6891);
        setField(term6859, term6859.getClass(), "deviceAddressArray", term6896);
        setField(term6837, term6837.getClass(), "bus", term6859);
        setField(term6837, term6837.getClass(), "deviceChangeListeners", term6897);
        setField(term6822, term6822.getClass(), "memory", term6837);
        setIntField(term6822, term6822.getClass(), "size", 40571662);
        setIntField(term6905, term6905.getClass(), "startAddress", 1863910269);
        setIntField(term6905, term6905.getClass(), "endAddress", 864645689);
        setField(term6822, term6822.getClass(), "memoryRange", term6905);
        setField(term6822, term6822.getClass(), "name", "OWDIEULEFu");
        setIntField(term6920, term6920.getClass(), "startAddress", 279384872);
        setIntField(term6920, term6920.getClass(), "endAddress", 1427305953);
        setLongField(term6923, term6923.getClass(), "clockPeriodInNs", 1000L);
        setField(term6923, term6923.getClass(), "behavior", enum15);
        setIntField(term6925, term6925.getClass(), "startAddress", -781832877);
        setIntField(term6925, term6925.getClass(), "endAddress", 797203987);
        setLongField(term6928, term6928.getClass(), "clockPeriodInNs", 1000L);
        setField(term6928, term6928.getClass(), "behavior", enum15);
        setField(term6928, term6928.getClass(), "bus", null);
        setField(term6928, term6928.getClass(), "state", null);
        setLongField(term6928, term6928.getClass(), "opBeginTime", -2177368829816872572L);
        setField(term6925, term6925.getClass(), "cpu", term6928);
        setField(term6925, term6925.getClass(), "deviceMap", term6931);
        setField(term6925, term6925.getClass(), "deviceAddressArray", term6936);
        setField(term6923, term6923.getClass(), "bus", term6925);
        setIntField(term6937, term6937.getClass(), "a", 0);
        setIntField(term6937, term6937.getClass(), "x", 0);
        setIntField(term6937, term6937.getClass(), "y", 0);
        setIntField(term6937, term6937.getClass(), "sp", 0);
        setIntField(term6937, term6937.getClass(), "pc", 0);
        setIntField(term6937, term6937.getClass(), "ir", 0);
        setIntField(term6937, term6937.getClass(), "nextIr", 0);
        setField(term6937, term6937.getClass(), "args", term6945);
        setField(term6937, term6937.getClass(), "nextArgs", term6948);
        setIntField(term6937, term6937.getClass(), "instSize", 0);
        setBooleanField(term6937, term6937.getClass(), "opTrap", false);
        setBooleanField(term6937, term6937.getClass(), "irqAsserted", false);
        setBooleanField(term6937, term6937.getClass(), "nmiAsserted", false);
        setIntField(term6937, term6937.getClass(), "lastPc", 0);
        setBooleanField(term6937, term6937.getClass(), "carryFlag", false);
        setBooleanField(term6937, term6937.getClass(), "negativeFlag", false);
        setBooleanField(term6937, term6937.getClass(), "zeroFlag", false);
        setBooleanField(term6937, term6937.getClass(), "irqDisableFlag", false);
        setBooleanField(term6937, term6937.getClass(), "decimalModeFlag", false);
        setBooleanField(term6937, term6937.getClass(), "breakFlag", false);
        setBooleanField(term6937, term6937.getClass(), "overflowFlag", false);
        setLongField(term6937, term6937.getClass(), "stepCounter", 0L);
        setField(term6923, term6923.getClass(), "state", term6937);
        setLongField(term6923, term6923.getClass(), "opBeginTime", -8463029266761149071L);
        setField(term6920, term6920.getClass(), "cpu", term6923);
        setField(term6920, term6920.getClass(), "deviceMap", term6965);
        setField(term6920, term6920.getClass(), "deviceAddressArray", term6970);
        setField(term6822, term6822.getClass(), "bus", term6920);
        setField(term6822, term6822.getClass(), "deviceChangeListeners", term6971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRowColumnAddressing", argTypes, term6822, args);
    }

};


