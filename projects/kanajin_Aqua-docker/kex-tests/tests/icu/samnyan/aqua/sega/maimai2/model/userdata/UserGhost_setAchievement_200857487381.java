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

public class UserGhost_setAchievement_200857487381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32798;
     Object term32815;

    public UserGhost_setAchievement_200857487381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32798 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term32798, term32798.getClass(), "name", null);
        setIntField(term32798, term32798.getClass(), "iconId", 0);
        setIntField(term32798, term32798.getClass(), "plateId", 0);
        setIntField(term32798, term32798.getClass(), "titleId", 0);
        setIntField(term32798, term32798.getClass(), "rate", 0);
        setIntField(term32798, term32798.getClass(), "udemaeRate", 0);
        setIntField(term32798, term32798.getClass(), "courseRank", 0);
        setIntField(term32798, term32798.getClass(), "classRank", 0);
        setIntField(term32798, term32798.getClass(), "classValue", 0);
        setField(term32798, term32798.getClass(), "playDatetime", null);
        setIntField(term32798, term32798.getClass(), "shopId", 0);
        setIntField(term32798, term32798.getClass(), "regionCode", 0);
        setIntField(term32798, term32798.getClass(), "typeId", 0);
        setIntField(term32798, term32798.getClass(), "musicId", 0);
        setIntField(term32798, term32798.getClass(), "difficulty", 0);
        setIntField(term32798, term32798.getClass(), "version", 0);
        setField(term32798, term32798.getClass(), "resultBitList", null);
        setIntField(term32798, term32798.getClass(), "resultNum", 0);
        setIntField(term32798, term32798.getClass(), "achievement", 0);
        term32815 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32815;
        callMethod(klass, "setAchievement", argTypes, term32798, args);
    }

};


