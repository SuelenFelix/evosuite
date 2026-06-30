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

public class ClientSettingRequest_canEqual_11124767903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82122;
     Object term82244;

    public ClientSettingRequest_canEqual_11124767903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82122 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSettingRequest"));
        Object term82123 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term82123, term82123.getClass(), "placeId", "UKoBRBiZED");
        setField(term82123, term82123.getClass(), "clientId", "QYLIYhaAna");
        setField(term82123, term82123.getClass(), "placeName", "HzMfMKgKlf");
        setField(term82123, term82123.getClass(), "regionId", "syeDEkvOkO");
        setField(term82123, term82123.getClass(), "regionName", "sgApZzdiHM");
        setField(term82123, term82123.getClass(), "allNetId", "vAEHmJcPSd");
        setField(term82123, term82123.getClass(), "bordId", "dOvqKQlKUa");
        setField(term82123, term82123.getClass(), "romVersion", "ZjyndZHfXg");
        setField(term82123, term82123.getClass(), "dataVersion", "mWarigMEMX");
        setField(term82123, term82123.getClass(), "dumpFileNum", "UbOEkDKQTT");
        setField(term82122, term82122.getClass(), "clientSetting", term82123);
        term82244 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSettingRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term82244;
        callMethod(klass, "canEqual", argTypes, term82122, args);
    }

};


