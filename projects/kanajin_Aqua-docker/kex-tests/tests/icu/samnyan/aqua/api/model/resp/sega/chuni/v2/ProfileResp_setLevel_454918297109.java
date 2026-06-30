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

public class ProfileResp_setLevel_454918297109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123798;
     Object term123829;

    public ProfileResp_setLevel_454918297109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123798 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term123798, term123798.getClass(), "userName", null);
        setIntField(term123798, term123798.getClass(), "level", 0);
        setField(term123798, term123798.getClass(), "exp", null);
        setLongField(term123798, term123798.getClass(), "point", 0L);
        setLongField(term123798, term123798.getClass(), "totalPoint", 0L);
        setIntField(term123798, term123798.getClass(), "playCount", 0);
        setIntField(term123798, term123798.getClass(), "playerRating", 0);
        setIntField(term123798, term123798.getClass(), "highestRating", 0);
        setIntField(term123798, term123798.getClass(), "nameplateId", 0);
        setIntField(term123798, term123798.getClass(), "frameId", 0);
        setIntField(term123798, term123798.getClass(), "characterId", 0);
        setIntField(term123798, term123798.getClass(), "trophyId", 0);
        setIntField(term123798, term123798.getClass(), "totalMapNum", 0);
        setLongField(term123798, term123798.getClass(), "totalHiScore", 0L);
        setLongField(term123798, term123798.getClass(), "totalBasicHighScore", 0L);
        setLongField(term123798, term123798.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term123798, term123798.getClass(), "totalExpertHighScore", 0L);
        setLongField(term123798, term123798.getClass(), "totalMasterHighScore", 0L);
        setLongField(term123798, term123798.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term123798, term123798.getClass(), "friendCount", 0);
        setField(term123798, term123798.getClass(), "firstPlayDate", null);
        setField(term123798, term123798.getClass(), "lastPlayDate", null);
        setIntField(term123798, term123798.getClass(), "courseClass", 0);
        setIntField(term123798, term123798.getClass(), "overPowerPoint", 0);
        setIntField(term123798, term123798.getClass(), "overPowerRate", 0);
        setIntField(term123798, term123798.getClass(), "mapIconId", 0);
        setIntField(term123798, term123798.getClass(), "voiceId", 0);
        setIntField(term123798, term123798.getClass(), "avatarWear", 0);
        setIntField(term123798, term123798.getClass(), "avatarHead", 0);
        setIntField(term123798, term123798.getClass(), "avatarFace", 0);
        setIntField(term123798, term123798.getClass(), "avatarSkin", 0);
        setIntField(term123798, term123798.getClass(), "avatarItem", 0);
        setIntField(term123798, term123798.getClass(), "avatarFront", 0);
        setIntField(term123798, term123798.getClass(), "avatarBack", 0);
        term123829 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term123829;
        callMethod(klass, "setLevel", argTypes, term123798, args);
    }

};


