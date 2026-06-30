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

public class UserGhost_getTypeId_193021302556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32343;

    public UserGhost_getTypeId_193021302556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32343 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term32343, term32343.getClass(), "name", null);
        setIntField(term32343, term32343.getClass(), "iconId", 0);
        setIntField(term32343, term32343.getClass(), "plateId", 0);
        setIntField(term32343, term32343.getClass(), "titleId", 0);
        setIntField(term32343, term32343.getClass(), "rate", 0);
        setIntField(term32343, term32343.getClass(), "udemaeRate", 0);
        setIntField(term32343, term32343.getClass(), "courseRank", 0);
        setIntField(term32343, term32343.getClass(), "classRank", 0);
        setIntField(term32343, term32343.getClass(), "classValue", 0);
        setField(term32343, term32343.getClass(), "playDatetime", null);
        setIntField(term32343, term32343.getClass(), "shopId", 0);
        setIntField(term32343, term32343.getClass(), "regionCode", 0);
        setIntField(term32343, term32343.getClass(), "typeId", 0);
        setIntField(term32343, term32343.getClass(), "musicId", 0);
        setIntField(term32343, term32343.getClass(), "difficulty", 0);
        setIntField(term32343, term32343.getClass(), "version", 0);
        setField(term32343, term32343.getClass(), "resultBitList", null);
        setIntField(term32343, term32343.getClass(), "resultNum", 0);
        setIntField(term32343, term32343.getClass(), "achievement", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTypeId", argTypes, term32343, args);
    }

};


