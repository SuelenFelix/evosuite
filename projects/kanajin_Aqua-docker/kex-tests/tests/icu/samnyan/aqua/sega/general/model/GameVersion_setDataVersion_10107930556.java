package icu.samnyan.aqua.sega.general.model;

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
import static icu.samnyan.aqua.sega.general.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GameVersion_setDataVersion_10107930556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term937;

    public GameVersion_setDataVersion_10107930556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term937 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion"));
        Object term974 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term975 = newInstance(Class.forName("java.time.LocalDate"));
        Object term979 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term937, term937.getClass(), "uuid", "kuTXqwMtDB");
        setField(term937, term937.getClass(), "romVersion", "Ghbwtircqb");
        setField(term937, term937.getClass(), "dataVersion", "xrwlQZdwCp");
        setIntField(term975, term975.getClass(), "year", 2025);
        setShortField(term975, term975.getClass(), "month", (short) 4);
        setShortField(term975, term975.getClass(), "day", (short) 24);
        setField(term974, term974.getClass(), "date", term975);
        setByteField(term979, term979.getClass(), "hour", (byte) 18);
        setByteField(term979, term979.getClass(), "minute", (byte) 11);
        setByteField(term979, term979.getClass(), "second", (byte) 40);
        setIntField(term979, term979.getClass(), "nano", 137454929);
        setField(term974, term974.getClass(), "time", term979);
        setField(term937, term937.getClass(), "lastTime", term974);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.GameVersion");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IDCWpPLRkE";
        callMethod(klass, "setDataVersion", argTypes, term937, args);
    }

};


