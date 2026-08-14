package com.scaleguard.server.application;

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
import static com.scaleguard.server.application.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class Application_save_4611932149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4014;

    public Application_save_4611932149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term4041 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term4041, term4041.getClass(), "id", "");
        setField(term4041, term4041.getClass(), "name", "");
        setField(term4041, term4041.getClass(), "description", "");
        setField(term4041, term4041.getClass(), "appid", "");
        setField(term4041, term4041.getClass(), "clientid", "");
        setField(term4041, term4041.getClass(), "clientsecret", "");
        setLongField(term4041, term4041.getClass(), "expiry", -2644215923136513282L);
        Object term4049 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term4049, term4049.getClass(), "id", "");
        setField(term4049, term4049.getClass(), "name", "");
        setField(term4049, term4049.getClass(), "description", "");
        setField(term4049, term4049.getClass(), "appid", "");
        setField(term4049, term4049.getClass(), "clientid", "");
        setField(term4049, term4049.getClass(), "clientsecret", "");
        setLongField(term4049, term4049.getClass(), "expiry", -1468719814009985452L);
        Object term4057 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term4057, term4057.getClass(), "id", "");
        setField(term4057, term4057.getClass(), "name", "");
        setField(term4057, term4057.getClass(), "description", "");
        setField(term4057, term4057.getClass(), "appid", "");
        setField(term4057, term4057.getClass(), "clientid", "");
        setField(term4057, term4057.getClass(), "clientsecret", "");
        setLongField(term4057, term4057.getClass(), "expiry", -7738503207562305297L);
        Object term4065 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term4065, term4065.getClass(), "id", "");
        setField(term4065, term4065.getClass(), "name", "");
        setField(term4065, term4065.getClass(), "description", "");
        setField(term4065, term4065.getClass(), "appid", "");
        setField(term4065, term4065.getClass(), "clientid", "");
        setField(term4065, term4065.getClass(), "clientsecret", "");
        setLongField(term4065, term4065.getClass(), "expiry", 3825396310311739952L);
        Object term4073 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term4073, term4073.getClass(), "id", "");
        setField(term4073, term4073.getClass(), "name", "");
        setField(term4073, term4073.getClass(), "description", "");
        setField(term4073, term4073.getClass(), "appid", "");
        setField(term4073, term4073.getClass(), "clientid", "");
        setField(term4073, term4073.getClass(), "clientsecret", "");
        setLongField(term4073, term4073.getClass(), "expiry", -3838084482494604218L);
        Object term4081 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term4081, term4081.getClass(), "id", "");
        setField(term4081, term4081.getClass(), "name", "");
        setField(term4081, term4081.getClass(), "description", "");
        setField(term4081, term4081.getClass(), "appid", "");
        setField(term4081, term4081.getClass(), "clientid", "");
        setField(term4081, term4081.getClass(), "clientsecret", "");
        setLongField(term4081, term4081.getClass(), "expiry", 3892018155439224435L);
        Object term4089 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term4089, term4089.getClass(), "id", "");
        setField(term4089, term4089.getClass(), "name", "");
        setField(term4089, term4089.getClass(), "description", "");
        setField(term4089, term4089.getClass(), "appid", "");
        setField(term4089, term4089.getClass(), "clientid", "");
        setField(term4089, term4089.getClass(), "clientsecret", "");
        setLongField(term4089, term4089.getClass(), "expiry", 5953383087795962419L);
        Object term4097 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term4097, term4097.getClass(), "id", "");
        setField(term4097, term4097.getClass(), "name", "");
        setField(term4097, term4097.getClass(), "description", "");
        setField(term4097, term4097.getClass(), "appid", "");
        setField(term4097, term4097.getClass(), "clientid", "");
        setField(term4097, term4097.getClass(), "clientsecret", "");
        setLongField(term4097, term4097.getClass(), "expiry", 7994303628307559416L);
        Object term4105 = newInstance(Class.forName("com.scaleguard.server.application.ClientInfo$WrappeClientInfoRecord"));
        setField(term4105, term4105.getClass(), "id", "");
        setField(term4105, term4105.getClass(), "name", "");
        setField(term4105, term4105.getClass(), "description", "");
        setField(term4105, term4105.getClass(), "appid", "");
        setField(term4105, term4105.getClass(), "clientid", "");
        setField(term4105, term4105.getClass(), "clientsecret", "");
        setLongField(term4105, term4105.getClass(), "expiry", 2443640364875054177L);
        ArrayList term4039 = new ArrayList();
        ((ArrayList) term4039).add(term4041);
        ((ArrayList) term4039).add(term4049);
        ((ArrayList) term4039).add(term4057);
        ((ArrayList) term4039).add(term4065);
        ((ArrayList) term4039).add(term4073);
        ((ArrayList) term4039).add(term4081);
        ((ArrayList) term4039).add(term4089);
        ((ArrayList) term4039).add(term4097);
        ((ArrayList) term4039).add(term4105);
        term4014 = newInstance(Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord"));
        setField(term4014, term4014.getClass(), "name", "KSJeYkkvpk");
        setField(term4014, term4014.getClass(), "description", "qUtkFGMNUV");
        setField(term4014, term4014.getClass(), "clients", term4039);
        setField(term4014, term4014.getClass(), "id", "JisaWUxcNb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.application.Application");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.scaleguard.server.application.Application$WrappeApplicationRecord");
        Object[] args = new Object[1];
        args[0] = term4014;
        callMethod(klass, "save", argTypes, null, args);
    }

};


