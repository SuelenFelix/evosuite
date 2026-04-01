package org.openRealmOfStars.game;

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
import static org.openRealmOfStars.game.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SavedGame_getGalaxySize_139093368013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251926;

    public SavedGame_getGalaxySize_139093368013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251926 = newInstance(Class.forName("org.openRealmOfStars.game.SavedGame"));
        setField(term251926, term251926.getClass(), "playerRace", null);
        setIntField(term251926, term251926.getClass(), "starYear", 0);
        setIntField(term251926, term251926.getClass(), "realms", 0);
        setField(term251926, term251926.getClass(), "galaxySize", null);
        setField(term251926, term251926.getClass(), "filename", null);
        setField(term251926, term251926.getClass(), "empireName", null);
        setField(term251926, term251926.getClass(), "creationTime", null);
        setLongField(term251926, term251926.getClass(), "creationTimeMillis", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.SavedGame");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGalaxySize", argTypes, term251926, args);
    }

};


