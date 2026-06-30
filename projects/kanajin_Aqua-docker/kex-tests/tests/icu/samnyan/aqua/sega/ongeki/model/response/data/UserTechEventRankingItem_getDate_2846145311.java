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

public class UserTechEventRankingItem_getDate_2846145311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3423;

    public UserTechEventRankingItem_getDate_2846145311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3423 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserTechEventRankingItem"));
        setIntField(term3423, term3423.getClass(), "eventId", 1017354215);
        setField(term3423, term3423.getClass(), "date", "PsMKIIEwdR");
        setIntField(term3423, term3423.getClass(), "rank", 695330987);
        setIntField(term3423, term3423.getClass(), "totalTechScore", -267289967);
        setIntField(term3423, term3423.getClass(), "totalPlatinumScore", 773432822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserTechEventRankingItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDate", argTypes, term3423, args);
    }

};


