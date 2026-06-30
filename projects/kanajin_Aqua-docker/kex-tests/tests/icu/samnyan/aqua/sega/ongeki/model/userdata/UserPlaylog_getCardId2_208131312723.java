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

public class UserPlaylog_getCardId2_208131312723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195754;

    public UserPlaylog_getCardId2_208131312723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term195760 = new Long(-6771377873268167033L);
        term195754 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term195756 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term195758 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term195774 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term195775 = newInstance(Class.forName("java.time.LocalDate"));
        Object term195779 = newInstance(Class.forName("java.time.LocalTime"));
        Object term195784 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term195785 = newInstance(Class.forName("java.time.LocalDate"));
        Object term195789 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term195754, term195754.getClass(), "id", -3596938536596832444L);
        setLongField(term195756, term195756.getClass(), "id", -1797842954535180502L);
        setLongField(term195758, term195758.getClass(), "id", 5085145439270660528L);
        setField(term195758, term195758.getClass(), "extId", term195760);
        setField(term195758, term195758.getClass(), "luid", "AeWSoTUwRA");
        setIntField(term195775, term195775.getClass(), "year", 2029);
        setShortField(term195775, term195775.getClass(), "month", (short) 7);
        setShortField(term195775, term195775.getClass(), "day", (short) 8);
        setField(term195774, term195774.getClass(), "date", term195775);
        setByteField(term195779, term195779.getClass(), "hour", (byte) 17);
        setByteField(term195779, term195779.getClass(), "minute", (byte) 0);
        setByteField(term195779, term195779.getClass(), "second", (byte) 26);
        setIntField(term195779, term195779.getClass(), "nano", 789866170);
        setField(term195774, term195774.getClass(), "time", term195779);
        setField(term195758, term195758.getClass(), "registerTime", term195774);
        setIntField(term195785, term195785.getClass(), "year", 2010);
        setShortField(term195785, term195785.getClass(), "month", (short) 3);
        setShortField(term195785, term195785.getClass(), "day", (short) 28);
        setField(term195784, term195784.getClass(), "date", term195785);
        setByteField(term195789, term195789.getClass(), "hour", (byte) 22);
        setByteField(term195789, term195789.getClass(), "minute", (byte) 36);
        setByteField(term195789, term195789.getClass(), "second", (byte) 47);
        setIntField(term195789, term195789.getClass(), "nano", 84020683);
        setField(term195784, term195784.getClass(), "time", term195789);
        setField(term195758, term195758.getClass(), "accessTime", term195784);
        setField(term195756, term195756.getClass(), "card", term195758);
        setField(term195756, term195756.getClass(), "userName", "ZTEthYchAw");
        setIntField(term195756, term195756.getClass(), "level", 1886181117);
        setIntField(term195756, term195756.getClass(), "reincarnationNum", -229212246);
        setLongField(term195756, term195756.getClass(), "exp", -216354790449682867L);
        setLongField(term195756, term195756.getClass(), "point", -6431976207234103411L);
        setLongField(term195756, term195756.getClass(), "totalPoint", -9057221647436792958L);
        setIntField(term195756, term195756.getClass(), "playCount", 1726721533);
        setIntField(term195756, term195756.getClass(), "jewelCount", -328854592);
        setIntField(term195756, term195756.getClass(), "totalJewelCount", 765971129);
        setIntField(term195756, term195756.getClass(), "medalCount", -385727798);
        setIntField(term195756, term195756.getClass(), "playerRating", -1441415289);
        setIntField(term195756, term195756.getClass(), "highestRating", 1081832872);
        setIntField(term195756, term195756.getClass(), "battlePoint", 1527144504);
        setIntField(term195756, term195756.getClass(), "bestBattlePoint", -305521619);
        setIntField(term195756, term195756.getClass(), "overDamageBattlePoint", 1558553527);
        setBooleanField(term195756, term195756.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term195756, term195756.getClass(), "nameplateId", 1188990535);
        setIntField(term195756, term195756.getClass(), "trophyId", 689009965);
        setIntField(term195756, term195756.getClass(), "cardId", -2009346803);
        setIntField(term195756, term195756.getClass(), "characterId", -2051224822);
        setIntField(term195756, term195756.getClass(), "characterVoiceNo", -1813553660);
        setIntField(term195756, term195756.getClass(), "tabSetting", -445217633);
        setIntField(term195756, term195756.getClass(), "tabSortSetting", 690419752);
        setIntField(term195756, term195756.getClass(), "cardCategorySetting", 1627284280);
        setIntField(term195756, term195756.getClass(), "cardSortSetting", 1035639148);
        setIntField(term195756, term195756.getClass(), "rivalScoreCategorySetting", 1771438538);
        setIntField(term195756, term195756.getClass(), "playedTutorialBit", -1525502762);
        setIntField(term195756, term195756.getClass(), "firstTutorialCancelNum", -1367374151);
        setLongField(term195756, term195756.getClass(), "sumTechHighScore", 32699801922453948L);
        setLongField(term195756, term195756.getClass(), "sumTechBasicHighScore", 9081266835172965310L);
        setLongField(term195756, term195756.getClass(), "sumTechAdvancedHighScore", -1939415730414453995L);
        setLongField(term195756, term195756.getClass(), "sumTechExpertHighScore", -5480976673394990987L);
        setLongField(term195756, term195756.getClass(), "sumTechMasterHighScore", -9100781948139007606L);
        setLongField(term195756, term195756.getClass(), "sumTechLunaticHighScore", 8661991517094324064L);
        setLongField(term195756, term195756.getClass(), "sumBattleHighScore", -1255459205853812L);
        setLongField(term195756, term195756.getClass(), "sumBattleBasicHighScore", -8622451911645844864L);
        setLongField(term195756, term195756.getClass(), "sumBattleAdvancedHighScore", -5209251799792098387L);
        setLongField(term195756, term195756.getClass(), "sumBattleExpertHighScore", 7336488459740623969L);
        setLongField(term195756, term195756.getClass(), "sumBattleMasterHighScore", 5855613033594383494L);
        setLongField(term195756, term195756.getClass(), "sumBattleLunaticHighScore", -8527077201967819613L);
        setField(term195756, term195756.getClass(), "eventWatchedDate", "UdJqWTHzOr");
        setField(term195756, term195756.getClass(), "cmEventWatchedDate", "DFGffKuOfF");
        setField(term195756, term195756.getClass(), "firstGameId", "TffThgtQnv");
        setField(term195756, term195756.getClass(), "firstRomVersion", "NlcebRYnMU");
        setField(term195756, term195756.getClass(), "firstDataVersion", "ADJcXLhkFl");
        setField(term195756, term195756.getClass(), "firstPlayDate", "hEalbSlUZq");
        setField(term195756, term195756.getClass(), "lastGameId", "niwRkgdxxB");
        setField(term195756, term195756.getClass(), "lastRomVersion", "zOnynkzVWs");
        setField(term195756, term195756.getClass(), "lastDataVersion", "fbtxuXrswv");
        setField(term195756, term195756.getClass(), "compatibleCmVersion", "AVNpxJpLUg");
        setField(term195756, term195756.getClass(), "lastPlayDate", "EctkTjchvO");
        setIntField(term195756, term195756.getClass(), "lastPlaceId", -445744026);
        setField(term195756, term195756.getClass(), "lastPlaceName", "LljMIcuwMs");
        setIntField(term195756, term195756.getClass(), "lastRegionId", -522060478);
        setField(term195756, term195756.getClass(), "lastRegionName", "nSWahtrNVT");
        setIntField(term195756, term195756.getClass(), "lastAllNetId", 672665437);
        setField(term195756, term195756.getClass(), "lastClientId", "PYmIjEltho");
        setIntField(term195756, term195756.getClass(), "lastUsedDeckId", -28548982);
        setIntField(term195756, term195756.getClass(), "lastPlayMusicLevel", 1976376491);
        setIntField(term195756, term195756.getClass(), "lastEmoneyBrand", 849311838);
        setField(term195754, term195754.getClass(), "user", term195756);
        setIntField(term195754, term195754.getClass(), "sortNumber", -2041662844);
        setIntField(term195754, term195754.getClass(), "placeId", 867518512);
        setField(term195754, term195754.getClass(), "placeName", "jiAsxcVyvN");
        setField(term195754, term195754.getClass(), "playDate", "njdpYDiOgM");
        setField(term195754, term195754.getClass(), "userPlayDate", "OonsTibEEi");
        setIntField(term195754, term195754.getClass(), "musicId", 46460788);
        setIntField(term195754, term195754.getClass(), "level", -1763767597);
        setIntField(term195754, term195754.getClass(), "playKind", -106138011);
        setIntField(term195754, term195754.getClass(), "eventId", -1019012612);
        setField(term195754, term195754.getClass(), "eventName", "MofINVJXAB");
        setIntField(term195754, term195754.getClass(), "eventPoint", 141522548);
        setIntField(term195754, term195754.getClass(), "playedUserId1", 1957150366);
        setIntField(term195754, term195754.getClass(), "playedUserId2", -1442578297);
        setIntField(term195754, term195754.getClass(), "playedUserId3", 1147293585);
        setField(term195754, term195754.getClass(), "playedUserName1", "BFOFBBxXhO");
        setField(term195754, term195754.getClass(), "playedUserName2", "yfmCLlSOac");
        setField(term195754, term195754.getClass(), "playedUserName3", "cpUpqBOQUF");
        setIntField(term195754, term195754.getClass(), "playedMusicLevel1", 983648264);
        setIntField(term195754, term195754.getClass(), "playedMusicLevel2", -778484185);
        setIntField(term195754, term195754.getClass(), "playedMusicLevel3", 317333804);
        setIntField(term195754, term195754.getClass(), "cardId1", 780704931);
        setIntField(term195754, term195754.getClass(), "cardId2", 1433790124);
        setIntField(term195754, term195754.getClass(), "cardId3", -134680413);
        setIntField(term195754, term195754.getClass(), "cardLevel1", 1593555430);
        setIntField(term195754, term195754.getClass(), "cardLevel2", 1804669953);
        setIntField(term195754, term195754.getClass(), "cardLevel3", -813884495);
        setIntField(term195754, term195754.getClass(), "cardAttack1", -915472199);
        setIntField(term195754, term195754.getClass(), "cardAttack2", -712836753);
        setIntField(term195754, term195754.getClass(), "cardAttack3", 2051479764);
        setIntField(term195754, term195754.getClass(), "bossCharaId", -967390932);
        setIntField(term195754, term195754.getClass(), "bossLevel", -1594865304);
        setIntField(term195754, term195754.getClass(), "bossAttribute", 1209270458);
        setIntField(term195754, term195754.getClass(), "clearStatus", 1557700648);
        setIntField(term195754, term195754.getClass(), "techScore", 166029105);
        setIntField(term195754, term195754.getClass(), "techScoreRank", -139840217);
        setIntField(term195754, term195754.getClass(), "battleScore", 648430917);
        setIntField(term195754, term195754.getClass(), "battleScoreRank", 1936492204);
        setIntField(term195754, term195754.getClass(), "platinumScore", 1208918081);
        setIntField(term195754, term195754.getClass(), "maxCombo", -444228787);
        setIntField(term195754, term195754.getClass(), "judgeMiss", 858866865);
        setIntField(term195754, term195754.getClass(), "judgeHit", -1549664587);
        setIntField(term195754, term195754.getClass(), "judgeBreak", 1048887552);
        setIntField(term195754, term195754.getClass(), "judgeCriticalBreak", 1614219187);
        setIntField(term195754, term195754.getClass(), "rateTap", 1059610003);
        setIntField(term195754, term195754.getClass(), "rateHold", 109730440);
        setIntField(term195754, term195754.getClass(), "rateFlick", -1467289814);
        setIntField(term195754, term195754.getClass(), "rateSideTap", 35215511);
        setIntField(term195754, term195754.getClass(), "rateSideHold", -2036670068);
        setIntField(term195754, term195754.getClass(), "bellCount", -2013350184);
        setIntField(term195754, term195754.getClass(), "totalBellCount", -1219404857);
        setIntField(term195754, term195754.getClass(), "damageCount", 2121914051);
        setIntField(term195754, term195754.getClass(), "overDamage", 192590998);
        setBooleanField(term195754, term195754.getClass(), "isTechNewRecord", false);
        setBooleanField(term195754, term195754.getClass(), "isBattleNewRecord", true);
        setBooleanField(term195754, term195754.getClass(), "isOverDamageNewRecord", true);
        setBooleanField(term195754, term195754.getClass(), "isFullCombo", true);
        setBooleanField(term195754, term195754.getClass(), "isFullBell", false);
        setBooleanField(term195754, term195754.getClass(), "isAllBreak", true);
        setIntField(term195754, term195754.getClass(), "playerRating", -263763571);
        setIntField(term195754, term195754.getClass(), "battlePoint", 329639070);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCardId2", argTypes, term195754, args);
    }

};


