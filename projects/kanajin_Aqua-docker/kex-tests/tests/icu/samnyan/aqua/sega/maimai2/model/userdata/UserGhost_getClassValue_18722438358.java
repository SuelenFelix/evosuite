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

public class UserGhost_getClassValue_18722438358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29515;

    public UserGhost_getClassValue_18722438358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term29556 = new Byte((byte) 80);
        ArrayList term29554 = new ArrayList();
        ((ArrayList) term29554).add(term29556);
        term29515 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term29515, term29515.getClass(), "name", "JsXroBYqwr");
        setIntField(term29515, term29515.getClass(), "iconId", -377697034);
        setIntField(term29515, term29515.getClass(), "plateId", 1102778743);
        setIntField(term29515, term29515.getClass(), "titleId", 1300928519);
        setIntField(term29515, term29515.getClass(), "rate", 338172676);
        setIntField(term29515, term29515.getClass(), "udemaeRate", -1896960942);
        setIntField(term29515, term29515.getClass(), "courseRank", -935912608);
        setIntField(term29515, term29515.getClass(), "classRank", 505087197);
        setIntField(term29515, term29515.getClass(), "classValue", 427005798);
        setField(term29515, term29515.getClass(), "playDatetime", "YciMAObLwl");
        setIntField(term29515, term29515.getClass(), "shopId", -993454505);
        setIntField(term29515, term29515.getClass(), "regionCode", -238353821);
        setIntField(term29515, term29515.getClass(), "typeId", -818992228);
        setIntField(term29515, term29515.getClass(), "musicId", 2087429143);
        setIntField(term29515, term29515.getClass(), "difficulty", -1892890104);
        setIntField(term29515, term29515.getClass(), "version", 2003356558);
        setField(term29515, term29515.getClass(), "resultBitList", term29554);
        setIntField(term29515, term29515.getClass(), "resultNum", -638126185);
        setIntField(term29515, term29515.getClass(), "achievement", 28070985);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassValue", argTypes, term29515, args);
    }

};


