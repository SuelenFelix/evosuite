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

public class UserPlaylog_getJudgeMiss_78645879741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207130;

    public UserPlaylog_getJudgeMiss_78645879741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term207136 = new Long(3453457027014743006L);
        term207130 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term207132 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term207134 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term207150 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term207151 = newInstance(Class.forName("java.time.LocalDate"));
        Object term207155 = newInstance(Class.forName("java.time.LocalTime"));
        Object term207160 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term207161 = newInstance(Class.forName("java.time.LocalDate"));
        Object term207165 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term207130, term207130.getClass(), "id", 4889444909547333281L);
        setLongField(term207132, term207132.getClass(), "id", 6148474143078264719L);
        setLongField(term207134, term207134.getClass(), "id", 2712208087282077512L);
        setField(term207134, term207134.getClass(), "extId", term207136);
        setField(term207134, term207134.getClass(), "luid", "GDIImTLJuG");
        setIntField(term207151, term207151.getClass(), "year", 2022);
        setShortField(term207151, term207151.getClass(), "month", (short) 9);
        setShortField(term207151, term207151.getClass(), "day", (short) 29);
        setField(term207150, term207150.getClass(), "date", term207151);
        setByteField(term207155, term207155.getClass(), "hour", (byte) 15);
        setByteField(term207155, term207155.getClass(), "minute", (byte) 41);
        setByteField(term207155, term207155.getClass(), "second", (byte) 55);
        setIntField(term207155, term207155.getClass(), "nano", 811723850);
        setField(term207150, term207150.getClass(), "time", term207155);
        setField(term207134, term207134.getClass(), "registerTime", term207150);
        setIntField(term207161, term207161.getClass(), "year", 2017);
        setShortField(term207161, term207161.getClass(), "month", (short) 3);
        setShortField(term207161, term207161.getClass(), "day", (short) 7);
        setField(term207160, term207160.getClass(), "date", term207161);
        setByteField(term207165, term207165.getClass(), "hour", (byte) 17);
        setByteField(term207165, term207165.getClass(), "minute", (byte) 3);
        setByteField(term207165, term207165.getClass(), "second", (byte) 1);
        setIntField(term207165, term207165.getClass(), "nano", 107604440);
        setField(term207160, term207160.getClass(), "time", term207165);
        setField(term207134, term207134.getClass(), "accessTime", term207160);
        setField(term207132, term207132.getClass(), "card", term207134);
        setField(term207132, term207132.getClass(), "userName", "nGAQeiXMym");
        setIntField(term207132, term207132.getClass(), "level", -1589974536);
        setIntField(term207132, term207132.getClass(), "reincarnationNum", -691561016);
        setLongField(term207132, term207132.getClass(), "exp", 8315034850152527320L);
        setLongField(term207132, term207132.getClass(), "point", -7127964345767820035L);
        setLongField(term207132, term207132.getClass(), "totalPoint", 6114671765284809603L);
        setIntField(term207132, term207132.getClass(), "playCount", -75298071);
        setIntField(term207132, term207132.getClass(), "jewelCount", 537381033);
        setIntField(term207132, term207132.getClass(), "totalJewelCount", -1941811470);
        setIntField(term207132, term207132.getClass(), "medalCount", -345897968);
        setIntField(term207132, term207132.getClass(), "playerRating", 2043612680);
        setIntField(term207132, term207132.getClass(), "highestRating", -872188429);
        setIntField(term207132, term207132.getClass(), "battlePoint", 863394391);
        setIntField(term207132, term207132.getClass(), "bestBattlePoint", -1464666900);
        setIntField(term207132, term207132.getClass(), "overDamageBattlePoint", 1514362336);
        setBooleanField(term207132, term207132.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term207132, term207132.getClass(), "nameplateId", -826362969);
        setIntField(term207132, term207132.getClass(), "trophyId", 1062563319);
        setIntField(term207132, term207132.getClass(), "cardId", 515240740);
        setIntField(term207132, term207132.getClass(), "characterId", -1221744120);
        setIntField(term207132, term207132.getClass(), "characterVoiceNo", 1995800837);
        setIntField(term207132, term207132.getClass(), "tabSetting", -59523762);
        setIntField(term207132, term207132.getClass(), "tabSortSetting", 25345151);
        setIntField(term207132, term207132.getClass(), "cardCategorySetting", 651655016);
        setIntField(term207132, term207132.getClass(), "cardSortSetting", -1388448851);
        setIntField(term207132, term207132.getClass(), "rivalScoreCategorySetting", -1565944347);
        setIntField(term207132, term207132.getClass(), "playedTutorialBit", 20706388);
        setIntField(term207132, term207132.getClass(), "firstTutorialCancelNum", 836069699);
        setLongField(term207132, term207132.getClass(), "sumTechHighScore", 8278144582669111639L);
        setLongField(term207132, term207132.getClass(), "sumTechBasicHighScore", -6819575814837205457L);
        setLongField(term207132, term207132.getClass(), "sumTechAdvancedHighScore", -4756184094771954959L);
        setLongField(term207132, term207132.getClass(), "sumTechExpertHighScore", -2536916447339909561L);
        setLongField(term207132, term207132.getClass(), "sumTechMasterHighScore", -9149298064523071739L);
        setLongField(term207132, term207132.getClass(), "sumTechLunaticHighScore", 7663788351354354496L);
        setLongField(term207132, term207132.getClass(), "sumBattleHighScore", -9047174172809338541L);
        setLongField(term207132, term207132.getClass(), "sumBattleBasicHighScore", 271925504540192799L);
        setLongField(term207132, term207132.getClass(), "sumBattleAdvancedHighScore", 1011697063815464519L);
        setLongField(term207132, term207132.getClass(), "sumBattleExpertHighScore", 157713515334695998L);
        setLongField(term207132, term207132.getClass(), "sumBattleMasterHighScore", 5979521899424156506L);
        setLongField(term207132, term207132.getClass(), "sumBattleLunaticHighScore", 4694388902334973006L);
        setField(term207132, term207132.getClass(), "eventWatchedDate", "kUwXxbHTwL");
        setField(term207132, term207132.getClass(), "cmEventWatchedDate", "jyCeUOPFOB");
        setField(term207132, term207132.getClass(), "firstGameId", "ecpmlNmLqr");
        setField(term207132, term207132.getClass(), "firstRomVersion", "VCpvVubRIo");
        setField(term207132, term207132.getClass(), "firstDataVersion", "ktYPRKLpUd");
        setField(term207132, term207132.getClass(), "firstPlayDate", "GduPctsAIe");
        setField(term207132, term207132.getClass(), "lastGameId", "yDJzJsbTrq");
        setField(term207132, term207132.getClass(), "lastRomVersion", "qvcWBAoFhO");
        setField(term207132, term207132.getClass(), "lastDataVersion", "oopBzHkVjN");
        setField(term207132, term207132.getClass(), "compatibleCmVersion", "RlgumahXAP");
        setField(term207132, term207132.getClass(), "lastPlayDate", "ZyrBdfnXeY");
        setIntField(term207132, term207132.getClass(), "lastPlaceId", 1595274836);
        setField(term207132, term207132.getClass(), "lastPlaceName", "bDxxtRkvDR");
        setIntField(term207132, term207132.getClass(), "lastRegionId", 691227128);
        setField(term207132, term207132.getClass(), "lastRegionName", "DXBdXbduQR");
        setIntField(term207132, term207132.getClass(), "lastAllNetId", 1336238944);
        setField(term207132, term207132.getClass(), "lastClientId", "VDhtmUjQiN");
        setIntField(term207132, term207132.getClass(), "lastUsedDeckId", -523694473);
        setIntField(term207132, term207132.getClass(), "lastPlayMusicLevel", 662814388);
        setIntField(term207132, term207132.getClass(), "lastEmoneyBrand", -988634792);
        setField(term207130, term207130.getClass(), "user", term207132);
        setIntField(term207130, term207130.getClass(), "sortNumber", -985800486);
        setIntField(term207130, term207130.getClass(), "placeId", 104926979);
        setField(term207130, term207130.getClass(), "placeName", "WfovQKooYd");
        setField(term207130, term207130.getClass(), "playDate", "rGPyIinCpj");
        setField(term207130, term207130.getClass(), "userPlayDate", "IaOmsLcrtn");
        setIntField(term207130, term207130.getClass(), "musicId", 21442244);
        setIntField(term207130, term207130.getClass(), "level", -644090733);
        setIntField(term207130, term207130.getClass(), "playKind", 1357265093);
        setIntField(term207130, term207130.getClass(), "eventId", -383207990);
        setField(term207130, term207130.getClass(), "eventName", "ORKzUipLcn");
        setIntField(term207130, term207130.getClass(), "eventPoint", 115447081);
        setIntField(term207130, term207130.getClass(), "playedUserId1", -1256761775);
        setIntField(term207130, term207130.getClass(), "playedUserId2", -203447420);
        setIntField(term207130, term207130.getClass(), "playedUserId3", -1006644586);
        setField(term207130, term207130.getClass(), "playedUserName1", "BogHZveAYL");
        setField(term207130, term207130.getClass(), "playedUserName2", "burBurEYAD");
        setField(term207130, term207130.getClass(), "playedUserName3", "EjzJWaQxzV");
        setIntField(term207130, term207130.getClass(), "playedMusicLevel1", -1509130004);
        setIntField(term207130, term207130.getClass(), "playedMusicLevel2", 2130734848);
        setIntField(term207130, term207130.getClass(), "playedMusicLevel3", 1166123699);
        setIntField(term207130, term207130.getClass(), "cardId1", -1457506209);
        setIntField(term207130, term207130.getClass(), "cardId2", -1619288980);
        setIntField(term207130, term207130.getClass(), "cardId3", -1191842125);
        setIntField(term207130, term207130.getClass(), "cardLevel1", 800085811);
        setIntField(term207130, term207130.getClass(), "cardLevel2", -991536181);
        setIntField(term207130, term207130.getClass(), "cardLevel3", 1245758357);
        setIntField(term207130, term207130.getClass(), "cardAttack1", 957593927);
        setIntField(term207130, term207130.getClass(), "cardAttack2", 1947837575);
        setIntField(term207130, term207130.getClass(), "cardAttack3", 1877399032);
        setIntField(term207130, term207130.getClass(), "bossCharaId", -322909871);
        setIntField(term207130, term207130.getClass(), "bossLevel", -1837027129);
        setIntField(term207130, term207130.getClass(), "bossAttribute", 1406186846);
        setIntField(term207130, term207130.getClass(), "clearStatus", -709701767);
        setIntField(term207130, term207130.getClass(), "techScore", 1445634110);
        setIntField(term207130, term207130.getClass(), "techScoreRank", 430916113);
        setIntField(term207130, term207130.getClass(), "battleScore", -62605968);
        setIntField(term207130, term207130.getClass(), "battleScoreRank", 743020447);
        setIntField(term207130, term207130.getClass(), "platinumScore", -227812702);
        setIntField(term207130, term207130.getClass(), "maxCombo", -1688725575);
        setIntField(term207130, term207130.getClass(), "judgeMiss", -821504884);
        setIntField(term207130, term207130.getClass(), "judgeHit", 628485113);
        setIntField(term207130, term207130.getClass(), "judgeBreak", 1121498523);
        setIntField(term207130, term207130.getClass(), "judgeCriticalBreak", 571250476);
        setIntField(term207130, term207130.getClass(), "rateTap", 850454258);
        setIntField(term207130, term207130.getClass(), "rateHold", -1170623459);
        setIntField(term207130, term207130.getClass(), "rateFlick", 1449993114);
        setIntField(term207130, term207130.getClass(), "rateSideTap", -734393320);
        setIntField(term207130, term207130.getClass(), "rateSideHold", -345557283);
        setIntField(term207130, term207130.getClass(), "bellCount", 156448167);
        setIntField(term207130, term207130.getClass(), "totalBellCount", -1594914286);
        setIntField(term207130, term207130.getClass(), "damageCount", -1101748725);
        setIntField(term207130, term207130.getClass(), "overDamage", 1729452900);
        setBooleanField(term207130, term207130.getClass(), "isTechNewRecord", false);
        setBooleanField(term207130, term207130.getClass(), "isBattleNewRecord", true);
        setBooleanField(term207130, term207130.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term207130, term207130.getClass(), "isFullCombo", true);
        setBooleanField(term207130, term207130.getClass(), "isFullBell", true);
        setBooleanField(term207130, term207130.getClass(), "isAllBreak", true);
        setIntField(term207130, term207130.getClass(), "playerRating", 1494418561);
        setIntField(term207130, term207130.getClass(), "battlePoint", 1872045675);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getJudgeMiss", argTypes, term207130, args);
    }

};


