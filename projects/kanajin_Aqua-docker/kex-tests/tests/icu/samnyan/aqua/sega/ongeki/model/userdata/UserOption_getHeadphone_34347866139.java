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

public class UserOption_getHeadphone_34347866139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326469;

    public UserOption_getHeadphone_34347866139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term326475 = new Long(3810487266967550400L);
        term326469 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term326471 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term326473 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term326489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326494 = newInstance(Class.forName("java.time.LocalTime"));
        Object term326499 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term326500 = newInstance(Class.forName("java.time.LocalDate"));
        Object term326504 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term326469, term326469.getClass(), "id", 7859290523475212292L);
        setLongField(term326471, term326471.getClass(), "id", 5708621973538403049L);
        setLongField(term326473, term326473.getClass(), "id", -1468521064971805301L);
        setField(term326473, term326473.getClass(), "extId", term326475);
        setField(term326473, term326473.getClass(), "luid", "pVzqxthcAx");
        setIntField(term326490, term326490.getClass(), "year", 2010);
        setShortField(term326490, term326490.getClass(), "month", (short) 11);
        setShortField(term326490, term326490.getClass(), "day", (short) 10);
        setField(term326489, term326489.getClass(), "date", term326490);
        setByteField(term326494, term326494.getClass(), "hour", (byte) 17);
        setByteField(term326494, term326494.getClass(), "minute", (byte) 50);
        setByteField(term326494, term326494.getClass(), "second", (byte) 49);
        setIntField(term326494, term326494.getClass(), "nano", 742462177);
        setField(term326489, term326489.getClass(), "time", term326494);
        setField(term326473, term326473.getClass(), "registerTime", term326489);
        setIntField(term326500, term326500.getClass(), "year", 2023);
        setShortField(term326500, term326500.getClass(), "month", (short) 1);
        setShortField(term326500, term326500.getClass(), "day", (short) 20);
        setField(term326499, term326499.getClass(), "date", term326500);
        setByteField(term326504, term326504.getClass(), "hour", (byte) 17);
        setByteField(term326504, term326504.getClass(), "minute", (byte) 32);
        setByteField(term326504, term326504.getClass(), "second", (byte) 59);
        setIntField(term326504, term326504.getClass(), "nano", 187414621);
        setField(term326499, term326499.getClass(), "time", term326504);
        setField(term326473, term326473.getClass(), "accessTime", term326499);
        setField(term326471, term326471.getClass(), "card", term326473);
        setField(term326471, term326471.getClass(), "userName", "vDdOCxbaae");
        setIntField(term326471, term326471.getClass(), "level", 1788172921);
        setIntField(term326471, term326471.getClass(), "reincarnationNum", -1734998231);
        setLongField(term326471, term326471.getClass(), "exp", -477279382780603718L);
        setLongField(term326471, term326471.getClass(), "point", 7370546536687231289L);
        setLongField(term326471, term326471.getClass(), "totalPoint", -1791056239140623915L);
        setIntField(term326471, term326471.getClass(), "playCount", 136319030);
        setIntField(term326471, term326471.getClass(), "jewelCount", 754414789);
        setIntField(term326471, term326471.getClass(), "totalJewelCount", -2004797943);
        setIntField(term326471, term326471.getClass(), "medalCount", -928754208);
        setIntField(term326471, term326471.getClass(), "playerRating", 1537797122);
        setIntField(term326471, term326471.getClass(), "highestRating", -1511496361);
        setIntField(term326471, term326471.getClass(), "battlePoint", -336188175);
        setIntField(term326471, term326471.getClass(), "bestBattlePoint", 736195528);
        setIntField(term326471, term326471.getClass(), "overDamageBattlePoint", -718887243);
        setBooleanField(term326471, term326471.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term326471, term326471.getClass(), "nameplateId", 1973884922);
        setIntField(term326471, term326471.getClass(), "trophyId", -1957328402);
        setIntField(term326471, term326471.getClass(), "cardId", -1456311465);
        setIntField(term326471, term326471.getClass(), "characterId", 1470612514);
        setIntField(term326471, term326471.getClass(), "characterVoiceNo", 959853757);
        setIntField(term326471, term326471.getClass(), "tabSetting", -870243697);
        setIntField(term326471, term326471.getClass(), "tabSortSetting", 558911092);
        setIntField(term326471, term326471.getClass(), "cardCategorySetting", 943192385);
        setIntField(term326471, term326471.getClass(), "cardSortSetting", 1818544138);
        setIntField(term326471, term326471.getClass(), "rivalScoreCategorySetting", 1469540651);
        setIntField(term326471, term326471.getClass(), "playedTutorialBit", 1380762462);
        setIntField(term326471, term326471.getClass(), "firstTutorialCancelNum", -703131322);
        setLongField(term326471, term326471.getClass(), "sumTechHighScore", 1451475534802357890L);
        setLongField(term326471, term326471.getClass(), "sumTechBasicHighScore", 5997648323677517868L);
        setLongField(term326471, term326471.getClass(), "sumTechAdvancedHighScore", 442178680444654879L);
        setLongField(term326471, term326471.getClass(), "sumTechExpertHighScore", 4848119821986187312L);
        setLongField(term326471, term326471.getClass(), "sumTechMasterHighScore", 8924043525986017553L);
        setLongField(term326471, term326471.getClass(), "sumTechLunaticHighScore", 702319237063962739L);
        setLongField(term326471, term326471.getClass(), "sumBattleHighScore", 6747626432994455269L);
        setLongField(term326471, term326471.getClass(), "sumBattleBasicHighScore", 1547067410244258702L);
        setLongField(term326471, term326471.getClass(), "sumBattleAdvancedHighScore", -3650871540631461832L);
        setLongField(term326471, term326471.getClass(), "sumBattleExpertHighScore", 6349637774111427140L);
        setLongField(term326471, term326471.getClass(), "sumBattleMasterHighScore", -3439924063257324419L);
        setLongField(term326471, term326471.getClass(), "sumBattleLunaticHighScore", -8860649679227026457L);
        setField(term326471, term326471.getClass(), "eventWatchedDate", "TeBjkunRjX");
        setField(term326471, term326471.getClass(), "cmEventWatchedDate", "bwjBHncGHy");
        setField(term326471, term326471.getClass(), "firstGameId", "FIWisaSzby");
        setField(term326471, term326471.getClass(), "firstRomVersion", "WsAOPEkVxV");
        setField(term326471, term326471.getClass(), "firstDataVersion", "iLxtAVEWsO");
        setField(term326471, term326471.getClass(), "firstPlayDate", "KDVDoZsuLA");
        setField(term326471, term326471.getClass(), "lastGameId", "eDXGbswuGV");
        setField(term326471, term326471.getClass(), "lastRomVersion", "lnwkbgDskU");
        setField(term326471, term326471.getClass(), "lastDataVersion", "kuGiNCWXRz");
        setField(term326471, term326471.getClass(), "compatibleCmVersion", "GByswwuHcA");
        setField(term326471, term326471.getClass(), "lastPlayDate", "BAGSatIIEF");
        setIntField(term326471, term326471.getClass(), "lastPlaceId", 292406316);
        setField(term326471, term326471.getClass(), "lastPlaceName", "bDxamlcNPU");
        setIntField(term326471, term326471.getClass(), "lastRegionId", -1515574764);
        setField(term326471, term326471.getClass(), "lastRegionName", "ZMPeJflzPo");
        setIntField(term326471, term326471.getClass(), "lastAllNetId", 881695692);
        setField(term326471, term326471.getClass(), "lastClientId", "LQQZwOwMWC");
        setIntField(term326471, term326471.getClass(), "lastUsedDeckId", -1060073489);
        setIntField(term326471, term326471.getClass(), "lastPlayMusicLevel", -1571842288);
        setIntField(term326471, term326471.getClass(), "lastEmoneyBrand", 2022139916);
        setField(term326469, term326469.getClass(), "user", term326471);
        setIntField(term326469, term326469.getClass(), "optionSet", 1561510486);
        setIntField(term326469, term326469.getClass(), "speed", -142957283);
        setIntField(term326469, term326469.getClass(), "mirror", 1910560847);
        setIntField(term326469, term326469.getClass(), "judgeTiming", -1435563017);
        setIntField(term326469, term326469.getClass(), "judgeAdjustment", -1354905069);
        setIntField(term326469, term326469.getClass(), "abort", 565724582);
        setIntField(term326469, term326469.getClass(), "stealthField", -1888267413);
        setIntField(term326469, term326469.getClass(), "tapSound", 67591122);
        setIntField(term326469, term326469.getClass(), "volGuide", -1030239102);
        setIntField(term326469, term326469.getClass(), "volAll", -259818135);
        setIntField(term326469, term326469.getClass(), "volTap", -987303336);
        setIntField(term326469, term326469.getClass(), "volCrTap", -1374851869);
        setIntField(term326469, term326469.getClass(), "volHold", 830259629);
        setIntField(term326469, term326469.getClass(), "volSide", 125980322);
        setIntField(term326469, term326469.getClass(), "volFlick", -350073794);
        setIntField(term326469, term326469.getClass(), "volBell", 90047794);
        setIntField(term326469, term326469.getClass(), "volEnemy", 1247917707);
        setIntField(term326469, term326469.getClass(), "volSkill", 1761194622);
        setIntField(term326469, term326469.getClass(), "volDamage", 285138045);
        setIntField(term326469, term326469.getClass(), "colorField", -1490640841);
        setIntField(term326469, term326469.getClass(), "colorLaneBright", -1193441882);
        setIntField(term326469, term326469.getClass(), "colorWallBright", -1281913103);
        setIntField(term326469, term326469.getClass(), "colorLane", -1223481871);
        setIntField(term326469, term326469.getClass(), "colorSide", -338326828);
        setIntField(term326469, term326469.getClass(), "effectDamage", -202246659);
        setIntField(term326469, term326469.getClass(), "effectPos", -75123257);
        setIntField(term326469, term326469.getClass(), "judgeDisp", -886749578);
        setIntField(term326469, term326469.getClass(), "judgePos", 1700481668);
        setIntField(term326469, term326469.getClass(), "judgeBreak", -24288213);
        setIntField(term326469, term326469.getClass(), "judgeHit", 1690648825);
        setIntField(term326469, term326469.getClass(), "platinumBreakDisp", 1807007406);
        setIntField(term326469, term326469.getClass(), "judgeCriticalBreak", 1874772949);
        setIntField(term326469, term326469.getClass(), "matching", 471554503);
        setIntField(term326469, term326469.getClass(), "dispPlayerLv", 888332353);
        setIntField(term326469, term326469.getClass(), "dispRating", -1296928255);
        setIntField(term326469, term326469.getClass(), "dispBP", 1294521363);
        setIntField(term326469, term326469.getClass(), "headphone", -142821618);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getHeadphone", argTypes, term326469, args);
    }

};


