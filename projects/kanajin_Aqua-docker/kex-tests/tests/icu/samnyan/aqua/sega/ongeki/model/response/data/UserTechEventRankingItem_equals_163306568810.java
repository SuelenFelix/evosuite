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

public class UserTechEventRankingItem_equals_163306568810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3696;
     Object term3713;

    public UserTechEventRankingItem_equals_163306568810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3696 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserTechEventRankingItem"));
        setIntField(term3696, term3696.getClass(), "eventId", -1432215030);
        setField(term3696, term3696.getClass(), "date", "LvztehSlhM");
        setIntField(term3696, term3696.getClass(), "rank", 1233186320);
        setIntField(term3696, term3696.getClass(), "totalTechScore", -1303269101);
        setIntField(term3696, term3696.getClass(), "totalPlatinumScore", 1435572720);
        term3713 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserTechEventRankingItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term3713;
        callMethod(klass, "equals", argTypes, term3696, args);
    }

};


