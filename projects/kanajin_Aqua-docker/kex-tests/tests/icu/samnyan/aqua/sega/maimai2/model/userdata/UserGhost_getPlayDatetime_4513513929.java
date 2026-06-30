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

public class UserGhost_getPlayDatetime_4513513929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29582;

    public UserGhost_getPlayDatetime_4513513929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term29621 = new ArrayList();
        term29582 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term29582, term29582.getClass(), "name", "qAmVqwwdyf");
        setIntField(term29582, term29582.getClass(), "iconId", 334110739);
        setIntField(term29582, term29582.getClass(), "plateId", -1724529322);
        setIntField(term29582, term29582.getClass(), "titleId", 1843465187);
        setIntField(term29582, term29582.getClass(), "rate", 529595969);
        setIntField(term29582, term29582.getClass(), "udemaeRate", -1548733886);
        setIntField(term29582, term29582.getClass(), "courseRank", 1543539715);
        setIntField(term29582, term29582.getClass(), "classRank", 1744599521);
        setIntField(term29582, term29582.getClass(), "classValue", -985141153);
        setField(term29582, term29582.getClass(), "playDatetime", "IXPaHQnEUy");
        setIntField(term29582, term29582.getClass(), "shopId", -1983740361);
        setIntField(term29582, term29582.getClass(), "regionCode", -1494716341);
        setIntField(term29582, term29582.getClass(), "typeId", 816237851);
        setIntField(term29582, term29582.getClass(), "musicId", -604114341);
        setIntField(term29582, term29582.getClass(), "difficulty", 1146236760);
        setIntField(term29582, term29582.getClass(), "version", 985801789);
        setField(term29582, term29582.getClass(), "resultBitList", term29621);
        setIntField(term29582, term29582.getClass(), "resultNum", -1628536749);
        setIntField(term29582, term29582.getClass(), "achievement", -748022064);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayDatetime", argTypes, term29582, args);
    }

};


