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

public class Diplomacy_updateDiplomacyLastingForTurn_5576402212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70206;

    public Diplomacy_updateDiplomacyLastingForTurn_5576402212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70210 = new ArrayList();
        ((ArrayList) term70210).add((Object)null);
        ((ArrayList) term70210).add((Object)null);
        ((ArrayList) term70210).add((Object)null);
        ((ArrayList) term70210).add((Object)null);
        ((ArrayList) term70210).add((Object)null);
        ((ArrayList) term70210).add((Object)null);
        ((ArrayList) term70210).add((Object)null);
        ArrayList term70217 = new ArrayList();
        ((ArrayList) term70217).add((Object)null);
        ((ArrayList) term70217).add((Object)null);
        ((ArrayList) term70217).add((Object)null);
        ((ArrayList) term70217).add((Object)null);
        ((ArrayList) term70217).add((Object)null);
        ((ArrayList) term70217).add((Object)null);
        ((ArrayList) term70217).add((Object)null);
        ((ArrayList) term70217).add((Object)null);
        ArrayList term70224 = new ArrayList();
        ((ArrayList) term70224).add((Object)null);
        ((ArrayList) term70224).add((Object)null);
        ArrayList term70231 = new ArrayList();
        ((ArrayList) term70231).add((Object)null);
        ((ArrayList) term70231).add((Object)null);
        ((ArrayList) term70231).add((Object)null);
        ((ArrayList) term70231).add((Object)null);
        ((ArrayList) term70231).add((Object)null);
        ArrayList term70238 = new ArrayList();
        ((ArrayList) term70238).add((Object)null);
        ((ArrayList) term70238).add((Object)null);
        ((ArrayList) term70238).add((Object)null);
        ((ArrayList) term70238).add((Object)null);
        ((ArrayList) term70238).add((Object)null);
        ((ArrayList) term70238).add((Object)null);
        ((ArrayList) term70238).add((Object)null);
        ArrayList term70245 = new ArrayList();
        ((ArrayList) term70245).add((Object)null);
        ((ArrayList) term70245).add((Object)null);
        ((ArrayList) term70245).add((Object)null);
        ArrayList term70252 = new ArrayList();
        ((ArrayList) term70252).add((Object)null);
        ((ArrayList) term70252).add((Object)null);
        ((ArrayList) term70252).add((Object)null);
        ((ArrayList) term70252).add((Object)null);
        ((ArrayList) term70252).add((Object)null);
        ((ArrayList) term70252).add((Object)null);
        ((ArrayList) term70252).add((Object)null);
        ((ArrayList) term70252).add((Object)null);
        ((ArrayList) term70252).add((Object)null);
        ArrayList term70259 = new ArrayList();
        term70206 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70207 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 8);
        Object term70208 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70215 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70222 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70229 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70236 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70243 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70250 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70257 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70208, term70208.getClass(), "playerIndex", -91068927);
        setField(term70208, term70208.getClass(), "list", term70210);
        setIntField(term70208, term70208.getClass(), "numberOfMeetings", -1897199214);
        setElement(term70207, 0, term70208);
        setIntField(term70215, term70215.getClass(), "playerIndex", -1016478729);
        setField(term70215, term70215.getClass(), "list", term70217);
        setIntField(term70215, term70215.getClass(), "numberOfMeetings", -44720365);
        setElement(term70207, 1, term70215);
        setIntField(term70222, term70222.getClass(), "playerIndex", 1963632911);
        setField(term70222, term70222.getClass(), "list", term70224);
        setIntField(term70222, term70222.getClass(), "numberOfMeetings", -1100497683);
        setElement(term70207, 2, term70222);
        setIntField(term70229, term70229.getClass(), "playerIndex", 155423433);
        setField(term70229, term70229.getClass(), "list", term70231);
        setIntField(term70229, term70229.getClass(), "numberOfMeetings", -815471632);
        setElement(term70207, 3, term70229);
        setIntField(term70236, term70236.getClass(), "playerIndex", -1469668708);
        setField(term70236, term70236.getClass(), "list", term70238);
        setIntField(term70236, term70236.getClass(), "numberOfMeetings", 1796950482);
        setElement(term70207, 4, term70236);
        setIntField(term70243, term70243.getClass(), "playerIndex", -945759470);
        setField(term70243, term70243.getClass(), "list", term70245);
        setIntField(term70243, term70243.getClass(), "numberOfMeetings", 657342039);
        setElement(term70207, 5, term70243);
        setIntField(term70250, term70250.getClass(), "playerIndex", 1483999606);
        setField(term70250, term70250.getClass(), "list", term70252);
        setIntField(term70250, term70250.getClass(), "numberOfMeetings", 1871761182);
        setElement(term70207, 6, term70250);
        setIntField(term70257, term70257.getClass(), "playerIndex", 233983728);
        setField(term70257, term70257.getClass(), "list", term70259);
        setIntField(term70257, term70257.getClass(), "numberOfMeetings", -1650132476);
        setElement(term70207, 7, term70257);
        setField(term70206, term70206.getClass(), "diplomacyList", term70207);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "updateDiplomacyLastingForTurn", argTypes, term70206, args);
    }

};


