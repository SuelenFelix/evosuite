package icu.samnyan.aqua.sega.maimai.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_canEqual_133967005221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5583;
     Object term5660;

    public GameSetting_canEqual_133967005221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5583 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term5583, term5583.getClass(), "isMaintenance", true);
        setIntField(term5583, term5583.getClass(), "requestInterval", -1021168716);
        setField(term5583, term5583.getClass(), "rebootStartTime", "jqrVEUvYEz");
        setField(term5583, term5583.getClass(), "rebootEndTime", "QITgiBrmfj");
        setIntField(term5583, term5583.getClass(), "movieUploadLimit", -1238055654);
        setIntField(term5583, term5583.getClass(), "movieStatus", 1561513428);
        setField(term5583, term5583.getClass(), "movieServerUri", "pXxkiXgQnq");
        setField(term5583, term5583.getClass(), "deliverServerUri", "tKmrUDURku");
        setField(term5583, term5583.getClass(), "oldServerUri", "JeZbrwZmsP");
        setField(term5583, term5583.getClass(), "usbDlServerUri", "bxyfeicqrK");
        term5660 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5660;
        callMethod(klass, "canEqual", argTypes, term5583, args);
    }

};


