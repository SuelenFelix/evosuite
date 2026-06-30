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

public class ClientSetting_getAllNetId_14895098345 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76569;

    public ClientSetting_getAllNetId_14895098345() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76569 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term76569, term76569.getClass(), "placeId", "qEABplGAwB");
        setField(term76569, term76569.getClass(), "clientId", "crdvuBefUh");
        setField(term76569, term76569.getClass(), "placeName", "DmSGIaLFxy");
        setField(term76569, term76569.getClass(), "regionId", "EIfTZcAWvK");
        setField(term76569, term76569.getClass(), "regionName", "UTxMkvUfrZ");
        setField(term76569, term76569.getClass(), "allNetId", "NQsrTzOjPP");
        setField(term76569, term76569.getClass(), "bordId", "AaBJKKMloo");
        setField(term76569, term76569.getClass(), "romVersion", "xPudQMxgBM");
        setField(term76569, term76569.getClass(), "dataVersion", "dZjsEGIcWz");
        setField(term76569, term76569.getClass(), "dumpFileNum", "svjpGAjnRN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAllNetId", argTypes, term76569, args);
    }

};


