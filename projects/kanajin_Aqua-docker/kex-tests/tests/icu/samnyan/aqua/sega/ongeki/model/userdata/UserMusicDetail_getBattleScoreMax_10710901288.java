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

public class UserMusicDetail_getBattleScoreMax_10710901288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407258;

    public UserMusicDetail_getBattleScoreMax_10710901288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term407264 = new Long(2947576061864407618L);
        term407258 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term407260 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term407262 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term407278 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term407279 = newInstance(Class.forName("java.time.LocalDate"));
        Object term407283 = newInstance(Class.forName("java.time.LocalTime"));
        Object term407288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term407289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term407293 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term407258, term407258.getClass(), "id", 6332564091028476882L);
        setLongField(term407260, term407260.getClass(), "id", -8468127981775383720L);
        setLongField(term407262, term407262.getClass(), "id", -4022913440181089712L);
        setField(term407262, term407262.getClass(), "extId", term407264);
        setField(term407262, term407262.getClass(), "luid", "IFVEFNDZMl");
        setIntField(term407279, term407279.getClass(), "year", 2013);
        setShortField(term407279, term407279.getClass(), "month", (short) 11);
        setShortField(term407279, term407279.getClass(), "day", (short) 16);
        setField(term407278, term407278.getClass(), "date", term407279);
        setByteField(term407283, term407283.getClass(), "hour", (byte) 9);
        setByteField(term407283, term407283.getClass(), "minute", (byte) 35);
        setByteField(term407283, term407283.getClass(), "second", (byte) 15);
        setIntField(term407283, term407283.getClass(), "nano", 916926372);
        setField(term407278, term407278.getClass(), "time", term407283);
        setField(term407262, term407262.getClass(), "registerTime", term407278);
        setIntField(term407289, term407289.getClass(), "year", 2017);
        setShortField(term407289, term407289.getClass(), "month", (short) 2);
        setShortField(term407289, term407289.getClass(), "day", (short) 22);
        setField(term407288, term407288.getClass(), "date", term407289);
        setByteField(term407293, term407293.getClass(), "hour", (byte) 20);
        setByteField(term407293, term407293.getClass(), "minute", (byte) 59);
        setByteField(term407293, term407293.getClass(), "second", (byte) 8);
        setIntField(term407293, term407293.getClass(), "nano", 864237115);
        setField(term407288, term407288.getClass(), "time", term407293);
        setField(term407262, term407262.getClass(), "accessTime", term407288);
        setField(term407260, term407260.getClass(), "card", term407262);
        setField(term407260, term407260.getClass(), "userName", "xaxkXOwUKv");
        setIntField(term407260, term407260.getClass(), "level", -1940928883);
        setIntField(term407260, term407260.getClass(), "reincarnationNum", -1276130271);
        setLongField(term407260, term407260.getClass(), "exp", -4176652691249199259L);
        setLongField(term407260, term407260.getClass(), "point", -5281821170218750265L);
        setLongField(term407260, term407260.getClass(), "totalPoint", 3385472837842448275L);
        setIntField(term407260, term407260.getClass(), "playCount", -383213277);
        setIntField(term407260, term407260.getClass(), "jewelCount", 999697505);
        setIntField(term407260, term407260.getClass(), "totalJewelCount", 150686833);
        setIntField(term407260, term407260.getClass(), "medalCount", 864168728);
        setIntField(term407260, term407260.getClass(), "playerRating", 1180105702);
        setIntField(term407260, term407260.getClass(), "highestRating", -1878381412);
        setIntField(term407260, term407260.getClass(), "battlePoint", -34121525);
        setIntField(term407260, term407260.getClass(), "bestBattlePoint", -1065997660);
        setIntField(term407260, term407260.getClass(), "overDamageBattlePoint", 271210168);
        setBooleanField(term407260, term407260.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term407260, term407260.getClass(), "nameplateId", 265269699);
        setIntField(term407260, term407260.getClass(), "trophyId", 1561132977);
        setIntField(term407260, term407260.getClass(), "cardId", 1473482271);
        setIntField(term407260, term407260.getClass(), "characterId", 1786791150);
        setIntField(term407260, term407260.getClass(), "characterVoiceNo", 552395732);
        setIntField(term407260, term407260.getClass(), "tabSetting", -1146717028);
        setIntField(term407260, term407260.getClass(), "tabSortSetting", 211945894);
        setIntField(term407260, term407260.getClass(), "cardCategorySetting", 1880187411);
        setIntField(term407260, term407260.getClass(), "cardSortSetting", 211894515);
        setIntField(term407260, term407260.getClass(), "rivalScoreCategorySetting", 38698331);
        setIntField(term407260, term407260.getClass(), "playedTutorialBit", -815569924);
        setIntField(term407260, term407260.getClass(), "firstTutorialCancelNum", -770402311);
        setLongField(term407260, term407260.getClass(), "sumTechHighScore", -7404536129809980737L);
        setLongField(term407260, term407260.getClass(), "sumTechBasicHighScore", 2669208122397609272L);
        setLongField(term407260, term407260.getClass(), "sumTechAdvancedHighScore", 176806626668624673L);
        setLongField(term407260, term407260.getClass(), "sumTechExpertHighScore", -3699280856911503290L);
        setLongField(term407260, term407260.getClass(), "sumTechMasterHighScore", -3180129706405729726L);
        setLongField(term407260, term407260.getClass(), "sumTechLunaticHighScore", 5775461462976695025L);
        setLongField(term407260, term407260.getClass(), "sumBattleHighScore", 6397334634655139359L);
        setLongField(term407260, term407260.getClass(), "sumBattleBasicHighScore", -4344083315626652780L);
        setLongField(term407260, term407260.getClass(), "sumBattleAdvancedHighScore", -3763600317941289238L);
        setLongField(term407260, term407260.getClass(), "sumBattleExpertHighScore", 5244740187149398229L);
        setLongField(term407260, term407260.getClass(), "sumBattleMasterHighScore", 718471511380285893L);
        setLongField(term407260, term407260.getClass(), "sumBattleLunaticHighScore", -3607019980089365498L);
        setField(term407260, term407260.getClass(), "eventWatchedDate", "HJlhgbaeqn");
        setField(term407260, term407260.getClass(), "cmEventWatchedDate", "ENffuBPXZj");
        setField(term407260, term407260.getClass(), "firstGameId", "zPsAplltLt");
        setField(term407260, term407260.getClass(), "firstRomVersion", "HajaLOPFsR");
        setField(term407260, term407260.getClass(), "firstDataVersion", "ikxMPUxJFX");
        setField(term407260, term407260.getClass(), "firstPlayDate", "dLJNGpWIlg");
        setField(term407260, term407260.getClass(), "lastGameId", "OnhhZIBLqR");
        setField(term407260, term407260.getClass(), "lastRomVersion", "XFpoJoywOI");
        setField(term407260, term407260.getClass(), "lastDataVersion", "BglfbvfWgG");
        setField(term407260, term407260.getClass(), "compatibleCmVersion", "PXiaXMqzty");
        setField(term407260, term407260.getClass(), "lastPlayDate", "LGwLUzZKHm");
        setIntField(term407260, term407260.getClass(), "lastPlaceId", -1689228293);
        setField(term407260, term407260.getClass(), "lastPlaceName", "uMFXSZEaEC");
        setIntField(term407260, term407260.getClass(), "lastRegionId", -1629181877);
        setField(term407260, term407260.getClass(), "lastRegionName", "gqOVtOuXOQ");
        setIntField(term407260, term407260.getClass(), "lastAllNetId", -822914387);
        setField(term407260, term407260.getClass(), "lastClientId", "QFBiBufEhK");
        setIntField(term407260, term407260.getClass(), "lastUsedDeckId", 1619538448);
        setIntField(term407260, term407260.getClass(), "lastPlayMusicLevel", 1819074357);
        setIntField(term407260, term407260.getClass(), "lastEmoneyBrand", -1797795387);
        setField(term407258, term407258.getClass(), "user", term407260);
        setIntField(term407258, term407258.getClass(), "musicId", -1941539722);
        setIntField(term407258, term407258.getClass(), "level", -1817685510);
        setIntField(term407258, term407258.getClass(), "playCount", -1156282522);
        setIntField(term407258, term407258.getClass(), "techScoreMax", 1187615958);
        setIntField(term407258, term407258.getClass(), "techScoreRank", -1909191196);
        setIntField(term407258, term407258.getClass(), "battleScoreMax", 2004851038);
        setIntField(term407258, term407258.getClass(), "battleScoreRank", 179145486);
        setIntField(term407258, term407258.getClass(), "maxComboCount", 2064007989);
        setIntField(term407258, term407258.getClass(), "maxOverKill", -687051718);
        setIntField(term407258, term407258.getClass(), "maxTeamOverKill", -1141367557);
        setBooleanField(term407258, term407258.getClass(), "isFullBell", true);
        setBooleanField(term407258, term407258.getClass(), "isFullCombo", false);
        setBooleanField(term407258, term407258.getClass(), "isAllBreake", false);
        setBooleanField(term407258, term407258.getClass(), "isLock", false);
        setIntField(term407258, term407258.getClass(), "clearStatus", -1494105617);
        setBooleanField(term407258, term407258.getClass(), "isStoryWatched", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBattleScoreMax", argTypes, term407258, args);
    }

};


