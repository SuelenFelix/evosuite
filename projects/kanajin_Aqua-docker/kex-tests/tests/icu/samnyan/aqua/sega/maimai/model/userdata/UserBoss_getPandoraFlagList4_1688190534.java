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

public class UserBoss_getPandoraFlagList4_1688190534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96423;

    public UserBoss_getPandoraFlagList4_1688190534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96423 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        setLongField(term96423, term96423.getClass(), "id", 0L);
        setField(term96423, term96423.getClass(), "user", null);
        setLongField(term96423, term96423.getClass(), "pandoraFlagList0", 0L);
        setLongField(term96423, term96423.getClass(), "pandoraFlagList1", 0L);
        setLongField(term96423, term96423.getClass(), "pandoraFlagList2", 0L);
        setLongField(term96423, term96423.getClass(), "pandoraFlagList3", 0L);
        setLongField(term96423, term96423.getClass(), "pandoraFlagList4", 0L);
        setLongField(term96423, term96423.getClass(), "pandoraFlagList5", 0L);
        setLongField(term96423, term96423.getClass(), "pandoraFlagList6", 0L);
        setLongField(term96423, term96423.getClass(), "emblemFlagList", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPandoraFlagList4", argTypes, term96423, args);
    }

};


