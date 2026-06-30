package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserTechEvent_setUser_11354894033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361591;

    public UserTechEvent_setUser_11354894033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361591 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        setLongField(term361591, term361591.getClass(), "id", 0L);
        setField(term361591, term361591.getClass(), "user", null);
        setIntField(term361591, term361591.getClass(), "eventId", 0);
        setIntField(term361591, term361591.getClass(), "totalTechScore", 0);
        setIntField(term361591, term361591.getClass(), "totalPlatinumScore", 0);
        setField(term361591, term361591.getClass(), "techRecordDate", null);
        setBooleanField(term361591, term361591.getClass(), "isRankingRewarded", false);
        setBooleanField(term361591, term361591.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term361591, args);
    }

};


