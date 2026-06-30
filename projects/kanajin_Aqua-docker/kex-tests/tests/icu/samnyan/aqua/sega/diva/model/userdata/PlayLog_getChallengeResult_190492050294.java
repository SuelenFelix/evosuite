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

public class PlayLog_getChallengeResult_190492050294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354948;

    public PlayLog_getChallengeResult_190492050294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354948 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term354948, term354948.getClass(), "id", 0L);
        setField(term354948, term354948.getClass(), "pdId", null);
        setIntField(term354948, term354948.getClass(), "pvId", 0);
        setField(term354948, term354948.getClass(), "difficulty", null);
        setField(term354948, term354948.getClass(), "edition", null);
        setIntField(term354948, term354948.getClass(), "scriptVer", 0);
        setIntField(term354948, term354948.getClass(), "score", 0);
        setField(term354948, term354948.getClass(), "challengeKind", null);
        setIntField(term354948, term354948.getClass(), "challengeResult", 0);
        setField(term354948, term354948.getClass(), "clearResult", null);
        setIntField(term354948, term354948.getClass(), "vp", 0);
        setIntField(term354948, term354948.getClass(), "coolCount", 0);
        setIntField(term354948, term354948.getClass(), "coolPercent", 0);
        setIntField(term354948, term354948.getClass(), "fineCount", 0);
        setIntField(term354948, term354948.getClass(), "finePercent", 0);
        setIntField(term354948, term354948.getClass(), "safeCount", 0);
        setIntField(term354948, term354948.getClass(), "safePercent", 0);
        setIntField(term354948, term354948.getClass(), "sadCount", 0);
        setIntField(term354948, term354948.getClass(), "sadPercent", 0);
        setIntField(term354948, term354948.getClass(), "wrongCount", 0);
        setIntField(term354948, term354948.getClass(), "wrongPercent", 0);
        setIntField(term354948, term354948.getClass(), "maxCombo", 0);
        setIntField(term354948, term354948.getClass(), "chanceTime", 0);
        setIntField(term354948, term354948.getClass(), "holdScore", 0);
        setIntField(term354948, term354948.getClass(), "attainPoint", 0);
        setIntField(term354948, term354948.getClass(), "skinId", 0);
        setIntField(term354948, term354948.getClass(), "buttonSe", 0);
        setIntField(term354948, term354948.getClass(), "buttonSeVol", 0);
        setIntField(term354948, term354948.getClass(), "sliderSe", 0);
        setIntField(term354948, term354948.getClass(), "ChainSlideSe", 0);
        setIntField(term354948, term354948.getClass(), "SliderTouchSe", 0);
        setField(term354948, term354948.getClass(), "modules", null);
        setIntField(term354948, term354948.getClass(), "stageCompletion", 0);
        setIntField(term354948, term354948.getClass(), "slideScore", 0);
        setIntField(term354948, term354948.getClass(), "isVocalChange", 0);
        setField(term354948, term354948.getClass(), "customizeItems", null);
        setField(term354948, term354948.getClass(), "rhythmGameOptions", null);
        setIntField(term354948, term354948.getClass(), "screenShotCount", 0);
        setField(term354948, term354948.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChallengeResult", argTypes, term354948, args);
    }

};


