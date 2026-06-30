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

public class ProfileResp_getVoiceId_236002650100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123519;

    public ProfileResp_getVoiceId_236002650100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123519 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term123519, term123519.getClass(), "userName", null);
        setIntField(term123519, term123519.getClass(), "level", 0);
        setField(term123519, term123519.getClass(), "exp", null);
        setLongField(term123519, term123519.getClass(), "point", 0L);
        setLongField(term123519, term123519.getClass(), "totalPoint", 0L);
        setIntField(term123519, term123519.getClass(), "playCount", 0);
        setIntField(term123519, term123519.getClass(), "playerRating", 0);
        setIntField(term123519, term123519.getClass(), "highestRating", 0);
        setIntField(term123519, term123519.getClass(), "nameplateId", 0);
        setIntField(term123519, term123519.getClass(), "frameId", 0);
        setIntField(term123519, term123519.getClass(), "characterId", 0);
        setIntField(term123519, term123519.getClass(), "trophyId", 0);
        setIntField(term123519, term123519.getClass(), "totalMapNum", 0);
        setLongField(term123519, term123519.getClass(), "totalHiScore", 0L);
        setLongField(term123519, term123519.getClass(), "totalBasicHighScore", 0L);
        setLongField(term123519, term123519.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term123519, term123519.getClass(), "totalExpertHighScore", 0L);
        setLongField(term123519, term123519.getClass(), "totalMasterHighScore", 0L);
        setLongField(term123519, term123519.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term123519, term123519.getClass(), "friendCount", 0);
        setField(term123519, term123519.getClass(), "firstPlayDate", null);
        setField(term123519, term123519.getClass(), "lastPlayDate", null);
        setIntField(term123519, term123519.getClass(), "courseClass", 0);
        setIntField(term123519, term123519.getClass(), "overPowerPoint", 0);
        setIntField(term123519, term123519.getClass(), "overPowerRate", 0);
        setIntField(term123519, term123519.getClass(), "mapIconId", 0);
        setIntField(term123519, term123519.getClass(), "voiceId", 0);
        setIntField(term123519, term123519.getClass(), "avatarWear", 0);
        setIntField(term123519, term123519.getClass(), "avatarHead", 0);
        setIntField(term123519, term123519.getClass(), "avatarFace", 0);
        setIntField(term123519, term123519.getClass(), "avatarSkin", 0);
        setIntField(term123519, term123519.getClass(), "avatarItem", 0);
        setIntField(term123519, term123519.getClass(), "avatarFront", 0);
        setIntField(term123519, term123519.getClass(), "avatarBack", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVoiceId", argTypes, term123519, args);
    }

};


