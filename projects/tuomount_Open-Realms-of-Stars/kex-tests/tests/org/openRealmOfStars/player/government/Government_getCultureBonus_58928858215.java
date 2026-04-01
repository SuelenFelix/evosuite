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

public class Government_getCultureBonus_58928858215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12108;

    public Government_getCultureBonus_58928858215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12209 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term12208 = ((Class) term12209).getDeclaredField((String) "HEIR_TO_THRONE");
        ((Field) term12208).setAccessible(true);
        Object enum23 = ((Field) term12208).get((Object) null);
        ArrayList term12182 = new ArrayList();
        ((ArrayList) term12182).add((Object)null);
        ((ArrayList) term12182).add((Object)null);
        ((ArrayList) term12182).add((Object)null);
        ((ArrayList) term12182).add((Object)null);
        ((ArrayList) term12182).add((Object)null);
        Object term12177 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term12177, term12177.getClass(), "traitId", "");
        setField(term12177, term12177.getClass(), "traitName", "");
        setField(term12177, term12177.getClass(), "description", "");
        setField(term12177, term12177.getClass(), "group", "");
        setField(term12177, term12177.getClass(), "conflictsWithIds", term12182);
        setByteField(term12177, term12177.getClass(), "traitPoints", (byte) -24);
        ArrayList term12175 = new ArrayList();
        ((ArrayList) term12175).add(term12177);
        term12108 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term12108, term12108.getClass(), "id", "XQfmqLbqHS");
        setField(term12108, term12108.getClass(), "name", "jLVLqQSjqg");
        setField(term12108, term12108.getClass(), "rulerSelection", enum23);
        setField(term12108, term12108.getClass(), "rulerTitleMale", "JKGueoHesL");
        setField(term12108, term12108.getClass(), "rulerTitleFemale", "CRAUqtVBkU");
        setField(term12108, term12108.getClass(), "traits", term12175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCultureBonus", argTypes, term12108, args);
    }

};


