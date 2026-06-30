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

public class UserGhost_setRegionCode_97506347130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31167;
     Object term31224;

    public UserGhost_setRegionCode_97506347130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term31208 = new Byte((byte) 70);
        Byte term31210 = new Byte((byte) -28);
        Byte term31212 = new Byte((byte) 115);
        Byte term31214 = new Byte((byte) 96);
        Byte term31216 = new Byte((byte) 51);
        Byte term31218 = new Byte((byte) -53);
        ArrayList term31206 = new ArrayList();
        ((ArrayList) term31206).add(term31208);
        ((ArrayList) term31206).add(term31210);
        ((ArrayList) term31206).add(term31212);
        ((ArrayList) term31206).add(term31214);
        ((ArrayList) term31206).add(term31216);
        ((ArrayList) term31206).add(term31218);
        term31167 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term31167, term31167.getClass(), "name", "dUNzDLXJcj");
        setIntField(term31167, term31167.getClass(), "iconId", 1104795023);
        setIntField(term31167, term31167.getClass(), "plateId", -1833777337);
        setIntField(term31167, term31167.getClass(), "titleId", -2068333492);
        setIntField(term31167, term31167.getClass(), "rate", 1892862475);
        setIntField(term31167, term31167.getClass(), "udemaeRate", -807914927);
        setIntField(term31167, term31167.getClass(), "courseRank", -313873930);
        setIntField(term31167, term31167.getClass(), "classRank", -1064231188);
        setIntField(term31167, term31167.getClass(), "classValue", 1631564781);
        setField(term31167, term31167.getClass(), "playDatetime", "OrVSjRJVwa");
        setIntField(term31167, term31167.getClass(), "shopId", -3085808);
        setIntField(term31167, term31167.getClass(), "regionCode", 1975783377);
        setIntField(term31167, term31167.getClass(), "typeId", -665938382);
        setIntField(term31167, term31167.getClass(), "musicId", 325391588);
        setIntField(term31167, term31167.getClass(), "difficulty", 1443046313);
        setIntField(term31167, term31167.getClass(), "version", 1055117337);
        setField(term31167, term31167.getClass(), "resultBitList", term31206);
        setIntField(term31167, term31167.getClass(), "resultNum", -705616896);
        setIntField(term31167, term31167.getClass(), "achievement", 1057965724);
        term31224 = new Integer(2134707657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31224;
        callMethod(klass, "setRegionCode", argTypes, term31167, args);
    }

};


