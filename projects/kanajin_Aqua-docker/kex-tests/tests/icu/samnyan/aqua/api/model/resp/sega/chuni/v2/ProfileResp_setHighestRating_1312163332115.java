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

public class ProfileResp_setHighestRating_1312163332115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123994;
     Object term124025;

    public ProfileResp_setHighestRating_1312163332115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123994 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        setField(term123994, term123994.getClass(), "userName", null);
        setIntField(term123994, term123994.getClass(), "level", 0);
        setField(term123994, term123994.getClass(), "exp", null);
        setLongField(term123994, term123994.getClass(), "point", 0L);
        setLongField(term123994, term123994.getClass(), "totalPoint", 0L);
        setIntField(term123994, term123994.getClass(), "playCount", 0);
        setIntField(term123994, term123994.getClass(), "playerRating", 0);
        setIntField(term123994, term123994.getClass(), "highestRating", 0);
        setIntField(term123994, term123994.getClass(), "nameplateId", 0);
        setIntField(term123994, term123994.getClass(), "frameId", 0);
        setIntField(term123994, term123994.getClass(), "characterId", 0);
        setIntField(term123994, term123994.getClass(), "trophyId", 0);
        setIntField(term123994, term123994.getClass(), "totalMapNum", 0);
        setLongField(term123994, term123994.getClass(), "totalHiScore", 0L);
        setLongField(term123994, term123994.getClass(), "totalBasicHighScore", 0L);
        setLongField(term123994, term123994.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term123994, term123994.getClass(), "totalExpertHighScore", 0L);
        setLongField(term123994, term123994.getClass(), "totalMasterHighScore", 0L);
        setLongField(term123994, term123994.getClass(), "totalUltimaHighScore", 0L);
        setIntField(term123994, term123994.getClass(), "friendCount", 0);
        setField(term123994, term123994.getClass(), "firstPlayDate", null);
        setField(term123994, term123994.getClass(), "lastPlayDate", null);
        setIntField(term123994, term123994.getClass(), "courseClass", 0);
        setIntField(term123994, term123994.getClass(), "overPowerPoint", 0);
        setIntField(term123994, term123994.getClass(), "overPowerRate", 0);
        setIntField(term123994, term123994.getClass(), "mapIconId", 0);
        setIntField(term123994, term123994.getClass(), "voiceId", 0);
        setIntField(term123994, term123994.getClass(), "avatarWear", 0);
        setIntField(term123994, term123994.getClass(), "avatarHead", 0);
        setIntField(term123994, term123994.getClass(), "avatarFace", 0);
        setIntField(term123994, term123994.getClass(), "avatarSkin", 0);
        setIntField(term123994, term123994.getClass(), "avatarItem", 0);
        setIntField(term123994, term123994.getClass(), "avatarFront", 0);
        setIntField(term123994, term123994.getClass(), "avatarBack", 0);
        term124025 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term124025;
        callMethod(klass, "setHighestRating", argTypes, term123994, args);
    }

};


