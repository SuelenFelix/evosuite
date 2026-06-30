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

public class UserGhost_getIconId_18686065601 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29000;

    public UserGhost_getIconId_18686065601() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term29041 = new Byte((byte) -54);
        Byte term29043 = new Byte((byte) -10);
        Byte term29045 = new Byte((byte) 79);
        Byte term29047 = new Byte((byte) -119);
        Byte term29049 = new Byte((byte) -66);
        Byte term29051 = new Byte((byte) 83);
        ArrayList term29039 = new ArrayList();
        ((ArrayList) term29039).add(term29041);
        ((ArrayList) term29039).add(term29043);
        ((ArrayList) term29039).add(term29045);
        ((ArrayList) term29039).add(term29047);
        ((ArrayList) term29039).add(term29049);
        ((ArrayList) term29039).add(term29051);
        term29000 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term29000, term29000.getClass(), "name", "FOKfDXQxMM");
        setIntField(term29000, term29000.getClass(), "iconId", 1075321384);
        setIntField(term29000, term29000.getClass(), "plateId", -1726073541);
        setIntField(term29000, term29000.getClass(), "titleId", 406945977);
        setIntField(term29000, term29000.getClass(), "rate", 493657684);
        setIntField(term29000, term29000.getClass(), "udemaeRate", 1882655922);
        setIntField(term29000, term29000.getClass(), "courseRank", 1314996390);
        setIntField(term29000, term29000.getClass(), "classRank", 1367703658);
        setIntField(term29000, term29000.getClass(), "classValue", 1120153100);
        setField(term29000, term29000.getClass(), "playDatetime", "gbxMvhrWpA");
        setIntField(term29000, term29000.getClass(), "shopId", 158801111);
        setIntField(term29000, term29000.getClass(), "regionCode", 464966803);
        setIntField(term29000, term29000.getClass(), "typeId", -246618392);
        setIntField(term29000, term29000.getClass(), "musicId", 1472246167);
        setIntField(term29000, term29000.getClass(), "difficulty", 1008555478);
        setIntField(term29000, term29000.getClass(), "version", 1346386442);
        setField(term29000, term29000.getClass(), "resultBitList", term29039);
        setIntField(term29000, term29000.getClass(), "resultNum", 1904559758);
        setIntField(term29000, term29000.getClass(), "achievement", 610850630);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getIconId", argTypes, term29000, args);
    }

};


