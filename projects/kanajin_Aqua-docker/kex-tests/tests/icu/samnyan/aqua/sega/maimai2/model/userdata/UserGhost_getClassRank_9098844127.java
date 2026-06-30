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

public class UserGhost_getClassRank_9098844127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29442;

    public UserGhost_getClassRank_9098844127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term29483 = new Byte((byte) 66);
        Byte term29485 = new Byte((byte) -121);
        Byte term29487 = new Byte((byte) -119);
        Byte term29489 = new Byte((byte) 71);
        ArrayList term29481 = new ArrayList();
        ((ArrayList) term29481).add(term29483);
        ((ArrayList) term29481).add(term29485);
        ((ArrayList) term29481).add(term29487);
        ((ArrayList) term29481).add(term29489);
        term29442 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term29442, term29442.getClass(), "name", "DvRdOzzihn");
        setIntField(term29442, term29442.getClass(), "iconId", 622731276);
        setIntField(term29442, term29442.getClass(), "plateId", -1302341502);
        setIntField(term29442, term29442.getClass(), "titleId", 1113574554);
        setIntField(term29442, term29442.getClass(), "rate", 1685800093);
        setIntField(term29442, term29442.getClass(), "udemaeRate", -318699441);
        setIntField(term29442, term29442.getClass(), "courseRank", 1381027809);
        setIntField(term29442, term29442.getClass(), "classRank", -371717995);
        setIntField(term29442, term29442.getClass(), "classValue", 1713005479);
        setField(term29442, term29442.getClass(), "playDatetime", "wIygCdQAKO");
        setIntField(term29442, term29442.getClass(), "shopId", -1948910444);
        setIntField(term29442, term29442.getClass(), "regionCode", -1099061955);
        setIntField(term29442, term29442.getClass(), "typeId", -1672904007);
        setIntField(term29442, term29442.getClass(), "musicId", -217232010);
        setIntField(term29442, term29442.getClass(), "difficulty", 2053372601);
        setIntField(term29442, term29442.getClass(), "version", -1828855069);
        setField(term29442, term29442.getClass(), "resultBitList", term29481);
        setIntField(term29442, term29442.getClass(), "resultNum", -1213694931);
        setIntField(term29442, term29442.getClass(), "achievement", -1255656944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassRank", argTypes, term29442, args);
    }

};


