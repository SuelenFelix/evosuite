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
import java.lang.Boolean;

public class UserTechEvent_setTotalTechNewRecord_137051307139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361641;
     Object term361648;

    public UserTechEvent_setTotalTechNewRecord_137051307139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361641 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        setLongField(term361641, term361641.getClass(), "id", 0L);
        setField(term361641, term361641.getClass(), "user", null);
        setIntField(term361641, term361641.getClass(), "eventId", 0);
        setIntField(term361641, term361641.getClass(), "totalTechScore", 0);
        setIntField(term361641, term361641.getClass(), "totalPlatinumScore", 0);
        setField(term361641, term361641.getClass(), "techRecordDate", null);
        setBooleanField(term361641, term361641.getClass(), "isRankingRewarded", false);
        setBooleanField(term361641, term361641.getClass(), "isTotalTechNewRecord", false);
        term361648 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term361648;
        callMethod(klass, "setTotalTechNewRecord", argTypes, term361641, args);
    }

};


