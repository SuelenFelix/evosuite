package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserExtend_setMusicIndex_3432418861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166007;
     Object term166021;

    public UserExtend_setMusicIndex_3432418861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166007 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term166007, term166007.getClass(), "id", 0L);
        setField(term166007, term166007.getClass(), "user", null);
        setIntField(term166007, term166007.getClass(), "selectMusicId", 0);
        setIntField(term166007, term166007.getClass(), "selectDifficultyId", 0);
        setIntField(term166007, term166007.getClass(), "categoryIndex", 0);
        setIntField(term166007, term166007.getClass(), "musicIndex", 0);
        setIntField(term166007, term166007.getClass(), "extraFlag", 0);
        setIntField(term166007, term166007.getClass(), "selectScoreType", 0);
        setLongField(term166007, term166007.getClass(), "extendContentBit", 0L);
        setBooleanField(term166007, term166007.getClass(), "isPhotoAgree", false);
        setBooleanField(term166007, term166007.getClass(), "isGotoCodeRead", false);
        setBooleanField(term166007, term166007.getClass(), "selectResultDetails", false);
        setIntField(term166007, term166007.getClass(), "sortCategorySetting", 0);
        setIntField(term166007, term166007.getClass(), "sortMusicSetting", 0);
        setField(term166007, term166007.getClass(), "selectedCardList", null);
        setField(term166007, term166007.getClass(), "encountMapNpcList", null);
        term166021 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term166021;
        callMethod(klass, "setMusicIndex", argTypes, term166007, args);
    }

};


