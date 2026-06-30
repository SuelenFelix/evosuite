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

public class GetGameSettingResp_equals_6610985864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term701;
     Object term781;

    public GetGameSettingResp_equals_6610985864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term701 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp"));
        Object term703 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.data.GameSetting"));
        setBooleanField(term701, term701.getClass(), "isAouAccession", false);
        setBooleanField(term703, term703.getClass(), "isMaintenance", true);
        setIntField(term703, term703.getClass(), "requestInterval", -655067527);
        setField(term703, term703.getClass(), "rebootStartTime", "OWDIEULEFu");
        setField(term703, term703.getClass(), "rebootEndTime", "dWRymuLBtr");
        setIntField(term703, term703.getClass(), "movieUploadLimit", -6029667);
        setIntField(term703, term703.getClass(), "movieStatus", -2068769794);
        setField(term703, term703.getClass(), "movieServerUri", "AijpHYOFuy");
        setField(term703, term703.getClass(), "deliverServerUri", "SbAoxhfrkn");
        setField(term703, term703.getClass(), "oldServerUri", "kuTXqwMtDB");
        setField(term703, term703.getClass(), "usbDlServerUri", "Ghbwtircqb");
        setIntField(term703, term703.getClass(), "rebootInterval", -117576464);
        setField(term701, term701.getClass(), "gameSetting", term703);
        term781 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term781;
        callMethod(klass, "equals", argTypes, term701, args);
    }

};


