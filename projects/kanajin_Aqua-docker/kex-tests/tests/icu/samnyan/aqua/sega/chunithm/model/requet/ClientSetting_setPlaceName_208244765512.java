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

public class ClientSetting_setPlaceName_208244765512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78160;

    public ClientSetting_setPlaceName_208244765512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78160 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term78160, term78160.getClass(), "placeId", "dkswgBXyfe");
        setField(term78160, term78160.getClass(), "clientId", "YHtTpcXHtC");
        setField(term78160, term78160.getClass(), "placeName", "uqzybgAbHn");
        setField(term78160, term78160.getClass(), "regionId", "bVWOnKMYwA");
        setField(term78160, term78160.getClass(), "regionName", "IQqGtjQIFE");
        setField(term78160, term78160.getClass(), "allNetId", "RmkFdgzLOk");
        setField(term78160, term78160.getClass(), "bordId", "MbeNzUVsCl");
        setField(term78160, term78160.getClass(), "romVersion", "JrFwmRIxXJ");
        setField(term78160, term78160.getClass(), "dataVersion", "CBPHkMUpDJ");
        setField(term78160, term78160.getClass(), "dumpFileNum", "kcrVudpPVv");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fHMfHuQbLa";
        callMethod(klass, "setPlaceName", argTypes, term78160, args);
    }

};


