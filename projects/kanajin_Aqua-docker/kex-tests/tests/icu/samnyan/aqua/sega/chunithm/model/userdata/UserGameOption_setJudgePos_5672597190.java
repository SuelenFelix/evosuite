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
import java.lang.Integer;

public class UserGameOption_setJudgePos_5672597190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74351;
     Object term74375;

    public UserGameOption_setJudgePos_5672597190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74351 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        setLongField(term74351, term74351.getClass(), "id", 0L);
        setField(term74351, term74351.getClass(), "user", null);
        setIntField(term74351, term74351.getClass(), "bgInfo", 0);
        setIntField(term74351, term74351.getClass(), "fieldColor", 0);
        setIntField(term74351, term74351.getClass(), "guideSound", 0);
        setIntField(term74351, term74351.getClass(), "soundEffect", 0);
        setIntField(term74351, term74351.getClass(), "guideLine", 0);
        setIntField(term74351, term74351.getClass(), "speed", 0);
        setIntField(term74351, term74351.getClass(), "optionSet", 0);
        setIntField(term74351, term74351.getClass(), "matching", 0);
        setIntField(term74351, term74351.getClass(), "judgePos", 0);
        setIntField(term74351, term74351.getClass(), "rating", 0);
        setIntField(term74351, term74351.getClass(), "judgeJustice", 0);
        setIntField(term74351, term74351.getClass(), "judgeAttack", 0);
        setIntField(term74351, term74351.getClass(), "headphone", 0);
        setIntField(term74351, term74351.getClass(), "playerLevel", 0);
        setIntField(term74351, term74351.getClass(), "successTap", 0);
        setIntField(term74351, term74351.getClass(), "successExTap", 0);
        setIntField(term74351, term74351.getClass(), "successSlideHold", 0);
        setIntField(term74351, term74351.getClass(), "successAir", 0);
        setIntField(term74351, term74351.getClass(), "successFlick", 0);
        setIntField(term74351, term74351.getClass(), "successSkill", 0);
        setIntField(term74351, term74351.getClass(), "successTapTimbre", 0);
        setIntField(term74351, term74351.getClass(), "privacy", 0);
        term74375 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term74375;
        callMethod(klass, "setJudgePos", argTypes, term74351, args);
    }

};


