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

public class PvListEntry_setVersion_3104965646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279;
     Object term325;

    public PvListEntry_setVersion_3104965646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term283 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term284 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term285 = newInstance(Class.forName("java.time.LocalDate"));
        Object term289 = newInstance(Class.forName("java.time.LocalTime"));
        Object term294 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term295 = newInstance(Class.forName("java.time.LocalDate"));
        Object term299 = newInstance(Class.forName("java.time.LocalTime"));
        Object term304 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term305 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term306 = newInstance(Class.forName("java.time.LocalDate"));
        Object term310 = newInstance(Class.forName("java.time.LocalTime"));
        Object term315 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term316 = newInstance(Class.forName("java.time.LocalDate"));
        Object term320 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term279, term279.getClass(), "PVID", 1048535127);
        setIntField(term279, term279.getClass(), "Version", -655067527);
        setIntField(term279, term279.getClass(), "Edition", -6029667);
        setIntField(term285, term285.getClass(), "year", 2025);
        setShortField(term285, term285.getClass(), "month", (short) 3);
        setShortField(term285, term285.getClass(), "day", (short) 9);
        setField(term284, term284.getClass(), "date", term285);
        setByteField(term289, term289.getClass(), "hour", (byte) 5);
        setByteField(term289, term289.getClass(), "minute", (byte) 49);
        setByteField(term289, term289.getClass(), "second", (byte) 12);
        setIntField(term289, term289.getClass(), "nano", 791695028);
        setField(term284, term284.getClass(), "time", term289);
        setField(term283, term283.getClass(), "Start", term284);
        setIntField(term295, term295.getClass(), "year", 2023);
        setShortField(term295, term295.getClass(), "month", (short) 9);
        setShortField(term295, term295.getClass(), "day", (short) 23);
        setField(term294, term294.getClass(), "date", term295);
        setByteField(term299, term299.getClass(), "hour", (byte) 12);
        setByteField(term299, term299.getClass(), "minute", (byte) 55);
        setByteField(term299, term299.getClass(), "second", (byte) 58);
        setIntField(term299, term299.getClass(), "nano", 159178396);
        setField(term294, term294.getClass(), "time", term299);
        setField(term283, term283.getClass(), "End", term294);
        setField(term279, term279.getClass(), "AdvDemo", term283);
        setIntField(term306, term306.getClass(), "year", 2028);
        setShortField(term306, term306.getClass(), "month", (short) 10);
        setShortField(term306, term306.getClass(), "day", (short) 1);
        setField(term305, term305.getClass(), "date", term306);
        setByteField(term310, term310.getClass(), "hour", (byte) 17);
        setByteField(term310, term310.getClass(), "minute", (byte) 29);
        setByteField(term310, term310.getClass(), "second", (byte) 30);
        setIntField(term310, term310.getClass(), "nano", 845472306);
        setField(term305, term305.getClass(), "time", term310);
        setField(term304, term304.getClass(), "Start", term305);
        setIntField(term316, term316.getClass(), "year", 2027);
        setShortField(term316, term316.getClass(), "month", (short) 2);
        setShortField(term316, term316.getClass(), "day", (short) 19);
        setField(term315, term315.getClass(), "date", term316);
        setByteField(term320, term320.getClass(), "hour", (byte) 17);
        setByteField(term320, term320.getClass(), "minute", (byte) 37);
        setByteField(term320, term320.getClass(), "second", (byte) 27);
        setIntField(term320, term320.getClass(), "nano", 920380537);
        setField(term315, term315.getClass(), "time", term320);
        setField(term304, term304.getClass(), "End", term315);
        setField(term279, term279.getClass(), "Playable", term304);
        term325 = new Integer(-2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term325;
        callMethod(klass, "setVersion", argTypes, term279, args);
    }

};


