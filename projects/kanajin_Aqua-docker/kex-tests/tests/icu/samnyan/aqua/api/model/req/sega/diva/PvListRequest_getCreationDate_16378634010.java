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

public class PvListRequest_getCreationDate_16378634010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401060;

    public PvListRequest_getCreationDate_16378634010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term401071 = new ArrayList();
        Object term401077 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401081 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401082 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401077, term401077.getClass(), "PVID", 1304859533);
        setIntField(term401077, term401077.getClass(), "Version", 580357488);
        setIntField(term401077, term401077.getClass(), "Edition", 1777493917);
        setField(term401081, term401081.getClass(), "Start", null);
        setField(term401081, term401081.getClass(), "End", null);
        setField(term401077, term401077.getClass(), "AdvDemo", term401081);
        setField(term401082, term401082.getClass(), "Start", null);
        setField(term401082, term401082.getClass(), "End", null);
        setField(term401077, term401077.getClass(), "Playable", term401082);
        Object term401083 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401087 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401088 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401083, term401083.getClass(), "PVID", -1808853565);
        setIntField(term401083, term401083.getClass(), "Version", -620444372);
        setIntField(term401083, term401083.getClass(), "Edition", -265207654);
        setField(term401087, term401087.getClass(), "Start", null);
        setField(term401087, term401087.getClass(), "End", null);
        setField(term401083, term401083.getClass(), "AdvDemo", term401087);
        setField(term401088, term401088.getClass(), "Start", null);
        setField(term401088, term401088.getClass(), "End", null);
        setField(term401083, term401083.getClass(), "Playable", term401088);
        Object term401089 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401093 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401094 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401089, term401089.getClass(), "PVID", 435990033);
        setIntField(term401089, term401089.getClass(), "Version", -746833105);
        setIntField(term401089, term401089.getClass(), "Edition", 1014384031);
        setField(term401093, term401093.getClass(), "Start", null);
        setField(term401093, term401093.getClass(), "End", null);
        setField(term401089, term401089.getClass(), "AdvDemo", term401093);
        setField(term401094, term401094.getClass(), "Start", null);
        setField(term401094, term401094.getClass(), "End", null);
        setField(term401089, term401089.getClass(), "Playable", term401094);
        Object term401095 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401099 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401100 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401095, term401095.getClass(), "PVID", -308806431);
        setIntField(term401095, term401095.getClass(), "Version", -1116163849);
        setIntField(term401095, term401095.getClass(), "Edition", -373199725);
        setField(term401099, term401099.getClass(), "Start", null);
        setField(term401099, term401099.getClass(), "End", null);
        setField(term401095, term401095.getClass(), "AdvDemo", term401099);
        setField(term401100, term401100.getClass(), "Start", null);
        setField(term401100, term401100.getClass(), "End", null);
        setField(term401095, term401095.getClass(), "Playable", term401100);
        Object term401101 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401105 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401106 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401101, term401101.getClass(), "PVID", -796500590);
        setIntField(term401101, term401101.getClass(), "Version", -2002894264);
        setIntField(term401101, term401101.getClass(), "Edition", 1799843637);
        setField(term401105, term401105.getClass(), "Start", null);
        setField(term401105, term401105.getClass(), "End", null);
        setField(term401101, term401101.getClass(), "AdvDemo", term401105);
        setField(term401106, term401106.getClass(), "Start", null);
        setField(term401106, term401106.getClass(), "End", null);
        setField(term401101, term401101.getClass(), "Playable", term401106);
        Object term401107 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401107, term401107.getClass(), "PVID", 1684067093);
        setIntField(term401107, term401107.getClass(), "Version", 844635809);
        setIntField(term401107, term401107.getClass(), "Edition", -52823906);
        setField(term401107, term401107.getClass(), "AdvDemo", term401100);
        setField(term401107, term401107.getClass(), "Playable", term401105);
        ArrayList term401075 = new ArrayList();
        ((ArrayList) term401075).add(term401077);
        ((ArrayList) term401075).add(term401083);
        ((ArrayList) term401075).add(term401089);
        ((ArrayList) term401075).add(term401095);
        ((ArrayList) term401075).add(term401101);
        ((ArrayList) term401075).add(term401107);
        Object term401115 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401115, term401115.getClass(), "PVID", -1768115010);
        setIntField(term401115, term401115.getClass(), "Version", -1389880647);
        setIntField(term401115, term401115.getClass(), "Edition", 803150363);
        setField(term401115, term401115.getClass(), "AdvDemo", term401081);
        setField(term401115, term401115.getClass(), "Playable", term401094);
        Object term401119 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401119, term401119.getClass(), "PVID", -988915471);
        setIntField(term401119, term401119.getClass(), "Version", 1338358001);
        setIntField(term401119, term401119.getClass(), "Edition", -849364234);
        setField(term401119, term401119.getClass(), "AdvDemo", term401088);
        setField(term401119, term401119.getClass(), "Playable", term401082);
        Object term401123 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401123, term401123.getClass(), "PVID", -754565111);
        setIntField(term401123, term401123.getClass(), "Version", 2093382212);
        setIntField(term401123, term401123.getClass(), "Edition", -78594242);
        setField(term401123, term401123.getClass(), "AdvDemo", term401082);
        setField(term401123, term401123.getClass(), "Playable", term401106);
        Object term401127 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401127, term401127.getClass(), "PVID", 1395504262);
        setIntField(term401127, term401127.getClass(), "Version", -1699272082);
        setIntField(term401127, term401127.getClass(), "Edition", 280982911);
        setField(term401127, term401127.getClass(), "AdvDemo", term401100);
        setField(term401127, term401127.getClass(), "Playable", term401100);
        ArrayList term401113 = new ArrayList();
        ((ArrayList) term401113).add(term401115);
        ((ArrayList) term401113).add(term401119);
        ((ArrayList) term401113).add(term401123);
        ((ArrayList) term401113).add(term401127);
        ((ArrayList) term401113).add(term401101);
        ArrayList term401133 = new ArrayList();
        ((ArrayList) term401133).add(term401127);
        ((ArrayList) term401133).add(term401119);
        ((ArrayList) term401133).add(term401107);
        ((ArrayList) term401133).add(term401089);
        ((ArrayList) term401133).add(term401101);
        term401060 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term401061 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401062 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401066 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term401062, term401062.getClass(), "year", 2022);
        setShortField(term401062, term401062.getClass(), "month", (short) 7);
        setShortField(term401062, term401062.getClass(), "day", (short) 14);
        setField(term401061, term401061.getClass(), "date", term401062);
        setByteField(term401066, term401066.getClass(), "hour", (byte) 16);
        setByteField(term401066, term401066.getClass(), "minute", (byte) 56);
        setByteField(term401066, term401066.getClass(), "second", (byte) 23);
        setIntField(term401066, term401066.getClass(), "nano", 429067728);
        setField(term401061, term401061.getClass(), "time", term401066);
        setField(term401060, term401060.getClass(), "CreationDate", term401061);
        setField(term401060, term401060.getClass(), "Easy", term401071);
        setField(term401060, term401060.getClass(), "Normal", term401075);
        setField(term401060, term401060.getClass(), "Hard", term401113);
        setField(term401060, term401060.getClass(), "Extreme", term401133);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreationDate", argTypes, term401060, args);
    }

};


