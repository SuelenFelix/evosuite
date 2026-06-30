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

public class GetGameSettingResp_getGameSetting_13933533041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141;

    public GetGameSettingResp_getGameSetting_13933533041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp"));
        Object term143 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term141, term141.getClass(), "isAouAccession", false);
        setBooleanField(term143, term143.getClass(), "isMaintenance", false);
        setIntField(term143, term143.getClass(), "requestInterval", -1922583790);
        setField(term143, term143.getClass(), "rebootStartTime", "SzjVpOQTyS");
        setField(term143, term143.getClass(), "rebootEndTime", "MjGYSRKTNF");
        setIntField(term143, term143.getClass(), "movieUploadLimit", -616727354);
        setIntField(term143, term143.getClass(), "movieStatus", -1955890973);
        setField(term143, term143.getClass(), "movieServerUri", "hRNSzYYIrc");
        setField(term143, term143.getClass(), "deliverServerUri", "RMFIsYGgne");
        setField(term143, term143.getClass(), "oldServerUri", "NRdvgJlhkX");
        setField(term143, term143.getClass(), "usbDlServerUri", "uuaPigETmJ");
        setIntField(term143, term143.getClass(), "rebootInterval", -2038273078);
        setField(term141, term141.getClass(), "gameSetting", term143);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameSetting", argTypes, term141, args);
    }

};


