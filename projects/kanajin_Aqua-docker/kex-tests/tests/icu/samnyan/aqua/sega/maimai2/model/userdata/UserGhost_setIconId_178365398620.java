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

public class UserGhost_setIconId_178365398620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30389;
     Object term30442;

    public UserGhost_setIconId_178365398620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term30430 = new Byte((byte) -39);
        Byte term30432 = new Byte((byte) -20);
        Byte term30434 = new Byte((byte) 10);
        Byte term30436 = new Byte((byte) 77);
        ArrayList term30428 = new ArrayList();
        ((ArrayList) term30428).add(term30430);
        ((ArrayList) term30428).add(term30432);
        ((ArrayList) term30428).add(term30434);
        ((ArrayList) term30428).add(term30436);
        term30389 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term30389, term30389.getClass(), "name", "ETbxNuJLii");
        setIntField(term30389, term30389.getClass(), "iconId", 1923027847);
        setIntField(term30389, term30389.getClass(), "plateId", -1652693609);
        setIntField(term30389, term30389.getClass(), "titleId", -824893512);
        setIntField(term30389, term30389.getClass(), "rate", -55435071);
        setIntField(term30389, term30389.getClass(), "udemaeRate", -673356166);
        setIntField(term30389, term30389.getClass(), "courseRank", 1876812694);
        setIntField(term30389, term30389.getClass(), "classRank", 461068473);
        setIntField(term30389, term30389.getClass(), "classValue", -1833298266);
        setField(term30389, term30389.getClass(), "playDatetime", "YJhnPtWtJR");
        setIntField(term30389, term30389.getClass(), "shopId", 746372422);
        setIntField(term30389, term30389.getClass(), "regionCode", 1921465988);
        setIntField(term30389, term30389.getClass(), "typeId", -164438599);
        setIntField(term30389, term30389.getClass(), "musicId", -444441955);
        setIntField(term30389, term30389.getClass(), "difficulty", -544005591);
        setIntField(term30389, term30389.getClass(), "version", -1379603462);
        setField(term30389, term30389.getClass(), "resultBitList", term30428);
        setIntField(term30389, term30389.getClass(), "resultNum", -1304965721);
        setIntField(term30389, term30389.getClass(), "achievement", 1661411651);
        term30442 = new Integer(175517901);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30442;
        callMethod(klass, "setIconId", argTypes, term30389, args);
    }

};


