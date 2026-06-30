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

public class UserGhost_getDifficulty_63078607314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29929;

    public UserGhost_getDifficulty_63078607314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term29970 = new Byte((byte) -123);
        Byte term29972 = new Byte((byte) -23);
        ArrayList term29968 = new ArrayList();
        ((ArrayList) term29968).add(term29970);
        ((ArrayList) term29968).add(term29972);
        term29929 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term29929, term29929.getClass(), "name", "vbSWeJWOQh");
        setIntField(term29929, term29929.getClass(), "iconId", 1970023149);
        setIntField(term29929, term29929.getClass(), "plateId", -336351735);
        setIntField(term29929, term29929.getClass(), "titleId", 1938932230);
        setIntField(term29929, term29929.getClass(), "rate", 1128720609);
        setIntField(term29929, term29929.getClass(), "udemaeRate", 216265002);
        setIntField(term29929, term29929.getClass(), "courseRank", -97405660);
        setIntField(term29929, term29929.getClass(), "classRank", 872278468);
        setIntField(term29929, term29929.getClass(), "classValue", -1003390920);
        setField(term29929, term29929.getClass(), "playDatetime", "hyvFdAvkOr");
        setIntField(term29929, term29929.getClass(), "shopId", -2052568448);
        setIntField(term29929, term29929.getClass(), "regionCode", 664155196);
        setIntField(term29929, term29929.getClass(), "typeId", -1103257588);
        setIntField(term29929, term29929.getClass(), "musicId", 1463219831);
        setIntField(term29929, term29929.getClass(), "difficulty", -1516863216);
        setIntField(term29929, term29929.getClass(), "version", 1392468004);
        setField(term29929, term29929.getClass(), "resultBitList", term29968);
        setIntField(term29929, term29929.getClass(), "resultNum", -1568339070);
        setIntField(term29929, term29929.getClass(), "achievement", -1427059961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDifficulty", argTypes, term29929, args);
    }

};


