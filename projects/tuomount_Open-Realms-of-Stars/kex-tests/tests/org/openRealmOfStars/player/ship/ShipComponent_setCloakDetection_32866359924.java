package org.openRealmOfStars.player.ship;

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
import static org.openRealmOfStars.player.ship.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;
import java.lang.Integer;

public class ShipComponent_setCloakDetection_32866359924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471348;
     Object term471403;

    public ShipComponent_setCloakDetection_32866359924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term471406 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term471405 = ((Class) term471406).getDeclaredField((String) "ESPIONAGE_MODULE");
        ((Field) term471405).setAccessible(true);
        Object enum1496 = ((Field) term471405).get((Object) null);
        term471348 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term471348, term471348.getClass(), "index", 715633481);
        setField(term471348, term471348.getClass(), "type", enum1496);
        setIntField(term471348, term471348.getClass(), "cost", 1022044748);
        setIntField(term471348, term471348.getClass(), "metalCost", 1807382811);
        setField(term471348, term471348.getClass(), "name", "YzIhGzsuTf");
        setIntField(term471348, term471348.getClass(), "energyRequirement", -540402237);
        setIntField(term471348, term471348.getClass(), "energyResource", -1317004478);
        setIntField(term471348, term471348.getClass(), "ftlSpeed", -1771740204);
        setIntField(term471348, term471348.getClass(), "speed", 135378240);
        setIntField(term471348, term471348.getClass(), "tacticSpeed", -2017568485);
        setIntField(term471348, term471348.getClass(), "scannerRange", -1312352365);
        setIntField(term471348, term471348.getClass(), "cloakDetection", -1352021947);
        setIntField(term471348, term471348.getClass(), "cloaking", 1024432109);
        setIntField(term471348, term471348.getClass(), "defenseValue", -490684732);
        setIntField(term471348, term471348.getClass(), "baySize", 1090372481);
        setIntField(term471348, term471348.getClass(), "damage", -1392318268);
        setIntField(term471348, term471348.getClass(), "weaponRange", 812020808);
        setIntField(term471348, term471348.getClass(), "initiativeBoost", 1588709153);
        setIntField(term471348, term471348.getClass(), "cultureBonus", 1655781477);
        setIntField(term471348, term471348.getClass(), "creditBonus", -1650359441);
        setIntField(term471348, term471348.getClass(), "researchBonus", 267957015);
        setIntField(term471348, term471348.getClass(), "espionageBonus", 1083447632);
        setIntField(term471348, term471348.getClass(), "fleetCapacityBonus", 538423507);
        setIntField(term471348, term471348.getClass(), "hitBonus", 1371984304);
        term471403 = new Integer(1647027332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term471403;
        callMethod(klass, "setCloakDetection", argTypes, term471348, args);
    }

};


