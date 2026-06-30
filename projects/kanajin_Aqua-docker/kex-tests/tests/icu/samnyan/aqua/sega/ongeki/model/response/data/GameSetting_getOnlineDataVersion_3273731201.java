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

public class GameSetting_getOnlineDataVersion_3273731201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4020;

    public GameSetting_getOnlineDataVersion_3273731201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4020 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term4020, term4020.getClass(), "dataVersion", "IiNCZfdouL");
        setField(term4020, term4020.getClass(), "onlineDataVersion", "AhOHzCsHKW");
        setBooleanField(term4020, term4020.getClass(), "isMaintenance", true);
        setIntField(term4020, term4020.getClass(), "requestInterval", -230022261);
        setField(term4020, term4020.getClass(), "rebootStartTime", "UqgLPaaAHi");
        setField(term4020, term4020.getClass(), "rebootEndTime", "xypryEkUPF");
        setBooleanField(term4020, term4020.getClass(), "isBackgroundDistribute", true);
        setIntField(term4020, term4020.getClass(), "maxCountCharacter", 831967494);
        setIntField(term4020, term4020.getClass(), "maxCountCard", -1858635791);
        setIntField(term4020, term4020.getClass(), "maxCountItem", 1919079331);
        setIntField(term4020, term4020.getClass(), "maxCountMusic", 144872711);
        setIntField(term4020, term4020.getClass(), "maxCountMusicItem", -720037395);
        setIntField(term4020, term4020.getClass(), "macCountRivalMusic", 1232105469);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOnlineDataVersion", argTypes, term4020, args);
    }

};


