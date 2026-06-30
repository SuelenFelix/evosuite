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

public class UserWebOption_getUser_142220424925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43531;

    public UserWebOption_getUser_142220424925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43531 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        setLongField(term43531, term43531.getClass(), "id", 0L);
        setField(term43531, term43531.getClass(), "user", null);
        setBooleanField(term43531, term43531.getClass(), "isNetMember", false);
        setIntField(term43531, term43531.getClass(), "dispRate", 0);
        setIntField(term43531, term43531.getClass(), "dispJudgeStyle", 0);
        setIntField(term43531, term43531.getClass(), "dispRank", 0);
        setIntField(term43531, term43531.getClass(), "dispHomeRanker", 0);
        setIntField(term43531, term43531.getClass(), "dispTotalLv", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term43531, args);
    }

};


