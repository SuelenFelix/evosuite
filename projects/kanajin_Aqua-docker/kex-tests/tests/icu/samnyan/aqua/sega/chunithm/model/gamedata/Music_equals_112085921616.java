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

public class Music_equals_112085921616 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25855;
     Object term25953;

    public Music_equals_112085921616() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25995 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term25994 = ((Class) term25995).getDeclaredField((String) "VARIETY");
        ((Field) term25994).setAccessible(true);
        Object enum47 = ((Field) term25994).get((Object) null);
        HashMap term25937 = new HashMap();
        term25855 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term25855, term25855.getClass(), "musicId", 1544768934);
        setField(term25855, term25855.getClass(), "name", "NNkIIFpxiB");
        setField(term25855, term25855.getClass(), "sortName", "sBmtvFPDso");
        setField(term25855, term25855.getClass(), "copyright", "qsUIxrLolr");
        setField(term25855, term25855.getClass(), "artistName", "IlQxArYcgB");
        setField(term25855, term25855.getClass(), "genre", enum47);
        setField(term25855, term25855.getClass(), "releaseVersion", "lIgKCvCuoH");
        setField(term25855, term25855.getClass(), "levels", term25937);
        term25953 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25953;
        callMethod(klass, "equals", argTypes, term25855, args);
    }

};


