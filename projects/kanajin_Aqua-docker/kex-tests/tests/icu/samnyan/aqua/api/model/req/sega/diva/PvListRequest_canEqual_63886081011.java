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

public class PvListRequest_canEqual_63886081011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4091236;
     Object term4091313;

    public PvListRequest_canEqual_63886081011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4091249 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091253 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091254 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091249, term4091249.getClass(), "PVID", -1136346292);
        setIntField(term4091249, term4091249.getClass(), "Version", 1768540145);
        setIntField(term4091249, term4091249.getClass(), "Edition", 1296017547);
        setField(term4091253, term4091253.getClass(), "Start", null);
        setField(term4091253, term4091253.getClass(), "End", null);
        setField(term4091249, term4091249.getClass(), "AdvDemo", term4091253);
        setField(term4091254, term4091254.getClass(), "Start", null);
        setField(term4091254, term4091254.getClass(), "End", null);
        setField(term4091249, term4091249.getClass(), "Playable", term4091254);
        Object term4091255 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091259 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091260 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091255, term4091255.getClass(), "PVID", -953210787);
        setIntField(term4091255, term4091255.getClass(), "Version", 498516702);
        setIntField(term4091255, term4091255.getClass(), "Edition", 1364323753);
        setField(term4091259, term4091259.getClass(), "Start", null);
        setField(term4091259, term4091259.getClass(), "End", null);
        setField(term4091255, term4091255.getClass(), "AdvDemo", term4091259);
        setField(term4091260, term4091260.getClass(), "Start", null);
        setField(term4091260, term4091260.getClass(), "End", null);
        setField(term4091255, term4091255.getClass(), "Playable", term4091260);
        ArrayList term4091247 = new ArrayList();
        ((ArrayList) term4091247).add(term4091249);
        ((ArrayList) term4091247).add(term4091255);
        Object term4091265 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091269 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091270 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091265, term4091265.getClass(), "PVID", -1070368359);
        setIntField(term4091265, term4091265.getClass(), "Version", 987787376);
        setIntField(term4091265, term4091265.getClass(), "Edition", 185379426);
        setField(term4091269, term4091269.getClass(), "Start", null);
        setField(term4091269, term4091269.getClass(), "End", null);
        setField(term4091265, term4091265.getClass(), "AdvDemo", term4091269);
        setField(term4091270, term4091270.getClass(), "Start", null);
        setField(term4091270, term4091270.getClass(), "End", null);
        setField(term4091265, term4091265.getClass(), "Playable", term4091270);
        Object term4091271 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091275 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091276 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091271, term4091271.getClass(), "PVID", -327202754);
        setIntField(term4091271, term4091271.getClass(), "Version", -400805611);
        setIntField(term4091271, term4091271.getClass(), "Edition", 12305505);
        setField(term4091275, term4091275.getClass(), "Start", null);
        setField(term4091275, term4091275.getClass(), "End", null);
        setField(term4091271, term4091271.getClass(), "AdvDemo", term4091275);
        setField(term4091276, term4091276.getClass(), "Start", null);
        setField(term4091276, term4091276.getClass(), "End", null);
        setField(term4091271, term4091271.getClass(), "Playable", term4091276);
        Object term4091277 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term4091281 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term4091282 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term4091277, term4091277.getClass(), "PVID", 921811852);
        setIntField(term4091277, term4091277.getClass(), "Version", 1401136366);
        setIntField(term4091277, term4091277.getClass(), "Edition", 1953337853);
        setField(term4091281, term4091281.getClass(), "Start", null);
        setField(term4091281, term4091281.getClass(), "End", null);
        setField(term4091277, term4091277.getClass(), "AdvDemo", term4091281);
        setField(term4091282, term4091282.getClass(), "Start", null);
        setField(term4091282, term4091282.getClass(), "End", null);
        setField(term4091277, term4091277.getClass(), "Playable", term4091282);
        Object term4091283 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091283, term4091283.getClass(), "PVID", -1203356794);
        setIntField(term4091283, term4091283.getClass(), "Version", 334256333);
        setIntField(term4091283, term4091283.getClass(), "Edition", 1954445982);
        setField(term4091283, term4091283.getClass(), "AdvDemo", term4091276);
        setField(term4091283, term4091283.getClass(), "Playable", term4091281);
        Object term4091287 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091287, term4091287.getClass(), "PVID", -133701883);
        setIntField(term4091287, term4091287.getClass(), "Version", 1484262225);
        setIntField(term4091287, term4091287.getClass(), "Edition", -1571265324);
        setField(term4091287, term4091287.getClass(), "AdvDemo", term4091253);
        setField(term4091287, term4091287.getClass(), "Playable", term4091270);
        ArrayList term4091263 = new ArrayList();
        ((ArrayList) term4091263).add(term4091265);
        ((ArrayList) term4091263).add(term4091271);
        ((ArrayList) term4091263).add(term4091277);
        ((ArrayList) term4091263).add(term4091283);
        ((ArrayList) term4091263).add(term4091287);
        Object term4091295 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091295, term4091295.getClass(), "PVID", -1519676146);
        setIntField(term4091295, term4091295.getClass(), "Version", -831031365);
        setIntField(term4091295, term4091295.getClass(), "Edition", 137414557);
        setField(term4091295, term4091295.getClass(), "AdvDemo", term4091260);
        setField(term4091295, term4091295.getClass(), "Playable", term4091254);
        Object term4091299 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091299, term4091299.getClass(), "PVID", 824319575);
        setIntField(term4091299, term4091299.getClass(), "Version", 634699597);
        setIntField(term4091299, term4091299.getClass(), "Edition", -1364286485);
        setField(term4091299, term4091299.getClass(), "AdvDemo", term4091254);
        setField(term4091299, term4091299.getClass(), "Playable", term4091282);
        ArrayList term4091293 = new ArrayList();
        ((ArrayList) term4091293).add(term4091295);
        ((ArrayList) term4091293).add(term4091299);
        Object term4091307 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term4091307, term4091307.getClass(), "PVID", -1136733109);
        setIntField(term4091307, term4091307.getClass(), "Version", 1668051986);
        setIntField(term4091307, term4091307.getClass(), "Edition", -506519185);
        setField(term4091307, term4091307.getClass(), "AdvDemo", term4091276);
        setField(term4091307, term4091307.getClass(), "Playable", term4091276);
        ArrayList term4091305 = new ArrayList();
        ((ArrayList) term4091305).add(term4091307);
        term4091236 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term4091237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4091238 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4091242 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term4091238, term4091238.getClass(), "year", 2026);
        setShortField(term4091238, term4091238.getClass(), "month", (short) 5);
        setShortField(term4091238, term4091238.getClass(), "day", (short) 3);
        setField(term4091237, term4091237.getClass(), "date", term4091238);
        setByteField(term4091242, term4091242.getClass(), "hour", (byte) 11);
        setByteField(term4091242, term4091242.getClass(), "minute", (byte) 13);
        setByteField(term4091242, term4091242.getClass(), "second", (byte) 47);
        setIntField(term4091242, term4091242.getClass(), "nano", 785978614);
        setField(term4091237, term4091237.getClass(), "time", term4091242);
        setField(term4091236, term4091236.getClass(), "CreationDate", term4091237);
        setField(term4091236, term4091236.getClass(), "Easy", term4091247);
        setField(term4091236, term4091236.getClass(), "Normal", term4091263);
        setField(term4091236, term4091236.getClass(), "Hard", term4091293);
        setField(term4091236, term4091236.getClass(), "Extreme", term4091305);
        term4091313 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4091313;
        callMethod(klass, "canEqual", argTypes, term4091236, args);
    }

};


