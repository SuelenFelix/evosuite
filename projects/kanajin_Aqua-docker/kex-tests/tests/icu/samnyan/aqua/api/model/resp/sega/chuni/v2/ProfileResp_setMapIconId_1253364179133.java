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

public class ProfileResp_setMapIconId_1253364179133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124584;
     Object term124615;

    public ProfileResp_setMapIconId_1253364179133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124584 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124584, term124584.getClass(), "userName", null);
        setIntField(term124584, term124584.getClass(), "level", 0);
        setField(term124584, term124584.getClass(), "exp", null);
        setLongField(term124584, term124584.getClass(), "point", 0L);
        setLongField(term124584, term124584.getClass(), "totalPoint", 0L);
        setIntField(term124584, term124584.getClass(), "playCount", 0);
        setIntField(term124584, term124584.getClass(), "playerRating", 0);
        setIntField(term124584, term124584.getClass(), "highestRating", 0);
        setIntField(term124584, term124584.getClass(), "nameplateId", 0);
        setIntField(term124584, term124584.getClass(), "frameId", 0);
        setIntField(term124584, term124584.getClass(), "characterId", 0);
        setIntField(term124584, term124584.getClass(), "trophyId", 0);
        setIntField(term124584, term124584.getClass(), "totalMapNum", 0);
        setLongField(term124584, term124584.getClass(), "totalHiScore", 0L);
        setLongField(term124584, term124584.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124584, term124584.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124584, term124584.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124584, term124584.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124584, term124584.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124584, term124584.getClass(), "friendCount", 0);
        setField(term124584, term124584.getClass(), "firstPlayDate", null);
        setField(term124584, term124584.getClass(), "lastPlayDate", null);
        setIntField(term124584, term124584.getClass(), "courseClass", 0);
        setIntField(term124584, term124584.getClass(), "overPowerPoint", 0);
        setIntField(term124584, term124584.getClass(), "overPowerRate", 0);
        setIntField(term124584, term124584.getClass(), "mapIconId", 0);
        setIntField(term124584, term124584.getClass(), "voiceId", 0);
        setIntField(term124584, term124584.getClass(), "avatarWear", 0);
        setIntField(term124584, term124584.getClass(), "avatarHead", 0);
        setIntField(term124584, term124584.getClass(), "avatarFace", 0);
        setIntField(term124584, term124584.getClass(), "avatarSkin", 0);
        setIntField(term124584, term124584.getClass(), "avatarItem", 0);
        setIntField(term124584, term124584.getClass(), "avatarFront", 0);
        setIntField(term124584, term124584.getClass(), "avatarBack", 0);
        term124615 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term124615;
        callMethod(klass, "setMapIconId", argTypes, term124584, args);
    }

};


