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
import java.lang.Boolean;

public class GetGameSettingResp_setAouAccession_3188778692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281;
     Object term361;

    public GetGameSettingResp_setAouAccession_3188778692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp"));
        Object term283 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term281, term281.getClass(), "isAouAccession", true);
        setBooleanField(term283, term283.getClass(), "isMaintenance", true);
        setIntField(term283, term283.getClass(), "requestInterval", 1227103734);
        setField(term283, term283.getClass(), "rebootStartTime", "MxlszYVzRf");
        setField(term283, term283.getClass(), "rebootEndTime", "LQFpaHEwXR");
        setIntField(term283, term283.getClass(), "movieUploadLimit", -1339778481);
        setIntField(term283, term283.getClass(), "movieStatus", 1725571209);
        setField(term283, term283.getClass(), "movieServerUri", "oVcInYnLWB");
        setField(term283, term283.getClass(), "deliverServerUri", "aJlieCFVtF");
        setField(term283, term283.getClass(), "oldServerUri", "ZiaGIbnzTs");
        setField(term283, term283.getClass(), "usbDlServerUri", "tbcdzjIfER");
        setIntField(term283, term283.getClass(), "rebootInterval", -522618178);
        setField(term281, term281.getClass(), "gameSetting", term283);
        term361 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term361;
        callMethod(klass, "setAouAccession", argTypes, term281, args);
    }

};


