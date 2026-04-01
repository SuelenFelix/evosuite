package org.openRealmOfStars.player.fleet;

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
import static org.openRealmOfStars.player.fleet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fleet_getCulturalValue_1735611494147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194072;

    public Fleet_getCulturalValue_1735611494147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194072 = newInstance(Class.forName("org.openRealmOfStars.player.fleet.Fleet"));
        setField(term194072, term194072.getClass(), "ships", null);
        setField(term194072, term194072.getClass(), "coordinate", null);
        setField(term194072, term194072.getClass(), "name", null);
        setIntField(term194072, term194072.getClass(), "movesLeft", 0);
        setField(term194072, term194072.getClass(), "route", null);
        setField(term194072, term194072.getClass(), "commander", null);
        setField(term194072, term194072.getClass(), "aStarSearch", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.fleet.Fleet");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCulturalValue", argTypes, term194072, args);
    }

};


