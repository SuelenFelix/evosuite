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

public class UserData_getLastClientId_186882384558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46452;

    public UserData_getLastClientId_186882384558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term46456 = new Long(7276637106827860087L);
        term46452 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term46454 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term46470 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46471 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46475 = newInstance(Class.forName("java.time.LocalTime"));
        Object term46480 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term46481 = newInstance(Class.forName("java.time.LocalDate"));
        Object term46485 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term46452, term46452.getClass(), "id", -5397349204553241395L);
        setLongField(term46454, term46454.getClass(), "id", -5533270660427460254L);
        setField(term46454, term46454.getClass(), "extId", term46456);
        setField(term46454, term46454.getClass(), "luid", "ElTdyUVQYi");
        setIntField(term46471, term46471.getClass(), "year", 2012);
        setShortField(term46471, term46471.getClass(), "month", (short) 6);
        setShortField(term46471, term46471.getClass(), "day", (short) 24);
        setField(term46470, term46470.getClass(), "date", term46471);
        setByteField(term46475, term46475.getClass(), "hour", (byte) 23);
        setByteField(term46475, term46475.getClass(), "minute", (byte) 9);
        setByteField(term46475, term46475.getClass(), "second", (byte) 32);
        setIntField(term46475, term46475.getClass(), "nano", 933669930);
        setField(term46470, term46470.getClass(), "time", term46475);
        setField(term46454, term46454.getClass(), "registerTime", term46470);
        setIntField(term46481, term46481.getClass(), "year", 2013);
        setShortField(term46481, term46481.getClass(), "month", (short) 9);
        setShortField(term46481, term46481.getClass(), "day", (short) 29);
        setField(term46480, term46480.getClass(), "date", term46481);
        setByteField(term46485, term46485.getClass(), "hour", (byte) 18);
        setByteField(term46485, term46485.getClass(), "minute", (byte) 32);
        setByteField(term46485, term46485.getClass(), "second", (byte) 59);
        setIntField(term46485, term46485.getClass(), "nano", 213125607);
        setField(term46480, term46480.getClass(), "time", term46485);
        setField(term46454, term46454.getClass(), "accessTime", term46480);
        setField(term46452, term46452.getClass(), "card", term46454);
        setField(term46452, term46452.getClass(), "userName", "KkgJnxXxVl");
        setIntField(term46452, term46452.getClass(), "level", -226677391);
        setIntField(term46452, term46452.getClass(), "reincarnationNum", -1991945298);
        setLongField(term46452, term46452.getClass(), "exp", 6870806673850570339L);
        setLongField(term46452, term46452.getClass(), "point", -2212129370801839337L);
        setLongField(term46452, term46452.getClass(), "totalPoint", 5474646196659258873L);
        setIntField(term46452, term46452.getClass(), "playCount", 110090057);
        setIntField(term46452, term46452.getClass(), "jewelCount", 1975165299);
        setIntField(term46452, term46452.getClass(), "totalJewelCount", -1320712215);
        setIntField(term46452, term46452.getClass(), "medalCount", -619414497);
        setIntField(term46452, term46452.getClass(), "playerRating", 1414603242);
        setIntField(term46452, term46452.getClass(), "highestRating", 18596324);
        setIntField(term46452, term46452.getClass(), "battlePoint", 907968883);
        setIntField(term46452, term46452.getClass(), "bestBattlePoint", -1191329679);
        setIntField(term46452, term46452.getClass(), "overDamageBattlePoint", -937626498);
        setBooleanField(term46452, term46452.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term46452, term46452.getClass(), "nameplateId", 398974629);
        setIntField(term46452, term46452.getClass(), "trophyId", -790946306);
        setIntField(term46452, term46452.getClass(), "cardId", -189980304);
        setIntField(term46452, term46452.getClass(), "characterId", 1492044959);
        setIntField(term46452, term46452.getClass(), "characterVoiceNo", 260483962);
        setIntField(term46452, term46452.getClass(), "tabSetting", 1115251191);
        setIntField(term46452, term46452.getClass(), "tabSortSetting", 1882224203);
        setIntField(term46452, term46452.getClass(), "cardCategorySetting", 1320826206);
        setIntField(term46452, term46452.getClass(), "cardSortSetting", -933702401);
        setIntField(term46452, term46452.getClass(), "rivalScoreCategorySetting", 1670477259);
        setIntField(term46452, term46452.getClass(), "playedTutorialBit", 186917839);
        setIntField(term46452, term46452.getClass(), "firstTutorialCancelNum", 1727889509);
        setLongField(term46452, term46452.getClass(), "sumTechHighScore", -4693282265818959742L);
        setLongField(term46452, term46452.getClass(), "sumTechBasicHighScore", -3969214906313119862L);
        setLongField(term46452, term46452.getClass(), "sumTechAdvancedHighScore", 8375905579419331860L);
        setLongField(term46452, term46452.getClass(), "sumTechExpertHighScore", -3159920279724689717L);
        setLongField(term46452, term46452.getClass(), "sumTechMasterHighScore", -2357799544049443716L);
        setLongField(term46452, term46452.getClass(), "sumTechLunaticHighScore", 5316576314473126985L);
        setLongField(term46452, term46452.getClass(), "sumBattleHighScore", 6119456969796759152L);
        setLongField(term46452, term46452.getClass(), "sumBattleBasicHighScore", -3359440850156242734L);
        setLongField(term46452, term46452.getClass(), "sumBattleAdvancedHighScore", -8891224677821082964L);
        setLongField(term46452, term46452.getClass(), "sumBattleExpertHighScore", 673942798641120020L);
        setLongField(term46452, term46452.getClass(), "sumBattleMasterHighScore", 2453638512947169594L);
        setLongField(term46452, term46452.getClass(), "sumBattleLunaticHighScore", -6286554265404073084L);
        setField(term46452, term46452.getClass(), "eventWatchedDate", "TGnzPlGFMb");
        setField(term46452, term46452.getClass(), "cmEventWatchedDate", "yEvLMSpdHy");
        setField(term46452, term46452.getClass(), "firstGameId", "qdErlZeTVv");
        setField(term46452, term46452.getClass(), "firstRomVersion", "OCCDQbndDE");
        setField(term46452, term46452.getClass(), "firstDataVersion", "NMANMKfctU");
        setField(term46452, term46452.getClass(), "firstPlayDate", "mQsaqUltLU");
        setField(term46452, term46452.getClass(), "lastGameId", "jwENwZiGlR");
        setField(term46452, term46452.getClass(), "lastRomVersion", "rfFHGPcfpz");
        setField(term46452, term46452.getClass(), "lastDataVersion", "fViQeyMrrL");
        setField(term46452, term46452.getClass(), "compatibleCmVersion", "zzeaToyLmI");
        setField(term46452, term46452.getClass(), "lastPlayDate", "sKYWhmRMLx");
        setIntField(term46452, term46452.getClass(), "lastPlaceId", -159961860);
        setField(term46452, term46452.getClass(), "lastPlaceName", "SOJpgWUZCf");
        setIntField(term46452, term46452.getClass(), "lastRegionId", -1656685141);
        setField(term46452, term46452.getClass(), "lastRegionName", "jgywFOzBDw");
        setIntField(term46452, term46452.getClass(), "lastAllNetId", -1550347560);
        setField(term46452, term46452.getClass(), "lastClientId", "yKIXLtCWYi");
        setIntField(term46452, term46452.getClass(), "lastUsedDeckId", 1130655068);
        setIntField(term46452, term46452.getClass(), "lastPlayMusicLevel", 1747437566);
        setIntField(term46452, term46452.getClass(), "lastEmoneyBrand", -1175737970);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastClientId", argTypes, term46452, args);
    }

};


