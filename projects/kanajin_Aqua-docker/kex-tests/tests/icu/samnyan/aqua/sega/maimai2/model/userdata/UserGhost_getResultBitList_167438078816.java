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

public class UserGhost_getResultBitList_167438078816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30073;

    public UserGhost_getResultBitList_167438078816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term30114 = new Byte((byte) 79);
        Byte term30116 = new Byte((byte) 61);
        Byte term30118 = new Byte((byte) -92);
        Byte term30120 = new Byte((byte) -42);
        ArrayList term30112 = new ArrayList();
        ((ArrayList) term30112).add(term30114);
        ((ArrayList) term30112).add(term30116);
        ((ArrayList) term30112).add(term30118);
        ((ArrayList) term30112).add(term30120);
        term30073 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term30073, term30073.getClass(), "name", "EhlWSobaco");
        setIntField(term30073, term30073.getClass(), "iconId", 280202002);
        setIntField(term30073, term30073.getClass(), "plateId", -1074402599);
        setIntField(term30073, term30073.getClass(), "titleId", -1867539151);
        setIntField(term30073, term30073.getClass(), "rate", -816430246);
        setIntField(term30073, term30073.getClass(), "udemaeRate", 1754193865);
        setIntField(term30073, term30073.getClass(), "courseRank", 25277058);
        setIntField(term30073, term30073.getClass(), "classRank", -949634053);
        setIntField(term30073, term30073.getClass(), "classValue", 1495471055);
        setField(term30073, term30073.getClass(), "playDatetime", "hEuycunsSe");
        setIntField(term30073, term30073.getClass(), "shopId", -583415628);
        setIntField(term30073, term30073.getClass(), "regionCode", -1488660931);
        setIntField(term30073, term30073.getClass(), "typeId", 1899095931);
        setIntField(term30073, term30073.getClass(), "musicId", 145571200);
        setIntField(term30073, term30073.getClass(), "difficulty", -81919234);
        setIntField(term30073, term30073.getClass(), "version", 41779745);
        setField(term30073, term30073.getClass(), "resultBitList", term30112);
        setIntField(term30073, term30073.getClass(), "resultNum", 908188015);
        setIntField(term30073, term30073.getClass(), "achievement", 1448289766);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getResultBitList", argTypes, term30073, args);
    }

};


