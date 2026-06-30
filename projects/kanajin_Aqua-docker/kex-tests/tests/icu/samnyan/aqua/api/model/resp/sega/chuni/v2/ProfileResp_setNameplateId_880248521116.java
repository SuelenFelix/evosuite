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

public class ProfileResp_setNameplateId_880248521116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124027;
     Object term124058;

    public ProfileResp_setNameplateId_880248521116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term124027 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term124027, term124027.getClass(), "userName", null);
        setIntField(term124027, term124027.getClass(), "level", 0);
        setField(term124027, term124027.getClass(), "exp", null);
        setLongField(term124027, term124027.getClass(), "point", 0L);
        setLongField(term124027, term124027.getClass(), "totalPoint", 0L);
        setIntField(term124027, term124027.getClass(), "playCount", 0);
        setIntField(term124027, term124027.getClass(), "playerRating", 0);
        setIntField(term124027, term124027.getClass(), "highestRating", 0);
        setIntField(term124027, term124027.getClass(), "nameplateId", 0);
        setIntField(term124027, term124027.getClass(), "frameId", 0);
        setIntField(term124027, term124027.getClass(), "characterId", 0);
        setIntField(term124027, term124027.getClass(), "trophyId", 0);
        setIntField(term124027, term124027.getClass(), "totalMapNum", 0);
        setLongField(term124027, term124027.getClass(), "totalHiScore", 0L);
        setLongField(term124027, term124027.getClass(), "totalBasicHighScore", 0L);
        setLongField(term124027, term124027.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term124027, term124027.getClass(), "totalExpertHighScore", 0L);
        setLongField(term124027, term124027.getClass(), "totalMasterHighScore", 0L);
        setLongField(term124027, term124027.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term124027, term124027.getClass(), "friendCount", 0);
        setField(term124027, term124027.getClass(), "firstPlayDate", null);
        setField(term124027, term124027.getClass(), "lastPlayDate", null);
        setIntField(term124027, term124027.getClass(), "courseClass", 0);
        setIntField(term124027, term124027.getClass(), "overPowerPoint", 0);
        setIntField(term124027, term124027.getClass(), "overPowerRate", 0);
        setIntField(term124027, term124027.getClass(), "mapIconId", 0);
        setIntField(term124027, term124027.getClass(), "voiceId", 0);
        setIntField(term124027, term124027.getClass(), "avatarWear", 0);
        setIntField(term124027, term124027.getClass(), "avatarHead", 0);
        setIntField(term124027, term124027.getClass(), "avatarFace", 0);
        setIntField(term124027, term124027.getClass(), "avatarSkin", 0);
        setIntField(term124027, term124027.getClass(), "avatarItem", 0);
        setIntField(term124027, term124027.getClass(), "avatarFront", 0);
        setIntField(term124027, term124027.getClass(), "avatarBack", 0);
        term124058 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term124058;
        callMethod(klass, "setNameplateId", argTypes, term124027, args);
    }

};


