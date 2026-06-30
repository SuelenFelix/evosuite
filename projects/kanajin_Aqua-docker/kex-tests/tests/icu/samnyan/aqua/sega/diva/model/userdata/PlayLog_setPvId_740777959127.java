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

public class PlayLog_setPvId_740777959127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term355973;
     Object term356004;

    public PlayLog_setPvId_740777959127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term355973 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term355973, term355973.getClass(), "id", 0L);
        setField(term355973, term355973.getClass(), "pdId", null);
        setIntField(term355973, term355973.getClass(), "pvId", 0);
        setField(term355973, term355973.getClass(), "difficulty", null);
        setField(term355973, term355973.getClass(), "edition", null);
        setIntField(term355973, term355973.getClass(), "scriptVer", 0);
        setIntField(term355973, term355973.getClass(), "score", 0);
        setField(term355973, term355973.getClass(), "challengeKind", null);
        setIntField(term355973, term355973.getClass(), "challengeResult", 0);
        setField(term355973, term355973.getClass(), "clearResult", null);
        setIntField(term355973, term355973.getClass(), "vp", 0);
        setIntField(term355973, term355973.getClass(), "coolCount", 0);
        setIntField(term355973, term355973.getClass(), "coolPercent", 0);
        setIntField(term355973, term355973.getClass(), "fineCount", 0);
        setIntField(term355973, term355973.getClass(), "finePercent", 0);
        setIntField(term355973, term355973.getClass(), "safeCount", 0);
        setIntField(term355973, term355973.getClass(), "safePercent", 0);
        setIntField(term355973, term355973.getClass(), "sadCount", 0);
        setIntField(term355973, term355973.getClass(), "sadPercent", 0);
        setIntField(term355973, term355973.getClass(), "wrongCount", 0);
        setIntField(term355973, term355973.getClass(), "wrongPercent", 0);
        setIntField(term355973, term355973.getClass(), "maxCombo", 0);
        setIntField(term355973, term355973.getClass(), "chanceTime", 0);
        setIntField(term355973, term355973.getClass(), "holdScore", 0);
        setIntField(term355973, term355973.getClass(), "attainPoint", 0);
        setIntField(term355973, term355973.getClass(), "skinId", 0);
        setIntField(term355973, term355973.getClass(), "buttonSe", 0);
        setIntField(term355973, term355973.getClass(), "buttonSeVol", 0);
        setIntField(term355973, term355973.getClass(), "sliderSe", 0);
        setIntField(term355973, term355973.getClass(), "ChainSlideSe", 0);
        setIntField(term355973, term355973.getClass(), "SliderTouchSe", 0);
        setField(term355973, term355973.getClass(), "modules", null);
        setIntField(term355973, term355973.getClass(), "stageCompletion", 0);
        setIntField(term355973, term355973.getClass(), "slideScore", 0);
        setIntField(term355973, term355973.getClass(), "isVocalChange", 0);
        setField(term355973, term355973.getClass(), "customizeItems", null);
        setField(term355973, term355973.getClass(), "rhythmGameOptions", null);
        setIntField(term355973, term355973.getClass(), "screenShotCount", 0);
        setField(term355973, term355973.getClass(), "dateTime", null);
        term356004 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term356004;
        callMethod(klass, "setPvId", argTypes, term355973, args);
    }

};


