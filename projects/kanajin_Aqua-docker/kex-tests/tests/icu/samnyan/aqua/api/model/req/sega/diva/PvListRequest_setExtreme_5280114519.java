package icu.samnyan.aqua.api.model.req.sega.diva;

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
import static icu.samnyan.aqua.api.model.req.sega.diva.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedList;

public class PvListRequest_setExtreme_5280114519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401820;
     Object term401889;

    public PvListRequest_setExtreme_5280114519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term401831 = new ArrayList();
        Object term401837 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401841 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401842 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401837, term401837.getClass(), "PVID", -2139303483);
        setIntField(term401837, term401837.getClass(), "Version", -398720025);
        setIntField(term401837, term401837.getClass(), "Edition", 2075651343);
        setField(term401841, term401841.getClass(), "Start", null);
        setField(term401841, term401841.getClass(), "End", null);
        setField(term401837, term401837.getClass(), "AdvDemo", term401841);
        setField(term401842, term401842.getClass(), "Start", null);
        setField(term401842, term401842.getClass(), "End", null);
        setField(term401837, term401837.getClass(), "Playable", term401842);
        ArrayList term401835 = new ArrayList();
        ((ArrayList) term401835).add(term401837);
        Object term401847 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401851 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401852 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401847, term401847.getClass(), "PVID", -248629959);
        setIntField(term401847, term401847.getClass(), "Version", 511288649);
        setIntField(term401847, term401847.getClass(), "Edition", -2053962811);
        setField(term401851, term401851.getClass(), "Start", null);
        setField(term401851, term401851.getClass(), "End", null);
        setField(term401847, term401847.getClass(), "AdvDemo", term401851);
        setField(term401852, term401852.getClass(), "Start", null);
        setField(term401852, term401852.getClass(), "End", null);
        setField(term401847, term401847.getClass(), "Playable", term401852);
        Object term401853 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401857 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401858 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401853, term401853.getClass(), "PVID", 1249266155);
        setIntField(term401853, term401853.getClass(), "Version", 1633716715);
        setIntField(term401853, term401853.getClass(), "Edition", -1708711445);
        setField(term401857, term401857.getClass(), "Start", null);
        setField(term401857, term401857.getClass(), "End", null);
        setField(term401853, term401853.getClass(), "AdvDemo", term401857);
        setField(term401858, term401858.getClass(), "Start", null);
        setField(term401858, term401858.getClass(), "End", null);
        setField(term401853, term401853.getClass(), "Playable", term401858);
        Object term401859 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401863 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401864 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401859, term401859.getClass(), "PVID", 541759246);
        setIntField(term401859, term401859.getClass(), "Version", -790408993);
        setIntField(term401859, term401859.getClass(), "Edition", -1747861124);
        setField(term401863, term401863.getClass(), "Start", null);
        setField(term401863, term401863.getClass(), "End", null);
        setField(term401859, term401859.getClass(), "AdvDemo", term401863);
        setField(term401864, term401864.getClass(), "Start", null);
        setField(term401864, term401864.getClass(), "End", null);
        setField(term401859, term401859.getClass(), "Playable", term401864);
        Object term401865 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401869 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401870 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401865, term401865.getClass(), "PVID", -941279527);
        setIntField(term401865, term401865.getClass(), "Version", 1758523168);
        setIntField(term401865, term401865.getClass(), "Edition", -294035418);
        setField(term401869, term401869.getClass(), "Start", null);
        setField(term401869, term401869.getClass(), "End", null);
        setField(term401865, term401865.getClass(), "AdvDemo", term401869);
        setField(term401870, term401870.getClass(), "Start", null);
        setField(term401870, term401870.getClass(), "End", null);
        setField(term401865, term401865.getClass(), "Playable", term401870);
        Object term401871 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401871, term401871.getClass(), "PVID", 1382893311);
        setIntField(term401871, term401871.getClass(), "Version", -298302895);
        setIntField(term401871, term401871.getClass(), "Edition", 526065862);
        setField(term401871, term401871.getClass(), "AdvDemo", term401864);
        setField(term401871, term401871.getClass(), "Playable", term401869);
        Object term401875 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401875, term401875.getClass(), "PVID", -753727966);
        setIntField(term401875, term401875.getClass(), "Version", 1036778752);
        setIntField(term401875, term401875.getClass(), "Edition", -774763931);
        setField(term401875, term401875.getClass(), "AdvDemo", term401841);
        setField(term401875, term401875.getClass(), "Playable", term401858);
        Object term401879 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401879, term401879.getClass(), "PVID", -1880676442);
        setIntField(term401879, term401879.getClass(), "Version", 1641066948);
        setIntField(term401879, term401879.getClass(), "Edition", -1045811167);
        setField(term401879, term401879.getClass(), "AdvDemo", term401852);
        setField(term401879, term401879.getClass(), "Playable", term401842);
        ArrayList term401845 = new ArrayList();
        ((ArrayList) term401845).add(term401847);
        ((ArrayList) term401845).add(term401853);
        ((ArrayList) term401845).add(term401859);
        ((ArrayList) term401845).add(term401865);
        ((ArrayList) term401845).add(term401871);
        ((ArrayList) term401845).add(term401875);
        ((ArrayList) term401845).add(term401879);
        ArrayList term401885 = new ArrayList();
        term401820 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term401821 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401822 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401826 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term401822, term401822.getClass(), "year", 2022);
        setShortField(term401822, term401822.getClass(), "month", (short) 5);
        setShortField(term401822, term401822.getClass(), "day", (short) 17);
        setField(term401821, term401821.getClass(), "date", term401822);
        setByteField(term401826, term401826.getClass(), "hour", (byte) 14);
        setByteField(term401826, term401826.getClass(), "minute", (byte) 7);
        setByteField(term401826, term401826.getClass(), "second", (byte) 21);
        setIntField(term401826, term401826.getClass(), "nano", 928817272);
        setField(term401821, term401821.getClass(), "time", term401826);
        setField(term401820, term401820.getClass(), "CreationDate", term401821);
        setField(term401820, term401820.getClass(), "Easy", term401831);
        setField(term401820, term401820.getClass(), "Normal", term401835);
        setField(term401820, term401820.getClass(), "Hard", term401845);
        setField(term401820, term401820.getClass(), "Extreme", term401885);
        term401889 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term401889;
        callMethod(klass, "setExtreme", argTypes, term401820, args);
    }

};


