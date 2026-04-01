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
import java.lang.String;
import java.lang.Object;

public class DiplomacyBonus_isOnlyOne_5463575383 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5025;

    public DiplomacyBonus_isOnlyOne_5463575383() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5068 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term5067 = ((Class) term5068).getDeclaredField((String) "SIMILAR_GOVERNMENT_DIFFERENT_GROUP");
        ((Field) term5067).setAccessible(true);
        Object enum11 = ((Field) term5067).get((Object) null);
        term5025 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term5025, term5025.getClass(), "type", enum11);
        setBooleanField(term5025, term5025.getClass(), "onlyOne", false);
        setIntField(term5025, term5025.getClass(), "bonusValue", -616727354);
        setIntField(term5025, term5025.getClass(), "bonusLasting", -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isOnlyOne", argTypes, term5025, args);
    }

};


