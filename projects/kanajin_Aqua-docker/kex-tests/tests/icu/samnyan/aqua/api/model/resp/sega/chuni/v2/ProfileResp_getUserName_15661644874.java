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

public class ProfileResp_getUserName_15661644874 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122713;

    public ProfileResp_getUserName_15661644874() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122713 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term122713, term122713.getClass(), "userName", null);
        setIntField(term122713, term122713.getClass(), "level", 0);
        setField(term122713, term122713.getClass(), "exp", null);
        setLongField(term122713, term122713.getClass(), "point", 0L);
        setLongField(term122713, term122713.getClass(), "totalPoint", 0L);
        setIntField(term122713, term122713.getClass(), "playCount", 0);
        setIntField(term122713, term122713.getClass(), "playerRating", 0);
        setIntField(term122713, term122713.getClass(), "highestRating", 0);
        setIntField(term122713, term122713.getClass(), "nameplateId", 0);
        setIntField(term122713, term122713.getClass(), "frameId", 0);
        setIntField(term122713, term122713.getClass(), "characterId", 0);
        setIntField(term122713, term122713.getClass(), "trophyId", 0);
        setIntField(term122713, term122713.getClass(), "totalMapNum", 0);
        setLongField(term122713, term122713.getClass(), "totalHiScore", 0L);
        setLongField(term122713, term122713.getClass(), "totalBasicHighScore", 0L);
        setLongField(term122713, term122713.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term122713, term122713.getClass(), "totalExpertHighScore", 0L);
        setLongField(term122713, term122713.getClass(), "totalMasterHighScore", 0L);
        setLongField(term122713, term122713.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term122713, term122713.getClass(), "friendCount", 0);
        setField(term122713, term122713.getClass(), "firstPlayDate", null);
        setField(term122713, term122713.getClass(), "lastPlayDate", null);
        setIntField(term122713, term122713.getClass(), "courseClass", 0);
        setIntField(term122713, term122713.getClass(), "overPowerPoint", 0);
        setIntField(term122713, term122713.getClass(), "overPowerRate", 0);
        setIntField(term122713, term122713.getClass(), "mapIconId", 0);
        setIntField(term122713, term122713.getClass(), "voiceId", 0);
        setIntField(term122713, term122713.getClass(), "avatarWear", 0);
        setIntField(term122713, term122713.getClass(), "avatarHead", 0);
        setIntField(term122713, term122713.getClass(), "avatarFace", 0);
        setIntField(term122713, term122713.getClass(), "avatarSkin", 0);
        setIntField(term122713, term122713.getClass(), "avatarItem", 0);
        setIntField(term122713, term122713.getClass(), "avatarFront", 0);
        setIntField(term122713, term122713.getClass(), "avatarBack", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term122713, args);
    }

};


