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

public class GameSetting_getDeliverServerUri_1595232167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3524;

    public GameSetting_getDeliverServerUri_1595232167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3524 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term3524, term3524.getClass(), "isMaintenance", true);
        setIntField(term3524, term3524.getClass(), "requestInterval", -432054743);
        setField(term3524, term3524.getClass(), "rebootStartTime", "cSHGbqKqlN");
        setField(term3524, term3524.getClass(), "rebootEndTime", "pFAfANnxup");
        setIntField(term3524, term3524.getClass(), "movieUploadLimit", -859726380);
        setIntField(term3524, term3524.getClass(), "movieStatus", -1498422654);
        setField(term3524, term3524.getClass(), "movieServerUri", "FbSIUZyBXZ");
        setField(term3524, term3524.getClass(), "deliverServerUri", "mhQDwIyrRi");
        setField(term3524, term3524.getClass(), "oldServerUri", "HpZXWDPhlg");
        setField(term3524, term3524.getClass(), "usbDlServerUri", "lBOokzEPfe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDeliverServerUri", argTypes, term3524, args);
    }

};


