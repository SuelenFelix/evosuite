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

public class GetGameSettingResp_equals_11655408696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term775;
     Object term836;

    public GetGameSettingResp_equals_11655408696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term775 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp"));
        Object term776 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term776, term776.getClass(), "dataVersion", "IoAlmYsBwc");
        setField(term776, term776.getClass(), "onlineDataVersion", "TEParAifyi");
        setBooleanField(term776, term776.getClass(), "isMaintenance", true);
        setIntField(term776, term776.getClass(), "requestInterval", 933028652);
        setField(term776, term776.getClass(), "rebootStartTime", "OWDIEULEFu");
        setField(term776, term776.getClass(), "rebootEndTime", "dWRymuLBtr");
        setBooleanField(term776, term776.getClass(), "isBackgroundDistribute", true);
        setIntField(term776, term776.getClass(), "maxCountCharacter", 287287233);
        setIntField(term776, term776.getClass(), "maxCountCard", 962840079);
        setIntField(term776, term776.getClass(), "maxCountItem", 1540719661);
        setIntField(term776, term776.getClass(), "maxCountMusic", 1265463001);
        setIntField(term776, term776.getClass(), "maxCountMusicItem", 335112684);
        setIntField(term776, term776.getClass(), "macCountRivalMusic", 1551099402);
        setField(term775, term775.getClass(), "gameSetting", term776);
        setBooleanField(term775, term775.getClass(), "isDumpUpload", true);
        setBooleanField(term775, term775.getClass(), "isAou", true);
        term836 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term836;
        callMethod(klass, "equals", argTypes, term775, args);
    }

};


