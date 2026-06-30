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

public class ClientSetting_setPlaceId_47514760710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77674;

    public ClientSetting_setPlaceId_47514760710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77674 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term77674, term77674.getClass(), "placeId", "NYzdiIdifj");
        setField(term77674, term77674.getClass(), "clientId", "QShAEmzTpm");
        setField(term77674, term77674.getClass(), "placeName", "WfIDYpqgan");
        setField(term77674, term77674.getClass(), "regionId", "jkqkgaaQOn");
        setField(term77674, term77674.getClass(), "regionName", "VxoGAcPGVp");
        setField(term77674, term77674.getClass(), "allNetId", "ltoRvwhmcS");
        setField(term77674, term77674.getClass(), "bordId", "iSXUZmUzsG");
        setField(term77674, term77674.getClass(), "romVersion", "wCLSYvOrxz");
        setField(term77674, term77674.getClass(), "dataVersion", "rzlCRHVFsA");
        setField(term77674, term77674.getClass(), "dumpFileNum", "XICyfUgpjZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SOwukZbyqx";
        callMethod(klass, "setPlaceId", argTypes, term77674, args);
    }

};


