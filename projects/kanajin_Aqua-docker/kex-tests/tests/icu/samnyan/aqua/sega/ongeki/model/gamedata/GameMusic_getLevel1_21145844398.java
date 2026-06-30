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

public class GameMusic_getLevel1_21145844398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13299;

    public GameMusic_getLevel1_21145844398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13299 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term13299, term13299.getClass(), "id", 682356318767179819L);
        setField(term13299, term13299.getClass(), "name", "orEuhCStGM");
        setField(term13299, term13299.getClass(), "sortName", "HhEaSXWvrY");
        setField(term13299, term13299.getClass(), "artistName", "CVRGEomOth");
        setField(term13299, term13299.getClass(), "genre", "vSeruUyNWX");
        setIntField(term13299, term13299.getClass(), "bossCardId", -375014958);
        setIntField(term13299, term13299.getClass(), "bossLevel", 1107176718);
        setField(term13299, term13299.getClass(), "level0", "UkKvaeJfEC");
        setField(term13299, term13299.getClass(), "level1", "WPxXsahPRq");
        setField(term13299, term13299.getClass(), "level2", "IENRuqmwUU");
        setField(term13299, term13299.getClass(), "level3", "GsWxOwXvSu");
        setField(term13299, term13299.getClass(), "level4", "bKBSncrMEZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel1", argTypes, term13299, args);
    }

};


