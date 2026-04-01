package org.openRealmOfStars.player.race.trait;

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
import static org.openRealmOfStars.player.race.trait.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class RaceTrait_getGroup_9089330247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1093;

    public RaceTrait_getGroup_9089330247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1142 = new ArrayList();
        ((ArrayList) term1142).add("YRHGsAkhxb");
        ((ArrayList) term1142).add("ffYhPOzlUs");
        term1093 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term1093, term1093.getClass(), "traitId", "UiUYnPrcCi");
        setField(term1093, term1093.getClass(), "traitName", "UoYtihxVaS");
        setField(term1093, term1093.getClass(), "description", "JDswTTCZHV");
        setField(term1093, term1093.getClass(), "group", "onpbIeEKoi");
        setField(term1093, term1093.getClass(), "conflictsWithIds", term1142);
        setByteField(term1093, term1093.getClass(), "traitPoints", (byte) -54);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGroup", argTypes, term1093, args);
    }

};


