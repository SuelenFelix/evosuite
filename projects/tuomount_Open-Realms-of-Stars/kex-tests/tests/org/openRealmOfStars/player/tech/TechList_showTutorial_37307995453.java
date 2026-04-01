package org.openRealmOfStars.player.tech;

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
import static org.openRealmOfStars.player.tech.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class TechList_showTutorial_37307995453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419239;
     Object term419240;

    public TechList_showTutorial_37307995453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term419239 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term419239, term419239.getClass(), "techList", null);
        setField(term419239, term419239.getClass(), "techLevels", null);
        setField(term419239, term419239.getClass(), "techFocus", null);
        setField(term419239, term419239.getClass(), "techResearchPoint", null);
        setField(term419239, term419239.getClass(), "race", null);
        term419240 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = term419240;
        args[1] = null;
        callMethod(klass, "showTutorial", argTypes, term419239, args);
    }

};


