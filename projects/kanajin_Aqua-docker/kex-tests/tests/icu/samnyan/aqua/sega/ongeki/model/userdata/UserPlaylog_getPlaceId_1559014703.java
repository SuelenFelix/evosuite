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

public class UserPlaylog_getPlaceId_1559014703 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183114;

    public UserPlaylog_getPlaceId_1559014703() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term183120 = new Long(6351887424140565471L);
        term183114 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term183116 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term183118 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term183134 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term183135 = newInstance(Class.forName("java.time.LocalDate"));
        Object term183139 = newInstance(Class.forName("java.time.LocalTime"));
        Object term183144 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term183145 = newInstance(Class.forName("java.time.LocalDate"));
        Object term183149 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term183114, term183114.getClass(), "id", -1012017279799552950L);
        setLongField(term183116, term183116.getClass(), "id", -699732253235761101L);
        setLongField(term183118, term183118.getClass(), "id", -7258287095782966034L);
        setField(term183118, term183118.getClass(), "extId", term183120);
        setField(term183118, term183118.getClass(), "luid", "mjbtnEEDoD");
        setIntField(term183135, term183135.getClass(), "year", 2014);
        setShortField(term183135, term183135.getClass(), "month", (short) 2);
        setShortField(term183135, term183135.getClass(), "day", (short) 2);
        setField(term183134, term183134.getClass(), "date", term183135);
        setByteField(term183139, term183139.getClass(), "hour", (byte) 17);
        setByteField(term183139, term183139.getClass(), "minute", (byte) 45);
        setByteField(term183139, term183139.getClass(), "second", (byte) 37);
        setIntField(term183139, term183139.getClass(), "nano", 147840174);
        setField(term183134, term183134.getClass(), "time", term183139);
        setField(term183118, term183118.getClass(), "registerTime", term183134);
        setIntField(term183145, term183145.getClass(), "year", 2023);
        setShortField(term183145, term183145.getClass(), "month", (short) 4);
        setShortField(term183145, term183145.getClass(), "day", (short) 27);
        setField(term183144, term183144.getClass(), "date", term183145);
        setByteField(term183149, term183149.getClass(), "hour", (byte) 11);
        setByteField(term183149, term183149.getClass(), "minute", (byte) 41);
        setByteField(term183149, term183149.getClass(), "second", (byte) 10);
        setIntField(term183149, term183149.getClass(), "nano", 59265345);
        setField(term183144, term183144.getClass(), "time", term183149);
        setField(term183118, term183118.getClass(), "accessTime", term183144);
        setField(term183116, term183116.getClass(), "card", term183118);
        setField(term183116, term183116.getClass(), "userName", "HkXhPRkQYt");
        setIntField(term183116, term183116.getClass(), "level", -1106115182);
        setIntField(term183116, term183116.getClass(), "reincarnationNum", -458386380);
        setLongField(term183116, term183116.getClass(), "exp", 95126305293354093L);
        setLongField(term183116, term183116.getClass(), "point", -2836116440995051104L);
        setLongField(term183116, term183116.getClass(), "totalPoint", 3052424490591601427L);
        setIntField(term183116, term183116.getClass(), "playCount", 1308196386);
        setIntField(term183116, term183116.getClass(), "jewelCount", -665856594);
        setIntField(term183116, term183116.getClass(), "totalJewelCount", -264177336);
        setIntField(term183116, term183116.getClass(), "medalCount", -551046122);
        setIntField(term183116, term183116.getClass(), "playerRating", 995079464);
        setIntField(term183116, term183116.getClass(), "highestRating", 508145632);
        setIntField(term183116, term183116.getClass(), "battlePoint", -621730714);
        setIntField(term183116, term183116.getClass(), "bestBattlePoint", 873704930);
        setIntField(term183116, term183116.getClass(), "overDamageBattlePoint", 464294440);
        setBooleanField(term183116, term183116.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term183116, term183116.getClass(), "nameplateId", 479268542);
        setIntField(term183116, term183116.getClass(), "trophyId", 299614177);
        setIntField(term183116, term183116.getClass(), "cardId", -1770093697);
        setIntField(term183116, term183116.getClass(), "characterId", 1949793607);
        setIntField(term183116, term183116.getClass(), "characterVoiceNo", 471219108);
        setIntField(term183116, term183116.getClass(), "tabSetting", 1357739280);
        setIntField(term183116, term183116.getClass(), "tabSortSetting", 476534314);
        setIntField(term183116, term183116.getClass(), "cardCategorySetting", -2090021514);
        setIntField(term183116, term183116.getClass(), "cardSortSetting", 558476898);
        setIntField(term183116, term183116.getClass(), "rivalScoreCategorySetting", -757802609);
        setIntField(term183116, term183116.getClass(), "playedTutorialBit", 183041671);
        setIntField(term183116, term183116.getClass(), "firstTutorialCancelNum", 400916727);
        setLongField(term183116, term183116.getClass(), "sumTechHighScore", 2826450205224042980L);
        setLongField(term183116, term183116.getClass(), "sumTechBasicHighScore", -5867652514921287694L);
        setLongField(term183116, term183116.getClass(), "sumTechAdvancedHighScore", -3892209833459216794L);
        setLongField(term183116, term183116.getClass(), "sumTechExpertHighScore", 6647398985586664971L);
        setLongField(term183116, term183116.getClass(), "sumTechMasterHighScore", -8292559159601562342L);
        setLongField(term183116, term183116.getClass(), "sumTechLunaticHighScore", -2497823560091110830L);
        setLongField(term183116, term183116.getClass(), "sumBattleHighScore", 8266352916277191587L);
        setLongField(term183116, term183116.getClass(), "sumBattleBasicHighScore", 3379680155855476403L);
        setLongField(term183116, term183116.getClass(), "sumBattleAdvancedHighScore", -5310978420460518408L);
        setLongField(term183116, term183116.getClass(), "sumBattleExpertHighScore", 4031153279089654101L);
        setLongField(term183116, term183116.getClass(), "sumBattleMasterHighScore", 582346301604665157L);
        setLongField(term183116, term183116.getClass(), "sumBattleLunaticHighScore", -6949644321844804575L);
        setField(term183116, term183116.getClass(), "eventWatchedDate", "tLRwmbFiCA");
        setField(term183116, term183116.getClass(), "cmEventWatchedDate", "VASBLRBXui");
        setField(term183116, term183116.getClass(), "firstGameId", "stiYhZjwjf");
        setField(term183116, term183116.getClass(), "firstRomVersion", "eNhTkzISMP");
        setField(term183116, term183116.getClass(), "firstDataVersion", "TOoaOPcTTB");
        setField(term183116, term183116.getClass(), "firstPlayDate", "fdqPCobvDf");
        setField(term183116, term183116.getClass(), "lastGameId", "aMrnCqYOLU");
        setField(term183116, term183116.getClass(), "lastRomVersion", "fSOctzogBY");
        setField(term183116, term183116.getClass(), "lastDataVersion", "cojTpOoPwh");
        setField(term183116, term183116.getClass(), "compatibleCmVersion", "TqvrCFAemP");
        setField(term183116, term183116.getClass(), "lastPlayDate", "AtdDQMGypF");
        setIntField(term183116, term183116.getClass(), "lastPlaceId", 1620850038);
        setField(term183116, term183116.getClass(), "lastPlaceName", "YoEDjIKVgq");
        setIntField(term183116, term183116.getClass(), "lastRegionId", 933381477);
        setField(term183116, term183116.getClass(), "lastRegionName", "KVseWvBXXQ");
        setIntField(term183116, term183116.getClass(), "lastAllNetId", 1138528761);
        setField(term183116, term183116.getClass(), "lastClientId", "xdaMoiPzcT");
        setIntField(term183116, term183116.getClass(), "lastUsedDeckId", 63142432);
        setIntField(term183116, term183116.getClass(), "lastPlayMusicLevel", -1629688452);
        setIntField(term183116, term183116.getClass(), "lastEmoneyBrand", -1341364375);
        setField(term183114, term183114.getClass(), "user", term183116);
        setIntField(term183114, term183114.getClass(), "sortNumber", -745641678);
        setIntField(term183114, term183114.getClass(), "placeId", 2132690014);
        setField(term183114, term183114.getClass(), "placeName", "cNgzDmCExR");
        setField(term183114, term183114.getClass(), "playDate", "OVIRthBBTP");
        setField(term183114, term183114.getClass(), "userPlayDate", "PMNZjFOSxe");
        setIntField(term183114, term183114.getClass(), "musicId", -365249563);
        setIntField(term183114, term183114.getClass(), "level", 1295989729);
        setIntField(term183114, term183114.getClass(), "playKind", 1956936717);
        setIntField(term183114, term183114.getClass(), "eventId", -955734660);
        setField(term183114, term183114.getClass(), "eventName", "RunVMgFFZo");
        setIntField(term183114, term183114.getClass(), "eventPoint", 852902119);
        setIntField(term183114, term183114.getClass(), "playedUserId1", -1152300693);
        setIntField(term183114, term183114.getClass(), "playedUserId2", 586032794);
        setIntField(term183114, term183114.getClass(), "playedUserId3", 1367834405);
        setField(term183114, term183114.getClass(), "playedUserName1", "WFOAbiqZtY");
        setField(term183114, term183114.getClass(), "playedUserName2", "fDdzXpgVRo");
        setField(term183114, term183114.getClass(), "playedUserName3", "FHYonZSkfn");
        setIntField(term183114, term183114.getClass(), "playedMusicLevel1", -1758694220);
        setIntField(term183114, term183114.getClass(), "playedMusicLevel2", -1747630048);
        setIntField(term183114, term183114.getClass(), "playedMusicLevel3", 549628794);
        setIntField(term183114, term183114.getClass(), "cardId1", -44645209);
        setIntField(term183114, term183114.getClass(), "cardId2", 946955246);
        setIntField(term183114, term183114.getClass(), "cardId3", -1262709003);
        setIntField(term183114, term183114.getClass(), "cardLevel1", -686487699);
        setIntField(term183114, term183114.getClass(), "cardLevel2", -1360951047);
        setIntField(term183114, term183114.getClass(), "cardLevel3", 1349893977);
        setIntField(term183114, term183114.getClass(), "cardAttack1", 1008804709);
        setIntField(term183114, term183114.getClass(), "cardAttack2", 1001974313);
        setIntField(term183114, term183114.getClass(), "cardAttack3", 245262590);
        setIntField(term183114, term183114.getClass(), "bossCharaId", 891892433);
        setIntField(term183114, term183114.getClass(), "bossLevel", 164865868);
        setIntField(term183114, term183114.getClass(), "bossAttribute", -2067928979);
        setIntField(term183114, term183114.getClass(), "clearStatus", 1481758219);
        setIntField(term183114, term183114.getClass(), "techScore", 1349957503);
        setIntField(term183114, term183114.getClass(), "techScoreRank", 99967254);
        setIntField(term183114, term183114.getClass(), "battleScore", -796705964);
        setIntField(term183114, term183114.getClass(), "battleScoreRank", -489945946);
        setIntField(term183114, term183114.getClass(), "platinumScore", -1521003193);
        setIntField(term183114, term183114.getClass(), "maxCombo", -1766675944);
        setIntField(term183114, term183114.getClass(), "judgeMiss", -1854430994);
        setIntField(term183114, term183114.getClass(), "judgeHit", -992967791);
        setIntField(term183114, term183114.getClass(), "judgeBreak", -942995580);
        setIntField(term183114, term183114.getClass(), "judgeCriticalBreak", -1062858947);
        setIntField(term183114, term183114.getClass(), "rateTap", 1335767564);
        setIntField(term183114, term183114.getClass(), "rateHold", -1976451322);
        setIntField(term183114, term183114.getClass(), "rateFlick", -1406224137);
        setIntField(term183114, term183114.getClass(), "rateSideTap", -1950232603);
        setIntField(term183114, term183114.getClass(), "rateSideHold", 438976859);
        setIntField(term183114, term183114.getClass(), "bellCount", -1677003709);
        setIntField(term183114, term183114.getClass(), "totalBellCount", 241273595);
        setIntField(term183114, term183114.getClass(), "damageCount", 672655113);
        setIntField(term183114, term183114.getClass(), "overDamage", -1911449677);
        setBooleanField(term183114, term183114.getClass(), "isTechNewRecord", true);
        setBooleanField(term183114, term183114.getClass(), "isBattleNewRecord", true);
        setBooleanField(term183114, term183114.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term183114, term183114.getClass(), "isFullCombo", false);
        setBooleanField(term183114, term183114.getClass(), "isFullBell", true);
        setBooleanField(term183114, term183114.getClass(), "isAllBreak", true);
        setIntField(term183114, term183114.getClass(), "playerRating", -458794680);
        setIntField(term183114, term183114.getClass(), "battlePoint", -1986339842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlaceId", argTypes, term183114, args);
    }

};


