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

public class CombatShip_compareTo_93579165756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545554;

    public CombatShip_compareTo_93579165756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term545554 = newInstance(Class.forName("org.openRealmOfStars.player.combat.CombatShip"));
        setField(term545554, term545554.getClass(), "ship", null);
        setField(term545554, term545554.getClass(), "componentUsed", null);
        setIntField(term545554, term545554.getClass(), "x", 0);
        setIntField(term545554, term545554.getClass(), "y", 0);
        setField(term545554, term545554.getClass(), "player", null);
        setBooleanField(term545554, term545554.getClass(), "flipY", false);
        setIntField(term545554, term545554.getClass(), "movesLeft", 0);
        setIntField(term545554, term545554.getClass(), "aiShotsLeft", 0);
        setIntField(term545554, term545554.getClass(), "bonusAccuracy", 0);
        setIntField(term545554, term545554.getClass(), "overloadedJammer", 0);
        setIntField(term545554, term545554.getClass(), "overloadedComputer", 0);
        setBooleanField(term545554, term545554.getClass(), "damaged", false);
        setIntField(term545554, term545554.getClass(), "privateeredCredits", 0);
        setField(term545554, term545554.getClass(), "commander", null);
        setIntField(term545554, term545554.getClass(), "overloadFailure", 0);
        setIntField(term545554, term545554.getClass(), "energyLevel", 0);
        setBooleanField(term545554, term545554.getClass(), "isOverloaded", false);
        setBooleanField(term545554, term545554.getClass(), "cloakOverloaded", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.combat.CombatShip");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "compareTo", argTypes, term545554, args);
    }

};


