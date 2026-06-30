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

public class ProfileResp_getExp_66263621976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122775;

    public ProfileResp_getExp_66263621976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122775 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term122775, term122775.getClass(), "userName", null);
        setIntField(term122775, term122775.getClass(), "level", 0);
        setField(term122775, term122775.getClass(), "exp", null);
        setLongField(term122775, term122775.getClass(), "point", 0L);
        setLongField(term122775, term122775.getClass(), "totalPoint", 0L);
        setIntField(term122775, term122775.getClass(), "playCount", 0);
        setIntField(term122775, term122775.getClass(), "playerRating", 0);
        setIntField(term122775, term122775.getClass(), "highestRating", 0);
        setIntField(term122775, term122775.getClass(), "nameplateId", 0);
        setIntField(term122775, term122775.getClass(), "frameId", 0);
        setIntField(term122775, term122775.getClass(), "characterId", 0);
        setIntField(term122775, term122775.getClass(), "trophyId", 0);
        setIntField(term122775, term122775.getClass(), "totalMapNum", 0);
        setLongField(term122775, term122775.getClass(), "totalHiScore", 0L);
        setLongField(term122775, term122775.getClass(), "totalBasicHighScore", 0L);
        setLongField(term122775, term122775.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term122775, term122775.getClass(), "totalExpertHighScore", 0L);
        setLongField(term122775, term122775.getClass(), "totalMasterHighScore", 0L);
        setLongField(term122775, term122775.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term122775, term122775.getClass(), "friendCount", 0);
        setField(term122775, term122775.getClass(), "firstPlayDate", null);
        setField(term122775, term122775.getClass(), "lastPlayDate", null);
        setIntField(term122775, term122775.getClass(), "courseClass", 0);
        setIntField(term122775, term122775.getClass(), "overPowerPoint", 0);
        setIntField(term122775, term122775.getClass(), "overPowerRate", 0);
        setIntField(term122775, term122775.getClass(), "mapIconId", 0);
        setIntField(term122775, term122775.getClass(), "voiceId", 0);
        setIntField(term122775, term122775.getClass(), "avatarWear", 0);
        setIntField(term122775, term122775.getClass(), "avatarHead", 0);
        setIntField(term122775, term122775.getClass(), "avatarFace", 0);
        setIntField(term122775, term122775.getClass(), "avatarSkin", 0);
        setIntField(term122775, term122775.getClass(), "avatarItem", 0);
        setIntField(term122775, term122775.getClass(), "avatarFront", 0);
        setIntField(term122775, term122775.getClass(), "avatarBack", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getExp", argTypes, term122775, args);
    }

};


