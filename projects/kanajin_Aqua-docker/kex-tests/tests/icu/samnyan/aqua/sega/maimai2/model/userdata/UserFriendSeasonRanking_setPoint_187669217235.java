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

public class UserFriendSeasonRanking_setPoint_187669217235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28851;
     Object term28857;

    public UserFriendSeasonRanking_setPoint_187669217235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28851 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        setLongField(term28851, term28851.getClass(), "id", 0L);
        setField(term28851, term28851.getClass(), "user", null);
        setIntField(term28851, term28851.getClass(), "seasonId", 0);
        setIntField(term28851, term28851.getClass(), "point", 0);
        setIntField(term28851, term28851.getClass(), "rank", 0);
        setBooleanField(term28851, term28851.getClass(), "rewardGet", false);
        setField(term28851, term28851.getClass(), "userName", null);
        setField(term28851, term28851.getClass(), "recordDate", null);
        term28857 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term28857;
        callMethod(klass, "setPoint", argTypes, term28851, args);
    }

};


