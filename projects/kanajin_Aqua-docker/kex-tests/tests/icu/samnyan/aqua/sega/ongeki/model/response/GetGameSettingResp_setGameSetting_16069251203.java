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

public class GetGameSettingResp_setGameSetting_16069251203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term370;
     Object term431;

    public GetGameSettingResp_setGameSetting_16069251203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term370 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp"));
        Object term371 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term371, term371.getClass(), "dataVersion", "MxlszYVzRf");
        setField(term371, term371.getClass(), "onlineDataVersion", "LQFpaHEwXR");
        setBooleanField(term371, term371.getClass(), "isMaintenance", false);
        setIntField(term371, term371.getClass(), "requestInterval", 767834723);
        setField(term371, term371.getClass(), "rebootStartTime", "oVcInYnLWB");
        setField(term371, term371.getClass(), "rebootEndTime", "aJlieCFVtF");
        setBooleanField(term371, term371.getClass(), "isBackgroundDistribute", true);
        setIntField(term371, term371.getClass(), "maxCountCharacter", -602026508);
        setIntField(term371, term371.getClass(), "maxCountCard", -157887805);
        setIntField(term371, term371.getClass(), "maxCountItem", 1876565163);
        setIntField(term371, term371.getClass(), "maxCountMusic", -817164822);
        setIntField(term371, term371.getClass(), "maxCountMusicItem", -1016503459);
        setIntField(term371, term371.getClass(), "macCountRivalMusic", -1968847291);
        setField(term370, term370.getClass(), "gameSetting", term371);
        setBooleanField(term370, term370.getClass(), "isDumpUpload", false);
        setBooleanField(term370, term370.getClass(), "isAou", false);
        term431 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term431, term431.getClass(), "dataVersion", "ZiaGIbnzTs");
        setField(term431, term431.getClass(), "onlineDataVersion", "tbcdzjIfER");
        setBooleanField(term431, term431.getClass(), "isMaintenance", true);
        setIntField(term431, term431.getClass(), "requestInterval", 579005622);
        setField(term431, term431.getClass(), "rebootStartTime", "HyxfbSQYBe");
        setField(term431, term431.getClass(), "rebootEndTime", "pCTimMblYc");
        setBooleanField(term431, term431.getClass(), "isBackgroundDistribute", true);
        setIntField(term431, term431.getClass(), "maxCountCharacter", -14890619);
        setIntField(term431, term431.getClass(), "maxCountCard", 1632125673);
        setIntField(term431, term431.getClass(), "maxCountItem", 454281060);
        setIntField(term431, term431.getClass(), "maxCountMusic", -1786399638);
        setIntField(term431, term431.getClass(), "maxCountMusicItem", 2055867847);
        setIntField(term431, term431.getClass(), "macCountRivalMusic", -1048298087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Object[] args = new Object[1];
        args[0] = term431;
        callMethod(klass, "setGameSetting", argTypes, term370, args);
    }

};


