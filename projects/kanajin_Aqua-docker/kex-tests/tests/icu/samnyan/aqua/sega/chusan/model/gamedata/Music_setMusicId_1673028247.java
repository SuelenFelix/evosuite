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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Integer;

public class Music_setMusicId_1673028247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8023;
     Object term8111;

    public Music_setMusicId_1673028247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8144 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term8143 = ((Class) term8144).getDeclaredField((String) "RESERVE2");
        ((Field) term8143).setAccessible(true);
        Object enum7 = ((Field) term8143).get((Object) null);
        HashMap term8095 = new HashMap();
        term8023 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term8023, term8023.getClass(), "musicId", 2049577015);
        setField(term8023, term8023.getClass(), "name", "pXdglvyrQe");
        setField(term8023, term8023.getClass(), "sortName", "OcfNzHYdki");
        setField(term8023, term8023.getClass(), "artistName", "uPuCVuZYOI");
        setField(term8023, term8023.getClass(), "genre", enum7);
        setField(term8023, term8023.getClass(), "releaseVersion", "TweMFhxNdj");
        setField(term8023, term8023.getClass(), "levels", term8095);
        term8111 = new Integer(32185364);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8111;
        callMethod(klass, "setMusicId", argTypes, term8023, args);
    }

};


