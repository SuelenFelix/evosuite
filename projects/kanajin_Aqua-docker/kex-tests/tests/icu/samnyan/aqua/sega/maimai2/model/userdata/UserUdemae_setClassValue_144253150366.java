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

public class UserUdemae_setClassValue_144253150366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119998;
     Object term120016;

    public UserUdemae_setClassValue_144253150366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119998 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        setLongField(term119998, term119998.getClass(), "id", 0L);
        setField(term119998, term119998.getClass(), "user", null);
        setIntField(term119998, term119998.getClass(), "rate", 0);
        setIntField(term119998, term119998.getClass(), "maxRate", 0);
        setIntField(term119998, term119998.getClass(), "classValue", 0);
        setIntField(term119998, term119998.getClass(), "maxClassValue", 0);
        setIntField(term119998, term119998.getClass(), "totalWinNum", 0);
        setIntField(term119998, term119998.getClass(), "totalLoseNum", 0);
        setIntField(term119998, term119998.getClass(), "maxWinNum", 0);
        setIntField(term119998, term119998.getClass(), "maxLoseNum", 0);
        setIntField(term119998, term119998.getClass(), "winNum", 0);
        setIntField(term119998, term119998.getClass(), "loseNum", 0);
        setIntField(term119998, term119998.getClass(), "npcTotalWinNum", 0);
        setIntField(term119998, term119998.getClass(), "npcTotalLoseNum", 0);
        setIntField(term119998, term119998.getClass(), "npcMaxWinNum", 0);
        setIntField(term119998, term119998.getClass(), "npcMaxLoseNum", 0);
        setIntField(term119998, term119998.getClass(), "npcWinNum", 0);
        setIntField(term119998, term119998.getClass(), "npcLoseNum", 0);
        term120016 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term120016;
        callMethod(klass, "setClassValue", argTypes, term119998, args);
    }

};


