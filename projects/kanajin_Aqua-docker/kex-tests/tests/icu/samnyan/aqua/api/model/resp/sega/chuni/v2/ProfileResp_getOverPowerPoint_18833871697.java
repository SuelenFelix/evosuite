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

public class ProfileResp_getOverPowerPoint_18833871697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123426;

    public ProfileResp_getOverPowerPoint_18833871697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123426 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term123426, term123426.getClass(), "userName", null);
        setIntField(term123426, term123426.getClass(), "level", 0);
        setField(term123426, term123426.getClass(), "exp", null);
        setLongField(term123426, term123426.getClass(), "point", 0L);
        setLongField(term123426, term123426.getClass(), "totalPoint", 0L);
        setIntField(term123426, term123426.getClass(), "playCount", 0);
        setIntField(term123426, term123426.getClass(), "playerRating", 0);
        setIntField(term123426, term123426.getClass(), "highestRating", 0);
        setIntField(term123426, term123426.getClass(), "nameplateId", 0);
        setIntField(term123426, term123426.getClass(), "frameId", 0);
        setIntField(term123426, term123426.getClass(), "characterId", 0);
        setIntField(term123426, term123426.getClass(), "trophyId", 0);
        setIntField(term123426, term123426.getClass(), "totalMapNum", 0);
        setLongField(term123426, term123426.getClass(), "totalHiScore", 0L);
        setLongField(term123426, term123426.getClass(), "totalBasicHighScore", 0L);
        setLongField(term123426, term123426.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term123426, term123426.getClass(), "totalExpertHighScore", 0L);
        setLongField(term123426, term123426.getClass(), "totalMasterHighScore", 0L);
        setLongField(term123426, term123426.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term123426, term123426.getClass(), "friendCount", 0);
        setField(term123426, term123426.getClass(), "firstPlayDate", null);
        setField(term123426, term123426.getClass(), "lastPlayDate", null);
        setIntField(term123426, term123426.getClass(), "courseClass", 0);
        setIntField(term123426, term123426.getClass(), "overPowerPoint", 0);
        setIntField(term123426, term123426.getClass(), "overPowerRate", 0);
        setIntField(term123426, term123426.getClass(), "mapIconId", 0);
        setIntField(term123426, term123426.getClass(), "voiceId", 0);
        setIntField(term123426, term123426.getClass(), "avatarWear", 0);
        setIntField(term123426, term123426.getClass(), "avatarHead", 0);
        setIntField(term123426, term123426.getClass(), "avatarFace", 0);
        setIntField(term123426, term123426.getClass(), "avatarSkin", 0);
        setIntField(term123426, term123426.getClass(), "avatarItem", 0);
        setIntField(term123426, term123426.getClass(), "avatarFront", 0);
        setIntField(term123426, term123426.getClass(), "avatarBack", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getOverPowerPoint", argTypes, term123426, args);
    }

};


