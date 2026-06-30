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

public class Music_getGenre_86140093824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13406;

    public Music_getGenre_86140093824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13406 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term13406, term13406.getClass(), "musicId", 0);
        setField(term13406, term13406.getClass(), "name", null);
        setField(term13406, term13406.getClass(), "sortName", null);
        setField(term13406, term13406.getClass(), "artistName", null);
        setField(term13406, term13406.getClass(), "genre", null);
        setField(term13406, term13406.getClass(), "releaseVersion", null);
        setField(term13406, term13406.getClass(), "levels", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenre", argTypes, term13406, args);
    }

};


