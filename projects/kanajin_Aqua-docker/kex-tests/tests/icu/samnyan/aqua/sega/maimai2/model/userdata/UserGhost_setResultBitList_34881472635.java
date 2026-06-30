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
import java.util.LinkedList;
import java.lang.Byte;

public class UserGhost_setResultBitList_34881472635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31542;
     Object term31587;

    public UserGhost_setResultBitList_34881472635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31581 = new ArrayList();
        term31542 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term31542, term31542.getClass(), "name", "xIeSbezmkD");
        setIntField(term31542, term31542.getClass(), "iconId", 1593619323);
        setIntField(term31542, term31542.getClass(), "plateId", -232601868);
        setIntField(term31542, term31542.getClass(), "titleId", -1743056588);
        setIntField(term31542, term31542.getClass(), "rate", 576646846);
        setIntField(term31542, term31542.getClass(), "udemaeRate", 916507296);
        setIntField(term31542, term31542.getClass(), "courseRank", 1307887729);
        setIntField(term31542, term31542.getClass(), "classRank", 1628336669);
        setIntField(term31542, term31542.getClass(), "classValue", 466807421);
        setField(term31542, term31542.getClass(), "playDatetime", "txUWLZRkSv");
        setIntField(term31542, term31542.getClass(), "shopId", -407675703);
        setIntField(term31542, term31542.getClass(), "regionCode", -429960516);
        setIntField(term31542, term31542.getClass(), "typeId", -630727180);
        setIntField(term31542, term31542.getClass(), "musicId", -1234361060);
        setIntField(term31542, term31542.getClass(), "difficulty", -267520884);
        setIntField(term31542, term31542.getClass(), "version", 1431716083);
        setField(term31542, term31542.getClass(), "resultBitList", term31581);
        setIntField(term31542, term31542.getClass(), "resultNum", 1540004680);
        setIntField(term31542, term31542.getClass(), "achievement", -594861500);
        Byte term31590 = new Byte((byte) 16);
        term31587 = new LinkedList();
        ((LinkedList) term31587).add(term31590);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term31587;
        callMethod(klass, "setResultBitList", argTypes, term31542, args);
    }

};


