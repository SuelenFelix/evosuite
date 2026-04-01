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

public class Government_hasPopulationRush_58570518219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13929;

    public Government_hasPopulationRush_58570518219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14075 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term14074 = ((Class) term14075).getDeclaredField((String) "ELECTION_TYPE1");
        ((Field) term14074).setAccessible(true);
        Object enum27 = ((Field) term14074).get((Object) null);
        ArrayList term14003 = new ArrayList();
        ((ArrayList) term14003).add((Object)null);
        ((ArrayList) term14003).add((Object)null);
        ((ArrayList) term14003).add((Object)null);
        ((ArrayList) term14003).add((Object)null);
        ((ArrayList) term14003).add((Object)null);
        ((ArrayList) term14003).add((Object)null);
        ((ArrayList) term14003).add((Object)null);
        ((ArrayList) term14003).add((Object)null);
        ((ArrayList) term14003).add((Object)null);
        Object term13998 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term13998, term13998.getClass(), "traitId", "");
        setField(term13998, term13998.getClass(), "traitName", "");
        setField(term13998, term13998.getClass(), "description", "");
        setField(term13998, term13998.getClass(), "group", "");
        setField(term13998, term13998.getClass(), "conflictsWithIds", term14003);
        setByteField(term13998, term13998.getClass(), "traitPoints", (byte) -74);
        ArrayList term14012 = new ArrayList();
        ((ArrayList) term14012).add((Object)null);
        ((ArrayList) term14012).add((Object)null);
        ((ArrayList) term14012).add((Object)null);
        ((ArrayList) term14012).add((Object)null);
        ((ArrayList) term14012).add((Object)null);
        ((ArrayList) term14012).add((Object)null);
        Object term14007 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term14007, term14007.getClass(), "traitId", "");
        setField(term14007, term14007.getClass(), "traitName", "");
        setField(term14007, term14007.getClass(), "description", "");
        setField(term14007, term14007.getClass(), "group", "");
        setField(term14007, term14007.getClass(), "conflictsWithIds", term14012);
        setByteField(term14007, term14007.getClass(), "traitPoints", (byte) -84);
        ArrayList term14021 = new ArrayList();
        ((ArrayList) term14021).add((Object)null);
        Object term14016 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term14016, term14016.getClass(), "traitId", "");
        setField(term14016, term14016.getClass(), "traitName", "");
        setField(term14016, term14016.getClass(), "description", "");
        setField(term14016, term14016.getClass(), "group", "");
        setField(term14016, term14016.getClass(), "conflictsWithIds", term14021);
        setByteField(term14016, term14016.getClass(), "traitPoints", (byte) -53);
        ArrayList term14030 = new ArrayList();
        ((ArrayList) term14030).add((Object)null);
        Object term14025 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term14025, term14025.getClass(), "traitId", "");
        setField(term14025, term14025.getClass(), "traitName", "");
        setField(term14025, term14025.getClass(), "description", "");
        setField(term14025, term14025.getClass(), "group", "");
        setField(term14025, term14025.getClass(), "conflictsWithIds", term14030);
        setByteField(term14025, term14025.getClass(), "traitPoints", (byte) -93);
        ArrayList term14039 = new ArrayList();
        ((ArrayList) term14039).add((Object)null);
        ((ArrayList) term14039).add((Object)null);
        ((ArrayList) term14039).add((Object)null);
        ((ArrayList) term14039).add((Object)null);
        ((ArrayList) term14039).add((Object)null);
        ((ArrayList) term14039).add((Object)null);
        Object term14034 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term14034, term14034.getClass(), "traitId", "");
        setField(term14034, term14034.getClass(), "traitName", "");
        setField(term14034, term14034.getClass(), "description", "");
        setField(term14034, term14034.getClass(), "group", "");
        setField(term14034, term14034.getClass(), "conflictsWithIds", term14039);
        setByteField(term14034, term14034.getClass(), "traitPoints", (byte) 82);
        ArrayList term14048 = new ArrayList();
        ((ArrayList) term14048).add((Object)null);
        ((ArrayList) term14048).add((Object)null);
        ((ArrayList) term14048).add((Object)null);
        ((ArrayList) term14048).add((Object)null);
        ((ArrayList) term14048).add((Object)null);
        ((ArrayList) term14048).add((Object)null);
        Object term14043 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term14043, term14043.getClass(), "traitId", "");
        setField(term14043, term14043.getClass(), "traitName", "");
        setField(term14043, term14043.getClass(), "description", "");
        setField(term14043, term14043.getClass(), "group", "");
        setField(term14043, term14043.getClass(), "conflictsWithIds", term14048);
        setByteField(term14043, term14043.getClass(), "traitPoints", (byte) -89);
        ArrayList term13996 = new ArrayList();
        ((ArrayList) term13996).add(term13998);
        ((ArrayList) term13996).add(term14007);
        ((ArrayList) term13996).add(term14016);
        ((ArrayList) term13996).add(term14025);
        ((ArrayList) term13996).add(term14034);
        ((ArrayList) term13996).add(term14043);
        term13929 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term13929, term13929.getClass(), "id", "QKYBpCjuYt");
        setField(term13929, term13929.getClass(), "name", "vjiRfoGdkl");
        setField(term13929, term13929.getClass(), "rulerSelection", enum27);
        setField(term13929, term13929.getClass(), "rulerTitleMale", "TwaxeSHvnR");
        setField(term13929, term13929.getClass(), "rulerTitleFemale", "paPzDETzIq");
        setField(term13929, term13929.getClass(), "traits", term13996);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasPopulationRush", argTypes, term13929, args);
    }

};


