package org.openRealmOfStars.utilities.repository;

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
import static org.openRealmOfStars.utilities.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DiplomacyRepository_saveDiplomacy_30323545412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1714;

    public DiplomacyRepository_saveDiplomacy_30323545412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1714 = newInstance(Class.forName("org.openRealmOfStars.utilities.repository.DiplomacyRepository"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.DiplomacyRepository");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "saveDiplomacy", argTypes, term1714, args);
    }

};


