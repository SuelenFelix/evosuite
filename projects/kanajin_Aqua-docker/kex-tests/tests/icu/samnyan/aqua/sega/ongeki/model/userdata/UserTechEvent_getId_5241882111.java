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

public class UserTechEvent_getId_5241882111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term351570;

    public UserTechEvent_getId_5241882111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term351576 = new Long(-8287954071414913487L);
        term351570 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term351572 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term351574 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term351590 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term351591 = newInstance(Class.forName("java.time.LocalDate"));
        Object term351595 = newInstance(Class.forName("java.time.LocalTime"));
        Object term351600 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term351601 = newInstance(Class.forName("java.time.LocalDate"));
        Object term351605 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term351570, term351570.getClass(), "id", -9114858396763517948L);
        setLongField(term351572, term351572.getClass(), "id", 200575739169775151L);
        setLongField(term351574, term351574.getClass(), "id", -5483277764563859354L);
        setField(term351574, term351574.getClass(), "extId", term351576);
        setField(term351574, term351574.getClass(), "luid", "zXaMlPdsrC");
        setIntField(term351591, term351591.getClass(), "year", 2011);
        setShortField(term351591, term351591.getClass(), "month", (short) 6);
        setShortField(term351591, term351591.getClass(), "day", (short) 23);
        setField(term351590, term351590.getClass(), "date", term351591);
        setByteField(term351595, term351595.getClass(), "hour", (byte) 8);
        setByteField(term351595, term351595.getClass(), "minute", (byte) 46);
        setByteField(term351595, term351595.getClass(), "second", (byte) 20);
        setIntField(term351595, term351595.getClass(), "nano", 717155966);
        setField(term351590, term351590.getClass(), "time", term351595);
        setField(term351574, term351574.getClass(), "registerTime", term351590);
        setIntField(term351601, term351601.getClass(), "year", 2013);
        setShortField(term351601, term351601.getClass(), "month", (short) 9);
        setShortField(term351601, term351601.getClass(), "day", (short) 24);
        setField(term351600, term351600.getClass(), "date", term351601);
        setByteField(term351605, term351605.getClass(), "hour", (byte) 14);
        setByteField(term351605, term351605.getClass(), "minute", (byte) 57);
        setByteField(term351605, term351605.getClass(), "second", (byte) 35);
        setIntField(term351605, term351605.getClass(), "nano", 755106426);
        setField(term351600, term351600.getClass(), "time", term351605);
        setField(term351574, term351574.getClass(), "accessTime", term351600);
        setField(term351572, term351572.getClass(), "card", term351574);
        setField(term351572, term351572.getClass(), "userName", "oIVpPFEwsR");
        setIntField(term351572, term351572.getClass(), "level", 322365127);
        setIntField(term351572, term351572.getClass(), "reincarnationNum", 360140333);
        setLongField(term351572, term351572.getClass(), "exp", -1942358959027399418L);
        setLongField(term351572, term351572.getClass(), "point", 5578473667255879051L);
        setLongField(term351572, term351572.getClass(), "totalPoint", 5466211404570497811L);
        setIntField(term351572, term351572.getClass(), "playCount", -2099817912);
        setIntField(term351572, term351572.getClass(), "jewelCount", -787875796);
        setIntField(term351572, term351572.getClass(), "totalJewelCount", 1768295910);
        setIntField(term351572, term351572.getClass(), "medalCount", -2075146489);
        setIntField(term351572, term351572.getClass(), "playerRating", 1293414290);
        setIntField(term351572, term351572.getClass(), "highestRating", 909867465);
        setIntField(term351572, term351572.getClass(), "battlePoint", -1263040353);
        setIntField(term351572, term351572.getClass(), "bestBattlePoint", -2018867235);
        setIntField(term351572, term351572.getClass(), "overDamageBattlePoint", 1066446147);
        setBooleanField(term351572, term351572.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term351572, term351572.getClass(), "nameplateId", -1744090915);
        setIntField(term351572, term351572.getClass(), "trophyId", 395437295);
        setIntField(term351572, term351572.getClass(), "cardId", -1885509070);
        setIntField(term351572, term351572.getClass(), "characterId", 117647611);
        setIntField(term351572, term351572.getClass(), "characterVoiceNo", 1843810245);
        setIntField(term351572, term351572.getClass(), "tabSetting", 719886652);
        setIntField(term351572, term351572.getClass(), "tabSortSetting", -998264245);
        setIntField(term351572, term351572.getClass(), "cardCategorySetting", 1307081329);
        setIntField(term351572, term351572.getClass(), "cardSortSetting", 1748083965);
        setIntField(term351572, term351572.getClass(), "rivalScoreCategorySetting", -951256901);
        setIntField(term351572, term351572.getClass(), "playedTutorialBit", -488376903);
        setIntField(term351572, term351572.getClass(), "firstTutorialCancelNum", -747546509);
        setLongField(term351572, term351572.getClass(), "sumTechHighScore", -1758356388649358625L);
        setLongField(term351572, term351572.getClass(), "sumTechBasicHighScore", -3117305415396395036L);
        setLongField(term351572, term351572.getClass(), "sumTechAdvancedHighScore", -8046960133153736604L);
        setLongField(term351572, term351572.getClass(), "sumTechExpertHighScore", -1295935802960275673L);
        setLongField(term351572, term351572.getClass(), "sumTechMasterHighScore", 9054276813825069525L);
        setLongField(term351572, term351572.getClass(), "sumTechLunaticHighScore", 1992134518225744496L);
        setLongField(term351572, term351572.getClass(), "sumBattleHighScore", -4229182467009439730L);
        setLongField(term351572, term351572.getClass(), "sumBattleBasicHighScore", -187966252429784262L);
        setLongField(term351572, term351572.getClass(), "sumBattleAdvancedHighScore", -8239106977565018966L);
        setLongField(term351572, term351572.getClass(), "sumBattleExpertHighScore", -348191159932333781L);
        setLongField(term351572, term351572.getClass(), "sumBattleMasterHighScore", 3434534362631191534L);
        setLongField(term351572, term351572.getClass(), "sumBattleLunaticHighScore", 6417614082392617116L);
        setField(term351572, term351572.getClass(), "eventWatchedDate", "XaZtJkXwal");
        setField(term351572, term351572.getClass(), "cmEventWatchedDate", "fDckXhjKUI");
        setField(term351572, term351572.getClass(), "firstGameId", "GFnDdCTvkm");
        setField(term351572, term351572.getClass(), "firstRomVersion", "MdsaySFwcm");
        setField(term351572, term351572.getClass(), "firstDataVersion", "svaWMsCxlJ");
        setField(term351572, term351572.getClass(), "firstPlayDate", "AOsXCQuXcJ");
        setField(term351572, term351572.getClass(), "lastGameId", "IpERoDpbaC");
        setField(term351572, term351572.getClass(), "lastRomVersion", "eoqcisqfPS");
        setField(term351572, term351572.getClass(), "lastDataVersion", "vvVYGhJxJA");
        setField(term351572, term351572.getClass(), "compatibleCmVersion", "fLUVgxCPEd");
        setField(term351572, term351572.getClass(), "lastPlayDate", "lylsLXWfJi");
        setIntField(term351572, term351572.getClass(), "lastPlaceId", -196352554);
        setField(term351572, term351572.getClass(), "lastPlaceName", "PGykGYOwSi");
        setIntField(term351572, term351572.getClass(), "lastRegionId", 653232661);
        setField(term351572, term351572.getClass(), "lastRegionName", "GeMAMSBWPL");
        setIntField(term351572, term351572.getClass(), "lastAllNetId", 20010807);
        setField(term351572, term351572.getClass(), "lastClientId", "CUIEmuExVT");
        setIntField(term351572, term351572.getClass(), "lastUsedDeckId", 955583018);
        setIntField(term351572, term351572.getClass(), "lastPlayMusicLevel", -1002633115);
        setIntField(term351572, term351572.getClass(), "lastEmoneyBrand", -955407288);
        setField(term351570, term351570.getClass(), "user", term351572);
        setIntField(term351570, term351570.getClass(), "eventId", 1618226101);
        setIntField(term351570, term351570.getClass(), "totalTechScore", -444094301);
        setIntField(term351570, term351570.getClass(), "totalPlatinumScore", -1841506114);
        setField(term351570, term351570.getClass(), "techRecordDate", "frydSlVHSC");
        setBooleanField(term351570, term351570.getClass(), "isRankingRewarded", true);
        setBooleanField(term351570, term351570.getClass(), "isTotalTechNewRecord", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term351570, args);
    }

};


