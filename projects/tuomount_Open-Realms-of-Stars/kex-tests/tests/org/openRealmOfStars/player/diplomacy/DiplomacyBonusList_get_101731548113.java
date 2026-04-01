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
import java.util.ArrayList;
import java.lang.Integer;

public class DiplomacyBonusList_get_101731548113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38628;
     Object term38635;

    public DiplomacyBonusList_get_101731548113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term38630 = new ArrayList();
        term38628 = newInstance(Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList"));
        setIntField(term38628, term38628.getClass(), "playerIndex", 1862191391);
        setField(term38628, term38628.getClass(), "list", term38630);
        setIntField(term38628, term38628.getClass(), "numberOfMeetings", 1131398807);
        term38635 = new Integer(-344907703);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.diplomacy.DiplomacyBonusList");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term38635;
        callMethod(klass, "get", argTypes, term38628, args);
    }

};


