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

public class DiplomacyBonusList_removePromises_148636313215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41689;

    public DiplomacyBonusList_removePromises_148636313215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41703 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term41702 = ((Class) term41703).getDeclaredField((String) "PROMISED_VOTE_NO");
        ((Field) term41702).setAccessible(true);
        Object enum114 = ((Field) term41702).get((Object) null);
        Object term41693 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term41693, term41693.getClass(), "type", enum114);
        setBooleanField(term41693, term41693.getClass(), "onlyOne", true);
        setIntField(term41693, term41693.getClass(), "bonusValue", 1787325291);
        setIntField(term41693, term41693.getClass(), "bonusLasting", 1470349147);
        ArrayList term41691 = new ArrayList();
        ((ArrayList) term41691).add(term41693);
        term41689 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term41689, term41689.getClass(), "playerIndex", 470895808);
        setField(term41689, term41689.getClass(), "list", term41691);
        setIntField(term41689, term41689.getClass(), "numberOfMeetings", -255317272);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "removePromises", argTypes, term41689, args);
    }

};


