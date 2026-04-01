package org.openRealmOfStars.player.leader;

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
import static org.openRealmOfStars.player.leader.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class RulerUtility_getRulerTitle_3311526151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object enum7;
     Object term2155;

    public RulerUtility_getRulerTitle_3311526151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2292 = Class.forName((String) "org.openRealmOfStars.player.leader.Gender");
        Field term2291 = ((Class) term2292).getDeclaredField((String) "MALE");
        ((Field) term2291).setAccessible(true);
        enum7 = ((Field) term2291).get((Object) null);
        Class<? extends Object> term2655 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term2654 = ((Class) term2655).getDeclaredField((String) "CEO_AS_A_RULER");
        ((Field) term2654).setAccessible(true);
        Object enum8 = ((Field) term2654).get((Object) null);
        ArrayList term2229 = new ArrayList();
        ((ArrayList) term2229).add((Object)null);
        ((ArrayList) term2229).add((Object)null);
        ((ArrayList) term2229).add((Object)null);
        ((ArrayList) term2229).add((Object)null);
        ((ArrayList) term2229).add((Object)null);
        Object term2224 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term2224, term2224.getClass(), "traitId", "");
        setField(term2224, term2224.getClass(), "traitName", "");
        setField(term2224, term2224.getClass(), "description", "");
        setField(term2224, term2224.getClass(), "group", "");
        setField(term2224, term2224.getClass(), "conflictsWithIds", term2229);
        setByteField(term2224, term2224.getClass(), "traitPoints", (byte) 47);
        ArrayList term2238 = new ArrayList();
        Object term2233 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term2233, term2233.getClass(), "traitId", "");
        setField(term2233, term2233.getClass(), "traitName", "");
        setField(term2233, term2233.getClass(), "description", "");
        setField(term2233, term2233.getClass(), "group", "");
        setField(term2233, term2233.getClass(), "conflictsWithIds", term2238);
        setByteField(term2233, term2233.getClass(), "traitPoints", (byte) 48);
        ArrayList term2247 = new ArrayList();
        ((ArrayList) term2247).add((Object)null);
        ((ArrayList) term2247).add((Object)null);
        ((ArrayList) term2247).add((Object)null);
        ((ArrayList) term2247).add((Object)null);
        ((ArrayList) term2247).add((Object)null);
        ((ArrayList) term2247).add((Object)null);
        ((ArrayList) term2247).add((Object)null);
        ((ArrayList) term2247).add((Object)null);
        ((ArrayList) term2247).add((Object)null);
        Object term2242 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term2242, term2242.getClass(), "traitId", "");
        setField(term2242, term2242.getClass(), "traitName", "");
        setField(term2242, term2242.getClass(), "description", "");
        setField(term2242, term2242.getClass(), "group", "");
        setField(term2242, term2242.getClass(), "conflictsWithIds", term2247);
        setByteField(term2242, term2242.getClass(), "traitPoints", (byte) 89);
        ArrayList term2256 = new ArrayList();
        Object term2251 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term2251, term2251.getClass(), "traitId", "");
        setField(term2251, term2251.getClass(), "traitName", "");
        setField(term2251, term2251.getClass(), "description", "");
        setField(term2251, term2251.getClass(), "group", "");
        setField(term2251, term2251.getClass(), "conflictsWithIds", term2256);
        setByteField(term2251, term2251.getClass(), "traitPoints", (byte) 75);
        ArrayList term2222 = new ArrayList();
        ((ArrayList) term2222).add(term2224);
        ((ArrayList) term2222).add(term2233);
        ((ArrayList) term2222).add(term2242);
        ((ArrayList) term2222).add(term2251);
        term2155 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term2155, term2155.getClass(), "id", "MuLcgQHgqz");
        setField(term2155, term2155.getClass(), "name", "xxtlPwDYFs");
        setField(term2155, term2155.getClass(), "rulerSelection", enum8);
        setField(term2155, term2155.getClass(), "rulerTitleMale", "jJCZpVmanW");
        setField(term2155, term2155.getClass(), "rulerTitleFemale", "EGtDIRbSSb");
        setField(term2155, term2155.getClass(), "traits", term2222);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.leader.RulerUtility");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.leader.Gender");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.government.Government");
        Object[] args = new Object[2];
        args[0] = enum7;
        args[1] = term2155;
        callMethod(klass, "getRulerTitle", argTypes, null, args);
    }

};


