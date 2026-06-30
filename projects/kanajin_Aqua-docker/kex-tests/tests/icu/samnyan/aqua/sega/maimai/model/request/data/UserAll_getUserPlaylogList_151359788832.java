package icu.samnyan.aqua.sega.maimai.model.request.data;

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
import static icu.samnyan.aqua.sega.maimai.model.request.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserAll_getUserPlaylogList_151359788832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38337;

    public UserAll_getUserPlaylogList_151359788832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38337 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.request.data.UserAll"));
        setField(term38337, term38337.getClass(), "userPlaylogList", null);
        setField(term38337, term38337.getClass(), "userData", null);
        setField(term38337, term38337.getClass(), "userOption", null);
        setField(term38337, term38337.getClass(), "userId", null);
        setField(term38337, term38337.getClass(), "userWebOption", null);
        setField(term38337, term38337.getClass(), "userMusicDetailList", null);
        setField(term38337, term38337.getClass(), "userItemList", null);
        setField(term38337, term38337.getClass(), "userRecentRatingList", null);
        setField(term38337, term38337.getClass(), "userActivityList", null);
        setField(term38337, term38337.getClass(), "userGradeStatusList", null);
        setField(term38337, term38337.getClass(), "userBossList", null);
        setField(term38337, term38337.getClass(), "userCharacterList", null);
        setField(term38337, term38337.getClass(), "isNewCharacterList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.request.data.UserAll");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserPlaylogList", argTypes, term38337, args);
    }

};


