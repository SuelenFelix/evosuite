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

public class Music_setArtistName_13734331910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9287;

    public Music_setArtistName_13734331910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9416 = Class.forName((String) "icu.samnyan.aqua.sega.chusan.model.gamedata.Genre");
        Field term9415 = ((Class) term9416).getDeclaredField((String) "VARIETY");
        ((Field) term9415).setAccessible(true);
        Object enum10 = ((Field) term9415).get((Object) null);
        HashMap term9357 = new HashMap();
        term9287 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music"));
        setIntField(term9287, term9287.getClass(), "musicId", -1127721881);
        setField(term9287, term9287.getClass(), "name", "JeZFtaqkzW");
        setField(term9287, term9287.getClass(), "sortName", "vOVuNSCCLe");
        setField(term9287, term9287.getClass(), "artistName", "fzeqPnzpnt");
        setField(term9287, term9287.getClass(), "genre", enum10);
        setField(term9287, term9287.getClass(), "releaseVersion", "RxbhrFBjkO");
        setField(term9287, term9287.getClass(), "levels", term9357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GNEmuHPNcU";
        callMethod(klass, "setArtistName", argTypes, term9287, args);
    }

};


