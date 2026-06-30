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

public class UserOption_setJudgeBreak_45924242970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341272;
     Object term341574;

    public UserOption_setJudgeBreak_45924242970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term341278 = new Long(-5608790408657117046L);
        term341272 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term341274 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term341276 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term341292 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term341293 = newInstance(Class.forName("java.time.LocalDate"));
        Object term341297 = newInstance(Class.forName("java.time.LocalTime"));
        Object term341302 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term341303 = newInstance(Class.forName("java.time.LocalDate"));
        Object term341307 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term341272, term341272.getClass(), "id", -4339301220665118470L);
        setLongField(term341274, term341274.getClass(), "id", 4586791139779452527L);
        setLongField(term341276, term341276.getClass(), "id", -5081440968319984171L);
        setField(term341276, term341276.getClass(), "extId", term341278);
        setField(term341276, term341276.getClass(), "luid", "umdqfsQnIz");
        setIntField(term341293, term341293.getClass(), "year", 2026);
        setShortField(term341293, term341293.getClass(), "month", (short) 3);
        setShortField(term341293, term341293.getClass(), "day", (short) 11);
        setField(term341292, term341292.getClass(), "date", term341293);
        setByteField(term341297, term341297.getClass(), "hour", (byte) 22);
        setByteField(term341297, term341297.getClass(), "minute", (byte) 29);
        setByteField(term341297, term341297.getClass(), "second", (byte) 59);
        setIntField(term341297, term341297.getClass(), "nano", 723069353);
        setField(term341292, term341292.getClass(), "time", term341297);
        setField(term341276, term341276.getClass(), "registerTime", term341292);
        setIntField(term341303, term341303.getClass(), "year", 2010);
        setShortField(term341303, term341303.getClass(), "month", (short) 7);
        setShortField(term341303, term341303.getClass(), "day", (short) 20);
        setField(term341302, term341302.getClass(), "date", term341303);
        setByteField(term341307, term341307.getClass(), "hour", (byte) 8);
        setByteField(term341307, term341307.getClass(), "minute", (byte) 33);
        setByteField(term341307, term341307.getClass(), "second", (byte) 59);
        setIntField(term341307, term341307.getClass(), "nano", 419736127);
        setField(term341302, term341302.getClass(), "time", term341307);
        setField(term341276, term341276.getClass(), "accessTime", term341302);
        setField(term341274, term341274.getClass(), "card", term341276);
        setField(term341274, term341274.getClass(), "userName", "BbeeuoqKxt");
        setIntField(term341274, term341274.getClass(), "level", 2025208778);
        setIntField(term341274, term341274.getClass(), "reincarnationNum", 1370681770);
        setLongField(term341274, term341274.getClass(), "exp", -3186335785734438190L);
        setLongField(term341274, term341274.getClass(), "point", -7985524583373865593L);
        setLongField(term341274, term341274.getClass(), "totalPoint", 3680443976200028133L);
        setIntField(term341274, term341274.getClass(), "playCount", 1718764579);
        setIntField(term341274, term341274.getClass(), "jewelCount", -377534469);
        setIntField(term341274, term341274.getClass(), "totalJewelCount", -1238937362);
        setIntField(term341274, term341274.getClass(), "medalCount", 472430253);
        setIntField(term341274, term341274.getClass(), "playerRating", -816131136);
        setIntField(term341274, term341274.getClass(), "highestRating", 487779450);
        setIntField(term341274, term341274.getClass(), "battlePoint", -1987955851);
        setIntField(term341274, term341274.getClass(), "bestBattlePoint", 17763142);
        setIntField(term341274, term341274.getClass(), "overDamageBattlePoint", 2122095247);
        setBooleanField(term341274, term341274.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term341274, term341274.getClass(), "nameplateId", 339577415);
        setIntField(term341274, term341274.getClass(), "trophyId", 309625430);
        setIntField(term341274, term341274.getClass(), "cardId", 154511610);
        setIntField(term341274, term341274.getClass(), "characterId", -905125935);
        setIntField(term341274, term341274.getClass(), "characterVoiceNo", -885197604);
        setIntField(term341274, term341274.getClass(), "tabSetting", -1706655724);
        setIntField(term341274, term341274.getClass(), "tabSortSetting", 62031676);
        setIntField(term341274, term341274.getClass(), "cardCategorySetting", -433478800);
        setIntField(term341274, term341274.getClass(), "cardSortSetting", -255748689);
        setIntField(term341274, term341274.getClass(), "rivalScoreCategorySetting", 2059588490);
        setIntField(term341274, term341274.getClass(), "playedTutorialBit", -1167128868);
        setIntField(term341274, term341274.getClass(), "firstTutorialCancelNum", -1058056601);
        setLongField(term341274, term341274.getClass(), "sumTechHighScore", -6691670693786540531L);
        setLongField(term341274, term341274.getClass(), "sumTechBasicHighScore", 1435615613802624864L);
        setLongField(term341274, term341274.getClass(), "sumTechAdvancedHighScore", 953343370104517158L);
        setLongField(term341274, term341274.getClass(), "sumTechExpertHighScore", 1320379472652184060L);
        setLongField(term341274, term341274.getClass(), "sumTechMasterHighScore", 8164185438516617566L);
        setLongField(term341274, term341274.getClass(), "sumTechLunaticHighScore", 4144564286493491475L);
        setLongField(term341274, term341274.getClass(), "sumBattleHighScore", -4728832521924676537L);
        setLongField(term341274, term341274.getClass(), "sumBattleBasicHighScore", 1640698742195965576L);
        setLongField(term341274, term341274.getClass(), "sumBattleAdvancedHighScore", -4930962466215638775L);
        setLongField(term341274, term341274.getClass(), "sumBattleExpertHighScore", 4647322689183082212L);
        setLongField(term341274, term341274.getClass(), "sumBattleMasterHighScore", -3476250435891119075L);
        setLongField(term341274, term341274.getClass(), "sumBattleLunaticHighScore", 7754124173587003841L);
        setField(term341274, term341274.getClass(), "eventWatchedDate", "tfhFNHBHkS");
        setField(term341274, term341274.getClass(), "cmEventWatchedDate", "rJqMhcjqzK");
        setField(term341274, term341274.getClass(), "firstGameId", "ajpfRfGCmX");
        setField(term341274, term341274.getClass(), "firstRomVersion", "CArkQLGLJQ");
        setField(term341274, term341274.getClass(), "firstDataVersion", "DuCHkMIRMz");
        setField(term341274, term341274.getClass(), "firstPlayDate", "LUvvcnGIIg");
        setField(term341274, term341274.getClass(), "lastGameId", "GprnYzqydc");
        setField(term341274, term341274.getClass(), "lastRomVersion", "BLfdIToUVn");
        setField(term341274, term341274.getClass(), "lastDataVersion", "ZIrZczHyNe");
        setField(term341274, term341274.getClass(), "compatibleCmVersion", "UDzvZWzzGx");
        setField(term341274, term341274.getClass(), "lastPlayDate", "QsjHyGnkmj");
        setIntField(term341274, term341274.getClass(), "lastPlaceId", -754465081);
        setField(term341274, term341274.getClass(), "lastPlaceName", "ZkPhtIsrdA");
        setIntField(term341274, term341274.getClass(), "lastRegionId", -1311567638);
        setField(term341274, term341274.getClass(), "lastRegionName", "pgyYwLvqdR");
        setIntField(term341274, term341274.getClass(), "lastAllNetId", 915923133);
        setField(term341274, term341274.getClass(), "lastClientId", "WmdyfEMWtH");
        setIntField(term341274, term341274.getClass(), "lastUsedDeckId", -595118752);
        setIntField(term341274, term341274.getClass(), "lastPlayMusicLevel", -460078447);
        setIntField(term341274, term341274.getClass(), "lastEmoneyBrand", 778915587);
        setField(term341272, term341272.getClass(), "user", term341274);
        setIntField(term341272, term341272.getClass(), "optionSet", -2003776565);
        setIntField(term341272, term341272.getClass(), "speed", -303158882);
        setIntField(term341272, term341272.getClass(), "mirror", 253508851);
        setIntField(term341272, term341272.getClass(), "judgeTiming", 1517243585);
        setIntField(term341272, term341272.getClass(), "judgeAdjustment", 1806175787);
        setIntField(term341272, term341272.getClass(), "abort", -657566691);
        setIntField(term341272, term341272.getClass(), "stealthField", -547554911);
        setIntField(term341272, term341272.getClass(), "tapSound", 1674046202);
        setIntField(term341272, term341272.getClass(), "volGuide", -388665933);
        setIntField(term341272, term341272.getClass(), "volAll", -909924617);
        setIntField(term341272, term341272.getClass(), "volTap", 1984689071);
        setIntField(term341272, term341272.getClass(), "volCrTap", -2045247897);
        setIntField(term341272, term341272.getClass(), "volHold", 1083388827);
        setIntField(term341272, term341272.getClass(), "volSide", 1124479240);
        setIntField(term341272, term341272.getClass(), "volFlick", -524227992);
        setIntField(term341272, term341272.getClass(), "volBell", -1862287889);
        setIntField(term341272, term341272.getClass(), "volEnemy", 1234646901);
        setIntField(term341272, term341272.getClass(), "volSkill", 1643839445);
        setIntField(term341272, term341272.getClass(), "volDamage", -683120803);
        setIntField(term341272, term341272.getClass(), "colorField", 517886251);
        setIntField(term341272, term341272.getClass(), "colorLaneBright", -1273158310);
        setIntField(term341272, term341272.getClass(), "colorWallBright", 282508201);
        setIntField(term341272, term341272.getClass(), "colorLane", 567841216);
        setIntField(term341272, term341272.getClass(), "colorSide", 673006374);
        setIntField(term341272, term341272.getClass(), "effectDamage", 1322414949);
        setIntField(term341272, term341272.getClass(), "effectPos", 1015767552);
        setIntField(term341272, term341272.getClass(), "judgeDisp", -1347460366);
        setIntField(term341272, term341272.getClass(), "judgePos", -1602626204);
        setIntField(term341272, term341272.getClass(), "judgeBreak", 1183300197);
        setIntField(term341272, term341272.getClass(), "judgeHit", 653050409);
        setIntField(term341272, term341272.getClass(), "platinumBreakDisp", 2013728857);
        setIntField(term341272, term341272.getClass(), "judgeCriticalBreak", -1571115227);
        setIntField(term341272, term341272.getClass(), "matching", 466773453);
        setIntField(term341272, term341272.getClass(), "dispPlayerLv", 227385382);
        setIntField(term341272, term341272.getClass(), "dispRating", 365346423);
        setIntField(term341272, term341272.getClass(), "dispBP", -396376854);
        setIntField(term341272, term341272.getClass(), "headphone", -1660621073);
        term341574 = new Integer(1234280918);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term341574;
        callMethod(klass, "setJudgeBreak", argTypes, term341272, args);
    }

};


