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

public class UserGhost_getRate_12868752124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29223;

    public UserGhost_getRate_12868752124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term29264 = new Byte((byte) -99);
        Byte term29266 = new Byte((byte) -2);
        Byte term29268 = new Byte((byte) -16);
        Byte term29270 = new Byte((byte) -112);
        ArrayList term29262 = new ArrayList();
        ((ArrayList) term29262).add(term29264);
        ((ArrayList) term29262).add(term29266);
        ((ArrayList) term29262).add(term29268);
        ((ArrayList) term29262).add(term29270);
        term29223 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term29223, term29223.getClass(), "name", "soJHvZwbtF");
        setIntField(term29223, term29223.getClass(), "iconId", 974951631);
        setIntField(term29223, term29223.getClass(), "plateId", -942202284);
        setIntField(term29223, term29223.getClass(), "titleId", -2083254556);
        setIntField(term29223, term29223.getClass(), "rate", 1452346261);
        setIntField(term29223, term29223.getClass(), "udemaeRate", -548776693);
        setIntField(term29223, term29223.getClass(), "courseRank", 99032275);
        setIntField(term29223, term29223.getClass(), "classRank", 794098686);
        setIntField(term29223, term29223.getClass(), "classValue", -1671524013);
        setField(term29223, term29223.getClass(), "playDatetime", "dTGwgkfDVj");
        setIntField(term29223, term29223.getClass(), "shopId", -438794741);
        setIntField(term29223, term29223.getClass(), "regionCode", -1400834481);
        setIntField(term29223, term29223.getClass(), "typeId", 957091706);
        setIntField(term29223, term29223.getClass(), "musicId", -2011802805);
        setIntField(term29223, term29223.getClass(), "difficulty", -1683802689);
        setIntField(term29223, term29223.getClass(), "version", -1949346221);
        setField(term29223, term29223.getClass(), "resultBitList", term29262);
        setIntField(term29223, term29223.getClass(), "resultNum", 831638391);
        setIntField(term29223, term29223.getClass(), "achievement", -1184374392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRate", argTypes, term29223, args);
    }

};


