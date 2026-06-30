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

public class ClientSetting_toString_32901440923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80769;

    public ClientSetting_toString_32901440923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80769 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term80769, term80769.getClass(), "placeId", "IkBWbcZtiH");
        setField(term80769, term80769.getClass(), "clientId", "mItcHoacSH");
        setField(term80769, term80769.getClass(), "placeName", "fzMkBxNUHB");
        setField(term80769, term80769.getClass(), "regionId", "qzVIBCSTKC");
        setField(term80769, term80769.getClass(), "regionName", "ITnfwxpCsl");
        setField(term80769, term80769.getClass(), "allNetId", "KZCgNQgPRl");
        setField(term80769, term80769.getClass(), "bordId", "cRXtToSuNf");
        setField(term80769, term80769.getClass(), "romVersion", "EGhoDGUsdp");
        setField(term80769, term80769.getClass(), "dataVersion", "bpCsiZxavU");
        setField(term80769, term80769.getClass(), "dumpFileNum", "GkQIPePZVq");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term80769, args);
    }

};


