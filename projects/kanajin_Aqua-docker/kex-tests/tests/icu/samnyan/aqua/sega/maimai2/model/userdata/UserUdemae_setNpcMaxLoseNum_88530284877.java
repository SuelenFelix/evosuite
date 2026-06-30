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

public class UserUdemae_setNpcMaxLoseNum_88530284877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120218;
     Object term120236;

    public UserUdemae_setNpcMaxLoseNum_88530284877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120218 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        setLongField(term120218, term120218.getClass(), "id", 0L);
        setField(term120218, term120218.getClass(), "user", null);
        setIntField(term120218, term120218.getClass(), "rate", 0);
        setIntField(term120218, term120218.getClass(), "maxRate", 0);
        setIntField(term120218, term120218.getClass(), "classValue", 0);
        setIntField(term120218, term120218.getClass(), "maxClassValue", 0);
        setIntField(term120218, term120218.getClass(), "totalWinNum", 0);
        setIntField(term120218, term120218.getClass(), "totalLoseNum", 0);
        setIntField(term120218, term120218.getClass(), "maxWinNum", 0);
        setIntField(term120218, term120218.getClass(), "maxLoseNum", 0);
        setIntField(term120218, term120218.getClass(), "winNum", 0);
        setIntField(term120218, term120218.getClass(), "loseNum", 0);
        setIntField(term120218, term120218.getClass(), "npcTotalWinNum", 0);
        setIntField(term120218, term120218.getClass(), "npcTotalLoseNum", 0);
        setIntField(term120218, term120218.getClass(), "npcMaxWinNum", 0);
        setIntField(term120218, term120218.getClass(), "npcMaxLoseNum", 0);
        setIntField(term120218, term120218.getClass(), "npcWinNum", 0);
        setIntField(term120218, term120218.getClass(), "npcLoseNum", 0);
        term120236 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term120236;
        callMethod(klass, "setNpcMaxLoseNum", argTypes, term120218, args);
    }

};


