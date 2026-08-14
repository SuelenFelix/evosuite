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

public class PvListRequest_getHard_17525017583 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401287;

    public PvListRequest_getHard_17525017583() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term401300 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401304 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401305 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401300, term401300.getClass(), "PVID", -965374372);
        setIntField(term401300, term401300.getClass(), "Version", 1423164308);
        setIntField(term401300, term401300.getClass(), "Edition", 1520197294);
        setField(term401304, term401304.getClass(), "Start", null);
        setField(term401304, term401304.getClass(), "End", null);
        setField(term401300, term401300.getClass(), "AdvDemo", term401304);
        setField(term401305, term401305.getClass(), "Start", null);
        setField(term401305, term401305.getClass(), "End", null);
        setField(term401300, term401300.getClass(), "Playable", term401305);
        Object term401306 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401310 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401311 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401306, term401306.getClass(), "PVID", 2068249420);
        setIntField(term401306, term401306.getClass(), "Version", 800816874);
        setIntField(term401306, term401306.getClass(), "Edition", 1849028946);
        setField(term401310, term401310.getClass(), "Start", null);
        setField(term401310, term401310.getClass(), "End", null);
        setField(term401306, term401306.getClass(), "AdvDemo", term401310);
        setField(term401311, term401311.getClass(), "Start", null);
        setField(term401311, term401311.getClass(), "End", null);
        setField(term401306, term401306.getClass(), "Playable", term401311);
        Object term401312 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401316 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401317 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401312, term401312.getClass(), "PVID", -1724181606);
        setIntField(term401312, term401312.getClass(), "Version", 946696826);
        setIntField(term401312, term401312.getClass(), "Edition", 1447376714);
        setField(term401316, term401316.getClass(), "Start", null);
        setField(term401316, term401316.getClass(), "End", null);
        setField(term401312, term401312.getClass(), "AdvDemo", term401316);
        setField(term401317, term401317.getClass(), "Start", null);
        setField(term401317, term401317.getClass(), "End", null);
        setField(term401312, term401312.getClass(), "Playable", term401317);
        Object term401318 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401322 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401323 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401318, term401318.getClass(), "PVID", -1099315914);
        setIntField(term401318, term401318.getClass(), "Version", -413307408);
        setIntField(term401318, term401318.getClass(), "Edition", 1332323970);
        setField(term401322, term401322.getClass(), "Start", null);
        setField(term401322, term401322.getClass(), "End", null);
        setField(term401318, term401318.getClass(), "AdvDemo", term401322);
        setField(term401323, term401323.getClass(), "Start", null);
        setField(term401323, term401323.getClass(), "End", null);
        setField(term401318, term401318.getClass(), "Playable", term401323);
        Object term401324 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401328 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401329 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401324, term401324.getClass(), "PVID", 2051874994);
        setIntField(term401324, term401324.getClass(), "Version", -117087123);
        setIntField(term401324, term401324.getClass(), "Edition", 1478765015);
        setField(term401328, term401328.getClass(), "Start", null);
        setField(term401328, term401328.getClass(), "End", null);
        setField(term401324, term401324.getClass(), "AdvDemo", term401328);
        setField(term401329, term401329.getClass(), "Start", null);
        setField(term401329, term401329.getClass(), "End", null);
        setField(term401324, term401324.getClass(), "Playable", term401329);
        Object term401330 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401330, term401330.getClass(), "PVID", 1026430567);
        setIntField(term401330, term401330.getClass(), "Version", -2013957671);
        setIntField(term401330, term401330.getClass(), "Edition", 238719917);
        setField(term401330, term401330.getClass(), "AdvDemo", term401323);
        setField(term401330, term401330.getClass(), "Playable", term401328);
        Object term401334 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401334, term401334.getClass(), "PVID", -2143135239);
        setIntField(term401334, term401334.getClass(), "Version", -164298095);
        setIntField(term401334, term401334.getClass(), "Edition", 33488329);
        setField(term401334, term401334.getClass(), "AdvDemo", term401304);
        setField(term401334, term401334.getClass(), "Playable", term401317);
        Object term401338 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401338, term401338.getClass(), "PVID", -594591882);
        setIntField(term401338, term401338.getClass(), "Version", 2123138170);
        setIntField(term401338, term401338.getClass(), "Edition", 1751316652);
        setField(term401338, term401338.getClass(), "AdvDemo", term401311);
        setField(term401338, term401338.getClass(), "Playable", term401305);
        Object term401342 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401342, term401342.getClass(), "PVID", -2028102663);
        setIntField(term401342, term401342.getClass(), "Version", 359646361);
        setIntField(term401342, term401342.getClass(), "Edition", 254286629);
        setField(term401342, term401342.getClass(), "AdvDemo", term401305);
        setField(term401342, term401342.getClass(), "Playable", term401329);
        ArrayList term401298 = new ArrayList();
        ((ArrayList) term401298).add(term401300);
        ((ArrayList) term401298).add(term401306);
        ((ArrayList) term401298).add(term401312);
        ((ArrayList) term401298).add(term401318);
        ((ArrayList) term401298).add(term401324);
        ((ArrayList) term401298).add(term401330);
        ((ArrayList) term401298).add(term401334);
        ((ArrayList) term401298).add(term401338);
        ((ArrayList) term401298).add(term401342);
        Object term401350 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term401350, term401350.getClass(), "PVID", 875280847);
        setIntField(term401350, term401350.getClass(), "Version", 782400922);
        setIntField(term401350, term401350.getClass(), "Edition", 1004453117);
        setField(term401350, term401350.getClass(), "AdvDemo", term401323);
        setField(term401350, term401350.getClass(), "Playable", term401323);
        ArrayList term401348 = new ArrayList();
        ((ArrayList) term401348).add(term401350);
        ((ArrayList) term401348).add(term401324);
        ((ArrayList) term401348).add(term401350);
        ((ArrayList) term401348).add(term401338);
        ((ArrayList) term401348).add(term401330);
        ((ArrayList) term401348).add(term401312);
        ((ArrayList) term401348).add(term401324);
        ((ArrayList) term401348).add(term401338);
        ArrayList term401356 = new ArrayList();
        ((ArrayList) term401356).add(term401350);
        ((ArrayList) term401356).add(term401350);
        ArrayList term401360 = new ArrayList();
        ((ArrayList) term401360).add(term401318);
        ((ArrayList) term401360).add(term401324);
        ((ArrayList) term401360).add(term401324);
        ((ArrayList) term401360).add(term401306);
        ((ArrayList) term401360).add(term401334);
        term401287 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term401288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401293 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term401289, term401289.getClass(), "year", 2012);
        setShortField(term401289, term401289.getClass(), "month", (short) 10);
        setShortField(term401289, term401289.getClass(), "day", (short) 29);
        setField(term401288, term401288.getClass(), "date", term401289);
        setByteField(term401293, term401293.getClass(), "hour", (byte) 11);
        setByteField(term401293, term401293.getClass(), "minute", (byte) 1);
        setByteField(term401293, term401293.getClass(), "second", (byte) 19);
        setIntField(term401293, term401293.getClass(), "nano", 74382482);
        setField(term401288, term401288.getClass(), "time", term401293);
        setField(term401287, term401287.getClass(), "CreationDate", term401288);
        setField(term401287, term401287.getClass(), "Easy", term401298);
        setField(term401287, term401287.getClass(), "Normal", term401348);
        setField(term401287, term401287.getClass(), "Hard", term401356);
        setField(term401287, term401287.getClass(), "Extreme", term401360);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHard", argTypes, term401287, args);
    }

};


