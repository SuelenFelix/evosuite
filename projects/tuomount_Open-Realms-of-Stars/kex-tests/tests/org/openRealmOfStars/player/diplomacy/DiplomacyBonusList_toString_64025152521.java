package org.openRealmOfStars.player.diplomacy;

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
import static org.openRealmOfStars.player.diplomacy.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class DiplomacyBonusList_toString_64025152521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51455;

    public DiplomacyBonusList_toString_64025152521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term51475 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term51474 = ((Class) term51475).getDeclaredField((String) "WAR_DECLARTION");
        ((Field) term51474).setAccessible(true);
        Object enum144 = ((Field) term51474).get((Object) null);
        Object term51459 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term51459, term51459.getClass(), "type", enum144);
        setBooleanField(term51459, term51459.getClass(), "onlyOne", true);
        setIntField(term51459, term51459.getClass(), "bonusValue", 86041387);
        setIntField(term51459, term51459.getClass(), "bonusLasting", 1010721666);
        Class<? extends Object> term51804 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term51803 = ((Class) term51804).getDeclaredField((String) "SIMILAR_GOVERNMENT");
        ((Field) term51803).setAccessible(true);
        Object enum145 = ((Field) term51803).get((Object) null);
        Object term51465 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term51465, term51465.getClass(), "type", enum145);
        setBooleanField(term51465, term51465.getClass(), "onlyOne", false);
        setIntField(term51465, term51465.getClass(), "bonusValue", 27043781);
        setIntField(term51465, term51465.getClass(), "bonusLasting", -1367122405);
        ArrayList term51457 = new ArrayList();
        ((ArrayList) term51457).add(term51459);
        ((ArrayList) term51457).add(term51465);
        term51455 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term51455, term51455.getClass(), "playerIndex", 872295704);
        setField(term51455, term51455.getClass(), "list", term51457);
        setIntField(term51455, term51455.getClass(), "numberOfMeetings", -1703625118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term51455, args);
    }

};


