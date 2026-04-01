package org.openRealmOfStars.gui.list;

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
import static org.openRealmOfStars.gui.list.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class VotingListRenderer_setStarMap_12907592475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16186;

    public VotingListRenderer_setStarMap_12907592475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16186 = newInstance(Class.forName("org.openRealmOfStars.gui.list.VotingListRenderer"));
        setField(term16186, term16186.getClass(), "defaultRenderer", null);
        setField(term16186, term16186.getClass(), "map", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.gui.list.VotingListRenderer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setStarMap", argTypes, term16186, args);
    }

};


