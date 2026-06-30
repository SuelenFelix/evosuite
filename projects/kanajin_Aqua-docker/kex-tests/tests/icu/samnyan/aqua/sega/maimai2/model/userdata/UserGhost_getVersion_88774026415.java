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

public class UserGhost_getVersion_88774026415 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29998;

    public UserGhost_getVersion_88774026415() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term30039 = new Byte((byte) 100);
        Byte term30041 = new Byte((byte) 106);
        Byte term30043 = new Byte((byte) -57);
        Byte term30045 = new Byte((byte) -103);
        Byte term30047 = new Byte((byte) 98);
        ArrayList term30037 = new ArrayList();
        ((ArrayList) term30037).add(term30039);
        ((ArrayList) term30037).add(term30041);
        ((ArrayList) term30037).add(term30043);
        ((ArrayList) term30037).add(term30045);
        ((ArrayList) term30037).add(term30047);
        term29998 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term29998, term29998.getClass(), "name", "ewbQRtustW");
        setIntField(term29998, term29998.getClass(), "iconId", 1120685189);
        setIntField(term29998, term29998.getClass(), "plateId", 654585209);
        setIntField(term29998, term29998.getClass(), "titleId", -1661685401);
        setIntField(term29998, term29998.getClass(), "rate", 1427434947);
        setIntField(term29998, term29998.getClass(), "udemaeRate", 2130990985);
        setIntField(term29998, term29998.getClass(), "courseRank", 523197189);
        setIntField(term29998, term29998.getClass(), "classRank", 658684460);
        setIntField(term29998, term29998.getClass(), "classValue", 2073367039);
        setField(term29998, term29998.getClass(), "playDatetime", "cABEHYBnys");
        setIntField(term29998, term29998.getClass(), "shopId", -365877126);
        setIntField(term29998, term29998.getClass(), "regionCode", 251018856);
        setIntField(term29998, term29998.getClass(), "typeId", -1965331640);
        setIntField(term29998, term29998.getClass(), "musicId", -514392629);
        setIntField(term29998, term29998.getClass(), "difficulty", -166633123);
        setIntField(term29998, term29998.getClass(), "version", 373110517);
        setField(term29998, term29998.getClass(), "resultBitList", term30037);
        setIntField(term29998, term29998.getClass(), "resultNum", -1632703926);
        setIntField(term29998, term29998.getClass(), "achievement", -1031499401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVersion", argTypes, term29998, args);
    }

};


