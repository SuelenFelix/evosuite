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

public class DiplomacyBonusList_getTypes_88597455810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34528;

    public DiplomacyBonusList_getTypes_88597455810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34578 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term34577 = ((Class) term34578).getDeclaredField((String) "OLYMPICS");
        ((Field) term34577).setAccessible(true);
        Object enum93 = ((Field) term34577).get((Object) null);
        Object term34532 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term34532, term34532.getClass(), "type", enum93);
        setBooleanField(term34532, term34532.getClass(), "onlyOne", true);
        setIntField(term34532, term34532.getClass(), "bonusValue", 1973060703);
        setIntField(term34532, term34532.getClass(), "bonusLasting", -138239905);
        Class<? extends Object> term34889 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term34888 = ((Class) term34889).getDeclaredField((String) "ESPIONAGE_BORDER_CROSS");
        ((Field) term34888).setAccessible(true);
        Object enum94 = ((Field) term34888).get((Object) null);
        Object term34538 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term34538, term34538.getClass(), "type", enum94);
        setBooleanField(term34538, term34538.getClass(), "onlyOne", true);
        setIntField(term34538, term34538.getClass(), "bonusValue", 1709474063);
        setIntField(term34538, term34538.getClass(), "bonusLasting", 1406617209);
        Class<? extends Object> term35242 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term35241 = ((Class) term35242).getDeclaredField((String) "PROMISE_BROKEN");
        ((Field) term35241).setAccessible(true);
        Object enum95 = ((Field) term35241).get((Object) null);
        Object term34544 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term34544, term34544.getClass(), "type", enum95);
        setBooleanField(term34544, term34544.getClass(), "onlyOne", true);
        setIntField(term34544, term34544.getClass(), "bonusValue", 1706047059);
        setIntField(term34544, term34544.getClass(), "bonusLasting", 590451710);
        Object term34550 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term34550, term34550.getClass(), "type", enum94);
        setBooleanField(term34550, term34550.getClass(), "onlyOne", true);
        setIntField(term34550, term34550.getClass(), "bonusValue", -1999787419);
        setIntField(term34550, term34550.getClass(), "bonusLasting", -1224443634);
        Class<? extends Object> term35571 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term35570 = ((Class) term35571).getDeclaredField((String) "INSULT");
        ((Field) term35570).setAccessible(true);
        Object enum96 = ((Field) term35570).get((Object) null);
        Object term34554 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term34554, term34554.getClass(), "type", enum96);
        setBooleanField(term34554, term34554.getClass(), "onlyOne", false);
        setIntField(term34554, term34554.getClass(), "bonusValue", 1048451946);
        setIntField(term34554, term34554.getClass(), "bonusLasting", 5603560);
        Object term34560 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term34560, term34560.getClass(), "type", enum96);
        setBooleanField(term34560, term34560.getClass(), "onlyOne", false);
        setIntField(term34560, term34560.getClass(), "bonusValue", -1079020032);
        setIntField(term34560, term34560.getClass(), "bonusLasting", -1973791064);
        Class<? extends Object> term35876 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term35875 = ((Class) term35876).getDeclaredField((String) "SAME_GOVERNMENT");
        ((Field) term35875).setAccessible(true);
        Object enum97 = ((Field) term35875).get((Object) null);
        Object term34564 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term34564, term34564.getClass(), "type", enum97);
        setBooleanField(term34564, term34564.getClass(), "onlyOne", true);
        setIntField(term34564, term34564.getClass(), "bonusValue", -2072158633);
        setIntField(term34564, term34564.getClass(), "bonusLasting", -355469363);
        Object term34570 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term34570, term34570.getClass(), "type", enum95);
        setBooleanField(term34570, term34570.getClass(), "onlyOne", true);
        setIntField(term34570, term34570.getClass(), "bonusValue", 1465188553);
        setIntField(term34570, term34570.getClass(), "bonusLasting", 1633913667);
        ArrayList term34530 = new ArrayList();
        ((ArrayList) term34530).add(term34532);
        ((ArrayList) term34530).add(term34538);
        ((ArrayList) term34530).add(term34544);
        ((ArrayList) term34530).add(term34550);
        ((ArrayList) term34530).add(term34554);
        ((ArrayList) term34530).add(term34560);
        ((ArrayList) term34530).add(term34564);
        ((ArrayList) term34530).add(term34570);
        term34528 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term34528, term34528.getClass(), "playerIndex", 797203987);
        setField(term34528, term34528.getClass(), "list", term34530);
        setIntField(term34528, term34528.getClass(), "numberOfMeetings", 1292332296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTypes", argTypes, term34528, args);
    }

};


