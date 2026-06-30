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

public class DivaModule_toString_167426925816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30502;

    public DivaModule_toString_167426925816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30502 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term30517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30522 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30527 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30528 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30532 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30502, term30502.getClass(), "id", -43719302);
        setField(term30502, term30502.getClass(), "name", "diWnDDpNWl");
        setIntField(term30502, term30502.getClass(), "price", 1024134939);
        setIntField(term30518, term30518.getClass(), "year", 2020);
        setShortField(term30518, term30518.getClass(), "month", (short) 8);
        setShortField(term30518, term30518.getClass(), "day", (short) 16);
        setField(term30517, term30517.getClass(), "date", term30518);
        setByteField(term30522, term30522.getClass(), "hour", (byte) 4);
        setByteField(term30522, term30522.getClass(), "minute", (byte) 37);
        setByteField(term30522, term30522.getClass(), "second", (byte) 19);
        setIntField(term30522, term30522.getClass(), "nano", 605410923);
        setField(term30517, term30517.getClass(), "time", term30522);
        setField(term30502, term30502.getClass(), "releaseDate", term30517);
        setIntField(term30528, term30528.getClass(), "year", 2028);
        setShortField(term30528, term30528.getClass(), "month", (short) 5);
        setShortField(term30528, term30528.getClass(), "day", (short) 2);
        setField(term30527, term30527.getClass(), "date", term30528);
        setByteField(term30532, term30532.getClass(), "hour", (byte) 2);
        setByteField(term30532, term30532.getClass(), "minute", (byte) 59);
        setByteField(term30532, term30532.getClass(), "second", (byte) 30);
        setIntField(term30532, term30532.getClass(), "nano", 222274238);
        setField(term30527, term30527.getClass(), "time", term30532);
        setField(term30502, term30502.getClass(), "endDate", term30527);
        setIntField(term30502, term30502.getClass(), "sortOrder", 109078154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term30502, args);
    }

};


