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

public class UserPlaylog_setPlayedUserName2_95008021079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231701;

    public UserPlaylog_setPlayedUserName2_95008021079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term231707 = new Long(370847120687610747L);
        term231701 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term231703 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term231705 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term231721 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term231722 = newInstance(Class.forName("java.time.LocalDate"));
        Object term231726 = newInstance(Class.forName("java.time.LocalTime"));
        Object term231731 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term231732 = newInstance(Class.forName("java.time.LocalDate"));
        Object term231736 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term231701, term231701.getClass(), "id", 3504012382699258663L);
        setLongField(term231703, term231703.getClass(), "id", -836807378712266437L);
        setLongField(term231705, term231705.getClass(), "id", 3589958953195738340L);
        setField(term231705, term231705.getClass(), "extId", term231707);
        setField(term231705, term231705.getClass(), "luid", "BIrUkKfKmF");
        setIntField(term231722, term231722.getClass(), "year", 2015);
        setShortField(term231722, term231722.getClass(), "month", (short) 4);
        setShortField(term231722, term231722.getClass(), "day", (short) 27);
        setField(term231721, term231721.getClass(), "date", term231722);
        setByteField(term231726, term231726.getClass(), "hour", (byte) 14);
        setByteField(term231726, term231726.getClass(), "minute", (byte) 33);
        setByteField(term231726, term231726.getClass(), "second", (byte) 56);
        setIntField(term231726, term231726.getClass(), "nano", 249469563);
        setField(term231721, term231721.getClass(), "time", term231726);
        setField(term231705, term231705.getClass(), "registerTime", term231721);
        setIntField(term231732, term231732.getClass(), "year", 2014);
        setShortField(term231732, term231732.getClass(), "month", (short) 2);
        setShortField(term231732, term231732.getClass(), "day", (short) 18);
        setField(term231731, term231731.getClass(), "date", term231732);
        setByteField(term231736, term231736.getClass(), "hour", (byte) 10);
        setByteField(term231736, term231736.getClass(), "minute", (byte) 32);
        setByteField(term231736, term231736.getClass(), "second", (byte) 37);
        setIntField(term231736, term231736.getClass(), "nano", 707409108);
        setField(term231731, term231731.getClass(), "time", term231736);
        setField(term231705, term231705.getClass(), "accessTime", term231731);
        setField(term231703, term231703.getClass(), "card", term231705);
        setField(term231703, term231703.getClass(), "userName", "kKWwlRUdxO");
        setIntField(term231703, term231703.getClass(), "level", -951732964);
        setIntField(term231703, term231703.getClass(), "reincarnationNum", 810582577);
        setLongField(term231703, term231703.getClass(), "exp", 3317613762910755461L);
        setLongField(term231703, term231703.getClass(), "point", 7181426059438248060L);
        setLongField(term231703, term231703.getClass(), "totalPoint", 1878387864306336669L);
        setIntField(term231703, term231703.getClass(), "playCount", -481913428);
        setIntField(term231703, term231703.getClass(), "jewelCount", 1878857053);
        setIntField(term231703, term231703.getClass(), "totalJewelCount", -1703968608);
        setIntField(term231703, term231703.getClass(), "medalCount", -1516989582);
        setIntField(term231703, term231703.getClass(), "playerRating", -1473571403);
        setIntField(term231703, term231703.getClass(), "highestRating", -33345447);
        setIntField(term231703, term231703.getClass(), "battlePoint", -473865390);
        setIntField(term231703, term231703.getClass(), "bestBattlePoint", 1560849509);
        setIntField(term231703, term231703.getClass(), "overDamageBattlePoint", 548082671);
        setBooleanField(term231703, term231703.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term231703, term231703.getClass(), "nameplateId", 143341138);
        setIntField(term231703, term231703.getClass(), "trophyId", 673245946);
        setIntField(term231703, term231703.getClass(), "cardId", -425351471);
        setIntField(term231703, term231703.getClass(), "characterId", -1117580978);
        setIntField(term231703, term231703.getClass(), "characterVoiceNo", 208521517);
        setIntField(term231703, term231703.getClass(), "tabSetting", 778044540);
        setIntField(term231703, term231703.getClass(), "tabSortSetting", -803580264);
        setIntField(term231703, term231703.getClass(), "cardCategorySetting", 131178867);
        setIntField(term231703, term231703.getClass(), "cardSortSetting", -255580652);
        setIntField(term231703, term231703.getClass(), "rivalScoreCategorySetting", -1732441524);
        setIntField(term231703, term231703.getClass(), "playedTutorialBit", -130160357);
        setIntField(term231703, term231703.getClass(), "firstTutorialCancelNum", -1813127102);
        setLongField(term231703, term231703.getClass(), "sumTechHighScore", -8821230925120968379L);
        setLongField(term231703, term231703.getClass(), "sumTechBasicHighScore", -1650399504002551176L);
        setLongField(term231703, term231703.getClass(), "sumTechAdvancedHighScore", 7734375040858265011L);
        setLongField(term231703, term231703.getClass(), "sumTechExpertHighScore", 2812254788428165456L);
        setLongField(term231703, term231703.getClass(), "sumTechMasterHighScore", -4224144508839133515L);
        setLongField(term231703, term231703.getClass(), "sumTechLunaticHighScore", 8856488457240145572L);
        setLongField(term231703, term231703.getClass(), "sumBattleHighScore", -5877196172319571618L);
        setLongField(term231703, term231703.getClass(), "sumBattleBasicHighScore", -3352307422764396158L);
        setLongField(term231703, term231703.getClass(), "sumBattleAdvancedHighScore", -4518293857308776760L);
        setLongField(term231703, term231703.getClass(), "sumBattleExpertHighScore", -1153627645527650808L);
        setLongField(term231703, term231703.getClass(), "sumBattleMasterHighScore", 2341193937000527412L);
        setLongField(term231703, term231703.getClass(), "sumBattleLunaticHighScore", -4124169065087009241L);
        setField(term231703, term231703.getClass(), "eventWatchedDate", "mPmWMlHjdS");
        setField(term231703, term231703.getClass(), "cmEventWatchedDate", "vVMAKTsnWp");
        setField(term231703, term231703.getClass(), "firstGameId", "gHkufiBxQY");
        setField(term231703, term231703.getClass(), "firstRomVersion", "FpnOTthGSf");
        setField(term231703, term231703.getClass(), "firstDataVersion", "ZlDJfKbWuT");
        setField(term231703, term231703.getClass(), "firstPlayDate", "KPKvkukffl");
        setField(term231703, term231703.getClass(), "lastGameId", "DztkzYmExj");
        setField(term231703, term231703.getClass(), "lastRomVersion", "jgLlnOSDbQ");
        setField(term231703, term231703.getClass(), "lastDataVersion", "KJGZNumCAL");
        setField(term231703, term231703.getClass(), "compatibleCmVersion", "iBvRhpQbES");
        setField(term231703, term231703.getClass(), "lastPlayDate", "kNYoaOPXRc");
        setIntField(term231703, term231703.getClass(), "lastPlaceId", -838128266);
        setField(term231703, term231703.getClass(), "lastPlaceName", "tYZxePZIvy");
        setIntField(term231703, term231703.getClass(), "lastRegionId", 61916705);
        setField(term231703, term231703.getClass(), "lastRegionName", "kvHeZIxKeu");
        setIntField(term231703, term231703.getClass(), "lastAllNetId", 1816024796);
        setField(term231703, term231703.getClass(), "lastClientId", "sFuwqpHtuJ");
        setIntField(term231703, term231703.getClass(), "lastUsedDeckId", -499700559);
        setIntField(term231703, term231703.getClass(), "lastPlayMusicLevel", 1679845201);
        setIntField(term231703, term231703.getClass(), "lastEmoneyBrand", 2066635240);
        setField(term231701, term231701.getClass(), "user", term231703);
        setIntField(term231701, term231701.getClass(), "sortNumber", 403819364);
        setIntField(term231701, term231701.getClass(), "placeId", -511361821);
        setField(term231701, term231701.getClass(), "placeName", "bMJcegMICR");
        setField(term231701, term231701.getClass(), "playDate", "ISmVucBSqp");
        setField(term231701, term231701.getClass(), "userPlayDate", "zJfxfAWdxN");
        setIntField(term231701, term231701.getClass(), "musicId", 743737267);
        setIntField(term231701, term231701.getClass(), "level", 1900299259);
        setIntField(term231701, term231701.getClass(), "playKind", 1790715750);
        setIntField(term231701, term231701.getClass(), "eventId", -2067996812);
        setField(term231701, term231701.getClass(), "eventName", "lPOtrbBtKg");
        setIntField(term231701, term231701.getClass(), "eventPoint", -1904003203);
        setIntField(term231701, term231701.getClass(), "playedUserId1", -1001590126);
        setIntField(term231701, term231701.getClass(), "playedUserId2", 610795811);
        setIntField(term231701, term231701.getClass(), "playedUserId3", 234814998);
        setField(term231701, term231701.getClass(), "playedUserName1", "DoQKZouOMo");
        setField(term231701, term231701.getClass(), "playedUserName2", "eBKpRbeIXG");
        setField(term231701, term231701.getClass(), "playedUserName3", "ImITtFnAXw");
        setIntField(term231701, term231701.getClass(), "playedMusicLevel1", -656923286);
        setIntField(term231701, term231701.getClass(), "playedMusicLevel2", 1926273657);
        setIntField(term231701, term231701.getClass(), "playedMusicLevel3", -630929648);
        setIntField(term231701, term231701.getClass(), "cardId1", -1137920676);
        setIntField(term231701, term231701.getClass(), "cardId2", -1645894833);
        setIntField(term231701, term231701.getClass(), "cardId3", -283032317);
        setIntField(term231701, term231701.getClass(), "cardLevel1", 974252215);
        setIntField(term231701, term231701.getClass(), "cardLevel2", -101411371);
        setIntField(term231701, term231701.getClass(), "cardLevel3", -63876189);
        setIntField(term231701, term231701.getClass(), "cardAttack1", 1742031166);
        setIntField(term231701, term231701.getClass(), "cardAttack2", -1042732582);
        setIntField(term231701, term231701.getClass(), "cardAttack3", -464887203);
        setIntField(term231701, term231701.getClass(), "bossCharaId", -1046500542);
        setIntField(term231701, term231701.getClass(), "bossLevel", 198419559);
        setIntField(term231701, term231701.getClass(), "bossAttribute", -187137059);
        setIntField(term231701, term231701.getClass(), "clearStatus", 1785454510);
        setIntField(term231701, term231701.getClass(), "techScore", 342838125);
        setIntField(term231701, term231701.getClass(), "techScoreRank", 1139336608);
        setIntField(term231701, term231701.getClass(), "battleScore", 217987429);
        setIntField(term231701, term231701.getClass(), "battleScoreRank", -1331001027);
        setIntField(term231701, term231701.getClass(), "platinumScore", 1191278613);
        setIntField(term231701, term231701.getClass(), "maxCombo", -132996897);
        setIntField(term231701, term231701.getClass(), "judgeMiss", -698351557);
        setIntField(term231701, term231701.getClass(), "judgeHit", 442187587);
        setIntField(term231701, term231701.getClass(), "judgeBreak", 1002253912);
        setIntField(term231701, term231701.getClass(), "judgeCriticalBreak", 1461361961);
        setIntField(term231701, term231701.getClass(), "rateTap", -943692426);
        setIntField(term231701, term231701.getClass(), "rateHold", 466240025);
        setIntField(term231701, term231701.getClass(), "rateFlick", -2026987701);
        setIntField(term231701, term231701.getClass(), "rateSideTap", -889572864);
        setIntField(term231701, term231701.getClass(), "rateSideHold", 365154265);
        setIntField(term231701, term231701.getClass(), "bellCount", -199029048);
        setIntField(term231701, term231701.getClass(), "totalBellCount", -1738730758);
        setIntField(term231701, term231701.getClass(), "damageCount", 252807194);
        setIntField(term231701, term231701.getClass(), "overDamage", -1970748295);
        setBooleanField(term231701, term231701.getClass(), "isTechNewRecord", true);
        setBooleanField(term231701, term231701.getClass(), "isBattleNewRecord", false);
        setBooleanField(term231701, term231701.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term231701, term231701.getClass(), "isFullCombo", false);
        setBooleanField(term231701, term231701.getClass(), "isFullBell", false);
        setBooleanField(term231701, term231701.getClass(), "isAllBreak", true);
        setIntField(term231701, term231701.getClass(), "playerRating", -970919712);
        setIntField(term231701, term231701.getClass(), "battlePoint", 644708268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "NxaXDGmFox";
        callMethod(klass, "setPlayedUserName2", argTypes, term231701, args);
    }

};


