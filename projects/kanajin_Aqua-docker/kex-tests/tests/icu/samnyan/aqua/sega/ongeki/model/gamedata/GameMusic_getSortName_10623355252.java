package icu.samnyan.aqua.sega.ongeki.model.gamedata;

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
import static icu.samnyan.aqua.sega.ongeki.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameMusic_getSortName_10623355252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12087;

    public GameMusic_getSortName_10623355252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12087 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term12087, term12087.getClass(), "id", 305759998609888272L);
        setField(term12087, term12087.getClass(), "name", "IHqvyhMtuM");
        setField(term12087, term12087.getClass(), "sortName", "dAldIGYAXV");
        setField(term12087, term12087.getClass(), "artistName", "mLwibAPEsa");
        setField(term12087, term12087.getClass(), "genre", "zsWKWiTFuo");
        setIntField(term12087, term12087.getClass(), "bossCardId", 890669485);
        setIntField(term12087, term12087.getClass(), "bossLevel", 691577392);
        setField(term12087, term12087.getClass(), "level0", "UPUbwyHQKN");
        setField(term12087, term12087.getClass(), "level1", "lgQkrXANyI");
        setField(term12087, term12087.getClass(), "level2", "MeTmRZXErV");
        setField(term12087, term12087.getClass(), "level3", "jNxbVmoZgq");
        setField(term12087, term12087.getClass(), "level4", "PvmBHIXaMY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortName", argTypes, term12087, args);
    }

};


