package com.scaleguard.server.db;

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
import static com.scaleguard.server.db.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClientInfoEntry_setDescription_193355023610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6244;

    public ClientInfoEntry_setDescription_193355023610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6244 = newInstance(Class.forName("com.scaleguard.server.db.ClientInfoEntry"));
        setField(term6244, term6244.getClass(), "id", "SPtPatHeOm");
        setField(term6244, term6244.getClass(), "name", "ywmcuThdfL");
        setField(term6244, term6244.getClass(), "description", "GBOEuByOfr");
        setField(term6244, term6244.getClass(), "appid", "NHbOFFjyVK");
        setField(term6244, term6244.getClass(), "clientid", "zaloBqlrSo");
        setLongField(term6244, term6244.getClass(), "expiry", -6342139649364011743L);
        setField(term6244, term6244.getClass(), "clientsecret", "vvoLrMGCoN");
        setLongField(term6244, term6244.getClass(), "mts", -4924950707540628022L);
        setLongField(term6244, term6244.getClass(), "uts", -4393710401270724527L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.scaleguard.server.db.ClientInfoEntry");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pXdglvyrQe";
        callMethod(klass, "setDescription", argTypes, term6244, args);
    }

};


