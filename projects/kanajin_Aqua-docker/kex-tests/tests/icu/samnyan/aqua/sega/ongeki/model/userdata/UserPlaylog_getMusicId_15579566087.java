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

public class UserPlaylog_getMusicId_15579566087 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185642;

    public UserPlaylog_getMusicId_15579566087() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term185648 = new Long(-421166328269063791L);
        term185642 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term185644 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term185646 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term185662 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term185663 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185667 = newInstance(Class.forName("java.time.LocalTime"));
        Object term185672 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term185673 = newInstance(Class.forName("java.time.LocalDate"));
        Object term185677 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term185642, term185642.getClass(), "id", 8086775999426177339L);
        setLongField(term185644, term185644.getClass(), "id", -7350170920841451487L);
        setLongField(term185646, term185646.getClass(), "id", 2653221362782722700L);
        setField(term185646, term185646.getClass(), "extId", term185648);
        setField(term185646, term185646.getClass(), "luid", "FsCSDmxBwU");
        setIntField(term185663, term185663.getClass(), "year", 2028);
        setShortField(term185663, term185663.getClass(), "month", (short) 3);
        setShortField(term185663, term185663.getClass(), "day", (short) 23);
        setField(term185662, term185662.getClass(), "date", term185663);
        setByteField(term185667, term185667.getClass(), "hour", (byte) 18);
        setByteField(term185667, term185667.getClass(), "minute", (byte) 27);
        setByteField(term185667, term185667.getClass(), "second", (byte) 54);
        setIntField(term185667, term185667.getClass(), "nano", 421491474);
        setField(term185662, term185662.getClass(), "time", term185667);
        setField(term185646, term185646.getClass(), "registerTime", term185662);
        setIntField(term185673, term185673.getClass(), "year", 2025);
        setShortField(term185673, term185673.getClass(), "month", (short) 9);
        setShortField(term185673, term185673.getClass(), "day", (short) 18);
        setField(term185672, term185672.getClass(), "date", term185673);
        setByteField(term185677, term185677.getClass(), "hour", (byte) 13);
        setByteField(term185677, term185677.getClass(), "minute", (byte) 47);
        setByteField(term185677, term185677.getClass(), "second", (byte) 29);
        setIntField(term185677, term185677.getClass(), "nano", 832215473);
        setField(term185672, term185672.getClass(), "time", term185677);
        setField(term185646, term185646.getClass(), "accessTime", term185672);
        setField(term185644, term185644.getClass(), "card", term185646);
        setField(term185644, term185644.getClass(), "userName", "YRfCNvIQfM");
        setIntField(term185644, term185644.getClass(), "level", 1656688930);
        setIntField(term185644, term185644.getClass(), "reincarnationNum", -1343439629);
        setLongField(term185644, term185644.getClass(), "exp", 6652481091992514132L);
        setLongField(term185644, term185644.getClass(), "point", 4242596542523572996L);
        setLongField(term185644, term185644.getClass(), "totalPoint", -1690749449533511258L);
        setIntField(term185644, term185644.getClass(), "playCount", -1203456842);
        setIntField(term185644, term185644.getClass(), "jewelCount", -638750860);
        setIntField(term185644, term185644.getClass(), "totalJewelCount", -1167375980);
        setIntField(term185644, term185644.getClass(), "medalCount", 577436768);
        setIntField(term185644, term185644.getClass(), "playerRating", 555961091);
        setIntField(term185644, term185644.getClass(), "highestRating", -703576578);
        setIntField(term185644, term185644.getClass(), "battlePoint", 206793849);
        setIntField(term185644, term185644.getClass(), "bestBattlePoint", 1243580461);
        setIntField(term185644, term185644.getClass(), "overDamageBattlePoint", 198372440);
        setBooleanField(term185644, term185644.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term185644, term185644.getClass(), "nameplateId", -1531562967);
        setIntField(term185644, term185644.getClass(), "trophyId", -1471282377);
        setIntField(term185644, term185644.getClass(), "cardId", -146555590);
        setIntField(term185644, term185644.getClass(), "characterId", 1355523589);
        setIntField(term185644, term185644.getClass(), "characterVoiceNo", 170817693);
        setIntField(term185644, term185644.getClass(), "tabSetting", -923853879);
        setIntField(term185644, term185644.getClass(), "tabSortSetting", 419328039);
        setIntField(term185644, term185644.getClass(), "cardCategorySetting", 76790742);
        setIntField(term185644, term185644.getClass(), "cardSortSetting", 1540630124);
        setIntField(term185644, term185644.getClass(), "rivalScoreCategorySetting", -1537736801);
        setIntField(term185644, term185644.getClass(), "playedTutorialBit", -766206861);
        setIntField(term185644, term185644.getClass(), "firstTutorialCancelNum", 1576414103);
        setLongField(term185644, term185644.getClass(), "sumTechHighScore", -5250062924107433697L);
        setLongField(term185644, term185644.getClass(), "sumTechBasicHighScore", 635644609290288134L);
        setLongField(term185644, term185644.getClass(), "sumTechAdvancedHighScore", -5274409301562307821L);
        setLongField(term185644, term185644.getClass(), "sumTechExpertHighScore", 5110037979366866852L);
        setLongField(term185644, term185644.getClass(), "sumTechMasterHighScore", -8966055938077762580L);
        setLongField(term185644, term185644.getClass(), "sumTechLunaticHighScore", -8363385849514417481L);
        setLongField(term185644, term185644.getClass(), "sumBattleHighScore", -9100238855755190537L);
        setLongField(term185644, term185644.getClass(), "sumBattleBasicHighScore", -5901098675314427014L);
        setLongField(term185644, term185644.getClass(), "sumBattleAdvancedHighScore", 6591121743024407908L);
        setLongField(term185644, term185644.getClass(), "sumBattleExpertHighScore", 5289337114081695862L);
        setLongField(term185644, term185644.getClass(), "sumBattleMasterHighScore", -3554506527130308058L);
        setLongField(term185644, term185644.getClass(), "sumBattleLunaticHighScore", 3843626765557027078L);
        setField(term185644, term185644.getClass(), "eventWatchedDate", "aUnLleyfFN");
        setField(term185644, term185644.getClass(), "cmEventWatchedDate", "JziPmKdWww");
        setField(term185644, term185644.getClass(), "firstGameId", "LRKdNCNmMV");
        setField(term185644, term185644.getClass(), "firstRomVersion", "thQPqqRGQK");
        setField(term185644, term185644.getClass(), "firstDataVersion", "KQIDeMauIM");
        setField(term185644, term185644.getClass(), "firstPlayDate", "NgKByYqhhT");
        setField(term185644, term185644.getClass(), "lastGameId", "yLsafyiJlf");
        setField(term185644, term185644.getClass(), "lastRomVersion", "NawBhAzbKl");
        setField(term185644, term185644.getClass(), "lastDataVersion", "ShkfzZambR");
        setField(term185644, term185644.getClass(), "compatibleCmVersion", "IwyNKjdOyh");
        setField(term185644, term185644.getClass(), "lastPlayDate", "PSpaEkziKZ");
        setIntField(term185644, term185644.getClass(), "lastPlaceId", 891075650);
        setField(term185644, term185644.getClass(), "lastPlaceName", "aiShGYDMDb");
        setIntField(term185644, term185644.getClass(), "lastRegionId", 456541378);
        setField(term185644, term185644.getClass(), "lastRegionName", "GAKArYpkPT");
        setIntField(term185644, term185644.getClass(), "lastAllNetId", -1836224314);
        setField(term185644, term185644.getClass(), "lastClientId", "zIHDwkFWvV");
        setIntField(term185644, term185644.getClass(), "lastUsedDeckId", 824141018);
        setIntField(term185644, term185644.getClass(), "lastPlayMusicLevel", 278690523);
        setIntField(term185644, term185644.getClass(), "lastEmoneyBrand", 272160059);
        setField(term185642, term185642.getClass(), "user", term185644);
        setIntField(term185642, term185642.getClass(), "sortNumber", -19247990);
        setIntField(term185642, term185642.getClass(), "placeId", 1986476279);
        setField(term185642, term185642.getClass(), "placeName", "KdiIcRqDFX");
        setField(term185642, term185642.getClass(), "playDate", "ZaJQogOfKZ");
        setField(term185642, term185642.getClass(), "userPlayDate", "OiUMzYeuet");
        setIntField(term185642, term185642.getClass(), "musicId", -715837772);
        setIntField(term185642, term185642.getClass(), "level", 1707313333);
        setIntField(term185642, term185642.getClass(), "playKind", 789086911);
        setIntField(term185642, term185642.getClass(), "eventId", 1249593171);
        setField(term185642, term185642.getClass(), "eventName", "ESBgigMjFA");
        setIntField(term185642, term185642.getClass(), "eventPoint", -860135164);
        setIntField(term185642, term185642.getClass(), "playedUserId1", 554710113);
        setIntField(term185642, term185642.getClass(), "playedUserId2", -1257507313);
        setIntField(term185642, term185642.getClass(), "playedUserId3", -418551323);
        setField(term185642, term185642.getClass(), "playedUserName1", "rdAMzcSTeH");
        setField(term185642, term185642.getClass(), "playedUserName2", "GhNJNopkXp");
        setField(term185642, term185642.getClass(), "playedUserName3", "BuDMkCZWXA");
        setIntField(term185642, term185642.getClass(), "playedMusicLevel1", -1138154515);
        setIntField(term185642, term185642.getClass(), "playedMusicLevel2", -1149872871);
        setIntField(term185642, term185642.getClass(), "playedMusicLevel3", -1399922144);
        setIntField(term185642, term185642.getClass(), "cardId1", -480385546);
        setIntField(term185642, term185642.getClass(), "cardId2", 1949625839);
        setIntField(term185642, term185642.getClass(), "cardId3", 444643271);
        setIntField(term185642, term185642.getClass(), "cardLevel1", -979081687);
        setIntField(term185642, term185642.getClass(), "cardLevel2", 1127310631);
        setIntField(term185642, term185642.getClass(), "cardLevel3", 886454428);
        setIntField(term185642, term185642.getClass(), "cardAttack1", -2146778104);
        setIntField(term185642, term185642.getClass(), "cardAttack2", -645880633);
        setIntField(term185642, term185642.getClass(), "cardAttack3", 1698626232);
        setIntField(term185642, term185642.getClass(), "bossCharaId", -576137583);
        setIntField(term185642, term185642.getClass(), "bossLevel", 1796558091);
        setIntField(term185642, term185642.getClass(), "bossAttribute", 586321169);
        setIntField(term185642, term185642.getClass(), "clearStatus", 807581958);
        setIntField(term185642, term185642.getClass(), "techScore", 1362834596);
        setIntField(term185642, term185642.getClass(), "techScoreRank", 1654459583);
        setIntField(term185642, term185642.getClass(), "battleScore", 193503465);
        setIntField(term185642, term185642.getClass(), "battleScoreRank", 581278549);
        setIntField(term185642, term185642.getClass(), "platinumScore", 2019752538);
        setIntField(term185642, term185642.getClass(), "maxCombo", -340054739);
        setIntField(term185642, term185642.getClass(), "judgeMiss", -1827976043);
        setIntField(term185642, term185642.getClass(), "judgeHit", 1643366352);
        setIntField(term185642, term185642.getClass(), "judgeBreak", 1649851803);
        setIntField(term185642, term185642.getClass(), "judgeCriticalBreak", 234521633);
        setIntField(term185642, term185642.getClass(), "rateTap", 1854710669);
        setIntField(term185642, term185642.getClass(), "rateHold", 40267213);
        setIntField(term185642, term185642.getClass(), "rateFlick", 2130886056);
        setIntField(term185642, term185642.getClass(), "rateSideTap", 978478352);
        setIntField(term185642, term185642.getClass(), "rateSideHold", -269052266);
        setIntField(term185642, term185642.getClass(), "bellCount", -1776892844);
        setIntField(term185642, term185642.getClass(), "totalBellCount", 2113526092);
        setIntField(term185642, term185642.getClass(), "damageCount", -991810251);
        setIntField(term185642, term185642.getClass(), "overDamage", -1006766321);
        setBooleanField(term185642, term185642.getClass(), "isTechNewRecord", false);
        setBooleanField(term185642, term185642.getClass(), "isBattleNewRecord", false);
        setBooleanField(term185642, term185642.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term185642, term185642.getClass(), "isFullCombo", true);
        setBooleanField(term185642, term185642.getClass(), "isFullBell", false);
        setBooleanField(term185642, term185642.getClass(), "isAllBreak", false);
        setIntField(term185642, term185642.getClass(), "playerRating", 1271131361);
        setIntField(term185642, term185642.getClass(), "battlePoint", 79901777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term185642, args);
    }

};


