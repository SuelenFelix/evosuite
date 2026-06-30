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

public class UserData_canEqual_93239617125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75262;
     Object term75525;

    public UserData_canEqual_93239617125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term75266 = new Long(-5724112525188606013L);
        term75262 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term75264 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term75280 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75281 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75285 = newInstance(Class.forName("java.time.LocalTime"));
        Object term75290 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term75291 = newInstance(Class.forName("java.time.LocalDate"));
        Object term75295 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term75262, term75262.getClass(), "id", 564179403578347108L);
        setLongField(term75264, term75264.getClass(), "id", -6293767832755310218L);
        setField(term75264, term75264.getClass(), "extId", term75266);
        setField(term75264, term75264.getClass(), "luid", "cUonKmQWCB");
        setIntField(term75281, term75281.getClass(), "year", 2018);
        setShortField(term75281, term75281.getClass(), "month", (short) 1);
        setShortField(term75281, term75281.getClass(), "day", (short) 7);
        setField(term75280, term75280.getClass(), "date", term75281);
        setByteField(term75285, term75285.getClass(), "hour", (byte) 5);
        setByteField(term75285, term75285.getClass(), "minute", (byte) 42);
        setByteField(term75285, term75285.getClass(), "second", (byte) 49);
        setIntField(term75285, term75285.getClass(), "nano", 291814792);
        setField(term75280, term75280.getClass(), "time", term75285);
        setField(term75264, term75264.getClass(), "registerTime", term75280);
        setIntField(term75291, term75291.getClass(), "year", 2022);
        setShortField(term75291, term75291.getClass(), "month", (short) 7);
        setShortField(term75291, term75291.getClass(), "day", (short) 9);
        setField(term75290, term75290.getClass(), "date", term75291);
        setByteField(term75295, term75295.getClass(), "hour", (byte) 21);
        setByteField(term75295, term75295.getClass(), "minute", (byte) 48);
        setByteField(term75295, term75295.getClass(), "second", (byte) 58);
        setIntField(term75295, term75295.getClass(), "nano", 579553780);
        setField(term75290, term75290.getClass(), "time", term75295);
        setField(term75264, term75264.getClass(), "accessTime", term75290);
        setField(term75262, term75262.getClass(), "card", term75264);
        setField(term75262, term75262.getClass(), "userName", "CvbqWuRute");
        setIntField(term75262, term75262.getClass(), "level", 1557955716);
        setIntField(term75262, term75262.getClass(), "reincarnationNum", -1628863633);
        setLongField(term75262, term75262.getClass(), "exp", -2050848614286348518L);
        setLongField(term75262, term75262.getClass(), "point", -8891931985436128241L);
        setLongField(term75262, term75262.getClass(), "totalPoint", -6033375404212182966L);
        setIntField(term75262, term75262.getClass(), "playCount", -450265927);
        setIntField(term75262, term75262.getClass(), "jewelCount", 914533606);
        setIntField(term75262, term75262.getClass(), "totalJewelCount", 1857214977);
        setIntField(term75262, term75262.getClass(), "medalCount", 756946672);
        setIntField(term75262, term75262.getClass(), "playerRating", 1363323545);
        setIntField(term75262, term75262.getClass(), "highestRating", -1090735178);
        setIntField(term75262, term75262.getClass(), "battlePoint", -651624649);
        setIntField(term75262, term75262.getClass(), "bestBattlePoint", -888494532);
        setIntField(term75262, term75262.getClass(), "overDamageBattlePoint", 284122377);
        setBooleanField(term75262, term75262.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term75262, term75262.getClass(), "nameplateId", 1577003230);
        setIntField(term75262, term75262.getClass(), "trophyId", -2042495274);
        setIntField(term75262, term75262.getClass(), "cardId", 35579148);
        setIntField(term75262, term75262.getClass(), "characterId", -77377900);
        setIntField(term75262, term75262.getClass(), "characterVoiceNo", 199979610);
        setIntField(term75262, term75262.getClass(), "tabSetting", -605796164);
        setIntField(term75262, term75262.getClass(), "tabSortSetting", -931072478);
        setIntField(term75262, term75262.getClass(), "cardCategorySetting", 2032311568);
        setIntField(term75262, term75262.getClass(), "cardSortSetting", 92598850);
        setIntField(term75262, term75262.getClass(), "rivalScoreCategorySetting", 1856498878);
        setIntField(term75262, term75262.getClass(), "playedTutorialBit", 274237632);
        setIntField(term75262, term75262.getClass(), "firstTutorialCancelNum", -1033663489);
        setLongField(term75262, term75262.getClass(), "sumTechHighScore", 90919700177074161L);
        setLongField(term75262, term75262.getClass(), "sumTechBasicHighScore", -6590532407494439408L);
        setLongField(term75262, term75262.getClass(), "sumTechAdvancedHighScore", -6471364019572540705L);
        setLongField(term75262, term75262.getClass(), "sumTechExpertHighScore", 3643648387583329737L);
        setLongField(term75262, term75262.getClass(), "sumTechMasterHighScore", 1005259662364765094L);
        setLongField(term75262, term75262.getClass(), "sumTechLunaticHighScore", 7575427910876423093L);
        setLongField(term75262, term75262.getClass(), "sumBattleHighScore", 3175154144372494944L);
        setLongField(term75262, term75262.getClass(), "sumBattleBasicHighScore", -2463322238616422697L);
        setLongField(term75262, term75262.getClass(), "sumBattleAdvancedHighScore", 2408965375678908663L);
        setLongField(term75262, term75262.getClass(), "sumBattleExpertHighScore", -556491737091506400L);
        setLongField(term75262, term75262.getClass(), "sumBattleMasterHighScore", 1288455695602933736L);
        setLongField(term75262, term75262.getClass(), "sumBattleLunaticHighScore", 2892238837190945228L);
        setField(term75262, term75262.getClass(), "eventWatchedDate", "yuvBFZQJBJ");
        setField(term75262, term75262.getClass(), "cmEventWatchedDate", "prymoiXBsv");
        setField(term75262, term75262.getClass(), "firstGameId", "XVkgypnsVx");
        setField(term75262, term75262.getClass(), "firstRomVersion", "TwXzbEYFtG");
        setField(term75262, term75262.getClass(), "firstDataVersion", "mRdoimcRwz");
        setField(term75262, term75262.getClass(), "firstPlayDate", "dxJDKuPPPM");
        setField(term75262, term75262.getClass(), "lastGameId", "rXBuuDWXsm");
        setField(term75262, term75262.getClass(), "lastRomVersion", "VSvKttZYSC");
        setField(term75262, term75262.getClass(), "lastDataVersion", "bbwxScASWL");
        setField(term75262, term75262.getClass(), "compatibleCmVersion", "BXJdQmJvFh");
        setField(term75262, term75262.getClass(), "lastPlayDate", "bsPTRsievL");
        setIntField(term75262, term75262.getClass(), "lastPlaceId", 476488543);
        setField(term75262, term75262.getClass(), "lastPlaceName", "LPLRACmzWM");
        setIntField(term75262, term75262.getClass(), "lastRegionId", -1626915417);
        setField(term75262, term75262.getClass(), "lastRegionName", "DfdUvykRzo");
        setIntField(term75262, term75262.getClass(), "lastAllNetId", 665442653);
        setField(term75262, term75262.getClass(), "lastClientId", "TWPJmzPTXg");
        setIntField(term75262, term75262.getClass(), "lastUsedDeckId", 803178808);
        setIntField(term75262, term75262.getClass(), "lastPlayMusicLevel", 1767729920);
        setIntField(term75262, term75262.getClass(), "lastEmoneyBrand", -154656640);
        term75525 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term75525;
        callMethod(klass, "canEqual", argTypes, term75262, args);
    }

};


