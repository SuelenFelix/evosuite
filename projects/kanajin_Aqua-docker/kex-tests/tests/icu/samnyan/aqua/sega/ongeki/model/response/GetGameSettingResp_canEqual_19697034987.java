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

public class GetGameSettingResp_canEqual_19697034987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term877;
     Object term938;

    public GetGameSettingResp_canEqual_19697034987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term877 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp"));
        Object term878 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term878, term878.getClass(), "dataVersion", "AijpHYOFuy");
        setField(term878, term878.getClass(), "onlineDataVersion", "SbAoxhfrkn");
        setBooleanField(term878, term878.getClass(), "isMaintenance", true);
        setIntField(term878, term878.getClass(), "requestInterval", -2027534003);
        setField(term878, term878.getClass(), "rebootStartTime", "kuTXqwMtDB");
        setField(term878, term878.getClass(), "rebootEndTime", "Ghbwtircqb");
        setBooleanField(term878, term878.getClass(), "isBackgroundDistribute", true);
        setIntField(term878, term878.getClass(), "maxCountCharacter", 1063420942);
        setIntField(term878, term878.getClass(), "maxCountCard", 1375330971);
        setIntField(term878, term878.getClass(), "maxCountItem", -478195677);
        setIntField(term878, term878.getClass(), "maxCountMusic", 972867650);
        setIntField(term878, term878.getClass(), "maxCountMusicItem", 1655935355);
        setIntField(term878, term878.getClass(), "macCountRivalMusic", -481533957);
        setField(term877, term877.getClass(), "gameSetting", term878);
        setBooleanField(term877, term877.getClass(), "isDumpUpload", false);
        setBooleanField(term877, term877.getClass(), "isAou", true);
        term938 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term938;
        callMethod(klass, "canEqual", argTypes, term877, args);
    }

};


