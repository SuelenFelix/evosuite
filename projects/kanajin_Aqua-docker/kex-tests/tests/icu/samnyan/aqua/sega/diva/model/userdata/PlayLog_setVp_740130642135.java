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

public class PlayLog_setVp_740130642135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term356229;
     Object term356260;

    public PlayLog_setVp_740130642135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term356229 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term356229, term356229.getClass(), "id", 0L);
        setField(term356229, term356229.getClass(), "pdId", null);
        setIntField(term356229, term356229.getClass(), "pvId", 0);
        setField(term356229, term356229.getClass(), "difficulty", null);
        setField(term356229, term356229.getClass(), "edition", null);
        setIntField(term356229, term356229.getClass(), "scriptVer", 0);
        setIntField(term356229, term356229.getClass(), "score", 0);
        setField(term356229, term356229.getClass(), "challengeKind", null);
        setIntField(term356229, term356229.getClass(), "challengeResult", 0);
        setField(term356229, term356229.getClass(), "clearResult", null);
        setIntField(term356229, term356229.getClass(), "vp", 0);
        setIntField(term356229, term356229.getClass(), "coolCount", 0);
        setIntField(term356229, term356229.getClass(), "coolPercent", 0);
        setIntField(term356229, term356229.getClass(), "fineCount", 0);
        setIntField(term356229, term356229.getClass(), "finePercent", 0);
        setIntField(term356229, term356229.getClass(), "safeCount", 0);
        setIntField(term356229, term356229.getClass(), "safePercent", 0);
        setIntField(term356229, term356229.getClass(), "sadCount", 0);
        setIntField(term356229, term356229.getClass(), "sadPercent", 0);
        setIntField(term356229, term356229.getClass(), "wrongCount", 0);
        setIntField(term356229, term356229.getClass(), "wrongPercent", 0);
        setIntField(term356229, term356229.getClass(), "maxCombo", 0);
        setIntField(term356229, term356229.getClass(), "chanceTime", 0);
        setIntField(term356229, term356229.getClass(), "holdScore", 0);
        setIntField(term356229, term356229.getClass(), "attainPoint", 0);
        setIntField(term356229, term356229.getClass(), "skinId", 0);
        setIntField(term356229, term356229.getClass(), "buttonSe", 0);
        setIntField(term356229, term356229.getClass(), "buttonSeVol", 0);
        setIntField(term356229, term356229.getClass(), "sliderSe", 0);
        setIntField(term356229, term356229.getClass(), "ChainSlideSe", 0);
        setIntField(term356229, term356229.getClass(), "SliderTouchSe", 0);
        setField(term356229, term356229.getClass(), "modules", null);
        setIntField(term356229, term356229.getClass(), "stageCompletion", 0);
        setIntField(term356229, term356229.getClass(), "slideScore", 0);
        setIntField(term356229, term356229.getClass(), "isVocalChange", 0);
        setField(term356229, term356229.getClass(), "customizeItems", null);
        setField(term356229, term356229.getClass(), "rhythmGameOptions", null);
        setIntField(term356229, term356229.getClass(), "screenShotCount", 0);
        setField(term356229, term356229.getClass(), "dateTime", null);
        term356260 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term356260;
        callMethod(klass, "setVp", argTypes, term356229, args);
    }

};


