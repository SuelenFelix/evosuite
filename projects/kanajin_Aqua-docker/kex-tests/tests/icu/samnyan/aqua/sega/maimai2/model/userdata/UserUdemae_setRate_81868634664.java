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

public class UserUdemae_setRate_81868634664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119958;
     Object term119976;

    public UserUdemae_setRate_81868634664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119958 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        setLongField(term119958, term119958.getClass(), "id", 0L);
        setField(term119958, term119958.getClass(), "user", null);
        setIntField(term119958, term119958.getClass(), "rate", 0);
        setIntField(term119958, term119958.getClass(), "maxRate", 0);
        setIntField(term119958, term119958.getClass(), "classValue", 0);
        setIntField(term119958, term119958.getClass(), "maxClassValue", 0);
        setIntField(term119958, term119958.getClass(), "totalWinNum", 0);
        setIntField(term119958, term119958.getClass(), "totalLoseNum", 0);
        setIntField(term119958, term119958.getClass(), "maxWinNum", 0);
        setIntField(term119958, term119958.getClass(), "maxLoseNum", 0);
        setIntField(term119958, term119958.getClass(), "winNum", 0);
        setIntField(term119958, term119958.getClass(), "loseNum", 0);
        setIntField(term119958, term119958.getClass(), "npcTotalWinNum", 0);
        setIntField(term119958, term119958.getClass(), "npcTotalLoseNum", 0);
        setIntField(term119958, term119958.getClass(), "npcMaxWinNum", 0);
        setIntField(term119958, term119958.getClass(), "npcMaxLoseNum", 0);
        setIntField(term119958, term119958.getClass(), "npcWinNum", 0);
        setIntField(term119958, term119958.getClass(), "npcLoseNum", 0);
        term119976 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term119976;
        callMethod(klass, "setRate", argTypes, term119958, args);
    }

};


