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
import java.lang.Integer;

public class UserFriendSeasonRanking_setSeasonId_84739027834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28843;
     Object term28849;

    public UserFriendSeasonRanking_setSeasonId_84739027834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28843 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        setLongField(term28843, term28843.getClass(), "id", 0L);
        setField(term28843, term28843.getClass(), "user", null);
        setIntField(term28843, term28843.getClass(), "seasonId", 0);
        setIntField(term28843, term28843.getClass(), "point", 0);
        setIntField(term28843, term28843.getClass(), "rank", 0);
        setBooleanField(term28843, term28843.getClass(), "rewardGet", false);
        setField(term28843, term28843.getClass(), "userName", null);
        setField(term28843, term28843.getClass(), "recordDate", null);
        term28849 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28849;
        callMethod(klass, "setSeasonId", argTypes, term28843, args);
    }

};


