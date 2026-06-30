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

public class UserTechEventRankingItem_getRank_152659619618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3846;

    public UserTechEventRankingItem_getRank_152659619618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3846 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserTechEventRankingItem"));
        setIntField(term3846, term3846.getClass(), "eventId", 0);
        setField(term3846, term3846.getClass(), "date", null);
        setIntField(term3846, term3846.getClass(), "rank", 0);
        setIntField(term3846, term3846.getClass(), "totalTechScore", 0);
        setIntField(term3846, term3846.getClass(), "totalPlatinumScore", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserTechEventRankingItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRank", argTypes, term3846, args);
    }

};


