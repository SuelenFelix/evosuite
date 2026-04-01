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
import java.lang.Object;
import java.util.ArrayList;

public class Intelligence_isSpyTradePossible_20409617904 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63099;

    public Intelligence_isSpyTradePossible_20409617904() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term63107 = new ArrayList();
        ((ArrayList) term63107).add((Object)null);
        ((ArrayList) term63107).add((Object)null);
        ((ArrayList) term63107).add((Object)null);
        ((ArrayList) term63107).add((Object)null);
        term63099 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.Intelligence"));
        Object[] term63100 = (Object[]) newArray("org.openRealmOfStars.player.espionage.IntelligenceList", 1);
        Object term63101 = newInstance(Class.forName("org.openRealmOfStars.player.espionage.IntelligenceList"));
        setIntField(term63101, term63101.getClass(), "playerIndex", -1038188576);
        setIntField(term63101, term63101.getClass(), "intelligenceLevel1Estimate", -190354157);
        setIntField(term63101, term63101.getClass(), "intelligenceLevel3Estimate", 878906837);
        setIntField(term63101, term63101.getClass(), "intelligenceLevel5Estimate", -1578163757);
        setIntField(term63101, term63101.getClass(), "intelligenceLevel7Estimate", -1361859122);
        setField(term63101, term63101.getClass(), "list", term63107);
        setElement(term63100, 0, term63101);
        setField(term63099, term63099.getClass(), "intelligenceLists", term63100);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.espionage.Intelligence");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isSpyTradePossible", argTypes, term63099, args);
    }

};


