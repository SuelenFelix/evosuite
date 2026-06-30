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

public class ProfileResp_setAvatarWear_1773012065135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124650;
     Object term124681;

    public ProfileResp_setAvatarWear_1773012065135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124650 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124650, term124650.getClass(), "userName", null);
        setIntField(term124650, term124650.getClass(), "level", 0);
        setField(term124650, term124650.getClass(), "exp", null);
        setLongField(term124650, term124650.getClass(), "point", 0L);
        setLongField(term124650, term124650.getClass(), "totalPoint", 0L);
        setIntField(term124650, term124650.getClass(), "playCount", 0);
        setIntField(term124650, term124650.getClass(), "playerRating", 0);
        setIntField(term124650, term124650.getClass(), "highestRating", 0);
        setIntField(term124650, term124650.getClass(), "nameplateId", 0);
        setIntField(term124650, term124650.getClass(), "frameId", 0);
        setIntField(term124650, term124650.getClass(), "characterId", 0);
        setIntField(term124650, term124650.getClass(), "trophyId", 0);
        setIntField(term124650, term124650.getClass(), "totalMapNum", 0);
        setLongField(term124650, term124650.getClass(), "totalHiScore", 0L);
        setLongField(term124650, term124650.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124650, term124650.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124650, term124650.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124650, term124650.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124650, term124650.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124650, term124650.getClass(), "friendCount", 0);
        setField(term124650, term124650.getClass(), "firstPlayDate", null);
        setField(term124650, term124650.getClass(), "lastPlayDate", null);
        setIntField(term124650, term124650.getClass(), "courseClass", 0);
        setIntField(term124650, term124650.getClass(), "overPowerPoint", 0);
        setIntField(term124650, term124650.getClass(), "overPowerRate", 0);
        setIntField(term124650, term124650.getClass(), "mapIconId", 0);
        setIntField(term124650, term124650.getClass(), "voiceId", 0);
        setIntField(term124650, term124650.getClass(), "avatarWear", 0);
        setIntField(term124650, term124650.getClass(), "avatarHead", 0);
        setIntField(term124650, term124650.getClass(), "avatarFace", 0);
        setIntField(term124650, term124650.getClass(), "avatarSkin", 0);
        setIntField(term124650, term124650.getClass(), "avatarItem", 0);
        setIntField(term124650, term124650.getClass(), "avatarFront", 0);
        setIntField(term124650, term124650.getClass(), "avatarBack", 0);
        term124681 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term124681;
        callMethod(klass, "setAvatarWear", argTypes, term124650, args);
    }

};


