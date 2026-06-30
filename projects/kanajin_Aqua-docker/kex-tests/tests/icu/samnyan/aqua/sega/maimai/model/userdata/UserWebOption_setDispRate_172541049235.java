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
import java.lang.Integer;

public class UserWebOption_setDispRate_172541049235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43615;
     Object term43623;

    public UserWebOption_setDispRate_172541049235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43615 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        setLongField(term43615, term43615.getClass(), "id", 0L);
        setField(term43615, term43615.getClass(), "user", null);
        setBooleanField(term43615, term43615.getClass(), "isNetMember", false);
        setIntField(term43615, term43615.getClass(), "dispRate", 0);
        setIntField(term43615, term43615.getClass(), "dispJudgeStyle", 0);
        setIntField(term43615, term43615.getClass(), "dispRank", 0);
        setIntField(term43615, term43615.getClass(), "dispHomeRanker", 0);
        setIntField(term43615, term43615.getClass(), "dispTotalLv", 0);
        term43623 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43623;
        callMethod(klass, "setDispRate", argTypes, term43615, args);
    }

};


