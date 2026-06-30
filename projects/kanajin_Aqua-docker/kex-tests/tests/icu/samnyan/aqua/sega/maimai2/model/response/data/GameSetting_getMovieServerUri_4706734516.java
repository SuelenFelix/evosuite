package icu.samnyan.aqua.sega.maimai2.model.response.data;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getMovieServerUri_4706734516 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2866;

    public GameSetting_getMovieServerUri_4706734516() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2866 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term2866, term2866.getClass(), "isMaintenance", true);
        setIntField(term2866, term2866.getClass(), "requestInterval", 1641377218);
        setField(term2866, term2866.getClass(), "rebootStartTime", "VGiXZZTWRO");
        setField(term2866, term2866.getClass(), "rebootEndTime", "MlPtwXnJOJ");
        setIntField(term2866, term2866.getClass(), "movieUploadLimit", 1235375204);
        setIntField(term2866, term2866.getClass(), "movieStatus", 258334639);
        setField(term2866, term2866.getClass(), "movieServerUri", "DbfiyFeaTe");
        setField(term2866, term2866.getClass(), "deliverServerUri", "dQxXGBtDLZ");
        setField(term2866, term2866.getClass(), "oldServerUri", "EgSgEFIyyN");
        setField(term2866, term2866.getClass(), "usbDlServerUri", "iAOFcXaLSf");
        setIntField(term2866, term2866.getClass(), "rebootInterval", 1432187207);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMovieServerUri", argTypes, term2866, args);
    }

};


