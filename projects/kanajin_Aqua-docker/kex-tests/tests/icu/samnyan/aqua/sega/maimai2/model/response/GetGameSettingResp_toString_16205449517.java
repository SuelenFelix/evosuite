package icu.samnyan.aqua.sega.maimai2.model.response;

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
import static icu.samnyan.aqua.sega.maimai2.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GetGameSettingResp_toString_16205449517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1123;

    public GetGameSettingResp_toString_16205449517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1123 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp"));
        Object term1125 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term1123, term1123.getClass(), "isAouAccession", true);
        setBooleanField(term1125, term1125.getClass(), "isMaintenance", true);
        setIntField(term1125, term1125.getClass(), "requestInterval", -73683645);
        setField(term1125, term1125.getClass(), "rebootStartTime", "xLbjWUgOIL");
        setField(term1125, term1125.getClass(), "rebootEndTime", "jDtqGUpnZN");
        setIntField(term1125, term1125.getClass(), "movieUploadLimit", -226514366);
        setIntField(term1125, term1125.getClass(), "movieStatus", 1193880199);
        setField(term1125, term1125.getClass(), "movieServerUri", "nGKItKLYNC");
        setField(term1125, term1125.getClass(), "deliverServerUri", "UiUYnPrcCi");
        setField(term1125, term1125.getClass(), "oldServerUri", "UoYtihxVaS");
        setField(term1125, term1125.getClass(), "usbDlServerUri", "JDswTTCZHV");
        setIntField(term1125, term1125.getClass(), "rebootInterval", -1087774327);
        setField(term1123, term1123.getClass(), "gameSetting", term1125);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1123, args);
    }

};


