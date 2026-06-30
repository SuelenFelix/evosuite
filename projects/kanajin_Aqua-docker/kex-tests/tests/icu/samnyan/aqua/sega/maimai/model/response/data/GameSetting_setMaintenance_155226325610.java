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
import java.lang.Boolean;

public class GameSetting_setMaintenance_155226325610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3935;
     Object term4012;

    public GameSetting_setMaintenance_155226325610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3935 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term3935, term3935.getClass(), "isMaintenance", true);
        setIntField(term3935, term3935.getClass(), "requestInterval", -21429773);
        setField(term3935, term3935.getClass(), "rebootStartTime", "zLMTXDQHYH");
        setField(term3935, term3935.getClass(), "rebootEndTime", "PqywFWJlpE");
        setIntField(term3935, term3935.getClass(), "movieUploadLimit", 1774728742);
        setIntField(term3935, term3935.getClass(), "movieStatus", -1822211508);
        setField(term3935, term3935.getClass(), "movieServerUri", "OzXRsFGTIp");
        setField(term3935, term3935.getClass(), "deliverServerUri", "TjWpyghUWN");
        setField(term3935, term3935.getClass(), "oldServerUri", "dkZFDZxcde");
        setField(term3935, term3935.getClass(), "usbDlServerUri", "WXcZEtUKlI");
        term4012 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term4012;
        callMethod(klass, "setMaintenance", argTypes, term3935, args);
    }

};


