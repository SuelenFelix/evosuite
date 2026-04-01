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

public class Diplomacy_hasAlliance_12480845015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70384;

    public Diplomacy_hasAlliance_12480845015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term70388 = new ArrayList();
        ((ArrayList) term70388).add((Object)null);
        term70384 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy"));
        Object[] term70385 = (Object[]) newArray("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList", 1);
        Object term70386 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term70386, term70386.getClass(), "playerIndex", -470798982);
        setField(term70386, term70386.getClass(), "list", term70388);
        setIntField(term70386, term70386.getClass(), "numberOfMeetings", 501801161);
        setElement(term70385, 0, term70386);
        setField(term70384, term70384.getClass(), "diplomacyList", term70385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.Diplomacy");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasAlliance", argTypes, term70384, args);
    }

};


