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

public class UserGhost_getResultNum_66404885517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30146;

    public UserGhost_getResultNum_66404885517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term30187 = new Byte((byte) 116);
        Byte term30189 = new Byte((byte) -81);
        Byte term30191 = new Byte((byte) 102);
        Byte term30193 = new Byte((byte) -118);
        Byte term30195 = new Byte((byte) -126);
        Byte term30197 = new Byte((byte) -91);
        Byte term30199 = new Byte((byte) -104);
        Byte term30201 = new Byte((byte) -89);
        ArrayList term30185 = new ArrayList();
        ((ArrayList) term30185).add(term30187);
        ((ArrayList) term30185).add(term30189);
        ((ArrayList) term30185).add(term30191);
        ((ArrayList) term30185).add(term30193);
        ((ArrayList) term30185).add(term30195);
        ((ArrayList) term30185).add(term30197);
        ((ArrayList) term30185).add(term30199);
        ((ArrayList) term30185).add(term30201);
        term30146 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term30146, term30146.getClass(), "name", "IMFzXhpNCx");
        setIntField(term30146, term30146.getClass(), "iconId", 1377148923);
        setIntField(term30146, term30146.getClass(), "plateId", 540775467);
        setIntField(term30146, term30146.getClass(), "titleId", -2083028527);
        setIntField(term30146, term30146.getClass(), "rate", 1631605263);
        setIntField(term30146, term30146.getClass(), "udemaeRate", -1378134881);
        setIntField(term30146, term30146.getClass(), "courseRank", -1887131478);
        setIntField(term30146, term30146.getClass(), "classRank", 1916020077);
        setIntField(term30146, term30146.getClass(), "classValue", -1842191454);
        setField(term30146, term30146.getClass(), "playDatetime", "xAtFmANjwD");
        setIntField(term30146, term30146.getClass(), "shopId", 384551988);
        setIntField(term30146, term30146.getClass(), "regionCode", -2021521187);
        setIntField(term30146, term30146.getClass(), "typeId", -2139205197);
        setIntField(term30146, term30146.getClass(), "musicId", -584949216);
        setIntField(term30146, term30146.getClass(), "difficulty", 1646064199);
        setIntField(term30146, term30146.getClass(), "version", -1135845415);
        setField(term30146, term30146.getClass(), "resultBitList", term30185);
        setIntField(term30146, term30146.getClass(), "resultNum", -1361921586);
        setIntField(term30146, term30146.getClass(), "achievement", 593679468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResultNum", argTypes, term30146, args);
    }

};


