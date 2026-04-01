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

public class Diplomacy_isLost_17510599018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70036;
     Object term70080;

    public Diplomacy_isLost_17510599018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70040 = new ArrayList();
        ((ArrayList) term70040).add((Object)null);
        ((ArrayList) term70040).add((Object)null);
        ArrayList term70047 = new ArrayList();
        ((ArrayList) term70047).add((Object)null);
        ((ArrayList) term70047).add((Object)null);
        ((ArrayList) term70047).add((Object)null);
        ((ArrayList) term70047).add((Object)null);
        ((ArrayList) term70047).add((Object)null);
        ((ArrayList) term70047).add((Object)null);
        ((ArrayList) term70047).add((Object)null);
        ((ArrayList) term70047).add((Object)null);
        ArrayList term70054 = new ArrayList();
        ((ArrayList) term70054).add((Object)null);
        ((ArrayList) term70054).add((Object)null);
        ((ArrayList) term70054).add((Object)null);
        ((ArrayList) term70054).add((Object)null);
        ((ArrayList) term70054).add((Object)null);
        ((ArrayList) term70054).add((Object)null);
        ((ArrayList) term70054).add((Object)null);
        ArrayList term70061 = new ArrayList();
        ((ArrayList) term70061).add((Object)null);
        ((ArrayList) term70061).add((Object)null);
        ((ArrayList) term70061).add((Object)null);
        ArrayList term70068 = new ArrayList();
        ((ArrayList) term70068).add((Object)null);
        ((ArrayList) term70068).add((Object)null);
        ((ArrayList) term70068).add((Object)null);
        ((ArrayList) term70068).add((Object)null);
        ((ArrayList) term70068).add((Object)null);
        ((ArrayList) term70068).add((Object)null);
        ((ArrayList) term70068).add((Object)null);
        ArrayList term70075 = new ArrayList();
        ((ArrayList) term70075).add((Object)null);
        ((ArrayList) term70075).add((Object)null);
        ((ArrayList) term70075).add((Object)null);
        ((ArrayList) term70075).add((Object)null);
        ((ArrayList) term70075).add((Object)null);
        ((ArrayList) term70075).add((Object)null);
        ((ArrayList) term70075).add((Object)null);
        ((ArrayList) term70075).add((Object)null);
        term70036 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70037 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 6);
        Object term70038 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70045 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70052 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70059 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70066 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70073 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70038, term70038.getClass(), "playerIndex", 1094297953);
        setField(term70038, term70038.getClass(), "list", term70040);
        setIntField(term70038, term70038.getClass(), "numberOfMeetings", 1583691829);
        setElement(term70037, 0, term70038);
        setIntField(term70045, term70045.getClass(), "playerIndex", -1468541076);
        setField(term70045, term70045.getClass(), "list", term70047);
        setIntField(term70045, term70045.getClass(), "numberOfMeetings", 533171496);
        setElement(term70037, 1, term70045);
        setIntField(term70052, term70052.getClass(), "playerIndex", 1369020869);
        setField(term70052, term70052.getClass(), "list", term70054);
        setIntField(term70052, term70052.getClass(), "numberOfMeetings", -1428947021);
        setElement(term70037, 2, term70052);
        setIntField(term70059, term70059.getClass(), "playerIndex", -134324004);
        setField(term70059, term70059.getClass(), "list", term70061);
        setIntField(term70059, term70059.getClass(), "numberOfMeetings", -1813266173);
        setElement(term70037, 3, term70059);
        setIntField(term70066, term70066.getClass(), "playerIndex", -1201819537);
        setField(term70066, term70066.getClass(), "list", term70068);
        setIntField(term70066, term70066.getClass(), "numberOfMeetings", 2135922049);
        setElement(term70037, 4, term70066);
        setIntField(term70073, term70073.getClass(), "playerIndex", -263876378);
        setField(term70073, term70073.getClass(), "list", term70075);
        setIntField(term70073, term70073.getClass(), "numberOfMeetings", -755209283);
        setElement(term70037, 5, term70073);
        setField(term70036, term70036.getClass(), "diplomacyList", term70037);
        term70080 = new Integer(-616562794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70080;
        callMethod(klass, "isLost", argTypes, term70036, args);
    }

};


