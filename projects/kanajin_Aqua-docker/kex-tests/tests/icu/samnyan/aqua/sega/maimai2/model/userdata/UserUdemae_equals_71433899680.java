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

public class UserUdemae_equals_71433899680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120278;

    public UserUdemae_equals_71433899680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120278 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        setLongField(term120278, term120278.getClass(), "id", 0L);
        setField(term120278, term120278.getClass(), "user", null);
        setIntField(term120278, term120278.getClass(), "rate", 0);
        setIntField(term120278, term120278.getClass(), "maxRate", 0);
        setIntField(term120278, term120278.getClass(), "classValue", 0);
        setIntField(term120278, term120278.getClass(), "maxClassValue", 0);
        setIntField(term120278, term120278.getClass(), "totalWinNum", 0);
        setIntField(term120278, term120278.getClass(), "totalLoseNum", 0);
        setIntField(term120278, term120278.getClass(), "maxWinNum", 0);
        setIntField(term120278, term120278.getClass(), "maxLoseNum", 0);
        setIntField(term120278, term120278.getClass(), "winNum", 0);
        setIntField(term120278, term120278.getClass(), "loseNum", 0);
        setIntField(term120278, term120278.getClass(), "npcTotalWinNum", 0);
        setIntField(term120278, term120278.getClass(), "npcTotalLoseNum", 0);
        setIntField(term120278, term120278.getClass(), "npcMaxWinNum", 0);
        setIntField(term120278, term120278.getClass(), "npcMaxLoseNum", 0);
        setIntField(term120278, term120278.getClass(), "npcWinNum", 0);
        setIntField(term120278, term120278.getClass(), "npcLoseNum", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term120278, args);
    }

};


