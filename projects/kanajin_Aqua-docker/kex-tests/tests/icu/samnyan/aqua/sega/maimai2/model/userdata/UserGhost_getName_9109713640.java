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

public class UserGhost_getName_9109713640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28921;

    public UserGhost_getName_9109713640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term28962 = new Byte((byte) 47);
        Byte term28964 = new Byte((byte) 48);
        Byte term28966 = new Byte((byte) 89);
        Byte term28968 = new Byte((byte) 75);
        Byte term28970 = new Byte((byte) 18);
        Byte term28972 = new Byte((byte) -58);
        Byte term28974 = new Byte((byte) -29);
        ArrayList term28960 = new ArrayList();
        ((ArrayList) term28960).add(term28962);
        ((ArrayList) term28960).add(term28964);
        ((ArrayList) term28960).add(term28966);
        ((ArrayList) term28960).add(term28968);
        ((ArrayList) term28960).add(term28970);
        ((ArrayList) term28960).add(term28972);
        ((ArrayList) term28960).add(term28974);
        term28921 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term28921, term28921.getClass(), "name", "ezwGsjqTai");
        setIntField(term28921, term28921.getClass(), "iconId", 795205527);
        setIntField(term28921, term28921.getClass(), "plateId", 600958607);
        setIntField(term28921, term28921.getClass(), "titleId", 897159778);
        setIntField(term28921, term28921.getClass(), "rate", -1934934961);
        setIntField(term28921, term28921.getClass(), "udemaeRate", 2120054887);
        setIntField(term28921, term28921.getClass(), "courseRank", 2145648967);
        setIntField(term28921, term28921.getClass(), "classRank", 2060624021);
        setIntField(term28921, term28921.getClass(), "classValue", -1853309523);
        setField(term28921, term28921.getClass(), "playDatetime", "ngeHWMRjnn");
        setIntField(term28921, term28921.getClass(), "shopId", 241741655);
        setIntField(term28921, term28921.getClass(), "regionCode", -1062022366);
        setIntField(term28921, term28921.getClass(), "typeId", -1347618079);
        setIntField(term28921, term28921.getClass(), "musicId", 1510246255);
        setIntField(term28921, term28921.getClass(), "difficulty", -515631808);
        setIntField(term28921, term28921.getClass(), "version", 1546701347);
        setField(term28921, term28921.getClass(), "resultBitList", term28960);
        setIntField(term28921, term28921.getClass(), "resultNum", -111931851);
        setIntField(term28921, term28921.getClass(), "achievement", -251696516);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getName", argTypes, term28921, args);
    }

};


