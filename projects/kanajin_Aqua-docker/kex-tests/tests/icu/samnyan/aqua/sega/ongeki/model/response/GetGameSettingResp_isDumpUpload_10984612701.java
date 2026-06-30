package icu.samnyan.aqua.sega.ongeki.model.response;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GetGameSettingResp_isDumpUpload_10984612701 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168;

    public GetGameSettingResp_isDumpUpload_10984612701() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp"));
        Object term169 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term169, term169.getClass(), "dataVersion", "jJCZpVmanW");
        setField(term169, term169.getClass(), "onlineDataVersion", "EGtDIRbSSb");
        setBooleanField(term169, term169.getClass(), "isMaintenance", true);
        setIntField(term169, term169.getClass(), "requestInterval", 865208305);
        setField(term169, term169.getClass(), "rebootStartTime", "SzjVpOQTyS");
        setField(term169, term169.getClass(), "rebootEndTime", "MjGYSRKTNF");
        setBooleanField(term169, term169.getClass(), "isBackgroundDistribute", true);
        setIntField(term169, term169.getClass(), "maxCountCharacter", -1275173084);
        setIntField(term169, term169.getClass(), "maxCountCard", -244121226);
        setIntField(term169, term169.getClass(), "maxCountItem", -203030934);
        setIntField(term169, term169.getClass(), "maxCountMusic", -1179120542);
        setIntField(term169, term169.getClass(), "maxCountMusicItem", -73683645);
        setIntField(term169, term169.getClass(), "macCountRivalMusic", -226514366);
        setField(term168, term168.getClass(), "gameSetting", term169);
        setBooleanField(term168, term168.getClass(), "isDumpUpload", true);
        setBooleanField(term168, term168.getClass(), "isAou", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDumpUpload", argTypes, term168, args);
    }

};


