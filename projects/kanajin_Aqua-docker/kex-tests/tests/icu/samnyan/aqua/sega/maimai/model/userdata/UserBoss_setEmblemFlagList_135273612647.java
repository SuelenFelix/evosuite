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

public class UserBoss_setEmblemFlagList_135273612647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96569;
     Object term96579;

    public UserBoss_setEmblemFlagList_135273612647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96569 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        setLongField(term96569, term96569.getClass(), "id", 0L);
        setField(term96569, term96569.getClass(), "user", null);
        setLongField(term96569, term96569.getClass(), "pandoraFlagList0", 0L);
        setLongField(term96569, term96569.getClass(), "pandoraFlagList1", 0L);
        setLongField(term96569, term96569.getClass(), "pandoraFlagList2", 0L);
        setLongField(term96569, term96569.getClass(), "pandoraFlagList3", 0L);
        setLongField(term96569, term96569.getClass(), "pandoraFlagList4", 0L);
        setLongField(term96569, term96569.getClass(), "pandoraFlagList5", 0L);
        setLongField(term96569, term96569.getClass(), "pandoraFlagList6", 0L);
        setLongField(term96569, term96569.getClass(), "emblemFlagList", 0L);
        term96579 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term96579;
        callMethod(klass, "setEmblemFlagList", argTypes, term96569, args);
    }

};


