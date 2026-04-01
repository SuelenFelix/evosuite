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

public class DiplomacyBonusList_handleForTurn_120909113018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47140;

    public DiplomacyBonusList_handleForTurn_120909113018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term47172 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term47171 = ((Class) term47172).getDeclaredField((String) "IN_WAR");
        ((Field) term47171).setAccessible(true);
        Object enum131 = ((Field) term47171).get((Object) null);
        Object term47144 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term47144, term47144.getClass(), "type", enum131);
        setBooleanField(term47144, term47144.getClass(), "onlyOne", true);
        setIntField(term47144, term47144.getClass(), "bonusValue", 178847646);
        setIntField(term47144, term47144.getClass(), "bonusLasting", 273590437);
        Class<? extends Object> term47477 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term47476 = ((Class) term47477).getDeclaredField((String) "NOTHING_TO_TRADE");
        ((Field) term47476).setAccessible(true);
        Object enum132 = ((Field) term47476).get((Object) null);
        Object term47150 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term47150, term47150.getClass(), "type", enum132);
        setBooleanField(term47150, term47150.getClass(), "onlyOne", false);
        setIntField(term47150, term47150.getClass(), "bonusValue", -348612876);
        setIntField(term47150, term47150.getClass(), "bonusLasting", 1302807565);
        Class<? extends Object> term47812 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term47811 = ((Class) term47812).getDeclaredField((String) "SIMILAR_GOVERNMENT");
        ((Field) term47811).setAccessible(true);
        Object enum133 = ((Field) term47811).get((Object) null);
        Object term47156 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term47156, term47156.getClass(), "type", enum133);
        setBooleanField(term47156, term47156.getClass(), "onlyOne", false);
        setIntField(term47156, term47156.getClass(), "bonusValue", -838848221);
        setIntField(term47156, term47156.getClass(), "bonusLasting", 1163761623);
        Class<? extends Object> term48153 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term48152 = ((Class) term48153).getDeclaredField((String) "LONG_PEACE");
        ((Field) term48152).setAccessible(true);
        Object enum134 = ((Field) term48152).get((Object) null);
        Object term47162 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term47162, term47162.getClass(), "type", enum134);
        setBooleanField(term47162, term47162.getClass(), "onlyOne", false);
        setIntField(term47162, term47162.getClass(), "bonusValue", 718742281);
        setIntField(term47162, term47162.getClass(), "bonusLasting", 1532723756);
        ArrayList term47142 = new ArrayList();
        ((ArrayList) term47142).add(term47144);
        ((ArrayList) term47142).add(term47150);
        ((ArrayList) term47142).add(term47156);
        ((ArrayList) term47142).add(term47162);
        term47140 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term47140, term47140.getClass(), "playerIndex", -270592367);
        setField(term47140, term47140.getClass(), "list", term47142);
        setIntField(term47140, term47140.getClass(), "numberOfMeetings", -124088550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "handleForTurn", argTypes, term47140, args);
    }

};


