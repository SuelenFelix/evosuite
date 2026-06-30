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

public class UserGhost_setShopId_211868099329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31090;
     Object term31145;

    public UserGhost_setShopId_211868099329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term31131 = new Byte((byte) 85);
        Byte term31133 = new Byte((byte) -17);
        Byte term31135 = new Byte((byte) -83);
        Byte term31137 = new Byte((byte) 48);
        Byte term31139 = new Byte((byte) -128);
        ArrayList term31129 = new ArrayList();
        ((ArrayList) term31129).add(term31131);
        ((ArrayList) term31129).add(term31133);
        ((ArrayList) term31129).add(term31135);
        ((ArrayList) term31129).add(term31137);
        ((ArrayList) term31129).add(term31139);
        term31090 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term31090, term31090.getClass(), "name", "zjfMxUERFZ");
        setIntField(term31090, term31090.getClass(), "iconId", -1599482698);
        setIntField(term31090, term31090.getClass(), "plateId", -370600915);
        setIntField(term31090, term31090.getClass(), "titleId", -311572875);
        setIntField(term31090, term31090.getClass(), "rate", 355595594);
        setIntField(term31090, term31090.getClass(), "udemaeRate", 842697786);
        setIntField(term31090, term31090.getClass(), "courseRank", 1685808201);
        setIntField(term31090, term31090.getClass(), "classRank", 1565114969);
        setIntField(term31090, term31090.getClass(), "classValue", 806831765);
        setField(term31090, term31090.getClass(), "playDatetime", "ooVlhmiOff");
        setIntField(term31090, term31090.getClass(), "shopId", -1445658721);
        setIntField(term31090, term31090.getClass(), "regionCode", 872435483);
        setIntField(term31090, term31090.getClass(), "typeId", 110611143);
        setIntField(term31090, term31090.getClass(), "musicId", 793381056);
        setIntField(term31090, term31090.getClass(), "difficulty", 65007514);
        setIntField(term31090, term31090.getClass(), "version", 1731844126);
        setField(term31090, term31090.getClass(), "resultBitList", term31129);
        setIntField(term31090, term31090.getClass(), "resultNum", -861962061);
        setIntField(term31090, term31090.getClass(), "achievement", -1867124507);
        term31145 = new Integer(416116291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31145;
        callMethod(klass, "setShopId", argTypes, term31090, args);
    }

};


