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

public class ProfileResp_setUserName_1742958888108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123767;

    public ProfileResp_setUserName_1742958888108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123767 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term123767, term123767.getClass(), "userName", null);
        setIntField(term123767, term123767.getClass(), "level", 0);
        setField(term123767, term123767.getClass(), "exp", null);
        setLongField(term123767, term123767.getClass(), "point", 0L);
        setLongField(term123767, term123767.getClass(), "totalPoint", 0L);
        setIntField(term123767, term123767.getClass(), "playCount", 0);
        setIntField(term123767, term123767.getClass(), "playerRating", 0);
        setIntField(term123767, term123767.getClass(), "highestRating", 0);
        setIntField(term123767, term123767.getClass(), "nameplateId", 0);
        setIntField(term123767, term123767.getClass(), "frameId", 0);
        setIntField(term123767, term123767.getClass(), "characterId", 0);
        setIntField(term123767, term123767.getClass(), "trophyId", 0);
        setIntField(term123767, term123767.getClass(), "totalMapNum", 0);
        setLongField(term123767, term123767.getClass(), "totalHiScore", 0L);
        setLongField(term123767, term123767.getClass(), "totalBasicHighScore", 0L);
        setLongField(term123767, term123767.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term123767, term123767.getClass(), "totalExpertHighScore", 0L);
        setLongField(term123767, term123767.getClass(), "totalMasterHighScore", 0L);
        setLongField(term123767, term123767.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term123767, term123767.getClass(), "friendCount", 0);
        setField(term123767, term123767.getClass(), "firstPlayDate", null);
        setField(term123767, term123767.getClass(), "lastPlayDate", null);
        setIntField(term123767, term123767.getClass(), "courseClass", 0);
        setIntField(term123767, term123767.getClass(), "overPowerPoint", 0);
        setIntField(term123767, term123767.getClass(), "overPowerRate", 0);
        setIntField(term123767, term123767.getClass(), "mapIconId", 0);
        setIntField(term123767, term123767.getClass(), "voiceId", 0);
        setIntField(term123767, term123767.getClass(), "avatarWear", 0);
        setIntField(term123767, term123767.getClass(), "avatarHead", 0);
        setIntField(term123767, term123767.getClass(), "avatarFace", 0);
        setIntField(term123767, term123767.getClass(), "avatarSkin", 0);
        setIntField(term123767, term123767.getClass(), "avatarItem", 0);
        setIntField(term123767, term123767.getClass(), "avatarFront", 0);
        setIntField(term123767, term123767.getClass(), "avatarBack", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setUserName", argTypes, term123767, args);
    }

};


