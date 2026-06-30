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
import java.lang.Integer;

public class Music_setMusicId_16069960630 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28165;
     Object term28167;

    public Music_setMusicId_16069960630() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28165 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term28165, term28165.getClass(), "musicId", 0);
        setField(term28165, term28165.getClass(), "name", null);
        setField(term28165, term28165.getClass(), "sortName", null);
        setField(term28165, term28165.getClass(), "copyright", null);
        setField(term28165, term28165.getClass(), "artistName", null);
        setField(term28165, term28165.getClass(), "genre", null);
        setField(term28165, term28165.getClass(), "releaseVersion", null);
        setField(term28165, term28165.getClass(), "levels", null);
        term28167 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28167;
        callMethod(klass, "setMusicId", argTypes, term28165, args);
    }

};


