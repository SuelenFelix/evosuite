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

public class Character_setName_9464727089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16329;

    public Character_setName_9464727089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16329 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term16329, term16329.getClass(), "id", 8802866251294305945L);
        setField(term16329, term16329.getClass(), "name", "DAxyHoTLzZ");
        setField(term16329, term16329.getClass(), "releaseTag", "fhZgTouhCC");
        setField(term16329, term16329.getClass(), "worksName", "wrikqJwXvL");
        setField(term16329, term16329.getClass(), "illustratorName", "UiWhvbypdr");
        setField(term16329, term16329.getClass(), "firstSkillId", "CgleElJNje");
        setField(term16329, term16329.getClass(), "skills", "ZrchvNGMtd");
        setField(term16329, term16329.getClass(), "addImages", "WaEcyVlcIx");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ONcbPCQnHd";
        callMethod(klass, "setName", argTypes, term16329, args);
    }

};


