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

public class ProfileResp_setTotalMasterHighScore_1031993871125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124324;
     Object term124355;

    public ProfileResp_setTotalMasterHighScore_1031993871125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124324 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124324, term124324.getClass(), "userName", null);
        setIntField(term124324, term124324.getClass(), "level", 0);
        setField(term124324, term124324.getClass(), "exp", null);
        setLongField(term124324, term124324.getClass(), "point", 0L);
        setLongField(term124324, term124324.getClass(), "totalPoint", 0L);
        setIntField(term124324, term124324.getClass(), "playCount", 0);
        setIntField(term124324, term124324.getClass(), "playerRating", 0);
        setIntField(term124324, term124324.getClass(), "highestRating", 0);
        setIntField(term124324, term124324.getClass(), "nameplateId", 0);
        setIntField(term124324, term124324.getClass(), "frameId", 0);
        setIntField(term124324, term124324.getClass(), "characterId", 0);
        setIntField(term124324, term124324.getClass(), "trophyId", 0);
        setIntField(term124324, term124324.getClass(), "totalMapNum", 0);
        setLongField(term124324, term124324.getClass(), "totalHiScore", 0L);
        setLongField(term124324, term124324.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124324, term124324.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124324, term124324.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124324, term124324.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124324, term124324.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124324, term124324.getClass(), "friendCount", 0);
        setField(term124324, term124324.getClass(), "firstPlayDate", null);
        setField(term124324, term124324.getClass(), "lastPlayDate", null);
        setIntField(term124324, term124324.getClass(), "courseClass", 0);
        setIntField(term124324, term124324.getClass(), "overPowerPoint", 0);
        setIntField(term124324, term124324.getClass(), "overPowerRate", 0);
        setIntField(term124324, term124324.getClass(), "mapIconId", 0);
        setIntField(term124324, term124324.getClass(), "voiceId", 0);
        setIntField(term124324, term124324.getClass(), "avatarWear", 0);
        setIntField(term124324, term124324.getClass(), "avatarHead", 0);
        setIntField(term124324, term124324.getClass(), "avatarFace", 0);
        setIntField(term124324, term124324.getClass(), "avatarSkin", 0);
        setIntField(term124324, term124324.getClass(), "avatarItem", 0);
        setIntField(term124324, term124324.getClass(), "avatarFront", 0);
        setIntField(term124324, term124324.getClass(), "avatarBack", 0);
        term124355 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term124355;
        callMethod(klass, "setTotalMasterHighScore", argTypes, term124324, args);
    }

};


