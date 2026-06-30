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

public class UserPlaylog_setUserPlayDate_142815156268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224667;

    public UserPlaylog_setUserPlayDate_142815156268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term224673 = new Long(8171709541116491249L);
        term224667 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog"));
        Object term224669 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term224671 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term224687 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term224688 = newInstance(Class.forName("java.time.LocalDate"));
        Object term224692 = newInstance(Class.forName("java.time.LocalTime"));
        Object term224697 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term224698 = newInstance(Class.forName("java.time.LocalDate"));
        Object term224702 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term224667, term224667.getClass(), "id", 4287586709773001634L);
        setLongField(term224669, term224669.getClass(), "id", 6487318804597750757L);
        setLongField(term224671, term224671.getClass(), "id", -6169633255646330032L);
        setField(term224671, term224671.getClass(), "extId", term224673);
        setField(term224671, term224671.getClass(), "luid", "tjPkQolRer");
        setIntField(term224688, term224688.getClass(), "year", 2019);
        setShortField(term224688, term224688.getClass(), "month", (short) 1);
        setShortField(term224688, term224688.getClass(), "day", (short) 9);
        setField(term224687, term224687.getClass(), "date", term224688);
        setByteField(term224692, term224692.getClass(), "hour", (byte) 16);
        setByteField(term224692, term224692.getClass(), "minute", (byte) 39);
        setByteField(term224692, term224692.getClass(), "second", (byte) 1);
        setIntField(term224692, term224692.getClass(), "nano", 715938448);
        setField(term224687, term224687.getClass(), "time", term224692);
        setField(term224671, term224671.getClass(), "registerTime", term224687);
        setIntField(term224698, term224698.getClass(), "year", 2014);
        setShortField(term224698, term224698.getClass(), "month", (short) 8);
        setShortField(term224698, term224698.getClass(), "day", (short) 3);
        setField(term224697, term224697.getClass(), "date", term224698);
        setByteField(term224702, term224702.getClass(), "hour", (byte) 5);
        setByteField(term224702, term224702.getClass(), "minute", (byte) 41);
        setByteField(term224702, term224702.getClass(), "second", (byte) 29);
        setIntField(term224702, term224702.getClass(), "nano", 782499753);
        setField(term224697, term224697.getClass(), "time", term224702);
        setField(term224671, term224671.getClass(), "accessTime", term224697);
        setField(term224669, term224669.getClass(), "card", term224671);
        setField(term224669, term224669.getClass(), "userName", "ngoLwQfpWZ");
        setIntField(term224669, term224669.getClass(), "level", -56413483);
        setIntField(term224669, term224669.getClass(), "reincarnationNum", -1181416306);
        setLongField(term224669, term224669.getClass(), "exp", 9021246435004265845L);
        setLongField(term224669, term224669.getClass(), "point", 6778552590643258245L);
        setLongField(term224669, term224669.getClass(), "totalPoint", 352340789523283657L);
        setIntField(term224669, term224669.getClass(), "playCount", 2099316913);
        setIntField(term224669, term224669.getClass(), "jewelCount", -992105490);
        setIntField(term224669, term224669.getClass(), "totalJewelCount", -1449542606);
        setIntField(term224669, term224669.getClass(), "medalCount", 406259462);
        setIntField(term224669, term224669.getClass(), "playerRating", 660518206);
        setIntField(term224669, term224669.getClass(), "highestRating", -2010658317);
        setIntField(term224669, term224669.getClass(), "battlePoint", -2061982603);
        setIntField(term224669, term224669.getClass(), "bestBattlePoint", -1288997751);
        setIntField(term224669, term224669.getClass(), "overDamageBattlePoint", -218628475);
        setBooleanField(term224669, term224669.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term224669, term224669.getClass(), "nameplateId", 704093413);
        setIntField(term224669, term224669.getClass(), "trophyId", 718574088);
        setIntField(term224669, term224669.getClass(), "cardId", -1983026826);
        setIntField(term224669, term224669.getClass(), "characterId", 340317830);
        setIntField(term224669, term224669.getClass(), "characterVoiceNo", -1778062754);
        setIntField(term224669, term224669.getClass(), "tabSetting", 656886359);
        setIntField(term224669, term224669.getClass(), "tabSortSetting", -1737586602);
        setIntField(term224669, term224669.getClass(), "cardCategorySetting", -11215244);
        setIntField(term224669, term224669.getClass(), "cardSortSetting", -256225420);
        setIntField(term224669, term224669.getClass(), "rivalScoreCategorySetting", 42031743);
        setIntField(term224669, term224669.getClass(), "playedTutorialBit", 1933411977);
        setIntField(term224669, term224669.getClass(), "firstTutorialCancelNum", 1568448645);
        setLongField(term224669, term224669.getClass(), "sumTechHighScore", -1389742897647499895L);
        setLongField(term224669, term224669.getClass(), "sumTechBasicHighScore", -4514685666838021557L);
        setLongField(term224669, term224669.getClass(), "sumTechAdvancedHighScore", -1524319921359252588L);
        setLongField(term224669, term224669.getClass(), "sumTechExpertHighScore", 3056150772313842329L);
        setLongField(term224669, term224669.getClass(), "sumTechMasterHighScore", -7964241973359208080L);
        setLongField(term224669, term224669.getClass(), "sumTechLunaticHighScore", 7493969068239760848L);
        setLongField(term224669, term224669.getClass(), "sumBattleHighScore", -1548136159315598499L);
        setLongField(term224669, term224669.getClass(), "sumBattleBasicHighScore", 1158498282680574220L);
        setLongField(term224669, term224669.getClass(), "sumBattleAdvancedHighScore", 7959062947136513844L);
        setLongField(term224669, term224669.getClass(), "sumBattleExpertHighScore", -6883642291310553041L);
        setLongField(term224669, term224669.getClass(), "sumBattleMasterHighScore", -7172575525075313714L);
        setLongField(term224669, term224669.getClass(), "sumBattleLunaticHighScore", 1068510258925618658L);
        setField(term224669, term224669.getClass(), "eventWatchedDate", "uTWBfvAsyO");
        setField(term224669, term224669.getClass(), "cmEventWatchedDate", "PjflZBjLQm");
        setField(term224669, term224669.getClass(), "firstGameId", "vKTFdmINnO");
        setField(term224669, term224669.getClass(), "firstRomVersion", "yluqSskhal");
        setField(term224669, term224669.getClass(), "firstDataVersion", "eqfsGIytdB");
        setField(term224669, term224669.getClass(), "firstPlayDate", "LKQjNTptZn");
        setField(term224669, term224669.getClass(), "lastGameId", "tKBauOxKfc");
        setField(term224669, term224669.getClass(), "lastRomVersion", "iAYffLkiOU");
        setField(term224669, term224669.getClass(), "lastDataVersion", "EImxDcfgVv");
        setField(term224669, term224669.getClass(), "compatibleCmVersion", "IppSJALLml");
        setField(term224669, term224669.getClass(), "lastPlayDate", "eMvdmaaxyJ");
        setIntField(term224669, term224669.getClass(), "lastPlaceId", 784553974);
        setField(term224669, term224669.getClass(), "lastPlaceName", "DzDqqkuTQG");
        setIntField(term224669, term224669.getClass(), "lastRegionId", -595519675);
        setField(term224669, term224669.getClass(), "lastRegionName", "MMwjHFVUHz");
        setIntField(term224669, term224669.getClass(), "lastAllNetId", -2047451359);
        setField(term224669, term224669.getClass(), "lastClientId", "ulHIZcfbJZ");
        setIntField(term224669, term224669.getClass(), "lastUsedDeckId", 460067592);
        setIntField(term224669, term224669.getClass(), "lastPlayMusicLevel", 2077115892);
        setIntField(term224669, term224669.getClass(), "lastEmoneyBrand", -1419433911);
        setField(term224667, term224667.getClass(), "user", term224669);
        setIntField(term224667, term224667.getClass(), "sortNumber", 1822969869);
        setIntField(term224667, term224667.getClass(), "placeId", -1408911173);
        setField(term224667, term224667.getClass(), "placeName", "FOCcfSPbbu");
        setField(term224667, term224667.getClass(), "playDate", "UPmwujGhlc");
        setField(term224667, term224667.getClass(), "userPlayDate", "pQdTbZcdsU");
        setIntField(term224667, term224667.getClass(), "musicId", -1658565244);
        setIntField(term224667, term224667.getClass(), "level", 222302842);
        setIntField(term224667, term224667.getClass(), "playKind", -1879308935);
        setIntField(term224667, term224667.getClass(), "eventId", 1433334366);
        setField(term224667, term224667.getClass(), "eventName", "zYbZAMKJJx");
        setIntField(term224667, term224667.getClass(), "eventPoint", 1570982083);
        setIntField(term224667, term224667.getClass(), "playedUserId1", 79001036);
        setIntField(term224667, term224667.getClass(), "playedUserId2", -2128177291);
        setIntField(term224667, term224667.getClass(), "playedUserId3", -1298705021);
        setField(term224667, term224667.getClass(), "playedUserName1", "UbkdwQOyIg");
        setField(term224667, term224667.getClass(), "playedUserName2", "dFXhuubrpE");
        setField(term224667, term224667.getClass(), "playedUserName3", "fPBxFWEXsZ");
        setIntField(term224667, term224667.getClass(), "playedMusicLevel1", 802170906);
        setIntField(term224667, term224667.getClass(), "playedMusicLevel2", 39907880);
        setIntField(term224667, term224667.getClass(), "playedMusicLevel3", 358366676);
        setIntField(term224667, term224667.getClass(), "cardId1", -18998104);
        setIntField(term224667, term224667.getClass(), "cardId2", -1335254334);
        setIntField(term224667, term224667.getClass(), "cardId3", 2039605156);
        setIntField(term224667, term224667.getClass(), "cardLevel1", -1335894442);
        setIntField(term224667, term224667.getClass(), "cardLevel2", 269878407);
        setIntField(term224667, term224667.getClass(), "cardLevel3", 1951853449);
        setIntField(term224667, term224667.getClass(), "cardAttack1", -1576630796);
        setIntField(term224667, term224667.getClass(), "cardAttack2", -1476732663);
        setIntField(term224667, term224667.getClass(), "cardAttack3", 1985555115);
        setIntField(term224667, term224667.getClass(), "bossCharaId", 2017881557);
        setIntField(term224667, term224667.getClass(), "bossLevel", 1409539871);
        setIntField(term224667, term224667.getClass(), "bossAttribute", -252004629);
        setIntField(term224667, term224667.getClass(), "clearStatus", 1176748358);
        setIntField(term224667, term224667.getClass(), "techScore", -888350999);
        setIntField(term224667, term224667.getClass(), "techScoreRank", 2010116469);
        setIntField(term224667, term224667.getClass(), "battleScore", 564948);
        setIntField(term224667, term224667.getClass(), "battleScoreRank", -515527615);
        setIntField(term224667, term224667.getClass(), "platinumScore", 1444212583);
        setIntField(term224667, term224667.getClass(), "maxCombo", -663888705);
        setIntField(term224667, term224667.getClass(), "judgeMiss", -1081559918);
        setIntField(term224667, term224667.getClass(), "judgeHit", 1135106965);
        setIntField(term224667, term224667.getClass(), "judgeBreak", 1832192277);
        setIntField(term224667, term224667.getClass(), "judgeCriticalBreak", 1254864568);
        setIntField(term224667, term224667.getClass(), "rateTap", -571619755);
        setIntField(term224667, term224667.getClass(), "rateHold", 451376857);
        setIntField(term224667, term224667.getClass(), "rateFlick", -1991834397);
        setIntField(term224667, term224667.getClass(), "rateSideTap", -1181437252);
        setIntField(term224667, term224667.getClass(), "rateSideHold", 1473244237);
        setIntField(term224667, term224667.getClass(), "bellCount", 1217408539);
        setIntField(term224667, term224667.getClass(), "totalBellCount", -80988884);
        setIntField(term224667, term224667.getClass(), "damageCount", 1775341759);
        setIntField(term224667, term224667.getClass(), "overDamage", -1260716399);
        setBooleanField(term224667, term224667.getClass(), "isTechNewRecord", true);
        setBooleanField(term224667, term224667.getClass(), "isBattleNewRecord", true);
        setBooleanField(term224667, term224667.getClass(), "isOverDamageNewRecord", false);
        setBooleanField(term224667, term224667.getClass(), "isFullCombo", true);
        setBooleanField(term224667, term224667.getClass(), "isFullBell", true);
        setBooleanField(term224667, term224667.getClass(), "isAllBreak", false);
        setIntField(term224667, term224667.getClass(), "playerRating", 2009351154);
        setIntField(term224667, term224667.getClass(), "battlePoint", -1078550468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserPlaylog");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DTSquzpmAy";
        callMethod(klass, "setUserPlayDate", argTypes, term224667, args);
    }

};


