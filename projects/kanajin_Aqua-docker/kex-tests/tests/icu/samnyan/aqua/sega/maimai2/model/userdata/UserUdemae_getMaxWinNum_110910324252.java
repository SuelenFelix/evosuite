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

public class UserUdemae_getMaxWinNum_110910324252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119740;

    public UserUdemae_getMaxWinNum_110910324252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119740 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        setLongField(term119740, term119740.getClass(), "id", 0L);
        setField(term119740, term119740.getClass(), "user", null);
        setIntField(term119740, term119740.getClass(), "rate", 0);
        setIntField(term119740, term119740.getClass(), "maxRate", 0);
        setIntField(term119740, term119740.getClass(), "classValue", 0);
        setIntField(term119740, term119740.getClass(), "maxClassValue", 0);
        setIntField(term119740, term119740.getClass(), "totalWinNum", 0);
        setIntField(term119740, term119740.getClass(), "totalLoseNum", 0);
        setIntField(term119740, term119740.getClass(), "maxWinNum", 0);
        setIntField(term119740, term119740.getClass(), "maxLoseNum", 0);
        setIntField(term119740, term119740.getClass(), "winNum", 0);
        setIntField(term119740, term119740.getClass(), "loseNum", 0);
        setIntField(term119740, term119740.getClass(), "npcTotalWinNum", 0);
        setIntField(term119740, term119740.getClass(), "npcTotalLoseNum", 0);
        setIntField(term119740, term119740.getClass(), "npcMaxWinNum", 0);
        setIntField(term119740, term119740.getClass(), "npcMaxLoseNum", 0);
        setIntField(term119740, term119740.getClass(), "npcWinNum", 0);
        setIntField(term119740, term119740.getClass(), "npcLoseNum", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxWinNum", argTypes, term119740, args);
    }

};


