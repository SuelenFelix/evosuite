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
import java.lang.Boolean;

public class UserMusicDetail_setLock_19925121934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term419175;
     Object term419456;

    public UserMusicDetail_setLock_19925121934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term419181 = new Long(-6645699856048951433L);
        term419175 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term419177 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term419179 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term419195 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term419196 = newInstance(Class.forName("java.time.LocalDate"));
        Object term419200 = newInstance(Class.forName("java.time.LocalTime"));
        Object term419205 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term419206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term419210 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term419175, term419175.getClass(), "id", 6721049726097955810L);
        setLongField(term419177, term419177.getClass(), "id", -3971280380776232915L);
        setLongField(term419179, term419179.getClass(), "id", -4510247515188812900L);
        setField(term419179, term419179.getClass(), "extId", term419181);
        setField(term419179, term419179.getClass(), "luid", "fLPTjOoYOc");
        setIntField(term419196, term419196.getClass(), "year", 2010);
        setShortField(term419196, term419196.getClass(), "month", (short) 5);
        setShortField(term419196, term419196.getClass(), "day", (short) 1);
        setField(term419195, term419195.getClass(), "date", term419196);
        setByteField(term419200, term419200.getClass(), "hour", (byte) 8);
        setByteField(term419200, term419200.getClass(), "minute", (byte) 28);
        setByteField(term419200, term419200.getClass(), "second", (byte) 39);
        setIntField(term419200, term419200.getClass(), "nano", 321837588);
        setField(term419195, term419195.getClass(), "time", term419200);
        setField(term419179, term419179.getClass(), "registerTime", term419195);
        setIntField(term419206, term419206.getClass(), "year", 2026);
        setShortField(term419206, term419206.getClass(), "month", (short) 4);
        setShortField(term419206, term419206.getClass(), "day", (short) 6);
        setField(term419205, term419205.getClass(), "date", term419206);
        setByteField(term419210, term419210.getClass(), "hour", (byte) 2);
        setByteField(term419210, term419210.getClass(), "minute", (byte) 53);
        setByteField(term419210, term419210.getClass(), "second", (byte) 57);
        setIntField(term419210, term419210.getClass(), "nano", 42640315);
        setField(term419205, term419205.getClass(), "time", term419210);
        setField(term419179, term419179.getClass(), "accessTime", term419205);
        setField(term419177, term419177.getClass(), "card", term419179);
        setField(term419177, term419177.getClass(), "userName", "xVfCCcnUAf");
        setIntField(term419177, term419177.getClass(), "level", -986714224);
        setIntField(term419177, term419177.getClass(), "reincarnationNum", 724379046);
        setLongField(term419177, term419177.getClass(), "exp", -2533762765200037261L);
        setLongField(term419177, term419177.getClass(), "point", -9161387261324491995L);
        setLongField(term419177, term419177.getClass(), "totalPoint", 3396058075945223710L);
        setIntField(term419177, term419177.getClass(), "playCount", 1656031613);
        setIntField(term419177, term419177.getClass(), "jewelCount", -121264431);
        setIntField(term419177, term419177.getClass(), "totalJewelCount", 118341366);
        setIntField(term419177, term419177.getClass(), "medalCount", -1432149694);
        setIntField(term419177, term419177.getClass(), "playerRating", -1550618432);
        setIntField(term419177, term419177.getClass(), "highestRating", -1433466091);
        setIntField(term419177, term419177.getClass(), "battlePoint", -20157216);
        setIntField(term419177, term419177.getClass(), "bestBattlePoint", 683618892);
        setIntField(term419177, term419177.getClass(), "overDamageBattlePoint", 1815764426);
        setBooleanField(term419177, term419177.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term419177, term419177.getClass(), "nameplateId", 1200866331);
        setIntField(term419177, term419177.getClass(), "trophyId", -1657170047);
        setIntField(term419177, term419177.getClass(), "cardId", -1434612412);
        setIntField(term419177, term419177.getClass(), "characterId", -1277744672);
        setIntField(term419177, term419177.getClass(), "characterVoiceNo", 679333756);
        setIntField(term419177, term419177.getClass(), "tabSetting", 670111594);
        setIntField(term419177, term419177.getClass(), "tabSortSetting", 559332132);
        setIntField(term419177, term419177.getClass(), "cardCategorySetting", -645078460);
        setIntField(term419177, term419177.getClass(), "cardSortSetting", -679829024);
        setIntField(term419177, term419177.getClass(), "rivalScoreCategorySetting", -1808442029);
        setIntField(term419177, term419177.getClass(), "playedTutorialBit", -431120939);
        setIntField(term419177, term419177.getClass(), "firstTutorialCancelNum", 1415341460);
        setLongField(term419177, term419177.getClass(), "sumTechHighScore", 1885351606653859801L);
        setLongField(term419177, term419177.getClass(), "sumTechBasicHighScore", -2695797563630463419L);
        setLongField(term419177, term419177.getClass(), "sumTechAdvancedHighScore", 7660551267954959107L);
        setLongField(term419177, term419177.getClass(), "sumTechExpertHighScore", -4712912946502306295L);
        setLongField(term419177, term419177.getClass(), "sumTechMasterHighScore", -263497124637249372L);
        setLongField(term419177, term419177.getClass(), "sumTechLunaticHighScore", -1953793053039251718L);
        setLongField(term419177, term419177.getClass(), "sumBattleHighScore", -3347279420050495885L);
        setLongField(term419177, term419177.getClass(), "sumBattleBasicHighScore", -2979513660236068423L);
        setLongField(term419177, term419177.getClass(), "sumBattleAdvancedHighScore", -6507435403109916891L);
        setLongField(term419177, term419177.getClass(), "sumBattleExpertHighScore", 3639713471404197085L);
        setLongField(term419177, term419177.getClass(), "sumBattleMasterHighScore", 4068660222975669742L);
        setLongField(term419177, term419177.getClass(), "sumBattleLunaticHighScore", -1556601097860671974L);
        setField(term419177, term419177.getClass(), "eventWatchedDate", "eVRIwjhEqU");
        setField(term419177, term419177.getClass(), "cmEventWatchedDate", "sbpuUFSMpZ");
        setField(term419177, term419177.getClass(), "firstGameId", "LiUyhcNeHM");
        setField(term419177, term419177.getClass(), "firstRomVersion", "BcgkcyKKcZ");
        setField(term419177, term419177.getClass(), "firstDataVersion", "ffwWFwcNxa");
        setField(term419177, term419177.getClass(), "firstPlayDate", "SRIAlaCOur");
        setField(term419177, term419177.getClass(), "lastGameId", "QBxoBFKhGk");
        setField(term419177, term419177.getClass(), "lastRomVersion", "BGgFDbHtjH");
        setField(term419177, term419177.getClass(), "lastDataVersion", "pTJUrnOBcA");
        setField(term419177, term419177.getClass(), "compatibleCmVersion", "hsorDFRbeJ");
        setField(term419177, term419177.getClass(), "lastPlayDate", "GwkhRlmFDN");
        setIntField(term419177, term419177.getClass(), "lastPlaceId", 1353155216);
        setField(term419177, term419177.getClass(), "lastPlaceName", "wzFbpBCpvo");
        setIntField(term419177, term419177.getClass(), "lastRegionId", 331966492);
        setField(term419177, term419177.getClass(), "lastRegionName", "cTiRlysiwv");
        setIntField(term419177, term419177.getClass(), "lastAllNetId", -915093532);
        setField(term419177, term419177.getClass(), "lastClientId", "uSgabkxMmt");
        setIntField(term419177, term419177.getClass(), "lastUsedDeckId", 229012335);
        setIntField(term419177, term419177.getClass(), "lastPlayMusicLevel", 145722440);
        setIntField(term419177, term419177.getClass(), "lastEmoneyBrand", 1986369294);
        setField(term419175, term419175.getClass(), "user", term419177);
        setIntField(term419175, term419175.getClass(), "musicId", 1413815157);
        setIntField(term419175, term419175.getClass(), "level", -1815309730);
        setIntField(term419175, term419175.getClass(), "playCount", -1341626543);
        setIntField(term419175, term419175.getClass(), "techScoreMax", -1137648539);
        setIntField(term419175, term419175.getClass(), "techScoreRank", 340452471);
        setIntField(term419175, term419175.getClass(), "battleScoreMax", -1419776016);
        setIntField(term419175, term419175.getClass(), "battleScoreRank", -92794673);
        setIntField(term419175, term419175.getClass(), "maxComboCount", -734260206);
        setIntField(term419175, term419175.getClass(), "maxOverKill", 2051924505);
        setIntField(term419175, term419175.getClass(), "maxTeamOverKill", -1701077210);
        setBooleanField(term419175, term419175.getClass(), "isFullBell", false);
        setBooleanField(term419175, term419175.getClass(), "isFullCombo", true);
        setBooleanField(term419175, term419175.getClass(), "isAllBreake", true);
        setBooleanField(term419175, term419175.getClass(), "isLock", false);
        setIntField(term419175, term419175.getClass(), "clearStatus", -765508777);
        setBooleanField(term419175, term419175.getClass(), "isStoryWatched", true);
        term419456 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term419456;
        callMethod(klass, "setLock", argTypes, term419175, args);
    }

};


