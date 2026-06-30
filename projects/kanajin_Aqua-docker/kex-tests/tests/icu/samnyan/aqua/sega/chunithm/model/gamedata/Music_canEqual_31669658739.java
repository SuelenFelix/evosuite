package icu.samnyan.aqua.sega.chunithm.model.gamedata;

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
import static icu.samnyan.aqua.sega.chunithm.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Music_canEqual_31669658739 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28185;

    public Music_canEqual_31669658739() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28185 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term28185, term28185.getClass(), "musicId", 0);
        setField(term28185, term28185.getClass(), "name", null);
        setField(term28185, term28185.getClass(), "sortName", null);
        setField(term28185, term28185.getClass(), "copyright", null);
        setField(term28185, term28185.getClass(), "artistName", null);
        setField(term28185, term28185.getClass(), "genre", null);
        setField(term28185, term28185.getClass(), "releaseVersion", null);
        setField(term28185, term28185.getClass(), "levels", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term28185, args);
    }

};


