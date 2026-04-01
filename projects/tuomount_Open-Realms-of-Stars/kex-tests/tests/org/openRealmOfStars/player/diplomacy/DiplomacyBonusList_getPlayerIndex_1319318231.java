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

public class DiplomacyBonusList_getPlayerIndex_1319318231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25234;

    public DiplomacyBonusList_getPlayerIndex_1319318231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term25270 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term25269 = ((Class) term25270).getDeclaredField((String) "DNS_OLYMPICS");
        ((Field) term25269).setAccessible(true);
        Object enum65 = ((Field) term25269).get((Object) null);
        Object term25238 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term25238, term25238.getClass(), "type", enum65);
        setBooleanField(term25238, term25238.getClass(), "onlyOne", false);
        setIntField(term25238, term25238.getClass(), "bonusValue", -1549607466);
        setIntField(term25238, term25238.getClass(), "bonusLasting", 853609788);
        Class<? extends Object> term25593 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term25592 = ((Class) term25593).getDeclaredField((String) "BORDER_CROSSED");
        ((Field) term25592).setAccessible(true);
        Object enum66 = ((Field) term25592).get((Object) null);
        Object term25244 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term25244, term25244.getClass(), "type", enum66);
        setBooleanField(term25244, term25244.getClass(), "onlyOne", true);
        setIntField(term25244, term25244.getClass(), "bonusValue", -197820800);
        setIntField(term25244, term25244.getClass(), "bonusLasting", 723812297);
        Class<? extends Object> term25922 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term25921 = ((Class) term25922).getDeclaredField((String) "INSULT");
        ((Field) term25921).setAccessible(true);
        Object enum67 = ((Field) term25921).get((Object) null);
        Object term25250 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term25250, term25250.getClass(), "type", enum67);
        setBooleanField(term25250, term25250.getClass(), "onlyOne", true);
        setIntField(term25250, term25250.getClass(), "bonusValue", 1639448749);
        setIntField(term25250, term25250.getClass(), "bonusLasting", 873659088);
        Object term25256 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term25256, term25256.getClass(), "type", enum67);
        setBooleanField(term25256, term25256.getClass(), "onlyOne", false);
        setIntField(term25256, term25256.getClass(), "bonusValue", -975748721);
        setIntField(term25256, term25256.getClass(), "bonusLasting", 433248783);
        Class<? extends Object> term26227 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term26226 = ((Class) term26227).getDeclaredField((String) "OLYMPICS");
        ((Field) term26226).setAccessible(true);
        Object enum68 = ((Field) term26226).get((Object) null);
        Object term25260 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term25260, term25260.getClass(), "type", enum68);
        setBooleanField(term25260, term25260.getClass(), "onlyOne", false);
        setIntField(term25260, term25260.getClass(), "bonusValue", -507944154);
        setIntField(term25260, term25260.getClass(), "bonusLasting", -1736183862);
        ArrayList term25236 = new ArrayList();
        ((ArrayList) term25236).add(term25238);
        ((ArrayList) term25236).add(term25244);
        ((ArrayList) term25236).add(term25250);
        ((ArrayList) term25236).add(term25256);
        ((ArrayList) term25236).add(term25260);
        term25234 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term25234, term25234.getClass(), "playerIndex", 291864719);
        setField(term25234, term25234.getClass(), "list", term25236);
        setIntField(term25234, term25234.getClass(), "numberOfMeetings", 897010381);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerIndex", argTypes, term25234, args);
    }

};


