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
import java.lang.Integer;

public class GameSetting_setRequestInterval_74753421016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5536;
     Object term5594;

    public GameSetting_setRequestInterval_74753421016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5536 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting"));
        setField(term5536, term5536.getClass(), "dataVersion", "pqFUMTCKJd");
        setField(term5536, term5536.getClass(), "onlineDataVersion", "PTEndmPMzk");
        setBooleanField(term5536, term5536.getClass(), "isMaintenance", false);
        setIntField(term5536, term5536.getClass(), "requestInterval", 2129957018);
        setField(term5536, term5536.getClass(), "rebootStartTime", "aJQuCOCvZs");
        setField(term5536, term5536.getClass(), "rebootEndTime", "lHYNCJRiOv");
        setBooleanField(term5536, term5536.getClass(), "isBackgroundDistribute", false);
        setIntField(term5536, term5536.getClass(), "maxCountCharacter", 691663312);
        setIntField(term5536, term5536.getClass(), "maxCountCard", -1236696275);
        setIntField(term5536, term5536.getClass(), "maxCountItem", 575249858);
        setIntField(term5536, term5536.getClass(), "maxCountMusic", -297957951);
        setIntField(term5536, term5536.getClass(), "maxCountMusicItem", -1816920588);
        setIntField(term5536, term5536.getClass(), "macCountRivalMusic", 1674165862);
        term5594 = new Integer(1875252647);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.response.data.GameSetting");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5594;
        callMethod(klass, "setRequestInterval", argTypes, term5536, args);
    }

};


