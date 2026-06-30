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

public class UserGhost_setRate_107588539023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30600;
     Object term30657;

    public UserGhost_setRate_107588539023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term30641 = new Byte((byte) -101);
        Byte term30643 = new Byte((byte) 35);
        Byte term30645 = new Byte((byte) 66);
        Byte term30647 = new Byte((byte) 123);
        Byte term30649 = new Byte((byte) -5);
        Byte term30651 = new Byte((byte) 84);
        ArrayList term30639 = new ArrayList();
        ((ArrayList) term30639).add(term30641);
        ((ArrayList) term30639).add(term30643);
        ((ArrayList) term30639).add(term30645);
        ((ArrayList) term30639).add(term30647);
        ((ArrayList) term30639).add(term30649);
        ((ArrayList) term30639).add(term30651);
        term30600 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term30600, term30600.getClass(), "name", "HvbkjsQyDy");
        setIntField(term30600, term30600.getClass(), "iconId", -349448118);
        setIntField(term30600, term30600.getClass(), "plateId", 1938137872);
        setIntField(term30600, term30600.getClass(), "titleId", 1767604467);
        setIntField(term30600, term30600.getClass(), "rate", 1997859160);
        setIntField(term30600, term30600.getClass(), "udemaeRate", 1565529799);
        setIntField(term30600, term30600.getClass(), "courseRank", -1144608643);
        setIntField(term30600, term30600.getClass(), "classRank", -2020428308);
        setIntField(term30600, term30600.getClass(), "classValue", -226298436);
        setField(term30600, term30600.getClass(), "playDatetime", "wzSukELQFL");
        setIntField(term30600, term30600.getClass(), "shopId", -1570350431);
        setIntField(term30600, term30600.getClass(), "regionCode", -1378803474);
        setIntField(term30600, term30600.getClass(), "typeId", 699225584);
        setIntField(term30600, term30600.getClass(), "musicId", -577432675);
        setIntField(term30600, term30600.getClass(), "difficulty", -953072528);
        setIntField(term30600, term30600.getClass(), "version", 2011046892);
        setField(term30600, term30600.getClass(), "resultBitList", term30639);
        setIntField(term30600, term30600.getClass(), "resultNum", 466007219);
        setIntField(term30600, term30600.getClass(), "achievement", -2142979104);
        term30657 = new Integer(-1983330479);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term30657;
        callMethod(klass, "setRate", argTypes, term30600, args);
    }

};


