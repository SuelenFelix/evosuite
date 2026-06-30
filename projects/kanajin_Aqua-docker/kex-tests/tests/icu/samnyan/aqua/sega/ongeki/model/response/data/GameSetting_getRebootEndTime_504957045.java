package icu.samnyan.aqua.sega.ongeki.model.response.data;

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
import static icu.samnyan.aqua.sega.ongeki.model.response.data.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class GameSetting_getRebootEndTime_504957045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4412;

    public GameSetting_getRebootEndTime_504957045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4412 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term4412, term4412.getClass(), "dataVersion", "XZkOUcbfFg");
        setField(term4412, term4412.getClass(), "onlineDataVersion", "TGiJfagfky");
        setBooleanField(term4412, term4412.getClass(), "isMaintenance", true);
        setIntField(term4412, term4412.getClass(), "requestInterval", 25560022);
        setField(term4412, term4412.getClass(), "rebootStartTime", "BJklinBmhN");
        setField(term4412, term4412.getClass(), "rebootEndTime", "IOddzvEWcl");
        setBooleanField(term4412, term4412.getClass(), "isBackgroundDistribute", false);
        setIntField(term4412, term4412.getClass(), "maxCountCharacter", -1090136985);
        setIntField(term4412, term4412.getClass(), "maxCountCard", -355574894);
        setIntField(term4412, term4412.getClass(), "maxCountItem", 1866941633);
        setIntField(term4412, term4412.getClass(), "maxCountMusic", 1697296048);
        setIntField(term4412, term4412.getClass(), "maxCountMusicItem", 1302075623);
        setIntField(term4412, term4412.getClass(), "macCountRivalMusic", 1238707613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getRebootEndTime", argTypes, term4412, args);
    }

};


