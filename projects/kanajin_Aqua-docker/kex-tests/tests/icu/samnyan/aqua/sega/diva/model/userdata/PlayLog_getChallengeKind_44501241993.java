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

public class PlayLog_getChallengeKind_44501241993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term354917;

    public PlayLog_getChallengeKind_44501241993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term354917 = newInstance(Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog"));
        setLongField(term354917, term354917.getClass(), "id", 0L);
        setField(term354917, term354917.getClass(), "pdId", null);
        setIntField(term354917, term354917.getClass(), "pvId", 0);
        setField(term354917, term354917.getClass(), "difficulty", null);
        setField(term354917, term354917.getClass(), "edition", null);
        setIntField(term354917, term354917.getClass(), "scriptVer", 0);
        setIntField(term354917, term354917.getClass(), "score", 0);
        setField(term354917, term354917.getClass(), "challengeKind", null);
        setIntField(term354917, term354917.getClass(), "challengeResult", 0);
        setField(term354917, term354917.getClass(), "clearResult", null);
        setIntField(term354917, term354917.getClass(), "vp", 0);
        setIntField(term354917, term354917.getClass(), "coolCount", 0);
        setIntField(term354917, term354917.getClass(), "coolPercent", 0);
        setIntField(term354917, term354917.getClass(), "fineCount", 0);
        setIntField(term354917, term354917.getClass(), "finePercent", 0);
        setIntField(term354917, term354917.getClass(), "safeCount", 0);
        setIntField(term354917, term354917.getClass(), "safePercent", 0);
        setIntField(term354917, term354917.getClass(), "sadCount", 0);
        setIntField(term354917, term354917.getClass(), "sadPercent", 0);
        setIntField(term354917, term354917.getClass(), "wrongCount", 0);
        setIntField(term354917, term354917.getClass(), "wrongPercent", 0);
        setIntField(term354917, term354917.getClass(), "maxCombo", 0);
        setIntField(term354917, term354917.getClass(), "chanceTime", 0);
        setIntField(term354917, term354917.getClass(), "holdScore", 0);
        setIntField(term354917, term354917.getClass(), "attainPoint", 0);
        setIntField(term354917, term354917.getClass(), "skinId", 0);
        setIntField(term354917, term354917.getClass(), "buttonSe", 0);
        setIntField(term354917, term354917.getClass(), "buttonSeVol", 0);
        setIntField(term354917, term354917.getClass(), "sliderSe", 0);
        setIntField(term354917, term354917.getClass(), "ChainSlideSe", 0);
        setIntField(term354917, term354917.getClass(), "SliderTouchSe", 0);
        setField(term354917, term354917.getClass(), "modules", null);
        setIntField(term354917, term354917.getClass(), "stageCompletion", 0);
        setIntField(term354917, term354917.getClass(), "slideScore", 0);
        setIntField(term354917, term354917.getClass(), "isVocalChange", 0);
        setField(term354917, term354917.getClass(), "customizeItems", null);
        setField(term354917, term354917.getClass(), "rhythmGameOptions", null);
        setIntField(term354917, term354917.getClass(), "screenShotCount", 0);
        setField(term354917, term354917.getClass(), "dateTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.diva.model.userdata.PlayLog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChallengeKind", argTypes, term354917, args);
    }

};


