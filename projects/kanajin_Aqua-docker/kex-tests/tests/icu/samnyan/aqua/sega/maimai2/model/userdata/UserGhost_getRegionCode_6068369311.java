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

public class UserGhost_getRegionCode_6068369311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29714;

    public UserGhost_getRegionCode_6068369311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term29755 = new Byte((byte) 72);
        Byte term29757 = new Byte((byte) 111);
        Byte term29759 = new Byte((byte) 99);
        Byte term29761 = new Byte((byte) -12);
        Byte term29763 = new Byte((byte) -61);
        ArrayList term29753 = new ArrayList();
        ((ArrayList) term29753).add(term29755);
        ((ArrayList) term29753).add(term29757);
        ((ArrayList) term29753).add(term29759);
        ((ArrayList) term29753).add(term29761);
        ((ArrayList) term29753).add(term29763);
        term29714 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term29714, term29714.getClass(), "name", "DYZSJMwbhX");
        setIntField(term29714, term29714.getClass(), "iconId", 2014099129);
        setIntField(term29714, term29714.getClass(), "plateId", -1024382698);
        setIntField(term29714, term29714.getClass(), "titleId", -168406824);
        setIntField(term29714, term29714.getClass(), "rate", 2063577636);
        setIntField(term29714, term29714.getClass(), "udemaeRate", 1680632578);
        setIntField(term29714, term29714.getClass(), "courseRank", 511399994);
        setIntField(term29714, term29714.getClass(), "classRank", 2094923086);
        setIntField(term29714, term29714.getClass(), "classValue", 1532355365);
        setField(term29714, term29714.getClass(), "playDatetime", "QGcshsIIWo");
        setIntField(term29714, term29714.getClass(), "shopId", -156316508);
        setIntField(term29714, term29714.getClass(), "regionCode", -1304449497);
        setIntField(term29714, term29714.getClass(), "typeId", -80320412);
        setIntField(term29714, term29714.getClass(), "musicId", -356797136);
        setIntField(term29714, term29714.getClass(), "difficulty", -2035641970);
        setIntField(term29714, term29714.getClass(), "version", 1813581230);
        setField(term29714, term29714.getClass(), "resultBitList", term29753);
        setIntField(term29714, term29714.getClass(), "resultNum", 844569461);
        setIntField(term29714, term29714.getClass(), "achievement", -15085966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegionCode", argTypes, term29714, args);
    }

};


