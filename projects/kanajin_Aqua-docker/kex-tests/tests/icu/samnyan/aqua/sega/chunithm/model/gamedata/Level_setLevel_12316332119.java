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

public class Level_setLevel_12316332119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6311;
     Object term6409;

    public Level_setLevel_12316332119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6452 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term6451 = ((Class) term6452).getDeclaredField((String) "VARIETY");
        ((Field) term6451).setAccessible(true);
        Object enum10 = ((Field) term6451).get((Object) null);
        HashMap term6395 = new HashMap();
        term6311 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term6313 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term6311, term6311.getClass(), "id", -7291743527973326814L);
        setIntField(term6313, term6313.getClass(), "musicId", -1891015523);
        setField(term6313, term6313.getClass(), "name", "qYzsiuXOgS");
        setField(term6313, term6313.getClass(), "sortName", "bxrCBbrrct");
        setField(term6313, term6313.getClass(), "copyright", "CKWpJaaaxX");
        setField(term6313, term6313.getClass(), "artistName", "UBRmXJmfrt");
        setField(term6313, term6313.getClass(), "genre", enum10);
        setField(term6313, term6313.getClass(), "releaseVersion", "WZzvmIHhzZ");
        setField(term6313, term6313.getClass(), "levels", term6395);
        setField(term6311, term6311.getClass(), "music", term6313);
        setBooleanField(term6311, term6311.getClass(), "enable", false);
        setIntField(term6311, term6311.getClass(), "level", 1922684808);
        setIntField(term6311, term6311.getClass(), "levelDecimal", -2005784375);
        setIntField(term6311, term6311.getClass(), "diff", -288604325);
        term6409 = new Integer(-1268314569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term6409;
        callMethod(klass, "setLevel", argTypes, term6311, args);
    }

};


