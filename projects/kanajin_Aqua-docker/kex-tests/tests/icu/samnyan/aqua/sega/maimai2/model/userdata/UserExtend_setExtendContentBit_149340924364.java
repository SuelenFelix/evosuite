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
import java.lang.Long;

public class UserExtend_setExtendContentBit_149340924364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166055;
     Object term166069;

    public UserExtend_setExtendContentBit_149340924364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166055 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term166055, term166055.getClass(), "id", 0L);
        setField(term166055, term166055.getClass(), "user", null);
        setIntField(term166055, term166055.getClass(), "selectMusicId", 0);
        setIntField(term166055, term166055.getClass(), "selectDifficultyId", 0);
        setIntField(term166055, term166055.getClass(), "categoryIndex", 0);
        setIntField(term166055, term166055.getClass(), "musicIndex", 0);
        setIntField(term166055, term166055.getClass(), "extraFlag", 0);
        setIntField(term166055, term166055.getClass(), "selectScoreType", 0);
        setLongField(term166055, term166055.getClass(), "extendContentBit", 0L);
        setBooleanField(term166055, term166055.getClass(), "isPhotoAgree", false);
        setBooleanField(term166055, term166055.getClass(), "isGotoCodeRead", false);
        setBooleanField(term166055, term166055.getClass(), "selectResultDetails", false);
        setIntField(term166055, term166055.getClass(), "sortCategorySetting", 0);
        setIntField(term166055, term166055.getClass(), "sortMusicSetting", 0);
        setField(term166055, term166055.getClass(), "selectedCardList", null);
        setField(term166055, term166055.getClass(), "encountMapNpcList", null);
        term166069 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term166069;
        callMethod(klass, "setExtendContentBit", argTypes, term166055, args);
    }

};


