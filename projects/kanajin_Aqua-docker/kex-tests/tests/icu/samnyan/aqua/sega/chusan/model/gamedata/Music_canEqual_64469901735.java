package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Music_canEqual_64469901735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13430;

    public Music_canEqual_64469901735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13430 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term13430, term13430.getClass(), "musicId", 0);
        setField(term13430, term13430.getClass(), "name", null);
        setField(term13430, term13430.getClass(), "sortName", null);
        setField(term13430, term13430.getClass(), "artistName", null);
        setField(term13430, term13430.getClass(), "genre", null);
        setField(term13430, term13430.getClass(), "releaseVersion", null);
        setField(term13430, term13430.getClass(), "levels", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term13430, args);
    }

};


