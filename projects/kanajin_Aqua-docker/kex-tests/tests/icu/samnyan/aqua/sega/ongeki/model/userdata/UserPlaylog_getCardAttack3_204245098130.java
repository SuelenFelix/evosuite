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

public class UserPlaylog_getCardAttack3_204245098130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200178;

    public UserPlaylog_getCardAttack3_204245098130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term200184 = new Long(3643973882575578879L);
        term200178 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term200180 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term200182 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term200198 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term200199 = newInstance(Class.forName("java.time.LocalDate"));
        Object term200203 = newInstance(Class.forName("java.time.LocalTime"));
        Object term200208 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term200209 = newInstance(Class.forName("java.time.LocalDate"));
        Object term200213 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term200178, term200178.getClass(), "id", 4550910746498457380L);
        setLongField(term200180, term200180.getClass(), "id", -8205078520192460425L);
        setLongField(term200182, term200182.getClass(), "id", -4758441834857567910L);
        setField(term200182, term200182.getClass(), "extId", term200184);
        setField(term200182, term200182.getClass(), "luid", "XcAeNLtSNH");
        setIntField(term200199, term200199.getClass(), "year", 2026);
        setShortField(term200199, term200199.getClass(), "month", (short) 6);
        setShortField(term200199, term200199.getClass(), "day", (short) 16);
        setField(term200198, term200198.getClass(), "date", term200199);
        setByteField(term200203, term200203.getClass(), "hour", (byte) 23);
        setByteField(term200203, term200203.getClass(), "minute", (byte) 43);
        setByteField(term200203, term200203.getClass(), "second", (byte) 38);
        setIntField(term200203, term200203.getClass(), "nano", 395188532);
        setField(term200198, term200198.getClass(), "time", term200203);
        setField(term200182, term200182.getClass(), "registerTime", term200198);
        setIntField(term200209, term200209.getClass(), "year", 2010);
        setShortField(term200209, term200209.getClass(), "month", (short) 12);
        setShortField(term200209, term200209.getClass(), "day", (short) 4);
        setField(term200208, term200208.getClass(), "date", term200209);
        setByteField(term200213, term200213.getClass(), "hour", (byte) 18);
        setByteField(term200213, term200213.getClass(), "minute", (byte) 23);
        setByteField(term200213, term200213.getClass(), "second", (byte) 50);
        setIntField(term200213, term200213.getClass(), "nano", 773671553);
        setField(term200208, term200208.getClass(), "time", term200213);
        setField(term200182, term200182.getClass(), "accessTime", term200208);
        setField(term200180, term200180.getClass(), "card", term200182);
        setField(term200180, term200180.getClass(), "userName", "jItyMhtTmx");
        setIntField(term200180, term200180.getClass(), "level", -840195648);
        setIntField(term200180, term200180.getClass(), "reincarnationNum", 566535777);
        setLongField(term200180, term200180.getClass(), "exp", 773046857634653088L);
        setLongField(term200180, term200180.getClass(), "point", 4916035217158779841L);
        setLongField(term200180, term200180.getClass(), "totalPoint", -5556690534119878819L);
        setIntField(term200180, term200180.getClass(), "playCount", 1669758643);
        setIntField(term200180, term200180.getClass(), "jewelCount", 1938227934);
        setIntField(term200180, term200180.getClass(), "totalJewelCount", 2375511);
        setIntField(term200180, term200180.getClass(), "medalCount", 146251900);
        setIntField(term200180, term200180.getClass(), "playerRating", -1769798624);
        setIntField(term200180, term200180.getClass(), "highestRating", -333409553);
        setIntField(term200180, term200180.getClass(), "battlePoint", -909169582);
        setIntField(term200180, term200180.getClass(), "bestBattlePoint", -1045127984);
        setIntField(term200180, term200180.getClass(), "overDamageBattlePoint", -1924242957);
        setBooleanField(term200180, term200180.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term200180, term200180.getClass(), "nameplateId", -108346962);
        setIntField(term200180, term200180.getClass(), "trophyId", 1669003913);
        setIntField(term200180, term200180.getClass(), "cardId", 1083030297);
        setIntField(term200180, term200180.getClass(), "characterId", 669141919);
        setIntField(term200180, term200180.getClass(), "characterVoiceNo", 1236363631);
        setIntField(term200180, term200180.getClass(), "tabSetting", -639750119);
        setIntField(term200180, term200180.getClass(), "tabSortSetting", 265435772);
        setIntField(term200180, term200180.getClass(), "cardCategorySetting", -646028316);
        setIntField(term200180, term200180.getClass(), "cardSortSetting", -1983618258);
        setIntField(term200180, term200180.getClass(), "rivalScoreCategorySetting", -2016436856);
        setIntField(term200180, term200180.getClass(), "playedTutorialBit", -31490340);
        setIntField(term200180, term200180.getClass(), "firstTutorialCancelNum", 6355353);
        setLongField(term200180, term200180.getClass(), "sumTechHighScore", 2712697079953235002L);
        setLongField(term200180, term200180.getClass(), "sumTechBasicHighScore", 3539218699832186677L);
        setLongField(term200180, term200180.getClass(), "sumTechAdvancedHighScore", 2007181337265009846L);
        setLongField(term200180, term200180.getClass(), "sumTechExpertHighScore", 7585912269663848364L);
        setLongField(term200180, term200180.getClass(), "sumTechMasterHighScore", -473264001124726243L);
        setLongField(term200180, term200180.getClass(), "sumTechLunaticHighScore", 6760936648872508104L);
        setLongField(term200180, term200180.getClass(), "sumBattleHighScore", 1902439295569540465L);
        setLongField(term200180, term200180.getClass(), "sumBattleBasicHighScore", 8266816764113733584L);
        setLongField(term200180, term200180.getClass(), "sumBattleAdvancedHighScore", 5959106241680890675L);
        setLongField(term200180, term200180.getClass(), "sumBattleExpertHighScore", -1958562832213922986L);
        setLongField(term200180, term200180.getClass(), "sumBattleMasterHighScore", 1570467111691681029L);
        setLongField(term200180, term200180.getClass(), "sumBattleLunaticHighScore", 8801339843761859448L);
        setField(term200180, term200180.getClass(), "eventWatchedDate", "aPRGIMaEPp");
        setField(term200180, term200180.getClass(), "cmEventWatchedDate", "dUGbHGAPib");
        setField(term200180, term200180.getClass(), "firstGameId", "lszhTAzhyn");
        setField(term200180, term200180.getClass(), "firstRomVersion", "ODNaUglXVz");
        setField(term200180, term200180.getClass(), "firstDataVersion", "paRWrNNjau");
        setField(term200180, term200180.getClass(), "firstPlayDate", "xYDVnaWhJX");
        setField(term200180, term200180.getClass(), "lastGameId", "DgLnmWcSNo");
        setField(term200180, term200180.getClass(), "lastRomVersion", "HYVRFlRSiU");
        setField(term200180, term200180.getClass(), "lastDataVersion", "nEmiPinRJb");
        setField(term200180, term200180.getClass(), "compatibleCmVersion", "lLDlCidILl");
        setField(term200180, term200180.getClass(), "lastPlayDate", "GmDgAbnzLh");
        setIntField(term200180, term200180.getClass(), "lastPlaceId", -1238893049);
        setField(term200180, term200180.getClass(), "lastPlaceName", "HlzihENfEE");
        setIntField(term200180, term200180.getClass(), "lastRegionId", -504663508);
        setField(term200180, term200180.getClass(), "lastRegionName", "BVksxjZKJm");
        setIntField(term200180, term200180.getClass(), "lastAllNetId", -1477666963);
        setField(term200180, term200180.getClass(), "lastClientId", "qDOWRMZGoQ");
        setIntField(term200180, term200180.getClass(), "lastUsedDeckId", -725070676);
        setIntField(term200180, term200180.getClass(), "lastPlayMusicLevel", 431028714);
        setIntField(term200180, term200180.getClass(), "lastEmoneyBrand", 1011528396);
        setField(term200178, term200178.getClass(), "user", term200180);
        setIntField(term200178, term200178.getClass(), "sortNumber", 309271174);
        setIntField(term200178, term200178.getClass(), "placeId", 2035588967);
        setField(term200178, term200178.getClass(), "placeName", "LsOyXKZzBQ");
        setField(term200178, term200178.getClass(), "playDate", "URFrizTrec");
        setField(term200178, term200178.getClass(), "userPlayDate", "OSsMvEletA");
        setIntField(term200178, term200178.getClass(), "musicId", 1167653262);
        setIntField(term200178, term200178.getClass(), "level", -1595345273);
        setIntField(term200178, term200178.getClass(), "playKind", 919694010);
        setIntField(term200178, term200178.getClass(), "eventId", 161716212);
        setField(term200178, term200178.getClass(), "eventName", "DNfJBqzjmu");
        setIntField(term200178, term200178.getClass(), "eventPoint", 1089707941);
        setIntField(term200178, term200178.getClass(), "playedUserId1", 1085181428);
        setIntField(term200178, term200178.getClass(), "playedUserId2", -1881163480);
        setIntField(term200178, term200178.getClass(), "playedUserId3", 1518450211);
        setField(term200178, term200178.getClass(), "playedUserName1", "GYBeZGePbX");
        setField(term200178, term200178.getClass(), "playedUserName2", "jJUEqbPIrM");
        setField(term200178, term200178.getClass(), "playedUserName3", "fUWVNlHjyG");
        setIntField(term200178, term200178.getClass(), "playedMusicLevel1", 1446759250);
        setIntField(term200178, term200178.getClass(), "playedMusicLevel2", 802388106);
        setIntField(term200178, term200178.getClass(), "playedMusicLevel3", 684874002);
        setIntField(term200178, term200178.getClass(), "cardId1", 1905713513);
        setIntField(term200178, term200178.getClass(), "cardId2", 1930667991);
        setIntField(term200178, term200178.getClass(), "cardId3", 1253166146);
        setIntField(term200178, term200178.getClass(), "cardLevel1", -684640084);
        setIntField(term200178, term200178.getClass(), "cardLevel2", -985705685);
        setIntField(term200178, term200178.getClass(), "cardLevel3", 684295059);
        setIntField(term200178, term200178.getClass(), "cardAttack1", -2006682758);
        setIntField(term200178, term200178.getClass(), "cardAttack2", -852126922);
        setIntField(term200178, term200178.getClass(), "cardAttack3", -661495492);
        setIntField(term200178, term200178.getClass(), "bossCharaId", 1591648810);
        setIntField(term200178, term200178.getClass(), "bossLevel", -17210084);
        setIntField(term200178, term200178.getClass(), "bossAttribute", 2060202060);
        setIntField(term200178, term200178.getClass(), "clearStatus", 1202515108);
        setIntField(term200178, term200178.getClass(), "techScore", -2098430459);
        setIntField(term200178, term200178.getClass(), "techScoreRank", 801946367);
        setIntField(term200178, term200178.getClass(), "battleScore", 1118553212);
        setIntField(term200178, term200178.getClass(), "battleScoreRank", 1567455395);
        setIntField(term200178, term200178.getClass(), "platinumScore", -166187779);
        setIntField(term200178, term200178.getClass(), "maxCombo", 1007962765);
        setIntField(term200178, term200178.getClass(), "judgeMiss", 874006297);
        setIntField(term200178, term200178.getClass(), "judgeHit", -1574162955);
        setIntField(term200178, term200178.getClass(), "judgeBreak", 520805458);
        setIntField(term200178, term200178.getClass(), "judgeCriticalBreak", -1476811867);
        setIntField(term200178, term200178.getClass(), "rateTap", 707088718);
        setIntField(term200178, term200178.getClass(), "rateHold", -891728298);
        setIntField(term200178, term200178.getClass(), "rateFlick", -1956538399);
        setIntField(term200178, term200178.getClass(), "rateSideTap", -1071998527);
        setIntField(term200178, term200178.getClass(), "rateSideHold", 601283189);
        setIntField(term200178, term200178.getClass(), "bellCount", 496032839);
        setIntField(term200178, term200178.getClass(), "totalBellCount", 200659094);
        setIntField(term200178, term200178.getClass(), "damageCount", 1478933339);
        setIntField(term200178, term200178.getClass(), "overDamage", -1365187159);
        setBooleanField(term200178, term200178.getClass(), "isTechNewRecord", false);
        setBooleanField(term200178, term200178.getClass(), "isBattleNewRecord", true);
        setBooleanField(term200178, term200178.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term200178, term200178.getClass(), "isFullCombo", false);
        setBooleanField(term200178, term200178.getClass(), "isFullBell", true);
        setBooleanField(term200178, term200178.getClass(), "isAllBreak", false);
        setIntField(term200178, term200178.getClass(), "playerRating", -598050030);
        setIntField(term200178, term200178.getClass(), "battlePoint", -2021435874);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardAttack3", argTypes, term200178, args);
    }

};


