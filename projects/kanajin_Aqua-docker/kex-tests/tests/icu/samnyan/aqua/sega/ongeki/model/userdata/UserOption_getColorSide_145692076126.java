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

public class UserOption_getColorSide_145692076126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320463;

    public UserOption_getColorSide_145692076126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term320469 = new Long(8499930868919012909L);
        term320463 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term320465 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term320467 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term320483 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term320484 = newInstance(Class.forName("java.time.LocalDate"));
        Object term320488 = newInstance(Class.forName("java.time.LocalTime"));
        Object term320493 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term320494 = newInstance(Class.forName("java.time.LocalDate"));
        Object term320498 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term320463, term320463.getClass(), "id", -2291936785372223937L);
        setLongField(term320465, term320465.getClass(), "id", 561403550817386552L);
        setLongField(term320467, term320467.getClass(), "id", -1938874105857188207L);
        setField(term320467, term320467.getClass(), "extId", term320469);
        setField(term320467, term320467.getClass(), "luid", "WOFpmgdSFw");
        setIntField(term320484, term320484.getClass(), "year", 2029);
        setShortField(term320484, term320484.getClass(), "month", (short) 10);
        setShortField(term320484, term320484.getClass(), "day", (short) 12);
        setField(term320483, term320483.getClass(), "date", term320484);
        setByteField(term320488, term320488.getClass(), "hour", (byte) 7);
        setByteField(term320488, term320488.getClass(), "minute", (byte) 16);
        setByteField(term320488, term320488.getClass(), "second", (byte) 52);
        setIntField(term320488, term320488.getClass(), "nano", 896178046);
        setField(term320483, term320483.getClass(), "time", term320488);
        setField(term320467, term320467.getClass(), "registerTime", term320483);
        setIntField(term320494, term320494.getClass(), "year", 2021);
        setShortField(term320494, term320494.getClass(), "month", (short) 3);
        setShortField(term320494, term320494.getClass(), "day", (short) 21);
        setField(term320493, term320493.getClass(), "date", term320494);
        setByteField(term320498, term320498.getClass(), "hour", (byte) 2);
        setByteField(term320498, term320498.getClass(), "minute", (byte) 34);
        setByteField(term320498, term320498.getClass(), "second", (byte) 7);
        setIntField(term320498, term320498.getClass(), "nano", 155612598);
        setField(term320493, term320493.getClass(), "time", term320498);
        setField(term320467, term320467.getClass(), "accessTime", term320493);
        setField(term320465, term320465.getClass(), "card", term320467);
        setField(term320465, term320465.getClass(), "userName", "HNBwERNqxS");
        setIntField(term320465, term320465.getClass(), "level", -1365438817);
        setIntField(term320465, term320465.getClass(), "reincarnationNum", -1567723265);
        setLongField(term320465, term320465.getClass(), "exp", 6796987083736041012L);
        setLongField(term320465, term320465.getClass(), "point", -1634637107291750089L);
        setLongField(term320465, term320465.getClass(), "totalPoint", -5992092390796212141L);
        setIntField(term320465, term320465.getClass(), "playCount", 668797963);
        setIntField(term320465, term320465.getClass(), "jewelCount", 2073454987);
        setIntField(term320465, term320465.getClass(), "totalJewelCount", -860188724);
        setIntField(term320465, term320465.getClass(), "medalCount", 721321620);
        setIntField(term320465, term320465.getClass(), "playerRating", -350071847);
        setIntField(term320465, term320465.getClass(), "highestRating", -1636769202);
        setIntField(term320465, term320465.getClass(), "battlePoint", -1015026130);
        setIntField(term320465, term320465.getClass(), "bestBattlePoint", 75506146);
        setIntField(term320465, term320465.getClass(), "overDamageBattlePoint", 471788916);
        setBooleanField(term320465, term320465.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term320465, term320465.getClass(), "nameplateId", -442296093);
        setIntField(term320465, term320465.getClass(), "trophyId", 199890530);
        setIntField(term320465, term320465.getClass(), "cardId", 1978311501);
        setIntField(term320465, term320465.getClass(), "characterId", 1391292582);
        setIntField(term320465, term320465.getClass(), "characterVoiceNo", -306763503);
        setIntField(term320465, term320465.getClass(), "tabSetting", -910515365);
        setIntField(term320465, term320465.getClass(), "tabSortSetting", -1874938182);
        setIntField(term320465, term320465.getClass(), "cardCategorySetting", 60519506);
        setIntField(term320465, term320465.getClass(), "cardSortSetting", 1501513914);
        setIntField(term320465, term320465.getClass(), "rivalScoreCategorySetting", -1467161925);
        setIntField(term320465, term320465.getClass(), "playedTutorialBit", 132959059);
        setIntField(term320465, term320465.getClass(), "firstTutorialCancelNum", -1384932115);
        setLongField(term320465, term320465.getClass(), "sumTechHighScore", 8032066669954959248L);
        setLongField(term320465, term320465.getClass(), "sumTechBasicHighScore", 2247689993063745361L);
        setLongField(term320465, term320465.getClass(), "sumTechAdvancedHighScore", 6186534457617042220L);
        setLongField(term320465, term320465.getClass(), "sumTechExpertHighScore", -2073127292361237966L);
        setLongField(term320465, term320465.getClass(), "sumTechMasterHighScore", 8457342753199009934L);
        setLongField(term320465, term320465.getClass(), "sumTechLunaticHighScore", -8994870844510691159L);
        setLongField(term320465, term320465.getClass(), "sumBattleHighScore", -426199680076219853L);
        setLongField(term320465, term320465.getClass(), "sumBattleBasicHighScore", 632444891138652093L);
        setLongField(term320465, term320465.getClass(), "sumBattleAdvancedHighScore", 7321178139920582611L);
        setLongField(term320465, term320465.getClass(), "sumBattleExpertHighScore", 835363000337093802L);
        setLongField(term320465, term320465.getClass(), "sumBattleMasterHighScore", 7357002741764376038L);
        setLongField(term320465, term320465.getClass(), "sumBattleLunaticHighScore", -5097391583662659067L);
        setField(term320465, term320465.getClass(), "eventWatchedDate", "brrMLbFGfu");
        setField(term320465, term320465.getClass(), "cmEventWatchedDate", "LapyQqWQhA");
        setField(term320465, term320465.getClass(), "firstGameId", "NtRnIBURuf");
        setField(term320465, term320465.getClass(), "firstRomVersion", "KpTfwGZusb");
        setField(term320465, term320465.getClass(), "firstDataVersion", "wZzTRlhtrz");
        setField(term320465, term320465.getClass(), "firstPlayDate", "lIsKaccWhM");
        setField(term320465, term320465.getClass(), "lastGameId", "gEIZCmcVbS");
        setField(term320465, term320465.getClass(), "lastRomVersion", "JupGrGACVK");
        setField(term320465, term320465.getClass(), "lastDataVersion", "NhFLDfWFmk");
        setField(term320465, term320465.getClass(), "compatibleCmVersion", "woFLnRPyPN");
        setField(term320465, term320465.getClass(), "lastPlayDate", "uBKypGjShr");
        setIntField(term320465, term320465.getClass(), "lastPlaceId", 1753884479);
        setField(term320465, term320465.getClass(), "lastPlaceName", "vKDvLVAcil");
        setIntField(term320465, term320465.getClass(), "lastRegionId", 558254691);
        setField(term320465, term320465.getClass(), "lastRegionName", "KfZLjTmxbT");
        setIntField(term320465, term320465.getClass(), "lastAllNetId", -1949691001);
        setField(term320465, term320465.getClass(), "lastClientId", "laLSxzpoDp");
        setIntField(term320465, term320465.getClass(), "lastUsedDeckId", -499802581);
        setIntField(term320465, term320465.getClass(), "lastPlayMusicLevel", 91447074);
        setIntField(term320465, term320465.getClass(), "lastEmoneyBrand", -744475827);
        setField(term320463, term320463.getClass(), "user", term320465);
        setIntField(term320463, term320463.getClass(), "optionSet", -1241544364);
        setIntField(term320463, term320463.getClass(), "speed", -2141182980);
        setIntField(term320463, term320463.getClass(), "mirror", 1469505004);
        setIntField(term320463, term320463.getClass(), "judgeTiming", 1024585112);
        setIntField(term320463, term320463.getClass(), "judgeAdjustment", 372142792);
        setIntField(term320463, term320463.getClass(), "abort", 1971050169);
        setIntField(term320463, term320463.getClass(), "stealthField", -625449392);
        setIntField(term320463, term320463.getClass(), "tapSound", 2067759588);
        setIntField(term320463, term320463.getClass(), "volGuide", -1917179196);
        setIntField(term320463, term320463.getClass(), "volAll", 1620438682);
        setIntField(term320463, term320463.getClass(), "volTap", 882806928);
        setIntField(term320463, term320463.getClass(), "volCrTap", -1786596384);
        setIntField(term320463, term320463.getClass(), "volHold", 1876898307);
        setIntField(term320463, term320463.getClass(), "volSide", 487328364);
        setIntField(term320463, term320463.getClass(), "volFlick", 1991437599);
        setIntField(term320463, term320463.getClass(), "volBell", 1953045024);
        setIntField(term320463, term320463.getClass(), "volEnemy", -79967142);
        setIntField(term320463, term320463.getClass(), "volSkill", 833764735);
        setIntField(term320463, term320463.getClass(), "volDamage", 380579207);
        setIntField(term320463, term320463.getClass(), "colorField", -1067753677);
        setIntField(term320463, term320463.getClass(), "colorLaneBright", -1041322431);
        setIntField(term320463, term320463.getClass(), "colorWallBright", 595036388);
        setIntField(term320463, term320463.getClass(), "colorLane", -1216776308);
        setIntField(term320463, term320463.getClass(), "colorSide", 927924212);
        setIntField(term320463, term320463.getClass(), "effectDamage", 615808657);
        setIntField(term320463, term320463.getClass(), "effectPos", -63163432);
        setIntField(term320463, term320463.getClass(), "judgeDisp", 1221609105);
        setIntField(term320463, term320463.getClass(), "judgePos", 363141920);
        setIntField(term320463, term320463.getClass(), "judgeBreak", -592105330);
        setIntField(term320463, term320463.getClass(), "judgeHit", -372197510);
        setIntField(term320463, term320463.getClass(), "platinumBreakDisp", 596148027);
        setIntField(term320463, term320463.getClass(), "judgeCriticalBreak", 896411177);
        setIntField(term320463, term320463.getClass(), "matching", -1421968856);
        setIntField(term320463, term320463.getClass(), "dispPlayerLv", -1790234172);
        setIntField(term320463, term320463.getClass(), "dispRating", -1893295788);
        setIntField(term320463, term320463.getClass(), "dispBP", -495740087);
        setIntField(term320463, term320463.getClass(), "headphone", 649652861);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColorSide", argTypes, term320463, args);
    }

};


