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

public class GameSetting_setDeliverServerUri_61556136218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4596;

    public GameSetting_setDeliverServerUri_61556136218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4596 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term4596, term4596.getClass(), "isMaintenance", false);
        setIntField(term4596, term4596.getClass(), "requestInterval", 694989162);
        setField(term4596, term4596.getClass(), "rebootStartTime", "qGkNzZAeDN");
        setField(term4596, term4596.getClass(), "rebootEndTime", "wdtiuPgTVJ");
        setIntField(term4596, term4596.getClass(), "movieUploadLimit", -65504209);
        setIntField(term4596, term4596.getClass(), "movieStatus", 1745199030);
        setField(term4596, term4596.getClass(), "movieServerUri", "HUgzMgrpsK");
        setField(term4596, term4596.getClass(), "deliverServerUri", "ubaBUfLolu");
        setField(term4596, term4596.getClass(), "oldServerUri", "itAUCFhZhq");
        setField(term4596, term4596.getClass(), "usbDlServerUri", "bIqaKgXgPm");
        setIntField(term4596, term4596.getClass(), "rebootInterval", -1440013173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uOJFOUcNvv";
        callMethod(klass, "setDeliverServerUri", argTypes, term4596, args);
    }

};


