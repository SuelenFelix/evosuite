package org.openRealmOfStars.player.ship.generator;

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
import static org.openRealmOfStars.player.ship.generator.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ShipGenerator_addBestDefenseComponent_98123163251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462723;

    public ShipGenerator_addBestDefenseComponent_98123163251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462723 = newInstance(Class.forName("org.openRealmOfStars.player.ship.generator.ShipGenerator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.ship.generator.ShipGenerator");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        argTypes[2] = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        argTypes[3] = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        argTypes[4] = Class.forName("org.openRealmOfStars.player.ship.ShipComponent");
        argTypes[5] = Class.forName("org.openRealmOfStars.player.ship.shipdesign.ShipDesign");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "addBestDefenseComponent", argTypes, term462723, args);
    }

};


