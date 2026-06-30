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

public class DivaCustomize_setName_12762645888 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29126;

    public DivaCustomize_setName_12762645888() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29126 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize"));
        Object term29141 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29142 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29146 = newInstance(Class.forName("java.time.LocalTime"));
        Object term29151 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term29152 = newInstance(Class.forName("java.time.LocalDate"));
        Object term29156 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term29126, term29126.getClass(), "id", 1709474063);
        setField(term29126, term29126.getClass(), "name", "iHtqLPNWTt");
        setIntField(term29126, term29126.getClass(), "price", 1406617209);
        setIntField(term29142, term29142.getClass(), "year", 2015);
        setShortField(term29142, term29142.getClass(), "month", (short) 3);
        setShortField(term29142, term29142.getClass(), "day", (short) 10);
        setField(term29141, term29141.getClass(), "date", term29142);
        setByteField(term29146, term29146.getClass(), "hour", (byte) 23);
        setByteField(term29146, term29146.getClass(), "minute", (byte) 34);
        setByteField(term29146, term29146.getClass(), "second", (byte) 44);
        setIntField(term29146, term29146.getClass(), "nano", 587322824);
        setField(term29141, term29141.getClass(), "time", term29146);
        setField(term29126, term29126.getClass(), "releaseDate", term29141);
        setIntField(term29152, term29152.getClass(), "year", 2027);
        setShortField(term29152, term29152.getClass(), "month", (short) 8);
        setShortField(term29152, term29152.getClass(), "day", (short) 26);
        setField(term29151, term29151.getClass(), "date", term29152);
        setByteField(term29156, term29156.getClass(), "hour", (byte) 5);
        setByteField(term29156, term29156.getClass(), "minute", (byte) 11);
        setByteField(term29156, term29156.getClass(), "second", (byte) 9);
        setIntField(term29156, term29156.getClass(), "nano", 219245092);
        setField(term29151, term29151.getClass(), "time", term29156);
        setField(term29126, term29126.getClass(), "endDate", term29151);
        setIntField(term29126, term29126.getClass(), "sortOrder", 1706047059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.gamedata.DivaCustomize");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "TQgECVDMEf";
        callMethod(klass, "setName", argTypes, term29126, args);
    }

};


