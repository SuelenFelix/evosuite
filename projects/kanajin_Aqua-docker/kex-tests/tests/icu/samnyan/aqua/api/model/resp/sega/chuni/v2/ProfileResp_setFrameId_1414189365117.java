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

public class ProfileResp_setFrameId_1414189365117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124060;
     Object term124091;

    public ProfileResp_setFrameId_1414189365117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124060 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124060, term124060.getClass(), "userName", null);
        setIntField(term124060, term124060.getClass(), "level", 0);
        setField(term124060, term124060.getClass(), "exp", null);
        setLongField(term124060, term124060.getClass(), "point", 0L);
        setLongField(term124060, term124060.getClass(), "totalPoint", 0L);
        setIntField(term124060, term124060.getClass(), "playCount", 0);
        setIntField(term124060, term124060.getClass(), "playerRating", 0);
        setIntField(term124060, term124060.getClass(), "highestRating", 0);
        setIntField(term124060, term124060.getClass(), "nameplateId", 0);
        setIntField(term124060, term124060.getClass(), "frameId", 0);
        setIntField(term124060, term124060.getClass(), "characterId", 0);
        setIntField(term124060, term124060.getClass(), "trophyId", 0);
        setIntField(term124060, term124060.getClass(), "totalMapNum", 0);
        setLongField(term124060, term124060.getClass(), "totalHiScore", 0L);
        setLongField(term124060, term124060.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124060, term124060.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124060, term124060.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124060, term124060.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124060, term124060.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124060, term124060.getClass(), "friendCount", 0);
        setField(term124060, term124060.getClass(), "firstPlayDate", null);
        setField(term124060, term124060.getClass(), "lastPlayDate", null);
        setIntField(term124060, term124060.getClass(), "courseClass", 0);
        setIntField(term124060, term124060.getClass(), "overPowerPoint", 0);
        setIntField(term124060, term124060.getClass(), "overPowerRate", 0);
        setIntField(term124060, term124060.getClass(), "mapIconId", 0);
        setIntField(term124060, term124060.getClass(), "voiceId", 0);
        setIntField(term124060, term124060.getClass(), "avatarWear", 0);
        setIntField(term124060, term124060.getClass(), "avatarHead", 0);
        setIntField(term124060, term124060.getClass(), "avatarFace", 0);
        setIntField(term124060, term124060.getClass(), "avatarSkin", 0);
        setIntField(term124060, term124060.getClass(), "avatarItem", 0);
        setIntField(term124060, term124060.getClass(), "avatarFront", 0);
        setIntField(term124060, term124060.getClass(), "avatarBack", 0);
        term124091 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term124091;
        callMethod(klass, "setFrameId", argTypes, term124060, args);
    }

};


