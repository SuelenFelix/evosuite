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
import java.lang.Integer;

public class UserGhost_setTypeId_184526045131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31246;
     Object term31297;

    public UserGhost_setTypeId_184526045131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term31287 = new Byte((byte) -8);
        Byte term31289 = new Byte((byte) -9);
        Byte term31291 = new Byte((byte) 97);
        ArrayList term31285 = new ArrayList();
        ((ArrayList) term31285).add(term31287);
        ((ArrayList) term31285).add(term31289);
        ((ArrayList) term31285).add(term31291);
        term31246 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term31246, term31246.getClass(), "name", "cdZEcINJAM");
        setIntField(term31246, term31246.getClass(), "iconId", -357630956);
        setIntField(term31246, term31246.getClass(), "plateId", -1068878345);
        setIntField(term31246, term31246.getClass(), "titleId", 1386128235);
        setIntField(term31246, term31246.getClass(), "rate", -1047109164);
        setIntField(term31246, term31246.getClass(), "udemaeRate", -1650626012);
        setIntField(term31246, term31246.getClass(), "courseRank", -2045231879);
        setIntField(term31246, term31246.getClass(), "classRank", 1678025090);
        setIntField(term31246, term31246.getClass(), "classValue", 714453255);
        setField(term31246, term31246.getClass(), "playDatetime", "qumYSwcWHz");
        setIntField(term31246, term31246.getClass(), "shopId", 2096762388);
        setIntField(term31246, term31246.getClass(), "regionCode", -1646872343);
        setIntField(term31246, term31246.getClass(), "typeId", -140841633);
        setIntField(term31246, term31246.getClass(), "musicId", 1970986976);
        setIntField(term31246, term31246.getClass(), "difficulty", 530909877);
        setIntField(term31246, term31246.getClass(), "version", -123945804);
        setField(term31246, term31246.getClass(), "resultBitList", term31285);
        setIntField(term31246, term31246.getClass(), "resultNum", 2133669766);
        setIntField(term31246, term31246.getClass(), "achievement", -1423215684);
        term31297 = new Integer(-1096652631);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31297;
        callMethod(klass, "setTypeId", argTypes, term31246, args);
    }

};


