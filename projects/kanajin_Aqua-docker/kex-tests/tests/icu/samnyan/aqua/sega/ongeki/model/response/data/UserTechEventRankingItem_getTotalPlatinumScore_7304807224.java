package icu.samnyan.aqua.sega.ongeki.model.response.data;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserTechEventRankingItem_getTotalPlatinumScore_7304807224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3504;

    public UserTechEventRankingItem_getTotalPlatinumScore_7304807224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3504 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserTechEventRankingItem"));
        setIntField(term3504, term3504.getClass(), "eventId", 1810754549);
        setField(term3504, term3504.getClass(), "date", "mUNcKUxghj");
        setIntField(term3504, term3504.getClass(), "rank", 338342107);
        setIntField(term3504, term3504.getClass(), "totalTechScore", -650288950);
        setIntField(term3504, term3504.getClass(), "totalPlatinumScore", 433039357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserTechEventRankingItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalPlatinumScore", argTypes, term3504, args);
    }

};


