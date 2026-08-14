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

public class Crtc_getCursorPosition_100355299413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5884;

    public Crtc_getCursorPosition_100355299413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6067 = Class.forName((String) "com.loomcom.symon.InstructionTable$CpuBehavior");
        Field term6066 = ((Class) term6067).getDeclaredField((String) "CMOS_65816");
        ((Field) term6066).setAccessible(true);
        Object enum13 = ((Field) term6066).get((Object) null);
        HashMap term5959 = new HashMap();
        HashMap term5966 = new HashMap();
        Set<Object> term6333 =  ((Map) term5966).keySet();
        HashSet term5965 = new HashSet((Collection<? extends Object>) term6333);
        HashMap term5998 = new HashMap();
        HashMap term6032 = new HashMap();
        HashMap term6039 = new HashMap();
        Set<Object> term6348 =  ((Map) term6039).keySet();
        HashSet term6038 = new HashSet((Collection<? extends Object>) term6348);
        term5884 = newInstance(Class.forName("com.loomcom.symon.devices.Crtc"));
        Object term5899 = newInstance(Class.forName("com.loomcom.symon.devices.Memory"));
        int[] term5901 = (int[]) newIntArray(9);
        Object term5912 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term5927 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term5930 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term5934 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term5937 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        Object[] term5964 = (Object[]) newArray("com.loomcom.symon.devices.Device", 3);
        Object term5972 = newInstance(Class.forName("com.loomcom.symon.MemoryRange"));
        Object term5987 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term5990 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object term5992 = newInstance(Class.forName("com.loomcom.symon.Bus"));
        Object term5995 = newInstance(Class.forName("com.loomcom.symon.Cpu"));
        Object[] term6003 = (Object[]) newArray("com.loomcom.symon.devices.Device", 4);
        Object term6004 = newInstance(Class.forName("com.loomcom.symon.CpuState"));
        int[] term6012 = (int[]) newIntArray(2);
        int[] term6015 = (int[]) newIntArray(2);
        Object[] term6037 = (Object[]) newArray("com.loomcom.symon.devices.Device", 1);
        setIntField(term5884, term5884.getClass(), "horizontalDisplayed", 91958879);
        setIntField(term5884, term5884.getClass(), "verticalDisplayed", -645429025);
        setIntField(term5884, term5884.getClass(), "scanLinesPerRow", -688213483);
        setIntField(term5884, term5884.getClass(), "cursorStartLine", 644154104);
        setBooleanField(term5884, term5884.getClass(), "cursorEnabled", true);
        setIntField(term5884, term5884.getClass(), "cursorBlinkRate", 76650923);
        setIntField(term5884, term5884.getClass(), "cursorStopLine", 1003743923);
        setIntField(term5884, term5884.getClass(), "startAddress", 1887772522);
        setIntField(term5884, term5884.getClass(), "cursorPosition", 354196060);
        setIntField(term5884, term5884.getClass(), "pageSize", -1840305774);
        setIntField(term5884, term5884.getClass(), "currentRegister", 1365087144);
        setBooleanField(term5884, term5884.getClass(), "rowColumnAddressing", true);
        setBooleanField(term5884, term5884.getClass(), "displayEnableSkew", false);
        setBooleanField(term5884, term5884.getClass(), "cursorSkew", false);
        setBooleanField(term5899, term5899.getClass(), "readOnly", true);
        setIntElement(term5901, 0, -1537255112);
        setIntElement(term5901, 1, 934477462);
        setIntElement(term5901, 2, 4900410);
        setIntElement(term5901, 3, -1252345779);
        setIntElement(term5901, 4, -2063365430);
        setIntElement(term5901, 5, 812570053);
        setIntElement(term5901, 6, -1488938905);
        setIntElement(term5901, 7, 1916544127);
        setIntElement(term5901, 8, -1133405894);
        setField(term5899, term5899.getClass(), "mem", term5901);
        setIntField(term5899, term5899.getClass(), "size", 243280944);
        setIntField(term5912, term5912.getClass(), "startAddress", -726681073);
        setIntField(term5912, term5912.getClass(), "endAddress", -1724487863);
        setField(term5899, term5899.getClass(), "memoryRange", term5912);
        setField(term5899, term5899.getClass(), "name", "vrQLuWIDJX");
        setIntField(term5927, term5927.getClass(), "startAddress", -128490829);
        setIntField(term5927, term5927.getClass(), "endAddress", 202214133);
        setLongField(term5930, term5930.getClass(), "clockPeriodInNs", 1000L);
        setField(term5930, term5930.getClass(), "behavior", enum13);
        setIntField(term5934, term5934.getClass(), "startAddress", 1543091617);
        setIntField(term5934, term5934.getClass(), "endAddress", -763166094);
        setField(term5934, term5934.getClass(), "cpu", null);
        setField(term5934, term5934.getClass(), "deviceMap", null);
        setField(term5934, term5934.getClass(), "deviceAddressArray", null);
        setField(term5930, term5930.getClass(), "bus", term5934);
        setIntField(term5937, term5937.getClass(), "a", 0);
        setIntField(term5937, term5937.getClass(), "x", 0);
        setIntField(term5937, term5937.getClass(), "y", 0);
        setIntField(term5937, term5937.getClass(), "sp", 0);
        setIntField(term5937, term5937.getClass(), "pc", 0);
        setIntField(term5937, term5937.getClass(), "ir", 0);
        setIntField(term5937, term5937.getClass(), "nextIr", 0);
        setField(term5937, term5937.getClass(), "args", null);
        setField(term5937, term5937.getClass(), "nextArgs", null);
        setIntField(term5937, term5937.getClass(), "instSize", 0);
        setBooleanField(term5937, term5937.getClass(), "opTrap", false);
        setBooleanField(term5937, term5937.getClass(), "irqAsserted", false);
        setBooleanField(term5937, term5937.getClass(), "nmiAsserted", false);
        setIntField(term5937, term5937.getClass(), "lastPc", 0);
        setBooleanField(term5937, term5937.getClass(), "carryFlag", false);
        setBooleanField(term5937, term5937.getClass(), "negativeFlag", false);
        setBooleanField(term5937, term5937.getClass(), "zeroFlag", false);
        setBooleanField(term5937, term5937.getClass(), "irqDisableFlag", false);
        setBooleanField(term5937, term5937.getClass(), "decimalModeFlag", false);
        setBooleanField(term5937, term5937.getClass(), "breakFlag", false);
        setBooleanField(term5937, term5937.getClass(), "overflowFlag", false);
        setLongField(term5937, term5937.getClass(), "stepCounter", 0L);
        setField(term5930, term5930.getClass(), "state", term5937);
        setLongField(term5930, term5930.getClass(), "opBeginTime", 7862575738391801707L);
        setField(term5927, term5927.getClass(), "cpu", term5930);
        setField(term5927, term5927.getClass(), "deviceMap", term5959);
        setField(term5927, term5927.getClass(), "deviceAddressArray", term5964);
        setField(term5899, term5899.getClass(), "bus", term5927);
        setField(term5899, term5899.getClass(), "deviceChangeListeners", term5965);
        setField(term5884, term5884.getClass(), "memory", term5899);
        setIntField(term5884, term5884.getClass(), "size", -1549607466);
        setIntField(term5972, term5972.getClass(), "startAddress", 853609788);
        setIntField(term5972, term5972.getClass(), "endAddress", -197820800);
        setField(term5884, term5884.getClass(), "memoryRange", term5972);
        setField(term5884, term5884.getClass(), "name", "flxyYxBRtu");
        setIntField(term5987, term5987.getClass(), "startAddress", 723812297);
        setIntField(term5987, term5987.getClass(), "endAddress", 1639448749);
        setLongField(term5990, term5990.getClass(), "clockPeriodInNs", 1000L);
        setField(term5990, term5990.getClass(), "behavior", enum13);
        setIntField(term5992, term5992.getClass(), "startAddress", 873659088);
        setIntField(term5992, term5992.getClass(), "endAddress", -975748721);
        setLongField(term5995, term5995.getClass(), "clockPeriodInNs", 1000L);
        setField(term5995, term5995.getClass(), "behavior", enum13);
        setField(term5995, term5995.getClass(), "bus", null);
        setField(term5995, term5995.getClass(), "state", null);
        setLongField(term5995, term5995.getClass(), "opBeginTime", 5510783420697225605L);
        setField(term5992, term5992.getClass(), "cpu", term5995);
        setField(term5992, term5992.getClass(), "deviceMap", term5998);
        setField(term5992, term5992.getClass(), "deviceAddressArray", term6003);
        setField(term5990, term5990.getClass(), "bus", term5992);
        setIntField(term6004, term6004.getClass(), "a", 0);
        setIntField(term6004, term6004.getClass(), "x", 0);
        setIntField(term6004, term6004.getClass(), "y", 0);
        setIntField(term6004, term6004.getClass(), "sp", 0);
        setIntField(term6004, term6004.getClass(), "pc", 0);
        setIntField(term6004, term6004.getClass(), "ir", 0);
        setIntField(term6004, term6004.getClass(), "nextIr", 0);
        setField(term6004, term6004.getClass(), "args", term6012);
        setField(term6004, term6004.getClass(), "nextArgs", term6015);
        setIntField(term6004, term6004.getClass(), "instSize", 0);
        setBooleanField(term6004, term6004.getClass(), "opTrap", false);
        setBooleanField(term6004, term6004.getClass(), "irqAsserted", false);
        setBooleanField(term6004, term6004.getClass(), "nmiAsserted", false);
        setIntField(term6004, term6004.getClass(), "lastPc", 0);
        setBooleanField(term6004, term6004.getClass(), "carryFlag", false);
        setBooleanField(term6004, term6004.getClass(), "negativeFlag", false);
        setBooleanField(term6004, term6004.getClass(), "zeroFlag", false);
        setBooleanField(term6004, term6004.getClass(), "irqDisableFlag", false);
        setBooleanField(term6004, term6004.getClass(), "decimalModeFlag", false);
        setBooleanField(term6004, term6004.getClass(), "breakFlag", false);
        setBooleanField(term6004, term6004.getClass(), "overflowFlag", false);
        setLongField(term6004, term6004.getClass(), "stepCounter", 0L);
        setField(term5990, term5990.getClass(), "state", term6004);
        setLongField(term5990, term5990.getClass(), "opBeginTime", 6005241913654469005L);
        setField(term5987, term5987.getClass(), "cpu", term5990);
        setField(term5987, term5987.getClass(), "deviceMap", term6032);
        setField(term5987, term5987.getClass(), "deviceAddressArray", term6037);
        setField(term5884, term5884.getClass(), "bus", term5987);
        setField(term5884, term5884.getClass(), "deviceChangeListeners", term6038);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.loomcom.symon.devices.Crtc");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCursorPosition", argTypes, term5884, args);
    }

};


