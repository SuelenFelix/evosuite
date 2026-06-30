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

public class UserUdemae_setMaxClassValue_200250728167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120018;
     Object term120036;

    public UserUdemae_setMaxClassValue_200250728167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120018 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        setLongField(term120018, term120018.getClass(), "id", 0L);
        setField(term120018, term120018.getClass(), "user", null);
        setIntField(term120018, term120018.getClass(), "rate", 0);
        setIntField(term120018, term120018.getClass(), "maxRate", 0);
        setIntField(term120018, term120018.getClass(), "classValue", 0);
        setIntField(term120018, term120018.getClass(), "maxClassValue", 0);
        setIntField(term120018, term120018.getClass(), "totalWinNum", 0);
        setIntField(term120018, term120018.getClass(), "totalLoseNum", 0);
        setIntField(term120018, term120018.getClass(), "maxWinNum", 0);
        setIntField(term120018, term120018.getClass(), "maxLoseNum", 0);
        setIntField(term120018, term120018.getClass(), "winNum", 0);
        setIntField(term120018, term120018.getClass(), "loseNum", 0);
        setIntField(term120018, term120018.getClass(), "npcTotalWinNum", 0);
        setIntField(term120018, term120018.getClass(), "npcTotalLoseNum", 0);
        setIntField(term120018, term120018.getClass(), "npcMaxWinNum", 0);
        setIntField(term120018, term120018.getClass(), "npcMaxLoseNum", 0);
        setIntField(term120018, term120018.getClass(), "npcWinNum", 0);
        setIntField(term120018, term120018.getClass(), "npcLoseNum", 0);
        term120036 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term120036;
        callMethod(klass, "setMaxClassValue", argTypes, term120018, args);
    }

};


