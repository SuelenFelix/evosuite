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

public class UserGhost_getTypeId_193021302512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29789;

    public UserGhost_getTypeId_193021302512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term29830 = new Byte((byte) -85);
        Byte term29832 = new Byte((byte) -22);
        Byte term29834 = new Byte((byte) 93);
        ArrayList term29828 = new ArrayList();
        ((ArrayList) term29828).add(term29830);
        ((ArrayList) term29828).add(term29832);
        ((ArrayList) term29828).add(term29834);
        term29789 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term29789, term29789.getClass(), "name", "dPHtrzKWgf");
        setIntField(term29789, term29789.getClass(), "iconId", -1929631412);
        setIntField(term29789, term29789.getClass(), "plateId", 1014160441);
        setIntField(term29789, term29789.getClass(), "titleId", 975753484);
        setIntField(term29789, term29789.getClass(), "rate", -1886360357);
        setIntField(term29789, term29789.getClass(), "udemaeRate", -235867268);
        setIntField(term29789, term29789.getClass(), "courseRank", -972330704);
        setIntField(term29789, term29789.getClass(), "classRank", 134173297);
        setIntField(term29789, term29789.getClass(), "classValue", 2025698852);
        setField(term29789, term29789.getClass(), "playDatetime", "olmFxfIVeh");
        setIntField(term29789, term29789.getClass(), "shopId", 113961338);
        setIntField(term29789, term29789.getClass(), "regionCode", 1869277085);
        setIntField(term29789, term29789.getClass(), "typeId", 498801287);
        setIntField(term29789, term29789.getClass(), "musicId", 969573395);
        setIntField(term29789, term29789.getClass(), "difficulty", -899109027);
        setIntField(term29789, term29789.getClass(), "version", -694297070);
        setField(term29789, term29789.getClass(), "resultBitList", term29828);
        setIntField(term29789, term29789.getClass(), "resultNum", 786551253);
        setIntField(term29789, term29789.getClass(), "achievement", -104779523);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTypeId", argTypes, term29789, args);
    }

};


