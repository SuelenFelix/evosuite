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

public class UserExtend_getExtendContentBit_26171888348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165817;

    public UserExtend_getExtendContentBit_26171888348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165817 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term165817, term165817.getClass(), "id", 0L);
        setField(term165817, term165817.getClass(), "user", null);
        setIntField(term165817, term165817.getClass(), "selectMusicId", 0);
        setIntField(term165817, term165817.getClass(), "selectDifficultyId", 0);
        setIntField(term165817, term165817.getClass(), "categoryIndex", 0);
        setIntField(term165817, term165817.getClass(), "musicIndex", 0);
        setIntField(term165817, term165817.getClass(), "extraFlag", 0);
        setIntField(term165817, term165817.getClass(), "selectScoreType", 0);
        setLongField(term165817, term165817.getClass(), "extendContentBit", 0L);
        setBooleanField(term165817, term165817.getClass(), "isPhotoAgree", false);
        setBooleanField(term165817, term165817.getClass(), "isGotoCodeRead", false);
        setBooleanField(term165817, term165817.getClass(), "selectResultDetails", false);
        setIntField(term165817, term165817.getClass(), "sortCategorySetting", 0);
        setIntField(term165817, term165817.getClass(), "sortMusicSetting", 0);
        setField(term165817, term165817.getClass(), "selectedCardList", null);
        setField(term165817, term165817.getClass(), "encountMapNpcList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExtendContentBit", argTypes, term165817, args);
    }

};


