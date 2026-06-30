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

public class UserGhost_setName_80890520419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30292;

    public UserGhost_setName_80890520419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term30333 = new Byte((byte) 13);
        Byte term30335 = new Byte((byte) 44);
        Byte term30337 = new Byte((byte) -63);
        Byte term30339 = new Byte((byte) 15);
        Byte term30341 = new Byte((byte) 45);
        ArrayList term30331 = new ArrayList();
        ((ArrayList) term30331).add(term30333);
        ((ArrayList) term30331).add(term30335);
        ((ArrayList) term30331).add(term30337);
        ((ArrayList) term30331).add(term30339);
        ((ArrayList) term30331).add(term30341);
        term30292 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term30292, term30292.getClass(), "name", "aKaqvssiby");
        setIntField(term30292, term30292.getClass(), "iconId", 1717711536);
        setIntField(term30292, term30292.getClass(), "plateId", -606339607);
        setIntField(term30292, term30292.getClass(), "titleId", 800440712);
        setIntField(term30292, term30292.getClass(), "rate", -1976407622);
        setIntField(term30292, term30292.getClass(), "udemaeRate", -552996061);
        setIntField(term30292, term30292.getClass(), "courseRank", -153013117);
        setIntField(term30292, term30292.getClass(), "classRank", 712181359);
        setIntField(term30292, term30292.getClass(), "classValue", -1943255435);
        setField(term30292, term30292.getClass(), "playDatetime", "tTVbtBVAfo");
        setIntField(term30292, term30292.getClass(), "shopId", 868436312);
        setIntField(term30292, term30292.getClass(), "regionCode", 1737963071);
        setIntField(term30292, term30292.getClass(), "typeId", 6456997);
        setIntField(term30292, term30292.getClass(), "musicId", -797269627);
        setIntField(term30292, term30292.getClass(), "difficulty", -224331928);
        setIntField(term30292, term30292.getClass(), "version", -587857163);
        setField(term30292, term30292.getClass(), "resultBitList", term30331);
        setIntField(term30292, term30292.getClass(), "resultNum", -2018093075);
        setIntField(term30292, term30292.getClass(), "achievement", 135879009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "cjaaJUnNCR";
        callMethod(klass, "setName", argTypes, term30292, args);
    }

};


