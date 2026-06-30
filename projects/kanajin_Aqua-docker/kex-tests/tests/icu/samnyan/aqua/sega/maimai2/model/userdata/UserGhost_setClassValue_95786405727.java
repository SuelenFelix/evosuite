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

public class UserGhost_setClassValue_95786405727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30904;
     Object term30965;

    public UserGhost_setClassValue_95786405727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term30945 = new Byte((byte) -44);
        Byte term30947 = new Byte((byte) 33);
        Byte term30949 = new Byte((byte) -74);
        Byte term30951 = new Byte((byte) -84);
        Byte term30953 = new Byte((byte) -53);
        Byte term30955 = new Byte((byte) -93);
        Byte term30957 = new Byte((byte) 82);
        Byte term30959 = new Byte((byte) -89);
        ArrayList term30943 = new ArrayList();
        ((ArrayList) term30943).add(term30945);
        ((ArrayList) term30943).add(term30947);
        ((ArrayList) term30943).add(term30949);
        ((ArrayList) term30943).add(term30951);
        ((ArrayList) term30943).add(term30953);
        ((ArrayList) term30943).add(term30955);
        ((ArrayList) term30943).add(term30957);
        ((ArrayList) term30943).add(term30959);
        term30904 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term30904, term30904.getClass(), "name", "TDaodpHTRK");
        setIntField(term30904, term30904.getClass(), "iconId", 1146444085);
        setIntField(term30904, term30904.getClass(), "plateId", 316145449);
        setIntField(term30904, term30904.getClass(), "titleId", 387128751);
        setIntField(term30904, term30904.getClass(), "rate", 1220621259);
        setIntField(term30904, term30904.getClass(), "udemaeRate", 272507740);
        setIntField(term30904, term30904.getClass(), "courseRank", -2117539025);
        setIntField(term30904, term30904.getClass(), "classRank", 736842788);
        setIntField(term30904, term30904.getClass(), "classValue", 416550042);
        setField(term30904, term30904.getClass(), "playDatetime", "JayazbYDLK");
        setIntField(term30904, term30904.getClass(), "shopId", 1745727714);
        setIntField(term30904, term30904.getClass(), "regionCode", -1577886337);
        setIntField(term30904, term30904.getClass(), "typeId", -481394578);
        setIntField(term30904, term30904.getClass(), "musicId", 1440683242);
        setIntField(term30904, term30904.getClass(), "difficulty", -1746192055);
        setIntField(term30904, term30904.getClass(), "version", -996911099);
        setField(term30904, term30904.getClass(), "resultBitList", term30943);
        setIntField(term30904, term30904.getClass(), "resultNum", -610865659);
        setIntField(term30904, term30904.getClass(), "achievement", 2044119255);
        term30965 = new Integer(-1924668199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30965;
        callMethod(klass, "setClassValue", argTypes, term30904, args);
    }

};


