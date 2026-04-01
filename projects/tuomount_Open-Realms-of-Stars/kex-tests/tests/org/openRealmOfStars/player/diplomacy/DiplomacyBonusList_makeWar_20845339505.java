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

public class DiplomacyBonusList_makeWar_20845339505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30815;

    public DiplomacyBonusList_makeWar_20845339505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term30851 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term30850 = ((Class) term30851).getDeclaredField((String) "IN_TRADE_ALLIANCE");
        ((Field) term30850).setAccessible(true);
        Object enum82 = ((Field) term30850).get((Object) null);
        Object term30819 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term30819, term30819.getClass(), "type", enum82);
        setBooleanField(term30819, term30819.getClass(), "onlyOne", false);
        setIntField(term30819, term30819.getClass(), "bonusValue", 1713573821);
        setIntField(term30819, term30819.getClass(), "bonusLasting", 1956590498);
        Class<? extends Object> term31189 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term31188 = ((Class) term31189).getDeclaredField((String) "IN_ALLIANCE");
        ((Field) term31188).setAccessible(true);
        Object enum83 = ((Field) term31188).get((Object) null);
        Object term30825 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term30825, term30825.getClass(), "type", enum83);
        setBooleanField(term30825, term30825.getClass(), "onlyOne", false);
        setIntField(term30825, term30825.getClass(), "bonusValue", 1467356494);
        setIntField(term30825, term30825.getClass(), "bonusLasting", -26316536);
        Class<? extends Object> term31509 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term31508 = ((Class) term31509).getDeclaredField((String) "EMBARGO");
        ((Field) term31508).setAccessible(true);
        Object enum84 = ((Field) term31508).get((Object) null);
        Object term30831 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term30831, term30831.getClass(), "type", enum84);
        setBooleanField(term30831, term30831.getClass(), "onlyOne", true);
        setIntField(term30831, term30831.getClass(), "bonusValue", 1716165145);
        setIntField(term30831, term30831.getClass(), "bonusLasting", 1692937831);
        Class<? extends Object> term31817 = Class.forName((String) "org.openRealmOfStars.player.diplomacy.DiplomacyBonusType");
        Field term31816 = ((Class) term31817).getDeclaredField((String) "SIMILAR_GOVERNMENT_DIFFERENT_GROUP");
        ((Field) term31816).setAccessible(true);
        Object enum85 = ((Field) term31816).get((Object) null);
        Object term30837 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term30837, term30837.getClass(), "type", enum85);
        setBooleanField(term30837, term30837.getClass(), "onlyOne", false);
        setIntField(term30837, term30837.getClass(), "bonusValue", -1539747985);
        setIntField(term30837, term30837.getClass(), "bonusLasting", -1982489643);
        Object term30843 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonus"));
        setField(term30843, term30843.getClass(), "type", enum84);
        setBooleanField(term30843, term30843.getClass(), "onlyOne", true);
        setIntField(term30843, term30843.getClass(), "bonusValue", 550892835);
        setIntField(term30843, term30843.getClass(), "bonusLasting", 1237549886);
        ArrayList term30817 = new ArrayList();
        ((ArrayList) term30817).add(term30819);
        ((ArrayList) term30817).add(term30825);
        ((ArrayList) term30817).add(term30831);
        ((ArrayList) term30817).add(term30837);
        ((ArrayList) term30817).add(term30843);
        term30815 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term30815, term30815.getClass(), "playerIndex", 514511037);
        setField(term30815, term30815.getClass(), "list", term30817);
        setIntField(term30815, term30815.getClass(), "numberOfMeetings", -1945635750);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "makeWar", argTypes, term30815, args);
    }

};


