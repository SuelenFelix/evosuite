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

public class UserExtend_setSelectResultDetails_89479977267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166103;
     Object term166117;

    public UserExtend_setSelectResultDetails_89479977267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166103 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term166103, term166103.getClass(), "id", 0L);
        setField(term166103, term166103.getClass(), "user", null);
        setIntField(term166103, term166103.getClass(), "selectMusicId", 0);
        setIntField(term166103, term166103.getClass(), "selectDifficultyId", 0);
        setIntField(term166103, term166103.getClass(), "categoryIndex", 0);
        setIntField(term166103, term166103.getClass(), "musicIndex", 0);
        setIntField(term166103, term166103.getClass(), "extraFlag", 0);
        setIntField(term166103, term166103.getClass(), "selectScoreType", 0);
        setLongField(term166103, term166103.getClass(), "extendContentBit", 0L);
        setBooleanField(term166103, term166103.getClass(), "isPhotoAgree", false);
        setBooleanField(term166103, term166103.getClass(), "isGotoCodeRead", false);
        setBooleanField(term166103, term166103.getClass(), "selectResultDetails", false);
        setIntField(term166103, term166103.getClass(), "sortCategorySetting", 0);
        setIntField(term166103, term166103.getClass(), "sortMusicSetting", 0);
        setField(term166103, term166103.getClass(), "selectedCardList", null);
        setField(term166103, term166103.getClass(), "encountMapNpcList", null);
        term166117 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term166117;
        callMethod(klass, "setSelectResultDetails", argTypes, term166103, args);
    }

};


