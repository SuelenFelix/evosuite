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

public class UserEventPoint_setRankingRewarded_157522812210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386250;
     Object term386518;

    public UserEventPoint_setRankingRewarded_157522812210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term386256 = new Long(2315395988604904502L);
        term386250 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint"));
        Object term386252 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term386254 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term386270 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term386271 = newInstance(Class.forName("java.time.LocalDate"));
        Object term386275 = newInstance(Class.forName("java.time.LocalTime"));
        Object term386280 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term386281 = newInstance(Class.forName("java.time.LocalDate"));
        Object term386285 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term386250, term386250.getClass(), "id", 7388462236041135420L);
        setLongField(term386252, term386252.getClass(), "id", -3168529657985513594L);
        setLongField(term386254, term386254.getClass(), "id", -2426806514016334295L);
        setField(term386254, term386254.getClass(), "extId", term386256);
        setField(term386254, term386254.getClass(), "luid", "vMemYgMcNs");
        setIntField(term386271, term386271.getClass(), "year", 2016);
        setShortField(term386271, term386271.getClass(), "month", (short) 7);
        setShortField(term386271, term386271.getClass(), "day", (short) 17);
        setField(term386270, term386270.getClass(), "date", term386271);
        setByteField(term386275, term386275.getClass(), "hour", (byte) 5);
        setByteField(term386275, term386275.getClass(), "minute", (byte) 15);
        setByteField(term386275, term386275.getClass(), "second", (byte) 8);
        setIntField(term386275, term386275.getClass(), "nano", 213590460);
        setField(term386270, term386270.getClass(), "time", term386275);
        setField(term386254, term386254.getClass(), "registerTime", term386270);
        setIntField(term386281, term386281.getClass(), "year", 2029);
        setShortField(term386281, term386281.getClass(), "month", (short) 5);
        setShortField(term386281, term386281.getClass(), "day", (short) 11);
        setField(term386280, term386280.getClass(), "date", term386281);
        setByteField(term386285, term386285.getClass(), "hour", (byte) 5);
        setByteField(term386285, term386285.getClass(), "minute", (byte) 15);
        setByteField(term386285, term386285.getClass(), "second", (byte) 1);
        setIntField(term386285, term386285.getClass(), "nano", 333296491);
        setField(term386280, term386280.getClass(), "time", term386285);
        setField(term386254, term386254.getClass(), "accessTime", term386280);
        setField(term386252, term386252.getClass(), "card", term386254);
        setField(term386252, term386252.getClass(), "userName", "SMPpmRDzhD");
        setIntField(term386252, term386252.getClass(), "level", 1070543861);
        setIntField(term386252, term386252.getClass(), "reincarnationNum", 1974947254);
        setLongField(term386252, term386252.getClass(), "exp", 2402184123975845480L);
        setLongField(term386252, term386252.getClass(), "point", 6459201443221184869L);
        setLongField(term386252, term386252.getClass(), "totalPoint", 2649622131951007190L);
        setIntField(term386252, term386252.getClass(), "playCount", 473072571);
        setIntField(term386252, term386252.getClass(), "jewelCount", 1398388046);
        setIntField(term386252, term386252.getClass(), "totalJewelCount", 934938031);
        setIntField(term386252, term386252.getClass(), "medalCount", 781325532);
        setIntField(term386252, term386252.getClass(), "playerRating", 105157563);
        setIntField(term386252, term386252.getClass(), "highestRating", -507586388);
        setIntField(term386252, term386252.getClass(), "battlePoint", 1592747843);
        setIntField(term386252, term386252.getClass(), "bestBattlePoint", -108377203);
        setIntField(term386252, term386252.getClass(), "overDamageBattlePoint", -1398858469);
        setBooleanField(term386252, term386252.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term386252, term386252.getClass(), "nameplateId", -313543621);
        setIntField(term386252, term386252.getClass(), "trophyId", 602277774);
        setIntField(term386252, term386252.getClass(), "cardId", -1370071987);
        setIntField(term386252, term386252.getClass(), "characterId", 974915000);
        setIntField(term386252, term386252.getClass(), "characterVoiceNo", 390642257);
        setIntField(term386252, term386252.getClass(), "tabSetting", -1931780931);
        setIntField(term386252, term386252.getClass(), "tabSortSetting", 1410725129);
        setIntField(term386252, term386252.getClass(), "cardCategorySetting", -337774942);
        setIntField(term386252, term386252.getClass(), "cardSortSetting", 1380772832);
        setIntField(term386252, term386252.getClass(), "rivalScoreCategorySetting", 1648149467);
        setIntField(term386252, term386252.getClass(), "playedTutorialBit", 384004370);
        setIntField(term386252, term386252.getClass(), "firstTutorialCancelNum", 2032801735);
        setLongField(term386252, term386252.getClass(), "sumTechHighScore", -9133206715603703235L);
        setLongField(term386252, term386252.getClass(), "sumTechBasicHighScore", 9046392762178261695L);
        setLongField(term386252, term386252.getClass(), "sumTechAdvancedHighScore", -1619867073963031042L);
        setLongField(term386252, term386252.getClass(), "sumTechExpertHighScore", -4362619240153162067L);
        setLongField(term386252, term386252.getClass(), "sumTechMasterHighScore", 8913293757193042872L);
        setLongField(term386252, term386252.getClass(), "sumTechLunaticHighScore", 4975060746453460778L);
        setLongField(term386252, term386252.getClass(), "sumBattleHighScore", -1634318806045086651L);
        setLongField(term386252, term386252.getClass(), "sumBattleBasicHighScore", 8834500848159973216L);
        setLongField(term386252, term386252.getClass(), "sumBattleAdvancedHighScore", 6988718827993104009L);
        setLongField(term386252, term386252.getClass(), "sumBattleExpertHighScore", 1444261957367066623L);
        setLongField(term386252, term386252.getClass(), "sumBattleMasterHighScore", -8514584250089993222L);
        setLongField(term386252, term386252.getClass(), "sumBattleLunaticHighScore", 7330626176857973091L);
        setField(term386252, term386252.getClass(), "eventWatchedDate", "YEoxWwHgYv");
        setField(term386252, term386252.getClass(), "cmEventWatchedDate", "fLjqdrMjZc");
        setField(term386252, term386252.getClass(), "firstGameId", "CXArGKooqR");
        setField(term386252, term386252.getClass(), "firstRomVersion", "bLYtgSNkGW");
        setField(term386252, term386252.getClass(), "firstDataVersion", "AiFDhevrkK");
        setField(term386252, term386252.getClass(), "firstPlayDate", "ATbGKRlvAy");
        setField(term386252, term386252.getClass(), "lastGameId", "cFekeDagUr");
        setField(term386252, term386252.getClass(), "lastRomVersion", "eBArHdtqTB");
        setField(term386252, term386252.getClass(), "lastDataVersion", "JpXlPsmHLx");
        setField(term386252, term386252.getClass(), "compatibleCmVersion", "ecvBUJjbcv");
        setField(term386252, term386252.getClass(), "lastPlayDate", "FfQOsDWAkI");
        setIntField(term386252, term386252.getClass(), "lastPlaceId", -626099172);
        setField(term386252, term386252.getClass(), "lastPlaceName", "JyDbfeKvnT");
        setIntField(term386252, term386252.getClass(), "lastRegionId", 1003128235);
        setField(term386252, term386252.getClass(), "lastRegionName", "uIduyXMGDk");
        setIntField(term386252, term386252.getClass(), "lastAllNetId", -1585225879);
        setField(term386252, term386252.getClass(), "lastClientId", "EODiAgPFIS");
        setIntField(term386252, term386252.getClass(), "lastUsedDeckId", -1267379471);
        setIntField(term386252, term386252.getClass(), "lastPlayMusicLevel", 69962336);
        setIntField(term386252, term386252.getClass(), "lastEmoneyBrand", -1088039753);
        setField(term386250, term386250.getClass(), "user", term386252);
        setIntField(term386250, term386250.getClass(), "eventId", -460347076);
        setLongField(term386250, term386250.getClass(), "point", -1703142605593570974L);
        setBooleanField(term386250, term386250.getClass(), "isRankingRewarded", true);
        term386518 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term386518;
        callMethod(klass, "setRankingRewarded", argTypes, term386250, args);
    }

};


