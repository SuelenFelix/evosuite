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

public class UserOption_setDispRating_12959431076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term344056;
     Object term344358;

    public UserOption_setDispRating_12959431076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term344062 = new Long(8495724482241106293L);
        term344056 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term344058 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term344060 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term344076 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term344077 = newInstance(Class.forName("java.time.LocalDate"));
        Object term344081 = newInstance(Class.forName("java.time.LocalTime"));
        Object term344086 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term344087 = newInstance(Class.forName("java.time.LocalDate"));
        Object term344091 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term344056, term344056.getClass(), "id", -7908948541387638371L);
        setLongField(term344058, term344058.getClass(), "id", -8729950913402478679L);
        setLongField(term344060, term344060.getClass(), "id", 5614671196960680464L);
        setField(term344060, term344060.getClass(), "extId", term344062);
        setField(term344060, term344060.getClass(), "luid", "KthhLZxnKR");
        setIntField(term344077, term344077.getClass(), "year", 2028);
        setShortField(term344077, term344077.getClass(), "month", (short) 6);
        setShortField(term344077, term344077.getClass(), "day", (short) 8);
        setField(term344076, term344076.getClass(), "date", term344077);
        setByteField(term344081, term344081.getClass(), "hour", (byte) 4);
        setByteField(term344081, term344081.getClass(), "minute", (byte) 13);
        setByteField(term344081, term344081.getClass(), "second", (byte) 21);
        setIntField(term344081, term344081.getClass(), "nano", 207650672);
        setField(term344076, term344076.getClass(), "time", term344081);
        setField(term344060, term344060.getClass(), "registerTime", term344076);
        setIntField(term344087, term344087.getClass(), "year", 2027);
        setShortField(term344087, term344087.getClass(), "month", (short) 7);
        setShortField(term344087, term344087.getClass(), "day", (short) 11);
        setField(term344086, term344086.getClass(), "date", term344087);
        setByteField(term344091, term344091.getClass(), "hour", (byte) 21);
        setByteField(term344091, term344091.getClass(), "minute", (byte) 3);
        setByteField(term344091, term344091.getClass(), "second", (byte) 15);
        setIntField(term344091, term344091.getClass(), "nano", 117842790);
        setField(term344086, term344086.getClass(), "time", term344091);
        setField(term344060, term344060.getClass(), "accessTime", term344086);
        setField(term344058, term344058.getClass(), "card", term344060);
        setField(term344058, term344058.getClass(), "userName", "HuHiSyEiwJ");
        setIntField(term344058, term344058.getClass(), "level", 1784639329);
        setIntField(term344058, term344058.getClass(), "reincarnationNum", 2070968891);
        setLongField(term344058, term344058.getClass(), "exp", -1798198932056328294L);
        setLongField(term344058, term344058.getClass(), "point", -3050242045194781713L);
        setLongField(term344058, term344058.getClass(), "totalPoint", 3471726788336671620L);
        setIntField(term344058, term344058.getClass(), "playCount", 241593835);
        setIntField(term344058, term344058.getClass(), "jewelCount", 162829288);
        setIntField(term344058, term344058.getClass(), "totalJewelCount", -578846602);
        setIntField(term344058, term344058.getClass(), "medalCount", -1051859021);
        setIntField(term344058, term344058.getClass(), "playerRating", -1101172077);
        setIntField(term344058, term344058.getClass(), "highestRating", -1833569424);
        setIntField(term344058, term344058.getClass(), "battlePoint", -765924778);
        setIntField(term344058, term344058.getClass(), "bestBattlePoint", 299776681);
        setIntField(term344058, term344058.getClass(), "overDamageBattlePoint", -738216551);
        setBooleanField(term344058, term344058.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term344058, term344058.getClass(), "nameplateId", 1453544604);
        setIntField(term344058, term344058.getClass(), "trophyId", -1290000035);
        setIntField(term344058, term344058.getClass(), "cardId", 1041586235);
        setIntField(term344058, term344058.getClass(), "characterId", 403782338);
        setIntField(term344058, term344058.getClass(), "characterVoiceNo", 567303562);
        setIntField(term344058, term344058.getClass(), "tabSetting", -6943969);
        setIntField(term344058, term344058.getClass(), "tabSortSetting", 1621299412);
        setIntField(term344058, term344058.getClass(), "cardCategorySetting", -1233674949);
        setIntField(term344058, term344058.getClass(), "cardSortSetting", -473089145);
        setIntField(term344058, term344058.getClass(), "rivalScoreCategorySetting", 1927045069);
        setIntField(term344058, term344058.getClass(), "playedTutorialBit", 1342865344);
        setIntField(term344058, term344058.getClass(), "firstTutorialCancelNum", 1182579094);
        setLongField(term344058, term344058.getClass(), "sumTechHighScore", 5292048852670403064L);
        setLongField(term344058, term344058.getClass(), "sumTechBasicHighScore", 4232269814912333695L);
        setLongField(term344058, term344058.getClass(), "sumTechAdvancedHighScore", -9166209257161888185L);
        setLongField(term344058, term344058.getClass(), "sumTechExpertHighScore", 9008443269206503162L);
        setLongField(term344058, term344058.getClass(), "sumTechMasterHighScore", -3057040118713556011L);
        setLongField(term344058, term344058.getClass(), "sumTechLunaticHighScore", 598773955281245149L);
        setLongField(term344058, term344058.getClass(), "sumBattleHighScore", -817643615283454911L);
        setLongField(term344058, term344058.getClass(), "sumBattleBasicHighScore", 4941757876933438446L);
        setLongField(term344058, term344058.getClass(), "sumBattleAdvancedHighScore", 4278004393367778770L);
        setLongField(term344058, term344058.getClass(), "sumBattleExpertHighScore", 5579731081393432693L);
        setLongField(term344058, term344058.getClass(), "sumBattleMasterHighScore", -4266166608165847620L);
        setLongField(term344058, term344058.getClass(), "sumBattleLunaticHighScore", 5074570974385484833L);
        setField(term344058, term344058.getClass(), "eventWatchedDate", "GMGidYubtA");
        setField(term344058, term344058.getClass(), "cmEventWatchedDate", "XMeuWXmVPZ");
        setField(term344058, term344058.getClass(), "firstGameId", "XuuxkOYilK");
        setField(term344058, term344058.getClass(), "firstRomVersion", "tsvfsndxoq");
        setField(term344058, term344058.getClass(), "firstDataVersion", "qIPfYhswjk");
        setField(term344058, term344058.getClass(), "firstPlayDate", "GfLrnDqvDC");
        setField(term344058, term344058.getClass(), "lastGameId", "KyHgoUFRqH");
        setField(term344058, term344058.getClass(), "lastRomVersion", "zkrDTwpwyP");
        setField(term344058, term344058.getClass(), "lastDataVersion", "EzqLuoAErx");
        setField(term344058, term344058.getClass(), "compatibleCmVersion", "gJbghjSWZE");
        setField(term344058, term344058.getClass(), "lastPlayDate", "lgXWUgCLEC");
        setIntField(term344058, term344058.getClass(), "lastPlaceId", 1278779077);
        setField(term344058, term344058.getClass(), "lastPlaceName", "ageKjiNZJF");
        setIntField(term344058, term344058.getClass(), "lastRegionId", -1832264228);
        setField(term344058, term344058.getClass(), "lastRegionName", "pHoVNmTjsq");
        setIntField(term344058, term344058.getClass(), "lastAllNetId", 404180994);
        setField(term344058, term344058.getClass(), "lastClientId", "sEIrFKQEmz");
        setIntField(term344058, term344058.getClass(), "lastUsedDeckId", 688092178);
        setIntField(term344058, term344058.getClass(), "lastPlayMusicLevel", 269040971);
        setIntField(term344058, term344058.getClass(), "lastEmoneyBrand", -1931338777);
        setField(term344056, term344056.getClass(), "user", term344058);
        setIntField(term344056, term344056.getClass(), "optionSet", -274597275);
        setIntField(term344056, term344056.getClass(), "speed", 256646943);
        setIntField(term344056, term344056.getClass(), "mirror", -1191702228);
        setIntField(term344056, term344056.getClass(), "judgeTiming", 1784726740);
        setIntField(term344056, term344056.getClass(), "judgeAdjustment", 1427198160);
        setIntField(term344056, term344056.getClass(), "abort", -893762016);
        setIntField(term344056, term344056.getClass(), "stealthField", -1248606725);
        setIntField(term344056, term344056.getClass(), "tapSound", -607819210);
        setIntField(term344056, term344056.getClass(), "volGuide", 68741854);
        setIntField(term344056, term344056.getClass(), "volAll", 1961222258);
        setIntField(term344056, term344056.getClass(), "volTap", 1545144701);
        setIntField(term344056, term344056.getClass(), "volCrTap", 1163892978);
        setIntField(term344056, term344056.getClass(), "volHold", 1729709998);
        setIntField(term344056, term344056.getClass(), "volSide", 459157676);
        setIntField(term344056, term344056.getClass(), "volFlick", -340610144);
        setIntField(term344056, term344056.getClass(), "volBell", 1484067876);
        setIntField(term344056, term344056.getClass(), "volEnemy", 662681847);
        setIntField(term344056, term344056.getClass(), "volSkill", 1948570664);
        setIntField(term344056, term344056.getClass(), "volDamage", -1166018132);
        setIntField(term344056, term344056.getClass(), "colorField", -1982440893);
        setIntField(term344056, term344056.getClass(), "colorLaneBright", 265382750);
        setIntField(term344056, term344056.getClass(), "colorWallBright", -1957968190);
        setIntField(term344056, term344056.getClass(), "colorLane", -1980882760);
        setIntField(term344056, term344056.getClass(), "colorSide", -1387014014);
        setIntField(term344056, term344056.getClass(), "effectDamage", -1595006965);
        setIntField(term344056, term344056.getClass(), "effectPos", -1349951777);
        setIntField(term344056, term344056.getClass(), "judgeDisp", 30827358);
        setIntField(term344056, term344056.getClass(), "judgePos", 399011961);
        setIntField(term344056, term344056.getClass(), "judgeBreak", 1875667833);
        setIntField(term344056, term344056.getClass(), "judgeHit", 1061258672);
        setIntField(term344056, term344056.getClass(), "platinumBreakDisp", 480771762);
        setIntField(term344056, term344056.getClass(), "judgeCriticalBreak", -40619004);
        setIntField(term344056, term344056.getClass(), "matching", -1833267827);
        setIntField(term344056, term344056.getClass(), "dispPlayerLv", -105664584);
        setIntField(term344056, term344056.getClass(), "dispRating", -1762551185);
        setIntField(term344056, term344056.getClass(), "dispBP", -1951630485);
        setIntField(term344056, term344056.getClass(), "headphone", 1649161962);
        term344358 = new Integer(-2064557685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term344358;
        callMethod(klass, "setDispRating", argTypes, term344056, args);
    }

};


