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

public class Government_getHeirChance_44368526526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17063;

    public Government_getHeirChance_44368526526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17228 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term17227 = ((Class) term17228).getDeclaredField((String) "HEGEMONIA_RULER");
        ((Field) term17227).setAccessible(true);
        Object enum34 = ((Field) term17227).get((Object) null);
        ArrayList term17138 = new ArrayList();
        ((ArrayList) term17138).add((Object)null);
        ((ArrayList) term17138).add((Object)null);
        Object term17133 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term17133, term17133.getClass(), "traitId", "");
        setField(term17133, term17133.getClass(), "traitName", "");
        setField(term17133, term17133.getClass(), "description", "");
        setField(term17133, term17133.getClass(), "group", "");
        setField(term17133, term17133.getClass(), "conflictsWithIds", term17138);
        setByteField(term17133, term17133.getClass(), "traitPoints", (byte) 51);
        ArrayList term17147 = new ArrayList();
        Object term17142 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term17142, term17142.getClass(), "traitId", "");
        setField(term17142, term17142.getClass(), "traitName", "");
        setField(term17142, term17142.getClass(), "description", "");
        setField(term17142, term17142.getClass(), "group", "");
        setField(term17142, term17142.getClass(), "conflictsWithIds", term17147);
        setByteField(term17142, term17142.getClass(), "traitPoints", (byte) -53);
        ArrayList term17156 = new ArrayList();
        ((ArrayList) term17156).add((Object)null);
        ((ArrayList) term17156).add((Object)null);
        ((ArrayList) term17156).add((Object)null);
        Object term17151 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term17151, term17151.getClass(), "traitId", "");
        setField(term17151, term17151.getClass(), "traitName", "");
        setField(term17151, term17151.getClass(), "description", "");
        setField(term17151, term17151.getClass(), "group", "");
        setField(term17151, term17151.getClass(), "conflictsWithIds", term17156);
        setByteField(term17151, term17151.getClass(), "traitPoints", (byte) -8);
        ArrayList term17165 = new ArrayList();
        Object term17160 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term17160, term17160.getClass(), "traitId", "");
        setField(term17160, term17160.getClass(), "traitName", "");
        setField(term17160, term17160.getClass(), "description", "");
        setField(term17160, term17160.getClass(), "group", "");
        setField(term17160, term17160.getClass(), "conflictsWithIds", term17165);
        setByteField(term17160, term17160.getClass(), "traitPoints", (byte) -9);
        ArrayList term17174 = new ArrayList();
        Object term17169 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term17169, term17169.getClass(), "traitId", "");
        setField(term17169, term17169.getClass(), "traitName", "");
        setField(term17169, term17169.getClass(), "description", "");
        setField(term17169, term17169.getClass(), "group", "");
        setField(term17169, term17169.getClass(), "conflictsWithIds", term17174);
        setByteField(term17169, term17169.getClass(), "traitPoints", (byte) 97);
        ArrayList term17183 = new ArrayList();
        ((ArrayList) term17183).add((Object)null);
        ((ArrayList) term17183).add((Object)null);
        Object term17178 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term17178, term17178.getClass(), "traitId", "");
        setField(term17178, term17178.getClass(), "traitName", "");
        setField(term17178, term17178.getClass(), "description", "");
        setField(term17178, term17178.getClass(), "group", "");
        setField(term17178, term17178.getClass(), "conflictsWithIds", term17183);
        setByteField(term17178, term17178.getClass(), "traitPoints", (byte) -46);
        ArrayList term17192 = new ArrayList();
        ((ArrayList) term17192).add((Object)null);
        ((ArrayList) term17192).add((Object)null);
        ((ArrayList) term17192).add((Object)null);
        ((ArrayList) term17192).add((Object)null);
        ((ArrayList) term17192).add((Object)null);
        ((ArrayList) term17192).add((Object)null);
        ((ArrayList) term17192).add((Object)null);
        ((ArrayList) term17192).add((Object)null);
        ((ArrayList) term17192).add((Object)null);
        Object term17187 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term17187, term17187.getClass(), "traitId", "");
        setField(term17187, term17187.getClass(), "traitName", "");
        setField(term17187, term17187.getClass(), "description", "");
        setField(term17187, term17187.getClass(), "group", "");
        setField(term17187, term17187.getClass(), "conflictsWithIds", term17192);
        setByteField(term17187, term17187.getClass(), "traitPoints", (byte) 14);
        ArrayList term17201 = new ArrayList();
        ((ArrayList) term17201).add((Object)null);
        ((ArrayList) term17201).add((Object)null);
        ((ArrayList) term17201).add((Object)null);
        ((ArrayList) term17201).add((Object)null);
        ((ArrayList) term17201).add((Object)null);
        ((ArrayList) term17201).add((Object)null);
        Object term17196 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term17196, term17196.getClass(), "traitId", "");
        setField(term17196, term17196.getClass(), "traitName", "");
        setField(term17196, term17196.getClass(), "description", "");
        setField(term17196, term17196.getClass(), "group", "");
        setField(term17196, term17196.getClass(), "conflictsWithIds", term17201);
        setByteField(term17196, term17196.getClass(), "traitPoints", (byte) 34);
        ArrayList term17131 = new ArrayList();
        ((ArrayList) term17131).add(term17133);
        ((ArrayList) term17131).add(term17142);
        ((ArrayList) term17131).add(term17151);
        ((ArrayList) term17131).add(term17160);
        ((ArrayList) term17131).add(term17169);
        ((ArrayList) term17131).add(term17178);
        ((ArrayList) term17131).add(term17187);
        ((ArrayList) term17131).add(term17196);
        term17063 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term17063, term17063.getClass(), "id", "LFjgROsRUV");
        setField(term17063, term17063.getClass(), "name", "kHxujKiCsr");
        setField(term17063, term17063.getClass(), "rulerSelection", enum34);
        setField(term17063, term17063.getClass(), "rulerTitleMale", "cseZveWowm");
        setField(term17063, term17063.getClass(), "rulerTitleFemale", "idfslIPhgx");
        setField(term17063, term17063.getClass(), "traits", term17131);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeirChance", argTypes, term17063, args);
    }

};


