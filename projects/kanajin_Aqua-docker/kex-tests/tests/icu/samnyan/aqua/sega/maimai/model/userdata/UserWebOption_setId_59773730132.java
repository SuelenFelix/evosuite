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
import java.lang.Long;

public class UserWebOption_setId_59773730132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43587;
     Object term43595;

    public UserWebOption_setId_59773730132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43587 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        setLongField(term43587, term43587.getClass(), "id", 0L);
        setField(term43587, term43587.getClass(), "user", null);
        setBooleanField(term43587, term43587.getClass(), "isNetMember", false);
        setIntField(term43587, term43587.getClass(), "dispRate", 0);
        setIntField(term43587, term43587.getClass(), "dispJudgeStyle", 0);
        setIntField(term43587, term43587.getClass(), "dispRank", 0);
        setIntField(term43587, term43587.getClass(), "dispHomeRanker", 0);
        setIntField(term43587, term43587.getClass(), "dispTotalLv", 0);
        term43595 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term43595;
        callMethod(klass, "setId", argTypes, term43587, args);
    }

};


