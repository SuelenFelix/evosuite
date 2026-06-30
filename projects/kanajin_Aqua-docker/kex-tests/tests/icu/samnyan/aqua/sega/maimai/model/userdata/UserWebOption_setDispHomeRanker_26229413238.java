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

public class UserWebOption_setDispHomeRanker_26229413238 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43645;
     Object term43653;

    public UserWebOption_setDispHomeRanker_26229413238() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43645 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        setLongField(term43645, term43645.getClass(), "id", 0L);
        setField(term43645, term43645.getClass(), "user", null);
        setBooleanField(term43645, term43645.getClass(), "isNetMember", false);
        setIntField(term43645, term43645.getClass(), "dispRate", 0);
        setIntField(term43645, term43645.getClass(), "dispJudgeStyle", 0);
        setIntField(term43645, term43645.getClass(), "dispRank", 0);
        setIntField(term43645, term43645.getClass(), "dispHomeRanker", 0);
        setIntField(term43645, term43645.getClass(), "dispTotalLv", 0);
        term43653 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term43653;
        callMethod(klass, "setDispHomeRanker", argTypes, term43645, args);
    }

};


