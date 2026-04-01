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

public class Government_allowArmedFreighters_92189018821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14854;

    public Government_allowArmedFreighters_92189018821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14946 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term14945 = ((Class) term14946).getDeclaredField((String) "CEO_AS_A_RULER");
        ((Field) term14945).setAccessible(true);
        Object enum29 = ((Field) term14945).get((Object) null);
        ArrayList term14921 = new ArrayList();
        term14854 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term14854, term14854.getClass(), "id", "yLnzGqyHGL");
        setField(term14854, term14854.getClass(), "name", "IjprPXBDuY");
        setField(term14854, term14854.getClass(), "rulerSelection", enum29);
        setField(term14854, term14854.getClass(), "rulerTitleMale", "wkqPmmFDAa");
        setField(term14854, term14854.getClass(), "rulerTitleFemale", "rLTDtNqLyW");
        setField(term14854, term14854.getClass(), "traits", term14921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "allowArmedFreighters", argTypes, term14854, args);
    }

};


