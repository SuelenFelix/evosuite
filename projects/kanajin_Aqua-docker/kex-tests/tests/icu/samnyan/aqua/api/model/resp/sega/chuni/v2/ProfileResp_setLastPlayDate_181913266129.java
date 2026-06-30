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

public class ProfileResp_setLastPlayDate_181913266129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124454;

    public ProfileResp_setLastPlayDate_181913266129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124454 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124454, term124454.getClass(), "userName", null);
        setIntField(term124454, term124454.getClass(), "level", 0);
        setField(term124454, term124454.getClass(), "exp", null);
        setLongField(term124454, term124454.getClass(), "point", 0L);
        setLongField(term124454, term124454.getClass(), "totalPoint", 0L);
        setIntField(term124454, term124454.getClass(), "playCount", 0);
        setIntField(term124454, term124454.getClass(), "playerRating", 0);
        setIntField(term124454, term124454.getClass(), "highestRating", 0);
        setIntField(term124454, term124454.getClass(), "nameplateId", 0);
        setIntField(term124454, term124454.getClass(), "frameId", 0);
        setIntField(term124454, term124454.getClass(), "characterId", 0);
        setIntField(term124454, term124454.getClass(), "trophyId", 0);
        setIntField(term124454, term124454.getClass(), "totalMapNum", 0);
        setLongField(term124454, term124454.getClass(), "totalHiScore", 0L);
        setLongField(term124454, term124454.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124454, term124454.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124454, term124454.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124454, term124454.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124454, term124454.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124454, term124454.getClass(), "friendCount", 0);
        setField(term124454, term124454.getClass(), "firstPlayDate", null);
        setField(term124454, term124454.getClass(), "lastPlayDate", null);
        setIntField(term124454, term124454.getClass(), "courseClass", 0);
        setIntField(term124454, term124454.getClass(), "overPowerPoint", 0);
        setIntField(term124454, term124454.getClass(), "overPowerRate", 0);
        setIntField(term124454, term124454.getClass(), "mapIconId", 0);
        setIntField(term124454, term124454.getClass(), "voiceId", 0);
        setIntField(term124454, term124454.getClass(), "avatarWear", 0);
        setIntField(term124454, term124454.getClass(), "avatarHead", 0);
        setIntField(term124454, term124454.getClass(), "avatarFace", 0);
        setIntField(term124454, term124454.getClass(), "avatarSkin", 0);
        setIntField(term124454, term124454.getClass(), "avatarItem", 0);
        setIntField(term124454, term124454.getClass(), "avatarFront", 0);
        setIntField(term124454, term124454.getClass(), "avatarBack", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setLastPlayDate", argTypes, term124454, args);
    }

};


