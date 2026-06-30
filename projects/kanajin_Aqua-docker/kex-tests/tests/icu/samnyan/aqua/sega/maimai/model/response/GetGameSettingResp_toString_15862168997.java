package icu.samnyan.aqua.sega.maimai.model.response;

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
import static icu.samnyan.aqua.sega.maimai.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GetGameSettingResp_toString_15862168997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1115;

    public GetGameSettingResp_toString_15862168997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1115 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp"));
        Object term1117 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term1115, term1115.getClass(), "isAouAccession", true);
        setBooleanField(term1117, term1117.getClass(), "isMaintenance", true);
        setIntField(term1117, term1117.getClass(), "requestInterval", -1007160944);
        setField(term1117, term1117.getClass(), "rebootStartTime", "xLbjWUgOIL");
        setField(term1117, term1117.getClass(), "rebootEndTime", "jDtqGUpnZN");
        setIntField(term1117, term1117.getClass(), "movieUploadLimit", 1135664017);
        setIntField(term1117, term1117.getClass(), "movieStatus", 590364439);
        setField(term1117, term1117.getClass(), "movieServerUri", "nGKItKLYNC");
        setField(term1117, term1117.getClass(), "deliverServerUri", "UiUYnPrcCi");
        setField(term1117, term1117.getClass(), "oldServerUri", "UoYtihxVaS");
        setField(term1117, term1117.getClass(), "usbDlServerUri", "JDswTTCZHV");
        setField(term1115, term1115.getClass(), "gameSetting", term1117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1115, args);
    }

};


