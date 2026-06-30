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

public class DivaCustomize_toString_186438341716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29542;

    public DivaCustomize_toString_186438341716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29542 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term29557 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29558 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29562 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29567 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29568 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29572 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29542, term29542.getClass(), "id", 752615112);
        setField(term29542, term29542.getClass(), "name", "HnpLvemmRI");
        setIntField(term29542, term29542.getClass(), "price", -1674430871);
        setIntField(term29558, term29558.getClass(), "year", 2015);
        setShortField(term29558, term29558.getClass(), "month", (short) 12);
        setShortField(term29558, term29558.getClass(), "day", (short) 23);
        setField(term29557, term29557.getClass(), "date", term29558);
        setByteField(term29562, term29562.getClass(), "hour", (byte) 14);
        setByteField(term29562, term29562.getClass(), "minute", (byte) 17);
        setByteField(term29562, term29562.getClass(), "second", (byte) 50);
        setIntField(term29562, term29562.getClass(), "nano", 325544804);
        setField(term29557, term29557.getClass(), "time", term29562);
        setField(term29542, term29542.getClass(), "releaseDate", term29557);
        setIntField(term29568, term29568.getClass(), "year", 2027);
        setShortField(term29568, term29568.getClass(), "month", (short) 11);
        setShortField(term29568, term29568.getClass(), "day", (short) 8);
        setField(term29567, term29567.getClass(), "date", term29568);
        setByteField(term29572, term29572.getClass(), "hour", (byte) 11);
        setByteField(term29572, term29572.getClass(), "minute", (byte) 59);
        setByteField(term29572, term29572.getClass(), "second", (byte) 14);
        setIntField(term29572, term29572.getClass(), "nano", 322375591);
        setField(term29567, term29567.getClass(), "time", term29572);
        setField(term29542, term29542.getClass(), "endDate", term29567);
        setIntField(term29542, term29542.getClass(), "sortOrder", 794352120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term29542, args);
    }

};


