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

public class UserGhost_setUdemaeRate_128768267924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30679;
     Object term30730;

    public UserGhost_setUdemaeRate_128768267924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term30720 = new Byte((byte) -97);
        Byte term30722 = new Byte((byte) -24);
        Byte term30724 = new Byte((byte) 88);
        ArrayList term30718 = new ArrayList();
        ((ArrayList) term30718).add(term30720);
        ((ArrayList) term30718).add(term30722);
        ((ArrayList) term30718).add(term30724);
        term30679 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term30679, term30679.getClass(), "name", "VZyeaOWYEj");
        setIntField(term30679, term30679.getClass(), "iconId", 1929952462);
        setIntField(term30679, term30679.getClass(), "plateId", 701114540);
        setIntField(term30679, term30679.getClass(), "titleId", -1284079635);
        setIntField(term30679, term30679.getClass(), "rate", -2130090775);
        setIntField(term30679, term30679.getClass(), "udemaeRate", -1455026066);
        setIntField(term30679, term30679.getClass(), "courseRank", -169160528);
        setIntField(term30679, term30679.getClass(), "classRank", 951748736);
        setIntField(term30679, term30679.getClass(), "classValue", 787260842);
        setField(term30679, term30679.getClass(), "playDatetime", "PErxMBQSUv");
        setIntField(term30679, term30679.getClass(), "shopId", -137516512);
        setIntField(term30679, term30679.getClass(), "regionCode", -585134115);
        setIntField(term30679, term30679.getClass(), "typeId", 1435872700);
        setIntField(term30679, term30679.getClass(), "musicId", 1421496660);
        setIntField(term30679, term30679.getClass(), "difficulty", -1299897376);
        setIntField(term30679, term30679.getClass(), "version", 1829266361);
        setField(term30679, term30679.getClass(), "resultBitList", term30718);
        setIntField(term30679, term30679.getClass(), "resultNum", -1296335739);
        setIntField(term30679, term30679.getClass(), "achievement", -520737857);
        term30730 = new Integer(-2038325814);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30730;
        callMethod(klass, "setUdemaeRate", argTypes, term30679, args);
    }

};


