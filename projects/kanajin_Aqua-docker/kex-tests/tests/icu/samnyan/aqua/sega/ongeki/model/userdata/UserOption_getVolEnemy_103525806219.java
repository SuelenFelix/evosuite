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

public class UserOption_getVolEnemy_103525806219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317229;

    public UserOption_getVolEnemy_103525806219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term317235 = new Long(4036794646678680547L);
        term317229 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term317231 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term317233 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term317249 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317250 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317254 = newInstance(Class.forName("java.time.LocalTime"));
        Object term317259 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term317260 = newInstance(Class.forName("java.time.LocalDate"));
        Object term317264 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term317229, term317229.getClass(), "id", 2929984592674352828L);
        setLongField(term317231, term317231.getClass(), "id", 4270311364794989396L);
        setLongField(term317233, term317233.getClass(), "id", -1197216053920501964L);
        setField(term317233, term317233.getClass(), "extId", term317235);
        setField(term317233, term317233.getClass(), "luid", "eSLLdabnoi");
        setIntField(term317250, term317250.getClass(), "year", 2023);
        setShortField(term317250, term317250.getClass(), "month", (short) 3);
        setShortField(term317250, term317250.getClass(), "day", (short) 8);
        setField(term317249, term317249.getClass(), "date", term317250);
        setByteField(term317254, term317254.getClass(), "hour", (byte) 7);
        setByteField(term317254, term317254.getClass(), "minute", (byte) 31);
        setByteField(term317254, term317254.getClass(), "second", (byte) 15);
        setIntField(term317254, term317254.getClass(), "nano", 851391479);
        setField(term317249, term317249.getClass(), "time", term317254);
        setField(term317233, term317233.getClass(), "registerTime", term317249);
        setIntField(term317260, term317260.getClass(), "year", 2017);
        setShortField(term317260, term317260.getClass(), "month", (short) 8);
        setShortField(term317260, term317260.getClass(), "day", (short) 14);
        setField(term317259, term317259.getClass(), "date", term317260);
        setByteField(term317264, term317264.getClass(), "hour", (byte) 13);
        setByteField(term317264, term317264.getClass(), "minute", (byte) 57);
        setByteField(term317264, term317264.getClass(), "second", (byte) 22);
        setIntField(term317264, term317264.getClass(), "nano", 973705522);
        setField(term317259, term317259.getClass(), "time", term317264);
        setField(term317233, term317233.getClass(), "accessTime", term317259);
        setField(term317231, term317231.getClass(), "card", term317233);
        setField(term317231, term317231.getClass(), "userName", "wjOfkvPGQr");
        setIntField(term317231, term317231.getClass(), "level", 1567357010);
        setIntField(term317231, term317231.getClass(), "reincarnationNum", -1346132487);
        setLongField(term317231, term317231.getClass(), "exp", -8911042191409879366L);
        setLongField(term317231, term317231.getClass(), "point", -9074831261091550971L);
        setLongField(term317231, term317231.getClass(), "totalPoint", 1698300897896576638L);
        setIntField(term317231, term317231.getClass(), "playCount", 528169923);
        setIntField(term317231, term317231.getClass(), "jewelCount", -1780676124);
        setIntField(term317231, term317231.getClass(), "totalJewelCount", 1415646409);
        setIntField(term317231, term317231.getClass(), "medalCount", -1394611666);
        setIntField(term317231, term317231.getClass(), "playerRating", 881835921);
        setIntField(term317231, term317231.getClass(), "highestRating", -740119740);
        setIntField(term317231, term317231.getClass(), "battlePoint", -1903635771);
        setIntField(term317231, term317231.getClass(), "bestBattlePoint", -74698971);
        setIntField(term317231, term317231.getClass(), "overDamageBattlePoint", 911900418);
        setBooleanField(term317231, term317231.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term317231, term317231.getClass(), "nameplateId", 414452623);
        setIntField(term317231, term317231.getClass(), "trophyId", 140926878);
        setIntField(term317231, term317231.getClass(), "cardId", -1686994806);
        setIntField(term317231, term317231.getClass(), "characterId", 771762864);
        setIntField(term317231, term317231.getClass(), "characterVoiceNo", -303423293);
        setIntField(term317231, term317231.getClass(), "tabSetting", -1255951945);
        setIntField(term317231, term317231.getClass(), "tabSortSetting", 1586315089);
        setIntField(term317231, term317231.getClass(), "cardCategorySetting", 560822613);
        setIntField(term317231, term317231.getClass(), "cardSortSetting", 1950204629);
        setIntField(term317231, term317231.getClass(), "rivalScoreCategorySetting", -500535821);
        setIntField(term317231, term317231.getClass(), "playedTutorialBit", -900332514);
        setIntField(term317231, term317231.getClass(), "firstTutorialCancelNum", 2145608792);
        setLongField(term317231, term317231.getClass(), "sumTechHighScore", 4297292957956524337L);
        setLongField(term317231, term317231.getClass(), "sumTechBasicHighScore", -7026324670312670572L);
        setLongField(term317231, term317231.getClass(), "sumTechAdvancedHighScore", -6188165286128038231L);
        setLongField(term317231, term317231.getClass(), "sumTechExpertHighScore", 3628515946165480095L);
        setLongField(term317231, term317231.getClass(), "sumTechMasterHighScore", 7599339814073912668L);
        setLongField(term317231, term317231.getClass(), "sumTechLunaticHighScore", -6803507441248875881L);
        setLongField(term317231, term317231.getClass(), "sumBattleHighScore", -5095916846382850704L);
        setLongField(term317231, term317231.getClass(), "sumBattleBasicHighScore", 403537450947442085L);
        setLongField(term317231, term317231.getClass(), "sumBattleAdvancedHighScore", 552521069572700878L);
        setLongField(term317231, term317231.getClass(), "sumBattleExpertHighScore", -3256137648835275951L);
        setLongField(term317231, term317231.getClass(), "sumBattleMasterHighScore", -2917583982133683996L);
        setLongField(term317231, term317231.getClass(), "sumBattleLunaticHighScore", -4862253624426530082L);
        setField(term317231, term317231.getClass(), "eventWatchedDate", "oUJGVkkuzD");
        setField(term317231, term317231.getClass(), "cmEventWatchedDate", "DzhwiESSXn");
        setField(term317231, term317231.getClass(), "firstGameId", "yaXyLZxCyT");
        setField(term317231, term317231.getClass(), "firstRomVersion", "UVvgcYCDGO");
        setField(term317231, term317231.getClass(), "firstDataVersion", "EKGBysDLQq");
        setField(term317231, term317231.getClass(), "firstPlayDate", "HqzyYUlITR");
        setField(term317231, term317231.getClass(), "lastGameId", "GwrzBMyIgJ");
        setField(term317231, term317231.getClass(), "lastRomVersion", "FIpWyypovk");
        setField(term317231, term317231.getClass(), "lastDataVersion", "LlcsTNqedo");
        setField(term317231, term317231.getClass(), "compatibleCmVersion", "wQWzERJzHp");
        setField(term317231, term317231.getClass(), "lastPlayDate", "TIVTNOlEva");
        setIntField(term317231, term317231.getClass(), "lastPlaceId", -904237392);
        setField(term317231, term317231.getClass(), "lastPlaceName", "RkuLSgmheH");
        setIntField(term317231, term317231.getClass(), "lastRegionId", -24739736);
        setField(term317231, term317231.getClass(), "lastRegionName", "TkefePYDBO");
        setIntField(term317231, term317231.getClass(), "lastAllNetId", -686439450);
        setField(term317231, term317231.getClass(), "lastClientId", "vqbKjDdjzU");
        setIntField(term317231, term317231.getClass(), "lastUsedDeckId", -1758324309);
        setIntField(term317231, term317231.getClass(), "lastPlayMusicLevel", -1301564035);
        setIntField(term317231, term317231.getClass(), "lastEmoneyBrand", -1123707822);
        setField(term317229, term317229.getClass(), "user", term317231);
        setIntField(term317229, term317229.getClass(), "optionSet", -369091883);
        setIntField(term317229, term317229.getClass(), "speed", 1490073299);
        setIntField(term317229, term317229.getClass(), "mirror", -1606689755);
        setIntField(term317229, term317229.getClass(), "judgeTiming", 264345418);
        setIntField(term317229, term317229.getClass(), "judgeAdjustment", 1828577650);
        setIntField(term317229, term317229.getClass(), "abort", -1303568057);
        setIntField(term317229, term317229.getClass(), "stealthField", 538865427);
        setIntField(term317229, term317229.getClass(), "tapSound", -67912777);
        setIntField(term317229, term317229.getClass(), "volGuide", 1856598016);
        setIntField(term317229, term317229.getClass(), "volAll", 678465534);
        setIntField(term317229, term317229.getClass(), "volTap", -422982082);
        setIntField(term317229, term317229.getClass(), "volCrTap", 1355853444);
        setIntField(term317229, term317229.getClass(), "volHold", -264162265);
        setIntField(term317229, term317229.getClass(), "volSide", 623548995);
        setIntField(term317229, term317229.getClass(), "volFlick", -1326516890);
        setIntField(term317229, term317229.getClass(), "volBell", 1795552275);
        setIntField(term317229, term317229.getClass(), "volEnemy", 209419475);
        setIntField(term317229, term317229.getClass(), "volSkill", 1998446539);
        setIntField(term317229, term317229.getClass(), "volDamage", 999228573);
        setIntField(term317229, term317229.getClass(), "colorField", 461086833);
        setIntField(term317229, term317229.getClass(), "colorLaneBright", 728801372);
        setIntField(term317229, term317229.getClass(), "colorWallBright", 734436872);
        setIntField(term317229, term317229.getClass(), "colorLane", 1375882504);
        setIntField(term317229, term317229.getClass(), "colorSide", -1300439350);
        setIntField(term317229, term317229.getClass(), "effectDamage", -1551965977);
        setIntField(term317229, term317229.getClass(), "effectPos", 333760191);
        setIntField(term317229, term317229.getClass(), "judgeDisp", -1478695450);
        setIntField(term317229, term317229.getClass(), "judgePos", -73597922);
        setIntField(term317229, term317229.getClass(), "judgeBreak", -1218596085);
        setIntField(term317229, term317229.getClass(), "judgeHit", -1705481256);
        setIntField(term317229, term317229.getClass(), "platinumBreakDisp", -1659302446);
        setIntField(term317229, term317229.getClass(), "judgeCriticalBreak", 2044062004);
        setIntField(term317229, term317229.getClass(), "matching", -53720393);
        setIntField(term317229, term317229.getClass(), "dispPlayerLv", -382167948);
        setIntField(term317229, term317229.getClass(), "dispRating", 1387256900);
        setIntField(term317229, term317229.getClass(), "dispBP", 2042128335);
        setIntField(term317229, term317229.getClass(), "headphone", 664900178);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getVolEnemy", argTypes, term317229, args);
    }

};


