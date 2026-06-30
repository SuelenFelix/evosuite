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
import java.lang.Object;

public class ClientSettingRequest_equals_19166394192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81899;
     Object term82021;

    public ClientSettingRequest_equals_19166394192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81899 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSettingRequest"));
        Object term81900 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term81900, term81900.getClass(), "placeId", "iyFhYDVxSB");
        setField(term81900, term81900.getClass(), "clientId", "wqmAianxQK");
        setField(term81900, term81900.getClass(), "placeName", "FbERbbZMNs");
        setField(term81900, term81900.getClass(), "regionId", "qKghCzRGvs");
        setField(term81900, term81900.getClass(), "regionName", "zpshVYDLcR");
        setField(term81900, term81900.getClass(), "allNetId", "jbBXnlcBeK");
        setField(term81900, term81900.getClass(), "bordId", "uascBPqTuU");
        setField(term81900, term81900.getClass(), "romVersion", "dFOpjLmNnE");
        setField(term81900, term81900.getClass(), "dataVersion", "CCgshdCJTR");
        setField(term81900, term81900.getClass(), "dumpFileNum", "tObTOEkwsm");
        setField(term81899, term81899.getClass(), "clientSetting", term81900);
        term82021 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSettingRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term82021;
        callMethod(klass, "equals", argTypes, term81899, args);
    }

};


