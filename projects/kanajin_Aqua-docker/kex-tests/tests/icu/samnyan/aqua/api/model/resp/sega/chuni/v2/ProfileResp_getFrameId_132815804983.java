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

public class ProfileResp_getFrameId_132815804983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122992;

    public ProfileResp_getFrameId_132815804983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122992 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term122992, term122992.getClass(), "userName", null);
        setIntField(term122992, term122992.getClass(), "level", 0);
        setField(term122992, term122992.getClass(), "exp", null);
        setLongField(term122992, term122992.getClass(), "point", 0L);
        setLongField(term122992, term122992.getClass(), "totalPoint", 0L);
        setIntField(term122992, term122992.getClass(), "playCount", 0);
        setIntField(term122992, term122992.getClass(), "playerRating", 0);
        setIntField(term122992, term122992.getClass(), "highestRating", 0);
        setIntField(term122992, term122992.getClass(), "nameplateId", 0);
        setIntField(term122992, term122992.getClass(), "frameId", 0);
        setIntField(term122992, term122992.getClass(), "characterId", 0);
        setIntField(term122992, term122992.getClass(), "trophyId", 0);
        setIntField(term122992, term122992.getClass(), "totalMapNum", 0);
        setLongField(term122992, term122992.getClass(), "totalHiScore", 0L);
        setLongField(term122992, term122992.getClass(), "totalBasicHighScore", 0L);
        setLongField(term122992, term122992.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term122992, term122992.getClass(), "totalExpertHighScore", 0L);
        setLongField(term122992, term122992.getClass(), "totalMasterHighScore", 0L);
        setLongField(term122992, term122992.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term122992, term122992.getClass(), "friendCount", 0);
        setField(term122992, term122992.getClass(), "firstPlayDate", null);
        setField(term122992, term122992.getClass(), "lastPlayDate", null);
        setIntField(term122992, term122992.getClass(), "courseClass", 0);
        setIntField(term122992, term122992.getClass(), "overPowerPoint", 0);
        setIntField(term122992, term122992.getClass(), "overPowerRate", 0);
        setIntField(term122992, term122992.getClass(), "mapIconId", 0);
        setIntField(term122992, term122992.getClass(), "voiceId", 0);
        setIntField(term122992, term122992.getClass(), "avatarWear", 0);
        setIntField(term122992, term122992.getClass(), "avatarHead", 0);
        setIntField(term122992, term122992.getClass(), "avatarFace", 0);
        setIntField(term122992, term122992.getClass(), "avatarSkin", 0);
        setIntField(term122992, term122992.getClass(), "avatarItem", 0);
        setIntField(term122992, term122992.getClass(), "avatarFront", 0);
        setIntField(term122992, term122992.getClass(), "avatarBack", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrameId", argTypes, term122992, args);
    }

};


