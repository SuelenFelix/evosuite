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

public class UserBoss_getPandoraFlagList2_1688382732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96403;

    public UserBoss_getPandoraFlagList2_1688382732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96403 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        setLongField(term96403, term96403.getClass(), "id", 0L);
        setField(term96403, term96403.getClass(), "user", null);
        setLongField(term96403, term96403.getClass(), "pandoraFlagList0", 0L);
        setLongField(term96403, term96403.getClass(), "pandoraFlagList1", 0L);
        setLongField(term96403, term96403.getClass(), "pandoraFlagList2", 0L);
        setLongField(term96403, term96403.getClass(), "pandoraFlagList3", 0L);
        setLongField(term96403, term96403.getClass(), "pandoraFlagList4", 0L);
        setLongField(term96403, term96403.getClass(), "pandoraFlagList5", 0L);
        setLongField(term96403, term96403.getClass(), "pandoraFlagList6", 0L);
        setLongField(term96403, term96403.getClass(), "emblemFlagList", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPandoraFlagList2", argTypes, term96403, args);
    }

};


