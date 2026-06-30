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

public class GameSetting_getRebootEndTime_995586653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2452;

    public GameSetting_getRebootEndTime_995586653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2452 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term2452, term2452.getClass(), "isMaintenance", false);
        setIntField(term2452, term2452.getClass(), "requestInterval", -529831900);
        setField(term2452, term2452.getClass(), "rebootStartTime", "vpZIqpFbKM");
        setField(term2452, term2452.getClass(), "rebootEndTime", "dAbwpJCDif");
        setIntField(term2452, term2452.getClass(), "movieUploadLimit", 1574493440);
        setIntField(term2452, term2452.getClass(), "movieStatus", 1854694585);
        setField(term2452, term2452.getClass(), "movieServerUri", "ATSXJPySio");
        setField(term2452, term2452.getClass(), "deliverServerUri", "XZkOUcbfFg");
        setField(term2452, term2452.getClass(), "oldServerUri", "TGiJfagfky");
        setField(term2452, term2452.getClass(), "usbDlServerUri", "BJklinBmhN");
        setIntField(term2452, term2452.getClass(), "rebootInterval", -1260562836);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootEndTime", argTypes, term2452, args);
    }

};


