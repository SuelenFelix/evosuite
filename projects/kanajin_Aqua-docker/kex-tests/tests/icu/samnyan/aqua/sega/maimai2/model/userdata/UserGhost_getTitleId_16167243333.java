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

public class UserGhost_getTitleId_16167243333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29152;

    public UserGhost_getTitleId_16167243333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term29193 = new Byte((byte) 78);
        Byte term29195 = new Byte((byte) 87);
        Byte term29197 = new Byte((byte) 121);
        ArrayList term29191 = new ArrayList();
        ((ArrayList) term29191).add(term29193);
        ((ArrayList) term29191).add(term29195);
        ((ArrayList) term29191).add(term29197);
        term29152 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term29152, term29152.getClass(), "name", "CPVnQYACKw");
        setIntField(term29152, term29152.getClass(), "iconId", -1349617857);
        setIntField(term29152, term29152.getClass(), "plateId", 1346331516);
        setIntField(term29152, term29152.getClass(), "titleId", 1018925421);
        setIntField(term29152, term29152.getClass(), "rate", -1658031378);
        setIntField(term29152, term29152.getClass(), "udemaeRate", -863483345);
        setIntField(term29152, term29152.getClass(), "courseRank", -1722702406);
        setIntField(term29152, term29152.getClass(), "classRank", 549278914);
        setIntField(term29152, term29152.getClass(), "classValue", -1490125498);
        setField(term29152, term29152.getClass(), "playDatetime", "sbdLhVCRsw");
        setIntField(term29152, term29152.getClass(), "shopId", -1443119347);
        setIntField(term29152, term29152.getClass(), "regionCode", 1962181481);
        setIntField(term29152, term29152.getClass(), "typeId", 1798831879);
        setIntField(term29152, term29152.getClass(), "musicId", 1393855580);
        setIntField(term29152, term29152.getClass(), "difficulty", -849064032);
        setIntField(term29152, term29152.getClass(), "version", -184659375);
        setField(term29152, term29152.getClass(), "resultBitList", term29191);
        setIntField(term29152, term29152.getClass(), "resultNum", 629005618);
        setIntField(term29152, term29152.getClass(), "achievement", -2006508013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTitleId", argTypes, term29152, args);
    }

};


