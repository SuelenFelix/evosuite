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

public class UserBoss_getUser_107747341129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96373;

    public UserBoss_getUser_107747341129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96373 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        setLongField(term96373, term96373.getClass(), "id", 0L);
        setField(term96373, term96373.getClass(), "user", null);
        setLongField(term96373, term96373.getClass(), "pandoraFlagList0", 0L);
        setLongField(term96373, term96373.getClass(), "pandoraFlagList1", 0L);
        setLongField(term96373, term96373.getClass(), "pandoraFlagList2", 0L);
        setLongField(term96373, term96373.getClass(), "pandoraFlagList3", 0L);
        setLongField(term96373, term96373.getClass(), "pandoraFlagList4", 0L);
        setLongField(term96373, term96373.getClass(), "pandoraFlagList5", 0L);
        setLongField(term96373, term96373.getClass(), "pandoraFlagList6", 0L);
        setLongField(term96373, term96373.getClass(), "emblemFlagList", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUser", argTypes, term96373, args);
    }

};


