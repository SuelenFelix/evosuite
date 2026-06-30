package icu.samnyan.aqua.sega.general.model.response;

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
import static icu.samnyan.aqua.sega.general.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserRecentRating_getScore_15513428293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79;

    public UserRecentRating_getScore_15513428293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.response.UserRecentRating"));
        setIntField(term79, term79.getClass(), "musicId", -1339778481);
        setIntField(term79, term79.getClass(), "difficultId", 1725571209);
        setField(term79, term79.getClass(), "romVersionCode", "xxtlPwDYFs");
        setIntField(term79, term79.getClass(), "score", -522618178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.general.model.response.UserRecentRating");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getScore", argTypes, term79, args);
    }

};


