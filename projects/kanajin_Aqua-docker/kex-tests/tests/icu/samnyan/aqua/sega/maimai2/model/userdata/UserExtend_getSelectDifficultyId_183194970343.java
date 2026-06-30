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

public class UserExtend_getSelectDifficultyId_183194970343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165747;

    public UserExtend_getSelectDifficultyId_183194970343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165747 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term165747, term165747.getClass(), "id", 0L);
        setField(term165747, term165747.getClass(), "user", null);
        setIntField(term165747, term165747.getClass(), "selectMusicId", 0);
        setIntField(term165747, term165747.getClass(), "selectDifficultyId", 0);
        setIntField(term165747, term165747.getClass(), "categoryIndex", 0);
        setIntField(term165747, term165747.getClass(), "musicIndex", 0);
        setIntField(term165747, term165747.getClass(), "extraFlag", 0);
        setIntField(term165747, term165747.getClass(), "selectScoreType", 0);
        setLongField(term165747, term165747.getClass(), "extendContentBit", 0L);
        setBooleanField(term165747, term165747.getClass(), "isPhotoAgree", false);
        setBooleanField(term165747, term165747.getClass(), "isGotoCodeRead", false);
        setBooleanField(term165747, term165747.getClass(), "selectResultDetails", false);
        setIntField(term165747, term165747.getClass(), "sortCategorySetting", 0);
        setIntField(term165747, term165747.getClass(), "sortMusicSetting", 0);
        setField(term165747, term165747.getClass(), "selectedCardList", null);
        setField(term165747, term165747.getClass(), "encountMapNpcList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSelectDifficultyId", argTypes, term165747, args);
    }

};


