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

public class ProfileResp_getAvatarHead_1178124734102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123581;

    public ProfileResp_getAvatarHead_1178124734102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123581 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term123581, term123581.getClass(), "userName", null);
        setIntField(term123581, term123581.getClass(), "level", 0);
        setField(term123581, term123581.getClass(), "exp", null);
        setLongField(term123581, term123581.getClass(), "point", 0L);
        setLongField(term123581, term123581.getClass(), "totalPoint", 0L);
        setIntField(term123581, term123581.getClass(), "playCount", 0);
        setIntField(term123581, term123581.getClass(), "playerRating", 0);
        setIntField(term123581, term123581.getClass(), "highestRating", 0);
        setIntField(term123581, term123581.getClass(), "nameplateId", 0);
        setIntField(term123581, term123581.getClass(), "frameId", 0);
        setIntField(term123581, term123581.getClass(), "characterId", 0);
        setIntField(term123581, term123581.getClass(), "trophyId", 0);
        setIntField(term123581, term123581.getClass(), "totalMapNum", 0);
        setLongField(term123581, term123581.getClass(), "totalHiScore", 0L);
        setLongField(term123581, term123581.getClass(), "totalBasicHighScore", 0L);
        setLongField(term123581, term123581.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term123581, term123581.getClass(), "totalExpertHighScore", 0L);
        setLongField(term123581, term123581.getClass(), "totalMasterHighScore", 0L);
        setLongField(term123581, term123581.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term123581, term123581.getClass(), "friendCount", 0);
        setField(term123581, term123581.getClass(), "firstPlayDate", null);
        setField(term123581, term123581.getClass(), "lastPlayDate", null);
        setIntField(term123581, term123581.getClass(), "courseClass", 0);
        setIntField(term123581, term123581.getClass(), "overPowerPoint", 0);
        setIntField(term123581, term123581.getClass(), "overPowerRate", 0);
        setIntField(term123581, term123581.getClass(), "mapIconId", 0);
        setIntField(term123581, term123581.getClass(), "voiceId", 0);
        setIntField(term123581, term123581.getClass(), "avatarWear", 0);
        setIntField(term123581, term123581.getClass(), "avatarHead", 0);
        setIntField(term123581, term123581.getClass(), "avatarFace", 0);
        setIntField(term123581, term123581.getClass(), "avatarSkin", 0);
        setIntField(term123581, term123581.getClass(), "avatarItem", 0);
        setIntField(term123581, term123581.getClass(), "avatarFront", 0);
        setIntField(term123581, term123581.getClass(), "avatarBack", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarHead", argTypes, term123581, args);
    }

};


