package org.openRealmOfStars.player.espionage;

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
import static org.openRealmOfStars.player.espionage.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class IntelligenceList_isFleetTypeRecognized_17316600277 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6862;
     Object enum20;

    public IntelligenceList_isFleetTypeRecognized_17316600277() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6868 = new ArrayList();
        term6862 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term6862, term6862.getClass(), "playerIndex", -93135961);
        setIntField(term6862, term6862.getClass(), "intelligenceLevel1Estimate", -112921587);
        setIntField(term6862, term6862.getClass(), "intelligenceLevel3Estimate", 933028652);
        setIntField(term6862, term6862.getClass(), "intelligenceLevel5Estimate", 287287233);
        setIntField(term6862, term6862.getClass(), "intelligenceLevel7Estimate", 962840079);
        setField(term6862, term6862.getClass(), "list", term6868);
        Class<? extends Object> term6942 = Class.forName((String) "org.openRealmOfStars.player.fleet.FleetType");
        Field term6941 = ((Class) term6942).getDeclaredField((String) "NON_MILITARY");
        ((Field) term6941).setAccessible(true);
        enum20 = ((Field) term6941).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.fleet.FleetType");
        Object[] args = new Object[1];
        args[0] = enum20;
        callMethod(klass, "isFleetTypeRecognized", argTypes, term6862, args);
    }

};


