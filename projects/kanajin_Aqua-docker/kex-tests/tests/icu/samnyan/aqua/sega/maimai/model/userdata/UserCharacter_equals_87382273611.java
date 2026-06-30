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
import java.lang.Object;
import java.lang.Long;

public class UserCharacter_equals_87382273611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35825;
     Object term36004;

    public UserCharacter_equals_87382273611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term35831 = new Long(-5386201758403679145L);
        term35825 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter"));
        Object term35827 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term35829 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term35845 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35846 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35850 = newInstance(Class.forName("java.time.LocalTime"));
        Object term35855 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term35856 = newInstance(Class.forName("java.time.LocalDate"));
        Object term35860 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term35825, term35825.getClass(), "id", -67485388932970712L);
        setLongField(term35827, term35827.getClass(), "id", 5806367330808555223L);
        setLongField(term35829, term35829.getClass(), "id", 4576699120365923235L);
        setField(term35829, term35829.getClass(), "extId", term35831);
        setField(term35829, term35829.getClass(), "luid", "zHiuLPzYQM");
        setIntField(term35846, term35846.getClass(), "year", 2023);
        setShortField(term35846, term35846.getClass(), "month", (short) 8);
        setShortField(term35846, term35846.getClass(), "day", (short) 8);
        setField(term35845, term35845.getClass(), "date", term35846);
        setByteField(term35850, term35850.getClass(), "hour", (byte) 20);
        setByteField(term35850, term35850.getClass(), "minute", (byte) 17);
        setByteField(term35850, term35850.getClass(), "second", (byte) 40);
        setIntField(term35850, term35850.getClass(), "nano", 834219024);
        setField(term35845, term35845.getClass(), "time", term35850);
        setField(term35829, term35829.getClass(), "registerTime", term35845);
        setIntField(term35856, term35856.getClass(), "year", 2012);
        setShortField(term35856, term35856.getClass(), "month", (short) 2);
        setShortField(term35856, term35856.getClass(), "day", (short) 12);
        setField(term35855, term35855.getClass(), "date", term35856);
        setByteField(term35860, term35860.getClass(), "hour", (byte) 16);
        setByteField(term35860, term35860.getClass(), "minute", (byte) 39);
        setByteField(term35860, term35860.getClass(), "second", (byte) 57);
        setIntField(term35860, term35860.getClass(), "nano", 651756700);
        setField(term35855, term35855.getClass(), "time", term35860);
        setField(term35829, term35829.getClass(), "accessTime", term35855);
        setField(term35827, term35827.getClass(), "card", term35829);
        setIntField(term35827, term35827.getClass(), "lastDataVersion", -793012848);
        setField(term35827, term35827.getClass(), "userName", "ioYxUYJBrh");
        setIntField(term35827, term35827.getClass(), "point", -2041331473);
        setIntField(term35827, term35827.getClass(), "totalPoint", -416355601);
        setIntField(term35827, term35827.getClass(), "iconId", 439309680);
        setIntField(term35827, term35827.getClass(), "nameplateId", -1717455505);
        setIntField(term35827, term35827.getClass(), "frameId", 1898536358);
        setIntField(term35827, term35827.getClass(), "trophyId", 1296009499);
        setIntField(term35827, term35827.getClass(), "playCount", -427335137);
        setIntField(term35827, term35827.getClass(), "playVsCount", 9865038);
        setIntField(term35827, term35827.getClass(), "playSyncCount", 1202401386);
        setIntField(term35827, term35827.getClass(), "winCount", 1173310137);
        setIntField(term35827, term35827.getClass(), "helpCount", 957107652);
        setIntField(term35827, term35827.getClass(), "comboCount", 292629613);
        setIntField(term35827, term35827.getClass(), "feverCount", 1420755413);
        setIntField(term35827, term35827.getClass(), "totalHiScore", -755973893);
        setIntField(term35827, term35827.getClass(), "totalEasyHighScore", -890311309);
        setIntField(term35827, term35827.getClass(), "totalBasicHighScore", 2132845865);
        setIntField(term35827, term35827.getClass(), "totalAdvancedHighScore", 1676055742);
        setIntField(term35827, term35827.getClass(), "totalExpertHighScore", -963623987);
        setIntField(term35827, term35827.getClass(), "totalMasterHighScore", 1184368914);
        setIntField(term35827, term35827.getClass(), "totalReMasterHighScore", 138525382);
        setIntField(term35827, term35827.getClass(), "totalHighSync", -1100331351);
        setIntField(term35827, term35827.getClass(), "totalEasySync", 1506966329);
        setIntField(term35827, term35827.getClass(), "totalBasicSync", 38318819);
        setIntField(term35827, term35827.getClass(), "totalAdvancedSync", 277037422);
        setIntField(term35827, term35827.getClass(), "totalExpertSync", -513227903);
        setIntField(term35827, term35827.getClass(), "totalMasterSync", -1834509557);
        setIntField(term35827, term35827.getClass(), "totalReMasterSync", -1095760799);
        setIntField(term35827, term35827.getClass(), "playerRating", 964556409);
        setIntField(term35827, term35827.getClass(), "highestRating", 1651622020);
        setIntField(term35827, term35827.getClass(), "rankAuthTailId", -1935395656);
        setField(term35827, term35827.getClass(), "eventWatchedDate", "GXoLEdKEIe");
        setField(term35827, term35827.getClass(), "webLimitDate", "EugWXkztim");
        setIntField(term35827, term35827.getClass(), "challengeTrackPhase", -530623408);
        setIntField(term35827, term35827.getClass(), "firstPlayBits", 1949662959);
        setField(term35827, term35827.getClass(), "lastPlayDate", "DvRdOzzihn");
        setIntField(term35827, term35827.getClass(), "lastPlaceId", 1639772797);
        setField(term35827, term35827.getClass(), "lastPlaceName", "wIygCdQAKO");
        setIntField(term35827, term35827.getClass(), "lastRegionId", -228932741);
        setField(term35827, term35827.getClass(), "lastRegionName", "JsXroBYqwr");
        setField(term35827, term35827.getClass(), "lastClientId", "YciMAObLwl");
        setField(term35827, term35827.getClass(), "lastCountryCode", "qAmVqwwdyf");
        setIntField(term35827, term35827.getClass(), "eventPoint", -134006257);
        setIntField(term35827, term35827.getClass(), "totalLv", 600590922);
        setIntField(term35827, term35827.getClass(), "lastLoginBonusDay", -215108807);
        setIntField(term35827, term35827.getClass(), "lastSurvivalBonusDay", 427775680);
        setIntField(term35827, term35827.getClass(), "loginBonusLv", -1797721552);
        setField(term35825, term35825.getClass(), "user", term35827);
        setIntField(term35825, term35825.getClass(), "characterId", 1112300927);
        setIntField(term35825, term35825.getClass(), "point", -840496589);
        setIntField(term35825, term35825.getClass(), "level", -491716923);
        term36004 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term36004;
        callMethod(klass, "equals", argTypes, term35825, args);
    }

};


