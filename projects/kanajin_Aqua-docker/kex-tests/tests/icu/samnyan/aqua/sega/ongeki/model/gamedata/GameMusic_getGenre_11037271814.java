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

public class GameMusic_getGenre_11037271814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12491;

    public GameMusic_getGenre_11037271814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12491 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term12491, term12491.getClass(), "id", -5248475803419977214L);
        setField(term12491, term12491.getClass(), "name", "nKZKnxWYCK");
        setField(term12491, term12491.getClass(), "sortName", "JOqQxuzRuZ");
        setField(term12491, term12491.getClass(), "artistName", "RSaoipUlsg");
        setField(term12491, term12491.getClass(), "genre", "cSHGbqKqlN");
        setIntField(term12491, term12491.getClass(), "bossCardId", 906181092);
        setIntField(term12491, term12491.getClass(), "bossLevel", 1045657203);
        setField(term12491, term12491.getClass(), "level0", "pFAfANnxup");
        setField(term12491, term12491.getClass(), "level1", "FbSIUZyBXZ");
        setField(term12491, term12491.getClass(), "level2", "mhQDwIyrRi");
        setField(term12491, term12491.getClass(), "level3", "HpZXWDPhlg");
        setField(term12491, term12491.getClass(), "level4", "lBOokzEPfe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenre", argTypes, term12491, args);
    }

};


