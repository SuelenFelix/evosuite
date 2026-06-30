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

public class UserPlaylog_setEventName_25752869473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227857;

    public UserPlaylog_setEventName_25752869473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term227863 = new Long(77619432202128806L);
        term227857 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term227859 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term227861 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term227877 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term227878 = newInstance(Class.forName("java.time.LocalDate"));
        Object term227882 = newInstance(Class.forName("java.time.LocalTime"));
        Object term227887 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term227888 = newInstance(Class.forName("java.time.LocalDate"));
        Object term227892 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term227857, term227857.getClass(), "id", -289137492142662643L);
        setLongField(term227859, term227859.getClass(), "id", -4311888043879490676L);
        setLongField(term227861, term227861.getClass(), "id", -1436622564454851069L);
        setField(term227861, term227861.getClass(), "extId", term227863);
        setField(term227861, term227861.getClass(), "luid", "CdxLYiruKu");
        setIntField(term227878, term227878.getClass(), "year", 2013);
        setShortField(term227878, term227878.getClass(), "month", (short) 3);
        setShortField(term227878, term227878.getClass(), "day", (short) 23);
        setField(term227877, term227877.getClass(), "date", term227878);
        setByteField(term227882, term227882.getClass(), "hour", (byte) 11);
        setByteField(term227882, term227882.getClass(), "minute", (byte) 19);
        setByteField(term227882, term227882.getClass(), "second", (byte) 49);
        setIntField(term227882, term227882.getClass(), "nano", 671462460);
        setField(term227877, term227877.getClass(), "time", term227882);
        setField(term227861, term227861.getClass(), "registerTime", term227877);
        setIntField(term227888, term227888.getClass(), "year", 2025);
        setShortField(term227888, term227888.getClass(), "month", (short) 5);
        setShortField(term227888, term227888.getClass(), "day", (short) 12);
        setField(term227887, term227887.getClass(), "date", term227888);
        setByteField(term227892, term227892.getClass(), "hour", (byte) 14);
        setByteField(term227892, term227892.getClass(), "minute", (byte) 27);
        setByteField(term227892, term227892.getClass(), "second", (byte) 18);
        setIntField(term227892, term227892.getClass(), "nano", 530044969);
        setField(term227887, term227887.getClass(), "time", term227892);
        setField(term227861, term227861.getClass(), "accessTime", term227887);
        setField(term227859, term227859.getClass(), "card", term227861);
        setField(term227859, term227859.getClass(), "userName", "kmsDyQSade");
        setIntField(term227859, term227859.getClass(), "level", -1369863592);
        setIntField(term227859, term227859.getClass(), "reincarnationNum", 837333114);
        setLongField(term227859, term227859.getClass(), "exp", 599444933192886140L);
        setLongField(term227859, term227859.getClass(), "point", 5246783537287005422L);
        setLongField(term227859, term227859.getClass(), "totalPoint", -1740703418742781714L);
        setIntField(term227859, term227859.getClass(), "playCount", -1247356641);
        setIntField(term227859, term227859.getClass(), "jewelCount", 1915680547);
        setIntField(term227859, term227859.getClass(), "totalJewelCount", 417717738);
        setIntField(term227859, term227859.getClass(), "medalCount", 216138319);
        setIntField(term227859, term227859.getClass(), "playerRating", 242714390);
        setIntField(term227859, term227859.getClass(), "highestRating", 811289212);
        setIntField(term227859, term227859.getClass(), "battlePoint", 700677049);
        setIntField(term227859, term227859.getClass(), "bestBattlePoint", -36401038);
        setIntField(term227859, term227859.getClass(), "overDamageBattlePoint", 1242416043);
        setBooleanField(term227859, term227859.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term227859, term227859.getClass(), "nameplateId", 490059166);
        setIntField(term227859, term227859.getClass(), "trophyId", 672479272);
        setIntField(term227859, term227859.getClass(), "cardId", 1878120919);
        setIntField(term227859, term227859.getClass(), "characterId", -675148907);
        setIntField(term227859, term227859.getClass(), "characterVoiceNo", -1740743042);
        setIntField(term227859, term227859.getClass(), "tabSetting", 339013147);
        setIntField(term227859, term227859.getClass(), "tabSortSetting", -1317112543);
        setIntField(term227859, term227859.getClass(), "cardCategorySetting", 762805823);
        setIntField(term227859, term227859.getClass(), "cardSortSetting", 1225715719);
        setIntField(term227859, term227859.getClass(), "rivalScoreCategorySetting", -1423171674);
        setIntField(term227859, term227859.getClass(), "playedTutorialBit", 209728839);
        setIntField(term227859, term227859.getClass(), "firstTutorialCancelNum", -1109602409);
        setLongField(term227859, term227859.getClass(), "sumTechHighScore", 5291202944139913648L);
        setLongField(term227859, term227859.getClass(), "sumTechBasicHighScore", -6271151078269170523L);
        setLongField(term227859, term227859.getClass(), "sumTechAdvancedHighScore", -8287439525177334161L);
        setLongField(term227859, term227859.getClass(), "sumTechExpertHighScore", -8548607791349704176L);
        setLongField(term227859, term227859.getClass(), "sumTechMasterHighScore", 7150780687999434869L);
        setLongField(term227859, term227859.getClass(), "sumTechLunaticHighScore", 2127401902317144527L);
        setLongField(term227859, term227859.getClass(), "sumBattleHighScore", 7064133533790538840L);
        setLongField(term227859, term227859.getClass(), "sumBattleBasicHighScore", -1851540297096208267L);
        setLongField(term227859, term227859.getClass(), "sumBattleAdvancedHighScore", 4569745463126700122L);
        setLongField(term227859, term227859.getClass(), "sumBattleExpertHighScore", 431541280374600079L);
        setLongField(term227859, term227859.getClass(), "sumBattleMasterHighScore", -8442365660719994606L);
        setLongField(term227859, term227859.getClass(), "sumBattleLunaticHighScore", 7870710616239156965L);
        setField(term227859, term227859.getClass(), "eventWatchedDate", "SVKsHbrKuH");
        setField(term227859, term227859.getClass(), "cmEventWatchedDate", "mWohnyQvua");
        setField(term227859, term227859.getClass(), "firstGameId", "HmJTytenTU");
        setField(term227859, term227859.getClass(), "firstRomVersion", "tgIsmIybmg");
        setField(term227859, term227859.getClass(), "firstDataVersion", "SGouavfRbI");
        setField(term227859, term227859.getClass(), "firstPlayDate", "LHFmqVBPET");
        setField(term227859, term227859.getClass(), "lastGameId", "rLCUYvtbhV");
        setField(term227859, term227859.getClass(), "lastRomVersion", "jwsYMUZPuH");
        setField(term227859, term227859.getClass(), "lastDataVersion", "pvxICSHUwi");
        setField(term227859, term227859.getClass(), "compatibleCmVersion", "xBSvBKOUMw");
        setField(term227859, term227859.getClass(), "lastPlayDate", "AYiDtYzilr");
        setIntField(term227859, term227859.getClass(), "lastPlaceId", 431360354);
        setField(term227859, term227859.getClass(), "lastPlaceName", "xiWHeKwudx");
        setIntField(term227859, term227859.getClass(), "lastRegionId", -1337364986);
        setField(term227859, term227859.getClass(), "lastRegionName", "zohFMDNrFP");
        setIntField(term227859, term227859.getClass(), "lastAllNetId", -1843956619);
        setField(term227859, term227859.getClass(), "lastClientId", "qHTRvVYigw");
        setIntField(term227859, term227859.getClass(), "lastUsedDeckId", -1997929690);
        setIntField(term227859, term227859.getClass(), "lastPlayMusicLevel", -2134647432);
        setIntField(term227859, term227859.getClass(), "lastEmoneyBrand", 1367416020);
        setField(term227857, term227857.getClass(), "user", term227859);
        setIntField(term227857, term227857.getClass(), "sortNumber", -1721259729);
        setIntField(term227857, term227857.getClass(), "placeId", -803847072);
        setField(term227857, term227857.getClass(), "placeName", "StTRztbwRa");
        setField(term227857, term227857.getClass(), "playDate", "yaHTLuJhNN");
        setField(term227857, term227857.getClass(), "userPlayDate", "pukRdYaTyv");
        setIntField(term227857, term227857.getClass(), "musicId", -503134540);
        setIntField(term227857, term227857.getClass(), "level", 1534465143);
        setIntField(term227857, term227857.getClass(), "playKind", -627988036);
        setIntField(term227857, term227857.getClass(), "eventId", 1134719036);
        setField(term227857, term227857.getClass(), "eventName", "dZYivHUDDz");
        setIntField(term227857, term227857.getClass(), "eventPoint", -79768819);
        setIntField(term227857, term227857.getClass(), "playedUserId1", 1575753690);
        setIntField(term227857, term227857.getClass(), "playedUserId2", 696533441);
        setIntField(term227857, term227857.getClass(), "playedUserId3", 520758279);
        setField(term227857, term227857.getClass(), "playedUserName1", "fFYUYuwUNT");
        setField(term227857, term227857.getClass(), "playedUserName2", "rBiTyuMdrX");
        setField(term227857, term227857.getClass(), "playedUserName3", "GmjmDmQirY");
        setIntField(term227857, term227857.getClass(), "playedMusicLevel1", 388729923);
        setIntField(term227857, term227857.getClass(), "playedMusicLevel2", 1614487902);
        setIntField(term227857, term227857.getClass(), "playedMusicLevel3", 965606955);
        setIntField(term227857, term227857.getClass(), "cardId1", 427189621);
        setIntField(term227857, term227857.getClass(), "cardId2", -1146650520);
        setIntField(term227857, term227857.getClass(), "cardId3", 308747026);
        setIntField(term227857, term227857.getClass(), "cardLevel1", -1142598830);
        setIntField(term227857, term227857.getClass(), "cardLevel2", 422197241);
        setIntField(term227857, term227857.getClass(), "cardLevel3", 512839329);
        setIntField(term227857, term227857.getClass(), "cardAttack1", -1308727775);
        setIntField(term227857, term227857.getClass(), "cardAttack2", 923435355);
        setIntField(term227857, term227857.getClass(), "cardAttack3", 529707862);
        setIntField(term227857, term227857.getClass(), "bossCharaId", 1163541549);
        setIntField(term227857, term227857.getClass(), "bossLevel", 85255563);
        setIntField(term227857, term227857.getClass(), "bossAttribute", 1698224861);
        setIntField(term227857, term227857.getClass(), "clearStatus", -1675006092);
        setIntField(term227857, term227857.getClass(), "techScore", -71395930);
        setIntField(term227857, term227857.getClass(), "techScoreRank", -1327988712);
        setIntField(term227857, term227857.getClass(), "battleScore", -481078842);
        setIntField(term227857, term227857.getClass(), "battleScoreRank", 133257591);
        setIntField(term227857, term227857.getClass(), "platinumScore", -171155321);
        setIntField(term227857, term227857.getClass(), "maxCombo", -677950072);
        setIntField(term227857, term227857.getClass(), "judgeMiss", -904761728);
        setIntField(term227857, term227857.getClass(), "judgeHit", 2000897549);
        setIntField(term227857, term227857.getClass(), "judgeBreak", 1826955502);
        setIntField(term227857, term227857.getClass(), "judgeCriticalBreak", -757144818);
        setIntField(term227857, term227857.getClass(), "rateTap", 519574863);
        setIntField(term227857, term227857.getClass(), "rateHold", 1696650503);
        setIntField(term227857, term227857.getClass(), "rateFlick", 1324332962);
        setIntField(term227857, term227857.getClass(), "rateSideTap", 1021276927);
        setIntField(term227857, term227857.getClass(), "rateSideHold", 871349756);
        setIntField(term227857, term227857.getClass(), "bellCount", -543589845);
        setIntField(term227857, term227857.getClass(), "totalBellCount", -423912362);
        setIntField(term227857, term227857.getClass(), "damageCount", 2008331206);
        setIntField(term227857, term227857.getClass(), "overDamage", 1103626679);
        setBooleanField(term227857, term227857.getClass(), "isTechNewRecord", false);
        setBooleanField(term227857, term227857.getClass(), "isBattleNewRecord", true);
        setBooleanField(term227857, term227857.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term227857, term227857.getClass(), "isFullCombo", true);
        setBooleanField(term227857, term227857.getClass(), "isFullBell", true);
        setBooleanField(term227857, term227857.getClass(), "isAllBreak", false);
        setIntField(term227857, term227857.getClass(), "playerRating", 154582855);
        setIntField(term227857, term227857.getClass(), "battlePoint", 2095511598);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ESLJSsMCwE";
        callMethod(klass, "setEventName", argTypes, term227857, args);
    }

};


