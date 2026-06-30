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

public class UserTechEvent_getTotalTechScore_196684097627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361547;

    public UserTechEvent_getTotalTechScore_196684097627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361547 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        setLongField(term361547, term361547.getClass(), "id", 0L);
        setField(term361547, term361547.getClass(), "user", null);
        setIntField(term361547, term361547.getClass(), "eventId", 0);
        setIntField(term361547, term361547.getClass(), "totalTechScore", 0);
        setIntField(term361547, term361547.getClass(), "totalPlatinumScore", 0);
        setField(term361547, term361547.getClass(), "techRecordDate", null);
        setBooleanField(term361547, term361547.getClass(), "isRankingRewarded", false);
        setBooleanField(term361547, term361547.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalTechScore", argTypes, term361547, args);
    }

};


