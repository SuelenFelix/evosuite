package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserActivity_hashCode_197546614021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term292235;

    public UserActivity_hashCode_197546614021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term292241 = new Long(-5338413783740215067L);
        term292235 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term292237 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term292239 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term292255 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term292256 = newInstance(Class.forName("java.time.LocalDate"));
        Object term292260 = newInstance(Class.forName("java.time.LocalTime"));
        Object term292265 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term292266 = newInstance(Class.forName("java.time.LocalDate"));
        Object term292270 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term292235, term292235.getClass(), "id", 8147455016285515294L);
        setLongField(term292237, term292237.getClass(), "id", 5996955051421112716L);
        setLongField(term292239, term292239.getClass(), "id", 5515694366522785470L);
        setField(term292239, term292239.getClass(), "extId", term292241);
        setField(term292239, term292239.getClass(), "luid", "yJJLpUySXp");
        setIntField(term292256, term292256.getClass(), "year", 2025);
        setShortField(term292256, term292256.getClass(), "month", (short) 9);
        setShortField(term292256, term292256.getClass(), "day", (short) 30);
        setField(term292255, term292255.getClass(), "date", term292256);
        setByteField(term292260, term292260.getClass(), "hour", (byte) 13);
        setByteField(term292260, term292260.getClass(), "minute", (byte) 13);
        setByteField(term292260, term292260.getClass(), "second", (byte) 21);
        setIntField(term292260, term292260.getClass(), "nano", 902241082);
        setField(term292255, term292255.getClass(), "time", term292260);
        setField(term292239, term292239.getClass(), "registerTime", term292255);
        setIntField(term292266, term292266.getClass(), "year", 2029);
        setShortField(term292266, term292266.getClass(), "month", (short) 5);
        setShortField(term292266, term292266.getClass(), "day", (short) 20);
        setField(term292265, term292265.getClass(), "date", term292266);
        setByteField(term292270, term292270.getClass(), "hour", (byte) 10);
        setByteField(term292270, term292270.getClass(), "minute", (byte) 4);
        setByteField(term292270, term292270.getClass(), "second", (byte) 29);
        setIntField(term292270, term292270.getClass(), "nano", 696142856);
        setField(term292265, term292265.getClass(), "time", term292270);
        setField(term292239, term292239.getClass(), "accessTime", term292265);
        setField(term292237, term292237.getClass(), "card", term292239);
        setField(term292237, term292237.getClass(), "userName", "ZoRLfUSUqr");
        setIntField(term292237, term292237.getClass(), "level", 1171875774);
        setIntField(term292237, term292237.getClass(), "reincarnationNum", -168001160);
        setLongField(term292237, term292237.getClass(), "exp", -1799542844033441179L);
        setLongField(term292237, term292237.getClass(), "point", 6389495615446683212L);
        setLongField(term292237, term292237.getClass(), "totalPoint", 8684908798674803802L);
        setIntField(term292237, term292237.getClass(), "playCount", -1132894503);
        setIntField(term292237, term292237.getClass(), "jewelCount", 420722859);
        setIntField(term292237, term292237.getClass(), "totalJewelCount", -288498605);
        setIntField(term292237, term292237.getClass(), "medalCount", -328437173);
        setIntField(term292237, term292237.getClass(), "playerRating", 434877403);
        setIntField(term292237, term292237.getClass(), "highestRating", 105533567);
        setIntField(term292237, term292237.getClass(), "battlePoint", -158771080);
        setIntField(term292237, term292237.getClass(), "bestBattlePoint", -1774027193);
        setIntField(term292237, term292237.getClass(), "overDamageBattlePoint", 188046140);
        setBooleanField(term292237, term292237.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term292237, term292237.getClass(), "nameplateId", -797484908);
        setIntField(term292237, term292237.getClass(), "trophyId", -1075844090);
        setIntField(term292237, term292237.getClass(), "cardId", -2145936589);
        setIntField(term292237, term292237.getClass(), "characterId", 267440625);
        setIntField(term292237, term292237.getClass(), "characterVoiceNo", -1953172976);
        setIntField(term292237, term292237.getClass(), "tabSetting", 391818587);
        setIntField(term292237, term292237.getClass(), "tabSortSetting", -841066841);
        setIntField(term292237, term292237.getClass(), "cardCategorySetting", -2083429457);
        setIntField(term292237, term292237.getClass(), "cardSortSetting", -2046649702);
        setIntField(term292237, term292237.getClass(), "rivalScoreCategorySetting", 1416508762);
        setIntField(term292237, term292237.getClass(), "playedTutorialBit", 506543038);
        setIntField(term292237, term292237.getClass(), "firstTutorialCancelNum", -1336657780);
        setLongField(term292237, term292237.getClass(), "sumTechHighScore", -4979354634626274887L);
        setLongField(term292237, term292237.getClass(), "sumTechBasicHighScore", -7445153479466792568L);
        setLongField(term292237, term292237.getClass(), "sumTechAdvancedHighScore", -7056470816104456013L);
        setLongField(term292237, term292237.getClass(), "sumTechExpertHighScore", 1054905977794433266L);
        setLongField(term292237, term292237.getClass(), "sumTechMasterHighScore", 7329364523477864194L);
        setLongField(term292237, term292237.getClass(), "sumTechLunaticHighScore", 5801391339415060612L);
        setLongField(term292237, term292237.getClass(), "sumBattleHighScore", 6078607228876494901L);
        setLongField(term292237, term292237.getClass(), "sumBattleBasicHighScore", 1210593582904863573L);
        setLongField(term292237, term292237.getClass(), "sumBattleAdvancedHighScore", 4262333549210384765L);
        setLongField(term292237, term292237.getClass(), "sumBattleExpertHighScore", 1752991190216845356L);
        setLongField(term292237, term292237.getClass(), "sumBattleMasterHighScore", 2442547353988666840L);
        setLongField(term292237, term292237.getClass(), "sumBattleLunaticHighScore", 5561283693716550725L);
        setField(term292237, term292237.getClass(), "eventWatchedDate", "OvmJqKnwXe");
        setField(term292237, term292237.getClass(), "cmEventWatchedDate", "nrshoMEpRL");
        setField(term292237, term292237.getClass(), "firstGameId", "ZLOPgKhMdJ");
        setField(term292237, term292237.getClass(), "firstRomVersion", "ZbWdzNDrkG");
        setField(term292237, term292237.getClass(), "firstDataVersion", "qXWvyFwoKF");
        setField(term292237, term292237.getClass(), "firstPlayDate", "NkogXiHtJk");
        setField(term292237, term292237.getClass(), "lastGameId", "OacTmTWbcB");
        setField(term292237, term292237.getClass(), "lastRomVersion", "xLFRUxoUve");
        setField(term292237, term292237.getClass(), "lastDataVersion", "OadUkgqJIf");
        setField(term292237, term292237.getClass(), "compatibleCmVersion", "LVRLcJfRsa");
        setField(term292237, term292237.getClass(), "lastPlayDate", "kssWCPGFlA");
        setIntField(term292237, term292237.getClass(), "lastPlaceId", 1193667372);
        setField(term292237, term292237.getClass(), "lastPlaceName", "MswayHAKlw");
        setIntField(term292237, term292237.getClass(), "lastRegionId", -221358154);
        setField(term292237, term292237.getClass(), "lastRegionName", "qICSGozwUr");
        setIntField(term292237, term292237.getClass(), "lastAllNetId", -516595702);
        setField(term292237, term292237.getClass(), "lastClientId", "dTLPQyRkQI");
        setIntField(term292237, term292237.getClass(), "lastUsedDeckId", -557215514);
        setIntField(term292237, term292237.getClass(), "lastPlayMusicLevel", 2002251821);
        setIntField(term292237, term292237.getClass(), "lastEmoneyBrand", 437164912);
        setField(term292235, term292235.getClass(), "user", term292237);
        setIntField(term292235, term292235.getClass(), "kind", -706458680);
        setIntField(term292235, term292235.getClass(), "activityId", 1062951811);
        setIntField(term292235, term292235.getClass(), "sortNumber", -909676866);
        setIntField(term292235, term292235.getClass(), "param1", 1051932573);
        setIntField(term292235, term292235.getClass(), "param2", -569396908);
        setIntField(term292235, term292235.getClass(), "param3", 1013221881);
        setIntField(term292235, term292235.getClass(), "param4", 1923722067);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term292235, args);
    }

};


