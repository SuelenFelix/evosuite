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
import java.lang.String;
import java.lang.Object;
import java.util.HashMap;

public class Music_getName_10829039761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18817;

    public Music_getName_10829039761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18970 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term18969 = ((Class) term18970).getDeclaredField((String) "KOTONOHA");
        ((Field) term18969).setAccessible(true);
        Object enum31 = ((Field) term18969).get((Object) null);
        HashMap term18913 = new HashMap();
        term18817 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term18817, term18817.getClass(), "musicId", -1271375703);
        setField(term18817, term18817.getClass(), "name", "TGiJfagfky");
        setField(term18817, term18817.getClass(), "sortName", "BJklinBmhN");
        setField(term18817, term18817.getClass(), "copyright", "IOddzvEWcl");
        setField(term18817, term18817.getClass(), "artistName", "bIrtpkYJWT");
        setField(term18817, term18817.getClass(), "genre", enum31);
        setField(term18817, term18817.getClass(), "releaseVersion", "VuLLXpvPpZ");
        setField(term18817, term18817.getClass(), "levels", term18913);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term18817, args);
    }

};


