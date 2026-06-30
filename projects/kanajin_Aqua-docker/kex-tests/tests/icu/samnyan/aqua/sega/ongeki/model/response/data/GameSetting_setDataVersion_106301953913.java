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

public class GameSetting_setDataVersion_106301953913 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5196;

    public GameSetting_setDataVersion_106301953913() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5196 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term5196, term5196.getClass(), "dataVersion", "mrqGHotaef");
        setField(term5196, term5196.getClass(), "onlineDataVersion", "UbZGBpQZQW");
        setBooleanField(term5196, term5196.getClass(), "isMaintenance", true);
        setIntField(term5196, term5196.getClass(), "requestInterval", 125432890);
        setField(term5196, term5196.getClass(), "rebootStartTime", "SvGTualQPa");
        setField(term5196, term5196.getClass(), "rebootEndTime", "mdxcgZwsaP");
        setBooleanField(term5196, term5196.getClass(), "isBackgroundDistribute", true);
        setIntField(term5196, term5196.getClass(), "maxCountCharacter", -197740561);
        setIntField(term5196, term5196.getClass(), "maxCountCard", -1811706962);
        setIntField(term5196, term5196.getClass(), "maxCountItem", -1242133071);
        setIntField(term5196, term5196.getClass(), "maxCountMusic", -455052015);
        setIntField(term5196, term5196.getClass(), "maxCountMusicItem", -1322797287);
        setIntField(term5196, term5196.getClass(), "macCountRivalMusic", -615198242);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "XildIRoZHG";
        callMethod(klass, "setDataVersion", argTypes, term5196, args);
    }

};


