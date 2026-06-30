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

public class ClientSetting_getClientId_6415703431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75685;

    public ClientSetting_getClientId_6415703431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75685 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term75685, term75685.getClass(), "placeId", "vwfIkOlVZd");
        setField(term75685, term75685.getClass(), "clientId", "MceqIBCmbY");
        setField(term75685, term75685.getClass(), "placeName", "rlUBuxBZan");
        setField(term75685, term75685.getClass(), "regionId", "xcfVTYHLJQ");
        setField(term75685, term75685.getClass(), "regionName", "pcqiKdOHBV");
        setField(term75685, term75685.getClass(), "allNetId", "rXuZuSwWYH");
        setField(term75685, term75685.getClass(), "bordId", "dxRMTzPEIm");
        setField(term75685, term75685.getClass(), "romVersion", "HXmJcdlvRm");
        setField(term75685, term75685.getClass(), "dataVersion", "SIFtikilxs");
        setField(term75685, term75685.getClass(), "dumpFileNum", "DMJMXIbDkU");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClientId", argTypes, term75685, args);
    }

};


