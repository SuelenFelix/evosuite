package icu.samnyan.aqua.sega.chusan.model.response.data;

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
import static icu.samnyan.aqua.sega.chusan.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getRebootEndTime_4563779335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4614;

    public GameSetting_getRebootEndTime_4563779335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4614 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting"));
        setField(term4614, term4614.getClass(), "romVersion", "WrzdBkinqV");
        setField(term4614, term4614.getClass(), "dataVersion", "vydWXHfFTw");
        setBooleanField(term4614, term4614.getClass(), "isMaintenance", true);
        setIntField(term4614, term4614.getClass(), "requestInterval", -86860026);
        setField(term4614, term4614.getClass(), "rebootStartTime", "DRhkpDneCC");
        setField(term4614, term4614.getClass(), "rebootEndTime", "vuIJRrypuA");
        setBooleanField(term4614, term4614.getClass(), "isBackgroundDistribute", false);
        setIntField(term4614, term4614.getClass(), "maxCountCharacter", -444451515);
        setIntField(term4614, term4614.getClass(), "maxCountItem", -545419660);
        setIntField(term4614, term4614.getClass(), "maxCountMusic", -1917689550);
        setField(term4614, term4614.getClass(), "matchStartTime", "AxfSZmaiyA");
        setField(term4614, term4614.getClass(), "matchEndTime", "lBpveIKbea");
        setIntField(term4614, term4614.getClass(), "matchTimeLimit", 1829428325);
        setIntField(term4614, term4614.getClass(), "matchErrorLimit", -1881843694);
        setField(term4614, term4614.getClass(), "matchingUri", "uyLBVQYcOV");
        setField(term4614, term4614.getClass(), "udpHolePunchUri", "PoTZjDuBHa");
        setField(term4614, term4614.getClass(), "reflectorUri", "MIwvgVrhzP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootEndTime", argTypes, term4614, args);
    }

};


