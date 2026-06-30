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

public class UserGhost_toString_22078637541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31978;

    public UserGhost_toString_22078637541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term32019 = new Byte((byte) 69);
        ArrayList term32017 = new ArrayList();
        ((ArrayList) term32017).add(term32019);
        term31978 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term31978, term31978.getClass(), "name", "kevWstoxwq");
        setIntField(term31978, term31978.getClass(), "iconId", -1484528924);
        setIntField(term31978, term31978.getClass(), "plateId", -557662858);
        setIntField(term31978, term31978.getClass(), "titleId", -477520795);
        setIntField(term31978, term31978.getClass(), "rate", -480468995);
        setIntField(term31978, term31978.getClass(), "udemaeRate", -2037695985);
        setIntField(term31978, term31978.getClass(), "courseRank", -2044768479);
        setIntField(term31978, term31978.getClass(), "classRank", -2020209498);
        setIntField(term31978, term31978.getClass(), "classValue", 754066823);
        setField(term31978, term31978.getClass(), "playDatetime", "aSYOhFwzSm");
        setIntField(term31978, term31978.getClass(), "shopId", 306903225);
        setIntField(term31978, term31978.getClass(), "regionCode", -1245754321);
        setIntField(term31978, term31978.getClass(), "typeId", 398727237);
        setIntField(term31978, term31978.getClass(), "musicId", -1741920202);
        setIntField(term31978, term31978.getClass(), "difficulty", 1639977614);
        setIntField(term31978, term31978.getClass(), "version", -27270642);
        setField(term31978, term31978.getClass(), "resultBitList", term32017);
        setIntField(term31978, term31978.getClass(), "resultNum", -1419515823);
        setIntField(term31978, term31978.getClass(), "achievement", 1749999469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term31978, args);
    }

};


