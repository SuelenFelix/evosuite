package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserGameOption_setJudgeAttack_47402664138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66271;
     Object term66571;

    public UserGameOption_setJudgeAttack_47402664138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term66277 = new Long(-5386201758403679145L);
        term66271 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term66273 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term66275 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term66291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66296 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66306 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66323 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66324 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66328 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66384 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66385 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66389 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66437 = newInstance(Class.forName("java.time.LocalTime"));
        Object term66478 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term66479 = newInstance(Class.forName("java.time.LocalDate"));
        Object term66483 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term66271, term66271.getClass(), "id", 3771508378771734822L);
        setLongField(term66273, term66273.getClass(), "id", 2727169839819823552L);
        setLongField(term66275, term66275.getClass(), "id", -6164517614137158832L);
        setField(term66275, term66275.getClass(), "extId", term66277);
        setField(term66275, term66275.getClass(), "luid", "vRjHouXWLC");
        setIntField(term66292, term66292.getClass(), "year", 2029);
        setShortField(term66292, term66292.getClass(), "month", (short) 5);
        setShortField(term66292, term66292.getClass(), "day", (short) 13);
        setField(term66291, term66291.getClass(), "date", term66292);
        setByteField(term66296, term66296.getClass(), "hour", (byte) 15);
        setByteField(term66296, term66296.getClass(), "minute", (byte) 43);
        setByteField(term66296, term66296.getClass(), "second", (byte) 9);
        setIntField(term66296, term66296.getClass(), "nano", 324755756);
        setField(term66291, term66291.getClass(), "time", term66296);
        setField(term66275, term66275.getClass(), "registerTime", term66291);
        setIntField(term66302, term66302.getClass(), "year", 2010);
        setShortField(term66302, term66302.getClass(), "month", (short) 4);
        setShortField(term66302, term66302.getClass(), "day", (short) 17);
        setField(term66301, term66301.getClass(), "date", term66302);
        setByteField(term66306, term66306.getClass(), "hour", (byte) 5);
        setByteField(term66306, term66306.getClass(), "minute", (byte) 31);
        setByteField(term66306, term66306.getClass(), "second", (byte) 28);
        setIntField(term66306, term66306.getClass(), "nano", 783557285);
        setField(term66301, term66301.getClass(), "time", term66306);
        setField(term66275, term66275.getClass(), "accessTime", term66301);
        setField(term66273, term66273.getClass(), "card", term66275);
        setField(term66273, term66273.getClass(), "userName", "XghDInkWEe");
        setIntField(term66324, term66324.getClass(), "year", 2015);
        setShortField(term66324, term66324.getClass(), "month", (short) 5);
        setShortField(term66324, term66324.getClass(), "day", (short) 30);
        setField(term66323, term66323.getClass(), "date", term66324);
        setByteField(term66328, term66328.getClass(), "hour", (byte) 6);
        setByteField(term66328, term66328.getClass(), "minute", (byte) 20);
        setByteField(term66328, term66328.getClass(), "second", (byte) 29);
        setIntField(term66328, term66328.getClass(), "nano", 871322714);
        setField(term66323, term66323.getClass(), "time", term66328);
        setField(term66273, term66273.getClass(), "lastLoginDate", term66323);
        setBooleanField(term66273, term66273.getClass(), "isWebJoin", true);
        setField(term66273, term66273.getClass(), "webLimitDate", "zPDuGbsYGT");
        setIntField(term66273, term66273.getClass(), "level", 2088023767);
        setIntField(term66273, term66273.getClass(), "reincarnationNum", -1750178936);
        setField(term66273, term66273.getClass(), "exp", "apnNoBOovC");
        setLongField(term66273, term66273.getClass(), "point", 1093252632013547881L);
        setLongField(term66273, term66273.getClass(), "totalPoint", 8773809312823881228L);
        setIntField(term66273, term66273.getClass(), "playCount", 1007162436);
        setIntField(term66273, term66273.getClass(), "multiPlayCount", -1475097555);
        setIntField(term66273, term66273.getClass(), "multiWinCount", 1715200190);
        setIntField(term66273, term66273.getClass(), "requestResCount", 766065716);
        setIntField(term66273, term66273.getClass(), "acceptResCount", -431182213);
        setIntField(term66273, term66273.getClass(), "successResCount", 419448852);
        setIntField(term66273, term66273.getClass(), "playerRating", -494367790);
        setIntField(term66273, term66273.getClass(), "highestRating", 620015992);
        setIntField(term66273, term66273.getClass(), "nameplateId", 396108638);
        setIntField(term66273, term66273.getClass(), "frameId", 581841369);
        setIntField(term66273, term66273.getClass(), "characterId", 970094723);
        setIntField(term66273, term66273.getClass(), "trophyId", 376622340);
        setIntField(term66273, term66273.getClass(), "playedTutorialBit", 1985101421);
        setIntField(term66273, term66273.getClass(), "firstTutorialCancelNum", 422564495);
        setIntField(term66273, term66273.getClass(), "masterTutorialCancelNum", -1614243846);
        setIntField(term66273, term66273.getClass(), "totalRepertoireCount", 1218830458);
        setIntField(term66273, term66273.getClass(), "totalMapNum", 476903736);
        setLongField(term66273, term66273.getClass(), "totalHiScore", 316148538598902256L);
        setLongField(term66273, term66273.getClass(), "totalBasicHighScore", -3355803345734534021L);
        setLongField(term66273, term66273.getClass(), "totalAdvancedHighScore", 5579342693904906403L);
        setLongField(term66273, term66273.getClass(), "totalExpertHighScore", -8838530728518114289L);
        setLongField(term66273, term66273.getClass(), "totalMasterHighScore", 8907204162812035128L);
        setIntField(term66385, term66385.getClass(), "year", 2029);
        setShortField(term66385, term66385.getClass(), "month", (short) 9);
        setShortField(term66385, term66385.getClass(), "day", (short) 21);
        setField(term66384, term66384.getClass(), "date", term66385);
        setByteField(term66389, term66389.getClass(), "hour", (byte) 3);
        setByteField(term66389, term66389.getClass(), "minute", (byte) 36);
        setByteField(term66389, term66389.getClass(), "second", (byte) 11);
        setIntField(term66389, term66389.getClass(), "nano", 295278203);
        setField(term66384, term66384.getClass(), "time", term66389);
        setField(term66273, term66273.getClass(), "eventWatchedDate", term66384);
        setIntField(term66273, term66273.getClass(), "friendCount", -832801133);
        setBooleanField(term66273, term66273.getClass(), "isMaimai", true);
        setField(term66273, term66273.getClass(), "firstGameId", "SyGIHWAumE");
        setField(term66273, term66273.getClass(), "firstRomVersion", "bMQUwQqyMc");
        setField(term66273, term66273.getClass(), "firstDataVersion", "CVaGhXmAUN");
        setIntField(term66433, term66433.getClass(), "year", 2026);
        setShortField(term66433, term66433.getClass(), "month", (short) 11);
        setShortField(term66433, term66433.getClass(), "day", (short) 15);
        setField(term66432, term66432.getClass(), "date", term66433);
        setByteField(term66437, term66437.getClass(), "hour", (byte) 8);
        setByteField(term66437, term66437.getClass(), "minute", (byte) 24);
        setByteField(term66437, term66437.getClass(), "second", (byte) 53);
        setIntField(term66437, term66437.getClass(), "nano", 2108775);
        setField(term66432, term66432.getClass(), "time", term66437);
        setField(term66273, term66273.getClass(), "firstPlayDate", term66432);
        setField(term66273, term66273.getClass(), "lastGameId", "KnclcuNYRb");
        setField(term66273, term66273.getClass(), "lastRomVersion", "UDZJbJPmCC");
        setField(term66273, term66273.getClass(), "lastDataVersion", "oVkgUUfHis");
        setIntField(term66479, term66479.getClass(), "year", 2012);
        setShortField(term66479, term66479.getClass(), "month", (short) 5);
        setShortField(term66479, term66479.getClass(), "day", (short) 8);
        setField(term66478, term66478.getClass(), "date", term66479);
        setByteField(term66483, term66483.getClass(), "hour", (byte) 9);
        setByteField(term66483, term66483.getClass(), "minute", (byte) 56);
        setByteField(term66483, term66483.getClass(), "second", (byte) 42);
        setIntField(term66483, term66483.getClass(), "nano", 128569906);
        setField(term66478, term66478.getClass(), "time", term66483);
        setField(term66273, term66273.getClass(), "lastPlayDate", term66478);
        setIntField(term66273, term66273.getClass(), "lastPlaceId", 658732890);
        setField(term66273, term66273.getClass(), "lastPlaceName", "hoCKQzIOhx");
        setField(term66273, term66273.getClass(), "lastRegionId", "znUxTdEvUD");
        setField(term66273, term66273.getClass(), "lastRegionName", "PvtJhtGffh");
        setField(term66273, term66273.getClass(), "lastAllNetId", "KReGJTSQuY");
        setField(term66273, term66273.getClass(), "lastClientId", "hqZmoXoMuS");
        setField(term66271, term66271.getClass(), "user", term66273);
        setIntField(term66271, term66271.getClass(), "bgInfo", 888621409);
        setIntField(term66271, term66271.getClass(), "fieldColor", 665526857);
        setIntField(term66271, term66271.getClass(), "guideSound", 184439959);
        setIntField(term66271, term66271.getClass(), "soundEffect", -153314488);
        setIntField(term66271, term66271.getClass(), "guideLine", -1106116513);
        setIntField(term66271, term66271.getClass(), "speed", 1454640705);
        setIntField(term66271, term66271.getClass(), "optionSet", -1492168193);
        setIntField(term66271, term66271.getClass(), "matching", 144805805);
        setIntField(term66271, term66271.getClass(), "judgePos", 804939687);
        setIntField(term66271, term66271.getClass(), "rating", 1638315840);
        setIntField(term66271, term66271.getClass(), "judgeJustice", 2098018411);
        setIntField(term66271, term66271.getClass(), "judgeAttack", 696364986);
        setIntField(term66271, term66271.getClass(), "headphone", 2133855407);
        setIntField(term66271, term66271.getClass(), "playerLevel", -646910326);
        setIntField(term66271, term66271.getClass(), "successTap", -740085612);
        setIntField(term66271, term66271.getClass(), "successExTap", -377361876);
        setIntField(term66271, term66271.getClass(), "successSlideHold", -138587866);
        setIntField(term66271, term66271.getClass(), "successAir", 473269350);
        setIntField(term66271, term66271.getClass(), "successFlick", -1267755429);
        setIntField(term66271, term66271.getClass(), "successSkill", 481428944);
        setIntField(term66271, term66271.getClass(), "successTapTimbre", 585379621);
        setIntField(term66271, term66271.getClass(), "privacy", 1343392329);
        term66571 = new Integer(9075231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term66571;
        callMethod(klass, "setJudgeAttack", argTypes, term66271, args);
    }

};


