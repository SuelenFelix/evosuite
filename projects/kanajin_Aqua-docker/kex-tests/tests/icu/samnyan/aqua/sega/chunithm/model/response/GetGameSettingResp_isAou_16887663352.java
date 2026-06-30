package icu.samnyan.aqua.sega.chunithm.model.response;

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
import static icu.samnyan.aqua.sega.chunithm.model.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GetGameSettingResp_isAou_16887663352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26271;

    public GetGameSettingResp_isAou_16887663352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26271 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp"));
        Object term26272 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term26272, term26272.getClass(), "dataVersion", -2061712635);
        setBooleanField(term26272, term26272.getClass(), "isMaintenance", true);
        setIntField(term26272, term26272.getClass(), "requestInterval", 1182911731);
        setField(term26272, term26272.getClass(), "rebootStartTime", "OTSPWPJefj");
        setField(term26272, term26272.getClass(), "rebootEndTime", "EOTYMqXRmE");
        setBooleanField(term26272, term26272.getClass(), "isBackgroundDistribute", false);
        setIntField(term26272, term26272.getClass(), "maxCountCharacter", 644726932);
        setIntField(term26272, term26272.getClass(), "maxCountItem", -1515977761);
        setIntField(term26272, term26272.getClass(), "maxCountMusic", -1476037190);
        setField(term26271, term26271.getClass(), "gameSetting", term26272);
        setBooleanField(term26271, term26271.getClass(), "isDumpUpload", true);
        setBooleanField(term26271, term26271.getClass(), "isAou", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAou", argTypes, term26271, args);
    }

};


