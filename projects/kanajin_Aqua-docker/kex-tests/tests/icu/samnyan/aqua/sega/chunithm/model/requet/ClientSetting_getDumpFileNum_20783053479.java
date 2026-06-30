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

public class ClientSetting_getDumpFileNum_20783053479 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77453;

    public ClientSetting_getDumpFileNum_20783053479() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77453 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term77453, term77453.getClass(), "placeId", "LVDexpaQJR");
        setField(term77453, term77453.getClass(), "clientId", "vlzfUznWJR");
        setField(term77453, term77453.getClass(), "placeName", "FdzDmAbJCC");
        setField(term77453, term77453.getClass(), "regionId", "OSXAuRuAau");
        setField(term77453, term77453.getClass(), "regionName", "azsnWqwRkF");
        setField(term77453, term77453.getClass(), "allNetId", "VytBIaPeoV");
        setField(term77453, term77453.getClass(), "bordId", "eVeQiooIie");
        setField(term77453, term77453.getClass(), "romVersion", "tBvyiKlvwt");
        setField(term77453, term77453.getClass(), "dataVersion", "cbrJBcmzzA");
        setField(term77453, term77453.getClass(), "dumpFileNum", "MQEpjCONzM");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDumpFileNum", argTypes, term77453, args);
    }

};


