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

public class UserGhost_getMusicId_90917168013 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29860;

    public UserGhost_getMusicId_90917168013() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Byte term29901 = new Byte((byte) 69);
        Byte term29903 = new Byte((byte) -74);
        ArrayList term29899 = new ArrayList();
        ((ArrayList) term29899).add(term29901);
        ((ArrayList) term29899).add(term29903);
        term29860 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost"));
        setField(term29860, term29860.getClass(), "name", "iSPirUEhXs");
        setIntField(term29860, term29860.getClass(), "iconId", 749289511);
        setIntField(term29860, term29860.getClass(), "plateId", -414437174);
        setIntField(term29860, term29860.getClass(), "titleId", -860227615);
        setIntField(term29860, term29860.getClass(), "rate", -1696192372);
        setIntField(term29860, term29860.getClass(), "udemaeRate", 1239525687);
        setIntField(term29860, term29860.getClass(), "courseRank", 1496590861);
        setIntField(term29860, term29860.getClass(), "classRank", 1046957508);
        setIntField(term29860, term29860.getClass(), "classValue", -553500478);
        setField(term29860, term29860.getClass(), "playDatetime", "WWyLFmYpAy");
        setIntField(term29860, term29860.getClass(), "shopId", 841910530);
        setIntField(term29860, term29860.getClass(), "regionCode", -1415371559);
        setIntField(term29860, term29860.getClass(), "typeId", -2083858949);
        setIntField(term29860, term29860.getClass(), "musicId", -1878319299);
        setIntField(term29860, term29860.getClass(), "difficulty", -690862846);
        setIntField(term29860, term29860.getClass(), "version", 805027262);
        setField(term29860, term29860.getClass(), "resultBitList", term29899);
        setIntField(term29860, term29860.getClass(), "resultNum", 717389178);
        setIntField(term29860, term29860.getClass(), "achievement", -1265226052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGhost");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term29860, args);
    }

};


