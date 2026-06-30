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

public class GameSetting_getMovieStatus_1108288675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2728;

    public GameSetting_getMovieStatus_1108288675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2728 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term2728, term2728.getClass(), "isMaintenance", true);
        setIntField(term2728, term2728.getClass(), "requestInterval", 1846078344);
        setField(term2728, term2728.getClass(), "rebootStartTime", "LuWMOXdAPA");
        setField(term2728, term2728.getClass(), "rebootEndTime", "blSffTnsOv");
        setIntField(term2728, term2728.getClass(), "movieUploadLimit", 1692543802);
        setIntField(term2728, term2728.getClass(), "movieStatus", 376341151);
        setField(term2728, term2728.getClass(), "movieServerUri", "qbUMcIvEXH");
        setField(term2728, term2728.getClass(), "deliverServerUri", "TVxGTjeDcu");
        setField(term2728, term2728.getClass(), "oldServerUri", "ABPtcyCzkR");
        setField(term2728, term2728.getClass(), "usbDlServerUri", "QgHhxMyKvr");
        setIntField(term2728, term2728.getClass(), "rebootInterval", -1607267243);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMovieStatus", argTypes, term2728, args);
    }

};


