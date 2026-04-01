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

public class Government_setRulerSelection_3417496083 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6405;
     Object enum11;

    public Government_setRulerSelection_3417496083() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6497 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term6496 = ((Class) term6497).getDeclaredField((String) "HEIR_TO_THRONE");
        ((Field) term6496).setAccessible(true);
        enum11 = ((Field) term6496).get((Object) null);
        ArrayList term6472 = new ArrayList();
        term6405 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term6405, term6405.getClass(), "id", "bnsyeQXFdu");
        setField(term6405, term6405.getClass(), "name", "BwtdjiefJn");
        setField(term6405, term6405.getClass(), "rulerSelection", enum11);
        setField(term6405, term6405.getClass(), "rulerTitleMale", "jDmhBrIoDa");
        setField(term6405, term6405.getClass(), "rulerTitleFemale", "SPtPatHeOm");
        setField(term6405, term6405.getClass(), "traits", term6472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.government.RulerSelection");
        Object[] args = new Object[1];
        args[0] = enum11;
        callMethod(klass, "setRulerSelection", argTypes, term6405, args);
    }

};


