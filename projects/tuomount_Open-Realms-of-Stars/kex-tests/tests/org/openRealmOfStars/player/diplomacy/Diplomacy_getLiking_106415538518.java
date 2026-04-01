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

public class Diplomacy_getLiking_106415538518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70490;
     Object term70534;

    public Diplomacy_getLiking_106415538518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70494 = new ArrayList();
        ((ArrayList) term70494).add((Object)null);
        ((ArrayList) term70494).add((Object)null);
        ((ArrayList) term70494).add((Object)null);
        ((ArrayList) term70494).add((Object)null);
        ((ArrayList) term70494).add((Object)null);
        ((ArrayList) term70494).add((Object)null);
        ArrayList term70501 = new ArrayList();
        ((ArrayList) term70501).add((Object)null);
        ((ArrayList) term70501).add((Object)null);
        ((ArrayList) term70501).add((Object)null);
        ((ArrayList) term70501).add((Object)null);
        ((ArrayList) term70501).add((Object)null);
        ArrayList term70508 = new ArrayList();
        ((ArrayList) term70508).add((Object)null);
        ((ArrayList) term70508).add((Object)null);
        ((ArrayList) term70508).add((Object)null);
        ((ArrayList) term70508).add((Object)null);
        ((ArrayList) term70508).add((Object)null);
        ((ArrayList) term70508).add((Object)null);
        ((ArrayList) term70508).add((Object)null);
        ((ArrayList) term70508).add((Object)null);
        ((ArrayList) term70508).add((Object)null);
        ArrayList term70515 = new ArrayList();
        ((ArrayList) term70515).add((Object)null);
        ((ArrayList) term70515).add((Object)null);
        ((ArrayList) term70515).add((Object)null);
        ArrayList term70522 = new ArrayList();
        ((ArrayList) term70522).add((Object)null);
        ((ArrayList) term70522).add((Object)null);
        ((ArrayList) term70522).add((Object)null);
        ((ArrayList) term70522).add((Object)null);
        ((ArrayList) term70522).add((Object)null);
        ((ArrayList) term70522).add((Object)null);
        ((ArrayList) term70522).add((Object)null);
        ((ArrayList) term70522).add((Object)null);
        ArrayList term70529 = new ArrayList();
        ((ArrayList) term70529).add((Object)null);
        ((ArrayList) term70529).add((Object)null);
        ((ArrayList) term70529).add((Object)null);
        ((ArrayList) term70529).add((Object)null);
        ((ArrayList) term70529).add((Object)null);
        term70490 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70491 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 6);
        Object term70492 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70499 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70506 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70513 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70520 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70527 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70492, term70492.getClass(), "playerIndex", -650288950);
        setField(term70492, term70492.getClass(), "list", term70494);
        setIntField(term70492, term70492.getClass(), "numberOfMeetings", 207213904);
        setElement(term70491, 0, term70492);
        setIntField(term70499, term70499.getClass(), "playerIndex", -484303394);
        setField(term70499, term70499.getClass(), "list", term70501);
        setIntField(term70499, term70499.getClass(), "numberOfMeetings", 200150950);
        setElement(term70491, 1, term70499);
        setIntField(term70506, term70506.getClass(), "playerIndex", -366198044);
        setField(term70506, term70506.getClass(), "list", term70508);
        setIntField(term70506, term70506.getClass(), "numberOfMeetings", -1350380769);
        setElement(term70491, 2, term70506);
        setIntField(term70513, term70513.getClass(), "playerIndex", -1432215030);
        setField(term70513, term70513.getClass(), "list", term70515);
        setIntField(term70513, term70513.getClass(), "numberOfMeetings", 1233186320);
        setElement(term70491, 3, term70513);
        setIntField(term70520, term70520.getClass(), "playerIndex", -1303269101);
        setField(term70520, term70520.getClass(), "list", term70522);
        setIntField(term70520, term70520.getClass(), "numberOfMeetings", 1435572720);
        setElement(term70491, 4, term70520);
        setIntField(term70527, term70527.getClass(), "playerIndex", 1437618365);
        setField(term70527, term70527.getClass(), "list", term70529);
        setIntField(term70527, term70527.getClass(), "numberOfMeetings", 1122535239);
        setElement(term70491, 5, term70527);
        setField(term70490, term70490.getClass(), "diplomacyList", term70491);
        term70534 = new Integer(1158923260);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70534;
        callMethod(klass, "getLiking", argTypes, term70490, args);
    }

};


