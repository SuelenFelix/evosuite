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

public class UserGhost_getCourseRank_8081243976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29377;

    public UserGhost_getCourseRank_8081243976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term29416 = new ArrayList();
        term29377 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term29377, term29377.getClass(), "name", "GXoLEdKEIe");
        setIntField(term29377, term29377.getClass(), "iconId", 1966881264);
        setIntField(term29377, term29377.getClass(), "plateId", -1707655562);
        setIntField(term29377, term29377.getClass(), "titleId", 1525815085);
        setIntField(term29377, term29377.getClass(), "rate", 1785476260);
        setIntField(term29377, term29377.getClass(), "udemaeRate", -655035002);
        setIntField(term29377, term29377.getClass(), "courseRank", 1841475189);
        setIntField(term29377, term29377.getClass(), "classRank", -456566581);
        setIntField(term29377, term29377.getClass(), "classValue", 2114761003);
        setField(term29377, term29377.getClass(), "playDatetime", "EugWXkztim");
        setIntField(term29377, term29377.getClass(), "shopId", -1128091158);
        setIntField(term29377, term29377.getClass(), "regionCode", 380526008);
        setIntField(term29377, term29377.getClass(), "typeId", -285065370);
        setIntField(term29377, term29377.getClass(), "musicId", -1542216721);
        setIntField(term29377, term29377.getClass(), "difficulty", -311300330);
        setIntField(term29377, term29377.getClass(), "version", 1160936971);
        setField(term29377, term29377.getClass(), "resultBitList", term29416);
        setIntField(term29377, term29377.getClass(), "resultNum", 1258846008);
        setIntField(term29377, term29377.getClass(), "achievement", 702866958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCourseRank", argTypes, term29377, args);
    }

};


