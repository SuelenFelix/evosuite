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

public class UserExtend_canEqual_63912340673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166193;

    public UserExtend_canEqual_63912340673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166193 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term166193, term166193.getClass(), "id", 0L);
        setField(term166193, term166193.getClass(), "user", null);
        setIntField(term166193, term166193.getClass(), "selectMusicId", 0);
        setIntField(term166193, term166193.getClass(), "selectDifficultyId", 0);
        setIntField(term166193, term166193.getClass(), "categoryIndex", 0);
        setIntField(term166193, term166193.getClass(), "musicIndex", 0);
        setIntField(term166193, term166193.getClass(), "extraFlag", 0);
        setIntField(term166193, term166193.getClass(), "selectScoreType", 0);
        setLongField(term166193, term166193.getClass(), "extendContentBit", 0L);
        setBooleanField(term166193, term166193.getClass(), "isPhotoAgree", false);
        setBooleanField(term166193, term166193.getClass(), "isGotoCodeRead", false);
        setBooleanField(term166193, term166193.getClass(), "selectResultDetails", false);
        setIntField(term166193, term166193.getClass(), "sortCategorySetting", 0);
        setIntField(term166193, term166193.getClass(), "sortMusicSetting", 0);
        setField(term166193, term166193.getClass(), "selectedCardList", null);
        setField(term166193, term166193.getClass(), "encountMapNpcList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term166193, args);
    }

};


