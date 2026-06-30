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
import java.lang.Integer;

public class Level_setDiff_166236230411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7184;
     Object term7282;

    public Level_setDiff_166236230411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7325 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term7324 = ((Class) term7325).getDeclaredField((String) "VARIETY");
        ((Field) term7324).setAccessible(true);
        Object enum12 = ((Field) term7324).get((Object) null);
        HashMap term7268 = new HashMap();
        term7184 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term7186 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term7184, term7184.getClass(), "id", 2701184207686293431L);
        setIntField(term7186, term7186.getClass(), "musicId", -1553893255);
        setField(term7186, term7186.getClass(), "name", "vLerpqavFM");
        setField(term7186, term7186.getClass(), "sortName", "qnvxzwuGKX");
        setField(term7186, term7186.getClass(), "copyright", "EdPAvpluZg");
        setField(term7186, term7186.getClass(), "artistName", "DzHVBMqWtE");
        setField(term7186, term7186.getClass(), "genre", enum12);
        setField(term7186, term7186.getClass(), "releaseVersion", "THZSpzBRYP");
        setField(term7186, term7186.getClass(), "levels", term7268);
        setField(term7184, term7184.getClass(), "music", term7186);
        setBooleanField(term7184, term7184.getClass(), "enable", false);
        setIntField(term7184, term7184.getClass(), "level", 908108726);
        setIntField(term7184, term7184.getClass(), "levelDecimal", 1023209512);
        setIntField(term7184, term7184.getClass(), "diff", 1084849225);
        term7282 = new Integer(-1702055571);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term7282;
        callMethod(klass, "setDiff", argTypes, term7184, args);
    }

};


