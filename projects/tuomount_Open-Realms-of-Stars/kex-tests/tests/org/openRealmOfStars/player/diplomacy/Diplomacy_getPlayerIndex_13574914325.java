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

public class Diplomacy_getPlayerIndex_13574914325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69928;

    public Diplomacy_getPlayerIndex_13574914325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term69932 = new ArrayList();
        ((ArrayList) term69932).add((Object)null);
        ((ArrayList) term69932).add((Object)null);
        ((ArrayList) term69932).add((Object)null);
        ((ArrayList) term69932).add((Object)null);
        ArrayList term69939 = new ArrayList();
        ((ArrayList) term69939).add((Object)null);
        ((ArrayList) term69939).add((Object)null);
        term69928 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term69929 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 2);
        Object term69930 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term69937 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term69930, term69930.getClass(), "playerIndex", -203832871);
        setField(term69930, term69930.getClass(), "list", term69932);
        setIntField(term69930, term69930.getClass(), "numberOfMeetings", 1504698817);
        setElement(term69929, 0, term69930);
        setIntField(term69937, term69937.getClass(), "playerIndex", -2018333791);
        setField(term69937, term69937.getClass(), "list", term69939);
        setIntField(term69937, term69937.getClass(), "numberOfMeetings", -867099093);
        setElement(term69929, 1, term69937);
        setField(term69928, term69928.getClass(), "diplomacyList", term69929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayerIndex", argTypes, term69928, args);
    }

};


