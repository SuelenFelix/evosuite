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

public class Character_getWorksName_1613662463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15391;

    public Character_getWorksName_1613662463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15391 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term15391, term15391.getClass(), "id", 148047808219672941L);
        setField(term15391, term15391.getClass(), "name", "ceCWHUTQUM");
        setField(term15391, term15391.getClass(), "releaseTag", "LrqwfrKKtS");
        setField(term15391, term15391.getClass(), "worksName", "ZUdnQXfzCI");
        setField(term15391, term15391.getClass(), "illustratorName", "EULDrUNQvw");
        setField(term15391, term15391.getClass(), "firstSkillId", "BtvAvsJSei");
        setField(term15391, term15391.getClass(), "skills", "vqnBkkxoIa");
        setField(term15391, term15391.getClass(), "addImages", "bycpZjxXFn");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWorksName", argTypes, term15391, args);
    }

};


