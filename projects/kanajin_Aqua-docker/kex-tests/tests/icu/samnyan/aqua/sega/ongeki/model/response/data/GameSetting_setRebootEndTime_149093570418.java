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

public class GameSetting_setRebootEndTime_149093570418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5756;

    public GameSetting_setRebootEndTime_149093570418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5756 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term5756, term5756.getClass(), "dataVersion", "wUcSfItZgv");
        setField(term5756, term5756.getClass(), "onlineDataVersion", "rOfPCPHmtJ");
        setBooleanField(term5756, term5756.getClass(), "isMaintenance", true);
        setIntField(term5756, term5756.getClass(), "requestInterval", -710001354);
        setField(term5756, term5756.getClass(), "rebootStartTime", "EnmiAvfpJv");
        setField(term5756, term5756.getClass(), "rebootEndTime", "AdYzLPMcwe");
        setBooleanField(term5756, term5756.getClass(), "isBackgroundDistribute", false);
        setIntField(term5756, term5756.getClass(), "maxCountCharacter", 2007404429);
        setIntField(term5756, term5756.getClass(), "maxCountCard", 472580433);
        setIntField(term5756, term5756.getClass(), "maxCountItem", 1189049164);
        setIntField(term5756, term5756.getClass(), "maxCountMusic", -673413879);
        setIntField(term5756, term5756.getClass(), "maxCountMusicItem", 1609778442);
        setIntField(term5756, term5756.getClass(), "macCountRivalMusic", 524850421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "FrTZLybkKk";
        callMethod(klass, "setRebootEndTime", argTypes, term5756, args);
    }

};


