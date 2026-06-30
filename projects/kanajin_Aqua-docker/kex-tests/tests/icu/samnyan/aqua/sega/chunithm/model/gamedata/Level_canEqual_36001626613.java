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

public class Level_canEqual_36001626613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8066;
     Object term8164;

    public Level_canEqual_36001626613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8206 = Class.forName((String) "icu.samnyan.aqua.sega.chunithm.model.gamedata.Genre");
        Field term8205 = ((Class) term8206).getDeclaredField((String) "VARIETY");
        ((Field) term8205).setAccessible(true);
        Object enum14 = ((Field) term8205).get((Object) null);
        HashMap term8150 = new HashMap();
        term8066 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level"));
        Object term8068 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Music"));
        setLongField(term8066, term8066.getClass(), "id", 7247160664318067468L);
        setIntField(term8068, term8068.getClass(), "musicId", 1723148410);
        setField(term8068, term8068.getClass(), "name", "mLwibAPEsa");
        setField(term8068, term8068.getClass(), "sortName", "zsWKWiTFuo");
        setField(term8068, term8068.getClass(), "copyright", "UPUbwyHQKN");
        setField(term8068, term8068.getClass(), "artistName", "lgQkrXANyI");
        setField(term8068, term8068.getClass(), "genre", enum14);
        setField(term8068, term8068.getClass(), "releaseVersion", "MeTmRZXErV");
        setField(term8068, term8068.getClass(), "levels", term8150);
        setField(term8066, term8066.getClass(), "music", term8068);
        setBooleanField(term8066, term8066.getClass(), "enable", true);
        setIntField(term8066, term8066.getClass(), "level", 510162332);
        setIntField(term8066, term8066.getClass(), "levelDecimal", 888506903);
        setIntField(term8066, term8066.getClass(), "diff", 200252898);
        term8164 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Level");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8164;
        callMethod(klass, "canEqual", argTypes, term8066, args);
    }

};


