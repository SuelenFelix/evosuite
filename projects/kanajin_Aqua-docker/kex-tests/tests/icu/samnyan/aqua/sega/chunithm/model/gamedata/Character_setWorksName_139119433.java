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

public class Character_setWorksName_139119433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18381;

    public Character_setWorksName_139119433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18381 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term18381, term18381.getClass(), "id", 0L);
        setField(term18381, term18381.getClass(), "name", null);
        setField(term18381, term18381.getClass(), "releaseTag", null);
        setField(term18381, term18381.getClass(), "worksName", null);
        setField(term18381, term18381.getClass(), "illustratorName", null);
        setField(term18381, term18381.getClass(), "firstSkillId", null);
        setField(term18381, term18381.getClass(), "skills", null);
        setField(term18381, term18381.getClass(), "addImages", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setWorksName", argTypes, term18381, args);
    }

};


