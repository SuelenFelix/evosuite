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

public class UserExtend_setUser_67672088557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165945;

    public UserExtend_setUser_67672088557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165945 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term165945, term165945.getClass(), "id", 0L);
        setField(term165945, term165945.getClass(), "user", null);
        setIntField(term165945, term165945.getClass(), "selectMusicId", 0);
        setIntField(term165945, term165945.getClass(), "selectDifficultyId", 0);
        setIntField(term165945, term165945.getClass(), "categoryIndex", 0);
        setIntField(term165945, term165945.getClass(), "musicIndex", 0);
        setIntField(term165945, term165945.getClass(), "extraFlag", 0);
        setIntField(term165945, term165945.getClass(), "selectScoreType", 0);
        setLongField(term165945, term165945.getClass(), "extendContentBit", 0L);
        setBooleanField(term165945, term165945.getClass(), "isPhotoAgree", false);
        setBooleanField(term165945, term165945.getClass(), "isGotoCodeRead", false);
        setBooleanField(term165945, term165945.getClass(), "selectResultDetails", false);
        setIntField(term165945, term165945.getClass(), "sortCategorySetting", 0);
        setIntField(term165945, term165945.getClass(), "sortMusicSetting", 0);
        setField(term165945, term165945.getClass(), "selectedCardList", null);
        setField(term165945, term165945.getClass(), "encountMapNpcList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUser", argTypes, term165945, args);
    }

};


