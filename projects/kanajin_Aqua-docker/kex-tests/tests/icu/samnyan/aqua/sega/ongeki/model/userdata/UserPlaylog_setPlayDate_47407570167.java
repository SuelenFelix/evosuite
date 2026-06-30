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

public class UserPlaylog_setPlayDate_47407570167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224013;

    public UserPlaylog_setPlayDate_47407570167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term224019 = new Long(-599981502351912419L);
        term224013 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term224015 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term224017 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term224033 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term224034 = newInstance(Class.forName("java.time.LocalDate"));
        Object term224038 = newInstance(Class.forName("java.time.LocalTime"));
        Object term224043 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term224044 = newInstance(Class.forName("java.time.LocalDate"));
        Object term224048 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term224013, term224013.getClass(), "id", 5483234956155548403L);
        setLongField(term224015, term224015.getClass(), "id", -8661647252098774207L);
        setLongField(term224017, term224017.getClass(), "id", 5993247235238833039L);
        setField(term224017, term224017.getClass(), "extId", term224019);
        setField(term224017, term224017.getClass(), "luid", "rOhevcRSqk");
        setIntField(term224034, term224034.getClass(), "year", 2028);
        setShortField(term224034, term224034.getClass(), "month", (short) 12);
        setShortField(term224034, term224034.getClass(), "day", (short) 5);
        setField(term224033, term224033.getClass(), "date", term224034);
        setByteField(term224038, term224038.getClass(), "hour", (byte) 0);
        setByteField(term224038, term224038.getClass(), "minute", (byte) 4);
        setByteField(term224038, term224038.getClass(), "second", (byte) 24);
        setIntField(term224038, term224038.getClass(), "nano", 25841507);
        setField(term224033, term224033.getClass(), "time", term224038);
        setField(term224017, term224017.getClass(), "registerTime", term224033);
        setIntField(term224044, term224044.getClass(), "year", 2012);
        setShortField(term224044, term224044.getClass(), "month", (short) 2);
        setShortField(term224044, term224044.getClass(), "day", (short) 25);
        setField(term224043, term224043.getClass(), "date", term224044);
        setByteField(term224048, term224048.getClass(), "hour", (byte) 23);
        setByteField(term224048, term224048.getClass(), "minute", (byte) 35);
        setByteField(term224048, term224048.getClass(), "second", (byte) 51);
        setIntField(term224048, term224048.getClass(), "nano", 181227985);
        setField(term224043, term224043.getClass(), "time", term224048);
        setField(term224017, term224017.getClass(), "accessTime", term224043);
        setField(term224015, term224015.getClass(), "card", term224017);
        setField(term224015, term224015.getClass(), "userName", "VRGJcIAafu");
        setIntField(term224015, term224015.getClass(), "level", -1410426998);
        setIntField(term224015, term224015.getClass(), "reincarnationNum", 1213587618);
        setLongField(term224015, term224015.getClass(), "exp", 2329182980072157596L);
        setLongField(term224015, term224015.getClass(), "point", 5188704488591459085L);
        setLongField(term224015, term224015.getClass(), "totalPoint", -6031666715679119131L);
        setIntField(term224015, term224015.getClass(), "playCount", 980395350);
        setIntField(term224015, term224015.getClass(), "jewelCount", -941431124);
        setIntField(term224015, term224015.getClass(), "totalJewelCount", 228698990);
        setIntField(term224015, term224015.getClass(), "medalCount", -432537089);
        setIntField(term224015, term224015.getClass(), "playerRating", -1871594001);
        setIntField(term224015, term224015.getClass(), "highestRating", -59629101);
        setIntField(term224015, term224015.getClass(), "battlePoint", -1074564020);
        setIntField(term224015, term224015.getClass(), "bestBattlePoint", -897257334);
        setIntField(term224015, term224015.getClass(), "overDamageBattlePoint", 761466913);
        setBooleanField(term224015, term224015.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term224015, term224015.getClass(), "nameplateId", 1025254415);
        setIntField(term224015, term224015.getClass(), "trophyId", -1179135307);
        setIntField(term224015, term224015.getClass(), "cardId", -706418583);
        setIntField(term224015, term224015.getClass(), "characterId", -1861491170);
        setIntField(term224015, term224015.getClass(), "characterVoiceNo", 1307613446);
        setIntField(term224015, term224015.getClass(), "tabSetting", -1321035168);
        setIntField(term224015, term224015.getClass(), "tabSortSetting", 1558927173);
        setIntField(term224015, term224015.getClass(), "cardCategorySetting", -1134124022);
        setIntField(term224015, term224015.getClass(), "cardSortSetting", -734162613);
        setIntField(term224015, term224015.getClass(), "rivalScoreCategorySetting", 2087704854);
        setIntField(term224015, term224015.getClass(), "playedTutorialBit", 2085374508);
        setIntField(term224015, term224015.getClass(), "firstTutorialCancelNum", 323643925);
        setLongField(term224015, term224015.getClass(), "sumTechHighScore", -4915024505983142936L);
        setLongField(term224015, term224015.getClass(), "sumTechBasicHighScore", -3172904420677972162L);
        setLongField(term224015, term224015.getClass(), "sumTechAdvancedHighScore", -1984693807185811190L);
        setLongField(term224015, term224015.getClass(), "sumTechExpertHighScore", 7957053290014639325L);
        setLongField(term224015, term224015.getClass(), "sumTechMasterHighScore", 8705054514929267238L);
        setLongField(term224015, term224015.getClass(), "sumTechLunaticHighScore", 6120242224489812239L);
        setLongField(term224015, term224015.getClass(), "sumBattleHighScore", -8869611363232114075L);
        setLongField(term224015, term224015.getClass(), "sumBattleBasicHighScore", 2563783661803950975L);
        setLongField(term224015, term224015.getClass(), "sumBattleAdvancedHighScore", 5915640370423989572L);
        setLongField(term224015, term224015.getClass(), "sumBattleExpertHighScore", -7257818421664725576L);
        setLongField(term224015, term224015.getClass(), "sumBattleMasterHighScore", -5678194829631507012L);
        setLongField(term224015, term224015.getClass(), "sumBattleLunaticHighScore", -418880175931256601L);
        setField(term224015, term224015.getClass(), "eventWatchedDate", "HHcpKjrLHx");
        setField(term224015, term224015.getClass(), "cmEventWatchedDate", "qgwIbxktYJ");
        setField(term224015, term224015.getClass(), "firstGameId", "UcOGCbHRXo");
        setField(term224015, term224015.getClass(), "firstRomVersion", "vyRqitFOxo");
        setField(term224015, term224015.getClass(), "firstDataVersion", "jRmmbipqZr");
        setField(term224015, term224015.getClass(), "firstPlayDate", "BOwIpRsWNk");
        setField(term224015, term224015.getClass(), "lastGameId", "CnRIdcAMwJ");
        setField(term224015, term224015.getClass(), "lastRomVersion", "hVsgDLbwcE");
        setField(term224015, term224015.getClass(), "lastDataVersion", "CBdRPBQREL");
        setField(term224015, term224015.getClass(), "compatibleCmVersion", "vJNoxagfjT");
        setField(term224015, term224015.getClass(), "lastPlayDate", "MuVCvbGeeV");
        setIntField(term224015, term224015.getClass(), "lastPlaceId", 2084863202);
        setField(term224015, term224015.getClass(), "lastPlaceName", "CDDzgttHhg");
        setIntField(term224015, term224015.getClass(), "lastRegionId", 561322224);
        setField(term224015, term224015.getClass(), "lastRegionName", "hpkNAPnbKp");
        setIntField(term224015, term224015.getClass(), "lastAllNetId", 1667257783);
        setField(term224015, term224015.getClass(), "lastClientId", "XBJGMkPtvJ");
        setIntField(term224015, term224015.getClass(), "lastUsedDeckId", -766164021);
        setIntField(term224015, term224015.getClass(), "lastPlayMusicLevel", 233163267);
        setIntField(term224015, term224015.getClass(), "lastEmoneyBrand", 692588997);
        setField(term224013, term224013.getClass(), "user", term224015);
        setIntField(term224013, term224013.getClass(), "sortNumber", -600023953);
        setIntField(term224013, term224013.getClass(), "placeId", -109479766);
        setField(term224013, term224013.getClass(), "placeName", "uLhzGSJLKu");
        setField(term224013, term224013.getClass(), "playDate", "vtnAaEncDf");
        setField(term224013, term224013.getClass(), "userPlayDate", "BhnXbJKpVL");
        setIntField(term224013, term224013.getClass(), "musicId", -509531106);
        setIntField(term224013, term224013.getClass(), "level", -1606779427);
        setIntField(term224013, term224013.getClass(), "playKind", -1122707604);
        setIntField(term224013, term224013.getClass(), "eventId", -172568076);
        setField(term224013, term224013.getClass(), "eventName", "qItcoIgEyi");
        setIntField(term224013, term224013.getClass(), "eventPoint", -794505441);
        setIntField(term224013, term224013.getClass(), "playedUserId1", 791807465);
        setIntField(term224013, term224013.getClass(), "playedUserId2", -359105);
        setIntField(term224013, term224013.getClass(), "playedUserId3", 868346311);
        setField(term224013, term224013.getClass(), "playedUserName1", "iSagnJzhui");
        setField(term224013, term224013.getClass(), "playedUserName2", "OaAAAMaerG");
        setField(term224013, term224013.getClass(), "playedUserName3", "LjWsBZjyXH");
        setIntField(term224013, term224013.getClass(), "playedMusicLevel1", 897972978);
        setIntField(term224013, term224013.getClass(), "playedMusicLevel2", -2099349449);
        setIntField(term224013, term224013.getClass(), "playedMusicLevel3", 1719182097);
        setIntField(term224013, term224013.getClass(), "cardId1", -689383574);
        setIntField(term224013, term224013.getClass(), "cardId2", -203297975);
        setIntField(term224013, term224013.getClass(), "cardId3", -306200799);
        setIntField(term224013, term224013.getClass(), "cardLevel1", -1669655541);
        setIntField(term224013, term224013.getClass(), "cardLevel2", 1688587497);
        setIntField(term224013, term224013.getClass(), "cardLevel3", -607264868);
        setIntField(term224013, term224013.getClass(), "cardAttack1", -1460647226);
        setIntField(term224013, term224013.getClass(), "cardAttack2", 862264056);
        setIntField(term224013, term224013.getClass(), "cardAttack3", 1933933027);
        setIntField(term224013, term224013.getClass(), "bossCharaId", 1995024241);
        setIntField(term224013, term224013.getClass(), "bossLevel", 364896764);
        setIntField(term224013, term224013.getClass(), "bossAttribute", -509113815);
        setIntField(term224013, term224013.getClass(), "clearStatus", -1978644575);
        setIntField(term224013, term224013.getClass(), "techScore", 1079520989);
        setIntField(term224013, term224013.getClass(), "techScoreRank", -495579516);
        setIntField(term224013, term224013.getClass(), "battleScore", -1364226663);
        setIntField(term224013, term224013.getClass(), "battleScoreRank", -255671701);
        setIntField(term224013, term224013.getClass(), "platinumScore", 454414154);
        setIntField(term224013, term224013.getClass(), "maxCombo", 1716689023);
        setIntField(term224013, term224013.getClass(), "judgeMiss", -185240752);
        setIntField(term224013, term224013.getClass(), "judgeHit", 1276298262);
        setIntField(term224013, term224013.getClass(), "judgeBreak", 861694073);
        setIntField(term224013, term224013.getClass(), "judgeCriticalBreak", 257279265);
        setIntField(term224013, term224013.getClass(), "rateTap", -293267957);
        setIntField(term224013, term224013.getClass(), "rateHold", -1966853151);
        setIntField(term224013, term224013.getClass(), "rateFlick", 1145144778);
        setIntField(term224013, term224013.getClass(), "rateSideTap", 1858161828);
        setIntField(term224013, term224013.getClass(), "rateSideHold", 969920028);
        setIntField(term224013, term224013.getClass(), "bellCount", -609652862);
        setIntField(term224013, term224013.getClass(), "totalBellCount", -356838469);
        setIntField(term224013, term224013.getClass(), "damageCount", -1696711810);
        setIntField(term224013, term224013.getClass(), "overDamage", -147714929);
        setBooleanField(term224013, term224013.getClass(), "isTechNewRecord", false);
        setBooleanField(term224013, term224013.getClass(), "isBattleNewRecord", false);
        setBooleanField(term224013, term224013.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term224013, term224013.getClass(), "isFullCombo", true);
        setBooleanField(term224013, term224013.getClass(), "isFullBell", true);
        setBooleanField(term224013, term224013.getClass(), "isAllBreak", true);
        setIntField(term224013, term224013.getClass(), "playerRating", -2045202054);
        setIntField(term224013, term224013.getClass(), "battlePoint", 1996188078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "IzVaWJAeHd";
        callMethod(klass, "setPlayDate", argTypes, term224013, args);
    }

};


