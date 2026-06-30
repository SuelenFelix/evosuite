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

public class UserData_getLastRegionName_95826463856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45606;

    public UserData_getLastRegionName_95826463856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term45610 = new Long(-5786861555969446503L);
        term45606 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term45608 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term45624 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45625 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45629 = newInstance(Class.forName("java.time.LocalTime"));
        Object term45634 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term45635 = newInstance(Class.forName("java.time.LocalDate"));
        Object term45639 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term45606, term45606.getClass(), "id", 1805176718113697933L);
        setLongField(term45608, term45608.getClass(), "id", 8453512367875425981L);
        setField(term45608, term45608.getClass(), "extId", term45610);
        setField(term45608, term45608.getClass(), "luid", "DGMBBNDEYs");
        setIntField(term45625, term45625.getClass(), "year", 2028);
        setShortField(term45625, term45625.getClass(), "month", (short) 2);
        setShortField(term45625, term45625.getClass(), "day", (short) 8);
        setField(term45624, term45624.getClass(), "date", term45625);
        setByteField(term45629, term45629.getClass(), "hour", (byte) 16);
        setByteField(term45629, term45629.getClass(), "minute", (byte) 14);
        setByteField(term45629, term45629.getClass(), "second", (byte) 31);
        setIntField(term45629, term45629.getClass(), "nano", 824823232);
        setField(term45624, term45624.getClass(), "time", term45629);
        setField(term45608, term45608.getClass(), "registerTime", term45624);
        setIntField(term45635, term45635.getClass(), "year", 2018);
        setShortField(term45635, term45635.getClass(), "month", (short) 9);
        setShortField(term45635, term45635.getClass(), "day", (short) 8);
        setField(term45634, term45634.getClass(), "date", term45635);
        setByteField(term45639, term45639.getClass(), "hour", (byte) 14);
        setByteField(term45639, term45639.getClass(), "minute", (byte) 21);
        setByteField(term45639, term45639.getClass(), "second", (byte) 23);
        setIntField(term45639, term45639.getClass(), "nano", 316911941);
        setField(term45634, term45634.getClass(), "time", term45639);
        setField(term45608, term45608.getClass(), "accessTime", term45634);
        setField(term45606, term45606.getClass(), "card", term45608);
        setField(term45606, term45606.getClass(), "userName", "vpuKZSMmKQ");
        setIntField(term45606, term45606.getClass(), "level", -1018874255);
        setIntField(term45606, term45606.getClass(), "reincarnationNum", -268930414);
        setLongField(term45606, term45606.getClass(), "exp", -5710142537128696043L);
        setLongField(term45606, term45606.getClass(), "point", 3423802125971060085L);
        setLongField(term45606, term45606.getClass(), "totalPoint", -4876190539375195221L);
        setIntField(term45606, term45606.getClass(), "playCount", 1036231784);
        setIntField(term45606, term45606.getClass(), "jewelCount", 732187274);
        setIntField(term45606, term45606.getClass(), "totalJewelCount", 1495500544);
        setIntField(term45606, term45606.getClass(), "medalCount", -610532968);
        setIntField(term45606, term45606.getClass(), "playerRating", -1034929475);
        setIntField(term45606, term45606.getClass(), "highestRating", 2125774573);
        setIntField(term45606, term45606.getClass(), "battlePoint", -1338560431);
        setIntField(term45606, term45606.getClass(), "bestBattlePoint", 1768827963);
        setIntField(term45606, term45606.getClass(), "overDamageBattlePoint", -456155591);
        setBooleanField(term45606, term45606.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term45606, term45606.getClass(), "nameplateId", -678946365);
        setIntField(term45606, term45606.getClass(), "trophyId", 2121147631);
        setIntField(term45606, term45606.getClass(), "cardId", 878122723);
        setIntField(term45606, term45606.getClass(), "characterId", 1612267814);
        setIntField(term45606, term45606.getClass(), "characterVoiceNo", 634968709);
        setIntField(term45606, term45606.getClass(), "tabSetting", 681482688);
        setIntField(term45606, term45606.getClass(), "tabSortSetting", -1435288604);
        setIntField(term45606, term45606.getClass(), "cardCategorySetting", 364335952);
        setIntField(term45606, term45606.getClass(), "cardSortSetting", 254542714);
        setIntField(term45606, term45606.getClass(), "rivalScoreCategorySetting", -51533463);
        setIntField(term45606, term45606.getClass(), "playedTutorialBit", 2042811670);
        setIntField(term45606, term45606.getClass(), "firstTutorialCancelNum", -1713263092);
        setLongField(term45606, term45606.getClass(), "sumTechHighScore", -5262639910779325902L);
        setLongField(term45606, term45606.getClass(), "sumTechBasicHighScore", 6267421205498097015L);
        setLongField(term45606, term45606.getClass(), "sumTechAdvancedHighScore", 2972970902155476483L);
        setLongField(term45606, term45606.getClass(), "sumTechExpertHighScore", -6060448108932211661L);
        setLongField(term45606, term45606.getClass(), "sumTechMasterHighScore", -4280668709580845965L);
        setLongField(term45606, term45606.getClass(), "sumTechLunaticHighScore", -8669140240741599474L);
        setLongField(term45606, term45606.getClass(), "sumBattleHighScore", -1131029419147589872L);
        setLongField(term45606, term45606.getClass(), "sumBattleBasicHighScore", -5753794060274661933L);
        setLongField(term45606, term45606.getClass(), "sumBattleAdvancedHighScore", -631692052300282581L);
        setLongField(term45606, term45606.getClass(), "sumBattleExpertHighScore", -2145666439433256886L);
        setLongField(term45606, term45606.getClass(), "sumBattleMasterHighScore", 4364197754861747163L);
        setLongField(term45606, term45606.getClass(), "sumBattleLunaticHighScore", -2350743764086921250L);
        setField(term45606, term45606.getClass(), "eventWatchedDate", "IXQQwaXITf");
        setField(term45606, term45606.getClass(), "cmEventWatchedDate", "fNzFTiRCjp");
        setField(term45606, term45606.getClass(), "firstGameId", "yaCGGogKro");
        setField(term45606, term45606.getClass(), "firstRomVersion", "qxrRUnjshF");
        setField(term45606, term45606.getClass(), "firstDataVersion", "WmVcapKAeJ");
        setField(term45606, term45606.getClass(), "firstPlayDate", "jevOVdQdpc");
        setField(term45606, term45606.getClass(), "lastGameId", "TLLVSGTNsz");
        setField(term45606, term45606.getClass(), "lastRomVersion", "mbBWfaHCrP");
        setField(term45606, term45606.getClass(), "lastDataVersion", "wFyiZloCxg");
        setField(term45606, term45606.getClass(), "compatibleCmVersion", "xYztJEIPWy");
        setField(term45606, term45606.getClass(), "lastPlayDate", "TDQIAXaJru");
        setIntField(term45606, term45606.getClass(), "lastPlaceId", 73609068);
        setField(term45606, term45606.getClass(), "lastPlaceName", "frPMFqGmrE");
        setIntField(term45606, term45606.getClass(), "lastRegionId", -1150137872);
        setField(term45606, term45606.getClass(), "lastRegionName", "DvfOYWcNBN");
        setIntField(term45606, term45606.getClass(), "lastAllNetId", -781333853);
        setField(term45606, term45606.getClass(), "lastClientId", "cvbvwpPlNk");
        setIntField(term45606, term45606.getClass(), "lastUsedDeckId", 158137467);
        setIntField(term45606, term45606.getClass(), "lastPlayMusicLevel", 1299041951);
        setIntField(term45606, term45606.getClass(), "lastEmoneyBrand", -1772128093);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRegionName", argTypes, term45606, args);
    }

};


