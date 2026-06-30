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

public class GameSetting_getRequestInterval_9606381911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2702;

    public GameSetting_getRequestInterval_9606381911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2702 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term2702, term2702.getClass(), "isMaintenance", true);
        setIntField(term2702, term2702.getClass(), "requestInterval", -334716487);
        setField(term2702, term2702.getClass(), "rebootStartTime", "lZIgPZPgTu");
        setField(term2702, term2702.getClass(), "rebootEndTime", "iuCxnHGMoW");
        setIntField(term2702, term2702.getClass(), "movieUploadLimit", -1739012814);
        setIntField(term2702, term2702.getClass(), "movieStatus", 1989014880);
        setField(term2702, term2702.getClass(), "movieServerUri", "GPSEWEDSTo");
        setField(term2702, term2702.getClass(), "deliverServerUri", "RCOqfVsRHt");
        setField(term2702, term2702.getClass(), "oldServerUri", "TSyCeEZPaT");
        setField(term2702, term2702.getClass(), "usbDlServerUri", "JeZFtaqkzW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRequestInterval", argTypes, term2702, args);
    }

};


