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
import java.lang.Integer;

public class UserOption_setVolCrTap_13645977253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333384;
     Object term333686;

    public UserOption_setVolCrTap_13645977253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term333390 = new Long(2289954139848415685L);
        term333384 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term333386 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term333388 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term333404 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term333405 = newInstance(Class.forName("java.time.LocalDate"));
        Object term333409 = newInstance(Class.forName("java.time.LocalTime"));
        Object term333414 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term333415 = newInstance(Class.forName("java.time.LocalDate"));
        Object term333419 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term333384, term333384.getClass(), "id", -2307758325379884039L);
        setLongField(term333386, term333386.getClass(), "id", -4628597717275321917L);
        setLongField(term333388, term333388.getClass(), "id", -8585226754439568959L);
        setField(term333388, term333388.getClass(), "extId", term333390);
        setField(term333388, term333388.getClass(), "luid", "WnVkYxbusp");
        setIntField(term333405, term333405.getClass(), "year", 2020);
        setShortField(term333405, term333405.getClass(), "month", (short) 6);
        setShortField(term333405, term333405.getClass(), "day", (short) 5);
        setField(term333404, term333404.getClass(), "date", term333405);
        setByteField(term333409, term333409.getClass(), "hour", (byte) 15);
        setByteField(term333409, term333409.getClass(), "minute", (byte) 13);
        setByteField(term333409, term333409.getClass(), "second", (byte) 42);
        setIntField(term333409, term333409.getClass(), "nano", 206255017);
        setField(term333404, term333404.getClass(), "time", term333409);
        setField(term333388, term333388.getClass(), "registerTime", term333404);
        setIntField(term333415, term333415.getClass(), "year", 2024);
        setShortField(term333415, term333415.getClass(), "month", (short) 1);
        setShortField(term333415, term333415.getClass(), "day", (short) 24);
        setField(term333414, term333414.getClass(), "date", term333415);
        setByteField(term333419, term333419.getClass(), "hour", (byte) 21);
        setByteField(term333419, term333419.getClass(), "minute", (byte) 42);
        setByteField(term333419, term333419.getClass(), "second", (byte) 42);
        setIntField(term333419, term333419.getClass(), "nano", 888293358);
        setField(term333414, term333414.getClass(), "time", term333419);
        setField(term333388, term333388.getClass(), "accessTime", term333414);
        setField(term333386, term333386.getClass(), "card", term333388);
        setField(term333386, term333386.getClass(), "userName", "rZOyprqdHT");
        setIntField(term333386, term333386.getClass(), "level", 2146725419);
        setIntField(term333386, term333386.getClass(), "reincarnationNum", -1411710613);
        setLongField(term333386, term333386.getClass(), "exp", -9079992828149898898L);
        setLongField(term333386, term333386.getClass(), "point", 5131055179195296215L);
        setLongField(term333386, term333386.getClass(), "totalPoint", 4908919175431583979L);
        setIntField(term333386, term333386.getClass(), "playCount", -1051243574);
        setIntField(term333386, term333386.getClass(), "jewelCount", 1465556982);
        setIntField(term333386, term333386.getClass(), "totalJewelCount", 364874349);
        setIntField(term333386, term333386.getClass(), "medalCount", -387817307);
        setIntField(term333386, term333386.getClass(), "playerRating", -112698474);
        setIntField(term333386, term333386.getClass(), "highestRating", -1420178466);
        setIntField(term333386, term333386.getClass(), "battlePoint", -522432266);
        setIntField(term333386, term333386.getClass(), "bestBattlePoint", -645643359);
        setIntField(term333386, term333386.getClass(), "overDamageBattlePoint", -800472466);
        setBooleanField(term333386, term333386.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term333386, term333386.getClass(), "nameplateId", 2065626310);
        setIntField(term333386, term333386.getClass(), "trophyId", -1081561149);
        setIntField(term333386, term333386.getClass(), "cardId", -267316668);
        setIntField(term333386, term333386.getClass(), "characterId", -1845399147);
        setIntField(term333386, term333386.getClass(), "characterVoiceNo", 1382095734);
        setIntField(term333386, term333386.getClass(), "tabSetting", -1826567083);
        setIntField(term333386, term333386.getClass(), "tabSortSetting", -758555514);
        setIntField(term333386, term333386.getClass(), "cardCategorySetting", -346199735);
        setIntField(term333386, term333386.getClass(), "cardSortSetting", 423661653);
        setIntField(term333386, term333386.getClass(), "rivalScoreCategorySetting", -761484053);
        setIntField(term333386, term333386.getClass(), "playedTutorialBit", -1252811363);
        setIntField(term333386, term333386.getClass(), "firstTutorialCancelNum", -331733225);
        setLongField(term333386, term333386.getClass(), "sumTechHighScore", -7864296181758378560L);
        setLongField(term333386, term333386.getClass(), "sumTechBasicHighScore", 5109780413071640308L);
        setLongField(term333386, term333386.getClass(), "sumTechAdvancedHighScore", -5686484888064523613L);
        setLongField(term333386, term333386.getClass(), "sumTechExpertHighScore", -4053858332860839554L);
        setLongField(term333386, term333386.getClass(), "sumTechMasterHighScore", 8049903172940557067L);
        setLongField(term333386, term333386.getClass(), "sumTechLunaticHighScore", -8720584626932799718L);
        setLongField(term333386, term333386.getClass(), "sumBattleHighScore", 4904181347389063403L);
        setLongField(term333386, term333386.getClass(), "sumBattleBasicHighScore", 6512899689083466398L);
        setLongField(term333386, term333386.getClass(), "sumBattleAdvancedHighScore", -8991858854349091870L);
        setLongField(term333386, term333386.getClass(), "sumBattleExpertHighScore", 6611621875049760004L);
        setLongField(term333386, term333386.getClass(), "sumBattleMasterHighScore", 8907776054145128384L);
        setLongField(term333386, term333386.getClass(), "sumBattleLunaticHighScore", 6001218403638268305L);
        setField(term333386, term333386.getClass(), "eventWatchedDate", "xJikJgmqqD");
        setField(term333386, term333386.getClass(), "cmEventWatchedDate", "ELjLBwJPNg");
        setField(term333386, term333386.getClass(), "firstGameId", "GulDVxUYdS");
        setField(term333386, term333386.getClass(), "firstRomVersion", "BKtQCAYXlj");
        setField(term333386, term333386.getClass(), "firstDataVersion", "rRLVxCHTWB");
        setField(term333386, term333386.getClass(), "firstPlayDate", "oiHPnPZJkp");
        setField(term333386, term333386.getClass(), "lastGameId", "cQEdgxZMBc");
        setField(term333386, term333386.getClass(), "lastRomVersion", "ClMgFFqEME");
        setField(term333386, term333386.getClass(), "lastDataVersion", "XWMqDJRzfK");
        setField(term333386, term333386.getClass(), "compatibleCmVersion", "uScbYgxjHd");
        setField(term333386, term333386.getClass(), "lastPlayDate", "mLVAQfkPld");
        setIntField(term333386, term333386.getClass(), "lastPlaceId", -592222932);
        setField(term333386, term333386.getClass(), "lastPlaceName", "HzJShBfiRn");
        setIntField(term333386, term333386.getClass(), "lastRegionId", 664977650);
        setField(term333386, term333386.getClass(), "lastRegionName", "CrOWXPnEOP");
        setIntField(term333386, term333386.getClass(), "lastAllNetId", 1126731099);
        setField(term333386, term333386.getClass(), "lastClientId", "krNwtYQTPj");
        setIntField(term333386, term333386.getClass(), "lastUsedDeckId", -388946581);
        setIntField(term333386, term333386.getClass(), "lastPlayMusicLevel", 94418736);
        setIntField(term333386, term333386.getClass(), "lastEmoneyBrand", 492174524);
        setField(term333384, term333384.getClass(), "user", term333386);
        setIntField(term333384, term333384.getClass(), "optionSet", -601316396);
        setIntField(term333384, term333384.getClass(), "speed", 752304230);
        setIntField(term333384, term333384.getClass(), "mirror", -1227352770);
        setIntField(term333384, term333384.getClass(), "judgeTiming", -1489142672);
        setIntField(term333384, term333384.getClass(), "judgeAdjustment", -225201341);
        setIntField(term333384, term333384.getClass(), "abort", 140252148);
        setIntField(term333384, term333384.getClass(), "stealthField", 153257576);
        setIntField(term333384, term333384.getClass(), "tapSound", 2047795777);
        setIntField(term333384, term333384.getClass(), "volGuide", -1715094483);
        setIntField(term333384, term333384.getClass(), "volAll", 100181788);
        setIntField(term333384, term333384.getClass(), "volTap", -729877329);
        setIntField(term333384, term333384.getClass(), "volCrTap", 1728308194);
        setIntField(term333384, term333384.getClass(), "volHold", 1168793542);
        setIntField(term333384, term333384.getClass(), "volSide", 1408039066);
        setIntField(term333384, term333384.getClass(), "volFlick", -294387694);
        setIntField(term333384, term333384.getClass(), "volBell", 1744223033);
        setIntField(term333384, term333384.getClass(), "volEnemy", 2114622612);
        setIntField(term333384, term333384.getClass(), "volSkill", -1414446934);
        setIntField(term333384, term333384.getClass(), "volDamage", -880968249);
        setIntField(term333384, term333384.getClass(), "colorField", 101215826);
        setIntField(term333384, term333384.getClass(), "colorLaneBright", -454131374);
        setIntField(term333384, term333384.getClass(), "colorWallBright", 1987640358);
        setIntField(term333384, term333384.getClass(), "colorLane", 1430005704);
        setIntField(term333384, term333384.getClass(), "colorSide", -1454431594);
        setIntField(term333384, term333384.getClass(), "effectDamage", -1903713770);
        setIntField(term333384, term333384.getClass(), "effectPos", 242422995);
        setIntField(term333384, term333384.getClass(), "judgeDisp", 1550991504);
        setIntField(term333384, term333384.getClass(), "judgePos", 221900604);
        setIntField(term333384, term333384.getClass(), "judgeBreak", -642409547);
        setIntField(term333384, term333384.getClass(), "judgeHit", -579618057);
        setIntField(term333384, term333384.getClass(), "platinumBreakDisp", 759181094);
        setIntField(term333384, term333384.getClass(), "judgeCriticalBreak", 507175678);
        setIntField(term333384, term333384.getClass(), "matching", -327523994);
        setIntField(term333384, term333384.getClass(), "dispPlayerLv", -1620458450);
        setIntField(term333384, term333384.getClass(), "dispRating", -1849665702);
        setIntField(term333384, term333384.getClass(), "dispBP", 1897869584);
        setIntField(term333384, term333384.getClass(), "headphone", -975662939);
        term333686 = new Integer(852140925);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term333686;
        callMethod(klass, "setVolCrTap", argTypes, term333384, args);
    }

};


