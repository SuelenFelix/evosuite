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

public class UserBoss_setPandoraFlagList4_177201003144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96533;
     Object term96543;

    public UserBoss_setPandoraFlagList4_177201003144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96533 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        setLongField(term96533, term96533.getClass(), "id", 0L);
        setField(term96533, term96533.getClass(), "user", null);
        setLongField(term96533, term96533.getClass(), "pandoraFlagList0", 0L);
        setLongField(term96533, term96533.getClass(), "pandoraFlagList1", 0L);
        setLongField(term96533, term96533.getClass(), "pandoraFlagList2", 0L);
        setLongField(term96533, term96533.getClass(), "pandoraFlagList3", 0L);
        setLongField(term96533, term96533.getClass(), "pandoraFlagList4", 0L);
        setLongField(term96533, term96533.getClass(), "pandoraFlagList5", 0L);
        setLongField(term96533, term96533.getClass(), "pandoraFlagList6", 0L);
        setLongField(term96533, term96533.getClass(), "emblemFlagList", 0L);
        term96543 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term96543;
        callMethod(klass, "setPandoraFlagList4", argTypes, term96533, args);
    }

};


