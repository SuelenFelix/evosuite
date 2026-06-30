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

public class ProfileResp_setAvatarItem_2135114291139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124782;
     Object term124813;

    public ProfileResp_setAvatarItem_2135114291139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124782 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124782, term124782.getClass(), "userName", null);
        setIntField(term124782, term124782.getClass(), "level", 0);
        setField(term124782, term124782.getClass(), "exp", null);
        setLongField(term124782, term124782.getClass(), "point", 0L);
        setLongField(term124782, term124782.getClass(), "totalPoint", 0L);
        setIntField(term124782, term124782.getClass(), "playCount", 0);
        setIntField(term124782, term124782.getClass(), "playerRating", 0);
        setIntField(term124782, term124782.getClass(), "highestRating", 0);
        setIntField(term124782, term124782.getClass(), "nameplateId", 0);
        setIntField(term124782, term124782.getClass(), "frameId", 0);
        setIntField(term124782, term124782.getClass(), "characterId", 0);
        setIntField(term124782, term124782.getClass(), "trophyId", 0);
        setIntField(term124782, term124782.getClass(), "totalMapNum", 0);
        setLongField(term124782, term124782.getClass(), "totalHiScore", 0L);
        setLongField(term124782, term124782.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124782, term124782.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124782, term124782.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124782, term124782.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124782, term124782.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124782, term124782.getClass(), "friendCount", 0);
        setField(term124782, term124782.getClass(), "firstPlayDate", null);
        setField(term124782, term124782.getClass(), "lastPlayDate", null);
        setIntField(term124782, term124782.getClass(), "courseClass", 0);
        setIntField(term124782, term124782.getClass(), "overPowerPoint", 0);
        setIntField(term124782, term124782.getClass(), "overPowerRate", 0);
        setIntField(term124782, term124782.getClass(), "mapIconId", 0);
        setIntField(term124782, term124782.getClass(), "voiceId", 0);
        setIntField(term124782, term124782.getClass(), "avatarWear", 0);
        setIntField(term124782, term124782.getClass(), "avatarHead", 0);
        setIntField(term124782, term124782.getClass(), "avatarFace", 0);
        setIntField(term124782, term124782.getClass(), "avatarSkin", 0);
        setIntField(term124782, term124782.getClass(), "avatarItem", 0);
        setIntField(term124782, term124782.getClass(), "avatarFront", 0);
        setIntField(term124782, term124782.getClass(), "avatarBack", 0);
        term124813 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term124813;
        callMethod(klass, "setAvatarItem", argTypes, term124782, args);
    }

};


