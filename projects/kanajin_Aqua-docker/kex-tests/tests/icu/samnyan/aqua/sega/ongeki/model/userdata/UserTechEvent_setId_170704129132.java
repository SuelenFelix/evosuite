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
import java.lang.Long;

public class UserTechEvent_setId_170704129132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361582;
     Object term361589;

    public UserTechEvent_setId_170704129132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361582 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        setLongField(term361582, term361582.getClass(), "id", 0L);
        setField(term361582, term361582.getClass(), "user", null);
        setIntField(term361582, term361582.getClass(), "eventId", 0);
        setIntField(term361582, term361582.getClass(), "totalTechScore", 0);
        setIntField(term361582, term361582.getClass(), "totalPlatinumScore", 0);
        setField(term361582, term361582.getClass(), "techRecordDate", null);
        setBooleanField(term361582, term361582.getClass(), "isRankingRewarded", false);
        setBooleanField(term361582, term361582.getClass(), "isTotalTechNewRecord", false);
        term361589 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term361589;
        callMethod(klass, "setId", argTypes, term361582, args);
    }

};


