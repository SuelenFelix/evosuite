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

public class GameSetting_getMovieStatus_10616507495 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3250;

    public GameSetting_getMovieStatus_10616507495() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3250 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term3250, term3250.getClass(), "isMaintenance", false);
        setIntField(term3250, term3250.getClass(), "requestInterval", -801175078);
        setField(term3250, term3250.getClass(), "rebootStartTime", "hulYxtowxw");
        setField(term3250, term3250.getClass(), "rebootEndTime", "GNEmuHPNcU");
        setIntField(term3250, term3250.getClass(), "movieUploadLimit", 2085098404);
        setIntField(term3250, term3250.getClass(), "movieStatus", -684064427);
        setField(term3250, term3250.getClass(), "movieServerUri", "IoSfuKDFRe");
        setField(term3250, term3250.getClass(), "deliverServerUri", "AWYyZiNfsm");
        setField(term3250, term3250.getClass(), "oldServerUri", "ITRRYiuDwH");
        setField(term3250, term3250.getClass(), "usbDlServerUri", "llRfwANcVF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMovieStatus", argTypes, term3250, args);
    }

};


