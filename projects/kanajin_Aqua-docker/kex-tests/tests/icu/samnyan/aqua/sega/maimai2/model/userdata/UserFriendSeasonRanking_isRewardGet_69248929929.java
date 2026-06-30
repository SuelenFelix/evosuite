package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserFriendSeasonRanking_isRewardGet_69248929929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28811;

    public UserFriendSeasonRanking_isRewardGet_69248929929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28811 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        setLongField(term28811, term28811.getClass(), "id", 0L);
        setField(term28811, term28811.getClass(), "user", null);
        setIntField(term28811, term28811.getClass(), "seasonId", 0);
        setIntField(term28811, term28811.getClass(), "point", 0);
        setIntField(term28811, term28811.getClass(), "rank", 0);
        setBooleanField(term28811, term28811.getClass(), "rewardGet", false);
        setField(term28811, term28811.getClass(), "userName", null);
        setField(term28811, term28811.getClass(), "recordDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isRewardGet", argTypes, term28811, args);
    }

};


