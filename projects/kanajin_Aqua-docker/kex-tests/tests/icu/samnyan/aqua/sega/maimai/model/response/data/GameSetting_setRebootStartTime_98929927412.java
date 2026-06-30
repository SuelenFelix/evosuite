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

public class GameSetting_setRebootStartTime_98929927412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4213;

    public GameSetting_setRebootStartTime_98929927412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4213 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term4213, term4213.getClass(), "isMaintenance", false);
        setIntField(term4213, term4213.getClass(), "requestInterval", -1642688455);
        setField(term4213, term4213.getClass(), "rebootStartTime", "oKwCDqywym");
        setField(term4213, term4213.getClass(), "rebootEndTime", "zjZYTddemL");
        setIntField(term4213, term4213.getClass(), "movieUploadLimit", -1184558215);
        setIntField(term4213, term4213.getClass(), "movieStatus", 2123688338);
        setField(term4213, term4213.getClass(), "movieServerUri", "QtrylgCLiF");
        setField(term4213, term4213.getClass(), "deliverServerUri", "orEuhCStGM");
        setField(term4213, term4213.getClass(), "oldServerUri", "HhEaSXWvrY");
        setField(term4213, term4213.getClass(), "usbDlServerUri", "CVRGEomOth");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "vSeruUyNWX";
        callMethod(klass, "setRebootStartTime", argTypes, term4213, args);
    }

};


