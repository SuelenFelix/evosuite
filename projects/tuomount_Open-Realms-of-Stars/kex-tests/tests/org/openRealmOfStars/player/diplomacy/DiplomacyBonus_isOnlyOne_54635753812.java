package org.openRealmOfStars.player.diplomacy;

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
import static org.openRealmOfStars.player.diplomacy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DiplomacyBonus_isOnlyOne_54635753812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7371;

    public DiplomacyBonus_isOnlyOne_54635753812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7371 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term7371, term7371.getClass(), "type", null);
        setBooleanField(term7371, term7371.getClass(), "onlyOne", false);
        setIntField(term7371, term7371.getClass(), "bonusValue", 0);
        setIntField(term7371, term7371.getClass(), "bonusLasting", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOnlyOne", argTypes, term7371, args);
    }

};


