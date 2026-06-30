package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserGameOption_getJudgePos_72103249566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73757;

    public UserGameOption_getJudgePos_72103249566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73757 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        setLongField(term73757, term73757.getClass(), "id", 0L);
        setField(term73757, term73757.getClass(), "user", null);
        setIntField(term73757, term73757.getClass(), "bgInfo", 0);
        setIntField(term73757, term73757.getClass(), "fieldColor", 0);
        setIntField(term73757, term73757.getClass(), "guideSound", 0);
        setIntField(term73757, term73757.getClass(), "soundEffect", 0);
        setIntField(term73757, term73757.getClass(), "guideLine", 0);
        setIntField(term73757, term73757.getClass(), "speed", 0);
        setIntField(term73757, term73757.getClass(), "optionSet", 0);
        setIntField(term73757, term73757.getClass(), "matching", 0);
        setIntField(term73757, term73757.getClass(), "judgePos", 0);
        setIntField(term73757, term73757.getClass(), "rating", 0);
        setIntField(term73757, term73757.getClass(), "judgeJustice", 0);
        setIntField(term73757, term73757.getClass(), "judgeAttack", 0);
        setIntField(term73757, term73757.getClass(), "headphone", 0);
        setIntField(term73757, term73757.getClass(), "playerLevel", 0);
        setIntField(term73757, term73757.getClass(), "successTap", 0);
        setIntField(term73757, term73757.getClass(), "successExTap", 0);
        setIntField(term73757, term73757.getClass(), "successSlideHold", 0);
        setIntField(term73757, term73757.getClass(), "successAir", 0);
        setIntField(term73757, term73757.getClass(), "successFlick", 0);
        setIntField(term73757, term73757.getClass(), "successSkill", 0);
        setIntField(term73757, term73757.getClass(), "successTapTimbre", 0);
        setIntField(term73757, term73757.getClass(), "privacy", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgePos", argTypes, term73757, args);
    }

};


