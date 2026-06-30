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
import java.lang.Integer;

public class UserGhost_setTitleId_6410445122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30533;
     Object term30578;

    public UserGhost_setTitleId_6410445122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term30572 = new ArrayList();
        term30533 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term30533, term30533.getClass(), "name", "GNIVsSTglt");
        setIntField(term30533, term30533.getClass(), "iconId", 1986699236);
        setIntField(term30533, term30533.getClass(), "plateId", -1729178560);
        setIntField(term30533, term30533.getClass(), "titleId", 874974171);
        setIntField(term30533, term30533.getClass(), "rate", -1689017763);
        setIntField(term30533, term30533.getClass(), "udemaeRate", 1657387281);
        setIntField(term30533, term30533.getClass(), "courseRank", 1276651382);
        setIntField(term30533, term30533.getClass(), "classRank", 266716659);
        setIntField(term30533, term30533.getClass(), "classValue", 1249390809);
        setField(term30533, term30533.getClass(), "playDatetime", "mzPebFiUSP");
        setIntField(term30533, term30533.getClass(), "shopId", -1069437097);
        setIntField(term30533, term30533.getClass(), "regionCode", 215016257);
        setIntField(term30533, term30533.getClass(), "typeId", -1967315273);
        setIntField(term30533, term30533.getClass(), "musicId", -1848110874);
        setIntField(term30533, term30533.getClass(), "difficulty", -1988070462);
        setIntField(term30533, term30533.getClass(), "version", 323423569);
        setField(term30533, term30533.getClass(), "resultBitList", term30572);
        setIntField(term30533, term30533.getClass(), "resultNum", -274269573);
        setIntField(term30533, term30533.getClass(), "achievement", 1395520168);
        term30578 = new Integer(-524708742);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30578;
        callMethod(klass, "setTitleId", argTypes, term30533, args);
    }

};


