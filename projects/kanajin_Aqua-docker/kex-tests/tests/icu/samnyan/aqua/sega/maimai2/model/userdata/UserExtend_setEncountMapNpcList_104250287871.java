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

public class UserExtend_setEncountMapNpcList_104250287871 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166165;

    public UserExtend_setEncountMapNpcList_104250287871() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166165 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term166165, term166165.getClass(), "id", 0L);
        setField(term166165, term166165.getClass(), "user", null);
        setIntField(term166165, term166165.getClass(), "selectMusicId", 0);
        setIntField(term166165, term166165.getClass(), "selectDifficultyId", 0);
        setIntField(term166165, term166165.getClass(), "categoryIndex", 0);
        setIntField(term166165, term166165.getClass(), "musicIndex", 0);
        setIntField(term166165, term166165.getClass(), "extraFlag", 0);
        setIntField(term166165, term166165.getClass(), "selectScoreType", 0);
        setLongField(term166165, term166165.getClass(), "extendContentBit", 0L);
        setBooleanField(term166165, term166165.getClass(), "isPhotoAgree", false);
        setBooleanField(term166165, term166165.getClass(), "isGotoCodeRead", false);
        setBooleanField(term166165, term166165.getClass(), "selectResultDetails", false);
        setIntField(term166165, term166165.getClass(), "sortCategorySetting", 0);
        setIntField(term166165, term166165.getClass(), "sortMusicSetting", 0);
        setField(term166165, term166165.getClass(), "selectedCardList", null);
        setField(term166165, term166165.getClass(), "encountMapNpcList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setEncountMapNpcList", argTypes, term166165, args);
    }

};


