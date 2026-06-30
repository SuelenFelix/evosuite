package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public class UserMusicDetail_init_120792780330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188209;
     Object term188211;
     Object term188385;
     Object term188387;
     Object term188389;
     Object term188391;
     Object term188393;
     Object term188395;
     Object term188397;
     Object term188399;
     Object term188401;
     Object term188403;

    public UserMusicDetail_init_120792780330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188209 = new Long(-1132124748716009489L);
        Long term188215 = new Long(3161040540173678206L);
        term188211 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term188213 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term188229 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term188230 = newInstance(Class.forName("java.time.LocalDate"));
        Object term188234 = newInstance(Class.forName("java.time.LocalTime"));
        Object term188239 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term188240 = newInstance(Class.forName("java.time.LocalDate"));
        Object term188244 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term188211, term188211.getClass(), "id", 6417149748828373606L);
        setLongField(term188213, term188213.getClass(), "id", -4468743939548166452L);
        setField(term188213, term188213.getClass(), "extId", term188215);
        setField(term188213, term188213.getClass(), "luid", "GFuTvYNJGi");
        setIntField(term188230, term188230.getClass(), "year", 2026);
        setShortField(term188230, term188230.getClass(), "month", (short) 10);
        setShortField(term188230, term188230.getClass(), "day", (short) 27);
        setField(term188229, term188229.getClass(), "date", term188230);
        setByteField(term188234, term188234.getClass(), "hour", (byte) 13);
        setByteField(term188234, term188234.getClass(), "minute", (byte) 28);
        setByteField(term188234, term188234.getClass(), "second", (byte) 2);
        setIntField(term188234, term188234.getClass(), "nano", 546979873);
        setField(term188229, term188229.getClass(), "time", term188234);
        setField(term188213, term188213.getClass(), "registerTime", term188229);
        setIntField(term188240, term188240.getClass(), "year", 2011);
        setShortField(term188240, term188240.getClass(), "month", (short) 9);
        setShortField(term188240, term188240.getClass(), "day", (short) 22);
        setField(term188239, term188239.getClass(), "date", term188240);
        setByteField(term188244, term188244.getClass(), "hour", (byte) 5);
        setByteField(term188244, term188244.getClass(), "minute", (byte) 47);
        setByteField(term188244, term188244.getClass(), "second", (byte) 44);
        setIntField(term188244, term188244.getClass(), "nano", 154012278);
        setField(term188239, term188239.getClass(), "time", term188244);
        setField(term188213, term188213.getClass(), "accessTime", term188239);
        setField(term188211, term188211.getClass(), "card", term188213);
        setIntField(term188211, term188211.getClass(), "lastDataVersion", -602517095);
        setField(term188211, term188211.getClass(), "userName", "JgUbvEJCOI");
        setIntField(term188211, term188211.getClass(), "point", 1921366352);
        setIntField(term188211, term188211.getClass(), "totalPoint", 1238184082);
        setIntField(term188211, term188211.getClass(), "iconId", 1584435082);
        setIntField(term188211, term188211.getClass(), "nameplateId", -1536494457);
        setIntField(term188211, term188211.getClass(), "frameId", 1802658954);
        setIntField(term188211, term188211.getClass(), "trophyId", -34187836);
        setIntField(term188211, term188211.getClass(), "playCount", -753442260);
        setIntField(term188211, term188211.getClass(), "playVsCount", 1117087800);
        setIntField(term188211, term188211.getClass(), "playSyncCount", 1563164527);
        setIntField(term188211, term188211.getClass(), "winCount", -1319855997);
        setIntField(term188211, term188211.getClass(), "helpCount", 1776758858);
        setIntField(term188211, term188211.getClass(), "comboCount", -1033691641);
        setIntField(term188211, term188211.getClass(), "feverCount", -652063512);
        setIntField(term188211, term188211.getClass(), "totalHiScore", 493778019);
        setIntField(term188211, term188211.getClass(), "totalEasyHighScore", -1841596761);
        setIntField(term188211, term188211.getClass(), "totalBasicHighScore", -27133697);
        setIntField(term188211, term188211.getClass(), "totalAdvancedHighScore", 44998209);
        setIntField(term188211, term188211.getClass(), "totalExpertHighScore", 1157758353);
        setIntField(term188211, term188211.getClass(), "totalMasterHighScore", 1254297102);
        setIntField(term188211, term188211.getClass(), "totalReMasterHighScore", 477859521);
        setIntField(term188211, term188211.getClass(), "totalHighSync", -1549054911);
        setIntField(term188211, term188211.getClass(), "totalEasySync", 1169909339);
        setIntField(term188211, term188211.getClass(), "totalBasicSync", -170156922);
        setIntField(term188211, term188211.getClass(), "totalAdvancedSync", -1802956118);
        setIntField(term188211, term188211.getClass(), "totalExpertSync", -605999750);
        setIntField(term188211, term188211.getClass(), "totalMasterSync", 1334827253);
        setIntField(term188211, term188211.getClass(), "totalReMasterSync", 60188100);
        setIntField(term188211, term188211.getClass(), "playerRating", -1432858828);
        setIntField(term188211, term188211.getClass(), "highestRating", -928670239);
        setIntField(term188211, term188211.getClass(), "rankAuthTailId", 1380297081);
        setField(term188211, term188211.getClass(), "eventWatchedDate", "ILpMVHBxyt");
        setField(term188211, term188211.getClass(), "webLimitDate", "horZwJhkMz");
        setIntField(term188211, term188211.getClass(), "challengeTrackPhase", -984273184);
        setIntField(term188211, term188211.getClass(), "firstPlayBits", 2134659484);
        setField(term188211, term188211.getClass(), "lastPlayDate", "arxpTGARuO");
        setIntField(term188211, term188211.getClass(), "lastPlaceId", 1687743392);
        setField(term188211, term188211.getClass(), "lastPlaceName", "WJTTZvfEje");
        setIntField(term188211, term188211.getClass(), "lastRegionId", -2101402577);
        setField(term188211, term188211.getClass(), "lastRegionName", "JcubNxEOPJ");
        setField(term188211, term188211.getClass(), "lastClientId", "DZwNgsnbSX");
        setField(term188211, term188211.getClass(), "lastCountryCode", "rEnEFWzeqA");
        setIntField(term188211, term188211.getClass(), "eventPoint", -2103105205);
        setIntField(term188211, term188211.getClass(), "totalLv", -792024123);
        setIntField(term188211, term188211.getClass(), "lastLoginBonusDay", 1310604586);
        setIntField(term188211, term188211.getClass(), "lastSurvivalBonusDay", 120421390);
        setIntField(term188211, term188211.getClass(), "loginBonusLv", -420931327);
        term188385 = new Integer(-619679652);
        term188387 = new Integer(1260602512);
        term188389 = new Integer(-1482318461);
        term188391 = new Integer(717433338);
        term188393 = new Integer(1847086396);
        term188395 = new Boolean(false);
        term188397 = new Integer(56579091);
        term188399 = new Integer(401140080);
        term188401 = new Integer(-1237178139);
        term188403 = new Integer(-95590382);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[12];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = boolean.class;
        argTypes[8] = int.class;
        argTypes[9] = int.class;
        argTypes[10] = int.class;
        argTypes[11] = int.class;
        Object[] args = new Object[12];
        args[0] = term188209;
        args[1] = term188211;
        args[2] = term188385;
        args[3] = term188387;
        args[4] = term188389;
        args[5] = term188391;
        args[6] = term188393;
        args[7] = term188395;
        args[8] = term188397;
        args[9] = term188399;
        args[10] = term188401;
        args[11] = term188403;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


