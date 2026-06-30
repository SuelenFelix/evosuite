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

public class PlayLog_setClearResult_1245767183134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356198;

    public PlayLog_setClearResult_1245767183134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356198 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term356198, term356198.getClass(), "id", 0L);
        setField(term356198, term356198.getClass(), "pdId", null);
        setIntField(term356198, term356198.getClass(), "pvId", 0);
        setField(term356198, term356198.getClass(), "difficulty", null);
        setField(term356198, term356198.getClass(), "edition", null);
        setIntField(term356198, term356198.getClass(), "scriptVer", 0);
        setIntField(term356198, term356198.getClass(), "score", 0);
        setField(term356198, term356198.getClass(), "challengeKind", null);
        setIntField(term356198, term356198.getClass(), "challengeResult", 0);
        setField(term356198, term356198.getClass(), "clearResult", null);
        setIntField(term356198, term356198.getClass(), "vp", 0);
        setIntField(term356198, term356198.getClass(), "coolCount", 0);
        setIntField(term356198, term356198.getClass(), "coolPercent", 0);
        setIntField(term356198, term356198.getClass(), "fineCount", 0);
        setIntField(term356198, term356198.getClass(), "finePercent", 0);
        setIntField(term356198, term356198.getClass(), "safeCount", 0);
        setIntField(term356198, term356198.getClass(), "safePercent", 0);
        setIntField(term356198, term356198.getClass(), "sadCount", 0);
        setIntField(term356198, term356198.getClass(), "sadPercent", 0);
        setIntField(term356198, term356198.getClass(), "wrongCount", 0);
        setIntField(term356198, term356198.getClass(), "wrongPercent", 0);
        setIntField(term356198, term356198.getClass(), "maxCombo", 0);
        setIntField(term356198, term356198.getClass(), "chanceTime", 0);
        setIntField(term356198, term356198.getClass(), "holdScore", 0);
        setIntField(term356198, term356198.getClass(), "attainPoint", 0);
        setIntField(term356198, term356198.getClass(), "skinId", 0);
        setIntField(term356198, term356198.getClass(), "buttonSe", 0);
        setIntField(term356198, term356198.getClass(), "buttonSeVol", 0);
        setIntField(term356198, term356198.getClass(), "sliderSe", 0);
        setIntField(term356198, term356198.getClass(), "ChainSlideSe", 0);
        setIntField(term356198, term356198.getClass(), "SliderTouchSe", 0);
        setField(term356198, term356198.getClass(), "modules", null);
        setIntField(term356198, term356198.getClass(), "stageCompletion", 0);
        setIntField(term356198, term356198.getClass(), "slideScore", 0);
        setIntField(term356198, term356198.getClass(), "isVocalChange", 0);
        setField(term356198, term356198.getClass(), "customizeItems", null);
        setField(term356198, term356198.getClass(), "rhythmGameOptions", null);
        setIntField(term356198, term356198.getClass(), "screenShotCount", 0);
        setField(term356198, term356198.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.ClearResult");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setClearResult", argTypes, term356198, args);
    }

};


