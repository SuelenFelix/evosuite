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

public class UserPlaylog_getPlayedUserName3_202131780718 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192594;

    public UserPlaylog_getPlayedUserName3_202131780718() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term192600 = new Long(6077991958696417121L);
        term192594 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term192596 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term192598 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term192614 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term192615 = newInstance(Class.forName("java.time.LocalDate"));
        Object term192619 = newInstance(Class.forName("java.time.LocalTime"));
        Object term192624 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term192625 = newInstance(Class.forName("java.time.LocalDate"));
        Object term192629 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term192594, term192594.getClass(), "id", -1907847047451777366L);
        setLongField(term192596, term192596.getClass(), "id", -8684145874664265954L);
        setLongField(term192598, term192598.getClass(), "id", 6184486464044924915L);
        setField(term192598, term192598.getClass(), "extId", term192600);
        setField(term192598, term192598.getClass(), "luid", "baBRmilHAC");
        setIntField(term192615, term192615.getClass(), "year", 2015);
        setShortField(term192615, term192615.getClass(), "month", (short) 1);
        setShortField(term192615, term192615.getClass(), "day", (short) 28);
        setField(term192614, term192614.getClass(), "date", term192615);
        setByteField(term192619, term192619.getClass(), "hour", (byte) 19);
        setByteField(term192619, term192619.getClass(), "minute", (byte) 25);
        setByteField(term192619, term192619.getClass(), "second", (byte) 21);
        setIntField(term192619, term192619.getClass(), "nano", 419809555);
        setField(term192614, term192614.getClass(), "time", term192619);
        setField(term192598, term192598.getClass(), "registerTime", term192614);
        setIntField(term192625, term192625.getClass(), "year", 2016);
        setShortField(term192625, term192625.getClass(), "month", (short) 3);
        setShortField(term192625, term192625.getClass(), "day", (short) 9);
        setField(term192624, term192624.getClass(), "date", term192625);
        setByteField(term192629, term192629.getClass(), "hour", (byte) 14);
        setByteField(term192629, term192629.getClass(), "minute", (byte) 25);
        setByteField(term192629, term192629.getClass(), "second", (byte) 3);
        setIntField(term192629, term192629.getClass(), "nano", 268186564);
        setField(term192624, term192624.getClass(), "time", term192629);
        setField(term192598, term192598.getClass(), "accessTime", term192624);
        setField(term192596, term192596.getClass(), "card", term192598);
        setField(term192596, term192596.getClass(), "userName", "nQDlUMxGwc");
        setIntField(term192596, term192596.getClass(), "level", -1429612486);
        setIntField(term192596, term192596.getClass(), "reincarnationNum", 1146772422);
        setLongField(term192596, term192596.getClass(), "exp", 118121846535536532L);
        setLongField(term192596, term192596.getClass(), "point", 5879904684522357083L);
        setLongField(term192596, term192596.getClass(), "totalPoint", -5691889245806551277L);
        setIntField(term192596, term192596.getClass(), "playCount", -1467365561);
        setIntField(term192596, term192596.getClass(), "jewelCount", -239583367);
        setIntField(term192596, term192596.getClass(), "totalJewelCount", -2114583072);
        setIntField(term192596, term192596.getClass(), "medalCount", -991738527);
        setIntField(term192596, term192596.getClass(), "playerRating", -863658575);
        setIntField(term192596, term192596.getClass(), "highestRating", 944252822);
        setIntField(term192596, term192596.getClass(), "battlePoint", -767773428);
        setIntField(term192596, term192596.getClass(), "bestBattlePoint", -802951772);
        setIntField(term192596, term192596.getClass(), "overDamageBattlePoint", 1865162800);
        setBooleanField(term192596, term192596.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term192596, term192596.getClass(), "nameplateId", -840346352);
        setIntField(term192596, term192596.getClass(), "trophyId", -622009558);
        setIntField(term192596, term192596.getClass(), "cardId", 1002040727);
        setIntField(term192596, term192596.getClass(), "characterId", 1043794213);
        setIntField(term192596, term192596.getClass(), "characterVoiceNo", 668553213);
        setIntField(term192596, term192596.getClass(), "tabSetting", 845497440);
        setIntField(term192596, term192596.getClass(), "tabSortSetting", -929142950);
        setIntField(term192596, term192596.getClass(), "cardCategorySetting", -481484241);
        setIntField(term192596, term192596.getClass(), "cardSortSetting", 28563533);
        setIntField(term192596, term192596.getClass(), "rivalScoreCategorySetting", -353349462);
        setIntField(term192596, term192596.getClass(), "playedTutorialBit", -573180293);
        setIntField(term192596, term192596.getClass(), "firstTutorialCancelNum", -129560588);
        setLongField(term192596, term192596.getClass(), "sumTechHighScore", -6512389011040053178L);
        setLongField(term192596, term192596.getClass(), "sumTechBasicHighScore", 2334977869221007279L);
        setLongField(term192596, term192596.getClass(), "sumTechAdvancedHighScore", -2975258849885931140L);
        setLongField(term192596, term192596.getClass(), "sumTechExpertHighScore", -6003717814161098421L);
        setLongField(term192596, term192596.getClass(), "sumTechMasterHighScore", -3020253339404333814L);
        setLongField(term192596, term192596.getClass(), "sumTechLunaticHighScore", -6839370691097851368L);
        setLongField(term192596, term192596.getClass(), "sumBattleHighScore", 2413473793515484262L);
        setLongField(term192596, term192596.getClass(), "sumBattleBasicHighScore", 3186712876103459676L);
        setLongField(term192596, term192596.getClass(), "sumBattleAdvancedHighScore", 2148631260120813269L);
        setLongField(term192596, term192596.getClass(), "sumBattleExpertHighScore", 1440382768463203956L);
        setLongField(term192596, term192596.getClass(), "sumBattleMasterHighScore", -9211601132420767727L);
        setLongField(term192596, term192596.getClass(), "sumBattleLunaticHighScore", 3544417781644525084L);
        setField(term192596, term192596.getClass(), "eventWatchedDate", "adgVBSiHOd");
        setField(term192596, term192596.getClass(), "cmEventWatchedDate", "SSEKRIzBwD");
        setField(term192596, term192596.getClass(), "firstGameId", "iSuupCvDam");
        setField(term192596, term192596.getClass(), "firstRomVersion", "zPtmrCAbir");
        setField(term192596, term192596.getClass(), "firstDataVersion", "FaTbxTPeSR");
        setField(term192596, term192596.getClass(), "firstPlayDate", "HKRRRQtvMb");
        setField(term192596, term192596.getClass(), "lastGameId", "wuZEtbkYrI");
        setField(term192596, term192596.getClass(), "lastRomVersion", "gElIMGFvDS");
        setField(term192596, term192596.getClass(), "lastDataVersion", "oIvcBKuKqH");
        setField(term192596, term192596.getClass(), "compatibleCmVersion", "yDkikWBBIM");
        setField(term192596, term192596.getClass(), "lastPlayDate", "xLTcGnxYWE");
        setIntField(term192596, term192596.getClass(), "lastPlaceId", -25182144);
        setField(term192596, term192596.getClass(), "lastPlaceName", "hmYaQPeKbh");
        setIntField(term192596, term192596.getClass(), "lastRegionId", -1401847995);
        setField(term192596, term192596.getClass(), "lastRegionName", "VrqXOdDIyj");
        setIntField(term192596, term192596.getClass(), "lastAllNetId", -1832988281);
        setField(term192596, term192596.getClass(), "lastClientId", "WNySrtxINV");
        setIntField(term192596, term192596.getClass(), "lastUsedDeckId", -384920032);
        setIntField(term192596, term192596.getClass(), "lastPlayMusicLevel", -1752532456);
        setIntField(term192596, term192596.getClass(), "lastEmoneyBrand", 1663063121);
        setField(term192594, term192594.getClass(), "user", term192596);
        setIntField(term192594, term192594.getClass(), "sortNumber", -299437853);
        setIntField(term192594, term192594.getClass(), "placeId", 1516214189);
        setField(term192594, term192594.getClass(), "placeName", "OfmZCJNUTR");
        setField(term192594, term192594.getClass(), "playDate", "LjwtsxSxqY");
        setField(term192594, term192594.getClass(), "userPlayDate", "jhEIZGcFpp");
        setIntField(term192594, term192594.getClass(), "musicId", 2038582544);
        setIntField(term192594, term192594.getClass(), "level", -667671375);
        setIntField(term192594, term192594.getClass(), "playKind", -2019733796);
        setIntField(term192594, term192594.getClass(), "eventId", 1130518373);
        setField(term192594, term192594.getClass(), "eventName", "hAbDUnTjjJ");
        setIntField(term192594, term192594.getClass(), "eventPoint", -221616756);
        setIntField(term192594, term192594.getClass(), "playedUserId1", 976073781);
        setIntField(term192594, term192594.getClass(), "playedUserId2", -1274112773);
        setIntField(term192594, term192594.getClass(), "playedUserId3", 1368046757);
        setField(term192594, term192594.getClass(), "playedUserName1", "KXTZTXzufA");
        setField(term192594, term192594.getClass(), "playedUserName2", "FJgDzlzGWb");
        setField(term192594, term192594.getClass(), "playedUserName3", "HEhtTqNguT");
        setIntField(term192594, term192594.getClass(), "playedMusicLevel1", 1845703825);
        setIntField(term192594, term192594.getClass(), "playedMusicLevel2", 1704595963);
        setIntField(term192594, term192594.getClass(), "playedMusicLevel3", 1995360926);
        setIntField(term192594, term192594.getClass(), "cardId1", 1386258530);
        setIntField(term192594, term192594.getClass(), "cardId2", -2072718730);
        setIntField(term192594, term192594.getClass(), "cardId3", 1727813394);
        setIntField(term192594, term192594.getClass(), "cardLevel1", -885598013);
        setIntField(term192594, term192594.getClass(), "cardLevel2", 1821468273);
        setIntField(term192594, term192594.getClass(), "cardLevel3", 1420843227);
        setIntField(term192594, term192594.getClass(), "cardAttack1", -649974945);
        setIntField(term192594, term192594.getClass(), "cardAttack2", -996804825);
        setIntField(term192594, term192594.getClass(), "cardAttack3", -1913952510);
        setIntField(term192594, term192594.getClass(), "bossCharaId", 93874138);
        setIntField(term192594, term192594.getClass(), "bossLevel", 1006712004);
        setIntField(term192594, term192594.getClass(), "bossAttribute", 648304271);
        setIntField(term192594, term192594.getClass(), "clearStatus", 820505709);
        setIntField(term192594, term192594.getClass(), "techScore", -1269806468);
        setIntField(term192594, term192594.getClass(), "techScoreRank", 1341772926);
        setIntField(term192594, term192594.getClass(), "battleScore", -1897554844);
        setIntField(term192594, term192594.getClass(), "battleScoreRank", -1108293327);
        setIntField(term192594, term192594.getClass(), "platinumScore", 798256751);
        setIntField(term192594, term192594.getClass(), "maxCombo", -918694194);
        setIntField(term192594, term192594.getClass(), "judgeMiss", 876544901);
        setIntField(term192594, term192594.getClass(), "judgeHit", 1306184248);
        setIntField(term192594, term192594.getClass(), "judgeBreak", 2079728373);
        setIntField(term192594, term192594.getClass(), "judgeCriticalBreak", -350226213);
        setIntField(term192594, term192594.getClass(), "rateTap", -1536281000);
        setIntField(term192594, term192594.getClass(), "rateHold", 2145290591);
        setIntField(term192594, term192594.getClass(), "rateFlick", 94360350);
        setIntField(term192594, term192594.getClass(), "rateSideTap", -990156586);
        setIntField(term192594, term192594.getClass(), "rateSideHold", 994784802);
        setIntField(term192594, term192594.getClass(), "bellCount", -1880267722);
        setIntField(term192594, term192594.getClass(), "totalBellCount", -320458952);
        setIntField(term192594, term192594.getClass(), "damageCount", 103851103);
        setIntField(term192594, term192594.getClass(), "overDamage", 1366352792);
        setBooleanField(term192594, term192594.getClass(), "isTechNewRecord", true);
        setBooleanField(term192594, term192594.getClass(), "isBattleNewRecord", true);
        setBooleanField(term192594, term192594.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term192594, term192594.getClass(), "isFullCombo", true);
        setBooleanField(term192594, term192594.getClass(), "isFullBell", true);
        setBooleanField(term192594, term192594.getClass(), "isAllBreak", false);
        setIntField(term192594, term192594.getClass(), "playerRating", -543646973);
        setIntField(term192594, term192594.getClass(), "battlePoint", 104724870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedUserName3", argTypes, term192594, args);
    }

};


