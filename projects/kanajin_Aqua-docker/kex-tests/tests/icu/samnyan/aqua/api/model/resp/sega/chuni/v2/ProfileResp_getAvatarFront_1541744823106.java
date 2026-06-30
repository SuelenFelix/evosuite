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

public class ProfileResp_getAvatarFront_1541744823106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123705;

    public ProfileResp_getAvatarFront_1541744823106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123705 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term123705, term123705.getClass(), "userName", null);
        setIntField(term123705, term123705.getClass(), "level", 0);
        setField(term123705, term123705.getClass(), "exp", null);
        setLongField(term123705, term123705.getClass(), "point", 0L);
        setLongField(term123705, term123705.getClass(), "totalPoint", 0L);
        setIntField(term123705, term123705.getClass(), "playCount", 0);
        setIntField(term123705, term123705.getClass(), "playerRating", 0);
        setIntField(term123705, term123705.getClass(), "highestRating", 0);
        setIntField(term123705, term123705.getClass(), "nameplateId", 0);
        setIntField(term123705, term123705.getClass(), "frameId", 0);
        setIntField(term123705, term123705.getClass(), "characterId", 0);
        setIntField(term123705, term123705.getClass(), "trophyId", 0);
        setIntField(term123705, term123705.getClass(), "totalMapNum", 0);
        setLongField(term123705, term123705.getClass(), "totalHiScore", 0L);
        setLongField(term123705, term123705.getClass(), "totalBasicHighScore", 0L);
        setLongField(term123705, term123705.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term123705, term123705.getClass(), "totalExpertHighScore", 0L);
        setLongField(term123705, term123705.getClass(), "totalMasterHighScore", 0L);
        setLongField(term123705, term123705.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term123705, term123705.getClass(), "friendCount", 0);
        setField(term123705, term123705.getClass(), "firstPlayDate", null);
        setField(term123705, term123705.getClass(), "lastPlayDate", null);
        setIntField(term123705, term123705.getClass(), "courseClass", 0);
        setIntField(term123705, term123705.getClass(), "overPowerPoint", 0);
        setIntField(term123705, term123705.getClass(), "overPowerRate", 0);
        setIntField(term123705, term123705.getClass(), "mapIconId", 0);
        setIntField(term123705, term123705.getClass(), "voiceId", 0);
        setIntField(term123705, term123705.getClass(), "avatarWear", 0);
        setIntField(term123705, term123705.getClass(), "avatarHead", 0);
        setIntField(term123705, term123705.getClass(), "avatarFace", 0);
        setIntField(term123705, term123705.getClass(), "avatarSkin", 0);
        setIntField(term123705, term123705.getClass(), "avatarItem", 0);
        setIntField(term123705, term123705.getClass(), "avatarFront", 0);
        setIntField(term123705, term123705.getClass(), "avatarBack", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAvatarFront", argTypes, term123705, args);
    }

};


