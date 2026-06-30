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

public class GameSetting_getMovieServerUri_14214953336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3387;

    public GameSetting_getMovieServerUri_14214953336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3387 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term3387, term3387.getClass(), "isMaintenance", false);
        setIntField(term3387, term3387.getClass(), "requestInterval", -1981080836);
        setField(term3387, term3387.getClass(), "rebootStartTime", "sUEeHQTWkA");
        setField(term3387, term3387.getClass(), "rebootEndTime", "BDIRCxAWLA");
        setIntField(term3387, term3387.getClass(), "movieUploadLimit", -176676344);
        setIntField(term3387, term3387.getClass(), "movieStatus", 1949009312);
        setField(term3387, term3387.getClass(), "movieServerUri", "eOJfbiZLnb");
        setField(term3387, term3387.getClass(), "deliverServerUri", "nKZKnxWYCK");
        setField(term3387, term3387.getClass(), "oldServerUri", "JOqQxuzRuZ");
        setField(term3387, term3387.getClass(), "usbDlServerUri", "RSaoipUlsg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMovieServerUri", argTypes, term3387, args);
    }

};


