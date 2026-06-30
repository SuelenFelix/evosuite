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

public class ProfileResp_getPoint_142922551377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122806;

    public ProfileResp_getPoint_142922551377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122806 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term122806, term122806.getClass(), "userName", null);
        setIntField(term122806, term122806.getClass(), "level", 0);
        setField(term122806, term122806.getClass(), "exp", null);
        setLongField(term122806, term122806.getClass(), "point", 0L);
        setLongField(term122806, term122806.getClass(), "totalPoint", 0L);
        setIntField(term122806, term122806.getClass(), "playCount", 0);
        setIntField(term122806, term122806.getClass(), "playerRating", 0);
        setIntField(term122806, term122806.getClass(), "highestRating", 0);
        setIntField(term122806, term122806.getClass(), "nameplateId", 0);
        setIntField(term122806, term122806.getClass(), "frameId", 0);
        setIntField(term122806, term122806.getClass(), "characterId", 0);
        setIntField(term122806, term122806.getClass(), "trophyId", 0);
        setIntField(term122806, term122806.getClass(), "totalMapNum", 0);
        setLongField(term122806, term122806.getClass(), "totalHiScore", 0L);
        setLongField(term122806, term122806.getClass(), "totalBasicHighScore", 0L);
        setLongField(term122806, term122806.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term122806, term122806.getClass(), "totalExpertHighScore", 0L);
        setLongField(term122806, term122806.getClass(), "totalMasterHighScore", 0L);
        setLongField(term122806, term122806.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term122806, term122806.getClass(), "friendCount", 0);
        setField(term122806, term122806.getClass(), "firstPlayDate", null);
        setField(term122806, term122806.getClass(), "lastPlayDate", null);
        setIntField(term122806, term122806.getClass(), "courseClass", 0);
        setIntField(term122806, term122806.getClass(), "overPowerPoint", 0);
        setIntField(term122806, term122806.getClass(), "overPowerRate", 0);
        setIntField(term122806, term122806.getClass(), "mapIconId", 0);
        setIntField(term122806, term122806.getClass(), "voiceId", 0);
        setIntField(term122806, term122806.getClass(), "avatarWear", 0);
        setIntField(term122806, term122806.getClass(), "avatarHead", 0);
        setIntField(term122806, term122806.getClass(), "avatarFace", 0);
        setIntField(term122806, term122806.getClass(), "avatarSkin", 0);
        setIntField(term122806, term122806.getClass(), "avatarItem", 0);
        setIntField(term122806, term122806.getClass(), "avatarFront", 0);
        setIntField(term122806, term122806.getClass(), "avatarBack", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPoint", argTypes, term122806, args);
    }

};


