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

public class UserGhost_setPlayDatetime_144569221628 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30987;

    public UserGhost_setPlayDatetime_144569221628() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term31028 = new Byte((byte) 24);
        Byte term31030 = new Byte((byte) 123);
        Byte term31032 = new Byte((byte) -101);
        Byte term31034 = new Byte((byte) -102);
        Byte term31036 = new Byte((byte) -95);
        Byte term31038 = new Byte((byte) -2);
        Byte term31040 = new Byte((byte) 28);
        Byte term31042 = new Byte((byte) 84);
        ArrayList term31026 = new ArrayList();
        ((ArrayList) term31026).add(term31028);
        ((ArrayList) term31026).add(term31030);
        ((ArrayList) term31026).add(term31032);
        ((ArrayList) term31026).add(term31034);
        ((ArrayList) term31026).add(term31036);
        ((ArrayList) term31026).add(term31038);
        ((ArrayList) term31026).add(term31040);
        ((ArrayList) term31026).add(term31042);
        term30987 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term30987, term30987.getClass(), "name", "ORDuSTrpNA");
        setIntField(term30987, term30987.getClass(), "iconId", 903039854);
        setIntField(term30987, term30987.getClass(), "plateId", -705528573);
        setIntField(term30987, term30987.getClass(), "titleId", -480070896);
        setIntField(term30987, term30987.getClass(), "rate", -1811732249);
        setIntField(term30987, term30987.getClass(), "udemaeRate", 1993504802);
        setIntField(term30987, term30987.getClass(), "courseRank", 526852618);
        setIntField(term30987, term30987.getClass(), "classRank", 903788782);
        setIntField(term30987, term30987.getClass(), "classValue", -608033702);
        setField(term30987, term30987.getClass(), "playDatetime", "hysThIPoEJ");
        setIntField(term30987, term30987.getClass(), "shopId", 1118825073);
        setIntField(term30987, term30987.getClass(), "regionCode", 751108197);
        setIntField(term30987, term30987.getClass(), "typeId", -1810066487);
        setIntField(term30987, term30987.getClass(), "musicId", 12697707);
        setIntField(term30987, term30987.getClass(), "difficulty", -971143668);
        setIntField(term30987, term30987.getClass(), "version", 127763053);
        setField(term30987, term30987.getClass(), "resultBitList", term31026);
        setIntField(term30987, term30987.getClass(), "resultNum", 968035207);
        setIntField(term30987, term30987.getClass(), "achievement", -643589717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dfZepHfGwh";
        callMethod(klass, "setPlayDatetime", argTypes, term30987, args);
    }

};


