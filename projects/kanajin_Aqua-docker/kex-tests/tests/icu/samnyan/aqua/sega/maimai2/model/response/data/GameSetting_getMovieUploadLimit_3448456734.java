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

public class GameSetting_getMovieUploadLimit_3448456734 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2590;

    public GameSetting_getMovieUploadLimit_3448456734() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2590 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term2590, term2590.getClass(), "isMaintenance", true);
        setIntField(term2590, term2590.getClass(), "requestInterval", 694100722);
        setField(term2590, term2590.getClass(), "rebootStartTime", "IOddzvEWcl");
        setField(term2590, term2590.getClass(), "rebootEndTime", "bIrtpkYJWT");
        setIntField(term2590, term2590.getClass(), "movieUploadLimit", -680529431);
        setIntField(term2590, term2590.getClass(), "movieStatus", 212698793);
        setField(term2590, term2590.getClass(), "movieServerUri", "VuLLXpvPpZ");
        setField(term2590, term2590.getClass(), "deliverServerUri", "UEdzEKEEEV");
        setField(term2590, term2590.getClass(), "oldServerUri", "BcENaQFYSd");
        setField(term2590, term2590.getClass(), "usbDlServerUri", "POPYycoDBy");
        setIntField(term2590, term2590.getClass(), "rebootInterval", 1169519385);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMovieUploadLimit", argTypes, term2590, args);
    }

};


