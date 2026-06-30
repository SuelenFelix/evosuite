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

public class ProfileResp_canEqual_2046567774143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124912;

    public ProfileResp_canEqual_2046567774143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124912 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124912, term124912.getClass(), "userName", null);
        setIntField(term124912, term124912.getClass(), "level", 0);
        setField(term124912, term124912.getClass(), "exp", null);
        setLongField(term124912, term124912.getClass(), "point", 0L);
        setLongField(term124912, term124912.getClass(), "totalPoint", 0L);
        setIntField(term124912, term124912.getClass(), "playCount", 0);
        setIntField(term124912, term124912.getClass(), "playerRating", 0);
        setIntField(term124912, term124912.getClass(), "highestRating", 0);
        setIntField(term124912, term124912.getClass(), "nameplateId", 0);
        setIntField(term124912, term124912.getClass(), "frameId", 0);
        setIntField(term124912, term124912.getClass(), "characterId", 0);
        setIntField(term124912, term124912.getClass(), "trophyId", 0);
        setIntField(term124912, term124912.getClass(), "totalMapNum", 0);
        setLongField(term124912, term124912.getClass(), "totalHiScore", 0L);
        setLongField(term124912, term124912.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124912, term124912.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124912, term124912.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124912, term124912.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124912, term124912.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124912, term124912.getClass(), "friendCount", 0);
        setField(term124912, term124912.getClass(), "firstPlayDate", null);
        setField(term124912, term124912.getClass(), "lastPlayDate", null);
        setIntField(term124912, term124912.getClass(), "courseClass", 0);
        setIntField(term124912, term124912.getClass(), "overPowerPoint", 0);
        setIntField(term124912, term124912.getClass(), "overPowerRate", 0);
        setIntField(term124912, term124912.getClass(), "mapIconId", 0);
        setIntField(term124912, term124912.getClass(), "voiceId", 0);
        setIntField(term124912, term124912.getClass(), "avatarWear", 0);
        setIntField(term124912, term124912.getClass(), "avatarHead", 0);
        setIntField(term124912, term124912.getClass(), "avatarFace", 0);
        setIntField(term124912, term124912.getClass(), "avatarSkin", 0);
        setIntField(term124912, term124912.getClass(), "avatarItem", 0);
        setIntField(term124912, term124912.getClass(), "avatarFront", 0);
        setIntField(term124912, term124912.getClass(), "avatarBack", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "canEqual", argTypes, term124912, args);
    }

};


