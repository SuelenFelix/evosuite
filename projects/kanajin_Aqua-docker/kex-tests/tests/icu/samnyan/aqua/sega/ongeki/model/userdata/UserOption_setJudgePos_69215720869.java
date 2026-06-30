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

public class UserOption_setJudgePos_69215720869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340808;
     Object term341110;

    public UserOption_setJudgePos_69215720869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term340814 = new Long(-6418282217428803693L);
        term340808 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term340810 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term340812 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term340828 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term340829 = newInstance(Class.forName("java.time.LocalDate"));
        Object term340833 = newInstance(Class.forName("java.time.LocalTime"));
        Object term340838 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term340839 = newInstance(Class.forName("java.time.LocalDate"));
        Object term340843 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term340808, term340808.getClass(), "id", 8599606089988610928L);
        setLongField(term340810, term340810.getClass(), "id", -3034216925512377469L);
        setLongField(term340812, term340812.getClass(), "id", -3907032388345841763L);
        setField(term340812, term340812.getClass(), "extId", term340814);
        setField(term340812, term340812.getClass(), "luid", "pHzKRauNjb");
        setIntField(term340829, term340829.getClass(), "year", 2011);
        setShortField(term340829, term340829.getClass(), "month", (short) 5);
        setShortField(term340829, term340829.getClass(), "day", (short) 23);
        setField(term340828, term340828.getClass(), "date", term340829);
        setByteField(term340833, term340833.getClass(), "hour", (byte) 16);
        setByteField(term340833, term340833.getClass(), "minute", (byte) 43);
        setByteField(term340833, term340833.getClass(), "second", (byte) 54);
        setIntField(term340833, term340833.getClass(), "nano", 962047579);
        setField(term340828, term340828.getClass(), "time", term340833);
        setField(term340812, term340812.getClass(), "registerTime", term340828);
        setIntField(term340839, term340839.getClass(), "year", 2019);
        setShortField(term340839, term340839.getClass(), "month", (short) 1);
        setShortField(term340839, term340839.getClass(), "day", (short) 19);
        setField(term340838, term340838.getClass(), "date", term340839);
        setByteField(term340843, term340843.getClass(), "hour", (byte) 13);
        setByteField(term340843, term340843.getClass(), "minute", (byte) 27);
        setByteField(term340843, term340843.getClass(), "second", (byte) 2);
        setIntField(term340843, term340843.getClass(), "nano", 873919343);
        setField(term340838, term340838.getClass(), "time", term340843);
        setField(term340812, term340812.getClass(), "accessTime", term340838);
        setField(term340810, term340810.getClass(), "card", term340812);
        setField(term340810, term340810.getClass(), "userName", "LDSgUsvuCQ");
        setIntField(term340810, term340810.getClass(), "level", 1564787468);
        setIntField(term340810, term340810.getClass(), "reincarnationNum", 724156238);
        setLongField(term340810, term340810.getClass(), "exp", -2445541097290298887L);
        setLongField(term340810, term340810.getClass(), "point", 8262323363013105772L);
        setLongField(term340810, term340810.getClass(), "totalPoint", -1755093376790771888L);
        setIntField(term340810, term340810.getClass(), "playCount", 1529773068);
        setIntField(term340810, term340810.getClass(), "jewelCount", 1699081293);
        setIntField(term340810, term340810.getClass(), "totalJewelCount", -2022502187);
        setIntField(term340810, term340810.getClass(), "medalCount", -1381763762);
        setIntField(term340810, term340810.getClass(), "playerRating", -1759657760);
        setIntField(term340810, term340810.getClass(), "highestRating", 2134512972);
        setIntField(term340810, term340810.getClass(), "battlePoint", -430013932);
        setIntField(term340810, term340810.getClass(), "bestBattlePoint", 1321251758);
        setIntField(term340810, term340810.getClass(), "overDamageBattlePoint", -632822177);
        setBooleanField(term340810, term340810.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term340810, term340810.getClass(), "nameplateId", -675399364);
        setIntField(term340810, term340810.getClass(), "trophyId", 647381700);
        setIntField(term340810, term340810.getClass(), "cardId", -1607540253);
        setIntField(term340810, term340810.getClass(), "characterId", -944684699);
        setIntField(term340810, term340810.getClass(), "characterVoiceNo", -1134073298);
        setIntField(term340810, term340810.getClass(), "tabSetting", 867252054);
        setIntField(term340810, term340810.getClass(), "tabSortSetting", -1324280406);
        setIntField(term340810, term340810.getClass(), "cardCategorySetting", 796227640);
        setIntField(term340810, term340810.getClass(), "cardSortSetting", 862188420);
        setIntField(term340810, term340810.getClass(), "rivalScoreCategorySetting", -377699095);
        setIntField(term340810, term340810.getClass(), "playedTutorialBit", 783780138);
        setIntField(term340810, term340810.getClass(), "firstTutorialCancelNum", 843687897);
        setLongField(term340810, term340810.getClass(), "sumTechHighScore", 547334166027677799L);
        setLongField(term340810, term340810.getClass(), "sumTechBasicHighScore", 2295531092475802853L);
        setLongField(term340810, term340810.getClass(), "sumTechAdvancedHighScore", -6442965349355382279L);
        setLongField(term340810, term340810.getClass(), "sumTechExpertHighScore", 1034547829727498641L);
        setLongField(term340810, term340810.getClass(), "sumTechMasterHighScore", 511849701515021616L);
        setLongField(term340810, term340810.getClass(), "sumTechLunaticHighScore", 1309559530059755273L);
        setLongField(term340810, term340810.getClass(), "sumBattleHighScore", 6418830505326046658L);
        setLongField(term340810, term340810.getClass(), "sumBattleBasicHighScore", 4309185016528066951L);
        setLongField(term340810, term340810.getClass(), "sumBattleAdvancedHighScore", 1518966351502275925L);
        setLongField(term340810, term340810.getClass(), "sumBattleExpertHighScore", -3583726382298786390L);
        setLongField(term340810, term340810.getClass(), "sumBattleMasterHighScore", -5166284494065254918L);
        setLongField(term340810, term340810.getClass(), "sumBattleLunaticHighScore", 2856492790443890842L);
        setField(term340810, term340810.getClass(), "eventWatchedDate", "kvKWnYufIy");
        setField(term340810, term340810.getClass(), "cmEventWatchedDate", "DzxiYheTBe");
        setField(term340810, term340810.getClass(), "firstGameId", "yXWXdGTQya");
        setField(term340810, term340810.getClass(), "firstRomVersion", "JpkhmtXJey");
        setField(term340810, term340810.getClass(), "firstDataVersion", "CKXIoTiujr");
        setField(term340810, term340810.getClass(), "firstPlayDate", "UuQPlilEYr");
        setField(term340810, term340810.getClass(), "lastGameId", "OqkTUIVgDV");
        setField(term340810, term340810.getClass(), "lastRomVersion", "AzLEuCSUgp");
        setField(term340810, term340810.getClass(), "lastDataVersion", "ROodNrvMcD");
        setField(term340810, term340810.getClass(), "compatibleCmVersion", "HWmwopmBED");
        setField(term340810, term340810.getClass(), "lastPlayDate", "pCLsnhNjZr");
        setIntField(term340810, term340810.getClass(), "lastPlaceId", 1222555316);
        setField(term340810, term340810.getClass(), "lastPlaceName", "TzctWbxfse");
        setIntField(term340810, term340810.getClass(), "lastRegionId", -917280584);
        setField(term340810, term340810.getClass(), "lastRegionName", "gCvxynMTqr");
        setIntField(term340810, term340810.getClass(), "lastAllNetId", -1652502694);
        setField(term340810, term340810.getClass(), "lastClientId", "tcsusDkUcV");
        setIntField(term340810, term340810.getClass(), "lastUsedDeckId", 1600850588);
        setIntField(term340810, term340810.getClass(), "lastPlayMusicLevel", 531959884);
        setIntField(term340810, term340810.getClass(), "lastEmoneyBrand", 453038803);
        setField(term340808, term340808.getClass(), "user", term340810);
        setIntField(term340808, term340808.getClass(), "optionSet", -1643872);
        setIntField(term340808, term340808.getClass(), "speed", -1363610630);
        setIntField(term340808, term340808.getClass(), "mirror", -969438923);
        setIntField(term340808, term340808.getClass(), "judgeTiming", 79722514);
        setIntField(term340808, term340808.getClass(), "judgeAdjustment", -369841734);
        setIntField(term340808, term340808.getClass(), "abort", -1789774426);
        setIntField(term340808, term340808.getClass(), "stealthField", -328345541);
        setIntField(term340808, term340808.getClass(), "tapSound", 490655557);
        setIntField(term340808, term340808.getClass(), "volGuide", 1287220961);
        setIntField(term340808, term340808.getClass(), "volAll", 2012955101);
        setIntField(term340808, term340808.getClass(), "volTap", -639961140);
        setIntField(term340808, term340808.getClass(), "volCrTap", 1146400176);
        setIntField(term340808, term340808.getClass(), "volHold", -435174101);
        setIntField(term340808, term340808.getClass(), "volSide", 487825154);
        setIntField(term340808, term340808.getClass(), "volFlick", 1564890111);
        setIntField(term340808, term340808.getClass(), "volBell", 1589081782);
        setIntField(term340808, term340808.getClass(), "volEnemy", -2022873040);
        setIntField(term340808, term340808.getClass(), "volSkill", -46759831);
        setIntField(term340808, term340808.getClass(), "volDamage", 635131096);
        setIntField(term340808, term340808.getClass(), "colorField", 223351507);
        setIntField(term340808, term340808.getClass(), "colorLaneBright", -2001100304);
        setIntField(term340808, term340808.getClass(), "colorWallBright", 118200434);
        setIntField(term340808, term340808.getClass(), "colorLane", -1035941686);
        setIntField(term340808, term340808.getClass(), "colorSide", -40508977);
        setIntField(term340808, term340808.getClass(), "effectDamage", 345055988);
        setIntField(term340808, term340808.getClass(), "effectPos", -2054522918);
        setIntField(term340808, term340808.getClass(), "judgeDisp", -329387140);
        setIntField(term340808, term340808.getClass(), "judgePos", -865461200);
        setIntField(term340808, term340808.getClass(), "judgeBreak", 1210890418);
        setIntField(term340808, term340808.getClass(), "judgeHit", -649851315);
        setIntField(term340808, term340808.getClass(), "platinumBreakDisp", 1469793487);
        setIntField(term340808, term340808.getClass(), "judgeCriticalBreak", 734222319);
        setIntField(term340808, term340808.getClass(), "matching", -997030347);
        setIntField(term340808, term340808.getClass(), "dispPlayerLv", -227860418);
        setIntField(term340808, term340808.getClass(), "dispRating", -1211565024);
        setIntField(term340808, term340808.getClass(), "dispBP", -2076171153);
        setIntField(term340808, term340808.getClass(), "headphone", -1894800643);
        term341110 = new Integer(1536017915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term341110;
        callMethod(klass, "setJudgePos", argTypes, term340808, args);
    }

};


