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

public class GetGameSettingResp_equals_17493040324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term696;
     Object term775;

    public GetGameSettingResp_equals_17493040324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term696 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp"));
        Object term698 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.response.data.GameSetting"));
        setBooleanField(term696, term696.getClass(), "isAouAccession", false);
        setBooleanField(term698, term698.getClass(), "isMaintenance", true);
        setIntField(term698, term698.getClass(), "requestInterval", 597278769);
        setField(term698, term698.getClass(), "rebootStartTime", "OWDIEULEFu");
        setField(term698, term698.getClass(), "rebootEndTime", "dWRymuLBtr");
        setIntField(term698, term698.getClass(), "movieUploadLimit", -1685132342);
        setIntField(term698, term698.getClass(), "movieStatus", -1456670397);
        setField(term698, term698.getClass(), "movieServerUri", "AijpHYOFuy");
        setField(term698, term698.getClass(), "deliverServerUri", "SbAoxhfrkn");
        setField(term698, term698.getClass(), "oldServerUri", "kuTXqwMtDB");
        setField(term698, term698.getClass(), "usbDlServerUri", "Ghbwtircqb");
        setField(term696, term696.getClass(), "gameSetting", term698);
        term775 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term775;
        callMethod(klass, "equals", argTypes, term696, args);
    }

};


