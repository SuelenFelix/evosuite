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

public class Diplomacy_isMultipleBorderCrossing_133135864731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70964;
     Object term71008;

    public Diplomacy_isMultipleBorderCrossing_133135864731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70968 = new ArrayList();
        ((ArrayList) term70968).add((Object)null);
        ((ArrayList) term70968).add((Object)null);
        ((ArrayList) term70968).add((Object)null);
        ArrayList term70975 = new ArrayList();
        ((ArrayList) term70975).add((Object)null);
        ((ArrayList) term70975).add((Object)null);
        ((ArrayList) term70975).add((Object)null);
        ((ArrayList) term70975).add((Object)null);
        ((ArrayList) term70975).add((Object)null);
        ((ArrayList) term70975).add((Object)null);
        ((ArrayList) term70975).add((Object)null);
        ((ArrayList) term70975).add((Object)null);
        ((ArrayList) term70975).add((Object)null);
        ArrayList term70982 = new ArrayList();
        ((ArrayList) term70982).add((Object)null);
        ((ArrayList) term70982).add((Object)null);
        ((ArrayList) term70982).add((Object)null);
        ArrayList term70989 = new ArrayList();
        ((ArrayList) term70989).add((Object)null);
        ((ArrayList) term70989).add((Object)null);
        ((ArrayList) term70989).add((Object)null);
        ((ArrayList) term70989).add((Object)null);
        ((ArrayList) term70989).add((Object)null);
        ((ArrayList) term70989).add((Object)null);
        ((ArrayList) term70989).add((Object)null);
        ArrayList term70996 = new ArrayList();
        ((ArrayList) term70996).add((Object)null);
        ((ArrayList) term70996).add((Object)null);
        ((ArrayList) term70996).add((Object)null);
        ((ArrayList) term70996).add((Object)null);
        ((ArrayList) term70996).add((Object)null);
        ((ArrayList) term70996).add((Object)null);
        ((ArrayList) term70996).add((Object)null);
        ArrayList term71003 = new ArrayList();
        ((ArrayList) term71003).add((Object)null);
        ((ArrayList) term71003).add((Object)null);
        term70964 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70965 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 6);
        Object term70966 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70973 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70980 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70987 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term70994 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        Object term71001 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70966, term70966.getClass(), "playerIndex", 1364414277);
        setField(term70966, term70966.getClass(), "list", term70968);
        setIntField(term70966, term70966.getClass(), "numberOfMeetings", 2145648967);
        setElement(term70965, 0, term70966);
        setIntField(term70973, term70973.getClass(), "playerIndex", 2060624021);
        setField(term70973, term70973.getClass(), "list", term70975);
        setIntField(term70973, term70973.getClass(), "numberOfMeetings", 1314996390);
        setElement(term70965, 1, term70973);
        setIntField(term70980, term70980.getClass(), "playerIndex", 1367703658);
        setField(term70980, term70980.getClass(), "list", term70982);
        setIntField(term70980, term70980.getClass(), "numberOfMeetings", 1120153100);
        setElement(term70965, 2, term70980);
        setIntField(term70987, term70987.getClass(), "playerIndex", 158801111);
        setField(term70987, term70987.getClass(), "list", term70989);
        setIntField(term70987, term70987.getClass(), "numberOfMeetings", 464966803);
        setElement(term70965, 3, term70987);
        setIntField(term70994, term70994.getClass(), "playerIndex", -246618392);
        setField(term70994, term70994.getClass(), "list", term70996);
        setIntField(term70994, term70994.getClass(), "numberOfMeetings", 1472246167);
        setElement(term70965, 4, term70994);
        setIntField(term71001, term71001.getClass(), "playerIndex", 1008555478);
        setField(term71001, term71001.getClass(), "list", term71003);
        setIntField(term71001, term71001.getClass(), "numberOfMeetings", 1346386442);
        setElement(term70965, 5, term71001);
        setField(term70964, term70964.getClass(), "diplomacyList", term70965);
        term71008 = new Integer(1904559758);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term71008;
        callMethod(klass, "isMultipleBorderCrossing", argTypes, term70964, args);
    }

};


