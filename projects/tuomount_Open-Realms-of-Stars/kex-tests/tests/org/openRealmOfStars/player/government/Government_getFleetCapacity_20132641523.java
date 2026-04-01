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

public class Government_getFleetCapacity_20132641523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15749;

    public Government_getFleetCapacity_20132641523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15850 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term15849 = ((Class) term15850).getDeclaredField((String) "HEIR_TO_THRONE");
        ((Field) term15849).setAccessible(true);
        Object enum31 = ((Field) term15849).get((Object) null);
        ArrayList term15823 = new ArrayList();
        ((ArrayList) term15823).add((Object)null);
        ((ArrayList) term15823).add((Object)null);
        ((ArrayList) term15823).add((Object)null);
        Object term15818 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term15818, term15818.getClass(), "traitId", "");
        setField(term15818, term15818.getClass(), "traitName", "");
        setField(term15818, term15818.getClass(), "description", "");
        setField(term15818, term15818.getClass(), "group", "");
        setField(term15818, term15818.getClass(), "conflictsWithIds", term15823);
        setByteField(term15818, term15818.getClass(), "traitPoints", (byte) -83);
        ArrayList term15816 = new ArrayList();
        ((ArrayList) term15816).add(term15818);
        term15749 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term15749, term15749.getClass(), "id", "dTGwgkfDVj");
        setField(term15749, term15749.getClass(), "name", "zHiuLPzYQM");
        setField(term15749, term15749.getClass(), "rulerSelection", enum31);
        setField(term15749, term15749.getClass(), "rulerTitleMale", "ioYxUYJBrh");
        setField(term15749, term15749.getClass(), "rulerTitleFemale", "GXoLEdKEIe");
        setField(term15749, term15749.getClass(), "traits", term15816);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFleetCapacity", argTypes, term15749, args);
    }

};


