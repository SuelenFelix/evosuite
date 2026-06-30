package icu.samnyan.aqua.sega.chusan.model.gamedata;

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
import static icu.samnyan.aqua.sega.chusan.model.gamedata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Character_setName_16697908467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3449;

    public Character_setName_16697908467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3449 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character"));
        setLongField(term3449, term3449.getClass(), "id", 4784595517102746672L);
        setField(term3449, term3449.getClass(), "name", "IgRJUzaCwW");
        setField(term3449, term3449.getClass(), "releaseTag", "JUmudUmaaV");
        setField(term3449, term3449.getClass(), "worksName", "KoyGrUJeJW");
        setField(term3449, term3449.getClass(), "illustratorName", "HqBOwkVqjD");
        setField(term3449, term3449.getClass(), "addImages", "MAcUBcBckh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVgzLbrsFr";
        callMethod(klass, "setName", argTypes, term3449, args);
    }

};


