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

public class UserGhost_hashCode_73154606540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31913;

    public UserGhost_hashCode_73154606540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31952 = new ArrayList();
        term31913 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term31913, term31913.getClass(), "name", "vjaZIyixCm");
        setIntField(term31913, term31913.getClass(), "iconId", 1709072289);
        setIntField(term31913, term31913.getClass(), "plateId", 688786687);
        setIntField(term31913, term31913.getClass(), "titleId", 1934256188);
        setIntField(term31913, term31913.getClass(), "rate", 1127725248);
        setIntField(term31913, term31913.getClass(), "udemaeRate", 1789414533);
        setIntField(term31913, term31913.getClass(), "courseRank", -1774273964);
        setIntField(term31913, term31913.getClass(), "classRank", -1765697393);
        setIntField(term31913, term31913.getClass(), "classValue", 2101925650);
        setField(term31913, term31913.getClass(), "playDatetime", "gAAPyftlIR");
        setIntField(term31913, term31913.getClass(), "shopId", -242176552);
        setIntField(term31913, term31913.getClass(), "regionCode", 776524710);
        setIntField(term31913, term31913.getClass(), "typeId", 1069095385);
        setIntField(term31913, term31913.getClass(), "musicId", -1889206410);
        setIntField(term31913, term31913.getClass(), "difficulty", -235874398);
        setIntField(term31913, term31913.getClass(), "version", -978039004);
        setField(term31913, term31913.getClass(), "resultBitList", term31952);
        setIntField(term31913, term31913.getClass(), "resultNum", 1162356859);
        setIntField(term31913, term31913.getClass(), "achievement", 175338916);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term31913, args);
    }

};


