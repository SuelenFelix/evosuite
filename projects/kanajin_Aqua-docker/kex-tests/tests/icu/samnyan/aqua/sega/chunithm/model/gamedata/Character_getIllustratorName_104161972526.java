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

public class Character_getIllustratorName_104161972526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18365;

    public Character_getIllustratorName_104161972526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18365 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term18365, term18365.getClass(), "id", 0L);
        setField(term18365, term18365.getClass(), "name", null);
        setField(term18365, term18365.getClass(), "releaseTag", null);
        setField(term18365, term18365.getClass(), "worksName", null);
        setField(term18365, term18365.getClass(), "illustratorName", null);
        setField(term18365, term18365.getClass(), "firstSkillId", null);
        setField(term18365, term18365.getClass(), "skills", null);
        setField(term18365, term18365.getClass(), "addImages", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIllustratorName", argTypes, term18365, args);
    }

};


