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
import java.lang.Boolean;

public class GetGameSettingResp_init_129047873010 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1181;
     Object term1239;
     Object term1241;

    public GetGameSettingResp_init_129047873010() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1181 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term1181, term1181.getClass(), "dataVersion", "BndsHwAFMv");
        setField(term1181, term1181.getClass(), "onlineDataVersion", "GzFkzHGYFt");
        setBooleanField(term1181, term1181.getClass(), "isMaintenance", false);
        setIntField(term1181, term1181.getClass(), "requestInterval", -1263114719);
        setField(term1181, term1181.getClass(), "rebootStartTime", "tShwQLRGNe");
        setField(term1181, term1181.getClass(), "rebootEndTime", "LvtrsXUliU");
        setBooleanField(term1181, term1181.getClass(), "isBackgroundDistribute", true);
        setIntField(term1181, term1181.getClass(), "maxCountCharacter", -894662986);
        setIntField(term1181, term1181.getClass(), "maxCountCard", 304775596);
        setIntField(term1181, term1181.getClass(), "maxCountItem", -1347665717);
        setIntField(term1181, term1181.getClass(), "maxCountMusic", -1888585309);
        setIntField(term1181, term1181.getClass(), "maxCountMusicItem", 683666002);
        setIntField(term1181, term1181.getClass(), "macCountRivalMusic", 1596213415);
        term1239 = new Boolean(true);
        term1241 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.GetGameSettingResp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        argTypes[1] = boolean.class;
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term1181;
        args[1] = term1239;
        args[2] = term1241;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


