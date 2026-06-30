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

public class UserCharacter_setId_20841274676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34208;
     Object term34387;

    public UserCharacter_setId_20841274676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term34214 = new Long(-6950146046121430355L);
        term34208 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter"));
        Object term34210 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term34212 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term34228 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34229 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34233 = newInstance(Class.forName("java.time.LocalTime"));
        Object term34238 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term34239 = newInstance(Class.forName("java.time.LocalDate"));
        Object term34243 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term34208, term34208.getClass(), "id", 329213208496958131L);
        setLongField(term34210, term34210.getClass(), "id", 8107921244631636572L);
        setLongField(term34212, term34212.getClass(), "id", -7904053112604879960L);
        setField(term34212, term34212.getClass(), "extId", term34214);
        setField(term34212, term34212.getClass(), "luid", "pZbbwCURge");
        setIntField(term34229, term34229.getClass(), "year", 2011);
        setShortField(term34229, term34229.getClass(), "month", (short) 10);
        setShortField(term34229, term34229.getClass(), "day", (short) 10);
        setField(term34228, term34228.getClass(), "date", term34229);
        setByteField(term34233, term34233.getClass(), "hour", (byte) 5);
        setByteField(term34233, term34233.getClass(), "minute", (byte) 26);
        setByteField(term34233, term34233.getClass(), "second", (byte) 16);
        setIntField(term34233, term34233.getClass(), "nano", 858245653);
        setField(term34228, term34228.getClass(), "time", term34233);
        setField(term34212, term34212.getClass(), "registerTime", term34228);
        setIntField(term34239, term34239.getClass(), "year", 2011);
        setShortField(term34239, term34239.getClass(), "month", (short) 3);
        setShortField(term34239, term34239.getClass(), "day", (short) 25);
        setField(term34238, term34238.getClass(), "date", term34239);
        setByteField(term34243, term34243.getClass(), "hour", (byte) 20);
        setByteField(term34243, term34243.getClass(), "minute", (byte) 10);
        setByteField(term34243, term34243.getClass(), "second", (byte) 51);
        setIntField(term34243, term34243.getClass(), "nano", 162102574);
        setField(term34238, term34238.getClass(), "time", term34243);
        setField(term34212, term34212.getClass(), "accessTime", term34238);
        setField(term34210, term34210.getClass(), "card", term34212);
        setIntField(term34210, term34210.getClass(), "lastDataVersion", -43239204);
        setField(term34210, term34210.getClass(), "userName", "RsOfgdMCMv");
        setIntField(term34210, term34210.getClass(), "point", -1525054580);
        setIntField(term34210, term34210.getClass(), "totalPoint", 1528804559);
        setIntField(term34210, term34210.getClass(), "iconId", -706860271);
        setIntField(term34210, term34210.getClass(), "nameplateId", -1268460209);
        setIntField(term34210, term34210.getClass(), "frameId", 1050300885);
        setIntField(term34210, term34210.getClass(), "trophyId", -1623966228);
        setIntField(term34210, term34210.getClass(), "playCount", 1085534206);
        setIntField(term34210, term34210.getClass(), "playVsCount", -825946504);
        setIntField(term34210, term34210.getClass(), "playSyncCount", 1618408809);
        setIntField(term34210, term34210.getClass(), "winCount", 1511487617);
        setIntField(term34210, term34210.getClass(), "helpCount", 338598562);
        setIntField(term34210, term34210.getClass(), "comboCount", 1528748257);
        setIntField(term34210, term34210.getClass(), "feverCount", 494744342);
        setIntField(term34210, term34210.getClass(), "totalHiScore", -1662933444);
        setIntField(term34210, term34210.getClass(), "totalEasyHighScore", 1648583497);
        setIntField(term34210, term34210.getClass(), "totalBasicHighScore", -132156499);
        setIntField(term34210, term34210.getClass(), "totalAdvancedHighScore", -1222668512);
        setIntField(term34210, term34210.getClass(), "totalExpertHighScore", 1109294828);
        setIntField(term34210, term34210.getClass(), "totalMasterHighScore", -596850824);
        setIntField(term34210, term34210.getClass(), "totalReMasterHighScore", 1619317687);
        setIntField(term34210, term34210.getClass(), "totalHighSync", -1335475299);
        setIntField(term34210, term34210.getClass(), "totalEasySync", 1764067908);
        setIntField(term34210, term34210.getClass(), "totalBasicSync", 1906236006);
        setIntField(term34210, term34210.getClass(), "totalAdvancedSync", -279175941);
        setIntField(term34210, term34210.getClass(), "totalExpertSync", -574044161);
        setIntField(term34210, term34210.getClass(), "totalMasterSync", -101199395);
        setIntField(term34210, term34210.getClass(), "totalReMasterSync", 894150826);
        setIntField(term34210, term34210.getClass(), "playerRating", -261894603);
        setIntField(term34210, term34210.getClass(), "highestRating", 1163902450);
        setIntField(term34210, term34210.getClass(), "rankAuthTailId", 548941697);
        setField(term34210, term34210.getClass(), "eventWatchedDate", "nsofCJqJOR");
        setField(term34210, term34210.getClass(), "webLimitDate", "CitJiZwsjF");
        setIntField(term34210, term34210.getClass(), "challengeTrackPhase", 647865140);
        setIntField(term34210, term34210.getClass(), "firstPlayBits", 552764103);
        setField(term34210, term34210.getClass(), "lastPlayDate", "ZiyMvLArWJ");
        setIntField(term34210, term34210.getClass(), "lastPlaceId", -913811608);
        setField(term34210, term34210.getClass(), "lastPlaceName", "MaeokjEfWD");
        setIntField(term34210, term34210.getClass(), "lastRegionId", 895728550);
        setField(term34210, term34210.getClass(), "lastRegionName", "ocZcumnXEz");
        setField(term34210, term34210.getClass(), "lastClientId", "rNNwyactDR");
        setField(term34210, term34210.getClass(), "lastCountryCode", "QJrTMTdxyh");
        setIntField(term34210, term34210.getClass(), "eventPoint", -419871359);
        setIntField(term34210, term34210.getClass(), "totalLv", 812478175);
        setIntField(term34210, term34210.getClass(), "lastLoginBonusDay", -133199375);
        setIntField(term34210, term34210.getClass(), "lastSurvivalBonusDay", -356245449);
        setIntField(term34210, term34210.getClass(), "loginBonusLv", -1305056502);
        setField(term34208, term34208.getClass(), "user", term34210);
        setIntField(term34208, term34208.getClass(), "characterId", 1382545880);
        setIntField(term34208, term34208.getClass(), "point", -1299406001);
        setIntField(term34208, term34208.getClass(), "level", -1360145510);
        term34387 = new Long(-6602460430714339690L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term34387;
        callMethod(klass, "setId", argTypes, term34208, args);
    }

};


