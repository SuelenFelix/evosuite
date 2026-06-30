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

public class GetGameSettingResp_getGameSetting_9826350160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67;

    public GetGameSettingResp_getGameSetting_9826350160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp"));
        Object term68 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term68, term68.getClass(), "dataVersion", "PAEBtnZtTD");
        setField(term68, term68.getClass(), "onlineDataVersion", "sjlJAEtRrb");
        setBooleanField(term68, term68.getClass(), "isMaintenance", false);
        setIntField(term68, term68.getClass(), "requestInterval", -655067527);
        setField(term68, term68.getClass(), "rebootStartTime", "MuLcgQHgqz");
        setField(term68, term68.getClass(), "rebootEndTime", "xxtlPwDYFs");
        setBooleanField(term68, term68.getClass(), "isBackgroundDistribute", false);
        setIntField(term68, term68.getClass(), "maxCountCharacter", -6029667);
        setIntField(term68, term68.getClass(), "maxCountCard", -2068769794);
        setIntField(term68, term68.getClass(), "maxCountItem", -117576464);
        setIntField(term68, term68.getClass(), "maxCountMusic", -1007160944);
        setIntField(term68, term68.getClass(), "maxCountMusicItem", 1135664017);
        setIntField(term68, term68.getClass(), "macCountRivalMusic", 590364439);
        setField(term67, term67.getClass(), "gameSetting", term68);
        setBooleanField(term67, term67.getClass(), "isDumpUpload", false);
        setBooleanField(term67, term67.getClass(), "isAou", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGameSetting", argTypes, term67, args);
    }

};


