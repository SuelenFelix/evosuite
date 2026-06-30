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

public class UserGhost_getUdemaeRate_20929048395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29296;

    public UserGhost_getUdemaeRate_20929048395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term29337 = new Byte((byte) -111);
        Byte term29339 = new Byte((byte) 23);
        Byte term29341 = new Byte((byte) -15);
        Byte term29343 = new Byte((byte) 36);
        Byte term29345 = new Byte((byte) 118);
        Byte term29347 = new Byte((byte) 106);
        Byte term29349 = new Byte((byte) 98);
        Byte term29351 = new Byte((byte) 67);
        ArrayList term29335 = new ArrayList();
        ((ArrayList) term29335).add(term29337);
        ((ArrayList) term29335).add(term29339);
        ((ArrayList) term29335).add(term29341);
        ((ArrayList) term29335).add(term29343);
        ((ArrayList) term29335).add(term29345);
        ((ArrayList) term29335).add(term29347);
        ((ArrayList) term29335).add(term29349);
        ((ArrayList) term29335).add(term29351);
        term29296 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term29296, term29296.getClass(), "name", "zHiuLPzYQM");
        setIntField(term29296, term29296.getClass(), "iconId", -758870402);
        setIntField(term29296, term29296.getClass(), "plateId", 72767889);
        setIntField(term29296, term29296.getClass(), "titleId", 1699515029);
        setIntField(term29296, term29296.getClass(), "rate", 673153263);
        setIntField(term29296, term29296.getClass(), "udemaeRate", -1355715967);
        setIntField(term29296, term29296.getClass(), "courseRank", -972516789);
        setIntField(term29296, term29296.getClass(), "classRank", 720077443);
        setIntField(term29296, term29296.getClass(), "classValue", -884523977);
        setField(term29296, term29296.getClass(), "playDatetime", "ioYxUYJBrh");
        setIntField(term29296, term29296.getClass(), "shopId", -1396233580);
        setIntField(term29296, term29296.getClass(), "regionCode", -654234892);
        setIntField(term29296, term29296.getClass(), "typeId", -50930731);
        setIntField(term29296, term29296.getClass(), "musicId", -1067876039);
        setIntField(term29296, term29296.getClass(), "difficulty", -1143749623);
        setIntField(term29296, term29296.getClass(), "version", 1961561878);
        setField(term29296, term29296.getClass(), "resultBitList", term29335);
        setIntField(term29296, term29296.getClass(), "resultNum", 1235809050);
        setIntField(term29296, term29296.getClass(), "achievement", 1370082921);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUdemaeRate", argTypes, term29296, args);
    }

};


