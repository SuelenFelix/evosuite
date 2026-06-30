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
import java.lang.Integer;

public class ProfileResp_setFriendCount_1299552052127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124390;
     Object term124421;

    public ProfileResp_setFriendCount_1299552052127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124390 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124390, term124390.getClass(), "userName", null);
        setIntField(term124390, term124390.getClass(), "level", 0);
        setField(term124390, term124390.getClass(), "exp", null);
        setLongField(term124390, term124390.getClass(), "point", 0L);
        setLongField(term124390, term124390.getClass(), "totalPoint", 0L);
        setIntField(term124390, term124390.getClass(), "playCount", 0);
        setIntField(term124390, term124390.getClass(), "playerRating", 0);
        setIntField(term124390, term124390.getClass(), "highestRating", 0);
        setIntField(term124390, term124390.getClass(), "nameplateId", 0);
        setIntField(term124390, term124390.getClass(), "frameId", 0);
        setIntField(term124390, term124390.getClass(), "characterId", 0);
        setIntField(term124390, term124390.getClass(), "trophyId", 0);
        setIntField(term124390, term124390.getClass(), "totalMapNum", 0);
        setLongField(term124390, term124390.getClass(), "totalHiScore", 0L);
        setLongField(term124390, term124390.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124390, term124390.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124390, term124390.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124390, term124390.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124390, term124390.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124390, term124390.getClass(), "friendCount", 0);
        setField(term124390, term124390.getClass(), "firstPlayDate", null);
        setField(term124390, term124390.getClass(), "lastPlayDate", null);
        setIntField(term124390, term124390.getClass(), "courseClass", 0);
        setIntField(term124390, term124390.getClass(), "overPowerPoint", 0);
        setIntField(term124390, term124390.getClass(), "overPowerRate", 0);
        setIntField(term124390, term124390.getClass(), "mapIconId", 0);
        setIntField(term124390, term124390.getClass(), "voiceId", 0);
        setIntField(term124390, term124390.getClass(), "avatarWear", 0);
        setIntField(term124390, term124390.getClass(), "avatarHead", 0);
        setIntField(term124390, term124390.getClass(), "avatarFace", 0);
        setIntField(term124390, term124390.getClass(), "avatarSkin", 0);
        setIntField(term124390, term124390.getClass(), "avatarItem", 0);
        setIntField(term124390, term124390.getClass(), "avatarFront", 0);
        setIntField(term124390, term124390.getClass(), "avatarBack", 0);
        term124421 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term124421;
        callMethod(klass, "setFriendCount", argTypes, term124390, args);
    }

};


