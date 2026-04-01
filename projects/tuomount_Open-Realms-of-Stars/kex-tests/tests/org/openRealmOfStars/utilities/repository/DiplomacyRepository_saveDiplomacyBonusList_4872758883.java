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
import java.util.ArrayList;
import java.lang.String;

public class DiplomacyRepository_saveDiplomacyBonusList_4872758883 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1213;
     Object term1224;

    public DiplomacyRepository_saveDiplomacyBonusList_4872758883() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1213 = newInstance(Class.forName("java.io.DataOutputStream"));
        byte[] term1215 = (byte[]) newByteArray(2);
        byte[] term1218 = (byte[]) newByteArray(3);
        Object term1223 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term1213, term1213.getClass(), "written", 590364439);
        setByteElement(term1215, 0, (byte) 42);
        setByteElement(term1215, 1, (byte) 72);
        setField(term1213, term1213.getClass(), "bytearr", term1215);
        setByteElement(term1218, 0, (byte) 111);
        setByteElement(term1218, 1, (byte) 99);
        setByteElement(term1218, 2, (byte) -12);
        setField(term1213, term1213.getClass(), "writeBuffer", term1218);
        setField(term1213, term1213.getClass(), "out", null);
        setBooleanField(term1213, term1213.getClass(), "closed", false);
        setField(term1213, term1213.getClass(), "closeLock", term1223);
        Class<? extends Object> term1243 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term1242 = ((Class) term1243).getDeclaredField((String) "SAME_GOVERNMENT");
        ((Field) term1242).setAccessible(true);
        Object enum1 = ((Field) term1242).get((Object) null);
        Object term1228 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term1228, term1228.getClass(), "type", enum1);
        setBooleanField(term1228, term1228.getClass(), "onlyOne", true);
        setIntField(term1228, term1228.getClass(), "bonusValue", -1275173084);
        setIntField(term1228, term1228.getClass(), "bonusLasting", -244121226);
        ArrayList term1226 = new ArrayList();
        ((ArrayList) term1226).add(term1228);
        term1224 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term1224, term1224.getClass(), "playerIndex", 865208305);
        setField(term1224, term1224.getClass(), "list", term1226);
        setIntField(term1224, term1224.getClass(), "numberOfMeetings", -203030934);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.utilities.repository.DiplomacyRepository");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.DataOutputStream");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Object[] args = new Object[2];
        args[0] = term1213;
        args[1] = term1224;
        callMethod(klass, "saveDiplomacyBonusList", argTypes, null, args);
    }

};


