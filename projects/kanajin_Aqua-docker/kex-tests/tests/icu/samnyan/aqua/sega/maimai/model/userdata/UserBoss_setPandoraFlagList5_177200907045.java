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

public class UserBoss_setPandoraFlagList5_177200907045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96545;
     Object term96555;

    public UserBoss_setPandoraFlagList5_177200907045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96545 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        setLongField(term96545, term96545.getClass(), "id", 0L);
        setField(term96545, term96545.getClass(), "user", null);
        setLongField(term96545, term96545.getClass(), "pandoraFlagList0", 0L);
        setLongField(term96545, term96545.getClass(), "pandoraFlagList1", 0L);
        setLongField(term96545, term96545.getClass(), "pandoraFlagList2", 0L);
        setLongField(term96545, term96545.getClass(), "pandoraFlagList3", 0L);
        setLongField(term96545, term96545.getClass(), "pandoraFlagList4", 0L);
        setLongField(term96545, term96545.getClass(), "pandoraFlagList5", 0L);
        setLongField(term96545, term96545.getClass(), "pandoraFlagList6", 0L);
        setLongField(term96545, term96545.getClass(), "emblemFlagList", 0L);
        term96555 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term96555;
        callMethod(klass, "setPandoraFlagList5", argTypes, term96545, args);
    }

};


