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
import java.lang.Integer;

public class UserTechEvent_setTotalPlatinumScore_137538716436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361616;
     Object term361623;

    public UserTechEvent_setTotalPlatinumScore_137538716436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361616 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        setLongField(term361616, term361616.getClass(), "id", 0L);
        setField(term361616, term361616.getClass(), "user", null);
        setIntField(term361616, term361616.getClass(), "eventId", 0);
        setIntField(term361616, term361616.getClass(), "totalTechScore", 0);
        setIntField(term361616, term361616.getClass(), "totalPlatinumScore", 0);
        setField(term361616, term361616.getClass(), "techRecordDate", null);
        setBooleanField(term361616, term361616.getClass(), "isRankingRewarded", false);
        setBooleanField(term361616, term361616.getClass(), "isTotalTechNewRecord", false);
        term361623 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term361623;
        callMethod(klass, "setTotalPlatinumScore", argTypes, term361616, args);
    }

};


