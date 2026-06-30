package icu.samnyan.aqua.sega.diva.model.userdata;

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
import static icu.samnyan.aqua.sega.diva.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PlayLog_setScreenShotCount_1619714109162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357114;
     Object term357145;

    public PlayLog_setScreenShotCount_1619714109162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357114 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term357114, term357114.getClass(), "id", 0L);
        setField(term357114, term357114.getClass(), "pdId", null);
        setIntField(term357114, term357114.getClass(), "pvId", 0);
        setField(term357114, term357114.getClass(), "difficulty", null);
        setField(term357114, term357114.getClass(), "edition", null);
        setIntField(term357114, term357114.getClass(), "scriptVer", 0);
        setIntField(term357114, term357114.getClass(), "score", 0);
        setField(term357114, term357114.getClass(), "challengeKind", null);
        setIntField(term357114, term357114.getClass(), "challengeResult", 0);
        setField(term357114, term357114.getClass(), "clearResult", null);
        setIntField(term357114, term357114.getClass(), "vp", 0);
        setIntField(term357114, term357114.getClass(), "coolCount", 0);
        setIntField(term357114, term357114.getClass(), "coolPercent", 0);
        setIntField(term357114, term357114.getClass(), "fineCount", 0);
        setIntField(term357114, term357114.getClass(), "finePercent", 0);
        setIntField(term357114, term357114.getClass(), "safeCount", 0);
        setIntField(term357114, term357114.getClass(), "safePercent", 0);
        setIntField(term357114, term357114.getClass(), "sadCount", 0);
        setIntField(term357114, term357114.getClass(), "sadPercent", 0);
        setIntField(term357114, term357114.getClass(), "wrongCount", 0);
        setIntField(term357114, term357114.getClass(), "wrongPercent", 0);
        setIntField(term357114, term357114.getClass(), "maxCombo", 0);
        setIntField(term357114, term357114.getClass(), "chanceTime", 0);
        setIntField(term357114, term357114.getClass(), "holdScore", 0);
        setIntField(term357114, term357114.getClass(), "attainPoint", 0);
        setIntField(term357114, term357114.getClass(), "skinId", 0);
        setIntField(term357114, term357114.getClass(), "buttonSe", 0);
        setIntField(term357114, term357114.getClass(), "buttonSeVol", 0);
        setIntField(term357114, term357114.getClass(), "sliderSe", 0);
        setIntField(term357114, term357114.getClass(), "ChainSlideSe", 0);
        setIntField(term357114, term357114.getClass(), "SliderTouchSe", 0);
        setField(term357114, term357114.getClass(), "modules", null);
        setIntField(term357114, term357114.getClass(), "stageCompletion", 0);
        setIntField(term357114, term357114.getClass(), "slideScore", 0);
        setIntField(term357114, term357114.getClass(), "isVocalChange", 0);
        setField(term357114, term357114.getClass(), "customizeItems", null);
        setField(term357114, term357114.getClass(), "rhythmGameOptions", null);
        setIntField(term357114, term357114.getClass(), "screenShotCount", 0);
        setField(term357114, term357114.getClass(), "dateTime", null);
        term357145 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term357145;
        callMethod(klass, "setScreenShotCount", argTypes, term357114, args);
    }

};


