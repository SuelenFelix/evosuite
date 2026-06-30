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

public class UserMusicItem_getMusicId_12685731923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1278;

    public UserMusicItem_getMusicId_12685731923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term1284 = new Long(-8400487765614892086L);
        term1278 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem"));
        Object term1280 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term1282 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term1298 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1299 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1303 = newInstance(Class.forName("java.time.LocalTime"));
        Object term1308 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term1309 = newInstance(Class.forName("java.time.LocalDate"));
        Object term1313 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term1278, term1278.getClass(), "id", -2850532706972744550L);
        setLongField(term1280, term1280.getClass(), "id", -2644215923136513282L);
        setLongField(term1282, term1282.getClass(), "id", -1468719814009985452L);
        setField(term1282, term1282.getClass(), "extId", term1284);
        setField(term1282, term1282.getClass(), "luid", "xLbjWUgOIL");
        setIntField(term1299, term1299.getClass(), "year", 2025);
        setShortField(term1299, term1299.getClass(), "month", (short) 4);
        setShortField(term1299, term1299.getClass(), "day", (short) 24);
        setField(term1298, term1298.getClass(), "date", term1299);
        setByteField(term1303, term1303.getClass(), "hour", (byte) 18);
        setByteField(term1303, term1303.getClass(), "minute", (byte) 11);
        setByteField(term1303, term1303.getClass(), "second", (byte) 40);
        setIntField(term1303, term1303.getClass(), "nano", 137454929);
        setField(term1298, term1298.getClass(), "time", term1303);
        setField(term1282, term1282.getClass(), "registerTime", term1298);
        setIntField(term1309, term1309.getClass(), "year", 2024);
        setShortField(term1309, term1309.getClass(), "month", (short) 1);
        setShortField(term1309, term1309.getClass(), "day", (short) 24);
        setField(term1308, term1308.getClass(), "date", term1309);
        setByteField(term1313, term1313.getClass(), "hour", (byte) 20);
        setByteField(term1313, term1313.getClass(), "minute", (byte) 28);
        setByteField(term1313, term1313.getClass(), "second", (byte) 39);
        setIntField(term1313, term1313.getClass(), "nano", 952728177);
        setField(term1308, term1308.getClass(), "time", term1313);
        setField(term1282, term1282.getClass(), "accessTime", term1308);
        setField(term1280, term1280.getClass(), "card", term1282);
        setField(term1280, term1280.getClass(), "userName", "jDtqGUpnZN");
        setIntField(term1280, term1280.getClass(), "level", -1845499264);
        setIntField(term1280, term1280.getClass(), "reincarnationNum", -505439934);
        setLongField(term1280, term1280.getClass(), "exp", -7738503207562305297L);
        setLongField(term1280, term1280.getClass(), "point", 3825396310311739952L);
        setLongField(term1280, term1280.getClass(), "totalPoint", -3838084482494604218L);
        setIntField(term1280, term1280.getClass(), "playCount", -344842608);
        setIntField(term1280, term1280.getClass(), "jewelCount", 941650513);
        setIntField(term1280, term1280.getClass(), "totalJewelCount", 444029505);
        setIntField(term1280, term1280.getClass(), "medalCount", -1034506028);
        setIntField(term1280, term1280.getClass(), "playerRating", -1263114719);
        setIntField(term1280, term1280.getClass(), "highestRating", -894662986);
        setIntField(term1280, term1280.getClass(), "battlePoint", 304775596);
        setIntField(term1280, term1280.getClass(), "bestBattlePoint", -1347665717);
        setIntField(term1280, term1280.getClass(), "overDamageBattlePoint", -1888585309);
        setBooleanField(term1280, term1280.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term1280, term1280.getClass(), "nameplateId", 683666002);
        setIntField(term1280, term1280.getClass(), "trophyId", 1596213415);
        setIntField(term1280, term1280.getClass(), "cardId", -268815336);
        setIntField(term1280, term1280.getClass(), "characterId", -1210583429);
        setIntField(term1280, term1280.getClass(), "characterVoiceNo", -663691365);
        setIntField(term1280, term1280.getClass(), "tabSetting", 339854490);
        setIntField(term1280, term1280.getClass(), "tabSortSetting", -615654495);
        setIntField(term1280, term1280.getClass(), "cardCategorySetting", -1476117762);
        setIntField(term1280, term1280.getClass(), "cardSortSetting", -341962980);
        setIntField(term1280, term1280.getClass(), "rivalScoreCategorySetting", 1532716628);
        setIntField(term1280, term1280.getClass(), "playedTutorialBit", -1801760683);
        setIntField(term1280, term1280.getClass(), "firstTutorialCancelNum", 1141317871);
        setLongField(term1280, term1280.getClass(), "sumTechHighScore", 3892018155439224435L);
        setLongField(term1280, term1280.getClass(), "sumTechBasicHighScore", 5953383087795962419L);
        setLongField(term1280, term1280.getClass(), "sumTechAdvancedHighScore", 7994303628307559416L);
        setLongField(term1280, term1280.getClass(), "sumTechExpertHighScore", 2443640364875054177L);
        setLongField(term1280, term1280.getClass(), "sumTechMasterHighScore", -1610676979013636850L);
        setLongField(term1280, term1280.getClass(), "sumTechLunaticHighScore", 2062173786000223358L);
        setLongField(term1280, term1280.getClass(), "sumBattleHighScore", -8658027316505137504L);
        setLongField(term1280, term1280.getClass(), "sumBattleBasicHighScore", 414749984815662075L);
        setLongField(term1280, term1280.getClass(), "sumBattleAdvancedHighScore", 463622836963501975L);
        setLongField(term1280, term1280.getClass(), "sumBattleExpertHighScore", 305759998609888272L);
        setLongField(term1280, term1280.getClass(), "sumBattleMasterHighScore", -8654565919063661957L);
        setLongField(term1280, term1280.getClass(), "sumBattleLunaticHighScore", -5248475803419977214L);
        setField(term1280, term1280.getClass(), "eventWatchedDate", "nGKItKLYNC");
        setField(term1280, term1280.getClass(), "cmEventWatchedDate", "UiUYnPrcCi");
        setField(term1280, term1280.getClass(), "firstGameId", "UoYtihxVaS");
        setField(term1280, term1280.getClass(), "firstRomVersion", "JDswTTCZHV");
        setField(term1280, term1280.getClass(), "firstDataVersion", "onpbIeEKoi");
        setField(term1280, term1280.getClass(), "firstPlayDate", "YRHGsAkhxb");
        setField(term1280, term1280.getClass(), "lastGameId", "ffYhPOzlUs");
        setField(term1280, term1280.getClass(), "lastRomVersion", "MLqYREekMl");
        setField(term1280, term1280.getClass(), "lastDataVersion", "ytSBIKXogI");
        setField(term1280, term1280.getClass(), "compatibleCmVersion", "nHXjMycHlU");
        setField(term1280, term1280.getClass(), "lastPlayDate", "ieCtQFdkii");
        setIntField(term1280, term1280.getClass(), "lastPlaceId", 890669485);
        setField(term1280, term1280.getClass(), "lastPlaceName", "dEnhdmILtU");
        setIntField(term1280, term1280.getClass(), "lastRegionId", 691577392);
        setField(term1280, term1280.getClass(), "lastRegionName", "hoicvmsovO");
        setIntField(term1280, term1280.getClass(), "lastAllNetId", -893623680);
        setField(term1280, term1280.getClass(), "lastClientId", "eqJfYWRaEL");
        setIntField(term1280, term1280.getClass(), "lastUsedDeckId", -1963434938);
        setIntField(term1280, term1280.getClass(), "lastPlayMusicLevel", 906181092);
        setIntField(term1280, term1280.getClass(), "lastEmoneyBrand", 1045657203);
        setField(term1278, term1278.getClass(), "user", term1280);
        setIntField(term1278, term1278.getClass(), "musicId", 1386130016);
        setIntField(term1278, term1278.getClass(), "status", 1072005683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMusicId", argTypes, term1278, args);
    }

};


