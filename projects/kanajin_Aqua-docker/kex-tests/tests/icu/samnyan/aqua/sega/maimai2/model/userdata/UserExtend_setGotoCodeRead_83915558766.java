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

public class UserExtend_setGotoCodeRead_83915558766 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166087;
     Object term166101;

    public UserExtend_setGotoCodeRead_83915558766() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166087 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term166087, term166087.getClass(), "id", 0L);
        setField(term166087, term166087.getClass(), "user", null);
        setIntField(term166087, term166087.getClass(), "selectMusicId", 0);
        setIntField(term166087, term166087.getClass(), "selectDifficultyId", 0);
        setIntField(term166087, term166087.getClass(), "categoryIndex", 0);
        setIntField(term166087, term166087.getClass(), "musicIndex", 0);
        setIntField(term166087, term166087.getClass(), "extraFlag", 0);
        setIntField(term166087, term166087.getClass(), "selectScoreType", 0);
        setLongField(term166087, term166087.getClass(), "extendContentBit", 0L);
        setBooleanField(term166087, term166087.getClass(), "isPhotoAgree", false);
        setBooleanField(term166087, term166087.getClass(), "isGotoCodeRead", false);
        setBooleanField(term166087, term166087.getClass(), "selectResultDetails", false);
        setIntField(term166087, term166087.getClass(), "sortCategorySetting", 0);
        setIntField(term166087, term166087.getClass(), "sortMusicSetting", 0);
        setField(term166087, term166087.getClass(), "selectedCardList", null);
        setField(term166087, term166087.getClass(), "encountMapNpcList", null);
        term166101 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term166101;
        callMethod(klass, "setGotoCodeRead", argTypes, term166087, args);
    }

};


