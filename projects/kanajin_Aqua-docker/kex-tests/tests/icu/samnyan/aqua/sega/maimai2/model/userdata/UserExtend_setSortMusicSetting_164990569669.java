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

public class UserExtend_setSortMusicSetting_164990569669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166135;
     Object term166149;

    public UserExtend_setSortMusicSetting_164990569669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166135 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term166135, term166135.getClass(), "id", 0L);
        setField(term166135, term166135.getClass(), "user", null);
        setIntField(term166135, term166135.getClass(), "selectMusicId", 0);
        setIntField(term166135, term166135.getClass(), "selectDifficultyId", 0);
        setIntField(term166135, term166135.getClass(), "categoryIndex", 0);
        setIntField(term166135, term166135.getClass(), "musicIndex", 0);
        setIntField(term166135, term166135.getClass(), "extraFlag", 0);
        setIntField(term166135, term166135.getClass(), "selectScoreType", 0);
        setLongField(term166135, term166135.getClass(), "extendContentBit", 0L);
        setBooleanField(term166135, term166135.getClass(), "isPhotoAgree", false);
        setBooleanField(term166135, term166135.getClass(), "isGotoCodeRead", false);
        setBooleanField(term166135, term166135.getClass(), "selectResultDetails", false);
        setIntField(term166135, term166135.getClass(), "sortCategorySetting", 0);
        setIntField(term166135, term166135.getClass(), "sortMusicSetting", 0);
        setField(term166135, term166135.getClass(), "selectedCardList", null);
        setField(term166135, term166135.getClass(), "encountMapNpcList", null);
        term166149 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term166149;
        callMethod(klass, "setSortMusicSetting", argTypes, term166135, args);
    }

};


