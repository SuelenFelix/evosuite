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
import java.lang.Integer;

public class UserTechEventRankingItem_setTotalPlatinumScore_15085874369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3667;
     Object term3684;

    public UserTechEventRankingItem_setTotalPlatinumScore_15085874369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3667 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserTechEventRankingItem"));
        setIntField(term3667, term3667.getClass(), "eventId", -1623489521);
        setField(term3667, term3667.getClass(), "date", "GTmoNrziyc");
        setIntField(term3667, term3667.getClass(), "rank", 1179937517);
        setIntField(term3667, term3667.getClass(), "totalTechScore", 200150950);
        setIntField(term3667, term3667.getClass(), "totalPlatinumScore", -366198044);
        term3684 = new Integer(-1350380769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserTechEventRankingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3684;
        callMethod(klass, "setTotalPlatinumScore", argTypes, term3667, args);
    }

};


