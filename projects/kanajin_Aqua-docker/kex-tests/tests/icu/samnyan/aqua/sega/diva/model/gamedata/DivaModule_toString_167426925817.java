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

public class DivaModule_toString_167426925817 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2207632;

    public DivaModule_toString_167426925817() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2207632 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term2207647 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2207648 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2207652 = newInstance(Class.forName("java.time.LocalTime"));
        Object term2207657 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term2207658 = newInstance(Class.forName("java.time.LocalDate"));
        Object term2207662 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term2207632, term2207632.getClass(), "id", -1673573012);
        setField(term2207632, term2207632.getClass(), "name", "pweYirBAdv");
        setIntField(term2207632, term2207632.getClass(), "price", 1272216631);
        setIntField(term2207648, term2207648.getClass(), "year", 2026);
        setShortField(term2207648, term2207648.getClass(), "month", (short) 4);
        setShortField(term2207648, term2207648.getClass(), "day", (short) 24);
        setField(term2207647, term2207647.getClass(), "date", term2207648);
        setByteField(term2207652, term2207652.getClass(), "hour", (byte) 8);
        setByteField(term2207652, term2207652.getClass(), "minute", (byte) 4);
        setByteField(term2207652, term2207652.getClass(), "second", (byte) 49);
        setIntField(term2207652, term2207652.getClass(), "nano", 338201077);
        setField(term2207647, term2207647.getClass(), "time", term2207652);
        setField(term2207632, term2207632.getClass(), "releaseDate", term2207647);
        setIntField(term2207658, term2207658.getClass(), "year", 2020);
        setShortField(term2207658, term2207658.getClass(), "month", (short) 11);
        setShortField(term2207658, term2207658.getClass(), "day", (short) 19);
        setField(term2207657, term2207657.getClass(), "date", term2207658);
        setByteField(term2207662, term2207662.getClass(), "hour", (byte) 6);
        setByteField(term2207662, term2207662.getClass(), "minute", (byte) 47);
        setByteField(term2207662, term2207662.getClass(), "second", (byte) 28);
        setIntField(term2207662, term2207662.getClass(), "nano", 940235017);
        setField(term2207657, term2207657.getClass(), "time", term2207662);
        setField(term2207632, term2207632.getClass(), "endDate", term2207657);
        setIntField(term2207632, term2207632.getClass(), "sortOrder", -191256384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term2207632, args);
    }

};


