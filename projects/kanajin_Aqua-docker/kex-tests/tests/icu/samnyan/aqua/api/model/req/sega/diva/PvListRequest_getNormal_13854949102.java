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

public class PvListRequest_getNormal_13854949102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401210;

    public PvListRequest_getNormal_13854949102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term401223 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401227 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401228 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401223, term401223.getClass(), "PVID", -751435012);
        setIntField(term401223, term401223.getClass(), "Version", -710681946);
        setIntField(term401223, term401223.getClass(), "Edition", 46167149);
        setField(term401227, term401227.getClass(), "Start", null);
        setField(term401227, term401227.getClass(), "End", null);
        setField(term401223, term401223.getClass(), "AdvDemo", term401227);
        setField(term401228, term401228.getClass(), "Start", null);
        setField(term401228, term401228.getClass(), "End", null);
        setField(term401223, term401223.getClass(), "Playable", term401228);
        ArrayList term401221 = new ArrayList();
        ((ArrayList) term401221).add(term401223);
        Object term401233 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401237 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401238 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401233, term401233.getClass(), "PVID", 575162096);
        setIntField(term401233, term401233.getClass(), "Version", 1062603049);
        setIntField(term401233, term401233.getClass(), "Edition", 756092801);
        setField(term401237, term401237.getClass(), "Start", null);
        setField(term401237, term401237.getClass(), "End", null);
        setField(term401233, term401233.getClass(), "AdvDemo", term401237);
        setField(term401238, term401238.getClass(), "Start", null);
        setField(term401238, term401238.getClass(), "End", null);
        setField(term401233, term401233.getClass(), "Playable", term401238);
        Object term401239 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401243 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401244 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401239, term401239.getClass(), "PVID", -975877618);
        setIntField(term401239, term401239.getClass(), "Version", -749214182);
        setIntField(term401239, term401239.getClass(), "Edition", -1950733287);
        setField(term401243, term401243.getClass(), "Start", null);
        setField(term401243, term401243.getClass(), "End", null);
        setField(term401239, term401239.getClass(), "AdvDemo", term401243);
        setField(term401244, term401244.getClass(), "Start", null);
        setField(term401244, term401244.getClass(), "End", null);
        setField(term401239, term401239.getClass(), "Playable", term401244);
        ArrayList term401231 = new ArrayList();
        ((ArrayList) term401231).add(term401233);
        ((ArrayList) term401231).add(term401239);
        Object term401249 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401253 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401254 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401249, term401249.getClass(), "PVID", 321232515);
        setIntField(term401249, term401249.getClass(), "Version", 1124516383);
        setIntField(term401249, term401249.getClass(), "Edition", 125952072);
        setField(term401253, term401253.getClass(), "Start", null);
        setField(term401253, term401253.getClass(), "End", null);
        setField(term401249, term401249.getClass(), "AdvDemo", term401253);
        setField(term401254, term401254.getClass(), "Start", null);
        setField(term401254, term401254.getClass(), "End", null);
        setField(term401249, term401249.getClass(), "Playable", term401254);
        Object term401255 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401259 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401260 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401255, term401255.getClass(), "PVID", 1926318122);
        setIntField(term401255, term401255.getClass(), "Version", -137346641);
        setIntField(term401255, term401255.getClass(), "Edition", 520381821);
        setField(term401259, term401259.getClass(), "Start", null);
        setField(term401259, term401259.getClass(), "End", null);
        setField(term401255, term401255.getClass(), "AdvDemo", term401259);
        setField(term401260, term401260.getClass(), "Start", null);
        setField(term401260, term401260.getClass(), "End", null);
        setField(term401255, term401255.getClass(), "Playable", term401260);
        Object term401261 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401261, term401261.getClass(), "PVID", -366340003);
        setIntField(term401261, term401261.getClass(), "Version", 1186635163);
        setIntField(term401261, term401261.getClass(), "Edition", -1042848183);
        setField(term401261, term401261.getClass(), "AdvDemo", term401254);
        setField(term401261, term401261.getClass(), "Playable", term401259);
        Object term401265 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401265, term401265.getClass(), "PVID", 1475712442);
        setIntField(term401265, term401265.getClass(), "Version", -1610248728);
        setIntField(term401265, term401265.getClass(), "Edition", 1865180038);
        setField(term401265, term401265.getClass(), "AdvDemo", term401227);
        setField(term401265, term401265.getClass(), "Playable", term401244);
        ArrayList term401247 = new ArrayList();
        ((ArrayList) term401247).add(term401249);
        ((ArrayList) term401247).add(term401255);
        ((ArrayList) term401247).add(term401261);
        ((ArrayList) term401247).add(term401265);
        Object term401273 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401273, term401273.getClass(), "PVID", -1560480068);
        setIntField(term401273, term401273.getClass(), "Version", -1773577424);
        setIntField(term401273, term401273.getClass(), "Edition", -1255468119);
        setField(term401273, term401273.getClass(), "AdvDemo", term401238);
        setField(term401273, term401273.getClass(), "Playable", term401228);
        Object term401277 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401277, term401277.getClass(), "PVID", 71046669);
        setIntField(term401277, term401277.getClass(), "Version", 628776638);
        setIntField(term401277, term401277.getClass(), "Edition", 1600946264);
        setField(term401277, term401277.getClass(), "AdvDemo", term401228);
        setField(term401277, term401277.getClass(), "Playable", term401260);
        Object term401281 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401281, term401281.getClass(), "PVID", 1520069204);
        setIntField(term401281, term401281.getClass(), "Version", 127988692);
        setIntField(term401281, term401281.getClass(), "Edition", -1997132367);
        setField(term401281, term401281.getClass(), "AdvDemo", term401254);
        setField(term401281, term401281.getClass(), "Playable", term401254);
        ArrayList term401271 = new ArrayList();
        ((ArrayList) term401271).add(term401273);
        ((ArrayList) term401271).add(term401277);
        ((ArrayList) term401271).add(term401281);
        term401210 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term401211 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401212 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401216 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term401212, term401212.getClass(), "year", 2019);
        setShortField(term401212, term401212.getClass(), "month", (short) 12);
        setShortField(term401212, term401212.getClass(), "day", (short) 20);
        setField(term401211, term401211.getClass(), "date", term401212);
        setByteField(term401216, term401216.getClass(), "hour", (byte) 8);
        setByteField(term401216, term401216.getClass(), "minute", (byte) 26);
        setByteField(term401216, term401216.getClass(), "second", (byte) 12);
        setIntField(term401216, term401216.getClass(), "nano", 736997895);
        setField(term401211, term401211.getClass(), "time", term401216);
        setField(term401210, term401210.getClass(), "CreationDate", term401211);
        setField(term401210, term401210.getClass(), "Easy", term401221);
        setField(term401210, term401210.getClass(), "Normal", term401231);
        setField(term401210, term401210.getClass(), "Hard", term401247);
        setField(term401210, term401210.getClass(), "Extreme", term401271);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNormal", argTypes, term401210, args);
    }

};


