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

public class UserGameOption_setJudgeJustice_57993078692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74403;
     Object term74427;

    public UserGameOption_setJudgeJustice_57993078692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74403 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        setLongField(term74403, term74403.getClass(), "id", 0L);
        setField(term74403, term74403.getClass(), "user", null);
        setIntField(term74403, term74403.getClass(), "bgInfo", 0);
        setIntField(term74403, term74403.getClass(), "fieldColor", 0);
        setIntField(term74403, term74403.getClass(), "guideSound", 0);
        setIntField(term74403, term74403.getClass(), "soundEffect", 0);
        setIntField(term74403, term74403.getClass(), "guideLine", 0);
        setIntField(term74403, term74403.getClass(), "speed", 0);
        setIntField(term74403, term74403.getClass(), "optionSet", 0);
        setIntField(term74403, term74403.getClass(), "matching", 0);
        setIntField(term74403, term74403.getClass(), "judgePos", 0);
        setIntField(term74403, term74403.getClass(), "rating", 0);
        setIntField(term74403, term74403.getClass(), "judgeJustice", 0);
        setIntField(term74403, term74403.getClass(), "judgeAttack", 0);
        setIntField(term74403, term74403.getClass(), "headphone", 0);
        setIntField(term74403, term74403.getClass(), "playerLevel", 0);
        setIntField(term74403, term74403.getClass(), "successTap", 0);
        setIntField(term74403, term74403.getClass(), "successExTap", 0);
        setIntField(term74403, term74403.getClass(), "successSlideHold", 0);
        setIntField(term74403, term74403.getClass(), "successAir", 0);
        setIntField(term74403, term74403.getClass(), "successFlick", 0);
        setIntField(term74403, term74403.getClass(), "successSkill", 0);
        setIntField(term74403, term74403.getClass(), "successTapTimbre", 0);
        setIntField(term74403, term74403.getClass(), "privacy", 0);
        term74427 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term74427;
        callMethod(klass, "setJudgeJustice", argTypes, term74403, args);
    }

};


