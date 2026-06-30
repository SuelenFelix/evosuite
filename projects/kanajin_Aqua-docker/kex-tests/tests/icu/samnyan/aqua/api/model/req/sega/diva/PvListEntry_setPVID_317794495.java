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
import java.lang.Integer;

public class PvListEntry_setPVID_317794495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231;
     Object term277;

    public PvListEntry_setPVID_317794495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term235 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term236 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term237 = newInstance(Class.forName("java.time.LocalDate"));
        Object term241 = newInstance(Class.forName("java.time.LocalTime"));
        Object term246 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term247 = newInstance(Class.forName("java.time.LocalDate"));
        Object term251 = newInstance(Class.forName("java.time.LocalTime"));
        Object term256 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term257 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term258 = newInstance(Class.forName("java.time.LocalDate"));
        Object term262 = newInstance(Class.forName("java.time.LocalTime"));
        Object term267 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term268 = newInstance(Class.forName("java.time.LocalDate"));
        Object term272 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term231, term231.getClass(), "PVID", 597278769);
        setIntField(term231, term231.getClass(), "Version", -1685132342);
        setIntField(term231, term231.getClass(), "Edition", -1456670397);
        setIntField(term237, term237.getClass(), "year", 2014);
        setShortField(term237, term237.getClass(), "month", (short) 7);
        setShortField(term237, term237.getClass(), "day", (short) 13);
        setField(term236, term236.getClass(), "date", term237);
        setByteField(term241, term241.getClass(), "hour", (byte) 21);
        setByteField(term241, term241.getClass(), "minute", (byte) 46);
        setByteField(term241, term241.getClass(), "second", (byte) 0);
        setIntField(term241, term241.getClass(), "nano", 887884128);
        setField(term236, term236.getClass(), "time", term241);
        setField(term235, term235.getClass(), "Start", term236);
        setIntField(term247, term247.getClass(), "year", 2023);
        setShortField(term247, term247.getClass(), "month", (short) 3);
        setShortField(term247, term247.getClass(), "day", (short) 7);
        setField(term246, term246.getClass(), "date", term247);
        setByteField(term251, term251.getClass(), "hour", (byte) 21);
        setByteField(term251, term251.getClass(), "minute", (byte) 15);
        setByteField(term251, term251.getClass(), "second", (byte) 43);
        setIntField(term251, term251.getClass(), "nano", 639721472);
        setField(term246, term246.getClass(), "time", term251);
        setField(term235, term235.getClass(), "End", term246);
        setField(term231, term231.getClass(), "AdvDemo", term235);
        setIntField(term258, term258.getClass(), "year", 2015);
        setShortField(term258, term258.getClass(), "month", (short) 3);
        setShortField(term258, term258.getClass(), "day", (short) 10);
        setField(term257, term257.getClass(), "date", term258);
        setByteField(term262, term262.getClass(), "hour", (byte) 23);
        setByteField(term262, term262.getClass(), "minute", (byte) 34);
        setByteField(term262, term262.getClass(), "second", (byte) 44);
        setIntField(term262, term262.getClass(), "nano", 587322824);
        setField(term257, term257.getClass(), "time", term262);
        setField(term256, term256.getClass(), "Start", term257);
        setIntField(term268, term268.getClass(), "year", 2027);
        setShortField(term268, term268.getClass(), "month", (short) 8);
        setShortField(term268, term268.getClass(), "day", (short) 26);
        setField(term267, term267.getClass(), "date", term268);
        setByteField(term272, term272.getClass(), "hour", (byte) 5);
        setByteField(term272, term272.getClass(), "minute", (byte) 11);
        setByteField(term272, term272.getClass(), "second", (byte) 9);
        setIntField(term272, term272.getClass(), "nano", 219245092);
        setField(term267, term267.getClass(), "time", term272);
        setField(term256, term256.getClass(), "End", term267);
        setField(term231, term231.getClass(), "Playable", term256);
        term277 = new Integer(1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term277;
        callMethod(klass, "setPVID", argTypes, term231, args);
    }

};


