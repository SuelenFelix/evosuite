package icu.samnyan.aqua.sega.chunithm.model.requet;

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
import static icu.samnyan.aqua.sega.chunithm.model.requet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ClientSetting_setBordId_26665104516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79132;

    public ClientSetting_setBordId_26665104516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79132 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term79132, term79132.getClass(), "placeId", "ZoRLfUSUqr");
        setField(term79132, term79132.getClass(), "clientId", "OvmJqKnwXe");
        setField(term79132, term79132.getClass(), "placeName", "nrshoMEpRL");
        setField(term79132, term79132.getClass(), "regionId", "ZLOPgKhMdJ");
        setField(term79132, term79132.getClass(), "regionName", "ZbWdzNDrkG");
        setField(term79132, term79132.getClass(), "allNetId", "qXWvyFwoKF");
        setField(term79132, term79132.getClass(), "bordId", "NkogXiHtJk");
        setField(term79132, term79132.getClass(), "romVersion", "OacTmTWbcB");
        setField(term79132, term79132.getClass(), "dataVersion", "xLFRUxoUve");
        setField(term79132, term79132.getClass(), "dumpFileNum", "OadUkgqJIf");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "LVRLcJfRsa";
        callMethod(klass, "setBordId", argTypes, term79132, args);
    }

};


