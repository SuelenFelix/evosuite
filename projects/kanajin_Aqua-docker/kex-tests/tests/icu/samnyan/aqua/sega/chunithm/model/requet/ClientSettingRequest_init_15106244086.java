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

public class ClientSettingRequest_init_15106244086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82789;

    public ClientSettingRequest_init_15106244086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82789 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term82789, term82789.getClass(), "placeId", "VkVNOcUvlO");
        setField(term82789, term82789.getClass(), "clientId", "DVBrSfNLwF");
        setField(term82789, term82789.getClass(), "placeName", "QeeIOyYsmx");
        setField(term82789, term82789.getClass(), "regionId", "tREUVNKzCo");
        setField(term82789, term82789.getClass(), "regionName", "oMVmfIrXEu");
        setField(term82789, term82789.getClass(), "allNetId", "wpVzLLfXkK");
        setField(term82789, term82789.getClass(), "bordId", "SEPrgtTBVv");
        setField(term82789, term82789.getClass(), "romVersion", "vtJRIanbwg");
        setField(term82789, term82789.getClass(), "dataVersion", "JbrLDrpoAv");
        setField(term82789, term82789.getClass(), "dumpFileNum", "kLAYfNPTYi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSettingRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Object[] args = new Object[1];
        args[0] = term82789;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


