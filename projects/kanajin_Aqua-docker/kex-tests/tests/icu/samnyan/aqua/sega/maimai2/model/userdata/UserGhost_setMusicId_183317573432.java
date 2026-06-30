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

public class UserGhost_setMusicId_183317573432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31319;
     Object term31364;

    public UserGhost_setMusicId_183317573432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term31358 = new ArrayList();
        term31319 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term31319, term31319.getClass(), "name", "raNzcEorkV");
        setIntField(term31319, term31319.getClass(), "iconId", 1116810901);
        setIntField(term31319, term31319.getClass(), "plateId", 1944430959);
        setIntField(term31319, term31319.getClass(), "titleId", 98801346);
        setIntField(term31319, term31319.getClass(), "rate", 2133290622);
        setIntField(term31319, term31319.getClass(), "udemaeRate", -164869996);
        setIntField(term31319, term31319.getClass(), "courseRank", 1415001538);
        setIntField(term31319, term31319.getClass(), "classRank", 1738077695);
        setIntField(term31319, term31319.getClass(), "classValue", -1351117314);
        setField(term31319, term31319.getClass(), "playDatetime", "nEgozCeoUr");
        setIntField(term31319, term31319.getClass(), "shopId", 1693588815);
        setIntField(term31319, term31319.getClass(), "regionCode", 1272985537);
        setIntField(term31319, term31319.getClass(), "typeId", -785719854);
        setIntField(term31319, term31319.getClass(), "musicId", -1542292796);
        setIntField(term31319, term31319.getClass(), "difficulty", 1892295932);
        setIntField(term31319, term31319.getClass(), "version", 1028855301);
        setField(term31319, term31319.getClass(), "resultBitList", term31358);
        setIntField(term31319, term31319.getClass(), "resultNum", -2075314038);
        setIntField(term31319, term31319.getClass(), "achievement", 1085906450);
        term31364 = new Integer(1892947629);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31364;
        callMethod(klass, "setMusicId", argTypes, term31319, args);
    }

};


