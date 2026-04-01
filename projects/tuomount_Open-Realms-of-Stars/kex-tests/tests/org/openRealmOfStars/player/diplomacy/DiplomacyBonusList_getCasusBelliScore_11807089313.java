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

public class DiplomacyBonusList_getCasusBelliScore_11807089313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28183;

    public DiplomacyBonusList_getCasusBelliScore_11807089313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term28243 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term28242 = ((Class) term28243).getDeclaredField((String) "PROMISE_BROKEN");
        ((Field) term28242).setAccessible(true);
        Object enum74 = ((Field) term28242).get((Object) null);
        Object term28187 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term28187, term28187.getClass(), "type", enum74);
        setBooleanField(term28187, term28187.getClass(), "onlyOne", false);
        setIntField(term28187, term28187.getClass(), "bonusValue", -2138825831);
        setIntField(term28187, term28187.getClass(), "bonusLasting", 1454781562);
        Class<? extends Object> term28572 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term28571 = ((Class) term28572).getDeclaredField((String) "LONG_PEACE");
        ((Field) term28571).setAccessible(true);
        Object enum75 = ((Field) term28571).get((Object) null);
        Object term28193 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term28193, term28193.getClass(), "type", enum75);
        setBooleanField(term28193, term28193.getClass(), "onlyOne", false);
        setIntField(term28193, term28193.getClass(), "bonusValue", -27944011);
        setIntField(term28193, term28193.getClass(), "bonusLasting", -20614472);
        Class<? extends Object> term28889 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term28888 = ((Class) term28889).getDeclaredField((String) "EMBARGO");
        ((Field) term28888).setAccessible(true);
        Object enum76 = ((Field) term28888).get((Object) null);
        Object term28199 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term28199, term28199.getClass(), "type", enum76);
        setBooleanField(term28199, term28199.getClass(), "onlyOne", false);
        setIntField(term28199, term28199.getClass(), "bonusValue", 1126618861);
        setIntField(term28199, term28199.getClass(), "bonusLasting", 947449400);
        Class<? extends Object> term29197 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term29196 = ((Class) term29197).getDeclaredField((String) "EMBARGO");
        ((Field) term29196).setAccessible(true);
        Object enum77 = ((Field) term29196).get((Object) null);
        Object term28205 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term28205, term28205.getClass(), "type", enum77);
        setBooleanField(term28205, term28205.getClass(), "onlyOne", false);
        setIntField(term28205, term28205.getClass(), "bonusValue", -763799087);
        setIntField(term28205, term28205.getClass(), "bonusLasting", 1207142014);
        Object term28211 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term28211, term28211.getClass(), "type", enum76);
        setBooleanField(term28211, term28211.getClass(), "onlyOne", false);
        setIntField(term28211, term28211.getClass(), "bonusValue", -876426634);
        setIntField(term28211, term28211.getClass(), "bonusLasting", 213831054);
        Class<? extends Object> term29505 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term29504 = ((Class) term29505).getDeclaredField((String) "DIFFERENT_GOVERNMENT");
        ((Field) term29504).setAccessible(true);
        Object enum78 = ((Field) term29504).get((Object) null);
        Object term28215 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term28215, term28215.getClass(), "type", enum78);
        setBooleanField(term28215, term28215.getClass(), "onlyOne", true);
        setIntField(term28215, term28215.getClass(), "bonusValue", 330043745);
        setIntField(term28215, term28215.getClass(), "bonusLasting", -509349195);
        Class<? extends Object> term29852 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term29851 = ((Class) term29852).getDeclaredField((String) "INSULT");
        ((Field) term29851).setAccessible(true);
        Object enum79 = ((Field) term29851).get((Object) null);
        Object term28221 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term28221, term28221.getClass(), "type", enum79);
        setBooleanField(term28221, term28221.getClass(), "onlyOne", false);
        setIntField(term28221, term28221.getClass(), "bonusValue", -1639041228);
        setIntField(term28221, term28221.getClass(), "bonusLasting", 2027686272);
        Class<? extends Object> term30157 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term30156 = ((Class) term30157).getDeclaredField((String) "LONG_PEACE");
        ((Field) term30156).setAccessible(true);
        Object enum80 = ((Field) term30156).get((Object) null);
        Object term28227 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term28227, term28227.getClass(), "type", enum80);
        setBooleanField(term28227, term28227.getClass(), "onlyOne", false);
        setIntField(term28227, term28227.getClass(), "bonusValue", -1494356104);
        setIntField(term28227, term28227.getClass(), "bonusLasting", -695279311);
        Class<? extends Object> term30474 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term30473 = ((Class) term30474).getDeclaredField((String) "DISLIKED_EMBARGO");
        ((Field) term30473).setAccessible(true);
        Object enum81 = ((Field) term30473).get((Object) null);
        Object term28233 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term28233, term28233.getClass(), "type", enum81);
        setBooleanField(term28233, term28233.getClass(), "onlyOne", true);
        setIntField(term28233, term28233.getClass(), "bonusValue", 114279242);
        setIntField(term28233, term28233.getClass(), "bonusLasting", 990883365);
        ArrayList term28185 = new ArrayList();
        ((ArrayList) term28185).add(term28187);
        ((ArrayList) term28185).add(term28193);
        ((ArrayList) term28185).add(term28199);
        ((ArrayList) term28185).add(term28205);
        ((ArrayList) term28185).add(term28211);
        ((ArrayList) term28185).add(term28215);
        ((ArrayList) term28185).add(term28221);
        ((ArrayList) term28185).add(term28227);
        ((ArrayList) term28185).add(term28233);
        term28183 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term28183, term28183.getClass(), "playerIndex", -2143043890);
        setField(term28183, term28183.getClass(), "list", term28185);
        setIntField(term28183, term28183.getClass(), "numberOfMeetings", 633598642);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCasusBelliScore", argTypes, term28183, args);
    }

};


