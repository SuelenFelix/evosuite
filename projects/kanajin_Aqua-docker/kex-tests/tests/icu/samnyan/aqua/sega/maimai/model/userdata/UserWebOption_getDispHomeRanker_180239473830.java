package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserWebOption_getDispHomeRanker_180239473830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43571;

    public UserWebOption_getDispHomeRanker_180239473830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43571 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        setLongField(term43571, term43571.getClass(), "id", 0L);
        setField(term43571, term43571.getClass(), "user", null);
        setBooleanField(term43571, term43571.getClass(), "isNetMember", false);
        setIntField(term43571, term43571.getClass(), "dispRate", 0);
        setIntField(term43571, term43571.getClass(), "dispJudgeStyle", 0);
        setIntField(term43571, term43571.getClass(), "dispRank", 0);
        setIntField(term43571, term43571.getClass(), "dispHomeRanker", 0);
        setIntField(term43571, term43571.getClass(), "dispTotalLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispHomeRanker", argTypes, term43571, args);
    }

};


