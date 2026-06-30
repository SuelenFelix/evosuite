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

public class ProfileResp_setOverPowerPoint_1728439322131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124518;
     Object term124549;

    public ProfileResp_setOverPowerPoint_1728439322131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124518 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124518, term124518.getClass(), "userName", null);
        setIntField(term124518, term124518.getClass(), "level", 0);
        setField(term124518, term124518.getClass(), "exp", null);
        setLongField(term124518, term124518.getClass(), "point", 0L);
        setLongField(term124518, term124518.getClass(), "totalPoint", 0L);
        setIntField(term124518, term124518.getClass(), "playCount", 0);
        setIntField(term124518, term124518.getClass(), "playerRating", 0);
        setIntField(term124518, term124518.getClass(), "highestRating", 0);
        setIntField(term124518, term124518.getClass(), "nameplateId", 0);
        setIntField(term124518, term124518.getClass(), "frameId", 0);
        setIntField(term124518, term124518.getClass(), "characterId", 0);
        setIntField(term124518, term124518.getClass(), "trophyId", 0);
        setIntField(term124518, term124518.getClass(), "totalMapNum", 0);
        setLongField(term124518, term124518.getClass(), "totalHiScore", 0L);
        setLongField(term124518, term124518.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124518, term124518.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124518, term124518.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124518, term124518.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124518, term124518.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124518, term124518.getClass(), "friendCount", 0);
        setField(term124518, term124518.getClass(), "firstPlayDate", null);
        setField(term124518, term124518.getClass(), "lastPlayDate", null);
        setIntField(term124518, term124518.getClass(), "courseClass", 0);
        setIntField(term124518, term124518.getClass(), "overPowerPoint", 0);
        setIntField(term124518, term124518.getClass(), "overPowerRate", 0);
        setIntField(term124518, term124518.getClass(), "mapIconId", 0);
        setIntField(term124518, term124518.getClass(), "voiceId", 0);
        setIntField(term124518, term124518.getClass(), "avatarWear", 0);
        setIntField(term124518, term124518.getClass(), "avatarHead", 0);
        setIntField(term124518, term124518.getClass(), "avatarFace", 0);
        setIntField(term124518, term124518.getClass(), "avatarSkin", 0);
        setIntField(term124518, term124518.getClass(), "avatarItem", 0);
        setIntField(term124518, term124518.getClass(), "avatarFront", 0);
        setIntField(term124518, term124518.getClass(), "avatarBack", 0);
        term124549 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term124549;
        callMethod(klass, "setOverPowerPoint", argTypes, term124518, args);
    }

};


