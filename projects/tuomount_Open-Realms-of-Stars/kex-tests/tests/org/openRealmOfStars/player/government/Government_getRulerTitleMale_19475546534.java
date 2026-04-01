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

public class Government_getRulerTitleMale_19475546534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20896;

    public Government_getRulerTitleMale_19475546534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term21024 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term21023 = ((Class) term21024).getDeclaredField((String) "CEO_AS_A_RULER");
        ((Field) term21023).setAccessible(true);
        Object enum42 = ((Field) term21023).get((Object) null);
        ArrayList term20970 = new ArrayList();
        ((ArrayList) term20970).add((Object)null);
        ((ArrayList) term20970).add((Object)null);
        ((ArrayList) term20970).add((Object)null);
        ((ArrayList) term20970).add((Object)null);
        ((ArrayList) term20970).add((Object)null);
        Object term20965 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20965, term20965.getClass(), "traitId", "");
        setField(term20965, term20965.getClass(), "traitName", "");
        setField(term20965, term20965.getClass(), "description", "");
        setField(term20965, term20965.getClass(), "group", "");
        setField(term20965, term20965.getClass(), "conflictsWithIds", term20970);
        setByteField(term20965, term20965.getClass(), "traitPoints", (byte) -70);
        ArrayList term20979 = new ArrayList();
        ((ArrayList) term20979).add((Object)null);
        ((ArrayList) term20979).add((Object)null);
        Object term20974 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20974, term20974.getClass(), "traitId", "");
        setField(term20974, term20974.getClass(), "traitName", "");
        setField(term20974, term20974.getClass(), "description", "");
        setField(term20974, term20974.getClass(), "group", "");
        setField(term20974, term20974.getClass(), "conflictsWithIds", term20979);
        setByteField(term20974, term20974.getClass(), "traitPoints", (byte) -73);
        ArrayList term20988 = new ArrayList();
        ((ArrayList) term20988).add((Object)null);
        ((ArrayList) term20988).add((Object)null);
        ((ArrayList) term20988).add((Object)null);
        ((ArrayList) term20988).add((Object)null);
        ((ArrayList) term20988).add((Object)null);
        Object term20983 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20983, term20983.getClass(), "traitId", "");
        setField(term20983, term20983.getClass(), "traitName", "");
        setField(term20983, term20983.getClass(), "description", "");
        setField(term20983, term20983.getClass(), "group", "");
        setField(term20983, term20983.getClass(), "conflictsWithIds", term20988);
        setByteField(term20983, term20983.getClass(), "traitPoints", (byte) 1);
        ArrayList term20997 = new ArrayList();
        ((ArrayList) term20997).add((Object)null);
        ((ArrayList) term20997).add((Object)null);
        ((ArrayList) term20997).add((Object)null);
        ((ArrayList) term20997).add((Object)null);
        Object term20992 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term20992, term20992.getClass(), "traitId", "");
        setField(term20992, term20992.getClass(), "traitName", "");
        setField(term20992, term20992.getClass(), "description", "");
        setField(term20992, term20992.getClass(), "group", "");
        setField(term20992, term20992.getClass(), "conflictsWithIds", term20997);
        setByteField(term20992, term20992.getClass(), "traitPoints", (byte) 99);
        ArrayList term20963 = new ArrayList();
        ((ArrayList) term20963).add(term20965);
        ((ArrayList) term20963).add(term20974);
        ((ArrayList) term20963).add(term20983);
        ((ArrayList) term20963).add(term20992);
        term20896 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term20896, term20896.getClass(), "id", "aDoBLXfFQI");
        setField(term20896, term20896.getClass(), "name", "HTimNhSNVi");
        setField(term20896, term20896.getClass(), "rulerSelection", enum42);
        setField(term20896, term20896.getClass(), "rulerTitleMale", "IWJWbrHcqm");
        setField(term20896, term20896.getClass(), "rulerTitleFemale", "ucTcadpUdW");
        setField(term20896, term20896.getClass(), "traits", term20963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRulerTitleMale", argTypes, term20896, args);
    }

};


