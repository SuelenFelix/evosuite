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

public class TechList_getListForTypeAndLevel_139787794387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424446;
     Object term424447;

    public TechList_getListForTypeAndLevel_139787794387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424446 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term424446, term424446.getClass(), "techList", null);
        setField(term424446, term424446.getClass(), "techLevels", null);
        setField(term424446, term424446.getClass(), "techFocus", null);
        setField(term424446, term424446.getClass(), "techResearchPoint", null);
        setField(term424446, term424446.getClass(), "race", null);
        term424447 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.tech.TechType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term424447;
        callMethod(klass, "getListForTypeAndLevel", argTypes, term424446, args);
    }

};


