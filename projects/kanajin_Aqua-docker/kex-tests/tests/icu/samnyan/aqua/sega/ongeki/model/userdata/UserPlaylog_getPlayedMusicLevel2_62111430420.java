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

public class UserPlaylog_getPlayedMusicLevel2_62111430420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193858;

    public UserPlaylog_getPlayedMusicLevel2_62111430420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term193864 = new Long(-8211859616692114655L);
        term193858 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term193860 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term193862 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term193878 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term193879 = newInstance(Class.forName("java.time.LocalDate"));
        Object term193883 = newInstance(Class.forName("java.time.LocalTime"));
        Object term193888 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term193889 = newInstance(Class.forName("java.time.LocalDate"));
        Object term193893 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term193858, term193858.getClass(), "id", -6000318703654544692L);
        setLongField(term193860, term193860.getClass(), "id", 5258993626790401817L);
        setLongField(term193862, term193862.getClass(), "id", -411091672782917690L);
        setField(term193862, term193862.getClass(), "extId", term193864);
        setField(term193862, term193862.getClass(), "luid", "NRdfPdMFOx");
        setIntField(term193879, term193879.getClass(), "year", 2014);
        setShortField(term193879, term193879.getClass(), "month", (short) 12);
        setShortField(term193879, term193879.getClass(), "day", (short) 10);
        setField(term193878, term193878.getClass(), "date", term193879);
        setByteField(term193883, term193883.getClass(), "hour", (byte) 0);
        setByteField(term193883, term193883.getClass(), "minute", (byte) 19);
        setByteField(term193883, term193883.getClass(), "second", (byte) 30);
        setIntField(term193883, term193883.getClass(), "nano", 874948769);
        setField(term193878, term193878.getClass(), "time", term193883);
        setField(term193862, term193862.getClass(), "registerTime", term193878);
        setIntField(term193889, term193889.getClass(), "year", 2016);
        setShortField(term193889, term193889.getClass(), "month", (short) 1);
        setShortField(term193889, term193889.getClass(), "day", (short) 29);
        setField(term193888, term193888.getClass(), "date", term193889);
        setByteField(term193893, term193893.getClass(), "hour", (byte) 12);
        setByteField(term193893, term193893.getClass(), "minute", (byte) 41);
        setByteField(term193893, term193893.getClass(), "second", (byte) 10);
        setIntField(term193893, term193893.getClass(), "nano", 153443383);
        setField(term193888, term193888.getClass(), "time", term193893);
        setField(term193862, term193862.getClass(), "accessTime", term193888);
        setField(term193860, term193860.getClass(), "card", term193862);
        setField(term193860, term193860.getClass(), "userName", "uwLMiyXjJc");
        setIntField(term193860, term193860.getClass(), "level", -1060897638);
        setIntField(term193860, term193860.getClass(), "reincarnationNum", 138174044);
        setLongField(term193860, term193860.getClass(), "exp", 8489865307349190558L);
        setLongField(term193860, term193860.getClass(), "point", 3118512299469771622L);
        setLongField(term193860, term193860.getClass(), "totalPoint", 9087912550057530744L);
        setIntField(term193860, term193860.getClass(), "playCount", 2098822004);
        setIntField(term193860, term193860.getClass(), "jewelCount", 1036909188);
        setIntField(term193860, term193860.getClass(), "totalJewelCount", -665756018);
        setIntField(term193860, term193860.getClass(), "medalCount", -917715223);
        setIntField(term193860, term193860.getClass(), "playerRating", -1308205647);
        setIntField(term193860, term193860.getClass(), "highestRating", -293681660);
        setIntField(term193860, term193860.getClass(), "battlePoint", 2040935639);
        setIntField(term193860, term193860.getClass(), "bestBattlePoint", 1434805834);
        setIntField(term193860, term193860.getClass(), "overDamageBattlePoint", 1559405645);
        setBooleanField(term193860, term193860.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term193860, term193860.getClass(), "nameplateId", -2142714269);
        setIntField(term193860, term193860.getClass(), "trophyId", -1679293747);
        setIntField(term193860, term193860.getClass(), "cardId", -177429775);
        setIntField(term193860, term193860.getClass(), "characterId", 1499469166);
        setIntField(term193860, term193860.getClass(), "characterVoiceNo", 1077671885);
        setIntField(term193860, term193860.getClass(), "tabSetting", -1257764971);
        setIntField(term193860, term193860.getClass(), "tabSortSetting", 916858785);
        setIntField(term193860, term193860.getClass(), "cardCategorySetting", -334590639);
        setIntField(term193860, term193860.getClass(), "cardSortSetting", -1198749630);
        setIntField(term193860, term193860.getClass(), "rivalScoreCategorySetting", 677610694);
        setIntField(term193860, term193860.getClass(), "playedTutorialBit", 1557679938);
        setIntField(term193860, term193860.getClass(), "firstTutorialCancelNum", 855334801);
        setLongField(term193860, term193860.getClass(), "sumTechHighScore", 435597215139802942L);
        setLongField(term193860, term193860.getClass(), "sumTechBasicHighScore", -9100415003478673923L);
        setLongField(term193860, term193860.getClass(), "sumTechAdvancedHighScore", -8341553656242259319L);
        setLongField(term193860, term193860.getClass(), "sumTechExpertHighScore", -5748946727352721449L);
        setLongField(term193860, term193860.getClass(), "sumTechMasterHighScore", 1056742977375601296L);
        setLongField(term193860, term193860.getClass(), "sumTechLunaticHighScore", 4376993421044589576L);
        setLongField(term193860, term193860.getClass(), "sumBattleHighScore", -8863460315701340850L);
        setLongField(term193860, term193860.getClass(), "sumBattleBasicHighScore", 5596356954385929006L);
        setLongField(term193860, term193860.getClass(), "sumBattleAdvancedHighScore", 5939509709568012886L);
        setLongField(term193860, term193860.getClass(), "sumBattleExpertHighScore", 3985366149647872776L);
        setLongField(term193860, term193860.getClass(), "sumBattleMasterHighScore", 5631961646001874420L);
        setLongField(term193860, term193860.getClass(), "sumBattleLunaticHighScore", -7696618461813536712L);
        setField(term193860, term193860.getClass(), "eventWatchedDate", "iKFLWRLnlF");
        setField(term193860, term193860.getClass(), "cmEventWatchedDate", "KaapXeuyMz");
        setField(term193860, term193860.getClass(), "firstGameId", "EmBCkgfeeq");
        setField(term193860, term193860.getClass(), "firstRomVersion", "ykZFVwriEI");
        setField(term193860, term193860.getClass(), "firstDataVersion", "AehdHjTJCv");
        setField(term193860, term193860.getClass(), "firstPlayDate", "NuZjAOTYRg");
        setField(term193860, term193860.getClass(), "lastGameId", "NeaPAFTzux");
        setField(term193860, term193860.getClass(), "lastRomVersion", "hEkfLXneNw");
        setField(term193860, term193860.getClass(), "lastDataVersion", "RcaCLEZXeW");
        setField(term193860, term193860.getClass(), "compatibleCmVersion", "QkGvmhgHMp");
        setField(term193860, term193860.getClass(), "lastPlayDate", "LubciqAmSz");
        setIntField(term193860, term193860.getClass(), "lastPlaceId", 1952602505);
        setField(term193860, term193860.getClass(), "lastPlaceName", "cwOkbHJWZu");
        setIntField(term193860, term193860.getClass(), "lastRegionId", 2043628366);
        setField(term193860, term193860.getClass(), "lastRegionName", "zgUqpRpIHH");
        setIntField(term193860, term193860.getClass(), "lastAllNetId", 408680952);
        setField(term193860, term193860.getClass(), "lastClientId", "CKfRJfocoI");
        setIntField(term193860, term193860.getClass(), "lastUsedDeckId", -1373697880);
        setIntField(term193860, term193860.getClass(), "lastPlayMusicLevel", -1010160027);
        setIntField(term193860, term193860.getClass(), "lastEmoneyBrand", 768914070);
        setField(term193858, term193858.getClass(), "user", term193860);
        setIntField(term193858, term193858.getClass(), "sortNumber", -747888783);
        setIntField(term193858, term193858.getClass(), "placeId", -1751780426);
        setField(term193858, term193858.getClass(), "placeName", "NbBBkNIiQM");
        setField(term193858, term193858.getClass(), "playDate", "LCvTiyldNf");
        setField(term193858, term193858.getClass(), "userPlayDate", "ipjOaXsJXZ");
        setIntField(term193858, term193858.getClass(), "musicId", 795866886);
        setIntField(term193858, term193858.getClass(), "level", -2086380060);
        setIntField(term193858, term193858.getClass(), "playKind", -1408519554);
        setIntField(term193858, term193858.getClass(), "eventId", -110536575);
        setField(term193858, term193858.getClass(), "eventName", "sHLnLqlFRd");
        setIntField(term193858, term193858.getClass(), "eventPoint", 1514991810);
        setIntField(term193858, term193858.getClass(), "playedUserId1", 1319465985);
        setIntField(term193858, term193858.getClass(), "playedUserId2", 1160620517);
        setIntField(term193858, term193858.getClass(), "playedUserId3", -1359383108);
        setField(term193858, term193858.getClass(), "playedUserName1", "LewMqyEYKK");
        setField(term193858, term193858.getClass(), "playedUserName2", "XgJlOSXfAc");
        setField(term193858, term193858.getClass(), "playedUserName3", "DkeuJbjEvF");
        setIntField(term193858, term193858.getClass(), "playedMusicLevel1", -1158968060);
        setIntField(term193858, term193858.getClass(), "playedMusicLevel2", 1523461403);
        setIntField(term193858, term193858.getClass(), "playedMusicLevel3", -1777057164);
        setIntField(term193858, term193858.getClass(), "cardId1", -2007323764);
        setIntField(term193858, term193858.getClass(), "cardId2", 965628804);
        setIntField(term193858, term193858.getClass(), "cardId3", 1381817068);
        setIntField(term193858, term193858.getClass(), "cardLevel1", -1332097447);
        setIntField(term193858, term193858.getClass(), "cardLevel2", 453720647);
        setIntField(term193858, term193858.getClass(), "cardLevel3", 732312504);
        setIntField(term193858, term193858.getClass(), "cardAttack1", -883503334);
        setIntField(term193858, term193858.getClass(), "cardAttack2", -1620662863);
        setIntField(term193858, term193858.getClass(), "cardAttack3", -176182914);
        setIntField(term193858, term193858.getClass(), "bossCharaId", -623380087);
        setIntField(term193858, term193858.getClass(), "bossLevel", 1503970273);
        setIntField(term193858, term193858.getClass(), "bossAttribute", 1362955358);
        setIntField(term193858, term193858.getClass(), "clearStatus", -1235215555);
        setIntField(term193858, term193858.getClass(), "techScore", 1033361738);
        setIntField(term193858, term193858.getClass(), "techScoreRank", -2047169809);
        setIntField(term193858, term193858.getClass(), "battleScore", 1874665757);
        setIntField(term193858, term193858.getClass(), "battleScoreRank", 1160843153);
        setIntField(term193858, term193858.getClass(), "platinumScore", 1818052325);
        setIntField(term193858, term193858.getClass(), "maxCombo", -1003288946);
        setIntField(term193858, term193858.getClass(), "judgeMiss", -1148180010);
        setIntField(term193858, term193858.getClass(), "judgeHit", 751197258);
        setIntField(term193858, term193858.getClass(), "judgeBreak", -807367593);
        setIntField(term193858, term193858.getClass(), "judgeCriticalBreak", -1012649720);
        setIntField(term193858, term193858.getClass(), "rateTap", 1728827702);
        setIntField(term193858, term193858.getClass(), "rateHold", -125346559);
        setIntField(term193858, term193858.getClass(), "rateFlick", -705244323);
        setIntField(term193858, term193858.getClass(), "rateSideTap", 729298502);
        setIntField(term193858, term193858.getClass(), "rateSideHold", 273885563);
        setIntField(term193858, term193858.getClass(), "bellCount", -797466788);
        setIntField(term193858, term193858.getClass(), "totalBellCount", -222783889);
        setIntField(term193858, term193858.getClass(), "damageCount", 1517691834);
        setIntField(term193858, term193858.getClass(), "overDamage", -1509652338);
        setBooleanField(term193858, term193858.getClass(), "isTechNewRecord", false);
        setBooleanField(term193858, term193858.getClass(), "isBattleNewRecord", true);
        setBooleanField(term193858, term193858.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term193858, term193858.getClass(), "isFullCombo", true);
        setBooleanField(term193858, term193858.getClass(), "isFullBell", true);
        setBooleanField(term193858, term193858.getClass(), "isAllBreak", false);
        setIntField(term193858, term193858.getClass(), "playerRating", 1164414864);
        setIntField(term193858, term193858.getClass(), "battlePoint", -840323859);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlayedMusicLevel2", argTypes, term193858, args);
    }

};


