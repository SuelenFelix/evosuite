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

public class Government_isXenophopic_89850733828 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18034;

    public Government_isXenophopic_89850733828() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18199 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term18198 = ((Class) term18199).getDeclaredField((String) "HEGEMONIA_RULER");
        ((Field) term18198).setAccessible(true);
        Object enum36 = ((Field) term18198).get((Object) null);
        ArrayList term18109 = new ArrayList();
        ((ArrayList) term18109).add((Object)null);
        ((ArrayList) term18109).add((Object)null);
        Object term18104 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term18104, term18104.getClass(), "traitId", "");
        setField(term18104, term18104.getClass(), "traitName", "");
        setField(term18104, term18104.getClass(), "description", "");
        setField(term18104, term18104.getClass(), "group", "");
        setField(term18104, term18104.getClass(), "conflictsWithIds", term18109);
        setByteField(term18104, term18104.getClass(), "traitPoints", (byte) -124);
        ArrayList term18118 = new ArrayList();
        ((ArrayList) term18118).add((Object)null);
        ((ArrayList) term18118).add((Object)null);
        ((ArrayList) term18118).add((Object)null);
        Object term18113 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term18113, term18113.getClass(), "traitId", "");
        setField(term18113, term18113.getClass(), "traitName", "");
        setField(term18113, term18113.getClass(), "description", "");
        setField(term18113, term18113.getClass(), "group", "");
        setField(term18113, term18113.getClass(), "conflictsWithIds", term18118);
        setByteField(term18113, term18113.getClass(), "traitPoints", (byte) -105);
        ArrayList term18127 = new ArrayList();
        ((ArrayList) term18127).add((Object)null);
        ((ArrayList) term18127).add((Object)null);
        ((ArrayList) term18127).add((Object)null);
        ((ArrayList) term18127).add((Object)null);
        ((ArrayList) term18127).add((Object)null);
        ((ArrayList) term18127).add((Object)null);
        Object term18122 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term18122, term18122.getClass(), "traitId", "");
        setField(term18122, term18122.getClass(), "traitName", "");
        setField(term18122, term18122.getClass(), "description", "");
        setField(term18122, term18122.getClass(), "group", "");
        setField(term18122, term18122.getClass(), "conflictsWithIds", term18127);
        setByteField(term18122, term18122.getClass(), "traitPoints", (byte) 25);
        ArrayList term18136 = new ArrayList();
        ((ArrayList) term18136).add((Object)null);
        Object term18131 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term18131, term18131.getClass(), "traitId", "");
        setField(term18131, term18131.getClass(), "traitName", "");
        setField(term18131, term18131.getClass(), "description", "");
        setField(term18131, term18131.getClass(), "group", "");
        setField(term18131, term18131.getClass(), "conflictsWithIds", term18136);
        setByteField(term18131, term18131.getClass(), "traitPoints", (byte) 16);
        ArrayList term18145 = new ArrayList();
        ((ArrayList) term18145).add((Object)null);
        ((ArrayList) term18145).add((Object)null);
        ((ArrayList) term18145).add((Object)null);
        ((ArrayList) term18145).add((Object)null);
        ((ArrayList) term18145).add((Object)null);
        ((ArrayList) term18145).add((Object)null);
        ((ArrayList) term18145).add((Object)null);
        Object term18140 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term18140, term18140.getClass(), "traitId", "");
        setField(term18140, term18140.getClass(), "traitName", "");
        setField(term18140, term18140.getClass(), "description", "");
        setField(term18140, term18140.getClass(), "group", "");
        setField(term18140, term18140.getClass(), "conflictsWithIds", term18145);
        setByteField(term18140, term18140.getClass(), "traitPoints", (byte) 39);
        ArrayList term18154 = new ArrayList();
        ((ArrayList) term18154).add((Object)null);
        ((ArrayList) term18154).add((Object)null);
        ((ArrayList) term18154).add((Object)null);
        Object term18149 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term18149, term18149.getClass(), "traitId", "");
        setField(term18149, term18149.getClass(), "traitName", "");
        setField(term18149, term18149.getClass(), "description", "");
        setField(term18149, term18149.getClass(), "group", "");
        setField(term18149, term18149.getClass(), "conflictsWithIds", term18154);
        setByteField(term18149, term18149.getClass(), "traitPoints", (byte) 123);
        ArrayList term18163 = new ArrayList();
        ((ArrayList) term18163).add((Object)null);
        ((ArrayList) term18163).add((Object)null);
        ((ArrayList) term18163).add((Object)null);
        ((ArrayList) term18163).add((Object)null);
        Object term18158 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term18158, term18158.getClass(), "traitId", "");
        setField(term18158, term18158.getClass(), "traitName", "");
        setField(term18158, term18158.getClass(), "description", "");
        setField(term18158, term18158.getClass(), "group", "");
        setField(term18158, term18158.getClass(), "conflictsWithIds", term18163);
        setByteField(term18158, term18158.getClass(), "traitPoints", (byte) 16);
        ArrayList term18172 = new ArrayList();
        ((ArrayList) term18172).add((Object)null);
        ((ArrayList) term18172).add((Object)null);
        ((ArrayList) term18172).add((Object)null);
        ((ArrayList) term18172).add((Object)null);
        ((ArrayList) term18172).add((Object)null);
        ((ArrayList) term18172).add((Object)null);
        ((ArrayList) term18172).add((Object)null);
        Object term18167 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term18167, term18167.getClass(), "traitId", "");
        setField(term18167, term18167.getClass(), "traitName", "");
        setField(term18167, term18167.getClass(), "description", "");
        setField(term18167, term18167.getClass(), "group", "");
        setField(term18167, term18167.getClass(), "conflictsWithIds", term18172);
        setByteField(term18167, term18167.getClass(), "traitPoints", (byte) 2);
        ArrayList term18102 = new ArrayList();
        ((ArrayList) term18102).add(term18104);
        ((ArrayList) term18102).add(term18113);
        ((ArrayList) term18102).add(term18122);
        ((ArrayList) term18102).add(term18131);
        ((ArrayList) term18102).add(term18140);
        ((ArrayList) term18102).add(term18149);
        ((ArrayList) term18102).add(term18158);
        ((ArrayList) term18102).add(term18167);
        term18034 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term18034, term18034.getClass(), "id", "FbBMtntDbw");
        setField(term18034, term18034.getClass(), "name", "zRnpRGaHlI");
        setField(term18034, term18034.getClass(), "rulerSelection", enum36);
        setField(term18034, term18034.getClass(), "rulerTitleMale", "dVHfxjbMRK");
        setField(term18034, term18034.getClass(), "rulerTitleFemale", "LzwyLxKJpw");
        setField(term18034, term18034.getClass(), "traits", term18102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isXenophopic", argTypes, term18034, args);
    }

};


