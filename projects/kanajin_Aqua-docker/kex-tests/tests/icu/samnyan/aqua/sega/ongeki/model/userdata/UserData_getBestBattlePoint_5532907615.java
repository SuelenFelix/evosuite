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

public class UserData_getBestBattlePoint_5532907615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28263;

    public UserData_getBestBattlePoint_5532907615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term28267 = new Long(2062173786000223358L);
        term28263 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term28265 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term28281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28286 = newInstance(Class.forName("java.time.LocalTime"));
        Object term28291 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term28292 = newInstance(Class.forName("java.time.LocalDate"));
        Object term28296 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term28263, term28263.getClass(), "id", 3058795643782579829L);
        setLongField(term28265, term28265.getClass(), "id", 3729905560436815423L);
        setField(term28265, term28265.getClass(), "extId", term28267);
        setField(term28265, term28265.getClass(), "luid", "soJHvZwbtF");
        setIntField(term28282, term28282.getClass(), "year", 2014);
        setShortField(term28282, term28282.getClass(), "month", (short) 5);
        setShortField(term28282, term28282.getClass(), "day", (short) 31);
        setField(term28281, term28281.getClass(), "date", term28282);
        setByteField(term28286, term28286.getClass(), "hour", (byte) 16);
        setByteField(term28286, term28286.getClass(), "minute", (byte) 3);
        setByteField(term28286, term28286.getClass(), "second", (byte) 14);
        setIntField(term28286, term28286.getClass(), "nano", 281059649);
        setField(term28281, term28281.getClass(), "time", term28286);
        setField(term28265, term28265.getClass(), "registerTime", term28281);
        setIntField(term28292, term28292.getClass(), "year", 2010);
        setShortField(term28292, term28292.getClass(), "month", (short) 12);
        setShortField(term28292, term28292.getClass(), "day", (short) 30);
        setField(term28291, term28291.getClass(), "date", term28292);
        setByteField(term28296, term28296.getClass(), "hour", (byte) 17);
        setByteField(term28296, term28296.getClass(), "minute", (byte) 44);
        setByteField(term28296, term28296.getClass(), "second", (byte) 59);
        setIntField(term28296, term28296.getClass(), "nano", 881407895);
        setField(term28291, term28291.getClass(), "time", term28296);
        setField(term28265, term28265.getClass(), "accessTime", term28291);
        setField(term28263, term28263.getClass(), "card", term28265);
        setField(term28263, term28263.getClass(), "userName", "dTGwgkfDVj");
        setIntField(term28263, term28263.getClass(), "level", -1081685171);
        setIntField(term28263, term28263.getClass(), "reincarnationNum", 1511699134);
        setLongField(term28263, term28263.getClass(), "exp", 27732590148100485L);
        setLongField(term28263, term28263.getClass(), "point", -963498294796483851L);
        setLongField(term28263, term28263.getClass(), "totalPoint", -8667643757273196191L);
        setIntField(term28263, term28263.getClass(), "playCount", 185647247);
        setIntField(term28263, term28263.getClass(), "jewelCount", 720814309);
        setIntField(term28263, term28263.getClass(), "totalJewelCount", 964137425);
        setIntField(term28263, term28263.getClass(), "medalCount", -1378885614);
        setIntField(term28263, term28263.getClass(), "playerRating", -1408615666);
        setIntField(term28263, term28263.getClass(), "highestRating", -502299598);
        setIntField(term28263, term28263.getClass(), "battlePoint", -516287593);
        setIntField(term28263, term28263.getClass(), "bestBattlePoint", -187311406);
        setIntField(term28263, term28263.getClass(), "overDamageBattlePoint", 1496632406);
        setBooleanField(term28263, term28263.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term28263, term28263.getClass(), "nameplateId", 1858277277);
        setIntField(term28263, term28263.getClass(), "trophyId", 2145928130);
        setIntField(term28263, term28263.getClass(), "cardId", -1095947031);
        setIntField(term28263, term28263.getClass(), "characterId", 1504187156);
        setIntField(term28263, term28263.getClass(), "characterVoiceNo", -1713723083);
        setIntField(term28263, term28263.getClass(), "tabSetting", -1337690242);
        setIntField(term28263, term28263.getClass(), "tabSortSetting", 264872152);
        setIntField(term28263, term28263.getClass(), "cardCategorySetting", 1645751151);
        setIntField(term28263, term28263.getClass(), "cardSortSetting", -2117930201);
        setIntField(term28263, term28263.getClass(), "rivalScoreCategorySetting", 1839150896);
        setIntField(term28263, term28263.getClass(), "playedTutorialBit", -1487860516);
        setIntField(term28263, term28263.getClass(), "firstTutorialCancelNum", 784631129);
        setLongField(term28263, term28263.getClass(), "sumTechHighScore", 8259341710509598103L);
        setLongField(term28263, term28263.getClass(), "sumTechBasicHighScore", -3542890656778018623L);
        setLongField(term28263, term28263.getClass(), "sumTechAdvancedHighScore", -2892042709653134442L);
        setLongField(term28263, term28263.getClass(), "sumTechExpertHighScore", 1980274010918360742L);
        setLongField(term28263, term28263.getClass(), "sumTechMasterHighScore", 3205645145047776900L);
        setLongField(term28263, term28263.getClass(), "sumTechLunaticHighScore", -706258405349500259L);
        setLongField(term28263, term28263.getClass(), "sumBattleHighScore", -2336486223565755398L);
        setLongField(term28263, term28263.getClass(), "sumBattleBasicHighScore", -5604785092434648765L);
        setLongField(term28263, term28263.getClass(), "sumBattleAdvancedHighScore", 753843644992595899L);
        setLongField(term28263, term28263.getClass(), "sumBattleExpertHighScore", -2035876674935124725L);
        setLongField(term28263, term28263.getClass(), "sumBattleMasterHighScore", 4961271045442602009L);
        setLongField(term28263, term28263.getClass(), "sumBattleLunaticHighScore", 8143748492411850558L);
        setField(term28263, term28263.getClass(), "eventWatchedDate", "zHiuLPzYQM");
        setField(term28263, term28263.getClass(), "cmEventWatchedDate", "ioYxUYJBrh");
        setField(term28263, term28263.getClass(), "firstGameId", "GXoLEdKEIe");
        setField(term28263, term28263.getClass(), "firstRomVersion", "EugWXkztim");
        setField(term28263, term28263.getClass(), "firstDataVersion", "DvRdOzzihn");
        setField(term28263, term28263.getClass(), "firstPlayDate", "wIygCdQAKO");
        setField(term28263, term28263.getClass(), "lastGameId", "JsXroBYqwr");
        setField(term28263, term28263.getClass(), "lastRomVersion", "YciMAObLwl");
        setField(term28263, term28263.getClass(), "lastDataVersion", "qAmVqwwdyf");
        setField(term28263, term28263.getClass(), "compatibleCmVersion", "IXPaHQnEUy");
        setField(term28263, term28263.getClass(), "lastPlayDate", "zhcWVVrrjs");
        setIntField(term28263, term28263.getClass(), "lastPlaceId", 658285959);
        setField(term28263, term28263.getClass(), "lastPlaceName", "EAMaFLdmaG");
        setIntField(term28263, term28263.getClass(), "lastRegionId", -89362706);
        setField(term28263, term28263.getClass(), "lastRegionName", "DYZSJMwbhX");
        setIntField(term28263, term28263.getClass(), "lastAllNetId", 341388367);
        setField(term28263, term28263.getClass(), "lastClientId", "QGcshsIIWo");
        setIntField(term28263, term28263.getClass(), "lastUsedDeckId", 1078807592);
        setIntField(term28263, term28263.getClass(), "lastPlayMusicLevel", 1673044047);
        setIntField(term28263, term28263.getClass(), "lastEmoneyBrand", -1835617743);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBestBattlePoint", argTypes, term28263, args);
    }

};


