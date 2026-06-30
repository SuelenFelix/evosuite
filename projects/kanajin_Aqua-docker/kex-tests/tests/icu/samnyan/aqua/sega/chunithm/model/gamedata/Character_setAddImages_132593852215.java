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

public class Character_setAddImages_132593852215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17397;

    public Character_setAddImages_132593852215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17397 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character"));
        setLongField(term17397, term17397.getClass(), "id", -6587807377747738663L);
        setField(term17397, term17397.getClass(), "name", "uWqXrwAsDU");
        setField(term17397, term17397.getClass(), "releaseTag", "hgFbWAUtsu");
        setField(term17397, term17397.getClass(), "worksName", "HqoTWlkbwF");
        setField(term17397, term17397.getClass(), "illustratorName", "CwNELDTAPP");
        setField(term17397, term17397.getClass(), "firstSkillId", "GSzQdbHLHw");
        setField(term17397, term17397.getClass(), "skills", "IkfarsYNJO");
        setField(term17397, term17397.getClass(), "addImages", "aZKOWhHMEh");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.gamedata.Character");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YfkhviKZwl";
        callMethod(klass, "setAddImages", argTypes, term17397, args);
    }

};


