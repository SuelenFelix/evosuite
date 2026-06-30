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

public class ClientSetting_getRegionName_16119502224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76348;

    public ClientSetting_getRegionName_16119502224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76348 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term76348, term76348.getClass(), "placeId", "SHSHsYUaOc");
        setField(term76348, term76348.getClass(), "clientId", "jXMTXHvttw");
        setField(term76348, term76348.getClass(), "placeName", "WOqkLnLgei");
        setField(term76348, term76348.getClass(), "regionId", "xiCFEluOSq");
        setField(term76348, term76348.getClass(), "regionName", "EDeReFiqFY");
        setField(term76348, term76348.getClass(), "allNetId", "uWHxeGcEwu");
        setField(term76348, term76348.getClass(), "bordId", "GVkEKlhcrr");
        setField(term76348, term76348.getClass(), "romVersion", "uNKWJhnHHl");
        setField(term76348, term76348.getClass(), "dataVersion", "wjhYcpvRUu");
        setField(term76348, term76348.getClass(), "dumpFileNum", "YqeXdoWJfV");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRegionName", argTypes, term76348, args);
    }

};


