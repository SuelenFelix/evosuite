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
import java.lang.Boolean;

public class UserExtend_setPhotoAgree_106367793765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166071;
     Object term166085;

    public UserExtend_setPhotoAgree_106367793765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166071 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term166071, term166071.getClass(), "id", 0L);
        setField(term166071, term166071.getClass(), "user", null);
        setIntField(term166071, term166071.getClass(), "selectMusicId", 0);
        setIntField(term166071, term166071.getClass(), "selectDifficultyId", 0);
        setIntField(term166071, term166071.getClass(), "categoryIndex", 0);
        setIntField(term166071, term166071.getClass(), "musicIndex", 0);
        setIntField(term166071, term166071.getClass(), "extraFlag", 0);
        setIntField(term166071, term166071.getClass(), "selectScoreType", 0);
        setLongField(term166071, term166071.getClass(), "extendContentBit", 0L);
        setBooleanField(term166071, term166071.getClass(), "isPhotoAgree", false);
        setBooleanField(term166071, term166071.getClass(), "isGotoCodeRead", false);
        setBooleanField(term166071, term166071.getClass(), "selectResultDetails", false);
        setIntField(term166071, term166071.getClass(), "sortCategorySetting", 0);
        setIntField(term166071, term166071.getClass(), "sortMusicSetting", 0);
        setField(term166071, term166071.getClass(), "selectedCardList", null);
        setField(term166071, term166071.getClass(), "encountMapNpcList", null);
        term166085 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term166085;
        callMethod(klass, "setPhotoAgree", argTypes, term166071, args);
    }

};


