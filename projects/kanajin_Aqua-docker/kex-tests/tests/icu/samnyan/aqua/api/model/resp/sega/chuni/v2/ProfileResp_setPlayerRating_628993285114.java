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

public class ProfileResp_setPlayerRating_628993285114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123961;
     Object term123992;

    public ProfileResp_setPlayerRating_628993285114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123961 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term123961, term123961.getClass(), "userName", null);
        setIntField(term123961, term123961.getClass(), "level", 0);
        setField(term123961, term123961.getClass(), "exp", null);
        setLongField(term123961, term123961.getClass(), "point", 0L);
        setLongField(term123961, term123961.getClass(), "totalPoint", 0L);
        setIntField(term123961, term123961.getClass(), "playCount", 0);
        setIntField(term123961, term123961.getClass(), "playerRating", 0);
        setIntField(term123961, term123961.getClass(), "highestRating", 0);
        setIntField(term123961, term123961.getClass(), "nameplateId", 0);
        setIntField(term123961, term123961.getClass(), "frameId", 0);
        setIntField(term123961, term123961.getClass(), "characterId", 0);
        setIntField(term123961, term123961.getClass(), "trophyId", 0);
        setIntField(term123961, term123961.getClass(), "totalMapNum", 0);
        setLongField(term123961, term123961.getClass(), "totalHiScore", 0L);
        setLongField(term123961, term123961.getClass(), "totalBasicHighScore", 0L);
        setLongField(term123961, term123961.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term123961, term123961.getClass(), "totalExpertHighScore", 0L);
        setLongField(term123961, term123961.getClass(), "totalMasterHighScore", 0L);
        setLongField(term123961, term123961.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term123961, term123961.getClass(), "friendCount", 0);
        setField(term123961, term123961.getClass(), "firstPlayDate", null);
        setField(term123961, term123961.getClass(), "lastPlayDate", null);
        setIntField(term123961, term123961.getClass(), "courseClass", 0);
        setIntField(term123961, term123961.getClass(), "overPowerPoint", 0);
        setIntField(term123961, term123961.getClass(), "overPowerRate", 0);
        setIntField(term123961, term123961.getClass(), "mapIconId", 0);
        setIntField(term123961, term123961.getClass(), "voiceId", 0);
        setIntField(term123961, term123961.getClass(), "avatarWear", 0);
        setIntField(term123961, term123961.getClass(), "avatarHead", 0);
        setIntField(term123961, term123961.getClass(), "avatarFace", 0);
        setIntField(term123961, term123961.getClass(), "avatarSkin", 0);
        setIntField(term123961, term123961.getClass(), "avatarItem", 0);
        setIntField(term123961, term123961.getClass(), "avatarFront", 0);
        setIntField(term123961, term123961.getClass(), "avatarBack", 0);
        term123992 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term123992;
        callMethod(klass, "setPlayerRating", argTypes, term123961, args);
    }

};


