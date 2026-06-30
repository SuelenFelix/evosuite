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

public class UserWebOption_isNetMember_106587499326 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43539;

    public UserWebOption_isNetMember_106587499326() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43539 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        setLongField(term43539, term43539.getClass(), "id", 0L);
        setField(term43539, term43539.getClass(), "user", null);
        setBooleanField(term43539, term43539.getClass(), "isNetMember", false);
        setIntField(term43539, term43539.getClass(), "dispRate", 0);
        setIntField(term43539, term43539.getClass(), "dispJudgeStyle", 0);
        setIntField(term43539, term43539.getClass(), "dispRank", 0);
        setIntField(term43539, term43539.getClass(), "dispHomeRanker", 0);
        setIntField(term43539, term43539.getClass(), "dispTotalLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isNetMember", argTypes, term43539, args);
    }

};


