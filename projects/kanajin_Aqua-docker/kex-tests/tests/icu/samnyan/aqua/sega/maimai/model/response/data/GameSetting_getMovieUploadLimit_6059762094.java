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

public class GameSetting_getMovieUploadLimit_6059762094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3113;

    public GameSetting_getMovieUploadLimit_6059762094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3113 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term3113, term3113.getClass(), "isMaintenance", false);
        setIntField(term3113, term3113.getClass(), "requestInterval", -1487263349);
        setField(term3113, term3113.getClass(), "rebootStartTime", "zsWKWiTFuo");
        setField(term3113, term3113.getClass(), "rebootEndTime", "UPUbwyHQKN");
        setIntField(term3113, term3113.getClass(), "movieUploadLimit", -1009732764);
        setIntField(term3113, term3113.getClass(), "movieStatus", 950783153);
        setField(term3113, term3113.getClass(), "movieServerUri", "lgQkrXANyI");
        setField(term3113, term3113.getClass(), "deliverServerUri", "MeTmRZXErV");
        setField(term3113, term3113.getClass(), "oldServerUri", "jNxbVmoZgq");
        setField(term3113, term3113.getClass(), "usbDlServerUri", "PvmBHIXaMY");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMovieUploadLimit", argTypes, term3113, args);
    }

};


