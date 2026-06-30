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

public class GetGameSettingResp_isAou_17262828922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term269;

    public GetGameSettingResp_isAou_17262828922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term269 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp"));
        Object term270 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term270, term270.getClass(), "dataVersion", "hRNSzYYIrc");
        setField(term270, term270.getClass(), "onlineDataVersion", "RMFIsYGgne");
        setBooleanField(term270, term270.getClass(), "isMaintenance", false);
        setIntField(term270, term270.getClass(), "requestInterval", 1193880199);
        setField(term270, term270.getClass(), "rebootStartTime", "NRdvgJlhkX");
        setField(term270, term270.getClass(), "rebootEndTime", "uuaPigETmJ");
        setBooleanField(term270, term270.getClass(), "isBackgroundDistribute", true);
        setIntField(term270, term270.getClass(), "maxCountCharacter", -1087774327);
        setIntField(term270, term270.getClass(), "maxCountCard", -1530420153);
        setIntField(term270, term270.getClass(), "maxCountItem", -469968304);
        setIntField(term270, term270.getClass(), "maxCountMusic", -1145578966);
        setIntField(term270, term270.getClass(), "maxCountMusicItem", 679763016);
        setIntField(term270, term270.getClass(), "macCountRivalMusic", 1962444399);
        setField(term269, term269.getClass(), "gameSetting", term270);
        setBooleanField(term269, term269.getClass(), "isDumpUpload", false);
        setBooleanField(term269, term269.getClass(), "isAou", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAou", argTypes, term269, args);
    }

};


