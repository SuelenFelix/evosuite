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
import java.util.LinkedList;

public class PvListRequest_init_198618581814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402202;
     Object term402212;
     Object term402215;
     Object term402229;
     Object term402250;

    public PvListRequest_init_198618581814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term402202 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402203 = newInstance(Class.forName("java.time.LocalDate"));
        Object term402207 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term402203, term402203.getClass(), "year", 2026);
        setShortField(term402203, term402203.getClass(), "month", (short) 3);
        setShortField(term402203, term402203.getClass(), "day", (short) 5);
        setField(term402202, term402202.getClass(), "date", term402203);
        setByteField(term402207, term402207.getClass(), "hour", (byte) 3);
        setByteField(term402207, term402207.getClass(), "minute", (byte) 16);
        setByteField(term402207, term402207.getClass(), "second", (byte) 56);
        setIntField(term402207, term402207.getClass(), "nano", 437302142);
        setField(term402202, term402202.getClass(), "time", term402207);
        term402212 = new LinkedList();
        Object term402218 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402222 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402223 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402224 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402225 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402227 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term402218, term402218.getClass(), "PVID", 973839676);
        setIntField(term402218, term402218.getClass(), "Version", -414533715);
        setIntField(term402218, term402218.getClass(), "Edition", 1942629568);
        setField(term402223, term402223.getClass(), "date", null);
        setField(term402223, term402223.getClass(), "time", null);
        setField(term402222, term402222.getClass(), "Start", term402223);
        setField(term402224, term402224.getClass(), "date", null);
        setField(term402224, term402224.getClass(), "time", null);
        setField(term402222, term402222.getClass(), "End", term402224);
        setField(term402218, term402218.getClass(), "AdvDemo", term402222);
        setField(term402226, term402226.getClass(), "date", null);
        setField(term402226, term402226.getClass(), "time", null);
        setField(term402225, term402225.getClass(), "Start", term402226);
        setField(term402227, term402227.getClass(), "date", null);
        setField(term402227, term402227.getClass(), "time", null);
        setField(term402225, term402225.getClass(), "End", term402227);
        setField(term402218, term402218.getClass(), "Playable", term402225);
        term402215 = new LinkedList();
        ((LinkedList) term402215).add(term402218);
        Object term402232 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402236 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402237 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402238 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402239 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402240 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402241 = newInstance(Class.forName("java.time.LocalDateTime"));
        setIntField(term402232, term402232.getClass(), "PVID", -1008345926);
        setIntField(term402232, term402232.getClass(), "Version", 607928025);
        setIntField(term402232, term402232.getClass(), "Edition", -1123376773);
        setField(term402237, term402237.getClass(), "date", null);
        setField(term402237, term402237.getClass(), "time", null);
        setField(term402236, term402236.getClass(), "Start", term402237);
        setField(term402238, term402238.getClass(), "date", null);
        setField(term402238, term402238.getClass(), "time", null);
        setField(term402236, term402236.getClass(), "End", term402238);
        setField(term402232, term402232.getClass(), "AdvDemo", term402236);
        setField(term402240, term402240.getClass(), "date", null);
        setField(term402240, term402240.getClass(), "time", null);
        setField(term402239, term402239.getClass(), "Start", term402240);
        setField(term402241, term402241.getClass(), "date", null);
        setField(term402241, term402241.getClass(), "time", null);
        setField(term402239, term402239.getClass(), "End", term402241);
        setField(term402232, term402232.getClass(), "Playable", term402239);
        Object term402243 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402247 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402248 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term402243, term402243.getClass(), "PVID", 1523673420);
        setIntField(term402243, term402243.getClass(), "Version", -1443338576);
        setIntField(term402243, term402243.getClass(), "Edition", 30262975);
        setField(term402247, term402247.getClass(), "Start", null);
        setField(term402247, term402247.getClass(), "End", null);
        setField(term402243, term402243.getClass(), "AdvDemo", term402247);
        setField(term402248, term402248.getClass(), "Start", null);
        setField(term402248, term402248.getClass(), "End", null);
        setField(term402243, term402243.getClass(), "Playable", term402248);
        term402229 = new LinkedList();
        ((LinkedList) term402229).add(term402232);
        ((LinkedList) term402229).add(term402243);
        term402250 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("java.util.List");
        argTypes[3] = Class.forName("java.util.List");
        argTypes[4] = Class.forName("java.util.List");
        Object[] args = new Object[5];
        args[0] = term402202;
        args[1] = term402212;
        args[2] = term402215;
        args[3] = term402229;
        args[4] = term402250;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


