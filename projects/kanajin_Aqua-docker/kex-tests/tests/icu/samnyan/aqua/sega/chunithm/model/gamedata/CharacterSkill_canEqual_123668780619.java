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

public class CharacterSkill_canEqual_123668780619 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14915;

    public CharacterSkill_canEqual_123668780619() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14915 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.CharacterSkill"));
        setLongField(term14915, term14915.getClass(), "id", 0L);
        setField(term14915, term14915.getClass(), "name", null);
        setField(term14915, term14915.getClass(), "category", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.CharacterSkill");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term14915, args);
    }

};


