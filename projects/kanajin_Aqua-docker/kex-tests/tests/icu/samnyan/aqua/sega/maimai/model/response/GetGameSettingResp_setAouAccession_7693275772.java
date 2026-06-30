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
import java.lang.Boolean;

public class GetGameSettingResp_setAouAccession_7693275772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279;
     Object term358;

    public GetGameSettingResp_setAouAccession_7693275772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp"));
        Object term281 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term279, term279.getClass(), "isAouAccession", true);
        setBooleanField(term281, term281.getClass(), "isMaintenance", true);
        setIntField(term281, term281.getClass(), "requestInterval", -1955890973);
        setField(term281, term281.getClass(), "rebootStartTime", "MxlszYVzRf");
        setField(term281, term281.getClass(), "rebootEndTime", "LQFpaHEwXR");
        setIntField(term281, term281.getClass(), "movieUploadLimit", -2038273078);
        setIntField(term281, term281.getClass(), "movieStatus", 1227103734);
        setField(term281, term281.getClass(), "movieServerUri", "oVcInYnLWB");
        setField(term281, term281.getClass(), "deliverServerUri", "aJlieCFVtF");
        setField(term281, term281.getClass(), "oldServerUri", "ZiaGIbnzTs");
        setField(term281, term281.getClass(), "usbDlServerUri", "tbcdzjIfER");
        setField(term279, term279.getClass(), "gameSetting", term281);
        term358 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term358;
        callMethod(klass, "setAouAccession", argTypes, term279, args);
    }

};


