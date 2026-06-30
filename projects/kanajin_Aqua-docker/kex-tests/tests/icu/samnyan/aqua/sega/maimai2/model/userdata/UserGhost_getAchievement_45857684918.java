package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class UserGhost_getAchievement_45857684918 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30227;

    public UserGhost_getAchievement_45857684918() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term30266 = new ArrayList();
        term30227 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term30227, term30227.getClass(), "name", "ICysuFllEZ");
        setIntField(term30227, term30227.getClass(), "iconId", 747491);
        setIntField(term30227, term30227.getClass(), "plateId", 734222768);
        setIntField(term30227, term30227.getClass(), "titleId", 1545425140);
        setIntField(term30227, term30227.getClass(), "rate", -1580765555);
        setIntField(term30227, term30227.getClass(), "udemaeRate", -1295149055);
        setIntField(term30227, term30227.getClass(), "courseRank", -769814321);
        setIntField(term30227, term30227.getClass(), "classRank", 114898432);
        setIntField(term30227, term30227.getClass(), "classValue", -193767503);
        setField(term30227, term30227.getClass(), "playDatetime", "cGQJTTxcXr");
        setIntField(term30227, term30227.getClass(), "shopId", -2090918082);
        setIntField(term30227, term30227.getClass(), "regionCode", 1505717672);
        setIntField(term30227, term30227.getClass(), "typeId", -1683274691);
        setIntField(term30227, term30227.getClass(), "musicId", -935900044);
        setIntField(term30227, term30227.getClass(), "difficulty", 1747876558);
        setIntField(term30227, term30227.getClass(), "version", 833477776);
        setField(term30227, term30227.getClass(), "resultBitList", term30266);
        setIntField(term30227, term30227.getClass(), "resultNum", 2043960707);
        setIntField(term30227, term30227.getClass(), "achievement", 272179554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAchievement", argTypes, term30227, args);
    }

};


