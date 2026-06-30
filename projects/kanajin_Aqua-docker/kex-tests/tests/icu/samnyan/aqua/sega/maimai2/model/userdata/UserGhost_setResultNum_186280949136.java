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

public class UserGhost_setResultNum_186280949136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31613;
     Object term31676;

    public UserGhost_setResultNum_186280949136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term31654 = new Byte((byte) 39);
        Byte term31656 = new Byte((byte) 123);
        Byte term31658 = new Byte((byte) 16);
        Byte term31660 = new Byte((byte) 2);
        Byte term31662 = new Byte((byte) -120);
        Byte term31664 = new Byte((byte) 96);
        Byte term31666 = new Byte((byte) -41);
        Byte term31668 = new Byte((byte) -88);
        Byte term31670 = new Byte((byte) 39);
        ArrayList term31652 = new ArrayList();
        ((ArrayList) term31652).add(term31654);
        ((ArrayList) term31652).add(term31656);
        ((ArrayList) term31652).add(term31658);
        ((ArrayList) term31652).add(term31660);
        ((ArrayList) term31652).add(term31662);
        ((ArrayList) term31652).add(term31664);
        ((ArrayList) term31652).add(term31666);
        ((ArrayList) term31652).add(term31668);
        ((ArrayList) term31652).add(term31670);
        term31613 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term31613, term31613.getClass(), "name", "gHRMJRsBGm");
        setIntField(term31613, term31613.getClass(), "iconId", 1731562923);
        setIntField(term31613, term31613.getClass(), "plateId", 33467458);
        setIntField(term31613, term31613.getClass(), "titleId", 1729034001);
        setIntField(term31613, term31613.getClass(), "rate", 1094810824);
        setIntField(term31613, term31613.getClass(), "udemaeRate", -1746471324);
        setIntField(term31613, term31613.getClass(), "courseRank", 844485803);
        setIntField(term31613, term31613.getClass(), "classRank", -1373407191);
        setIntField(term31613, term31613.getClass(), "classValue", 1013516042);
        setField(term31613, term31613.getClass(), "playDatetime", "rZyrfnMvHa");
        setIntField(term31613, term31613.getClass(), "shopId", 284652039);
        setIntField(term31613, term31613.getClass(), "regionCode", 1163350537);
        setIntField(term31613, term31613.getClass(), "typeId", -855026181);
        setIntField(term31613, term31613.getClass(), "musicId", 1404243357);
        setIntField(term31613, term31613.getClass(), "difficulty", -570134327);
        setIntField(term31613, term31613.getClass(), "version", 73847121);
        setField(term31613, term31613.getClass(), "resultBitList", term31652);
        setIntField(term31613, term31613.getClass(), "resultNum", 1721050745);
        setIntField(term31613, term31613.getClass(), "achievement", -1980981205);
        term31676 = new Integer(-1530498856);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31676;
        callMethod(klass, "setResultNum", argTypes, term31613, args);
    }

};


