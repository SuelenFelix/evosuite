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

public class UserGhost_getShopId_203372841910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29647;

    public UserGhost_getShopId_203372841910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term29688 = new Byte((byte) 42);
        ArrayList term29686 = new ArrayList();
        ((ArrayList) term29686).add(term29688);
        term29647 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term29647, term29647.getClass(), "name", "zhcWVVrrjs");
        setIntField(term29647, term29647.getClass(), "iconId", -1745708025);
        setIntField(term29647, term29647.getClass(), "plateId", 790614624);
        setIntField(term29647, term29647.getClass(), "titleId", 117387225);
        setIntField(term29647, term29647.getClass(), "rate", 948347134);
        setIntField(term29647, term29647.getClass(), "udemaeRate", -1552842218);
        setIntField(term29647, term29647.getClass(), "courseRank", -157220068);
        setIntField(term29647, term29647.getClass(), "classRank", 141434141);
        setIntField(term29647, term29647.getClass(), "classValue", -288619829);
        setField(term29647, term29647.getClass(), "playDatetime", "EAMaFLdmaG");
        setIntField(term29647, term29647.getClass(), "shopId", -505635206);
        setIntField(term29647, term29647.getClass(), "regionCode", 932246615);
        setIntField(term29647, term29647.getClass(), "typeId", 261281668);
        setIntField(term29647, term29647.getClass(), "musicId", 1712273163);
        setIntField(term29647, term29647.getClass(), "difficulty", 234306621);
        setIntField(term29647, term29647.getClass(), "version", 1025525602);
        setField(term29647, term29647.getClass(), "resultBitList", term29686);
        setIntField(term29647, term29647.getClass(), "resultNum", 1669406334);
        setIntField(term29647, term29647.getClass(), "achievement", -780862464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getShopId", argTypes, term29647, args);
    }

};


