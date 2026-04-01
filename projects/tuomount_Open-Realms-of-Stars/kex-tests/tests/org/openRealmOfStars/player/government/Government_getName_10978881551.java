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

public class Government_getName_10978881551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5497;

    public Government_getName_10978881551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term5626 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term5625 = ((Class) term5626).getDeclaredField((String) "HEGEMONIA_RULER");
        ((Field) term5625).setAccessible(true);
        Object enum9 = ((Field) term5625).get((Object) null);
        ArrayList term5572 = new ArrayList();
        ((ArrayList) term5572).add((Object)null);
        ((ArrayList) term5572).add((Object)null);
        ((ArrayList) term5572).add((Object)null);
        ((ArrayList) term5572).add((Object)null);
        ((ArrayList) term5572).add((Object)null);
        ((ArrayList) term5572).add((Object)null);
        ((ArrayList) term5572).add((Object)null);
        Object term5567 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term5567, term5567.getClass(), "traitId", "");
        setField(term5567, term5567.getClass(), "traitName", "");
        setField(term5567, term5567.getClass(), "description", "");
        setField(term5567, term5567.getClass(), "group", "");
        setField(term5567, term5567.getClass(), "conflictsWithIds", term5572);
        setByteField(term5567, term5567.getClass(), "traitPoints", (byte) -111);
        ArrayList term5581 = new ArrayList();
        ((ArrayList) term5581).add((Object)null);
        Object term5576 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term5576, term5576.getClass(), "traitId", "");
        setField(term5576, term5576.getClass(), "traitName", "");
        setField(term5576, term5576.getClass(), "description", "");
        setField(term5576, term5576.getClass(), "group", "");
        setField(term5576, term5576.getClass(), "conflictsWithIds", term5581);
        setByteField(term5576, term5576.getClass(), "traitPoints", (byte) 23);
        ArrayList term5590 = new ArrayList();
        ((ArrayList) term5590).add((Object)null);
        ((ArrayList) term5590).add((Object)null);
        ((ArrayList) term5590).add((Object)null);
        ((ArrayList) term5590).add((Object)null);
        ((ArrayList) term5590).add((Object)null);
        ((ArrayList) term5590).add((Object)null);
        ((ArrayList) term5590).add((Object)null);
        ((ArrayList) term5590).add((Object)null);
        Object term5585 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term5585, term5585.getClass(), "traitId", "");
        setField(term5585, term5585.getClass(), "traitName", "");
        setField(term5585, term5585.getClass(), "description", "");
        setField(term5585, term5585.getClass(), "group", "");
        setField(term5585, term5585.getClass(), "conflictsWithIds", term5590);
        setByteField(term5585, term5585.getClass(), "traitPoints", (byte) -15);
        ArrayList term5599 = new ArrayList();
        ((ArrayList) term5599).add((Object)null);
        ((ArrayList) term5599).add((Object)null);
        ((ArrayList) term5599).add((Object)null);
        ((ArrayList) term5599).add((Object)null);
        ((ArrayList) term5599).add((Object)null);
        ((ArrayList) term5599).add((Object)null);
        ((ArrayList) term5599).add((Object)null);
        Object term5594 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term5594, term5594.getClass(), "traitId", "");
        setField(term5594, term5594.getClass(), "traitName", "");
        setField(term5594, term5594.getClass(), "description", "");
        setField(term5594, term5594.getClass(), "group", "");
        setField(term5594, term5594.getClass(), "conflictsWithIds", term5599);
        setByteField(term5594, term5594.getClass(), "traitPoints", (byte) 36);
        ArrayList term5565 = new ArrayList();
        ((ArrayList) term5565).add(term5567);
        ((ArrayList) term5565).add(term5576);
        ((ArrayList) term5565).add(term5585);
        ((ArrayList) term5565).add(term5594);
        term5497 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term5497, term5497.getClass(), "id", "FwPbDZcHmB");
        setField(term5497, term5497.getClass(), "name", "hOncybyCAH");
        setField(term5497, term5497.getClass(), "rulerSelection", enum9);
        setField(term5497, term5497.getClass(), "rulerTitleMale", "QduALnDSVo");
        setField(term5497, term5497.getClass(), "rulerTitleFemale", "izPpKDErnQ");
        setField(term5497, term5497.getClass(), "traits", term5565);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term5497, args);
    }

};


