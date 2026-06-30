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
import java.lang.Integer;

public class UserGhost_setPlateId_5557497165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32498;
     Object term32515;

    public UserGhost_setPlateId_5557497165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32498 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term32498, term32498.getClass(), "name", null);
        setIntField(term32498, term32498.getClass(), "iconId", 0);
        setIntField(term32498, term32498.getClass(), "plateId", 0);
        setIntField(term32498, term32498.getClass(), "titleId", 0);
        setIntField(term32498, term32498.getClass(), "rate", 0);
        setIntField(term32498, term32498.getClass(), "udemaeRate", 0);
        setIntField(term32498, term32498.getClass(), "courseRank", 0);
        setIntField(term32498, term32498.getClass(), "classRank", 0);
        setIntField(term32498, term32498.getClass(), "classValue", 0);
        setField(term32498, term32498.getClass(), "playDatetime", null);
        setIntField(term32498, term32498.getClass(), "shopId", 0);
        setIntField(term32498, term32498.getClass(), "regionCode", 0);
        setIntField(term32498, term32498.getClass(), "typeId", 0);
        setIntField(term32498, term32498.getClass(), "musicId", 0);
        setIntField(term32498, term32498.getClass(), "difficulty", 0);
        setIntField(term32498, term32498.getClass(), "version", 0);
        setField(term32498, term32498.getClass(), "resultBitList", null);
        setIntField(term32498, term32498.getClass(), "resultNum", 0);
        setIntField(term32498, term32498.getClass(), "achievement", 0);
        term32515 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term32515;
        callMethod(klass, "setPlateId", argTypes, term32498, args);
    }

};


