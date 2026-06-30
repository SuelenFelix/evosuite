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

public class UserExtend_toString_189223489675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166221;

    public UserExtend_toString_189223489675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166221 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term166221, term166221.getClass(), "id", 0L);
        setField(term166221, term166221.getClass(), "user", null);
        setIntField(term166221, term166221.getClass(), "selectMusicId", 0);
        setIntField(term166221, term166221.getClass(), "selectDifficultyId", 0);
        setIntField(term166221, term166221.getClass(), "categoryIndex", 0);
        setIntField(term166221, term166221.getClass(), "musicIndex", 0);
        setIntField(term166221, term166221.getClass(), "extraFlag", 0);
        setIntField(term166221, term166221.getClass(), "selectScoreType", 0);
        setLongField(term166221, term166221.getClass(), "extendContentBit", 0L);
        setBooleanField(term166221, term166221.getClass(), "isPhotoAgree", false);
        setBooleanField(term166221, term166221.getClass(), "isGotoCodeRead", false);
        setBooleanField(term166221, term166221.getClass(), "selectResultDetails", false);
        setIntField(term166221, term166221.getClass(), "sortCategorySetting", 0);
        setIntField(term166221, term166221.getClass(), "sortMusicSetting", 0);
        setField(term166221, term166221.getClass(), "selectedCardList", null);
        setField(term166221, term166221.getClass(), "encountMapNpcList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term166221, args);
    }

};


