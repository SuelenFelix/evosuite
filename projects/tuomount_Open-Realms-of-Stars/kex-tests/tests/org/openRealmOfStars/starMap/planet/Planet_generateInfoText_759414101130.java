package org.openRealmOfStars.starMap.planet;

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
import static org.openRealmOfStars.starMap.planet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;

public class Planet_generateInfoText_759414101130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2554851;
     Object term2554865;

    public Planet_generateInfoText_759414101130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2554851 = newInstance(Class.forName("org.openRealmOfStars.starMap.planet.Planet"));
        setField(term2554851, term2554851.getClass(), "name", null);
        setIntField(term2554851, term2554851.getClass(), "orderNumber", 0);
        setField(term2554851, term2554851.getClass(), "radiationType", null);
        setField(term2554851, term2554851.getClass(), "gravityType", null);
        setField(term2554851, term2554851.getClass(), "temperatureType", null);
        setField(term2554851, term2554851.getClass(), "waterLevel", null);
        setBooleanField(term2554851, term2554851.getClass(), "gasGiant", false);
        setField(term2554851, term2554851.getClass(), "coordinate", null);
        setField(term2554851, term2554851.getClass(), "planetType", null);
        setIntField(term2554851, term2554851.getClass(), "groundSize", 0);
        setIntField(term2554851, term2554851.getClass(), "amountMetalInGround", 0);
        setIntField(term2554851, term2554851.getClass(), "metal", 0);
        setIntField(term2554851, term2554851.getClass(), "prodResource", 0);
        setIntField(term2554851, term2554851.getClass(), "extraFood", 0);
        setIntField(term2554851, term2554851.getClass(), "culture", 0);
        setIntField(term2554851, term2554851.getClass(), "planetOwner", 0);
        setField(term2554851, term2554851.getClass(), "planetOwnerInfo", null);
        setField(term2554851, term2554851.getClass(), "homeWorldId", null);
        setIntField(term2554851, term2554851.getClass(), "startRealmIndex", 0);
        setIntField(term2554851, term2554851.getClass(), "tax", 0);
        setField(term2554851, term2554851.getClass(), "statuses", null);
        setField(term2554851, term2554851.getClass(), "timedStatuses", null);
        setField(term2554851, term2554851.getClass(), "event", null);
        setBooleanField(term2554851, term2554851.getClass(), "eventFound", false);
        setField(term2554851, term2554851.getClass(), "happinessEffect", null);
        setField(term2554851, term2554851.getClass(), "happinessExplanation", null);
        setField(term2554851, term2554851.getClass(), "farmProdExplain", null);
        setField(term2554851, term2554851.getClass(), "metaProdExplain", null);
        setField(term2554851, term2554851.getClass(), "prodProdExplain", null);
        setField(term2554851, term2554851.getClass(), "reseProdExplain", null);
        setField(term2554851, term2554851.getClass(), "cultProdExplain", null);
        setField(term2554851, term2554851.getClass(), "credProdExplain", null);
        setField(term2554851, term2554851.getClass(), "governor", null);
        setIntField(term2554851, term2554851.getClass(), "governorGuide", 0);
        setField(term2554851, term2554851.getClass(), "orbital", null);
        setField(term2554851, term2554851.getClass(), "workers", null);
        setField(term2554851, term2554851.getClass(), "buildings", null);
        setField(term2554851, term2554851.getClass(), "underConstruction", null);
        term2554865 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        Object[] args = new Object[2];
        args[0] = term2554865;
        args[1] = null;
        callMethod(klass, "generateInfoText", argTypes, term2554851, args);
    }

};


