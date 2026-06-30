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

public class UserExtend_setCategoryIndex_62491189760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165991;
     Object term166005;

    public UserExtend_setCategoryIndex_62491189760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165991 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term165991, term165991.getClass(), "id", 0L);
        setField(term165991, term165991.getClass(), "user", null);
        setIntField(term165991, term165991.getClass(), "selectMusicId", 0);
        setIntField(term165991, term165991.getClass(), "selectDifficultyId", 0);
        setIntField(term165991, term165991.getClass(), "categoryIndex", 0);
        setIntField(term165991, term165991.getClass(), "musicIndex", 0);
        setIntField(term165991, term165991.getClass(), "extraFlag", 0);
        setIntField(term165991, term165991.getClass(), "selectScoreType", 0);
        setLongField(term165991, term165991.getClass(), "extendContentBit", 0L);
        setBooleanField(term165991, term165991.getClass(), "isPhotoAgree", false);
        setBooleanField(term165991, term165991.getClass(), "isGotoCodeRead", false);
        setBooleanField(term165991, term165991.getClass(), "selectResultDetails", false);
        setIntField(term165991, term165991.getClass(), "sortCategorySetting", 0);
        setIntField(term165991, term165991.getClass(), "sortMusicSetting", 0);
        setField(term165991, term165991.getClass(), "selectedCardList", null);
        setField(term165991, term165991.getClass(), "encountMapNpcList", null);
        term166005 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term166005;
        callMethod(klass, "setCategoryIndex", argTypes, term165991, args);
    }

};


