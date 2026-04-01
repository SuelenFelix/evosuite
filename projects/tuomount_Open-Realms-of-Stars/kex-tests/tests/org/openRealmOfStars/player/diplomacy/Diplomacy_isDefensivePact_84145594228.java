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

public class Diplomacy_isDefensivePact_84145594228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70900;
     Object term70909;

    public Diplomacy_isDefensivePact_84145594228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70904 = new ArrayList();
        ((ArrayList) term70904).add((Object)null);
        ((ArrayList) term70904).add((Object)null);
        ((ArrayList) term70904).add((Object)null);
        ((ArrayList) term70904).add((Object)null);
        ((ArrayList) term70904).add((Object)null);
        ((ArrayList) term70904).add((Object)null);
        term70900 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70901 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 1);
        Object term70902 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70902, term70902.getClass(), "playerIndex", -307464652);
        setField(term70902, term70902.getClass(), "list", term70904);
        setIntField(term70902, term70902.getClass(), "numberOfMeetings", -516287593);
        setElement(term70901, 0, term70902);
        setField(term70900, term70900.getClass(), "diplomacyList", term70901);
        term70909 = new Integer(-187311406);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70909;
        callMethod(klass, "isDefensivePact", argTypes, term70900, args);
    }

};


