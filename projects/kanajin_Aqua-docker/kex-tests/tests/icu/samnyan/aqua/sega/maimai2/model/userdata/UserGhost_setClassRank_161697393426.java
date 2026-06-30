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

public class UserGhost_setClassRank_161697393426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30827;
     Object term30882;

    public UserGhost_setClassRank_161697393426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term30868 = new Byte((byte) -128);
        Byte term30870 = new Byte((byte) 66);
        Byte term30872 = new Byte((byte) -112);
        Byte term30874 = new Byte((byte) 81);
        Byte term30876 = new Byte((byte) 65);
        ArrayList term30866 = new ArrayList();
        ((ArrayList) term30866).add(term30868);
        ((ArrayList) term30866).add(term30870);
        ((ArrayList) term30866).add(term30872);
        ((ArrayList) term30866).add(term30874);
        ((ArrayList) term30866).add(term30876);
        term30827 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term30827, term30827.getClass(), "name", "xqIbVsUspl");
        setIntField(term30827, term30827.getClass(), "iconId", 390228535);
        setIntField(term30827, term30827.getClass(), "plateId", -667505209);
        setIntField(term30827, term30827.getClass(), "titleId", 1997285343);
        setIntField(term30827, term30827.getClass(), "rate", -1814671855);
        setIntField(term30827, term30827.getClass(), "udemaeRate", -614200166);
        setIntField(term30827, term30827.getClass(), "courseRank", 1243129119);
        setIntField(term30827, term30827.getClass(), "classRank", 346014220);
        setIntField(term30827, term30827.getClass(), "classValue", 1379438950);
        setField(term30827, term30827.getClass(), "playDatetime", "GnjLRtJywq");
        setIntField(term30827, term30827.getClass(), "shopId", 1932258686);
        setIntField(term30827, term30827.getClass(), "regionCode", -261366507);
        setIntField(term30827, term30827.getClass(), "typeId", 1015444772);
        setIntField(term30827, term30827.getClass(), "musicId", -815684619);
        setIntField(term30827, term30827.getClass(), "difficulty", -471499395);
        setIntField(term30827, term30827.getClass(), "version", -663671886);
        setField(term30827, term30827.getClass(), "resultBitList", term30866);
        setIntField(term30827, term30827.getClass(), "resultNum", -1295577968);
        setIntField(term30827, term30827.getClass(), "achievement", 1006574741);
        term30882 = new Integer(-1471698394);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30882;
        callMethod(klass, "setClassRank", argTypes, term30827, args);
    }

};


