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

public class DivaModule_setName_20325792098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30086;

    public DivaModule_setName_20325792098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30086 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule"));
        Object term30101 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30102 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30106 = newInstance(Class.forName("java.time.LocalTime"));
        Object term30111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term30112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term30116 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term30086, term30086.getClass(), "id", -1518419301);
        setField(term30086, term30086.getClass(), "name", "CjPfMVeNPm");
        setIntField(term30086, term30086.getClass(), "price", 674879025);
        setIntField(term30102, term30102.getClass(), "year", 2016);
        setShortField(term30102, term30102.getClass(), "month", (short) 2);
        setShortField(term30102, term30102.getClass(), "day", (short) 25);
        setField(term30101, term30101.getClass(), "date", term30102);
        setByteField(term30106, term30106.getClass(), "hour", (byte) 8);
        setByteField(term30106, term30106.getClass(), "minute", (byte) 54);
        setByteField(term30106, term30106.getClass(), "second", (byte) 40);
        setIntField(term30106, term30106.getClass(), "nano", 124525896);
        setField(term30101, term30101.getClass(), "time", term30106);
        setField(term30086, term30086.getClass(), "releaseDate", term30101);
        setIntField(term30112, term30112.getClass(), "year", 2029);
        setShortField(term30112, term30112.getClass(), "month", (short) 1);
        setShortField(term30112, term30112.getClass(), "day", (short) 10);
        setField(term30111, term30111.getClass(), "date", term30112);
        setByteField(term30116, term30116.getClass(), "hour", (byte) 8);
        setByteField(term30116, term30116.getClass(), "minute", (byte) 46);
        setByteField(term30116, term30116.getClass(), "second", (byte) 35);
        setIntField(term30116, term30116.getClass(), "nano", 58807194);
        setField(term30111, term30111.getClass(), "time", term30116);
        setField(term30086, term30086.getClass(), "endDate", term30111);
        setIntField(term30086, term30086.getClass(), "sortOrder", -1538936030);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaModule");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TeqSJDWXQD";
        callMethod(klass, "setName", argTypes, term30086, args);
    }

};


