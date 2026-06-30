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

public class GameMusic_getName_14176307451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11885;

    public GameMusic_getName_14176307451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11885 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term11885, term11885.getClass(), "id", 463622836963501975L);
        setField(term11885, term11885.getClass(), "name", "vOVuNSCCLe");
        setField(term11885, term11885.getClass(), "sortName", "fzeqPnzpnt");
        setField(term11885, term11885.getClass(), "artistName", "RxbhrFBjkO");
        setField(term11885, term11885.getClass(), "genre", "aanyiAOJCl");
        setIntField(term11885, term11885.getClass(), "bossCardId", -1801760683);
        setIntField(term11885, term11885.getClass(), "bossLevel", 1141317871);
        setField(term11885, term11885.getClass(), "level0", "VDokbsCuqq");
        setField(term11885, term11885.getClass(), "level1", "xClUIcPECX");
        setField(term11885, term11885.getClass(), "level2", "avhRaGZaBF");
        setField(term11885, term11885.getClass(), "level3", "JkgoRtImdE");
        setField(term11885, term11885.getClass(), "level4", "qFGKIJjlmV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term11885, args);
    }

};


