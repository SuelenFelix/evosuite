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

public class PvListEntry_canEqual_100901918711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term556;
     Object term602;

    public PvListEntry_canEqual_100901918711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term556 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term560 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term561 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term562 = newInstance(Class.forName("java.time.LocalDate"));
        Object term566 = newInstance(Class.forName("java.time.LocalTime"));
        Object term571 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term572 = newInstance(Class.forName("java.time.LocalDate"));
        Object term576 = newInstance(Class.forName("java.time.LocalTime"));
        Object term581 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term582 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term583 = newInstance(Class.forName("java.time.LocalDate"));
        Object term587 = newInstance(Class.forName("java.time.LocalTime"));
        Object term592 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term593 = newInstance(Class.forName("java.time.LocalDate"));
        Object term597 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term556, term556.getClass(), "PVID", -1530420153);
        setIntField(term556, term556.getClass(), "Version", -469968304);
        setIntField(term556, term556.getClass(), "Edition", -1145578966);
        setIntField(term562, term562.getClass(), "year", 2012);
        setShortField(term562, term562.getClass(), "month", (short) 4);
        setShortField(term562, term562.getClass(), "day", (short) 25);
        setField(term561, term561.getClass(), "date", term562);
        setByteField(term566, term566.getClass(), "hour", (byte) 21);
        setByteField(term566, term566.getClass(), "minute", (byte) 14);
        setByteField(term566, term566.getClass(), "second", (byte) 15);
        setIntField(term566, term566.getClass(), "nano", 561700934);
        setField(term561, term561.getClass(), "time", term566);
        setField(term560, term560.getClass(), "Start", term561);
        setIntField(term572, term572.getClass(), "year", 2011);
        setShortField(term572, term572.getClass(), "month", (short) 10);
        setShortField(term572, term572.getClass(), "day", (short) 25);
        setField(term571, term571.getClass(), "date", term572);
        setByteField(term576, term576.getClass(), "hour", (byte) 10);
        setByteField(term576, term576.getClass(), "minute", (byte) 33);
        setByteField(term576, term576.getClass(), "second", (byte) 8);
        setIntField(term576, term576.getClass(), "nano", 268304014);
        setField(term571, term571.getClass(), "time", term576);
        setField(term560, term560.getClass(), "End", term571);
        setField(term556, term556.getClass(), "AdvDemo", term560);
        setIntField(term583, term583.getClass(), "year", 2024);
        setShortField(term583, term583.getClass(), "month", (short) 5);
        setShortField(term583, term583.getClass(), "day", (short) 6);
        setField(term582, term582.getClass(), "date", term583);
        setByteField(term587, term587.getClass(), "hour", (byte) 20);
        setByteField(term587, term587.getClass(), "minute", (byte) 14);
        setByteField(term587, term587.getClass(), "second", (byte) 27);
        setIntField(term587, term587.getClass(), "nano", 900636101);
        setField(term582, term582.getClass(), "time", term587);
        setField(term581, term581.getClass(), "Start", term582);
        setIntField(term593, term593.getClass(), "year", 2021);
        setShortField(term593, term593.getClass(), "month", (short) 4);
        setShortField(term593, term593.getClass(), "day", (short) 17);
        setField(term592, term592.getClass(), "date", term593);
        setByteField(term597, term597.getClass(), "hour", (byte) 4);
        setByteField(term597, term597.getClass(), "minute", (byte) 11);
        setByteField(term597, term597.getClass(), "second", (byte) 16);
        setIntField(term597, term597.getClass(), "nano", 509895858);
        setField(term592, term592.getClass(), "time", term597);
        setField(term581, term581.getClass(), "End", term592);
        setField(term556, term556.getClass(), "Playable", term581);
        term602 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term602;
        callMethod(klass, "canEqual", argTypes, term556, args);
    }

};


