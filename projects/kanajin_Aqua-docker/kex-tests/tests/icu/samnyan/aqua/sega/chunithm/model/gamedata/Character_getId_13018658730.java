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

public class Character_getId_13018658730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14923;

    public Character_getId_13018658730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14923 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term14923, term14923.getClass(), "id", -1804015692891701666L);
        setField(term14923, term14923.getClass(), "name", "FiYYLuailz");
        setField(term14923, term14923.getClass(), "releaseTag", "XebAeSnCKZ");
        setField(term14923, term14923.getClass(), "worksName", "GeddnXjHGy");
        setField(term14923, term14923.getClass(), "illustratorName", "vLTbaoAxBm");
        setField(term14923, term14923.getClass(), "firstSkillId", "BXTjEyEZxD");
        setField(term14923, term14923.getClass(), "skills", "oKhVzOKUFW");
        setField(term14923, term14923.getClass(), "addImages", "mNHyqmOAFy");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term14923, args);
    }

};


