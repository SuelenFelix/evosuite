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

public class DiplomacyBonusList_getDiplomacyBonus_17921842092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26537;

    public DiplomacyBonusList_getDiplomacyBonus_17921842092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term26575 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term26574 = ((Class) term26575).getDeclaredField((String) "MADE_DEMAND");
        ((Field) term26574).setAccessible(true);
        Object enum69 = ((Field) term26574).get((Object) null);
        Object term26541 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term26541, term26541.getClass(), "type", enum69);
        setBooleanField(term26541, term26541.getClass(), "onlyOne", true);
        setIntField(term26541, term26541.getClass(), "bonusValue", 1964967720);
        setIntField(term26541, term26541.getClass(), "bonusLasting", 1351900243);
        Class<? extends Object> term26895 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term26894 = ((Class) term26895).getDeclaredField((String) "PROMISED_PROTECTION");
        ((Field) term26894).setAccessible(true);
        Object enum70 = ((Field) term26894).get((Object) null);
        Object term26547 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term26547, term26547.getClass(), "type", enum70);
        setBooleanField(term26547, term26547.getClass(), "onlyOne", true);
        setIntField(term26547, term26547.getClass(), "bonusValue", -330897705);
        setIntField(term26547, term26547.getClass(), "bonusLasting", 1065595802);
        Class<? extends Object> term27239 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term27238 = ((Class) term27239).getDeclaredField((String) "INSULT");
        ((Field) term27238).setAccessible(true);
        Object enum71 = ((Field) term27238).get((Object) null);
        Object term26553 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term26553, term26553.getClass(), "type", enum71);
        setBooleanField(term26553, term26553.getClass(), "onlyOne", true);
        setIntField(term26553, term26553.getClass(), "bonusValue", 21031843);
        setIntField(term26553, term26553.getClass(), "bonusLasting", -380787857);
        Class<? extends Object> term27544 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term27543 = ((Class) term27544).getDeclaredField((String) "NOTHING_TO_TRADE");
        ((Field) term27543).setAccessible(true);
        Object enum72 = ((Field) term27543).get((Object) null);
        Object term26559 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term26559, term26559.getClass(), "type", enum72);
        setBooleanField(term26559, term26559.getClass(), "onlyOne", false);
        setIntField(term26559, term26559.getClass(), "bonusValue", 319853052);
        setIntField(term26559, term26559.getClass(), "bonusLasting", -1097563716);
        Class<? extends Object> term27879 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term27878 = ((Class) term27879).getDeclaredField((String) "INSULT");
        ((Field) term27878).setAccessible(true);
        Object enum73 = ((Field) term27878).get((Object) null);
        Object term26565 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term26565, term26565.getClass(), "type", enum73);
        setBooleanField(term26565, term26565.getClass(), "onlyOne", false);
        setIntField(term26565, term26565.getClass(), "bonusValue", 1572907769);
        setIntField(term26565, term26565.getClass(), "bonusLasting", 1608016787);
        ArrayList term26539 = new ArrayList();
        ((ArrayList) term26539).add(term26541);
        ((ArrayList) term26539).add(term26547);
        ((ArrayList) term26539).add(term26553);
        ((ArrayList) term26539).add(term26559);
        ((ArrayList) term26539).add(term26565);
        term26537 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term26537, term26537.getClass(), "playerIndex", -15712667);
        setField(term26537, term26537.getClass(), "list", term26539);
        setIntField(term26537, term26537.getClass(), "numberOfMeetings", -516303035);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDiplomacyBonus", argTypes, term26537, args);
    }

};


