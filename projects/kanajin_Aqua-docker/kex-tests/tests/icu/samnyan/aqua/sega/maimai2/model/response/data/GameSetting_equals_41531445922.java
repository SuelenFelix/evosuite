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

public class GameSetting_equals_41531445922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5216;
     Object term5294;

    public GameSetting_equals_41531445922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5216 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term5216, term5216.getClass(), "isMaintenance", true);
        setIntField(term5216, term5216.getClass(), "requestInterval", 1297035285);
        setField(term5216, term5216.getClass(), "rebootStartTime", "AjoFvDFyCY");
        setField(term5216, term5216.getClass(), "rebootEndTime", "OFTJwdPiTG");
        setIntField(term5216, term5216.getClass(), "movieUploadLimit", -826239685);
        setIntField(term5216, term5216.getClass(), "movieStatus", -845551243);
        setField(term5216, term5216.getClass(), "movieServerUri", "QiUprSEluR");
        setField(term5216, term5216.getClass(), "deliverServerUri", "cDOXXottZh");
        setField(term5216, term5216.getClass(), "oldServerUri", "rfqJDkDppz");
        setField(term5216, term5216.getClass(), "usbDlServerUri", "MGorMVGauT");
        setIntField(term5216, term5216.getClass(), "rebootInterval", 370671198);
        term5294 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term5294;
        callMethod(klass, "equals", argTypes, term5216, args);
    }

};


