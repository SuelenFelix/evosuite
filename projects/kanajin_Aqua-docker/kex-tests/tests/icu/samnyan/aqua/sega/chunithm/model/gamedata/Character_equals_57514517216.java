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

public class Character_equals_57514517216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17575;
     Object term17661;

    public Character_equals_57514517216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17575 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term17575, term17575.getClass(), "id", -6301101997917060727L);
        setField(term17575, term17575.getClass(), "name", "DcOhhAfJTI");
        setField(term17575, term17575.getClass(), "releaseTag", "gYTIkBFOoS");
        setField(term17575, term17575.getClass(), "worksName", "xmzSoVgiED");
        setField(term17575, term17575.getClass(), "illustratorName", "pdSvedKgPq");
        setField(term17575, term17575.getClass(), "firstSkillId", "epPTwvcoyb");
        setField(term17575, term17575.getClass(), "skills", "UBPHmOICBs");
        setField(term17575, term17575.getClass(), "addImages", "IDJUVPgUJf");
        term17661 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17661;
        callMethod(klass, "equals", argTypes, term17575, args);
    }

};


