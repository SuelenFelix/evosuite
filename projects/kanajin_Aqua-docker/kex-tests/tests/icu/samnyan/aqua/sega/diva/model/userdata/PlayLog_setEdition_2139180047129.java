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

public class PlayLog_setEdition_2139180047129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356037;

    public PlayLog_setEdition_2139180047129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356037 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term356037, term356037.getClass(), "id", 0L);
        setField(term356037, term356037.getClass(), "pdId", null);
        setIntField(term356037, term356037.getClass(), "pvId", 0);
        setField(term356037, term356037.getClass(), "difficulty", null);
        setField(term356037, term356037.getClass(), "edition", null);
        setIntField(term356037, term356037.getClass(), "scriptVer", 0);
        setIntField(term356037, term356037.getClass(), "score", 0);
        setField(term356037, term356037.getClass(), "challengeKind", null);
        setIntField(term356037, term356037.getClass(), "challengeResult", 0);
        setField(term356037, term356037.getClass(), "clearResult", null);
        setIntField(term356037, term356037.getClass(), "vp", 0);
        setIntField(term356037, term356037.getClass(), "coolCount", 0);
        setIntField(term356037, term356037.getClass(), "coolPercent", 0);
        setIntField(term356037, term356037.getClass(), "fineCount", 0);
        setIntField(term356037, term356037.getClass(), "finePercent", 0);
        setIntField(term356037, term356037.getClass(), "safeCount", 0);
        setIntField(term356037, term356037.getClass(), "safePercent", 0);
        setIntField(term356037, term356037.getClass(), "sadCount", 0);
        setIntField(term356037, term356037.getClass(), "sadPercent", 0);
        setIntField(term356037, term356037.getClass(), "wrongCount", 0);
        setIntField(term356037, term356037.getClass(), "wrongPercent", 0);
        setIntField(term356037, term356037.getClass(), "maxCombo", 0);
        setIntField(term356037, term356037.getClass(), "chanceTime", 0);
        setIntField(term356037, term356037.getClass(), "holdScore", 0);
        setIntField(term356037, term356037.getClass(), "attainPoint", 0);
        setIntField(term356037, term356037.getClass(), "skinId", 0);
        setIntField(term356037, term356037.getClass(), "buttonSe", 0);
        setIntField(term356037, term356037.getClass(), "buttonSeVol", 0);
        setIntField(term356037, term356037.getClass(), "sliderSe", 0);
        setIntField(term356037, term356037.getClass(), "ChainSlideSe", 0);
        setIntField(term356037, term356037.getClass(), "SliderTouchSe", 0);
        setField(term356037, term356037.getClass(), "modules", null);
        setIntField(term356037, term356037.getClass(), "stageCompletion", 0);
        setIntField(term356037, term356037.getClass(), "slideScore", 0);
        setIntField(term356037, term356037.getClass(), "isVocalChange", 0);
        setField(term356037, term356037.getClass(), "customizeItems", null);
        setField(term356037, term356037.getClass(), "rhythmGameOptions", null);
        setIntField(term356037, term356037.getClass(), "screenShotCount", 0);
        setField(term356037, term356037.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.diva.model.common.Edition");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEdition", argTypes, term356037, args);
    }

};


