package org.openRealmOfStars.player.combat;

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
import static org.openRealmOfStars.player.combat.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class CombatShip_setY_191938219254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545522;
     Object term545537;

    public CombatShip_setY_191938219254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545522 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545522, term545522.getClass(), "ship", null);
        setField(term545522, term545522.getClass(), "componentUsed", null);
        setIntField(term545522, term545522.getClass(), "x", 0);
        setIntField(term545522, term545522.getClass(), "y", 0);
        setField(term545522, term545522.getClass(), "player", null);
        setBooleanField(term545522, term545522.getClass(), "flipY", false);
        setIntField(term545522, term545522.getClass(), "movesLeft", 0);
        setIntField(term545522, term545522.getClass(), "aiShotsLeft", 0);
        setIntField(term545522, term545522.getClass(), "bonusAccuracy", 0);
        setIntField(term545522, term545522.getClass(), "overloadedJammer", 0);
        setIntField(term545522, term545522.getClass(), "overloadedComputer", 0);
        setBooleanField(term545522, term545522.getClass(), "damaged", false);
        setIntField(term545522, term545522.getClass(), "privateeredCredits", 0);
        setField(term545522, term545522.getClass(), "commander", null);
        setIntField(term545522, term545522.getClass(), "overloadFailure", 0);
        setIntField(term545522, term545522.getClass(), "energyLevel", 0);
        setBooleanField(term545522, term545522.getClass(), "isOverloaded", false);
        setBooleanField(term545522, term545522.getClass(), "cloakOverloaded", false);
        term545537 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term545537;
        callMethod(klass, "setY", argTypes, term545522, args);
    }

};


