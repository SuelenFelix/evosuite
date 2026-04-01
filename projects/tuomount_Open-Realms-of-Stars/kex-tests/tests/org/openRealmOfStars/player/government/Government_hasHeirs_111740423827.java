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

public class Government_hasHeirs_111740423827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17564;

    public Government_hasHeirs_111740423827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17701 = Class.forName((String) "org.openRealmOfStars.player.government.RulerSelection");
        Field term17700 = ((Class) term17701).getDeclaredField((String) "ELECTION_TYPE1");
        ((Field) term17700).setAccessible(true);
        Object enum35 = ((Field) term17700).get((Object) null);
        ArrayList term17638 = new ArrayList();
        ((ArrayList) term17638).add((Object)null);
        ((ArrayList) term17638).add((Object)null);
        ((ArrayList) term17638).add((Object)null);
        ((ArrayList) term17638).add((Object)null);
        ((ArrayList) term17638).add((Object)null);
        ((ArrayList) term17638).add((Object)null);
        ((ArrayList) term17638).add((Object)null);
        ((ArrayList) term17638).add((Object)null);
        ((ArrayList) term17638).add((Object)null);
        Object term17633 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term17633, term17633.getClass(), "traitId", "");
        setField(term17633, term17633.getClass(), "traitName", "");
        setField(term17633, term17633.getClass(), "description", "");
        setField(term17633, term17633.getClass(), "group", "");
        setField(term17633, term17633.getClass(), "conflictsWithIds", term17638);
        setByteField(term17633, term17633.getClass(), "traitPoints", (byte) 126);
        ArrayList term17647 = new ArrayList();
        ((ArrayList) term17647).add((Object)null);
        ((ArrayList) term17647).add((Object)null);
        ((ArrayList) term17647).add((Object)null);
        Object term17642 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term17642, term17642.getClass(), "traitId", "");
        setField(term17642, term17642.getClass(), "traitName", "");
        setField(term17642, term17642.getClass(), "description", "");
        setField(term17642, term17642.getClass(), "group", "");
        setField(term17642, term17642.getClass(), "conflictsWithIds", term17647);
        setByteField(term17642, term17642.getClass(), "traitPoints", (byte) 7);
        ArrayList term17656 = new ArrayList();
        ((ArrayList) term17656).add((Object)null);
        ((ArrayList) term17656).add((Object)null);
        ((ArrayList) term17656).add((Object)null);
        ((ArrayList) term17656).add((Object)null);
        ((ArrayList) term17656).add((Object)null);
        ((ArrayList) term17656).add((Object)null);
        ((ArrayList) term17656).add((Object)null);
        ((ArrayList) term17656).add((Object)null);
        ((ArrayList) term17656).add((Object)null);
        Object term17651 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term17651, term17651.getClass(), "traitId", "");
        setField(term17651, term17651.getClass(), "traitName", "");
        setField(term17651, term17651.getClass(), "description", "");
        setField(term17651, term17651.getClass(), "group", "");
        setField(term17651, term17651.getClass(), "conflictsWithIds", term17656);
        setByteField(term17651, term17651.getClass(), "traitPoints", (byte) -96);
        ArrayList term17665 = new ArrayList();
        ((ArrayList) term17665).add((Object)null);
        ((ArrayList) term17665).add((Object)null);
        ((ArrayList) term17665).add((Object)null);
        Object term17660 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term17660, term17660.getClass(), "traitId", "");
        setField(term17660, term17660.getClass(), "traitName", "");
        setField(term17660, term17660.getClass(), "description", "");
        setField(term17660, term17660.getClass(), "group", "");
        setField(term17660, term17660.getClass(), "conflictsWithIds", term17665);
        setByteField(term17660, term17660.getClass(), "traitPoints", (byte) -22);
        ArrayList term17674 = new ArrayList();
        ((ArrayList) term17674).add((Object)null);
        ((ArrayList) term17674).add((Object)null);
        ((ArrayList) term17674).add((Object)null);
        Object term17669 = newInstance(Class.forName("org.openRealmOfStars.player.government.trait.GovTrait"));
        setField(term17669, term17669.getClass(), "traitId", "");
        setField(term17669, term17669.getClass(), "traitName", "");
        setField(term17669, term17669.getClass(), "description", "");
        setField(term17669, term17669.getClass(), "group", "");
        setField(term17669, term17669.getClass(), "conflictsWithIds", term17674);
        setByteField(term17669, term17669.getClass(), "traitPoints", (byte) -5);
        ArrayList term17631 = new ArrayList();
        ((ArrayList) term17631).add(term17633);
        ((ArrayList) term17631).add(term17642);
        ((ArrayList) term17631).add(term17651);
        ((ArrayList) term17631).add(term17660);
        ((ArrayList) term17631).add(term17669);
        term17564 = newInstance(Class.forName("org.openRealmOfStars.player.government.Government"));
        setField(term17564, term17564.getClass(), "id", "XgJzBOYfQB");
        setField(term17564, term17564.getClass(), "name", "GAPGgDekVG");
        setField(term17564, term17564.getClass(), "rulerSelection", enum35);
        setField(term17564, term17564.getClass(), "rulerTitleMale", "WmTogHwGLE");
        setField(term17564, term17564.getClass(), "rulerTitleFemale", "qYOIXsGycY");
        setField(term17564, term17564.getClass(), "traits", term17631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.government.Government");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasHeirs", argTypes, term17564, args);
    }

};


