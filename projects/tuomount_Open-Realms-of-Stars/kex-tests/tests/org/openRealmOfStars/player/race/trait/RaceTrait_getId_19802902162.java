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

public class RaceTrait_getId_19802902162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227;

    public RaceTrait_getId_19802902162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term276 = new ArrayList();
        ((ArrayList) term276).add("tbcdzjIfER");
        ((ArrayList) term276).add("HyxfbSQYBe");
        ((ArrayList) term276).add("pCTimMblYc");
        ((ArrayList) term276).add("hNxWaHcfhY");
        term227 = newInstance(Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait"));
        setField(term227, term227.getClass(), "traitId", "LQFpaHEwXR");
        setField(term227, term227.getClass(), "traitName", "oVcInYnLWB");
        setField(term227, term227.getClass(), "description", "aJlieCFVtF");
        setField(term227, term227.getClass(), "group", "ZiaGIbnzTs");
        setField(term227, term227.getClass(), "conflictsWithIds", term276);
        setByteField(term227, term227.getClass(), "traitPoints", (byte) 89);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.race.trait.RaceTrait");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term227, args);
    }

};


