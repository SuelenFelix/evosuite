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

public class GetGameSettingResp_isAouAccession_10394675910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public GetGameSettingResp_isAouAccession_10394675910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp"));
        Object term3 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term1, term1.getClass(), "isAouAccession", false);
        setBooleanField(term3, term3.getClass(), "isMaintenance", false);
        setIntField(term3, term3.getClass(), "requestInterval", 568599855);
        setField(term3, term3.getClass(), "rebootStartTime", "PAEBtnZtTD");
        setField(term3, term3.getClass(), "rebootEndTime", "sjlJAEtRrb");
        setIntField(term3, term3.getClass(), "movieUploadLimit", 1162663216);
        setIntField(term3, term3.getClass(), "movieStatus", 1484323161);
        setField(term3, term3.getClass(), "movieServerUri", "MuLcgQHgqz");
        setField(term3, term3.getClass(), "deliverServerUri", "xxtlPwDYFs");
        setField(term3, term3.getClass(), "oldServerUri", "jJCZpVmanW");
        setField(term3, term3.getClass(), "usbDlServerUri", "EGtDIRbSSb");
        setField(term1, term1.getClass(), "gameSetting", term3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAouAccession", argTypes, term1, args);
    }

};


