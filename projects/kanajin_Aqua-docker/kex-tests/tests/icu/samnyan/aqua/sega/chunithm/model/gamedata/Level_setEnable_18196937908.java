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
import java.lang.Boolean;

public class Level_setEnable_18196937908 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5871;
     Object term5976;

    public Level_setEnable_18196937908() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6019 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term6018 = ((Class) term6019).getDeclaredField((String) "IRODORI");
        ((Field) term6018).setAccessible(true);
        Object enum9 = ((Field) term6018).get((Object) null);
        HashMap term5962 = new HashMap();
        term5871 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term5873 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term5871, term5871.getClass(), "id", -5248475803419977214L);
        setIntField(term5873, term5873.getClass(), "musicId", -2003192918);
        setField(term5873, term5873.getClass(), "name", "qCpEbQDHdF");
        setField(term5873, term5873.getClass(), "sortName", "AHbZyFOmlo");
        setField(term5873, term5873.getClass(), "copyright", "TwfWVQGiIj");
        setField(term5873, term5873.getClass(), "artistName", "gUvcueTURF");
        setField(term5873, term5873.getClass(), "genre", enum9);
        setField(term5873, term5873.getClass(), "releaseVersion", "EwQBhZjCIT");
        setField(term5873, term5873.getClass(), "levels", term5962);
        setField(term5871, term5871.getClass(), "music", term5873);
        setBooleanField(term5871, term5871.getClass(), "enable", false);
        setIntField(term5871, term5871.getClass(), "level", -765191335);
        setIntField(term5871, term5871.getClass(), "levelDecimal", -1697741155);
        setIntField(term5871, term5871.getClass(), "diff", 1295839803);
        term5976 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term5976;
        callMethod(klass, "setEnable", argTypes, term5871, args);
    }

};


