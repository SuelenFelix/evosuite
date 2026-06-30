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

public class DivaModule_toInternal_4972388380 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29716;

    public DivaModule_toInternal_4972388380() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29716 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term29731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29736 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29741 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29742 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29746 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29716, term29716.getClass(), "id", 1131398807);
        setField(term29716, term29716.getClass(), "name", "tAqyToqusS");
        setIntField(term29716, term29716.getClass(), "price", -344907703);
        setIntField(term29732, term29732.getClass(), "year", 2020);
        setShortField(term29732, term29732.getClass(), "month", (short) 5);
        setShortField(term29732, term29732.getClass(), "day", (short) 18);
        setField(term29731, term29731.getClass(), "date", term29732);
        setByteField(term29736, term29736.getClass(), "hour", (byte) 5);
        setByteField(term29736, term29736.getClass(), "minute", (byte) 46);
        setByteField(term29736, term29736.getClass(), "second", (byte) 13);
        setIntField(term29736, term29736.getClass(), "nano", 45893173);
        setField(term29731, term29731.getClass(), "time", term29736);
        setField(term29716, term29716.getClass(), "releaseDate", term29731);
        setIntField(term29742, term29742.getClass(), "year", 2017);
        setShortField(term29742, term29742.getClass(), "month", (short) 4);
        setShortField(term29742, term29742.getClass(), "day", (short) 3);
        setField(term29741, term29741.getClass(), "date", term29742);
        setByteField(term29746, term29746.getClass(), "hour", (byte) 6);
        setByteField(term29746, term29746.getClass(), "minute", (byte) 51);
        setByteField(term29746, term29746.getClass(), "second", (byte) 10);
        setIntField(term29746, term29746.getClass(), "nano", 316377166);
        setField(term29741, term29741.getClass(), "time", term29746);
        setField(term29716, term29716.getClass(), "endDate", term29741);
        setIntField(term29716, term29716.getClass(), "sortOrder", 824341437);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toInternal", argTypes, term29716, args);
    }

};


