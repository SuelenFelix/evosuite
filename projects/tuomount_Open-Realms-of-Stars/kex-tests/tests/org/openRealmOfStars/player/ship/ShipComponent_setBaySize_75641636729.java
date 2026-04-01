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

public class ShipComponent_setBaySize_75641636729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473138;
     Object term473187;

    public ShipComponent_setBaySize_75641636729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term473190 = Class.forName((String) "org.openRealmOfStars.player.ship.ShipComponentType");
        Field term473189 = ((Class) term473190).getDeclaredField((String) "ION_CANNON");
        ((Field) term473189).setAccessible(true);
        Object enum1501 = ((Field) term473189).get((Object) null);
        term473138 = newInstance(Class.forName("org.openRealmOfStars.player.ship.ShipComponent"));
        setIntField(term473138, term473138.getClass(), "index", 501970469);
        setField(term473138, term473138.getClass(), "type", enum1501);
        setIntField(term473138, term473138.getClass(), "cost", -106034021);
        setIntField(term473138, term473138.getClass(), "metalCost", 364258643);
        setField(term473138, term473138.getClass(), "name", "lLOMgLjGQO");
        setIntField(term473138, term473138.getClass(), "energyRequirement", -161354342);
        setIntField(term473138, term473138.getClass(), "energyResource", 165488822);
        setIntField(term473138, term473138.getClass(), "ftlSpeed", 1722923000);
        setIntField(term473138, term473138.getClass(), "speed", 858754727);
        setIntField(term473138, term473138.getClass(), "tacticSpeed", -1742452774);
        setIntField(term473138, term473138.getClass(), "scannerRange", 302391633);
        setIntField(term473138, term473138.getClass(), "cloakDetection", 840891134);
        setIntField(term473138, term473138.getClass(), "cloaking", 897279041);
        setIntField(term473138, term473138.getClass(), "defenseValue", 1618600938);
        setIntField(term473138, term473138.getClass(), "baySize", 1355173839);
        setIntField(term473138, term473138.getClass(), "damage", -1273719525);
        setIntField(term473138, term473138.getClass(), "weaponRange", -627109579);
        setIntField(term473138, term473138.getClass(), "initiativeBoost", -1837554447);
        setIntField(term473138, term473138.getClass(), "cultureBonus", -2008091503);
        setIntField(term473138, term473138.getClass(), "creditBonus", -1368642453);
        setIntField(term473138, term473138.getClass(), "researchBonus", 2046248490);
        setIntField(term473138, term473138.getClass(), "espionageBonus", -1671715330);
        setIntField(term473138, term473138.getClass(), "fleetCapacityBonus", 1265400484);
        setIntField(term473138, term473138.getClass(), "hitBonus", 1440253698);
        term473187 = new Integer(-1090004456);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term473187;
        callMethod(klass, "setBaySize", argTypes, term473138, args);
    }

};


