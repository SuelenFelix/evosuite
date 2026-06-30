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

public class UserGhost_setResultBitList_34881472679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32762;

    public UserGhost_setResultBitList_34881472679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32762 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term32762, term32762.getClass(), "name", null);
        setIntField(term32762, term32762.getClass(), "iconId", 0);
        setIntField(term32762, term32762.getClass(), "plateId", 0);
        setIntField(term32762, term32762.getClass(), "titleId", 0);
        setIntField(term32762, term32762.getClass(), "rate", 0);
        setIntField(term32762, term32762.getClass(), "udemaeRate", 0);
        setIntField(term32762, term32762.getClass(), "courseRank", 0);
        setIntField(term32762, term32762.getClass(), "classRank", 0);
        setIntField(term32762, term32762.getClass(), "classValue", 0);
        setField(term32762, term32762.getClass(), "playDatetime", null);
        setIntField(term32762, term32762.getClass(), "shopId", 0);
        setIntField(term32762, term32762.getClass(), "regionCode", 0);
        setIntField(term32762, term32762.getClass(), "typeId", 0);
        setIntField(term32762, term32762.getClass(), "musicId", 0);
        setIntField(term32762, term32762.getClass(), "difficulty", 0);
        setIntField(term32762, term32762.getClass(), "version", 0);
        setField(term32762, term32762.getClass(), "resultBitList", null);
        setIntField(term32762, term32762.getClass(), "resultNum", 0);
        setIntField(term32762, term32762.getClass(), "achievement", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setResultBitList", argTypes, term32762, args);
    }

};


