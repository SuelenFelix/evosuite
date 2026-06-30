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

public class PlayLog_setCoolPercent_984865776137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356295;
     Object term356326;

    public PlayLog_setCoolPercent_984865776137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356295 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term356295, term356295.getClass(), "id", 0L);
        setField(term356295, term356295.getClass(), "pdId", null);
        setIntField(term356295, term356295.getClass(), "pvId", 0);
        setField(term356295, term356295.getClass(), "difficulty", null);
        setField(term356295, term356295.getClass(), "edition", null);
        setIntField(term356295, term356295.getClass(), "scriptVer", 0);
        setIntField(term356295, term356295.getClass(), "score", 0);
        setField(term356295, term356295.getClass(), "challengeKind", null);
        setIntField(term356295, term356295.getClass(), "challengeResult", 0);
        setField(term356295, term356295.getClass(), "clearResult", null);
        setIntField(term356295, term356295.getClass(), "vp", 0);
        setIntField(term356295, term356295.getClass(), "coolCount", 0);
        setIntField(term356295, term356295.getClass(), "coolPercent", 0);
        setIntField(term356295, term356295.getClass(), "fineCount", 0);
        setIntField(term356295, term356295.getClass(), "finePercent", 0);
        setIntField(term356295, term356295.getClass(), "safeCount", 0);
        setIntField(term356295, term356295.getClass(), "safePercent", 0);
        setIntField(term356295, term356295.getClass(), "sadCount", 0);
        setIntField(term356295, term356295.getClass(), "sadPercent", 0);
        setIntField(term356295, term356295.getClass(), "wrongCount", 0);
        setIntField(term356295, term356295.getClass(), "wrongPercent", 0);
        setIntField(term356295, term356295.getClass(), "maxCombo", 0);
        setIntField(term356295, term356295.getClass(), "chanceTime", 0);
        setIntField(term356295, term356295.getClass(), "holdScore", 0);
        setIntField(term356295, term356295.getClass(), "attainPoint", 0);
        setIntField(term356295, term356295.getClass(), "skinId", 0);
        setIntField(term356295, term356295.getClass(), "buttonSe", 0);
        setIntField(term356295, term356295.getClass(), "buttonSeVol", 0);
        setIntField(term356295, term356295.getClass(), "sliderSe", 0);
        setIntField(term356295, term356295.getClass(), "ChainSlideSe", 0);
        setIntField(term356295, term356295.getClass(), "SliderTouchSe", 0);
        setField(term356295, term356295.getClass(), "modules", null);
        setIntField(term356295, term356295.getClass(), "stageCompletion", 0);
        setIntField(term356295, term356295.getClass(), "slideScore", 0);
        setIntField(term356295, term356295.getClass(), "isVocalChange", 0);
        setField(term356295, term356295.getClass(), "customizeItems", null);
        setField(term356295, term356295.getClass(), "rhythmGameOptions", null);
        setIntField(term356295, term356295.getClass(), "screenShotCount", 0);
        setField(term356295, term356295.getClass(), "dateTime", null);
        term356326 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term356326;
        callMethod(klass, "setCoolPercent", argTypes, term356295, args);
    }

};


