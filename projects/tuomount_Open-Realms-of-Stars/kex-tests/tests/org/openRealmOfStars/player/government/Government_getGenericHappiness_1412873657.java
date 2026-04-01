package org.openRealmOfStars.player.government;

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
import static org.openRealmOfStars.player.government.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class Government_getGenericHappiness_1412873657 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8400;

    public Government_getGenericHappiness_1412873657() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8492 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term8491 = ((Class) term8492).getDeclaredField((String) "ELECTION_TYPE1");
        ((Field) term8491).setAccessible(true);
        Object enum15 = ((Field) term8491).get((Object) null);
        ArrayList term8467 = new ArrayList();
        term8400 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term8400, term8400.getClass(), "id", "uXYcXVYJZM");
        setField(term8400, term8400.getClass(), "name", "BJhjdJUhkz");
        setField(term8400, term8400.getClass(), "rulerSelection", enum15);
        setField(term8400, term8400.getClass(), "rulerTitleMale", "cdHYQDgUZR");
        setField(term8400, term8400.getClass(), "rulerTitleFemale", "KAORSSPSeV");
        setField(term8400, term8400.getClass(), "traits", term8467);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGenericHappiness", argTypes, term8400, args);
    }

};


