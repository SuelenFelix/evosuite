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

public class Music_getLevels_72163890929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28163;

    public Music_getLevels_72163890929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28163 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term28163, term28163.getClass(), "musicId", 0);
        setField(term28163, term28163.getClass(), "name", null);
        setField(term28163, term28163.getClass(), "sortName", null);
        setField(term28163, term28163.getClass(), "copyright", null);
        setField(term28163, term28163.getClass(), "artistName", null);
        setField(term28163, term28163.getClass(), "genre", null);
        setField(term28163, term28163.getClass(), "releaseVersion", null);
        setField(term28163, term28163.getClass(), "levels", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevels", argTypes, term28163, args);
    }

};


