package icu.samnyan.aqua.sega.diva.model.gamedata;

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
import static icu.samnyan.aqua.sega.diva.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DivaCustomize_getSortOrder_21380580006 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29032;

    public DivaCustomize_getSortOrder_21380580006() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29032 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term29047 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29048 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29052 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29057 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29058 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29062 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29032, term29032.getClass(), "id", 864645689);
        setField(term29032, term29032.getClass(), "name", "ebUWnoVDmk");
        setIntField(term29032, term29032.getClass(), "price", 279384872);
        setIntField(term29048, term29048.getClass(), "year", 2017);
        setShortField(term29048, term29048.getClass(), "month", (short) 3);
        setShortField(term29048, term29048.getClass(), "day", (short) 5);
        setField(term29047, term29047.getClass(), "date", term29048);
        setByteField(term29052, term29052.getClass(), "hour", (byte) 20);
        setByteField(term29052, term29052.getClass(), "minute", (byte) 34);
        setByteField(term29052, term29052.getClass(), "second", (byte) 55);
        setIntField(term29052, term29052.getClass(), "nano", 78024496);
        setField(term29047, term29047.getClass(), "time", term29052);
        setField(term29032, term29032.getClass(), "releaseDate", term29047);
        setIntField(term29058, term29058.getClass(), "year", 2020);
        setShortField(term29058, term29058.getClass(), "month", (short) 7);
        setShortField(term29058, term29058.getClass(), "day", (short) 24);
        setField(term29057, term29057.getClass(), "date", term29058);
        setByteField(term29062, term29062.getClass(), "hour", (byte) 0);
        setByteField(term29062, term29062.getClass(), "minute", (byte) 59);
        setByteField(term29062, term29062.getClass(), "second", (byte) 56);
        setIntField(term29062, term29062.getClass(), "nano", 320219201);
        setField(term29057, term29057.getClass(), "time", term29062);
        setField(term29032, term29032.getClass(), "endDate", term29057);
        setIntField(term29032, term29032.getClass(), "sortOrder", 1427305953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortOrder", argTypes, term29032, args);
    }

};


