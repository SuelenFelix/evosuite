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

public class ScammerAddressEnt_getId_5324019066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term239148;

    public ScammerAddressEnt_getId_5324019066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term239149 = new Long(5023047512459111304L);
        term239148 = newInstance(Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt"));
        Object term239163 = newInstance(Class.forName("java.util.Date"));
        Object term239165 = newInstance(Class.forName("java.util.Date"));
        setField(term239148, term239148.getClass(), "id", term239149);
        setField(term239148, term239148.getClass(), "address", "zoVKwYYMOI");
        setLongField(term239163, term239163.getClass(), "fastTime", 1586989562747L);
        setField(term239163, term239163.getClass(), "cdate", null);
        setField(term239148, term239148.getClass(), "createDate", term239163);
        setLongField(term239165, term239165.getClass(), "fastTime", 1696352239422L);
        setField(term239165, term239165.getClass(), "cdate", null);
        setField(term239148, term239148.getClass(), "updateDate", term239165);
        setField(term239148, term239148.getClass(), "type", "DGCeQsmIOU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.strategyengine.xrpl.fsedistributionservice.entity.ScammerAddressEnt");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term239148, args);
    }

};


