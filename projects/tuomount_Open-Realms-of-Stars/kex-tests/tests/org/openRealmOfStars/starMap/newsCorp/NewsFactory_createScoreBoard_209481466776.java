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

public class NewsFactory_createScoreBoard_209481466776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604099;
     Object term604141;

    public NewsFactory_createScoreBoard_209481466776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term604099 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat"));
        Object[] term604113 = (Object[]) newArray("org.openRealmOfStars.starMap.newsCorp.DataModel", 9);
        Object term604114 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term604115 = (int[]) newIntArray(0);
        Object term604117 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term604118 = (int[]) newIntArray(0);
        Object term604120 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term604121 = (int[]) newIntArray(0);
        Object term604123 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term604124 = (int[]) newIntArray(0);
        Object term604126 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term604127 = (int[]) newIntArray(0);
        Object term604129 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term604130 = (int[]) newIntArray(0);
        Object term604132 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term604133 = (int[]) newIntArray(0);
        Object term604135 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term604136 = (int[]) newIntArray(0);
        Object term604138 = newInstance(Class.forName("org.openRealmOfStars.starMap.newsCorp.DataModel"));
        int[] term604139 = (int[]) newIntArray(0);
        setField(term604099, term604099.getClass(), "galaxyStatisticsName", "AoRpvwYSak");
        setIntField(term604099, term604099.getClass(), "maxPlayers", 1281018748);
        setField(term604114, term604114.getClass(), "data", term604115);
        setIntField(term604114, term604114.getClass(), "size", -1);
        setElement(term604113, 0, term604114);
        setField(term604117, term604117.getClass(), "data", term604118);
        setIntField(term604117, term604117.getClass(), "size", -1);
        setElement(term604113, 1, term604117);
        setField(term604120, term604120.getClass(), "data", term604121);
        setIntField(term604120, term604120.getClass(), "size", -1);
        setElement(term604113, 2, term604120);
        setField(term604123, term604123.getClass(), "data", term604124);
        setIntField(term604123, term604123.getClass(), "size", -1);
        setElement(term604113, 3, term604123);
        setField(term604126, term604126.getClass(), "data", term604127);
        setIntField(term604126, term604126.getClass(), "size", -1);
        setElement(term604113, 4, term604126);
        setField(term604129, term604129.getClass(), "data", term604130);
        setIntField(term604129, term604129.getClass(), "size", -1);
        setElement(term604113, 5, term604129);
        setField(term604132, term604132.getClass(), "data", term604133);
        setIntField(term604132, term604132.getClass(), "size", -1);
        setElement(term604113, 6, term604132);
        setField(term604135, term604135.getClass(), "data", term604136);
        setIntField(term604135, term604135.getClass(), "size", -1);
        setElement(term604113, 7, term604135);
        setField(term604138, term604138.getClass(), "data", term604139);
        setIntField(term604138, term604138.getClass(), "size", -1);
        setElement(term604113, 8, term604138);
        setField(term604099, term604099.getClass(), "dataStat", term604113);
        ArrayList term604142 = new ArrayList();
        term604141 = newInstance(Class.forName("org.openRealmOfStars.player.PlayerList"));
        setField(term604141, term604141.getClass(), "list", term604142);
        setIntField(term604141, term604141.getClass(), "currentPlayer", -1567042600);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.newsCorp.NewsFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.newsCorp.GalaxyStat");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerList");
        Object[] args = new Object[2];
        args[0] = term604099;
        args[1] = term604141;
        callMethod(klass, "createScoreBoard", argTypes, null, args);
    }

};


