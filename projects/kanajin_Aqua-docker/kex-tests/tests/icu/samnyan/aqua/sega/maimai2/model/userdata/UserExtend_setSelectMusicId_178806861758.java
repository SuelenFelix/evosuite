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

public class UserExtend_setSelectMusicId_178806861758 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165959;
     Object term165973;

    public UserExtend_setSelectMusicId_178806861758() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165959 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term165959, term165959.getClass(), "id", 0L);
        setField(term165959, term165959.getClass(), "user", null);
        setIntField(term165959, term165959.getClass(), "selectMusicId", 0);
        setIntField(term165959, term165959.getClass(), "selectDifficultyId", 0);
        setIntField(term165959, term165959.getClass(), "categoryIndex", 0);
        setIntField(term165959, term165959.getClass(), "musicIndex", 0);
        setIntField(term165959, term165959.getClass(), "extraFlag", 0);
        setIntField(term165959, term165959.getClass(), "selectScoreType", 0);
        setLongField(term165959, term165959.getClass(), "extendContentBit", 0L);
        setBooleanField(term165959, term165959.getClass(), "isPhotoAgree", false);
        setBooleanField(term165959, term165959.getClass(), "isGotoCodeRead", false);
        setBooleanField(term165959, term165959.getClass(), "selectResultDetails", false);
        setIntField(term165959, term165959.getClass(), "sortCategorySetting", 0);
        setIntField(term165959, term165959.getClass(), "sortMusicSetting", 0);
        setField(term165959, term165959.getClass(), "selectedCardList", null);
        setField(term165959, term165959.getClass(), "encountMapNpcList", null);
        term165973 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term165973;
        callMethod(klass, "setSelectMusicId", argTypes, term165959, args);
    }

};


