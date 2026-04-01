package org.openRealmOfStars.player.tech;

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
import static org.openRealmOfStars.player.tech.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Boolean;

public class TechList_updateResearchPointByTurn_198045191349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395129;
     Object term395130;
     Object term395132;
     Object term395134;

    public TechList_updateResearchPointByTurn_198045191349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term395129 = newInstance(Class.forName("org.openRealmOfStars.player.tech.TechList"));
        setField(term395129, term395129.getClass(), "techList", null);
        setField(term395129, term395129.getClass(), "techLevels", null);
        setField(term395129, term395129.getClass(), "techFocus", null);
        setField(term395129, term395129.getClass(), "techResearchPoint", null);
        setField(term395129, term395129.getClass(), "race", null);
        term395130 = new Integer(0);
        term395132 = new Integer(0);
        term395134 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.tech.TechList");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term395130;
        args[1] = null;
        args[2] = term395132;
        args[3] = term395134;
        callMethod(klass, "updateResearchPointByTurn", argTypes, term395129, args);
    }

};


