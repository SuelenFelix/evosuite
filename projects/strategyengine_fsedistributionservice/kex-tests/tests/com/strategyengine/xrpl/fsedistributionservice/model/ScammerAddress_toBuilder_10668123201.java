package com.strategyengine.xrpl.fsedistributionservice.model;

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
import static com.strategyengine.xrpl.fsedistributionservice.model.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class ScammerAddress_toBuilder_10668123201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term566817;

    public ScammerAddress_toBuilder_10668123201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term566818 = new Long(-5668489101686002218L);
        term566817 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress"));
        Object term566832 = newInstance(Class.forName("java.util.Date"));
        Object term566834 = newInstance(Class.forName("java.util.Date"));
        setField(term566817, term566817.getClass(), "id", term566818);
        setField(term566817, term566817.getClass(), "account", "PkJQanvmOF");
        setLongField(term566832, term566832.getClass(), "fastTime", 1770220035403L);
        setField(term566832, term566832.getClass(), "cdate", null);
        setField(term566817, term566817.getClass(), "createDate", term566832);
        setLongField(term566834, term566834.getClass(), "fastTime", 1330001505332L);
        setField(term566834, term566834.getClass(), "cdate", null);
        setField(term566817, term566817.getClass(), "updateDate", term566834);
        setField(term566817, term566817.getClass(), "type", "SisnDNfBOL");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.model.ScammerAddress");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toBuilder", argTypes, term566817, args);
    }

};


