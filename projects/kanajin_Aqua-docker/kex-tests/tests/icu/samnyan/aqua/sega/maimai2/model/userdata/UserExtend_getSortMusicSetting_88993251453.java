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

public class UserExtend_getSortMusicSetting_88993251453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165887;

    public UserExtend_getSortMusicSetting_88993251453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165887 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term165887, term165887.getClass(), "id", 0L);
        setField(term165887, term165887.getClass(), "user", null);
        setIntField(term165887, term165887.getClass(), "selectMusicId", 0);
        setIntField(term165887, term165887.getClass(), "selectDifficultyId", 0);
        setIntField(term165887, term165887.getClass(), "categoryIndex", 0);
        setIntField(term165887, term165887.getClass(), "musicIndex", 0);
        setIntField(term165887, term165887.getClass(), "extraFlag", 0);
        setIntField(term165887, term165887.getClass(), "selectScoreType", 0);
        setLongField(term165887, term165887.getClass(), "extendContentBit", 0L);
        setBooleanField(term165887, term165887.getClass(), "isPhotoAgree", false);
        setBooleanField(term165887, term165887.getClass(), "isGotoCodeRead", false);
        setBooleanField(term165887, term165887.getClass(), "selectResultDetails", false);
        setIntField(term165887, term165887.getClass(), "sortCategorySetting", 0);
        setIntField(term165887, term165887.getClass(), "sortMusicSetting", 0);
        setField(term165887, term165887.getClass(), "selectedCardList", null);
        setField(term165887, term165887.getClass(), "encountMapNpcList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSortMusicSetting", argTypes, term165887, args);
    }

};


