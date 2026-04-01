package org.openRealmOfStars.utilities.repository;

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
import static org.openRealmOfStars.utilities.repository.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class DiplomacyRepository_saveDiplomacyBonus_3257997601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103;
     Object term122;

    public DiplomacyRepository_saveDiplomacyBonus_3257997601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term105 = (byte[]) newByteArray(6);
        byte[] term112 = (byte[]) newByteArray(7);
        Object term121 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term103, term103.getClass(), "written", -117576464);
        setByteElement(term105, 0, (byte) 87);
        setByteElement(term105, 1, (byte) 121);
        setByteElement(term105, 2, (byte) -99);
        setByteElement(term105, 3, (byte) -2);
        setByteElement(term105, 4, (byte) -16);
        setByteElement(term105, 5, (byte) -112);
        setField(term103, term103.getClass(), "bytearr", term105);
        setByteElement(term112, 0, (byte) -111);
        setByteElement(term112, 1, (byte) 23);
        setByteElement(term112, 2, (byte) -15);
        setByteElement(term112, 3, (byte) 36);
        setByteElement(term112, 4, (byte) 118);
        setByteElement(term112, 5, (byte) 106);
        setByteElement(term112, 6, (byte) 98);
        setField(term103, term103.getClass(), "writeBuffer", term112);
        setField(term103, term103.getClass(), "out", null);
        setBooleanField(term103, term103.getClass(), "closed", false);
        setField(term103, term103.getClass(), "closeLock", term121);
        Class<? extends Object> term846 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term845 = ((Class) term846).getDeclaredField((String) "WAR_DECLARTION");
        ((Field) term845).setAccessible(true);
        Object enum0 = ((Field) term845).get((Object) null);
        term122 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term122, term122.getClass(), "type", enum0);
        setBooleanField(term122, term122.getClass(), "onlyOne", false);
        setIntField(term122, term122.getClass(), "bonusValue", -1007160944);
        setIntField(term122, term122.getClass(), "bonusLasting", 1135664017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.DiplomacyRepository");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus");
        Object[] args = new Object[2];
        args[0] = term103;
        args[1] = term122;
        callMethod(klass, "saveDiplomacyBonus", argTypes, null, args);
    }

};


