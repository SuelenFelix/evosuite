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
import java.lang.Integer;

public class Music_setMusicId_16730282427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13412;
     Object term13414;

    public Music_setMusicId_16730282427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13412 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term13412, term13412.getClass(), "musicId", 0);
        setField(term13412, term13412.getClass(), "name", null);
        setField(term13412, term13412.getClass(), "sortName", null);
        setField(term13412, term13412.getClass(), "artistName", null);
        setField(term13412, term13412.getClass(), "genre", null);
        setField(term13412, term13412.getClass(), "releaseVersion", null);
        setField(term13412, term13412.getClass(), "levels", null);
        term13414 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term13414;
        callMethod(klass, "setMusicId", argTypes, term13412, args);
    }

};


