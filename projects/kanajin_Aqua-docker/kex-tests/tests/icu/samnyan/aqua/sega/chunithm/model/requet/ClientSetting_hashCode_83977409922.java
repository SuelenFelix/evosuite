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

public class ClientSetting_hashCode_83977409922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80548;

    public ClientSetting_hashCode_83977409922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80548 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term80548, term80548.getClass(), "placeId", "zOpsVAnrwk");
        setField(term80548, term80548.getClass(), "clientId", "nnUWRbjEHe");
        setField(term80548, term80548.getClass(), "placeName", "nqnYFZYCst");
        setField(term80548, term80548.getClass(), "regionId", "cyTSgJMCVE");
        setField(term80548, term80548.getClass(), "regionName", "yooiSdRAOb");
        setField(term80548, term80548.getClass(), "allNetId", "SoTgnoBFiD");
        setField(term80548, term80548.getClass(), "bordId", "xkhqTWXZqZ");
        setField(term80548, term80548.getClass(), "romVersion", "ABldombRYF");
        setField(term80548, term80548.getClass(), "dataVersion", "LJiniBXnjB");
        setField(term80548, term80548.getClass(), "dumpFileNum", "ySvbXaxFVk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term80548, args);
    }

};


