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
import java.lang.Integer;

public class UserGhost_setAchievement_200857487337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31698;
     Object term31743;

    public UserGhost_setAchievement_200857487337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31737 = new ArrayList();
        term31698 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term31698, term31698.getClass(), "name", "GMyMhTZeDC");
        setIntField(term31698, term31698.getClass(), "iconId", 1816257051);
        setIntField(term31698, term31698.getClass(), "plateId", -541591725);
        setIntField(term31698, term31698.getClass(), "titleId", 498271385);
        setIntField(term31698, term31698.getClass(), "rate", 1418222767);
        setIntField(term31698, term31698.getClass(), "udemaeRate", 1862441057);
        setIntField(term31698, term31698.getClass(), "courseRank", 1889814117);
        setIntField(term31698, term31698.getClass(), "classRank", -1336297368);
        setIntField(term31698, term31698.getClass(), "classValue", 1535507114);
        setField(term31698, term31698.getClass(), "playDatetime", "KqQOTshBOL");
        setIntField(term31698, term31698.getClass(), "shopId", -1174141307);
        setIntField(term31698, term31698.getClass(), "regionCode", -1603957392);
        setIntField(term31698, term31698.getClass(), "typeId", -287005602);
        setIntField(term31698, term31698.getClass(), "musicId", 923353564);
        setIntField(term31698, term31698.getClass(), "difficulty", 2013647768);
        setIntField(term31698, term31698.getClass(), "version", 1706579212);
        setField(term31698, term31698.getClass(), "resultBitList", term31737);
        setIntField(term31698, term31698.getClass(), "resultNum", -1073781147);
        setIntField(term31698, term31698.getClass(), "achievement", 138913824);
        term31743 = new Integer(-637767208);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31743;
        callMethod(klass, "setAchievement", argTypes, term31698, args);
    }

};


