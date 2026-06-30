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

public class GetGameSettingResp_isDumpUpload_11359778271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26216;

    public GetGameSettingResp_isDumpUpload_11359778271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26216 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp"));
        Object term26217 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.data.GameSetting"));
        setIntField(term26217, term26217.getClass(), "dataVersion", 159279866);
        setBooleanField(term26217, term26217.getClass(), "isMaintenance", false);
        setIntField(term26217, term26217.getClass(), "requestInterval", 138122227);
        setField(term26217, term26217.getClass(), "rebootStartTime", "duOyJsARTD");
        setField(term26217, term26217.getClass(), "rebootEndTime", "xPnOHsNlyc");
        setBooleanField(term26217, term26217.getClass(), "isBackgroundDistribute", false);
        setIntField(term26217, term26217.getClass(), "maxCountCharacter", 1795358995);
        setIntField(term26217, term26217.getClass(), "maxCountItem", -781185864);
        setIntField(term26217, term26217.getClass(), "maxCountMusic", 340500914);
        setField(term26216, term26216.getClass(), "gameSetting", term26217);
        setBooleanField(term26216, term26216.getClass(), "isDumpUpload", true);
        setBooleanField(term26216, term26216.getClass(), "isAou", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isDumpUpload", argTypes, term26216, args);
    }

};


