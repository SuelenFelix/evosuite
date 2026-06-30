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

public class UserGhost_setVersion_66487961834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31463;
     Object term31520;

    public UserGhost_setVersion_66487961834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term31504 = new Byte((byte) -96);
        Byte term31506 = new Byte((byte) -22);
        Byte term31508 = new Byte((byte) -5);
        Byte term31510 = new Byte((byte) -124);
        Byte term31512 = new Byte((byte) -105);
        Byte term31514 = new Byte((byte) 25);
        ArrayList term31502 = new ArrayList();
        ((ArrayList) term31502).add(term31504);
        ((ArrayList) term31502).add(term31506);
        ((ArrayList) term31502).add(term31508);
        ((ArrayList) term31502).add(term31510);
        ((ArrayList) term31502).add(term31512);
        ((ArrayList) term31502).add(term31514);
        term31463 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term31463, term31463.getClass(), "name", "tIsFcOGTUX");
        setIntField(term31463, term31463.getClass(), "iconId", 2119043046);
        setIntField(term31463, term31463.getClass(), "plateId", 375507053);
        setIntField(term31463, term31463.getClass(), "titleId", 1803067672);
        setIntField(term31463, term31463.getClass(), "rate", -844822506);
        setIntField(term31463, term31463.getClass(), "udemaeRate", -586687174);
        setIntField(term31463, term31463.getClass(), "courseRank", 583343799);
        setIntField(term31463, term31463.getClass(), "classRank", 1831635466);
        setIntField(term31463, term31463.getClass(), "classValue", -981606069);
        setField(term31463, term31463.getClass(), "playDatetime", "XUVRcnELFP");
        setIntField(term31463, term31463.getClass(), "shopId", 548729456);
        setIntField(term31463, term31463.getClass(), "regionCode", 482026097);
        setIntField(term31463, term31463.getClass(), "typeId", -528954009);
        setIntField(term31463, term31463.getClass(), "musicId", -918570985);
        setIntField(term31463, term31463.getClass(), "difficulty", 242181753);
        setIntField(term31463, term31463.getClass(), "version", -1356117545);
        setField(term31463, term31463.getClass(), "resultBitList", term31502);
        setIntField(term31463, term31463.getClass(), "resultNum", -1539896141);
        setIntField(term31463, term31463.getClass(), "achievement", 798480099);
        term31520 = new Integer(-1624038595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31520;
        callMethod(klass, "setVersion", argTypes, term31463, args);
    }

};


