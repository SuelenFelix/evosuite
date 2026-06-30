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

public class UserGameOption_setSuccessTap_54559092296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74507;
     Object term74531;

    public UserGameOption_setSuccessTap_54559092296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74507 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        setLongField(term74507, term74507.getClass(), "id", 0L);
        setField(term74507, term74507.getClass(), "user", null);
        setIntField(term74507, term74507.getClass(), "bgInfo", 0);
        setIntField(term74507, term74507.getClass(), "fieldColor", 0);
        setIntField(term74507, term74507.getClass(), "guideSound", 0);
        setIntField(term74507, term74507.getClass(), "soundEffect", 0);
        setIntField(term74507, term74507.getClass(), "guideLine", 0);
        setIntField(term74507, term74507.getClass(), "speed", 0);
        setIntField(term74507, term74507.getClass(), "optionSet", 0);
        setIntField(term74507, term74507.getClass(), "matching", 0);
        setIntField(term74507, term74507.getClass(), "judgePos", 0);
        setIntField(term74507, term74507.getClass(), "rating", 0);
        setIntField(term74507, term74507.getClass(), "judgeJustice", 0);
        setIntField(term74507, term74507.getClass(), "judgeAttack", 0);
        setIntField(term74507, term74507.getClass(), "headphone", 0);
        setIntField(term74507, term74507.getClass(), "playerLevel", 0);
        setIntField(term74507, term74507.getClass(), "successTap", 0);
        setIntField(term74507, term74507.getClass(), "successExTap", 0);
        setIntField(term74507, term74507.getClass(), "successSlideHold", 0);
        setIntField(term74507, term74507.getClass(), "successAir", 0);
        setIntField(term74507, term74507.getClass(), "successFlick", 0);
        setIntField(term74507, term74507.getClass(), "successSkill", 0);
        setIntField(term74507, term74507.getClass(), "successTapTimbre", 0);
        setIntField(term74507, term74507.getClass(), "privacy", 0);
        term74531 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term74531;
        callMethod(klass, "setSuccessTap", argTypes, term74507, args);
    }

};


