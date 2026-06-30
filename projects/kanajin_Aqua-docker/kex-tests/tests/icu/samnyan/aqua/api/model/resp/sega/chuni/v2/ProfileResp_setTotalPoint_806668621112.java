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
import java.lang.Long;

public class ProfileResp_setTotalPoint_806668621112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123895;
     Object term123926;

    public ProfileResp_setTotalPoint_806668621112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123895 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term123895, term123895.getClass(), "userName", null);
        setIntField(term123895, term123895.getClass(), "level", 0);
        setField(term123895, term123895.getClass(), "exp", null);
        setLongField(term123895, term123895.getClass(), "point", 0L);
        setLongField(term123895, term123895.getClass(), "totalPoint", 0L);
        setIntField(term123895, term123895.getClass(), "playCount", 0);
        setIntField(term123895, term123895.getClass(), "playerRating", 0);
        setIntField(term123895, term123895.getClass(), "highestRating", 0);
        setIntField(term123895, term123895.getClass(), "nameplateId", 0);
        setIntField(term123895, term123895.getClass(), "frameId", 0);
        setIntField(term123895, term123895.getClass(), "characterId", 0);
        setIntField(term123895, term123895.getClass(), "trophyId", 0);
        setIntField(term123895, term123895.getClass(), "totalMapNum", 0);
        setLongField(term123895, term123895.getClass(), "totalHiScore", 0L);
        setLongField(term123895, term123895.getClass(), "totalBasicHighScore", 0L);
        setLongField(term123895, term123895.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term123895, term123895.getClass(), "totalExpertHighScore", 0L);
        setLongField(term123895, term123895.getClass(), "totalMasterHighScore", 0L);
        setLongField(term123895, term123895.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term123895, term123895.getClass(), "friendCount", 0);
        setField(term123895, term123895.getClass(), "firstPlayDate", null);
        setField(term123895, term123895.getClass(), "lastPlayDate", null);
        setIntField(term123895, term123895.getClass(), "courseClass", 0);
        setIntField(term123895, term123895.getClass(), "overPowerPoint", 0);
        setIntField(term123895, term123895.getClass(), "overPowerRate", 0);
        setIntField(term123895, term123895.getClass(), "mapIconId", 0);
        setIntField(term123895, term123895.getClass(), "voiceId", 0);
        setIntField(term123895, term123895.getClass(), "avatarWear", 0);
        setIntField(term123895, term123895.getClass(), "avatarHead", 0);
        setIntField(term123895, term123895.getClass(), "avatarFace", 0);
        setIntField(term123895, term123895.getClass(), "avatarSkin", 0);
        setIntField(term123895, term123895.getClass(), "avatarItem", 0);
        setIntField(term123895, term123895.getClass(), "avatarFront", 0);
        setIntField(term123895, term123895.getClass(), "avatarBack", 0);
        term123926 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term123926;
        callMethod(klass, "setTotalPoint", argTypes, term123895, args);
    }

};


