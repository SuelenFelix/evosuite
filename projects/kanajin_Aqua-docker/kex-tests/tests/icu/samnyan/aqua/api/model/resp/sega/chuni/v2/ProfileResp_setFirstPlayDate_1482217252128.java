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

public class ProfileResp_setFirstPlayDate_1482217252128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124423;

    public ProfileResp_setFirstPlayDate_1482217252128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124423 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124423, term124423.getClass(), "userName", null);
        setIntField(term124423, term124423.getClass(), "level", 0);
        setField(term124423, term124423.getClass(), "exp", null);
        setLongField(term124423, term124423.getClass(), "point", 0L);
        setLongField(term124423, term124423.getClass(), "totalPoint", 0L);
        setIntField(term124423, term124423.getClass(), "playCount", 0);
        setIntField(term124423, term124423.getClass(), "playerRating", 0);
        setIntField(term124423, term124423.getClass(), "highestRating", 0);
        setIntField(term124423, term124423.getClass(), "nameplateId", 0);
        setIntField(term124423, term124423.getClass(), "frameId", 0);
        setIntField(term124423, term124423.getClass(), "characterId", 0);
        setIntField(term124423, term124423.getClass(), "trophyId", 0);
        setIntField(term124423, term124423.getClass(), "totalMapNum", 0);
        setLongField(term124423, term124423.getClass(), "totalHiScore", 0L);
        setLongField(term124423, term124423.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124423, term124423.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124423, term124423.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124423, term124423.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124423, term124423.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124423, term124423.getClass(), "friendCount", 0);
        setField(term124423, term124423.getClass(), "firstPlayDate", null);
        setField(term124423, term124423.getClass(), "lastPlayDate", null);
        setIntField(term124423, term124423.getClass(), "courseClass", 0);
        setIntField(term124423, term124423.getClass(), "overPowerPoint", 0);
        setIntField(term124423, term124423.getClass(), "overPowerRate", 0);
        setIntField(term124423, term124423.getClass(), "mapIconId", 0);
        setIntField(term124423, term124423.getClass(), "voiceId", 0);
        setIntField(term124423, term124423.getClass(), "avatarWear", 0);
        setIntField(term124423, term124423.getClass(), "avatarHead", 0);
        setIntField(term124423, term124423.getClass(), "avatarFace", 0);
        setIntField(term124423, term124423.getClass(), "avatarSkin", 0);
        setIntField(term124423, term124423.getClass(), "avatarItem", 0);
        setIntField(term124423, term124423.getClass(), "avatarFront", 0);
        setIntField(term124423, term124423.getClass(), "avatarBack", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFirstPlayDate", argTypes, term124423, args);
    }

};


