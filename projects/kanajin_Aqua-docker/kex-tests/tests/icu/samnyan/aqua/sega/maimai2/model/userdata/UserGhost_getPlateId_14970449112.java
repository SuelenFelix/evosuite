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

public class UserGhost_getPlateId_14970449112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29077;

    public UserGhost_getPlateId_14970449112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term29118 = new Byte((byte) 74);
        Byte term29120 = new Byte((byte) -71);
        Byte term29122 = new Byte((byte) 49);
        Byte term29124 = new Byte((byte) -54);
        Byte term29126 = new Byte((byte) 67);
        ArrayList term29116 = new ArrayList();
        ((ArrayList) term29116).add(term29118);
        ((ArrayList) term29116).add(term29120);
        ((ArrayList) term29116).add(term29122);
        ((ArrayList) term29116).add(term29124);
        ((ArrayList) term29116).add(term29126);
        term29077 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term29077, term29077.getClass(), "name", "huNTIobUHx");
        setIntField(term29077, term29077.getClass(), "iconId", 170509161);
        setIntField(term29077, term29077.getClass(), "plateId", 491497994);
        setIntField(term29077, term29077.getClass(), "titleId", 1997288643);
        setIntField(term29077, term29077.getClass(), "rate", -378961519);
        setIntField(term29077, term29077.getClass(), "udemaeRate", -400280008);
        setIntField(term29077, term29077.getClass(), "courseRank", -1191957775);
        setIntField(term29077, term29077.getClass(), "classRank", 14181775);
        setIntField(term29077, term29077.getClass(), "classValue", 667778327);
        setField(term29077, term29077.getClass(), "playDatetime", "MrVeCmRVzF");
        setIntField(term29077, term29077.getClass(), "shopId", 395074450);
        setIntField(term29077, term29077.getClass(), "regionCode", -2028511200);
        setIntField(term29077, term29077.getClass(), "typeId", 1415605360);
        setIntField(term29077, term29077.getClass(), "musicId", 896275171);
        setIntField(term29077, term29077.getClass(), "difficulty", 466010);
        setIntField(term29077, term29077.getClass(), "version", -169463842);
        setField(term29077, term29077.getClass(), "resultBitList", term29116);
        setIntField(term29077, term29077.getClass(), "resultNum", -2106837394);
        setIntField(term29077, term29077.getClass(), "achievement", -533202192);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlateId", argTypes, term29077, args);
    }

};


