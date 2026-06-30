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

public class UserTechEvent_setEventId_212122674134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361598;
     Object term361605;

    public UserTechEvent_setEventId_212122674134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361598 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        setLongField(term361598, term361598.getClass(), "id", 0L);
        setField(term361598, term361598.getClass(), "user", null);
        setIntField(term361598, term361598.getClass(), "eventId", 0);
        setIntField(term361598, term361598.getClass(), "totalTechScore", 0);
        setIntField(term361598, term361598.getClass(), "totalPlatinumScore", 0);
        setField(term361598, term361598.getClass(), "techRecordDate", null);
        setBooleanField(term361598, term361598.getClass(), "isRankingRewarded", false);
        setBooleanField(term361598, term361598.getClass(), "isTotalTechNewRecord", false);
        term361605 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term361605;
        callMethod(klass, "setEventId", argTypes, term361598, args);
    }

};


