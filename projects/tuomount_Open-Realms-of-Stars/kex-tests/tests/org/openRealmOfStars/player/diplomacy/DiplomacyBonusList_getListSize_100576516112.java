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

public class DiplomacyBonusList_getListSize_100576516112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36907;

    public DiplomacyBonusList_getListSize_100576516112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term36945 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term36944 = ((Class) term36945).getDeclaredField((String) "WAR_DECLARATION_AGAINST_US");
        ((Field) term36944).setAccessible(true);
        Object enum100 = ((Field) term36944).get((Object) null);
        Object term36911 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term36911, term36911.getClass(), "type", enum100);
        setBooleanField(term36911, term36911.getClass(), "onlyOne", false);
        setIntField(term36911, term36911.getClass(), "bonusValue", -1005024758);
        setIntField(term36911, term36911.getClass(), "bonusLasting", 2634669);
        Class<? extends Object> term37310 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term37309 = ((Class) term37310).getDeclaredField((String) "BORDER_CROSSED");
        ((Field) term37309).setAccessible(true);
        Object enum101 = ((Field) term37309).get((Object) null);
        Object term36917 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term36917, term36917.getClass(), "type", enum101);
        setBooleanField(term36917, term36917.getClass(), "onlyOne", true);
        setIntField(term36917, term36917.getClass(), "bonusValue", -1912429941);
        setIntField(term36917, term36917.getClass(), "bonusLasting", 1801052257);
        Class<? extends Object> term37639 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term37638 = ((Class) term37639).getDeclaredField((String) "LONG_PEACE");
        ((Field) term37638).setAccessible(true);
        Object enum102 = ((Field) term37638).get((Object) null);
        Object term36923 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term36923, term36923.getClass(), "type", enum102);
        setBooleanField(term36923, term36923.getClass(), "onlyOne", true);
        setIntField(term36923, term36923.getClass(), "bonusValue", -2110556060);
        setIntField(term36923, term36923.getClass(), "bonusLasting", 313459791);
        Class<? extends Object> term37956 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term37955 = ((Class) term37956).getDeclaredField((String) "PROMISED_VOTE_YES");
        ((Field) term37955).setAccessible(true);
        Object enum103 = ((Field) term37955).get((Object) null);
        Object term36929 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term36929, term36929.getClass(), "type", enum103);
        setBooleanField(term36929, term36929.getClass(), "onlyOne", false);
        setIntField(term36929, term36929.getClass(), "bonusValue", 752615112);
        setIntField(term36929, term36929.getClass(), "bonusLasting", -1674430871);
        Class<? extends Object> term38294 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term38293 = ((Class) term38294).getDeclaredField((String) "NOTHING_TO_TRADE");
        ((Field) term38293).setAccessible(true);
        Object enum104 = ((Field) term38293).get((Object) null);
        Object term36935 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term36935, term36935.getClass(), "type", enum104);
        setBooleanField(term36935, term36935.getClass(), "onlyOne", false);
        setIntField(term36935, term36935.getClass(), "bonusValue", 794352120);
        setIntField(term36935, term36935.getClass(), "bonusLasting", 340719678);
        ArrayList term36909 = new ArrayList();
        ((ArrayList) term36909).add(term36911);
        ((ArrayList) term36909).add(term36917);
        ((ArrayList) term36909).add(term36923);
        ((ArrayList) term36909).add(term36929);
        ((ArrayList) term36909).add(term36935);
        term36907 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term36907, term36907.getClass(), "playerIndex", -1972033388);
        setField(term36907, term36907.getClass(), "list", term36909);
        setIntField(term36907, term36907.getClass(), "numberOfMeetings", 299791142);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getListSize", argTypes, term36907, args);
    }

};


