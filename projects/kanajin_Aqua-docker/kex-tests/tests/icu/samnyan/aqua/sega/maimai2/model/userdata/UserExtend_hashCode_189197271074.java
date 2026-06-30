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

public class UserExtend_hashCode_189197271074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166207;

    public UserExtend_hashCode_189197271074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166207 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term166207, term166207.getClass(), "id", 0L);
        setField(term166207, term166207.getClass(), "user", null);
        setIntField(term166207, term166207.getClass(), "selectMusicId", 0);
        setIntField(term166207, term166207.getClass(), "selectDifficultyId", 0);
        setIntField(term166207, term166207.getClass(), "categoryIndex", 0);
        setIntField(term166207, term166207.getClass(), "musicIndex", 0);
        setIntField(term166207, term166207.getClass(), "extraFlag", 0);
        setIntField(term166207, term166207.getClass(), "selectScoreType", 0);
        setLongField(term166207, term166207.getClass(), "extendContentBit", 0L);
        setBooleanField(term166207, term166207.getClass(), "isPhotoAgree", false);
        setBooleanField(term166207, term166207.getClass(), "isGotoCodeRead", false);
        setBooleanField(term166207, term166207.getClass(), "selectResultDetails", false);
        setIntField(term166207, term166207.getClass(), "sortCategorySetting", 0);
        setIntField(term166207, term166207.getClass(), "sortMusicSetting", 0);
        setField(term166207, term166207.getClass(), "selectedCardList", null);
        setField(term166207, term166207.getClass(), "encountMapNpcList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term166207, args);
    }

};


