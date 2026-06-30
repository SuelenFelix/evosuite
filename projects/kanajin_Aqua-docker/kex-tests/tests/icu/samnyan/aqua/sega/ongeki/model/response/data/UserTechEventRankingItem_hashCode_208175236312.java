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

public class UserTechEventRankingItem_hashCode_208175236312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3752;

    public UserTechEventRankingItem_hashCode_208175236312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3752 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserTechEventRankingItem"));
        setIntField(term3752, term3752.getClass(), "eventId", -545275970);
        setField(term3752, term3752.getClass(), "date", "fLRqcTSfzF");
        setIntField(term3752, term3752.getClass(), "rank", 1355471365);
        setIntField(term3752, term3752.getClass(), "totalTechScore", -1746962742);
        setIntField(term3752, term3752.getClass(), "totalPlatinumScore", -575810668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.UserTechEventRankingItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term3752, args);
    }

};


