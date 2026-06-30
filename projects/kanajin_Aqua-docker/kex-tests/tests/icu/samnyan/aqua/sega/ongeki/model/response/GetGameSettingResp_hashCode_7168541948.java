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

public class GetGameSettingResp_hashCode_7168541948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term979;

    public GetGameSettingResp_hashCode_7168541948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term979 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp"));
        Object term980 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term980, term980.getClass(), "dataVersion", "xrwlQZdwCp");
        setField(term980, term980.getClass(), "onlineDataVersion", "IDCWpPLRkE");
        setBooleanField(term980, term980.getClass(), "isMaintenance", true);
        setIntField(term980, term980.getClass(), "requestInterval", 1240914516);
        setField(term980, term980.getClass(), "rebootStartTime", "nyiiPDVjAc");
        setField(term980, term980.getClass(), "rebootEndTime", "aKnKipADSo");
        setBooleanField(term980, term980.getClass(), "isBackgroundDistribute", true);
        setIntField(term980, term980.getClass(), "maxCountCharacter", -1465035361);
        setIntField(term980, term980.getClass(), "maxCountCard", 1090617576);
        setIntField(term980, term980.getClass(), "maxCountItem", -1547384488);
        setIntField(term980, term980.getClass(), "maxCountMusic", 1442160736);
        setIntField(term980, term980.getClass(), "maxCountMusicItem", 1114000454);
        setIntField(term980, term980.getClass(), "macCountRivalMusic", -556405712);
        setField(term979, term979.getClass(), "gameSetting", term980);
        setBooleanField(term979, term979.getClass(), "isDumpUpload", true);
        setBooleanField(term979, term979.getClass(), "isAou", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term979, args);
    }

};


