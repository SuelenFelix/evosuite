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

public class GameMusic_getLevel0_21145854007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13097;

    public GameMusic_getLevel0_21145854007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13097 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic"));
        setLongField(term13097, term13097.getClass(), "id", 6682528376118987775L);
        setField(term13097, term13097.getClass(), "name", "IkpjUOuWQU");
        setField(term13097, term13097.getClass(), "sortName", "boSSpezHeU");
        setField(term13097, term13097.getClass(), "artistName", "OUeBWNTQDh");
        setField(term13097, term13097.getClass(), "genre", "gltJarNuUk");
        setIntField(term13097, term13097.getClass(), "bossCardId", 568954359);
        setIntField(term13097, term13097.getClass(), "bossLevel", 53410913);
        setField(term13097, term13097.getClass(), "level0", "ZwZIDwYcSW");
        setField(term13097, term13097.getClass(), "level1", "sOdkipUKRu");
        setField(term13097, term13097.getClass(), "level2", "oKwCDqywym");
        setField(term13097, term13097.getClass(), "level3", "zjZYTddemL");
        setField(term13097, term13097.getClass(), "level4", "QtrylgCLiF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.gamedata.GameMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLevel0", argTypes, term13097, args);
    }

};


