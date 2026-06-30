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

public class UserGameOption_getSuccessSlideHold_202422128119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57271;

    public UserGameOption_getSuccessSlideHold_202422128119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term57277 = new Long(1672578078364590450L);
        term57271 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term57273 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term57275 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term57291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57296 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57301 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57302 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57306 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57323 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57324 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57328 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57384 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57385 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57389 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57432 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57433 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57437 = newInstance(Class.forName("java.time.LocalTime"));
        Object term57478 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term57479 = newInstance(Class.forName("java.time.LocalDate"));
        Object term57483 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term57271, term57271.getClass(), "id", -3895780534600959979L);
        setLongField(term57273, term57273.getClass(), "id", 789661870469773196L);
        setLongField(term57275, term57275.getClass(), "id", -3484599398786804700L);
        setField(term57275, term57275.getClass(), "extId", term57277);
        setField(term57275, term57275.getClass(), "luid", "MQvSpklpkB");
        setIntField(term57292, term57292.getClass(), "year", 2020);
        setShortField(term57292, term57292.getClass(), "month", (short) 9);
        setShortField(term57292, term57292.getClass(), "day", (short) 29);
        setField(term57291, term57291.getClass(), "date", term57292);
        setByteField(term57296, term57296.getClass(), "hour", (byte) 4);
        setByteField(term57296, term57296.getClass(), "minute", (byte) 6);
        setByteField(term57296, term57296.getClass(), "second", (byte) 57);
        setIntField(term57296, term57296.getClass(), "nano", 936141628);
        setField(term57291, term57291.getClass(), "time", term57296);
        setField(term57275, term57275.getClass(), "registerTime", term57291);
        setIntField(term57302, term57302.getClass(), "year", 2027);
        setShortField(term57302, term57302.getClass(), "month", (short) 7);
        setShortField(term57302, term57302.getClass(), "day", (short) 24);
        setField(term57301, term57301.getClass(), "date", term57302);
        setByteField(term57306, term57306.getClass(), "hour", (byte) 10);
        setByteField(term57306, term57306.getClass(), "minute", (byte) 31);
        setByteField(term57306, term57306.getClass(), "second", (byte) 33);
        setIntField(term57306, term57306.getClass(), "nano", 451257890);
        setField(term57301, term57301.getClass(), "time", term57306);
        setField(term57275, term57275.getClass(), "accessTime", term57301);
        setField(term57273, term57273.getClass(), "card", term57275);
        setField(term57273, term57273.getClass(), "userName", "SbTxRdDQQc");
        setIntField(term57324, term57324.getClass(), "year", 2019);
        setShortField(term57324, term57324.getClass(), "month", (short) 4);
        setShortField(term57324, term57324.getClass(), "day", (short) 22);
        setField(term57323, term57323.getClass(), "date", term57324);
        setByteField(term57328, term57328.getClass(), "hour", (byte) 11);
        setByteField(term57328, term57328.getClass(), "minute", (byte) 30);
        setByteField(term57328, term57328.getClass(), "second", (byte) 42);
        setIntField(term57328, term57328.getClass(), "nano", 733500025);
        setField(term57323, term57323.getClass(), "time", term57328);
        setField(term57273, term57273.getClass(), "lastLoginDate", term57323);
        setBooleanField(term57273, term57273.getClass(), "isWebJoin", false);
        setField(term57273, term57273.getClass(), "webLimitDate", "MrVdoUYAdO");
        setIntField(term57273, term57273.getClass(), "level", 2044728583);
        setIntField(term57273, term57273.getClass(), "reincarnationNum", 64790905);
        setField(term57273, term57273.getClass(), "exp", "schPUnVfDW");
        setLongField(term57273, term57273.getClass(), "point", -5259338558309636239L);
        setLongField(term57273, term57273.getClass(), "totalPoint", -94386090490716219L);
        setIntField(term57273, term57273.getClass(), "playCount", -1199056049);
        setIntField(term57273, term57273.getClass(), "multiPlayCount", -1074336148);
        setIntField(term57273, term57273.getClass(), "multiWinCount", -561801733);
        setIntField(term57273, term57273.getClass(), "requestResCount", 2134609936);
        setIntField(term57273, term57273.getClass(), "acceptResCount", -409989519);
        setIntField(term57273, term57273.getClass(), "successResCount", -1293074430);
        setIntField(term57273, term57273.getClass(), "playerRating", 608662433);
        setIntField(term57273, term57273.getClass(), "highestRating", -2015476493);
        setIntField(term57273, term57273.getClass(), "nameplateId", 41528103);
        setIntField(term57273, term57273.getClass(), "frameId", -1732381818);
        setIntField(term57273, term57273.getClass(), "characterId", 1960614460);
        setIntField(term57273, term57273.getClass(), "trophyId", -1488501179);
        setIntField(term57273, term57273.getClass(), "playedTutorialBit", 2086648406);
        setIntField(term57273, term57273.getClass(), "firstTutorialCancelNum", 805890273);
        setIntField(term57273, term57273.getClass(), "masterTutorialCancelNum", 1078863472);
        setIntField(term57273, term57273.getClass(), "totalRepertoireCount", -1845619952);
        setIntField(term57273, term57273.getClass(), "totalMapNum", -1363744441);
        setLongField(term57273, term57273.getClass(), "totalHiScore", -5539140353886034290L);
        setLongField(term57273, term57273.getClass(), "totalBasicHighScore", -2993798135603613656L);
        setLongField(term57273, term57273.getClass(), "totalAdvancedHighScore", 7643902889687500887L);
        setLongField(term57273, term57273.getClass(), "totalExpertHighScore", 5801400276670793406L);
        setLongField(term57273, term57273.getClass(), "totalMasterHighScore", 750257143483156761L);
        setIntField(term57385, term57385.getClass(), "year", 2028);
        setShortField(term57385, term57385.getClass(), "month", (short) 12);
        setShortField(term57385, term57385.getClass(), "day", (short) 13);
        setField(term57384, term57384.getClass(), "date", term57385);
        setByteField(term57389, term57389.getClass(), "hour", (byte) 1);
        setByteField(term57389, term57389.getClass(), "minute", (byte) 15);
        setByteField(term57389, term57389.getClass(), "second", (byte) 43);
        setIntField(term57389, term57389.getClass(), "nano", 678972290);
        setField(term57384, term57384.getClass(), "time", term57389);
        setField(term57273, term57273.getClass(), "eventWatchedDate", term57384);
        setIntField(term57273, term57273.getClass(), "friendCount", -1303828030);
        setBooleanField(term57273, term57273.getClass(), "isMaimai", true);
        setField(term57273, term57273.getClass(), "firstGameId", "CpdMEgjUka");
        setField(term57273, term57273.getClass(), "firstRomVersion", "WRisHdgnmm");
        setField(term57273, term57273.getClass(), "firstDataVersion", "XxZiwWPLOx");
        setIntField(term57433, term57433.getClass(), "year", 2027);
        setShortField(term57433, term57433.getClass(), "month", (short) 4);
        setShortField(term57433, term57433.getClass(), "day", (short) 25);
        setField(term57432, term57432.getClass(), "date", term57433);
        setByteField(term57437, term57437.getClass(), "hour", (byte) 18);
        setByteField(term57437, term57437.getClass(), "minute", (byte) 2);
        setByteField(term57437, term57437.getClass(), "second", (byte) 53);
        setIntField(term57437, term57437.getClass(), "nano", 468233333);
        setField(term57432, term57432.getClass(), "time", term57437);
        setField(term57273, term57273.getClass(), "firstPlayDate", term57432);
        setField(term57273, term57273.getClass(), "lastGameId", "nyqsjMHTba");
        setField(term57273, term57273.getClass(), "lastRomVersion", "ylUHzURWyg");
        setField(term57273, term57273.getClass(), "lastDataVersion", "VuAuFBlHxQ");
        setIntField(term57479, term57479.getClass(), "year", 2020);
        setShortField(term57479, term57479.getClass(), "month", (short) 1);
        setShortField(term57479, term57479.getClass(), "day", (short) 9);
        setField(term57478, term57478.getClass(), "date", term57479);
        setByteField(term57483, term57483.getClass(), "hour", (byte) 15);
        setByteField(term57483, term57483.getClass(), "minute", (byte) 54);
        setByteField(term57483, term57483.getClass(), "second", (byte) 0);
        setIntField(term57483, term57483.getClass(), "nano", 449352072);
        setField(term57478, term57478.getClass(), "time", term57483);
        setField(term57273, term57273.getClass(), "lastPlayDate", term57478);
        setIntField(term57273, term57273.getClass(), "lastPlaceId", 1611629079);
        setField(term57273, term57273.getClass(), "lastPlaceName", "nOLtCslMMH");
        setField(term57273, term57273.getClass(), "lastRegionId", "dIQWOeKQVj");
        setField(term57273, term57273.getClass(), "lastRegionName", "tHiDGaNXAL");
        setField(term57273, term57273.getClass(), "lastAllNetId", "VsizBWhPWL");
        setField(term57273, term57273.getClass(), "lastClientId", "jAFSxnVMcD");
        setField(term57271, term57271.getClass(), "user", term57273);
        setIntField(term57271, term57271.getClass(), "bgInfo", 770171276);
        setIntField(term57271, term57271.getClass(), "fieldColor", -1497914215);
        setIntField(term57271, term57271.getClass(), "guideSound", 254385018);
        setIntField(term57271, term57271.getClass(), "soundEffect", 672070228);
        setIntField(term57271, term57271.getClass(), "guideLine", 1014463904);
        setIntField(term57271, term57271.getClass(), "speed", 928673401);
        setIntField(term57271, term57271.getClass(), "optionSet", -631739609);
        setIntField(term57271, term57271.getClass(), "matching", -2045566233);
        setIntField(term57271, term57271.getClass(), "judgePos", 102632361);
        setIntField(term57271, term57271.getClass(), "rating", -871963633);
        setIntField(term57271, term57271.getClass(), "judgeJustice", -572352492);
        setIntField(term57271, term57271.getClass(), "judgeAttack", -583361854);
        setIntField(term57271, term57271.getClass(), "headphone", 717140857);
        setIntField(term57271, term57271.getClass(), "playerLevel", 891889211);
        setIntField(term57271, term57271.getClass(), "successTap", 265502816);
        setIntField(term57271, term57271.getClass(), "successExTap", -1730476579);
        setIntField(term57271, term57271.getClass(), "successSlideHold", -1501333599);
        setIntField(term57271, term57271.getClass(), "successAir", 1525193088);
        setIntField(term57271, term57271.getClass(), "successFlick", 1734906845);
        setIntField(term57271, term57271.getClass(), "successSkill", 678776902);
        setIntField(term57271, term57271.getClass(), "successTapTimbre", -1148076813);
        setIntField(term57271, term57271.getClass(), "privacy", 1450586432);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSuccessSlideHold", argTypes, term57271, args);
    }

};


