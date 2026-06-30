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

public class ProfileResp_setAvatarFront_925406899140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124815;
     Object term124846;

    public ProfileResp_setAvatarFront_925406899140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124815 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124815, term124815.getClass(), "userName", null);
        setIntField(term124815, term124815.getClass(), "level", 0);
        setField(term124815, term124815.getClass(), "exp", null);
        setLongField(term124815, term124815.getClass(), "point", 0L);
        setLongField(term124815, term124815.getClass(), "totalPoint", 0L);
        setIntField(term124815, term124815.getClass(), "playCount", 0);
        setIntField(term124815, term124815.getClass(), "playerRating", 0);
        setIntField(term124815, term124815.getClass(), "highestRating", 0);
        setIntField(term124815, term124815.getClass(), "nameplateId", 0);
        setIntField(term124815, term124815.getClass(), "frameId", 0);
        setIntField(term124815, term124815.getClass(), "characterId", 0);
        setIntField(term124815, term124815.getClass(), "trophyId", 0);
        setIntField(term124815, term124815.getClass(), "totalMapNum", 0);
        setLongField(term124815, term124815.getClass(), "totalHiScore", 0L);
        setLongField(term124815, term124815.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124815, term124815.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124815, term124815.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124815, term124815.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124815, term124815.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124815, term124815.getClass(), "friendCount", 0);
        setField(term124815, term124815.getClass(), "firstPlayDate", null);
        setField(term124815, term124815.getClass(), "lastPlayDate", null);
        setIntField(term124815, term124815.getClass(), "courseClass", 0);
        setIntField(term124815, term124815.getClass(), "overPowerPoint", 0);
        setIntField(term124815, term124815.getClass(), "overPowerRate", 0);
        setIntField(term124815, term124815.getClass(), "mapIconId", 0);
        setIntField(term124815, term124815.getClass(), "voiceId", 0);
        setIntField(term124815, term124815.getClass(), "avatarWear", 0);
        setIntField(term124815, term124815.getClass(), "avatarHead", 0);
        setIntField(term124815, term124815.getClass(), "avatarFace", 0);
        setIntField(term124815, term124815.getClass(), "avatarSkin", 0);
        setIntField(term124815, term124815.getClass(), "avatarItem", 0);
        setIntField(term124815, term124815.getClass(), "avatarFront", 0);
        setIntField(term124815, term124815.getClass(), "avatarBack", 0);
        term124846 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term124846;
        callMethod(klass, "setAvatarFront", argTypes, term124815, args);
    }

};


