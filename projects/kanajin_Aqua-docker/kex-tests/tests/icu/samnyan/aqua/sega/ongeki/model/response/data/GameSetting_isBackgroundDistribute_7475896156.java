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

public class GameSetting_isBackgroundDistribute_7475896156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4510;

    public GameSetting_isBackgroundDistribute_7475896156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4510 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term4510, term4510.getClass(), "dataVersion", "bIrtpkYJWT");
        setField(term4510, term4510.getClass(), "onlineDataVersion", "VuLLXpvPpZ");
        setBooleanField(term4510, term4510.getClass(), "isMaintenance", false);
        setIntField(term4510, term4510.getClass(), "requestInterval", 1961351136);
        setField(term4510, term4510.getClass(), "rebootStartTime", "UEdzEKEEEV");
        setField(term4510, term4510.getClass(), "rebootEndTime", "BcENaQFYSd");
        setBooleanField(term4510, term4510.getClass(), "isBackgroundDistribute", true);
        setIntField(term4510, term4510.getClass(), "maxCountCharacter", -1546528470);
        setIntField(term4510, term4510.getClass(), "maxCountCard", -1518971561);
        setIntField(term4510, term4510.getClass(), "maxCountItem", 1513663171);
        setIntField(term4510, term4510.getClass(), "maxCountMusic", 1527034193);
        setIntField(term4510, term4510.getClass(), "maxCountMusicItem", 1309545946);
        setIntField(term4510, term4510.getClass(), "macCountRivalMusic", -1457812682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBackgroundDistribute", argTypes, term4510, args);
    }

};


