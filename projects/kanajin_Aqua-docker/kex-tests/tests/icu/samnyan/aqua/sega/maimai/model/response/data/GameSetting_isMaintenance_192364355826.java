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

public class GameSetting_isMaintenance_192364355826 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6135;

    public GameSetting_isMaintenance_192364355826() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6135 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term6135, term6135.getClass(), "isMaintenance", false);
        setIntField(term6135, term6135.getClass(), "requestInterval", 0);
        setField(term6135, term6135.getClass(), "rebootStartTime", null);
        setField(term6135, term6135.getClass(), "rebootEndTime", null);
        setIntField(term6135, term6135.getClass(), "movieUploadLimit", 0);
        setIntField(term6135, term6135.getClass(), "movieStatus", 0);
        setField(term6135, term6135.getClass(), "movieServerUri", null);
        setField(term6135, term6135.getClass(), "deliverServerUri", null);
        setField(term6135, term6135.getClass(), "oldServerUri", null);
        setField(term6135, term6135.getClass(), "usbDlServerUri", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isMaintenance", argTypes, term6135, args);
    }

};


