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

public class ClientSettingRequest_hashCode_19296412024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82345;

    public ClientSettingRequest_hashCode_19296412024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82345 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSettingRequest"));
        Object term82346 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term82346, term82346.getClass(), "placeId", "IWWuxiwNhE");
        setField(term82346, term82346.getClass(), "clientId", "tecOgyBctJ");
        setField(term82346, term82346.getClass(), "placeName", "rSSuONUDGA");
        setField(term82346, term82346.getClass(), "regionId", "WmInSFSxSk");
        setField(term82346, term82346.getClass(), "regionName", "rmbZwfUyua");
        setField(term82346, term82346.getClass(), "allNetId", "GzCjLjIGCd");
        setField(term82346, term82346.getClass(), "bordId", "oYSEWvyjcR");
        setField(term82346, term82346.getClass(), "romVersion", "VMmhmTHSAL");
        setField(term82346, term82346.getClass(), "dataVersion", "XGtrhXNaMV");
        setField(term82346, term82346.getClass(), "dumpFileNum", "KlhHeZgItV");
        setField(term82345, term82345.getClass(), "clientSetting", term82346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSettingRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term82345, args);
    }

};


