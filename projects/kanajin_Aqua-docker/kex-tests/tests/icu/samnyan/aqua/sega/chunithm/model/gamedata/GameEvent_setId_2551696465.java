package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class GameEvent_setId_2551696465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121;
     Object term145;

    public GameEvent_setId_2551696465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameEvent"));
        Object term124 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125 = newInstance(Class.forName("java.time.LocalDate"));
        Object term129 = newInstance(Class.forName("java.time.LocalTime"));
        Object term134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term139 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term121, term121.getClass(), "id", 1725571209);
        setIntField(term121, term121.getClass(), "type", -522618178);
        setIntField(term125, term125.getClass(), "year", 2019);
        setShortField(term125, term125.getClass(), "month", (short) 2);
        setShortField(term125, term125.getClass(), "day", (short) 21);
        setField(term124, term124.getClass(), "date", term125);
        setByteField(term129, term129.getClass(), "hour", (byte) 5);
        setByteField(term129, term129.getClass(), "minute", (byte) 41);
        setByteField(term129, term129.getClass(), "second", (byte) 11);
        setIntField(term129, term129.getClass(), "nano", 859829782);
        setField(term124, term124.getClass(), "time", term129);
        setField(term121, term121.getClass(), "startDate", term124);
        setIntField(term135, term135.getClass(), "year", 2018);
        setShortField(term135, term135.getClass(), "month", (short) 9);
        setShortField(term135, term135.getClass(), "day", (short) 28);
        setField(term134, term134.getClass(), "date", term135);
        setByteField(term139, term139.getClass(), "hour", (byte) 3);
        setByteField(term139, term139.getClass(), "minute", (byte) 37);
        setByteField(term139, term139.getClass(), "second", (byte) 46);
        setIntField(term139, term139.getClass(), "nano", 763326845);
        setField(term134, term134.getClass(), "time", term139);
        setField(term121, term121.getClass(), "endDate", term134);
        setBooleanField(term121, term121.getClass(), "enable", true);
        term145 = new Integer(1134449235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.GameEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term145;
        callMethod(klass, "setId", argTypes, term121, args);
    }

};


