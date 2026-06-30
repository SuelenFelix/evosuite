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

public class UserGeneralData_setPropertyValue_21381436798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term297943;

    public UserGeneralData_setPropertyValue_21381436798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term297949 = new Long(-1009485425289165749L);
        term297943 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData"));
        Object term297945 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term297947 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term297963 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297964 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297968 = newInstance(Class.forName("java.time.LocalTime"));
        Object term297973 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term297974 = newInstance(Class.forName("java.time.LocalDate"));
        Object term297978 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term297943, term297943.getClass(), "id", -8376264076481582122L);
        setLongField(term297945, term297945.getClass(), "id", 1358396315724167884L);
        setLongField(term297947, term297947.getClass(), "id", 1146092230235020954L);
        setField(term297947, term297947.getClass(), "extId", term297949);
        setField(term297947, term297947.getClass(), "luid", "YelxRvGqHR");
        setIntField(term297964, term297964.getClass(), "year", 2014);
        setShortField(term297964, term297964.getClass(), "month", (short) 8);
        setShortField(term297964, term297964.getClass(), "day", (short) 30);
        setField(term297963, term297963.getClass(), "date", term297964);
        setByteField(term297968, term297968.getClass(), "hour", (byte) 1);
        setByteField(term297968, term297968.getClass(), "minute", (byte) 25);
        setByteField(term297968, term297968.getClass(), "second", (byte) 38);
        setIntField(term297968, term297968.getClass(), "nano", 485774498);
        setField(term297963, term297963.getClass(), "time", term297968);
        setField(term297947, term297947.getClass(), "registerTime", term297963);
        setIntField(term297974, term297974.getClass(), "year", 2029);
        setShortField(term297974, term297974.getClass(), "month", (short) 12);
        setShortField(term297974, term297974.getClass(), "day", (short) 30);
        setField(term297973, term297973.getClass(), "date", term297974);
        setByteField(term297978, term297978.getClass(), "hour", (byte) 0);
        setByteField(term297978, term297978.getClass(), "minute", (byte) 26);
        setByteField(term297978, term297978.getClass(), "second", (byte) 19);
        setIntField(term297978, term297978.getClass(), "nano", 773171363);
        setField(term297973, term297973.getClass(), "time", term297978);
        setField(term297947, term297947.getClass(), "accessTime", term297973);
        setField(term297945, term297945.getClass(), "card", term297947);
        setField(term297945, term297945.getClass(), "userName", "XBkEFwWfkh");
        setIntField(term297945, term297945.getClass(), "level", -730389235);
        setIntField(term297945, term297945.getClass(), "reincarnationNum", 39378172);
        setLongField(term297945, term297945.getClass(), "exp", 2747651396628099129L);
        setLongField(term297945, term297945.getClass(), "point", 2529892765916209492L);
        setLongField(term297945, term297945.getClass(), "totalPoint", -2209720306404563319L);
        setIntField(term297945, term297945.getClass(), "playCount", 1723747465);
        setIntField(term297945, term297945.getClass(), "jewelCount", 1146060981);
        setIntField(term297945, term297945.getClass(), "totalJewelCount", 1787282208);
        setIntField(term297945, term297945.getClass(), "medalCount", -1219046976);
        setIntField(term297945, term297945.getClass(), "playerRating", -2075552503);
        setIntField(term297945, term297945.getClass(), "highestRating", 329446399);
        setIntField(term297945, term297945.getClass(), "battlePoint", 111092059);
        setIntField(term297945, term297945.getClass(), "bestBattlePoint", -642783575);
        setIntField(term297945, term297945.getClass(), "overDamageBattlePoint", -158141867);
        setBooleanField(term297945, term297945.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term297945, term297945.getClass(), "nameplateId", 1726048223);
        setIntField(term297945, term297945.getClass(), "trophyId", 130512968);
        setIntField(term297945, term297945.getClass(), "cardId", -352899147);
        setIntField(term297945, term297945.getClass(), "characterId", -1278966386);
        setIntField(term297945, term297945.getClass(), "characterVoiceNo", 509833873);
        setIntField(term297945, term297945.getClass(), "tabSetting", -1312611981);
        setIntField(term297945, term297945.getClass(), "tabSortSetting", 1100620047);
        setIntField(term297945, term297945.getClass(), "cardCategorySetting", -1953500923);
        setIntField(term297945, term297945.getClass(), "cardSortSetting", -2043876407);
        setIntField(term297945, term297945.getClass(), "rivalScoreCategorySetting", -546545639);
        setIntField(term297945, term297945.getClass(), "playedTutorialBit", 669694901);
        setIntField(term297945, term297945.getClass(), "firstTutorialCancelNum", -506547696);
        setLongField(term297945, term297945.getClass(), "sumTechHighScore", 4032025007368155494L);
        setLongField(term297945, term297945.getClass(), "sumTechBasicHighScore", -4813549896366401720L);
        setLongField(term297945, term297945.getClass(), "sumTechAdvancedHighScore", 2913603110975498880L);
        setLongField(term297945, term297945.getClass(), "sumTechExpertHighScore", -8365618931268678291L);
        setLongField(term297945, term297945.getClass(), "sumTechMasterHighScore", -1443661765031562391L);
        setLongField(term297945, term297945.getClass(), "sumTechLunaticHighScore", 8387650281133615550L);
        setLongField(term297945, term297945.getClass(), "sumBattleHighScore", 7030617436737270527L);
        setLongField(term297945, term297945.getClass(), "sumBattleBasicHighScore", 2319282069567916403L);
        setLongField(term297945, term297945.getClass(), "sumBattleAdvancedHighScore", 5944576387752628604L);
        setLongField(term297945, term297945.getClass(), "sumBattleExpertHighScore", -7774904453547511015L);
        setLongField(term297945, term297945.getClass(), "sumBattleMasterHighScore", -4091629329729697286L);
        setLongField(term297945, term297945.getClass(), "sumBattleLunaticHighScore", -1933428636691370567L);
        setField(term297945, term297945.getClass(), "eventWatchedDate", "ozxxbmxRCe");
        setField(term297945, term297945.getClass(), "cmEventWatchedDate", "GjUBsfBQMd");
        setField(term297945, term297945.getClass(), "firstGameId", "sgpWsdnOVL");
        setField(term297945, term297945.getClass(), "firstRomVersion", "hHyjmReKRL");
        setField(term297945, term297945.getClass(), "firstDataVersion", "MujDQptHTA");
        setField(term297945, term297945.getClass(), "firstPlayDate", "OvCJvfYBjg");
        setField(term297945, term297945.getClass(), "lastGameId", "iGbPhDXCXn");
        setField(term297945, term297945.getClass(), "lastRomVersion", "BIDinWjIgX");
        setField(term297945, term297945.getClass(), "lastDataVersion", "supERaTQjg");
        setField(term297945, term297945.getClass(), "compatibleCmVersion", "EnJEYUwgVp");
        setField(term297945, term297945.getClass(), "lastPlayDate", "gAPDHJqyTc");
        setIntField(term297945, term297945.getClass(), "lastPlaceId", -2074631176);
        setField(term297945, term297945.getClass(), "lastPlaceName", "WyCSZSUlnV");
        setIntField(term297945, term297945.getClass(), "lastRegionId", -1854111457);
        setField(term297945, term297945.getClass(), "lastRegionName", "SyHjOnayQl");
        setIntField(term297945, term297945.getClass(), "lastAllNetId", -1702010789);
        setField(term297945, term297945.getClass(), "lastClientId", "fWkuqvVcuK");
        setIntField(term297945, term297945.getClass(), "lastUsedDeckId", -1863465951);
        setIntField(term297945, term297945.getClass(), "lastPlayMusicLevel", 1675348941);
        setIntField(term297945, term297945.getClass(), "lastEmoneyBrand", 948995653);
        setField(term297943, term297943.getClass(), "user", term297945);
        setField(term297943, term297943.getClass(), "propertyKey", "iCVAQxiyxL");
        setField(term297943, term297943.getClass(), "propertyValue", "qacQEntxMw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "serkapmqZh";
        callMethod(klass, "setPropertyValue", argTypes, term297943, args);
    }

};


