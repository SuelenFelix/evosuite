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

public class SavedGame_getPlayerRace_126938065211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251918;

    public SavedGame_getPlayerRace_126938065211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term251918 = newInstance(Class.forName("org.openRealmOfStars.game.SavedGame"));
        setField(term251918, term251918.getClass(), "playerRace", null);
        setIntField(term251918, term251918.getClass(), "starYear", 0);
        setIntField(term251918, term251918.getClass(), "realms", 0);
        setField(term251918, term251918.getClass(), "galaxySize", null);
        setField(term251918, term251918.getClass(), "filename", null);
        setField(term251918, term251918.getClass(), "empireName", null);
        setField(term251918, term251918.getClass(), "creationTime", null);
        setLongField(term251918, term251918.getClass(), "creationTimeMillis", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.game.SavedGame");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerRace", argTypes, term251918, args);
    }

};


