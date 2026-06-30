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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class Level_toString_212362526015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8914;

    public Level_toString_212362526015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9055 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term9054 = ((Class) term9055).getDeclaredField((String) "ORIGINAL");
        ((Field) term9054).setAccessible(true);
        Object enum16 = ((Field) term9054).get((Object) null);
        HashMap term9000 = new HashMap();
        term8914 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term8916 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term8914, term8914.getClass(), "id", -5786861555969446503L);
        setIntField(term8916, term8916.getClass(), "musicId", 1890399366);
        setField(term8916, term8916.getClass(), "name", "zjZYTddemL");
        setField(term8916, term8916.getClass(), "sortName", "QtrylgCLiF");
        setField(term8916, term8916.getClass(), "copyright", "orEuhCStGM");
        setField(term8916, term8916.getClass(), "artistName", "HhEaSXWvrY");
        setField(term8916, term8916.getClass(), "genre", enum16);
        setField(term8916, term8916.getClass(), "releaseVersion", "CVRGEomOth");
        setField(term8916, term8916.getClass(), "levels", term9000);
        setField(term8914, term8914.getClass(), "music", term8916);
        setBooleanField(term8914, term8914.getClass(), "enable", true);
        setIntField(term8914, term8914.getClass(), "level", -2063365430);
        setIntField(term8914, term8914.getClass(), "levelDecimal", 812570053);
        setIntField(term8914, term8914.getClass(), "diff", -1488938905);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8914, args);
    }

};


