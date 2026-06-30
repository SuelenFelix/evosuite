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
import java.lang.Long;

public class UserFriendSeasonRanking_setId_182987113932 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28829;
     Object term28835;

    public UserFriendSeasonRanking_setId_182987113932() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28829 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        setLongField(term28829, term28829.getClass(), "id", 0L);
        setField(term28829, term28829.getClass(), "user", null);
        setIntField(term28829, term28829.getClass(), "seasonId", 0);
        setIntField(term28829, term28829.getClass(), "point", 0);
        setIntField(term28829, term28829.getClass(), "rank", 0);
        setBooleanField(term28829, term28829.getClass(), "rewardGet", false);
        setField(term28829, term28829.getClass(), "userName", null);
        setField(term28829, term28829.getClass(), "recordDate", null);
        term28835 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term28835;
        callMethod(klass, "setId", argTypes, term28829, args);
    }

};


