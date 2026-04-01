package org.openRealmOfStars.starMap.newsCorp;

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
import static org.openRealmOfStars.starMap.newsCorp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class NewsFactory_createScoreBoard_209481466778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term791490;
     Object term791508;

    public NewsFactory_createScoreBoard_209481466778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term791490 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term791504 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 1);
        Object term791505 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term791506 = (int[]) newIntArray(0);
        setField(term791490, term791490.getClass(), "galaxyStatisticsName", "JcepfXTmIo");
        setIntField(term791490, term791490.getClass(), "maxPlayers", 1517257747);
        setField(term791505, term791505.getClass(), "data", term791506);
        setIntField(term791505, term791505.getClass(), "size", -1);
        setElement(term791504, 0, term791505);
        setField(term791490, term791490.getClass(), "dataStat", term791504);
        ArrayList term791509 = new ArrayList();
        term791508 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerList"));
        setField(term791508, term791508.getClass(), "list", term791509);
        setIntField(term791508, term791508.getClass(), "currentPlayer", -746412108);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = term791490;
        args[1] = term791508;
        callMethod(klass, "createScoreBoard", argTypes, null, args);
    }

};


