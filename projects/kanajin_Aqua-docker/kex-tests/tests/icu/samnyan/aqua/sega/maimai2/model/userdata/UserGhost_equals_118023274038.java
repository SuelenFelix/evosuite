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

public class UserGhost_equals_118023274038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31765;
     Object term31820;

    public UserGhost_equals_118023274038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term31806 = new Byte((byte) -1);
        Byte term31808 = new Byte((byte) 117);
        Byte term31810 = new Byte((byte) 43);
        Byte term31812 = new Byte((byte) -27);
        Byte term31814 = new Byte((byte) 34);
        ArrayList term31804 = new ArrayList();
        ((ArrayList) term31804).add(term31806);
        ((ArrayList) term31804).add(term31808);
        ((ArrayList) term31804).add(term31810);
        ((ArrayList) term31804).add(term31812);
        ((ArrayList) term31804).add(term31814);
        term31765 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term31765, term31765.getClass(), "name", "cuWgFcYkPC");
        setIntField(term31765, term31765.getClass(), "iconId", 844890845);
        setIntField(term31765, term31765.getClass(), "plateId", -989538894);
        setIntField(term31765, term31765.getClass(), "titleId", 1316863342);
        setIntField(term31765, term31765.getClass(), "rate", 735033722);
        setIntField(term31765, term31765.getClass(), "udemaeRate", -1409886459);
        setIntField(term31765, term31765.getClass(), "courseRank", 666379561);
        setIntField(term31765, term31765.getClass(), "classRank", 1071163503);
        setIntField(term31765, term31765.getClass(), "classValue", -1507726422);
        setField(term31765, term31765.getClass(), "playDatetime", "HfbcOKkXBm");
        setIntField(term31765, term31765.getClass(), "shopId", 171429081);
        setIntField(term31765, term31765.getClass(), "regionCode", 1552107519);
        setIntField(term31765, term31765.getClass(), "typeId", -1952294830);
        setIntField(term31765, term31765.getClass(), "musicId", -1756012081);
        setIntField(term31765, term31765.getClass(), "difficulty", 879317718);
        setIntField(term31765, term31765.getClass(), "version", -1205568351);
        setField(term31765, term31765.getClass(), "resultBitList", term31804);
        setIntField(term31765, term31765.getClass(), "resultNum", -1038188576);
        setIntField(term31765, term31765.getClass(), "achievement", -190354157);
        term31820 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term31820;
        callMethod(klass, "equals", argTypes, term31765, args);
    }

};


