package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProfileResp_getHighestRating_38850242681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122930;

    public ProfileResp_getHighestRating_38850242681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122930 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term122930, term122930.getClass(), "userName", null);
        setIntField(term122930, term122930.getClass(), "level", 0);
        setField(term122930, term122930.getClass(), "exp", null);
        setLongField(term122930, term122930.getClass(), "point", 0L);
        setLongField(term122930, term122930.getClass(), "totalPoint", 0L);
        setIntField(term122930, term122930.getClass(), "playCount", 0);
        setIntField(term122930, term122930.getClass(), "playerRating", 0);
        setIntField(term122930, term122930.getClass(), "highestRating", 0);
        setIntField(term122930, term122930.getClass(), "nameplateId", 0);
        setIntField(term122930, term122930.getClass(), "frameId", 0);
        setIntField(term122930, term122930.getClass(), "characterId", 0);
        setIntField(term122930, term122930.getClass(), "trophyId", 0);
        setIntField(term122930, term122930.getClass(), "totalMapNum", 0);
        setLongField(term122930, term122930.getClass(), "totalHiScore", 0L);
        setLongField(term122930, term122930.getClass(), "totalBasicHighScore", 0L);
        setLongField(term122930, term122930.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term122930, term122930.getClass(), "totalExpertHighScore", 0L);
        setLongField(term122930, term122930.getClass(), "totalMasterHighScore", 0L);
        setLongField(term122930, term122930.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term122930, term122930.getClass(), "friendCount", 0);
        setField(term122930, term122930.getClass(), "firstPlayDate", null);
        setField(term122930, term122930.getClass(), "lastPlayDate", null);
        setIntField(term122930, term122930.getClass(), "courseClass", 0);
        setIntField(term122930, term122930.getClass(), "overPowerPoint", 0);
        setIntField(term122930, term122930.getClass(), "overPowerRate", 0);
        setIntField(term122930, term122930.getClass(), "mapIconId", 0);
        setIntField(term122930, term122930.getClass(), "voiceId", 0);
        setIntField(term122930, term122930.getClass(), "avatarWear", 0);
        setIntField(term122930, term122930.getClass(), "avatarHead", 0);
        setIntField(term122930, term122930.getClass(), "avatarFace", 0);
        setIntField(term122930, term122930.getClass(), "avatarSkin", 0);
        setIntField(term122930, term122930.getClass(), "avatarItem", 0);
        setIntField(term122930, term122930.getClass(), "avatarFront", 0);
        setIntField(term122930, term122930.getClass(), "avatarBack", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHighestRating", argTypes, term122930, args);
    }

};


