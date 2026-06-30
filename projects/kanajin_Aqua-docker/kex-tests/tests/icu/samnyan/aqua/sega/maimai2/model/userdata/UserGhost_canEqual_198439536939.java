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
import java.lang.Byte;

public class UserGhost_canEqual_198439536939 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31841;
     Object term31892;

    public UserGhost_canEqual_198439536939() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term31882 = new Byte((byte) -126);
        Byte term31884 = new Byte((byte) 12);
        Byte term31886 = new Byte((byte) -75);
        ArrayList term31880 = new ArrayList();
        ((ArrayList) term31880).add(term31882);
        ((ArrayList) term31880).add(term31884);
        ((ArrayList) term31880).add(term31886);
        term31841 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term31841, term31841.getClass(), "name", "pLbTzSMbsN");
        setIntField(term31841, term31841.getClass(), "iconId", 878906837);
        setIntField(term31841, term31841.getClass(), "plateId", -1578163757);
        setIntField(term31841, term31841.getClass(), "titleId", -1361859122);
        setIntField(term31841, term31841.getClass(), "rate", -1130681822);
        setIntField(term31841, term31841.getClass(), "udemaeRate", 1224219518);
        setIntField(term31841, term31841.getClass(), "courseRank", 1466055196);
        setIntField(term31841, term31841.getClass(), "classRank", -1310910895);
        setIntField(term31841, term31841.getClass(), "classValue", -1504228047);
        setField(term31841, term31841.getClass(), "playDatetime", "lFSbxerCPP");
        setIntField(term31841, term31841.getClass(), "shopId", 1642235898);
        setIntField(term31841, term31841.getClass(), "regionCode", -719765151);
        setIntField(term31841, term31841.getClass(), "typeId", 2039931383);
        setIntField(term31841, term31841.getClass(), "musicId", -2109330879);
        setIntField(term31841, term31841.getClass(), "difficulty", -1576801556);
        setIntField(term31841, term31841.getClass(), "version", -1572718384);
        setField(term31841, term31841.getClass(), "resultBitList", term31880);
        setIntField(term31841, term31841.getClass(), "resultNum", 1623201205);
        setIntField(term31841, term31841.getClass(), "achievement", 259489188);
        term31892 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term31892;
        callMethod(klass, "canEqual", argTypes, term31841, args);
    }

};


