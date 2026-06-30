package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UserOption_getFilterReMaster_729695233136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81835;

    public UserOption_getFilterReMaster_729695233136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81835 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption"));
        setLongField(term81835, term81835.getClass(), "id", 0L);
        setField(term81835, term81835.getClass(), "user", null);
        setIntField(term81835, term81835.getClass(), "soudEffect", 0);
        setIntField(term81835, term81835.getClass(), "mirrorMode", 0);
        setIntField(term81835, term81835.getClass(), "guideSpeed", 0);
        setIntField(term81835, term81835.getClass(), "bgInfo", 0);
        setIntField(term81835, term81835.getClass(), "brightness", 0);
        setIntField(term81835, term81835.getClass(), "isStarRot", 0);
        setIntField(term81835, term81835.getClass(), "breakSe", 0);
        setIntField(term81835, term81835.getClass(), "slideSe", 0);
        setIntField(term81835, term81835.getClass(), "hardJudge", 0);
        setIntField(term81835, term81835.getClass(), "isTagJump", 0);
        setIntField(term81835, term81835.getClass(), "breakSeVol", 0);
        setIntField(term81835, term81835.getClass(), "slideSeVol", 0);
        setIntField(term81835, term81835.getClass(), "isUpperDisp", 0);
        setIntField(term81835, term81835.getClass(), "trackSkip", 0);
        setIntField(term81835, term81835.getClass(), "optionMode", 0);
        setIntField(term81835, term81835.getClass(), "simpleOptionParam", 0);
        setIntField(term81835, term81835.getClass(), "adjustTiming", 0);
        setIntField(term81835, term81835.getClass(), "dispTiming", 0);
        setIntField(term81835, term81835.getClass(), "timingPos", 0);
        setIntField(term81835, term81835.getClass(), "ansVol", 0);
        setIntField(term81835, term81835.getClass(), "noteVol", 0);
        setIntField(term81835, term81835.getClass(), "dmgVol", 0);
        setIntField(term81835, term81835.getClass(), "appealFlame", 0);
        setIntField(term81835, term81835.getClass(), "isFeverDisp", 0);
        setIntField(term81835, term81835.getClass(), "dispJudge", 0);
        setIntField(term81835, term81835.getClass(), "judgePos", 0);
        setIntField(term81835, term81835.getClass(), "ratingGuard", 0);
        setIntField(term81835, term81835.getClass(), "selectChara", 0);
        setIntField(term81835, term81835.getClass(), "sortType", 0);
        setIntField(term81835, term81835.getClass(), "filterGenre", 0);
        setIntField(term81835, term81835.getClass(), "filterLevel", 0);
        setIntField(term81835, term81835.getClass(), "filterRank", 0);
        setIntField(term81835, term81835.getClass(), "filterVersion", 0);
        setIntField(term81835, term81835.getClass(), "filterRec", 0);
        setIntField(term81835, term81835.getClass(), "filterFullCombo", 0);
        setIntField(term81835, term81835.getClass(), "filterAllPerfect", 0);
        setIntField(term81835, term81835.getClass(), "filterDifficulty", 0);
        setIntField(term81835, term81835.getClass(), "filterFullSync", 0);
        setIntField(term81835, term81835.getClass(), "filterReMaster", 0);
        setIntField(term81835, term81835.getClass(), "filterMaxFever", 0);
        setIntField(term81835, term81835.getClass(), "finalSelectId", 0);
        setIntField(term81835, term81835.getClass(), "finalSelectCategory", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFilterReMaster", argTypes, term81835, args);
    }

};


