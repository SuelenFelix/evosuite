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

public class Music_setName_14921867529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22308;

    public Music_setName_14921867529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term22467 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term22466 = ((Class) term22467).getDeclaredField((String) "POPS_ANIME");
        ((Field) term22466).setAccessible(true);
        Object enum39 = ((Field) term22466).get((Object) null);
        HashMap term22398 = new HashMap();
        term22308 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setIntField(term22308, term22308.getClass(), "musicId", -1608123016);
        setField(term22308, term22308.getClass(), "name", "wIuJvIvEMb");
        setField(term22308, term22308.getClass(), "sortName", "EyojsbSjWT");
        setField(term22308, term22308.getClass(), "copyright", "szGicGyWDL");
        setField(term22308, term22308.getClass(), "artistName", "lkdvUiYwRq");
        setField(term22308, term22308.getClass(), "genre", enum39);
        setField(term22308, term22308.getClass(), "releaseVersion", "XuxkPrpfND");
        setField(term22308, term22308.getClass(), "levels", term22398);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GuVQjhBxma";
        callMethod(klass, "setName", argTypes, term22308, args);
    }

};


