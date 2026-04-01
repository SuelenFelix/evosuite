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

public class DiplomacyBonusList_getBonusTypeLasting_19133498328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32880;
     Object enum89;

    public DiplomacyBonusList_getBonusTypeLasting_19133498328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32903 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term32902 = ((Class) term32903).getDeclaredField((String) "PROMISE_BROKEN");
        ((Field) term32902).setAccessible(true);
        Object enum88 = ((Field) term32902).get((Object) null);
        Object term32884 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term32884, term32884.getClass(), "type", enum88);
        setBooleanField(term32884, term32884.getClass(), "onlyOne", false);
        setIntField(term32884, term32884.getClass(), "bonusValue", -995822131);
        setIntField(term32884, term32884.getClass(), "bonusLasting", -687282231);
        ArrayList term32882 = new ArrayList();
        ((ArrayList) term32882).add(term32884);
        term32880 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term32880, term32880.getClass(), "playerIndex", -1220630391);
        setField(term32880, term32880.getClass(), "list", term32882);
        setIntField(term32880, term32880.getClass(), "numberOfMeetings", 1200440315);
        Class<? extends Object> term33232 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term33231 = ((Class) term33232).getDeclaredField((String) "NUKED");
        ((Field) term33231).setAccessible(true);
        enum89 = ((Field) term33231).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Object[] args = new Object[1];
        args[0] = enum89;
        callMethod(klass, "getBonusTypeLasting", argTypes, term32880, args);
    }

};


