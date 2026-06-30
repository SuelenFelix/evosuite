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

public class UserGhost_canEqual_198439536983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32834;

    public UserGhost_canEqual_198439536983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32834 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term32834, term32834.getClass(), "name", null);
        setIntField(term32834, term32834.getClass(), "iconId", 0);
        setIntField(term32834, term32834.getClass(), "plateId", 0);
        setIntField(term32834, term32834.getClass(), "titleId", 0);
        setIntField(term32834, term32834.getClass(), "rate", 0);
        setIntField(term32834, term32834.getClass(), "udemaeRate", 0);
        setIntField(term32834, term32834.getClass(), "courseRank", 0);
        setIntField(term32834, term32834.getClass(), "classRank", 0);
        setIntField(term32834, term32834.getClass(), "classValue", 0);
        setField(term32834, term32834.getClass(), "playDatetime", null);
        setIntField(term32834, term32834.getClass(), "shopId", 0);
        setIntField(term32834, term32834.getClass(), "regionCode", 0);
        setIntField(term32834, term32834.getClass(), "typeId", 0);
        setIntField(term32834, term32834.getClass(), "musicId", 0);
        setIntField(term32834, term32834.getClass(), "difficulty", 0);
        setIntField(term32834, term32834.getClass(), "version", 0);
        setField(term32834, term32834.getClass(), "resultBitList", null);
        setIntField(term32834, term32834.getClass(), "resultNum", 0);
        setIntField(term32834, term32834.getClass(), "achievement", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term32834, args);
    }

};


