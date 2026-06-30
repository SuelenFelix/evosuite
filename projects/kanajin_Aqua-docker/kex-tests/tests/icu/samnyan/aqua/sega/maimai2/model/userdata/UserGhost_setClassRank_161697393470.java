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
import java.lang.Integer;

public class UserGhost_setClassRank_161697393470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32593;
     Object term32610;

    public UserGhost_setClassRank_161697393470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32593 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term32593, term32593.getClass(), "name", null);
        setIntField(term32593, term32593.getClass(), "iconId", 0);
        setIntField(term32593, term32593.getClass(), "plateId", 0);
        setIntField(term32593, term32593.getClass(), "titleId", 0);
        setIntField(term32593, term32593.getClass(), "rate", 0);
        setIntField(term32593, term32593.getClass(), "udemaeRate", 0);
        setIntField(term32593, term32593.getClass(), "courseRank", 0);
        setIntField(term32593, term32593.getClass(), "classRank", 0);
        setIntField(term32593, term32593.getClass(), "classValue", 0);
        setField(term32593, term32593.getClass(), "playDatetime", null);
        setIntField(term32593, term32593.getClass(), "shopId", 0);
        setIntField(term32593, term32593.getClass(), "regionCode", 0);
        setIntField(term32593, term32593.getClass(), "typeId", 0);
        setIntField(term32593, term32593.getClass(), "musicId", 0);
        setIntField(term32593, term32593.getClass(), "difficulty", 0);
        setIntField(term32593, term32593.getClass(), "version", 0);
        setField(term32593, term32593.getClass(), "resultBitList", null);
        setIntField(term32593, term32593.getClass(), "resultNum", 0);
        setIntField(term32593, term32593.getClass(), "achievement", 0);
        term32610 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32610;
        callMethod(klass, "setClassRank", argTypes, term32593, args);
    }

};


