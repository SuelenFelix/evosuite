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

public class Diplomacy_generateRelationExplanation_191848304434 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71081;
     Object term71132;

    public Diplomacy_generateRelationExplanation_191848304434() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term71085 = new ArrayList();
        ((ArrayList) term71085).add((Object)null);
        ((ArrayList) term71085).add((Object)null);
        ((ArrayList) term71085).add((Object)null);
        ((ArrayList) term71085).add((Object)null);
        ((ArrayList) term71085).add((Object)null);
        ((ArrayList) term71085).add((Object)null);
        ((ArrayList) term71085).add((Object)null);
        ((ArrayList) term71085).add((Object)null);
        ((ArrayList) term71085).add((Object)null);
        ArrayList term71092 = new ArrayList();
        ((ArrayList) term71092).add((Object)null);
        ((ArrayList) term71092).add((Object)null);
        ((ArrayList) term71092).add((Object)null);
        ((ArrayList) term71092).add((Object)null);
        ((ArrayList) term71092).add((Object)null);
        ((ArrayList) term71092).add((Object)null);
        ((ArrayList) term71092).add((Object)null);
        ((ArrayList) term71092).add((Object)null);
        ArrayList term71099 = new ArrayList();
        ((ArrayList) term71099).add((Object)null);
        ((ArrayList) term71099).add((Object)null);
        ((ArrayList) term71099).add((Object)null);
        ((ArrayList) term71099).add((Object)null);
        ((ArrayList) term71099).add((Object)null);
        ((ArrayList) term71099).add((Object)null);
        ArrayList term71106 = new ArrayList();
        ((ArrayList) term71106).add((Object)null);
        ((ArrayList) term71106).add((Object)null);
        ((ArrayList) term71106).add((Object)null);
        ((ArrayList) term71106).add((Object)null);
        ((ArrayList) term71106).add((Object)null);
        ((ArrayList) term71106).add((Object)null);
        ((ArrayList) term71106).add((Object)null);
        ((ArrayList) term71106).add((Object)null);
        ArrayList term71113 = new ArrayList();
        ((ArrayList) term71113).add((Object)null);
        ((ArrayList) term71113).add((Object)null);
        ((ArrayList) term71113).add((Object)null);
        ((ArrayList) term71113).add((Object)null);
        ((ArrayList) term71113).add((Object)null);
        ((ArrayList) term71113).add((Object)null);
        ((ArrayList) term71113).add((Object)null);
        ((ArrayList) term71113).add((Object)null);
        ArrayList term71120 = new ArrayList();
        ((ArrayList) term71120).add((Object)null);
        ((ArrayList) term71120).add((Object)null);
        ((ArrayList) term71120).add((Object)null);
        ((ArrayList) term71120).add((Object)null);
        ((ArrayList) term71120).add((Object)null);
        ((ArrayList) term71120).add((Object)null);
        ArrayList term71127 = new ArrayList();
        ((ArrayList) term71127).add((Object)null);
        term71081 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term71082 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 7);
        Object term71083 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term71090 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term71097 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term71104 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term71111 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term71118 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term71125 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term71083, term71083.getClass(), "playerIndex", -1707655562);
        setField(term71083, term71083.getClass(), "list", term71085);
        setIntField(term71083, term71083.getClass(), "numberOfMeetings", -318699441);
        setElement(term71082, 0, term71083);
        setIntField(term71090, term71090.getClass(), "playerIndex", 1381027809);
        setField(term71090, term71090.getClass(), "list", term71092);
        setIntField(term71090, term71090.getClass(), "numberOfMeetings", -1948910444);
        setElement(term71082, 1, term71090);
        setIntField(term71097, term71097.getClass(), "playerIndex", -1099061955);
        setField(term71097, term71097.getClass(), "list", term71099);
        setIntField(term71097, term71097.getClass(), "numberOfMeetings", -1672904007);
        setElement(term71082, 2, term71097);
        setIntField(term71104, term71104.getClass(), "playerIndex", -217232010);
        setField(term71104, term71104.getClass(), "list", term71106);
        setIntField(term71104, term71104.getClass(), "numberOfMeetings", 2053372601);
        setElement(term71082, 3, term71104);
        setIntField(term71111, term71111.getClass(), "playerIndex", -1828855069);
        setField(term71111, term71111.getClass(), "list", term71113);
        setIntField(term71111, term71111.getClass(), "numberOfMeetings", -1213694931);
        setElement(term71082, 4, term71111);
        setIntField(term71118, term71118.getClass(), "playerIndex", -1255656944);
        setField(term71118, term71118.getClass(), "list", term71120);
        setIntField(term71118, term71118.getClass(), "numberOfMeetings", -377697034);
        setElement(term71082, 5, term71118);
        setIntField(term71125, term71125.getClass(), "playerIndex", 1102778743);
        setField(term71125, term71125.getClass(), "list", term71127);
        setIntField(term71125, term71125.getClass(), "numberOfMeetings", 1300928519);
        setElement(term71082, 6, term71125);
        setField(term71081, term71081.getClass(), "diplomacyList", term71082);
        term71132 = new Integer(338172676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71132;
        callMethod(klass, "generateRelationExplanation", argTypes, term71081, args);
    }

};


