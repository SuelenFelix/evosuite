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

public class DiplomacyBonusList_getNumberOfMeetings_111105513419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48469;

    public DiplomacyBonusList_getNumberOfMeetings_111105513419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48519 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term48518 = ((Class) term48519).getDeclaredField((String) "BORDER_CROSSED");
        ((Field) term48518).setAccessible(true);
        Object enum135 = ((Field) term48518).get((Object) null);
        Object term48473 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term48473, term48473.getClass(), "type", enum135);
        setBooleanField(term48473, term48473.getClass(), "onlyOne", false);
        setIntField(term48473, term48473.getClass(), "bonusValue", 1414025609);
        setIntField(term48473, term48473.getClass(), "bonusLasting", 255145822);
        Class<? extends Object> term48848 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term48847 = ((Class) term48848).getDeclaredField((String) "IN_ALLIANCE");
        ((Field) term48847).setAccessible(true);
        Object enum136 = ((Field) term48847).get((Object) null);
        Object term48479 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term48479, term48479.getClass(), "type", enum136);
        setBooleanField(term48479, term48479.getClass(), "onlyOne", false);
        setIntField(term48479, term48479.getClass(), "bonusValue", -573608449);
        setIntField(term48479, term48479.getClass(), "bonusLasting", -1660057757);
        Class<? extends Object> term49168 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term49167 = ((Class) term49168).getDeclaredField((String) "NUKED");
        ((Field) term49167).setAccessible(true);
        Object enum137 = ((Field) term49167).get((Object) null);
        Object term48485 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term48485, term48485.getClass(), "type", enum137);
        setBooleanField(term48485, term48485.getClass(), "onlyOne", false);
        setIntField(term48485, term48485.getClass(), "bonusValue", 1816273440);
        setIntField(term48485, term48485.getClass(), "bonusLasting", -96541009);
        Class<? extends Object> term49470 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term49469 = ((Class) term49470).getDeclaredField((String) "ESPIONAGE_BORDER_CROSS");
        ((Field) term49469).setAccessible(true);
        Object enum138 = ((Field) term49469).get((Object) null);
        Object term48491 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term48491, term48491.getClass(), "type", enum138);
        setBooleanField(term48491, term48491.getClass(), "onlyOne", false);
        setIntField(term48491, term48491.getClass(), "bonusValue", -43719302);
        setIntField(term48491, term48491.getClass(), "bonusLasting", 1024134939);
        Class<? extends Object> term49823 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term49822 = ((Class) term49823).getDeclaredField((String) "DISLIKED_EMBARGO");
        ((Field) term49822).setAccessible(true);
        Object enum139 = ((Field) term49822).get((Object) null);
        Object term48497 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term48497, term48497.getClass(), "type", enum139);
        setBooleanField(term48497, term48497.getClass(), "onlyOne", false);
        setIntField(term48497, term48497.getClass(), "bonusValue", 109078154);
        setIntField(term48497, term48497.getClass(), "bonusLasting", -314165467);
        Class<? extends Object> term50158 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term50157 = ((Class) term50158).getDeclaredField((String) "REALM_LOST");
        ((Field) term50157).setAccessible(true);
        Object enum140 = ((Field) term50157).get((Object) null);
        Object term48503 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term48503, term48503.getClass(), "type", enum140);
        setBooleanField(term48503, term48503.getClass(), "onlyOne", true);
        setIntField(term48503, term48503.getClass(), "bonusValue", 963694071);
        setIntField(term48503, term48503.getClass(), "bonusLasting", -995785731);
        Class<? extends Object> term50475 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term50474 = ((Class) term50475).getDeclaredField((String) "OLYMPICS");
        ((Field) term50474).setAccessible(true);
        Object enum141 = ((Field) term50474).get((Object) null);
        Object term48509 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term48509, term48509.getClass(), "type", enum141);
        setBooleanField(term48509, term48509.getClass(), "onlyOne", false);
        setIntField(term48509, term48509.getClass(), "bonusValue", 1349815364);
        setIntField(term48509, term48509.getClass(), "bonusLasting", 2128383340);
        ArrayList term48471 = new ArrayList();
        ((ArrayList) term48471).add(term48473);
        ((ArrayList) term48471).add(term48479);
        ((ArrayList) term48471).add(term48485);
        ((ArrayList) term48471).add(term48491);
        ((ArrayList) term48471).add(term48497);
        ((ArrayList) term48471).add(term48503);
        ((ArrayList) term48471).add(term48509);
        term48469 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term48469, term48469.getClass(), "playerIndex", 777492093);
        setField(term48469, term48469.getClass(), "list", term48471);
        setIntField(term48469, term48469.getClass(), "numberOfMeetings", 1238598518);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberOfMeetings", argTypes, term48469, args);
    }

};


