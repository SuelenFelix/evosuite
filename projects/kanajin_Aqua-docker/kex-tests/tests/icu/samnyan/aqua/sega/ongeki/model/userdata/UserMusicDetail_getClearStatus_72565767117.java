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

public class UserMusicDetail_getClearStatus_72565767117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term411227;

    public UserMusicDetail_getClearStatus_72565767117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term411233 = new Long(-1572808624189549793L);
        term411227 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term411229 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term411231 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term411247 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term411248 = newInstance(Class.forName("java.time.LocalDate"));
        Object term411252 = newInstance(Class.forName("java.time.LocalTime"));
        Object term411257 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term411258 = newInstance(Class.forName("java.time.LocalDate"));
        Object term411262 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term411227, term411227.getClass(), "id", 5530179165032073132L);
        setLongField(term411229, term411229.getClass(), "id", 7305696443956691772L);
        setLongField(term411231, term411231.getClass(), "id", 7711406235394105090L);
        setField(term411231, term411231.getClass(), "extId", term411233);
        setField(term411231, term411231.getClass(), "luid", "rndVJUzYOO");
        setIntField(term411248, term411248.getClass(), "year", 2028);
        setShortField(term411248, term411248.getClass(), "month", (short) 12);
        setShortField(term411248, term411248.getClass(), "day", (short) 20);
        setField(term411247, term411247.getClass(), "date", term411248);
        setByteField(term411252, term411252.getClass(), "hour", (byte) 12);
        setByteField(term411252, term411252.getClass(), "minute", (byte) 48);
        setByteField(term411252, term411252.getClass(), "second", (byte) 30);
        setIntField(term411252, term411252.getClass(), "nano", 705822721);
        setField(term411247, term411247.getClass(), "time", term411252);
        setField(term411231, term411231.getClass(), "registerTime", term411247);
        setIntField(term411258, term411258.getClass(), "year", 2028);
        setShortField(term411258, term411258.getClass(), "month", (short) 2);
        setShortField(term411258, term411258.getClass(), "day", (short) 23);
        setField(term411257, term411257.getClass(), "date", term411258);
        setByteField(term411262, term411262.getClass(), "hour", (byte) 17);
        setByteField(term411262, term411262.getClass(), "minute", (byte) 22);
        setByteField(term411262, term411262.getClass(), "second", (byte) 34);
        setIntField(term411262, term411262.getClass(), "nano", 275159007);
        setField(term411257, term411257.getClass(), "time", term411262);
        setField(term411231, term411231.getClass(), "accessTime", term411257);
        setField(term411229, term411229.getClass(), "card", term411231);
        setField(term411229, term411229.getClass(), "userName", "lGpjITBixi");
        setIntField(term411229, term411229.getClass(), "level", 482389218);
        setIntField(term411229, term411229.getClass(), "reincarnationNum", -1744732128);
        setLongField(term411229, term411229.getClass(), "exp", -4103673992358233807L);
        setLongField(term411229, term411229.getClass(), "point", 3030664385650897099L);
        setLongField(term411229, term411229.getClass(), "totalPoint", -7343913825919302944L);
        setIntField(term411229, term411229.getClass(), "playCount", 176852695);
        setIntField(term411229, term411229.getClass(), "jewelCount", -840575042);
        setIntField(term411229, term411229.getClass(), "totalJewelCount", -1995494660);
        setIntField(term411229, term411229.getClass(), "medalCount", 1810484774);
        setIntField(term411229, term411229.getClass(), "playerRating", 763497280);
        setIntField(term411229, term411229.getClass(), "highestRating", -84479766);
        setIntField(term411229, term411229.getClass(), "battlePoint", 1487222640);
        setIntField(term411229, term411229.getClass(), "bestBattlePoint", -1749847652);
        setIntField(term411229, term411229.getClass(), "overDamageBattlePoint", 1501733415);
        setBooleanField(term411229, term411229.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term411229, term411229.getClass(), "nameplateId", 1104299177);
        setIntField(term411229, term411229.getClass(), "trophyId", 342295676);
        setIntField(term411229, term411229.getClass(), "cardId", 945842202);
        setIntField(term411229, term411229.getClass(), "characterId", -2065245570);
        setIntField(term411229, term411229.getClass(), "characterVoiceNo", -1244246120);
        setIntField(term411229, term411229.getClass(), "tabSetting", -315435576);
        setIntField(term411229, term411229.getClass(), "tabSortSetting", -328108701);
        setIntField(term411229, term411229.getClass(), "cardCategorySetting", 1098944689);
        setIntField(term411229, term411229.getClass(), "cardSortSetting", 2146860071);
        setIntField(term411229, term411229.getClass(), "rivalScoreCategorySetting", -1591221283);
        setIntField(term411229, term411229.getClass(), "playedTutorialBit", 1784624073);
        setIntField(term411229, term411229.getClass(), "firstTutorialCancelNum", 1729022273);
        setLongField(term411229, term411229.getClass(), "sumTechHighScore", 6321953648988079590L);
        setLongField(term411229, term411229.getClass(), "sumTechBasicHighScore", 6951367892125054802L);
        setLongField(term411229, term411229.getClass(), "sumTechAdvancedHighScore", 9050947857219555291L);
        setLongField(term411229, term411229.getClass(), "sumTechExpertHighScore", -6602480154871714545L);
        setLongField(term411229, term411229.getClass(), "sumTechMasterHighScore", 8808163510126535452L);
        setLongField(term411229, term411229.getClass(), "sumTechLunaticHighScore", 4032848657759062020L);
        setLongField(term411229, term411229.getClass(), "sumBattleHighScore", 4485606855777374605L);
        setLongField(term411229, term411229.getClass(), "sumBattleBasicHighScore", 4077943884188156333L);
        setLongField(term411229, term411229.getClass(), "sumBattleAdvancedHighScore", -965458151232820922L);
        setLongField(term411229, term411229.getClass(), "sumBattleExpertHighScore", 5215506032197914479L);
        setLongField(term411229, term411229.getClass(), "sumBattleMasterHighScore", 131654066409249687L);
        setLongField(term411229, term411229.getClass(), "sumBattleLunaticHighScore", 1394969516836522821L);
        setField(term411229, term411229.getClass(), "eventWatchedDate", "dvXfVrWWpc");
        setField(term411229, term411229.getClass(), "cmEventWatchedDate", "HnGyaisYCv");
        setField(term411229, term411229.getClass(), "firstGameId", "wSBcvRsQnS");
        setField(term411229, term411229.getClass(), "firstRomVersion", "xFYEUDcUnO");
        setField(term411229, term411229.getClass(), "firstDataVersion", "hnbdgnNwoA");
        setField(term411229, term411229.getClass(), "firstPlayDate", "aVcWsJWjdi");
        setField(term411229, term411229.getClass(), "lastGameId", "ZiNYWDszjD");
        setField(term411229, term411229.getClass(), "lastRomVersion", "hQpxPiAzvh");
        setField(term411229, term411229.getClass(), "lastDataVersion", "BPHiwdGhUq");
        setField(term411229, term411229.getClass(), "compatibleCmVersion", "JuYrCsXwjV");
        setField(term411229, term411229.getClass(), "lastPlayDate", "sUNwxuDMuf");
        setIntField(term411229, term411229.getClass(), "lastPlaceId", -964246621);
        setField(term411229, term411229.getClass(), "lastPlaceName", "ztrahRelMp");
        setIntField(term411229, term411229.getClass(), "lastRegionId", 129204952);
        setField(term411229, term411229.getClass(), "lastRegionName", "KZGTqSvgKe");
        setIntField(term411229, term411229.getClass(), "lastAllNetId", -1192671537);
        setField(term411229, term411229.getClass(), "lastClientId", "VDykSwYxHM");
        setIntField(term411229, term411229.getClass(), "lastUsedDeckId", 463837332);
        setIntField(term411229, term411229.getClass(), "lastPlayMusicLevel", 724687727);
        setIntField(term411229, term411229.getClass(), "lastEmoneyBrand", -1833074598);
        setField(term411227, term411227.getClass(), "user", term411229);
        setIntField(term411227, term411227.getClass(), "musicId", 1079219215);
        setIntField(term411227, term411227.getClass(), "level", 1443640326);
        setIntField(term411227, term411227.getClass(), "playCount", -422677867);
        setIntField(term411227, term411227.getClass(), "techScoreMax", -345510718);
        setIntField(term411227, term411227.getClass(), "techScoreRank", 1791207006);
        setIntField(term411227, term411227.getClass(), "battleScoreMax", -1446870973);
        setIntField(term411227, term411227.getClass(), "battleScoreRank", -1291041923);
        setIntField(term411227, term411227.getClass(), "maxComboCount", 1197851550);
        setIntField(term411227, term411227.getClass(), "maxOverKill", -1200709843);
        setIntField(term411227, term411227.getClass(), "maxTeamOverKill", 1705029847);
        setBooleanField(term411227, term411227.getClass(), "isFullBell", false);
        setBooleanField(term411227, term411227.getClass(), "isFullCombo", false);
        setBooleanField(term411227, term411227.getClass(), "isAllBreake", false);
        setBooleanField(term411227, term411227.getClass(), "isLock", true);
        setIntField(term411227, term411227.getClass(), "clearStatus", -1304822277);
        setBooleanField(term411227, term411227.getClass(), "isStoryWatched", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClearStatus", argTypes, term411227, args);
    }

};


