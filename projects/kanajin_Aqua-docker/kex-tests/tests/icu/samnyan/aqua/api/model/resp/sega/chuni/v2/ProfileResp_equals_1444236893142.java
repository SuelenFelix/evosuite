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

public class ProfileResp_equals_1444236893142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124881;

    public ProfileResp_equals_1444236893142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124881 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124881, term124881.getClass(), "userName", null);
        setIntField(term124881, term124881.getClass(), "level", 0);
        setField(term124881, term124881.getClass(), "exp", null);
        setLongField(term124881, term124881.getClass(), "point", 0L);
        setLongField(term124881, term124881.getClass(), "totalPoint", 0L);
        setIntField(term124881, term124881.getClass(), "playCount", 0);
        setIntField(term124881, term124881.getClass(), "playerRating", 0);
        setIntField(term124881, term124881.getClass(), "highestRating", 0);
        setIntField(term124881, term124881.getClass(), "nameplateId", 0);
        setIntField(term124881, term124881.getClass(), "frameId", 0);
        setIntField(term124881, term124881.getClass(), "characterId", 0);
        setIntField(term124881, term124881.getClass(), "trophyId", 0);
        setIntField(term124881, term124881.getClass(), "totalMapNum", 0);
        setLongField(term124881, term124881.getClass(), "totalHiScore", 0L);
        setLongField(term124881, term124881.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124881, term124881.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124881, term124881.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124881, term124881.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124881, term124881.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124881, term124881.getClass(), "friendCount", 0);
        setField(term124881, term124881.getClass(), "firstPlayDate", null);
        setField(term124881, term124881.getClass(), "lastPlayDate", null);
        setIntField(term124881, term124881.getClass(), "courseClass", 0);
        setIntField(term124881, term124881.getClass(), "overPowerPoint", 0);
        setIntField(term124881, term124881.getClass(), "overPowerRate", 0);
        setIntField(term124881, term124881.getClass(), "mapIconId", 0);
        setIntField(term124881, term124881.getClass(), "voiceId", 0);
        setIntField(term124881, term124881.getClass(), "avatarWear", 0);
        setIntField(term124881, term124881.getClass(), "avatarHead", 0);
        setIntField(term124881, term124881.getClass(), "avatarFace", 0);
        setIntField(term124881, term124881.getClass(), "avatarSkin", 0);
        setIntField(term124881, term124881.getClass(), "avatarItem", 0);
        setIntField(term124881, term124881.getClass(), "avatarFront", 0);
        setIntField(term124881, term124881.getClass(), "avatarBack", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "equals", argTypes, term124881, args);
    }

};


