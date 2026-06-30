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

public class UserPlaylog_canEqual_482732919125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260904;
     Object term261306;

    public UserPlaylog_canEqual_482732919125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term260910 = new Long(-9133417318192430290L);
        term260904 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term260906 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term260908 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term260924 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term260925 = newInstance(Class.forName("java.time.LocalDate"));
        Object term260929 = newInstance(Class.forName("java.time.LocalTime"));
        Object term260934 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term260935 = newInstance(Class.forName("java.time.LocalDate"));
        Object term260939 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term260904, term260904.getClass(), "id", -6537192025206220818L);
        setLongField(term260906, term260906.getClass(), "id", -6275459208179396254L);
        setLongField(term260908, term260908.getClass(), "id", 4054437225519191923L);
        setField(term260908, term260908.getClass(), "extId", term260910);
        setField(term260908, term260908.getClass(), "luid", "tEciBFrLbF");
        setIntField(term260925, term260925.getClass(), "year", 2027);
        setShortField(term260925, term260925.getClass(), "month", (short) 7);
        setShortField(term260925, term260925.getClass(), "day", (short) 2);
        setField(term260924, term260924.getClass(), "date", term260925);
        setByteField(term260929, term260929.getClass(), "hour", (byte) 10);
        setByteField(term260929, term260929.getClass(), "minute", (byte) 18);
        setByteField(term260929, term260929.getClass(), "second", (byte) 58);
        setIntField(term260929, term260929.getClass(), "nano", 936854550);
        setField(term260924, term260924.getClass(), "time", term260929);
        setField(term260908, term260908.getClass(), "registerTime", term260924);
        setIntField(term260935, term260935.getClass(), "year", 2027);
        setShortField(term260935, term260935.getClass(), "month", (short) 10);
        setShortField(term260935, term260935.getClass(), "day", (short) 29);
        setField(term260934, term260934.getClass(), "date", term260935);
        setByteField(term260939, term260939.getClass(), "hour", (byte) 13);
        setByteField(term260939, term260939.getClass(), "minute", (byte) 15);
        setByteField(term260939, term260939.getClass(), "second", (byte) 53);
        setIntField(term260939, term260939.getClass(), "nano", 202971857);
        setField(term260934, term260934.getClass(), "time", term260939);
        setField(term260908, term260908.getClass(), "accessTime", term260934);
        setField(term260906, term260906.getClass(), "card", term260908);
        setField(term260906, term260906.getClass(), "userName", "HABvqoZbct");
        setIntField(term260906, term260906.getClass(), "level", 578988160);
        setIntField(term260906, term260906.getClass(), "reincarnationNum", 913597896);
        setLongField(term260906, term260906.getClass(), "exp", 1724768287125313467L);
        setLongField(term260906, term260906.getClass(), "point", -6655078218696757936L);
        setLongField(term260906, term260906.getClass(), "totalPoint", -3669366046389564408L);
        setIntField(term260906, term260906.getClass(), "playCount", -1479510884);
        setIntField(term260906, term260906.getClass(), "jewelCount", -402293884);
        setIntField(term260906, term260906.getClass(), "totalJewelCount", 1232167596);
        setIntField(term260906, term260906.getClass(), "medalCount", 581831203);
        setIntField(term260906, term260906.getClass(), "playerRating", 87525395);
        setIntField(term260906, term260906.getClass(), "highestRating", -415212479);
        setIntField(term260906, term260906.getClass(), "battlePoint", 1307573065);
        setIntField(term260906, term260906.getClass(), "bestBattlePoint", -2137861111);
        setIntField(term260906, term260906.getClass(), "overDamageBattlePoint", 2127797521);
        setBooleanField(term260906, term260906.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term260906, term260906.getClass(), "nameplateId", -2135649917);
        setIntField(term260906, term260906.getClass(), "trophyId", -1474193289);
        setIntField(term260906, term260906.getClass(), "cardId", -170871329);
        setIntField(term260906, term260906.getClass(), "characterId", 291113104);
        setIntField(term260906, term260906.getClass(), "characterVoiceNo", 179432580);
        setIntField(term260906, term260906.getClass(), "tabSetting", -1258204903);
        setIntField(term260906, term260906.getClass(), "tabSortSetting", -1130609679);
        setIntField(term260906, term260906.getClass(), "cardCategorySetting", -1261330598);
        setIntField(term260906, term260906.getClass(), "cardSortSetting", -1047805014);
        setIntField(term260906, term260906.getClass(), "rivalScoreCategorySetting", 1879952127);
        setIntField(term260906, term260906.getClass(), "playedTutorialBit", -486055477);
        setIntField(term260906, term260906.getClass(), "firstTutorialCancelNum", -710673716);
        setLongField(term260906, term260906.getClass(), "sumTechHighScore", 9114853101740999739L);
        setLongField(term260906, term260906.getClass(), "sumTechBasicHighScore", -5169348158002438805L);
        setLongField(term260906, term260906.getClass(), "sumTechAdvancedHighScore", 8765390636999815296L);
        setLongField(term260906, term260906.getClass(), "sumTechExpertHighScore", 4697978949711347326L);
        setLongField(term260906, term260906.getClass(), "sumTechMasterHighScore", 4231954806066351837L);
        setLongField(term260906, term260906.getClass(), "sumTechLunaticHighScore", -69879738358023968L);
        setLongField(term260906, term260906.getClass(), "sumBattleHighScore", -2295044452055159380L);
        setLongField(term260906, term260906.getClass(), "sumBattleBasicHighScore", -8093092425828256529L);
        setLongField(term260906, term260906.getClass(), "sumBattleAdvancedHighScore", -8529589100747561913L);
        setLongField(term260906, term260906.getClass(), "sumBattleExpertHighScore", 4597916988539451862L);
        setLongField(term260906, term260906.getClass(), "sumBattleMasterHighScore", -5238853432038851417L);
        setLongField(term260906, term260906.getClass(), "sumBattleLunaticHighScore", 656660544045525449L);
        setField(term260906, term260906.getClass(), "eventWatchedDate", "CzDfpcxVwI");
        setField(term260906, term260906.getClass(), "cmEventWatchedDate", "sUKfpEKBAS");
        setField(term260906, term260906.getClass(), "firstGameId", "anfAMeVVsC");
        setField(term260906, term260906.getClass(), "firstRomVersion", "GlIWuwNnwL");
        setField(term260906, term260906.getClass(), "firstDataVersion", "HDsXonVTyY");
        setField(term260906, term260906.getClass(), "firstPlayDate", "BusZaRriAA");
        setField(term260906, term260906.getClass(), "lastGameId", "imlbrmsABR");
        setField(term260906, term260906.getClass(), "lastRomVersion", "VozwaeTzwB");
        setField(term260906, term260906.getClass(), "lastDataVersion", "NzhnvXaHzq");
        setField(term260906, term260906.getClass(), "compatibleCmVersion", "JkfLtSQjWq");
        setField(term260906, term260906.getClass(), "lastPlayDate", "JpZUfTkpjW");
        setIntField(term260906, term260906.getClass(), "lastPlaceId", 879448569);
        setField(term260906, term260906.getClass(), "lastPlaceName", "SbMMeUExqe");
        setIntField(term260906, term260906.getClass(), "lastRegionId", 1636702023);
        setField(term260906, term260906.getClass(), "lastRegionName", "CKFhbAWYOu");
        setIntField(term260906, term260906.getClass(), "lastAllNetId", -2138771257);
        setField(term260906, term260906.getClass(), "lastClientId", "cjASmDMJyf");
        setIntField(term260906, term260906.getClass(), "lastUsedDeckId", -1258830372);
        setIntField(term260906, term260906.getClass(), "lastPlayMusicLevel", -459007543);
        setIntField(term260906, term260906.getClass(), "lastEmoneyBrand", 1545433344);
        setField(term260904, term260904.getClass(), "user", term260906);
        setIntField(term260904, term260904.getClass(), "sortNumber", -287288345);
        setIntField(term260904, term260904.getClass(), "placeId", 1777620572);
        setField(term260904, term260904.getClass(), "placeName", "ALbKTRphvX");
        setField(term260904, term260904.getClass(), "playDate", "vWbSXhWaUM");
        setField(term260904, term260904.getClass(), "userPlayDate", "xGZegFGFwp");
        setIntField(term260904, term260904.getClass(), "musicId", -841007432);
        setIntField(term260904, term260904.getClass(), "level", -287194609);
        setIntField(term260904, term260904.getClass(), "playKind", -1593254684);
        setIntField(term260904, term260904.getClass(), "eventId", 13571711);
        setField(term260904, term260904.getClass(), "eventName", "mcyLkkYdqH");
        setIntField(term260904, term260904.getClass(), "eventPoint", 1766722273);
        setIntField(term260904, term260904.getClass(), "playedUserId1", 162206294);
        setIntField(term260904, term260904.getClass(), "playedUserId2", -276924794);
        setIntField(term260904, term260904.getClass(), "playedUserId3", 59212444);
        setField(term260904, term260904.getClass(), "playedUserName1", "NgPHLrUVTl");
        setField(term260904, term260904.getClass(), "playedUserName2", "cGSjeMMyEG");
        setField(term260904, term260904.getClass(), "playedUserName3", "zDxtwCfvRN");
        setIntField(term260904, term260904.getClass(), "playedMusicLevel1", -1268575411);
        setIntField(term260904, term260904.getClass(), "playedMusicLevel2", 1668826386);
        setIntField(term260904, term260904.getClass(), "playedMusicLevel3", 1361977398);
        setIntField(term260904, term260904.getClass(), "cardId1", 188661554);
        setIntField(term260904, term260904.getClass(), "cardId2", -2020298839);
        setIntField(term260904, term260904.getClass(), "cardId3", -1799370620);
        setIntField(term260904, term260904.getClass(), "cardLevel1", -43905327);
        setIntField(term260904, term260904.getClass(), "cardLevel2", -1939600597);
        setIntField(term260904, term260904.getClass(), "cardLevel3", -1029523143);
        setIntField(term260904, term260904.getClass(), "cardAttack1", 1000414163);
        setIntField(term260904, term260904.getClass(), "cardAttack2", -112032066);
        setIntField(term260904, term260904.getClass(), "cardAttack3", 599757412);
        setIntField(term260904, term260904.getClass(), "bossCharaId", 1560593676);
        setIntField(term260904, term260904.getClass(), "bossLevel", -1022472400);
        setIntField(term260904, term260904.getClass(), "bossAttribute", -2027830462);
        setIntField(term260904, term260904.getClass(), "clearStatus", 1123640429);
        setIntField(term260904, term260904.getClass(), "techScore", -1849340559);
        setIntField(term260904, term260904.getClass(), "techScoreRank", -984948165);
        setIntField(term260904, term260904.getClass(), "battleScore", -841056494);
        setIntField(term260904, term260904.getClass(), "battleScoreRank", 1087542157);
        setIntField(term260904, term260904.getClass(), "platinumScore", 694255273);
        setIntField(term260904, term260904.getClass(), "maxCombo", 1611637924);
        setIntField(term260904, term260904.getClass(), "judgeMiss", 936243753);
        setIntField(term260904, term260904.getClass(), "judgeHit", -803028984);
        setIntField(term260904, term260904.getClass(), "judgeBreak", 1233951453);
        setIntField(term260904, term260904.getClass(), "judgeCriticalBreak", -210141931);
        setIntField(term260904, term260904.getClass(), "rateTap", 1459050716);
        setIntField(term260904, term260904.getClass(), "rateHold", -1995664477);
        setIntField(term260904, term260904.getClass(), "rateFlick", 1563502930);
        setIntField(term260904, term260904.getClass(), "rateSideTap", -1763493297);
        setIntField(term260904, term260904.getClass(), "rateSideHold", 1559779370);
        setIntField(term260904, term260904.getClass(), "bellCount", 369095015);
        setIntField(term260904, term260904.getClass(), "totalBellCount", 905536730);
        setIntField(term260904, term260904.getClass(), "damageCount", 1579733651);
        setIntField(term260904, term260904.getClass(), "overDamage", 734712664);
        setBooleanField(term260904, term260904.getClass(), "isTechNewRecord", true);
        setBooleanField(term260904, term260904.getClass(), "isBattleNewRecord", false);
        setBooleanField(term260904, term260904.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term260904, term260904.getClass(), "isFullCombo", false);
        setBooleanField(term260904, term260904.getClass(), "isFullBell", false);
        setBooleanField(term260904, term260904.getClass(), "isAllBreak", true);
        setIntField(term260904, term260904.getClass(), "playerRating", 1380507045);
        setIntField(term260904, term260904.getClass(), "battlePoint", -817128051);
        term261306 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term261306;
        callMethod(klass, "canEqual", argTypes, term260904, args);
    }

};


