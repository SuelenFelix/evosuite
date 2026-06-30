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

public class GameSetting_getRebootStartTime_3342709662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2839;

    public GameSetting_getRebootStartTime_3342709662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2839 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term2839, term2839.getClass(), "isMaintenance", true);
        setIntField(term2839, term2839.getClass(), "requestInterval", -330280702);
        setField(term2839, term2839.getClass(), "rebootStartTime", "vOVuNSCCLe");
        setField(term2839, term2839.getClass(), "rebootEndTime", "fzeqPnzpnt");
        setIntField(term2839, term2839.getClass(), "movieUploadLimit", -1858425735);
        setIntField(term2839, term2839.getClass(), "movieStatus", 1818274550);
        setField(term2839, term2839.getClass(), "movieServerUri", "RxbhrFBjkO");
        setField(term2839, term2839.getClass(), "deliverServerUri", "aanyiAOJCl");
        setField(term2839, term2839.getClass(), "oldServerUri", "VDokbsCuqq");
        setField(term2839, term2839.getClass(), "usbDlServerUri", "xClUIcPECX");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootStartTime", argTypes, term2839, args);
    }

};


