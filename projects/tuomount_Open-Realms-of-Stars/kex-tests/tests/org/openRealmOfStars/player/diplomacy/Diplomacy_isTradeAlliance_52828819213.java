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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;

public class Diplomacy_isTradeAlliance_52828819213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70264;
     Object term70315;

    public Diplomacy_isTradeAlliance_52828819213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70268 = new ArrayList();
        ((ArrayList) term70268).add((Object)null);
        ((ArrayList) term70268).add((Object)null);
        ((ArrayList) term70268).add((Object)null);
        ((ArrayList) term70268).add((Object)null);
        ((ArrayList) term70268).add((Object)null);
        ((ArrayList) term70268).add((Object)null);
        ArrayList term70275 = new ArrayList();
        ((ArrayList) term70275).add((Object)null);
        ((ArrayList) term70275).add((Object)null);
        ((ArrayList) term70275).add((Object)null);
        ((ArrayList) term70275).add((Object)null);
        ArrayList term70282 = new ArrayList();
        ((ArrayList) term70282).add((Object)null);
        ((ArrayList) term70282).add((Object)null);
        ArrayList term70289 = new ArrayList();
        ((ArrayList) term70289).add((Object)null);
        ((ArrayList) term70289).add((Object)null);
        ((ArrayList) term70289).add((Object)null);
        ((ArrayList) term70289).add((Object)null);
        ((ArrayList) term70289).add((Object)null);
        ((ArrayList) term70289).add((Object)null);
        ((ArrayList) term70289).add((Object)null);
        ((ArrayList) term70289).add((Object)null);
        ArrayList term70296 = new ArrayList();
        ((ArrayList) term70296).add((Object)null);
        ((ArrayList) term70296).add((Object)null);
        ((ArrayList) term70296).add((Object)null);
        ArrayList term70303 = new ArrayList();
        ((ArrayList) term70303).add((Object)null);
        ((ArrayList) term70303).add((Object)null);
        ((ArrayList) term70303).add((Object)null);
        ((ArrayList) term70303).add((Object)null);
        ((ArrayList) term70303).add((Object)null);
        ((ArrayList) term70303).add((Object)null);
        ((ArrayList) term70303).add((Object)null);
        ArrayList term70310 = new ArrayList();
        ((ArrayList) term70310).add((Object)null);
        ((ArrayList) term70310).add((Object)null);
        ((ArrayList) term70310).add((Object)null);
        term70264 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70265 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 7);
        Object term70266 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70273 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70280 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70287 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70294 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70301 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70308 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70266, term70266.getClass(), "playerIndex", 1357632911);
        setField(term70266, term70266.getClass(), "list", term70268);
        setIntField(term70266, term70266.getClass(), "numberOfMeetings", -288126597);
        setElement(term70265, 0, term70266);
        setIntField(term70273, term70273.getClass(), "playerIndex", -218831961);
        setField(term70273, term70273.getClass(), "list", term70275);
        setIntField(term70273, term70273.getClass(), "numberOfMeetings", 1782226794);
        setElement(term70265, 1, term70273);
        setIntField(term70280, term70280.getClass(), "playerIndex", 1115327577);
        setField(term70280, term70280.getClass(), "list", term70282);
        setIntField(term70280, term70280.getClass(), "numberOfMeetings", 840704993);
        setElement(term70265, 2, term70280);
        setIntField(term70287, term70287.getClass(), "playerIndex", 1297035285);
        setField(term70287, term70287.getClass(), "list", term70289);
        setIntField(term70287, term70287.getClass(), "numberOfMeetings", -826239685);
        setElement(term70265, 3, term70287);
        setIntField(term70294, term70294.getClass(), "playerIndex", -845551243);
        setField(term70294, term70294.getClass(), "list", term70296);
        setIntField(term70294, term70294.getClass(), "numberOfMeetings", 370671198);
        setElement(term70265, 4, term70294);
        setIntField(term70301, term70301.getClass(), "playerIndex", 1426800646);
        setField(term70301, term70301.getClass(), "list", term70303);
        setIntField(term70301, term70301.getClass(), "numberOfMeetings", 954234820);
        setElement(term70265, 5, term70301);
        setIntField(term70308, term70308.getClass(), "playerIndex", 1047346538);
        setField(term70308, term70308.getClass(), "list", term70310);
        setIntField(term70308, term70308.getClass(), "numberOfMeetings", 728436340);
        setElement(term70265, 6, term70308);
        setField(term70264, term70264.getClass(), "diplomacyList", term70265);
        term70315 = new Integer(1841731593);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70315;
        callMethod(klass, "isTradeAlliance", argTypes, term70264, args);
    }

};


