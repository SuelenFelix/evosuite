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

public class Diplomacy_getAllianceIndex_24110907417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70453;

    public Diplomacy_getAllianceIndex_24110907417() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70457 = new ArrayList();
        ((ArrayList) term70457).add((Object)null);
        ((ArrayList) term70457).add((Object)null);
        ((ArrayList) term70457).add((Object)null);
        ((ArrayList) term70457).add((Object)null);
        ((ArrayList) term70457).add((Object)null);
        ((ArrayList) term70457).add((Object)null);
        ((ArrayList) term70457).add((Object)null);
        ArrayList term70464 = new ArrayList();
        ((ArrayList) term70464).add((Object)null);
        ((ArrayList) term70464).add((Object)null);
        ((ArrayList) term70464).add((Object)null);
        ((ArrayList) term70464).add((Object)null);
        ((ArrayList) term70464).add((Object)null);
        ((ArrayList) term70464).add((Object)null);
        ArrayList term70471 = new ArrayList();
        ((ArrayList) term70471).add((Object)null);
        ((ArrayList) term70471).add((Object)null);
        ((ArrayList) term70471).add((Object)null);
        ((ArrayList) term70471).add((Object)null);
        ((ArrayList) term70471).add((Object)null);
        ((ArrayList) term70471).add((Object)null);
        ((ArrayList) term70471).add((Object)null);
        ((ArrayList) term70471).add((Object)null);
        ArrayList term70478 = new ArrayList();
        ((ArrayList) term70478).add((Object)null);
        ((ArrayList) term70478).add((Object)null);
        ((ArrayList) term70478).add((Object)null);
        ((ArrayList) term70478).add((Object)null);
        ((ArrayList) term70478).add((Object)null);
        ((ArrayList) term70478).add((Object)null);
        ((ArrayList) term70478).add((Object)null);
        ((ArrayList) term70478).add((Object)null);
        ArrayList term70485 = new ArrayList();
        ((ArrayList) term70485).add((Object)null);
        ((ArrayList) term70485).add((Object)null);
        ((ArrayList) term70485).add((Object)null);
        ((ArrayList) term70485).add((Object)null);
        ((ArrayList) term70485).add((Object)null);
        term70453 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70454 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 5);
        Object term70455 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70462 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70469 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70476 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70483 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70455, term70455.getClass(), "playerIndex", -947460705);
        setField(term70455, term70455.getClass(), "list", term70457);
        setIntField(term70455, term70455.getClass(), "numberOfMeetings", -1066281036);
        setElement(term70454, 0, term70455);
        setIntField(term70462, term70462.getClass(), "playerIndex", 30837706);
        setField(term70462, term70462.getClass(), "list", term70464);
        setIntField(term70462, term70462.getClass(), "numberOfMeetings", -397161164);
        setElement(term70454, 1, term70462);
        setIntField(term70469, term70469.getClass(), "playerIndex", -703717191);
        setField(term70469, term70469.getClass(), "list", term70471);
        setIntField(term70469, term70469.getClass(), "numberOfMeetings", -1255535445);
        setElement(term70454, 2, term70469);
        setIntField(term70476, term70476.getClass(), "playerIndex", -2033952124);
        setField(term70476, term70476.getClass(), "list", term70478);
        setIntField(term70476, term70476.getClass(), "numberOfMeetings", 560401653);
        setElement(term70454, 3, term70476);
        setIntField(term70483, term70483.getClass(), "playerIndex", 1633691536);
        setField(term70483, term70483.getClass(), "list", term70485);
        setIntField(term70483, term70483.getClass(), "numberOfMeetings", 898165245);
        setElement(term70454, 4, term70483);
        setField(term70453, term70453.getClass(), "diplomacyList", term70454);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllianceIndex", argTypes, term70453, args);
    }

};


