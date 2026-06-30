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

public class ProfileResp_setAvatarHead_2092504512136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124683;
     Object term124714;

    public ProfileResp_setAvatarHead_2092504512136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124683 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124683, term124683.getClass(), "userName", null);
        setIntField(term124683, term124683.getClass(), "level", 0);
        setField(term124683, term124683.getClass(), "exp", null);
        setLongField(term124683, term124683.getClass(), "point", 0L);
        setLongField(term124683, term124683.getClass(), "totalPoint", 0L);
        setIntField(term124683, term124683.getClass(), "playCount", 0);
        setIntField(term124683, term124683.getClass(), "playerRating", 0);
        setIntField(term124683, term124683.getClass(), "highestRating", 0);
        setIntField(term124683, term124683.getClass(), "nameplateId", 0);
        setIntField(term124683, term124683.getClass(), "frameId", 0);
        setIntField(term124683, term124683.getClass(), "characterId", 0);
        setIntField(term124683, term124683.getClass(), "trophyId", 0);
        setIntField(term124683, term124683.getClass(), "totalMapNum", 0);
        setLongField(term124683, term124683.getClass(), "totalHiScore", 0L);
        setLongField(term124683, term124683.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124683, term124683.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124683, term124683.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124683, term124683.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124683, term124683.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124683, term124683.getClass(), "friendCount", 0);
        setField(term124683, term124683.getClass(), "firstPlayDate", null);
        setField(term124683, term124683.getClass(), "lastPlayDate", null);
        setIntField(term124683, term124683.getClass(), "courseClass", 0);
        setIntField(term124683, term124683.getClass(), "overPowerPoint", 0);
        setIntField(term124683, term124683.getClass(), "overPowerRate", 0);
        setIntField(term124683, term124683.getClass(), "mapIconId", 0);
        setIntField(term124683, term124683.getClass(), "voiceId", 0);
        setIntField(term124683, term124683.getClass(), "avatarWear", 0);
        setIntField(term124683, term124683.getClass(), "avatarHead", 0);
        setIntField(term124683, term124683.getClass(), "avatarFace", 0);
        setIntField(term124683, term124683.getClass(), "avatarSkin", 0);
        setIntField(term124683, term124683.getClass(), "avatarItem", 0);
        setIntField(term124683, term124683.getClass(), "avatarFront", 0);
        setIntField(term124683, term124683.getClass(), "avatarBack", 0);
        term124714 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term124714;
        callMethod(klass, "setAvatarHead", argTypes, term124683, args);
    }

};


