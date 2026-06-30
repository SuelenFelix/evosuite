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

public class UserGhost_getAchievement_45857684962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32445;

    public UserGhost_getAchievement_45857684962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32445 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term32445, term32445.getClass(), "name", null);
        setIntField(term32445, term32445.getClass(), "iconId", 0);
        setIntField(term32445, term32445.getClass(), "plateId", 0);
        setIntField(term32445, term32445.getClass(), "titleId", 0);
        setIntField(term32445, term32445.getClass(), "rate", 0);
        setIntField(term32445, term32445.getClass(), "udemaeRate", 0);
        setIntField(term32445, term32445.getClass(), "courseRank", 0);
        setIntField(term32445, term32445.getClass(), "classRank", 0);
        setIntField(term32445, term32445.getClass(), "classValue", 0);
        setField(term32445, term32445.getClass(), "playDatetime", null);
        setIntField(term32445, term32445.getClass(), "shopId", 0);
        setIntField(term32445, term32445.getClass(), "regionCode", 0);
        setIntField(term32445, term32445.getClass(), "typeId", 0);
        setIntField(term32445, term32445.getClass(), "musicId", 0);
        setIntField(term32445, term32445.getClass(), "difficulty", 0);
        setIntField(term32445, term32445.getClass(), "version", 0);
        setField(term32445, term32445.getClass(), "resultBitList", null);
        setIntField(term32445, term32445.getClass(), "resultNum", 0);
        setIntField(term32445, term32445.getClass(), "achievement", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAchievement", argTypes, term32445, args);
    }

};


