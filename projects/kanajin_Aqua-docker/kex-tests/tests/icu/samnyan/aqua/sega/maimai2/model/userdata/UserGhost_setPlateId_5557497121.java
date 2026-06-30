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

public class UserGhost_setPlateId_5557497121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30464;
     Object term30511;

    public UserGhost_setPlateId_5557497121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term30505 = new Byte((byte) 14);
        ArrayList term30503 = new ArrayList();
        ((ArrayList) term30503).add(term30505);
        term30464 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term30464, term30464.getClass(), "name", "xzGnrvbExX");
        setIntField(term30464, term30464.getClass(), "iconId", 335030203);
        setIntField(term30464, term30464.getClass(), "plateId", -474014477);
        setIntField(term30464, term30464.getClass(), "titleId", 1610419467);
        setIntField(term30464, term30464.getClass(), "rate", 1155135931);
        setIntField(term30464, term30464.getClass(), "udemaeRate", -636910567);
        setIntField(term30464, term30464.getClass(), "courseRank", 1896114203);
        setIntField(term30464, term30464.getClass(), "classRank", 1045745470);
        setIntField(term30464, term30464.getClass(), "classValue", 892741901);
        setField(term30464, term30464.getClass(), "playDatetime", "LFZNDELxUZ");
        setIntField(term30464, term30464.getClass(), "shopId", -1724900201);
        setIntField(term30464, term30464.getClass(), "regionCode", -758523003);
        setIntField(term30464, term30464.getClass(), "typeId", 1567184195);
        setIntField(term30464, term30464.getClass(), "musicId", 63595623);
        setIntField(term30464, term30464.getClass(), "difficulty", 1764150991);
        setIntField(term30464, term30464.getClass(), "version", 944653455);
        setField(term30464, term30464.getClass(), "resultBitList", term30503);
        setIntField(term30464, term30464.getClass(), "resultNum", -1819474400);
        setIntField(term30464, term30464.getClass(), "achievement", 783684648);
        term30511 = new Integer(553754005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30511;
        callMethod(klass, "setPlateId", argTypes, term30464, args);
    }

};


