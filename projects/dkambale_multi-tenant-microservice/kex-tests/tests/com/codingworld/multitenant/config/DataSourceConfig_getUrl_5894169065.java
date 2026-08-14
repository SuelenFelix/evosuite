package com.codingworld.multitenant.config;

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
import static com.codingworld.multitenant.config.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class DataSourceConfig_getUrl_5894169065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481;

    public DataSourceConfig_getUrl_5894169065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term482 = new Long(7411271909051562686L);
        term481 = newInstance(Class.forName("com.codingworld.multitenant.config.DataSourceConfig"));
        setField(term481, term481.getClass(), "id", term482);
        setField(term481, term481.getClass(), "name", "RkybSrpybU");
        setField(term481, term481.getClass(), "url", "xOEqzGAmDU");
        setField(term481, term481.getClass(), "username", "eZFUvlxvGV");
        setField(term481, term481.getClass(), "password", "BYqFIqCKAV");
        setField(term481, term481.getClass(), "driverClassName", "vrQLuWIDJX");
        setBooleanField(term481, term481.getClass(), "initialize", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.codingworld.multitenant.config.DataSourceConfig");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUrl", argTypes, term481, args);
    }

};


