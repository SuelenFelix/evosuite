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

public class UserEventMusic_init_14831438760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369055;

    public UserEventMusic_init_14831438760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term369059 = new Long(7717843551775677202L);
        term369055 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term369057 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term369073 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term369074 = newInstance(Class.forName("java.time.LocalDate"));
        Object term369078 = newInstance(Class.forName("java.time.LocalTime"));
        Object term369083 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term369084 = newInstance(Class.forName("java.time.LocalDate"));
        Object term369088 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term369055, term369055.getClass(), "id", -6309611617099608153L);
        setLongField(term369057, term369057.getClass(), "id", -7204159940186837923L);
        setField(term369057, term369057.getClass(), "extId", term369059);
        setField(term369057, term369057.getClass(), "luid", "TXZuokxLTk");
        setIntField(term369074, term369074.getClass(), "year", 2017);
        setShortField(term369074, term369074.getClass(), "month", (short) 4);
        setShortField(term369074, term369074.getClass(), "day", (short) 18);
        setField(term369073, term369073.getClass(), "date", term369074);
        setByteField(term369078, term369078.getClass(), "hour", (byte) 19);
        setByteField(term369078, term369078.getClass(), "minute", (byte) 26);
        setByteField(term369078, term369078.getClass(), "second", (byte) 1);
        setIntField(term369078, term369078.getClass(), "nano", 504673119);
        setField(term369073, term369073.getClass(), "time", term369078);
        setField(term369057, term369057.getClass(), "registerTime", term369073);
        setIntField(term369084, term369084.getClass(), "year", 2018);
        setShortField(term369084, term369084.getClass(), "month", (short) 5);
        setShortField(term369084, term369084.getClass(), "day", (short) 12);
        setField(term369083, term369083.getClass(), "date", term369084);
        setByteField(term369088, term369088.getClass(), "hour", (byte) 3);
        setByteField(term369088, term369088.getClass(), "minute", (byte) 9);
        setByteField(term369088, term369088.getClass(), "second", (byte) 25);
        setIntField(term369088, term369088.getClass(), "nano", 472452160);
        setField(term369083, term369083.getClass(), "time", term369088);
        setField(term369057, term369057.getClass(), "accessTime", term369083);
        setField(term369055, term369055.getClass(), "card", term369057);
        setField(term369055, term369055.getClass(), "userName", "LEFLfiLAFv");
        setIntField(term369055, term369055.getClass(), "level", -1709204563);
        setIntField(term369055, term369055.getClass(), "reincarnationNum", 1547448579);
        setLongField(term369055, term369055.getClass(), "exp", -3264910135098922762L);
        setLongField(term369055, term369055.getClass(), "point", 9175873635381905489L);
        setLongField(term369055, term369055.getClass(), "totalPoint", -5727545728835835216L);
        setIntField(term369055, term369055.getClass(), "playCount", 1913823308);
        setIntField(term369055, term369055.getClass(), "jewelCount", 499330876);
        setIntField(term369055, term369055.getClass(), "totalJewelCount", 70462227);
        setIntField(term369055, term369055.getClass(), "medalCount", -1561514302);
        setIntField(term369055, term369055.getClass(), "playerRating", 1020958494);
        setIntField(term369055, term369055.getClass(), "highestRating", -1660028574);
        setIntField(term369055, term369055.getClass(), "battlePoint", -13495577);
        setIntField(term369055, term369055.getClass(), "bestBattlePoint", 155659747);
        setIntField(term369055, term369055.getClass(), "overDamageBattlePoint", -1883136445);
        setBooleanField(term369055, term369055.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term369055, term369055.getClass(), "nameplateId", 765605377);
        setIntField(term369055, term369055.getClass(), "trophyId", -858905380);
        setIntField(term369055, term369055.getClass(), "cardId", -198333548);
        setIntField(term369055, term369055.getClass(), "characterId", 2057775603);
        setIntField(term369055, term369055.getClass(), "characterVoiceNo", -1053059549);
        setIntField(term369055, term369055.getClass(), "tabSetting", 381926252);
        setIntField(term369055, term369055.getClass(), "tabSortSetting", 1793864245);
        setIntField(term369055, term369055.getClass(), "cardCategorySetting", -275995279);
        setIntField(term369055, term369055.getClass(), "cardSortSetting", -706800099);
        setIntField(term369055, term369055.getClass(), "rivalScoreCategorySetting", 664532272);
        setIntField(term369055, term369055.getClass(), "playedTutorialBit", 1286018073);
        setIntField(term369055, term369055.getClass(), "firstTutorialCancelNum", -267317120);
        setLongField(term369055, term369055.getClass(), "sumTechHighScore", 7421708992872236204L);
        setLongField(term369055, term369055.getClass(), "sumTechBasicHighScore", -2445350404255820025L);
        setLongField(term369055, term369055.getClass(), "sumTechAdvancedHighScore", 3533251633356355967L);
        setLongField(term369055, term369055.getClass(), "sumTechExpertHighScore", 5292537215754418950L);
        setLongField(term369055, term369055.getClass(), "sumTechMasterHighScore", -8397591287687338993L);
        setLongField(term369055, term369055.getClass(), "sumTechLunaticHighScore", 3812919441912798163L);
        setLongField(term369055, term369055.getClass(), "sumBattleHighScore", -6093057907792355403L);
        setLongField(term369055, term369055.getClass(), "sumBattleBasicHighScore", 1200558170759459892L);
        setLongField(term369055, term369055.getClass(), "sumBattleAdvancedHighScore", 4872329060512172294L);
        setLongField(term369055, term369055.getClass(), "sumBattleExpertHighScore", -6144343897419430316L);
        setLongField(term369055, term369055.getClass(), "sumBattleMasterHighScore", -8985825232899789006L);
        setLongField(term369055, term369055.getClass(), "sumBattleLunaticHighScore", -7445396007746746939L);
        setField(term369055, term369055.getClass(), "eventWatchedDate", "vIETkkPDaZ");
        setField(term369055, term369055.getClass(), "cmEventWatchedDate", "jaMaKLMCYJ");
        setField(term369055, term369055.getClass(), "firstGameId", "BxNJlgfDhI");
        setField(term369055, term369055.getClass(), "firstRomVersion", "lESuJcSmHp");
        setField(term369055, term369055.getClass(), "firstDataVersion", "EHAKEUTqoe");
        setField(term369055, term369055.getClass(), "firstPlayDate", "JdQAAqhhGb");
        setField(term369055, term369055.getClass(), "lastGameId", "lYsCOpXlCZ");
        setField(term369055, term369055.getClass(), "lastRomVersion", "eUHsuAcsno");
        setField(term369055, term369055.getClass(), "lastDataVersion", "VldgvcoJMV");
        setField(term369055, term369055.getClass(), "compatibleCmVersion", "UjmZgziCFu");
        setField(term369055, term369055.getClass(), "lastPlayDate", "FNEkriiOEW");
        setIntField(term369055, term369055.getClass(), "lastPlaceId", -1578942477);
        setField(term369055, term369055.getClass(), "lastPlaceName", "sCosTpPuQD");
        setIntField(term369055, term369055.getClass(), "lastRegionId", 34001266);
        setField(term369055, term369055.getClass(), "lastRegionName", "uOCqVOyhiX");
        setIntField(term369055, term369055.getClass(), "lastAllNetId", -405369203);
        setField(term369055, term369055.getClass(), "lastClientId", "UAnvEBYCbj");
        setIntField(term369055, term369055.getClass(), "lastUsedDeckId", 1845788694);
        setIntField(term369055, term369055.getClass(), "lastPlayMusicLevel", -162549766);
        setIntField(term369055, term369055.getClass(), "lastEmoneyBrand", 333578752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term369055;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


