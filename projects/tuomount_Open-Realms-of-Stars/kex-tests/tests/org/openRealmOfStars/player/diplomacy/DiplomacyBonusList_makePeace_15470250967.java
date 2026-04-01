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

public class DiplomacyBonusList_makePeace_15470250967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32538;

    public DiplomacyBonusList_makePeace_15470250967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32552 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term32551 = ((Class) term32552).getDeclaredField((String) "BORDER_CROSSED");
        ((Field) term32551).setAccessible(true);
        Object enum87 = ((Field) term32551).get((Object) null);
        Object term32542 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term32542, term32542.getClass(), "type", enum87);
        setBooleanField(term32542, term32542.getClass(), "onlyOne", true);
        setIntField(term32542, term32542.getClass(), "bonusValue", -1428063820);
        setIntField(term32542, term32542.getClass(), "bonusLasting", -1271375703);
        ArrayList term32540 = new ArrayList();
        ((ArrayList) term32540).add(term32542);
        term32538 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term32538, term32538.getClass(), "playerIndex", -1317044799);
        setField(term32538, term32538.getClass(), "list", term32540);
        setIntField(term32538, term32538.getClass(), "numberOfMeetings", 1136208236);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "makePeace", argTypes, term32538, args);
    }

};


