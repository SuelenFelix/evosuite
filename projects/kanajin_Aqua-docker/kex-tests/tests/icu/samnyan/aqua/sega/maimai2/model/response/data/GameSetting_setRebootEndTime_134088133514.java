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

public class GameSetting_setRebootEndTime_134088133514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3996;

    public GameSetting_setRebootEndTime_134088133514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3996 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term3996, term3996.getClass(), "isMaintenance", false);
        setIntField(term3996, term3996.getClass(), "requestInterval", 1796950482);
        setField(term3996, term3996.getClass(), "rebootStartTime", "PSOttyUeqv");
        setField(term3996, term3996.getClass(), "rebootEndTime", "HmEvTlmzXo");
        setIntField(term3996, term3996.getClass(), "movieUploadLimit", -945759470);
        setIntField(term3996, term3996.getClass(), "movieStatus", 657342039);
        setField(term3996, term3996.getClass(), "movieServerUri", "BMMonTIZgJ");
        setField(term3996, term3996.getClass(), "deliverServerUri", "QXyFXBjFde");
        setField(term3996, term3996.getClass(), "oldServerUri", "xVFgeyYxZS");
        setField(term3996, term3996.getClass(), "usbDlServerUri", "iQiGTulJiH");
        setIntField(term3996, term3996.getClass(), "rebootInterval", 1483999606);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "utCuuVCKqE";
        callMethod(klass, "setRebootEndTime", argTypes, term3996, args);
    }

};


