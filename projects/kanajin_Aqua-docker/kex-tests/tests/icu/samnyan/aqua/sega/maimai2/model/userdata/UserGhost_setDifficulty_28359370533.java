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

public class UserGhost_setDifficulty_28359370533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31386;
     Object term31441;

    public UserGhost_setDifficulty_28359370533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term31427 = new Byte((byte) -46);
        Byte term31429 = new Byte((byte) 14);
        Byte term31431 = new Byte((byte) 34);
        Byte term31433 = new Byte((byte) 126);
        Byte term31435 = new Byte((byte) 7);
        ArrayList term31425 = new ArrayList();
        ((ArrayList) term31425).add(term31427);
        ((ArrayList) term31425).add(term31429);
        ((ArrayList) term31425).add(term31431);
        ((ArrayList) term31425).add(term31433);
        ((ArrayList) term31425).add(term31435);
        term31386 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term31386, term31386.getClass(), "name", "EWGMzlcOnW");
        setIntField(term31386, term31386.getClass(), "iconId", -1350968212);
        setIntField(term31386, term31386.getClass(), "plateId", 2027049805);
        setIntField(term31386, term31386.getClass(), "titleId", 1777210338);
        setIntField(term31386, term31386.getClass(), "rate", 1406833110);
        setIntField(term31386, term31386.getClass(), "udemaeRate", 971309393);
        setIntField(term31386, term31386.getClass(), "courseRank", 1506905403);
        setIntField(term31386, term31386.getClass(), "classRank", 1022586170);
        setIntField(term31386, term31386.getClass(), "classValue", -175612916);
        setField(term31386, term31386.getClass(), "playDatetime", "XeSDJYKMBf");
        setIntField(term31386, term31386.getClass(), "shopId", -1966814722);
        setIntField(term31386, term31386.getClass(), "regionCode", -2040048430);
        setIntField(term31386, term31386.getClass(), "typeId", 795243460);
        setIntField(term31386, term31386.getClass(), "musicId", 1116550927);
        setIntField(term31386, term31386.getClass(), "difficulty", -1500511650);
        setIntField(term31386, term31386.getClass(), "version", 1722619795);
        setField(term31386, term31386.getClass(), "resultBitList", term31425);
        setIntField(term31386, term31386.getClass(), "resultNum", 558598813);
        setIntField(term31386, term31386.getClass(), "achievement", -282356982);
        term31441 = new Integer(1060240374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31441;
        callMethod(klass, "setDifficulty", argTypes, term31386, args);
    }

};


