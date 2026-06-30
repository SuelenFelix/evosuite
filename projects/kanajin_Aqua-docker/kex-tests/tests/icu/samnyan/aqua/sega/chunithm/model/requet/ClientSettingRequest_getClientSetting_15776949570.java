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

public class ClientSettingRequest_getClientSetting_15776949570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81234;

    public ClientSettingRequest_getClientSetting_15776949570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81234 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSettingRequest"));
        Object term81235 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSetting"));
        setField(term81235, term81235.getClass(), "placeId", "uDfBwiLidX");
        setField(term81235, term81235.getClass(), "clientId", "LkaxztUhKP");
        setField(term81235, term81235.getClass(), "placeName", "JAiMiiwIyd");
        setField(term81235, term81235.getClass(), "regionId", "HZEoZFSfys");
        setField(term81235, term81235.getClass(), "regionName", "usGpZUqeig");
        setField(term81235, term81235.getClass(), "allNetId", "zshYTmGpAb");
        setField(term81235, term81235.getClass(), "bordId", "OLrThOaeRP");
        setField(term81235, term81235.getClass(), "romVersion", "PXaTZfbXEG");
        setField(term81235, term81235.getClass(), "dataVersion", "euhRkgIHwR");
        setField(term81235, term81235.getClass(), "dumpFileNum", "fGCjMhYeuP");
        setField(term81234, term81234.getClass(), "clientSetting", term81235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.requet.ClientSettingRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClientSetting", argTypes, term81234, args);
    }

};


