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

public class UserFriendSeasonRanking_getPoint_47784263427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28799;

    public UserFriendSeasonRanking_getPoint_47784263427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28799 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        setLongField(term28799, term28799.getClass(), "id", 0L);
        setField(term28799, term28799.getClass(), "user", null);
        setIntField(term28799, term28799.getClass(), "seasonId", 0);
        setIntField(term28799, term28799.getClass(), "point", 0);
        setIntField(term28799, term28799.getClass(), "rank", 0);
        setBooleanField(term28799, term28799.getClass(), "rewardGet", false);
        setField(term28799, term28799.getClass(), "userName", null);
        setField(term28799, term28799.getClass(), "recordDate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term28799, args);
    }

};


