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

public class UserUdemae_getMaxClassValue_136879910949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119686;

    public UserUdemae_getMaxClassValue_136879910949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119686 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        setLongField(term119686, term119686.getClass(), "id", 0L);
        setField(term119686, term119686.getClass(), "user", null);
        setIntField(term119686, term119686.getClass(), "rate", 0);
        setIntField(term119686, term119686.getClass(), "maxRate", 0);
        setIntField(term119686, term119686.getClass(), "classValue", 0);
        setIntField(term119686, term119686.getClass(), "maxClassValue", 0);
        setIntField(term119686, term119686.getClass(), "totalWinNum", 0);
        setIntField(term119686, term119686.getClass(), "totalLoseNum", 0);
        setIntField(term119686, term119686.getClass(), "maxWinNum", 0);
        setIntField(term119686, term119686.getClass(), "maxLoseNum", 0);
        setIntField(term119686, term119686.getClass(), "winNum", 0);
        setIntField(term119686, term119686.getClass(), "loseNum", 0);
        setIntField(term119686, term119686.getClass(), "npcTotalWinNum", 0);
        setIntField(term119686, term119686.getClass(), "npcTotalLoseNum", 0);
        setIntField(term119686, term119686.getClass(), "npcMaxWinNum", 0);
        setIntField(term119686, term119686.getClass(), "npcMaxLoseNum", 0);
        setIntField(term119686, term119686.getClass(), "npcWinNum", 0);
        setIntField(term119686, term119686.getClass(), "npcLoseNum", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxClassValue", argTypes, term119686, args);
    }

};


