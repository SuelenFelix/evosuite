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

public class UserBoss_setPandoraFlagList2_177201195342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96509;
     Object term96519;

    public UserBoss_setPandoraFlagList2_177201195342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96509 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        setLongField(term96509, term96509.getClass(), "id", 0L);
        setField(term96509, term96509.getClass(), "user", null);
        setLongField(term96509, term96509.getClass(), "pandoraFlagList0", 0L);
        setLongField(term96509, term96509.getClass(), "pandoraFlagList1", 0L);
        setLongField(term96509, term96509.getClass(), "pandoraFlagList2", 0L);
        setLongField(term96509, term96509.getClass(), "pandoraFlagList3", 0L);
        setLongField(term96509, term96509.getClass(), "pandoraFlagList4", 0L);
        setLongField(term96509, term96509.getClass(), "pandoraFlagList5", 0L);
        setLongField(term96509, term96509.getClass(), "pandoraFlagList6", 0L);
        setLongField(term96509, term96509.getClass(), "emblemFlagList", 0L);
        term96519 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term96519;
        callMethod(klass, "setPandoraFlagList2", argTypes, term96509, args);
    }

};


