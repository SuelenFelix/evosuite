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

public class Government_getDiplomaticBonus_95475375610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9756;

    public Government_getDiplomaticBonus_95475375610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9876 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term9875 = ((Class) term9876).getDeclaredField((String) "HEGEMONIA_RULER");
        ((Field) term9875).setAccessible(true);
        Object enum18 = ((Field) term9875).get((Object) null);
        ArrayList term9831 = new ArrayList();
        ((ArrayList) term9831).add((Object)null);
        ((ArrayList) term9831).add((Object)null);
        ((ArrayList) term9831).add((Object)null);
        ((ArrayList) term9831).add((Object)null);
        ((ArrayList) term9831).add((Object)null);
        ((ArrayList) term9831).add((Object)null);
        ((ArrayList) term9831).add((Object)null);
        Object term9826 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term9826, term9826.getClass(), "traitId", "");
        setField(term9826, term9826.getClass(), "traitName", "");
        setField(term9826, term9826.getClass(), "description", "");
        setField(term9826, term9826.getClass(), "group", "");
        setField(term9826, term9826.getClass(), "conflictsWithIds", term9831);
        setByteField(term9826, term9826.getClass(), "traitPoints", (byte) -92);
        ArrayList term9840 = new ArrayList();
        ((ArrayList) term9840).add((Object)null);
        ((ArrayList) term9840).add((Object)null);
        ((ArrayList) term9840).add((Object)null);
        ((ArrayList) term9840).add((Object)null);
        ((ArrayList) term9840).add((Object)null);
        Object term9835 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term9835, term9835.getClass(), "traitId", "");
        setField(term9835, term9835.getClass(), "traitName", "");
        setField(term9835, term9835.getClass(), "description", "");
        setField(term9835, term9835.getClass(), "group", "");
        setField(term9835, term9835.getClass(), "conflictsWithIds", term9840);
        setByteField(term9835, term9835.getClass(), "traitPoints", (byte) -42);
        ArrayList term9849 = new ArrayList();
        ((ArrayList) term9849).add((Object)null);
        ((ArrayList) term9849).add((Object)null);
        ((ArrayList) term9849).add((Object)null);
        ((ArrayList) term9849).add((Object)null);
        Object term9844 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term9844, term9844.getClass(), "traitId", "");
        setField(term9844, term9844.getClass(), "traitName", "");
        setField(term9844, term9844.getClass(), "description", "");
        setField(term9844, term9844.getClass(), "group", "");
        setField(term9844, term9844.getClass(), "conflictsWithIds", term9849);
        setByteField(term9844, term9844.getClass(), "traitPoints", (byte) 116);
        ArrayList term9824 = new ArrayList();
        ((ArrayList) term9824).add(term9826);
        ((ArrayList) term9824).add(term9835);
        ((ArrayList) term9824).add(term9844);
        term9756 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term9756, term9756.getClass(), "id", "OirVUQhauU");
        setField(term9756, term9756.getClass(), "name", "GLbyDfbNZI");
        setField(term9756, term9756.getClass(), "rulerSelection", enum18);
        setField(term9756, term9756.getClass(), "rulerTitleMale", "oNLcCYDAsO");
        setField(term9756, term9756.getClass(), "rulerTitleFemale", "CNqMxLvtcJ");
        setField(term9756, term9756.getClass(), "traits", term9824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiplomaticBonus", argTypes, term9756, args);
    }

};


