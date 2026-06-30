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

public class ProfileResp_hashCode_995550218144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124943;

    public ProfileResp_hashCode_995550218144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124943 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124943, term124943.getClass(), "userName", null);
        setIntField(term124943, term124943.getClass(), "level", 0);
        setField(term124943, term124943.getClass(), "exp", null);
        setLongField(term124943, term124943.getClass(), "point", 0L);
        setLongField(term124943, term124943.getClass(), "totalPoint", 0L);
        setIntField(term124943, term124943.getClass(), "playCount", 0);
        setIntField(term124943, term124943.getClass(), "playerRating", 0);
        setIntField(term124943, term124943.getClass(), "highestRating", 0);
        setIntField(term124943, term124943.getClass(), "nameplateId", 0);
        setIntField(term124943, term124943.getClass(), "frameId", 0);
        setIntField(term124943, term124943.getClass(), "characterId", 0);
        setIntField(term124943, term124943.getClass(), "trophyId", 0);
        setIntField(term124943, term124943.getClass(), "totalMapNum", 0);
        setLongField(term124943, term124943.getClass(), "totalHiScore", 0L);
        setLongField(term124943, term124943.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124943, term124943.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124943, term124943.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124943, term124943.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124943, term124943.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124943, term124943.getClass(), "friendCount", 0);
        setField(term124943, term124943.getClass(), "firstPlayDate", null);
        setField(term124943, term124943.getClass(), "lastPlayDate", null);
        setIntField(term124943, term124943.getClass(), "courseClass", 0);
        setIntField(term124943, term124943.getClass(), "overPowerPoint", 0);
        setIntField(term124943, term124943.getClass(), "overPowerRate", 0);
        setIntField(term124943, term124943.getClass(), "mapIconId", 0);
        setIntField(term124943, term124943.getClass(), "voiceId", 0);
        setIntField(term124943, term124943.getClass(), "avatarWear", 0);
        setIntField(term124943, term124943.getClass(), "avatarHead", 0);
        setIntField(term124943, term124943.getClass(), "avatarFace", 0);
        setIntField(term124943, term124943.getClass(), "avatarSkin", 0);
        setIntField(term124943, term124943.getClass(), "avatarItem", 0);
        setIntField(term124943, term124943.getClass(), "avatarFront", 0);
        setIntField(term124943, term124943.getClass(), "avatarBack", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term124943, args);
    }

};


