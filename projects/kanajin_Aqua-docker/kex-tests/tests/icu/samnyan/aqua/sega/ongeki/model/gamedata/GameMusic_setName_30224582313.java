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

public class GameMusic_setName_30224582313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14311;

    public GameMusic_setName_30224582313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14311 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term14311, term14311.getClass(), "id", 5510783420697225605L);
        setField(term14311, term14311.getClass(), "name", "PSizQDoxxe");
        setField(term14311, term14311.getClass(), "sortName", "mKaHyMybrK");
        setField(term14311, term14311.getClass(), "artistName", "AyrEXuGrEj");
        setField(term14311, term14311.getClass(), "genre", "yevIIoVYHq");
        setIntField(term14311, term14311.getClass(), "bossCardId", 71190297);
        setIntField(term14311, term14311.getClass(), "bossLevel", 1202361360);
        setField(term14311, term14311.getClass(), "level0", "UuYWMTqWTV");
        setField(term14311, term14311.getClass(), "level1", "DSFGlcaXUb");
        setField(term14311, term14311.getClass(), "level2", "sHMXNUzNeM");
        setField(term14311, term14311.getClass(), "level3", "gPzGDOEPPw");
        setField(term14311, term14311.getClass(), "level4", "rwKoAngzCu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "VUkRVwROTl";
        callMethod(klass, "setName", argTypes, term14311, args);
    }

};


