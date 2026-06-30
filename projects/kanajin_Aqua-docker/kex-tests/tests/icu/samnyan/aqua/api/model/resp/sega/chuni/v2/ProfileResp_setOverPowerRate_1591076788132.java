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

public class ProfileResp_setOverPowerRate_1591076788132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124551;
     Object term124582;

    public ProfileResp_setOverPowerRate_1591076788132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124551 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124551, term124551.getClass(), "userName", null);
        setIntField(term124551, term124551.getClass(), "level", 0);
        setField(term124551, term124551.getClass(), "exp", null);
        setLongField(term124551, term124551.getClass(), "point", 0L);
        setLongField(term124551, term124551.getClass(), "totalPoint", 0L);
        setIntField(term124551, term124551.getClass(), "playCount", 0);
        setIntField(term124551, term124551.getClass(), "playerRating", 0);
        setIntField(term124551, term124551.getClass(), "highestRating", 0);
        setIntField(term124551, term124551.getClass(), "nameplateId", 0);
        setIntField(term124551, term124551.getClass(), "frameId", 0);
        setIntField(term124551, term124551.getClass(), "characterId", 0);
        setIntField(term124551, term124551.getClass(), "trophyId", 0);
        setIntField(term124551, term124551.getClass(), "totalMapNum", 0);
        setLongField(term124551, term124551.getClass(), "totalHiScore", 0L);
        setLongField(term124551, term124551.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124551, term124551.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124551, term124551.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124551, term124551.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124551, term124551.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124551, term124551.getClass(), "friendCount", 0);
        setField(term124551, term124551.getClass(), "firstPlayDate", null);
        setField(term124551, term124551.getClass(), "lastPlayDate", null);
        setIntField(term124551, term124551.getClass(), "courseClass", 0);
        setIntField(term124551, term124551.getClass(), "overPowerPoint", 0);
        setIntField(term124551, term124551.getClass(), "overPowerRate", 0);
        setIntField(term124551, term124551.getClass(), "mapIconId", 0);
        setIntField(term124551, term124551.getClass(), "voiceId", 0);
        setIntField(term124551, term124551.getClass(), "avatarWear", 0);
        setIntField(term124551, term124551.getClass(), "avatarHead", 0);
        setIntField(term124551, term124551.getClass(), "avatarFace", 0);
        setIntField(term124551, term124551.getClass(), "avatarSkin", 0);
        setIntField(term124551, term124551.getClass(), "avatarItem", 0);
        setIntField(term124551, term124551.getClass(), "avatarFront", 0);
        setIntField(term124551, term124551.getClass(), "avatarBack", 0);
        term124582 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term124582;
        callMethod(klass, "setOverPowerRate", argTypes, term124551, args);
    }

};


