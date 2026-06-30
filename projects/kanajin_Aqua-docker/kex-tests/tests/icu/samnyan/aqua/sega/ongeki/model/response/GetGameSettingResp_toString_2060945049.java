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

public class GetGameSettingResp_toString_2060945049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1080;

    public GetGameSettingResp_toString_2060945049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1080 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp"));
        Object term1081 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term1081, term1081.getClass(), "dataVersion", "wSQxaModmm");
        setField(term1081, term1081.getClass(), "onlineDataVersion", "UlajhuVLaP");
        setBooleanField(term1081, term1081.getClass(), "isMaintenance", false);
        setIntField(term1081, term1081.getClass(), "requestInterval", -1772434990);
        setField(term1081, term1081.getClass(), "rebootStartTime", "gGSMzuGICf");
        setField(term1081, term1081.getClass(), "rebootEndTime", "hxCBltsObl");
        setBooleanField(term1081, term1081.getClass(), "isBackgroundDistribute", false);
        setIntField(term1081, term1081.getClass(), "maxCountCharacter", -1845499264);
        setIntField(term1081, term1081.getClass(), "maxCountCard", -505439934);
        setIntField(term1081, term1081.getClass(), "maxCountItem", -344842608);
        setIntField(term1081, term1081.getClass(), "maxCountMusic", 941650513);
        setIntField(term1081, term1081.getClass(), "maxCountMusicItem", 444029505);
        setIntField(term1081, term1081.getClass(), "macCountRivalMusic", -1034506028);
        setField(term1080, term1080.getClass(), "gameSetting", term1081);
        setBooleanField(term1080, term1080.getClass(), "isDumpUpload", true);
        setBooleanField(term1080, term1080.getClass(), "isAou", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term1080, args);
    }

};


