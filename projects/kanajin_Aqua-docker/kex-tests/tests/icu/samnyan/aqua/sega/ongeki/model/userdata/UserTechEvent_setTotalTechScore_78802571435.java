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

public class UserTechEvent_setTotalTechScore_78802571435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361607;
     Object term361614;

    public UserTechEvent_setTotalTechScore_78802571435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361607 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        setLongField(term361607, term361607.getClass(), "id", 0L);
        setField(term361607, term361607.getClass(), "user", null);
        setIntField(term361607, term361607.getClass(), "eventId", 0);
        setIntField(term361607, term361607.getClass(), "totalTechScore", 0);
        setIntField(term361607, term361607.getClass(), "totalPlatinumScore", 0);
        setField(term361607, term361607.getClass(), "techRecordDate", null);
        setBooleanField(term361607, term361607.getClass(), "isRankingRewarded", false);
        setBooleanField(term361607, term361607.getClass(), "isTotalTechNewRecord", false);
        term361614 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term361614;
        callMethod(klass, "setTotalTechScore", argTypes, term361607, args);
    }

};


