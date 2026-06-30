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

public class UserBoss_getEmblemFlagList_18736352037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96453;

    public UserBoss_getEmblemFlagList_18736352037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96453 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss"));
        setLongField(term96453, term96453.getClass(), "id", 0L);
        setField(term96453, term96453.getClass(), "user", null);
        setLongField(term96453, term96453.getClass(), "pandoraFlagList0", 0L);
        setLongField(term96453, term96453.getClass(), "pandoraFlagList1", 0L);
        setLongField(term96453, term96453.getClass(), "pandoraFlagList2", 0L);
        setLongField(term96453, term96453.getClass(), "pandoraFlagList3", 0L);
        setLongField(term96453, term96453.getClass(), "pandoraFlagList4", 0L);
        setLongField(term96453, term96453.getClass(), "pandoraFlagList5", 0L);
        setLongField(term96453, term96453.getClass(), "pandoraFlagList6", 0L);
        setLongField(term96453, term96453.getClass(), "emblemFlagList", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserBoss");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEmblemFlagList", argTypes, term96453, args);
    }

};


