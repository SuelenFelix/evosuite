package com.strategyengine.xrpl.fsedistributionservice.entity;

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
import static com.strategyengine.xrpl.fsedistributionservice.entity.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;

public class ScammerAddressEnt_ScammerAddressEntBuilder_id_7010531001 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term235989;
     Object term236020;

    public ScammerAddressEnt_ScammerAddressEntBuilder_id_7010531001() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term235990 = new Long(1909175111101717943L);
        term235989 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt$ScammerAddressEntBuilder"));
        Object term236004 = newInstance(Class.forName("java.util.Date"));
        Object term236006 = newInstance(Class.forName("java.util.Date"));
        setField(term235989, term235989.getClass(), "id", term235990);
        setField(term235989, term235989.getClass(), "address", "wEYAmGJIEF");
        setLongField(term236004, term236004.getClass(), "fastTime", 1586026886280L);
        setField(term236004, term236004.getClass(), "cdate", null);
        setField(term235989, term235989.getClass(), "createDate", term236004);
        setLongField(term236006, term236006.getClass(), "fastTime", 1486253742941L);
        setField(term236006, term236006.getClass(), "cdate", null);
        setField(term235989, term235989.getClass(), "updateDate", term236006);
        setField(term235989, term235989.getClass(), "type", "iXEhfXJomO");
        term236020 = new Long(8499930868919012909L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt$ScammerAddressEntBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Long");
        Object[] args = new Object[1];
        args[0] = term236020;
        callMethod(klass, "id", argTypes, term235989, args);
    }

};


