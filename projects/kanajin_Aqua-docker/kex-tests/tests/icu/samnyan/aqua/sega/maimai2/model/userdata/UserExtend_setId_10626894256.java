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

public class UserExtend_setId_10626894256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165929;
     Object term165943;

    public UserExtend_setId_10626894256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165929 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        setLongField(term165929, term165929.getClass(), "id", 0L);
        setField(term165929, term165929.getClass(), "user", null);
        setIntField(term165929, term165929.getClass(), "selectMusicId", 0);
        setIntField(term165929, term165929.getClass(), "selectDifficultyId", 0);
        setIntField(term165929, term165929.getClass(), "categoryIndex", 0);
        setIntField(term165929, term165929.getClass(), "musicIndex", 0);
        setIntField(term165929, term165929.getClass(), "extraFlag", 0);
        setIntField(term165929, term165929.getClass(), "selectScoreType", 0);
        setLongField(term165929, term165929.getClass(), "extendContentBit", 0L);
        setBooleanField(term165929, term165929.getClass(), "isPhotoAgree", false);
        setBooleanField(term165929, term165929.getClass(), "isGotoCodeRead", false);
        setBooleanField(term165929, term165929.getClass(), "selectResultDetails", false);
        setIntField(term165929, term165929.getClass(), "sortCategorySetting", 0);
        setIntField(term165929, term165929.getClass(), "sortMusicSetting", 0);
        setField(term165929, term165929.getClass(), "selectedCardList", null);
        setField(term165929, term165929.getClass(), "encountMapNpcList", null);
        term165943 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term165943;
        callMethod(klass, "setId", argTypes, term165929, args);
    }

};


