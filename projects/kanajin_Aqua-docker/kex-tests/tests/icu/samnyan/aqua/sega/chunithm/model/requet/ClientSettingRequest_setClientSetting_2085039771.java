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

public class ClientSettingRequest_setClientSetting_2085039771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81456;
     Object term81578;

    public ClientSettingRequest_setClientSetting_2085039771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81456 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSettingRequest"));
        Object term81457 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term81457, term81457.getClass(), "placeId", "tQRvyNwDqB");
        setField(term81457, term81457.getClass(), "clientId", "dIKNQsSoMj");
        setField(term81457, term81457.getClass(), "placeName", "HqjQGEpUiH");
        setField(term81457, term81457.getClass(), "regionId", "BtiUMsmVbh");
        setField(term81457, term81457.getClass(), "regionName", "INHNqaImEM");
        setField(term81457, term81457.getClass(), "allNetId", "vPIneuzFyr");
        setField(term81457, term81457.getClass(), "bordId", "eGDUBxxnZQ");
        setField(term81457, term81457.getClass(), "romVersion", "mFAJYTcPxb");
        setField(term81457, term81457.getClass(), "dataVersion", "kEeOXwuQLs");
        setField(term81457, term81457.getClass(), "dumpFileNum", "MyeSojBBPn");
        setField(term81456, term81456.getClass(), "clientSetting", term81457);
        term81578 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term81578, term81578.getClass(), "placeId", "IBEiicEMis");
        setField(term81578, term81578.getClass(), "clientId", "bWUMMMnrsO");
        setField(term81578, term81578.getClass(), "placeName", "QMuSzIUAqW");
        setField(term81578, term81578.getClass(), "regionId", "ecDNTpPdOH");
        setField(term81578, term81578.getClass(), "regionName", "BsVYnEehhF");
        setField(term81578, term81578.getClass(), "allNetId", "YwJlByssSF");
        setField(term81578, term81578.getClass(), "bordId", "EWbLFcROZq");
        setField(term81578, term81578.getClass(), "romVersion", "uZkkVJREva");
        setField(term81578, term81578.getClass(), "dataVersion", "lYGZmmgWDd");
        setField(term81578, term81578.getClass(), "dumpFileNum", "YzjQFbbtMR");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSettingRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Object[] args = new Object[1];
        args[0] = term81578;
        callMethod(klass, "setClientSetting", argTypes, term81456, args);
    }

};


