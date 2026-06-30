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

public class UserGhost_setCourseRank_10625538125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30752;
     Object term30805;

    public UserGhost_setCourseRank_10625538125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term30793 = new Byte((byte) 96);
        Byte term30795 = new Byte((byte) 70);
        Byte term30797 = new Byte((byte) 48);
        Byte term30799 = new Byte((byte) -46);
        ArrayList term30791 = new ArrayList();
        ((ArrayList) term30791).add(term30793);
        ((ArrayList) term30791).add(term30795);
        ((ArrayList) term30791).add(term30797);
        ((ArrayList) term30791).add(term30799);
        term30752 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term30752, term30752.getClass(), "name", "KZQwbvujui");
        setIntField(term30752, term30752.getClass(), "iconId", -581928806);
        setIntField(term30752, term30752.getClass(), "plateId", -1387086578);
        setIntField(term30752, term30752.getClass(), "titleId", -2098841130);
        setIntField(term30752, term30752.getClass(), "rate", 65321166);
        setIntField(term30752, term30752.getClass(), "udemaeRate", -2114805689);
        setIntField(term30752, term30752.getClass(), "courseRank", 400772784);
        setIntField(term30752, term30752.getClass(), "classRank", 46781158);
        setIntField(term30752, term30752.getClass(), "classValue", -1987966813);
        setField(term30752, term30752.getClass(), "playDatetime", "JPUZuGxKlI");
        setIntField(term30752, term30752.getClass(), "shopId", 1778126559);
        setIntField(term30752, term30752.getClass(), "regionCode", -1557828355);
        setIntField(term30752, term30752.getClass(), "typeId", 546963992);
        setIntField(term30752, term30752.getClass(), "musicId", 1377120507);
        setIntField(term30752, term30752.getClass(), "difficulty", -1581022727);
        setIntField(term30752, term30752.getClass(), "version", -371740139);
        setField(term30752, term30752.getClass(), "resultBitList", term30791);
        setIntField(term30752, term30752.getClass(), "resultNum", -508560324);
        setIntField(term30752, term30752.getClass(), "achievement", -1700781575);
        term30805 = new Integer(-2042022388);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30805;
        callMethod(klass, "setCourseRank", argTypes, term30752, args);
    }

};


