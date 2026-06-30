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

public class Character_getSkills_91083868328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18369;

    public Character_getSkills_91083868328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18369 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term18369, term18369.getClass(), "id", 0L);
        setField(term18369, term18369.getClass(), "name", null);
        setField(term18369, term18369.getClass(), "releaseTag", null);
        setField(term18369, term18369.getClass(), "worksName", null);
        setField(term18369, term18369.getClass(), "illustratorName", null);
        setField(term18369, term18369.getClass(), "firstSkillId", null);
        setField(term18369, term18369.getClass(), "skills", null);
        setField(term18369, term18369.getClass(), "addImages", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSkills", argTypes, term18369, args);
    }

};


