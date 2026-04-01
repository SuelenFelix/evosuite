package org.openRealmOfStars.player.government.trait;

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
import static org.openRealmOfStars.player.government.trait.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class GovTrait_isTraitConflict_8190787109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1479;
     Object term1617;

    public GovTrait_isTraitConflict_8190787109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1528 = new ArrayList();
        ((ArrayList) term1528).add("JUmudUmaaV");
        ((ArrayList) term1528).add("KoyGrUJeJW");
        ((ArrayList) term1528).add("HqBOwkVqjD");
        ((ArrayList) term1528).add("MAcUBcBckh");
        ((ArrayList) term1528).add("oVgzLbrsFr");
        ((ArrayList) term1528).add("vQVyKLdtaz");
        ((ArrayList) term1528).add("OWKQODBLzb");
        term1479 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term1479, term1479.getClass(), "traitId", "tPlsykYBqO");
        setField(term1479, term1479.getClass(), "traitName", "bLPjGVBhlX");
        setField(term1479, term1479.getClass(), "description", "whBvTVIIlC");
        setField(term1479, term1479.getClass(), "group", "IgRJUzaCwW");
        setField(term1479, term1479.getClass(), "conflictsWithIds", term1528);
        setByteField(term1479, term1479.getClass(), "traitPoints", (byte) 79);
        ArrayList term1667 = new ArrayList();
        ((ArrayList) term1667).add("");
        ((ArrayList) term1667).add("");
        ((ArrayList) term1667).add("");
        ((ArrayList) term1667).add("");
        ((ArrayList) term1667).add("");
        ((ArrayList) term1667).add("");
        term1617 = (Object[]) newArray("org.openRealmOfStars.player.government.trait.GovTrait", 1);
        Object term1618 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term1618, term1618.getClass(), "traitId", "wGmYcqUkgE");
        setField(term1618, term1618.getClass(), "traitName", "idgaQsnJpQ");
        setField(term1618, term1618.getClass(), "description", "VgZnGoIFwQ");
        setField(term1618, term1618.getClass(), "group", "jUbSRrkrYZ");
        setField(term1618, term1618.getClass(), "conflictsWithIds", term1667);
        setByteField(term1618, term1618.getClass(), "traitPoints", (byte) -119);
        setElement(term1617, 0, term1618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.trait.GovTrait");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.government.trait.GovTrait");
        argTypes[1] = Array.newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term1479;
        args[1] = term1617;
        callMethod(klass, "isTraitConflict", argTypes, null, args);
    }

};


