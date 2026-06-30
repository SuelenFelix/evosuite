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

public class UserCard_getCreated_143749932717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120251;

    public UserCard_getCreated_143749932717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term120257 = new Long(-2187638136407967948L);
        term120251 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term120253 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term120255 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term120271 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120272 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120276 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120281 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120282 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120286 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term120251, term120251.getClass(), "id", 3768946271590447122L);
        setLongField(term120253, term120253.getClass(), "id", -3105866075742210004L);
        setLongField(term120255, term120255.getClass(), "id", 5044780614134795929L);
        setField(term120255, term120255.getClass(), "extId", term120257);
        setField(term120255, term120255.getClass(), "luid", "PEALeSdAvS");
        setIntField(term120272, term120272.getClass(), "year", 2013);
        setShortField(term120272, term120272.getClass(), "month", (short) 5);
        setShortField(term120272, term120272.getClass(), "day", (short) 9);
        setField(term120271, term120271.getClass(), "date", term120272);
        setByteField(term120276, term120276.getClass(), "hour", (byte) 21);
        setByteField(term120276, term120276.getClass(), "minute", (byte) 29);
        setByteField(term120276, term120276.getClass(), "second", (byte) 31);
        setIntField(term120276, term120276.getClass(), "nano", 674914044);
        setField(term120271, term120271.getClass(), "time", term120276);
        setField(term120255, term120255.getClass(), "registerTime", term120271);
        setIntField(term120282, term120282.getClass(), "year", 2029);
        setShortField(term120282, term120282.getClass(), "month", (short) 10);
        setShortField(term120282, term120282.getClass(), "day", (short) 7);
        setField(term120281, term120281.getClass(), "date", term120282);
        setByteField(term120286, term120286.getClass(), "hour", (byte) 8);
        setByteField(term120286, term120286.getClass(), "minute", (byte) 43);
        setByteField(term120286, term120286.getClass(), "second", (byte) 49);
        setIntField(term120286, term120286.getClass(), "nano", 733700043);
        setField(term120281, term120281.getClass(), "time", term120286);
        setField(term120255, term120255.getClass(), "accessTime", term120281);
        setField(term120253, term120253.getClass(), "card", term120255);
        setField(term120253, term120253.getClass(), "userName", "oryVZfLyAF");
        setIntField(term120253, term120253.getClass(), "level", 446655571);
        setIntField(term120253, term120253.getClass(), "reincarnationNum", -103286218);
        setLongField(term120253, term120253.getClass(), "exp", 484211422990247322L);
        setLongField(term120253, term120253.getClass(), "point", 6944467326545185612L);
        setLongField(term120253, term120253.getClass(), "totalPoint", -1462881120810904068L);
        setIntField(term120253, term120253.getClass(), "playCount", 1899730567);
        setIntField(term120253, term120253.getClass(), "jewelCount", -658153436);
        setIntField(term120253, term120253.getClass(), "totalJewelCount", 2119366240);
        setIntField(term120253, term120253.getClass(), "medalCount", -233596948);
        setIntField(term120253, term120253.getClass(), "playerRating", -187512293);
        setIntField(term120253, term120253.getClass(), "highestRating", 829156189);
        setIntField(term120253, term120253.getClass(), "battlePoint", -745642050);
        setIntField(term120253, term120253.getClass(), "bestBattlePoint", 1498249247);
        setIntField(term120253, term120253.getClass(), "overDamageBattlePoint", 2032424716);
        setBooleanField(term120253, term120253.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term120253, term120253.getClass(), "nameplateId", 1201741322);
        setIntField(term120253, term120253.getClass(), "trophyId", 1106593440);
        setIntField(term120253, term120253.getClass(), "cardId", -1644050596);
        setIntField(term120253, term120253.getClass(), "characterId", 543019558);
        setIntField(term120253, term120253.getClass(), "characterVoiceNo", 1902128793);
        setIntField(term120253, term120253.getClass(), "tabSetting", 1944258008);
        setIntField(term120253, term120253.getClass(), "tabSortSetting", -1292525809);
        setIntField(term120253, term120253.getClass(), "cardCategorySetting", -642577507);
        setIntField(term120253, term120253.getClass(), "cardSortSetting", 1430669401);
        setIntField(term120253, term120253.getClass(), "rivalScoreCategorySetting", -39090052);
        setIntField(term120253, term120253.getClass(), "playedTutorialBit", -1893438887);
        setIntField(term120253, term120253.getClass(), "firstTutorialCancelNum", -310872754);
        setLongField(term120253, term120253.getClass(), "sumTechHighScore", -5973896292874312823L);
        setLongField(term120253, term120253.getClass(), "sumTechBasicHighScore", 6513510396422637934L);
        setLongField(term120253, term120253.getClass(), "sumTechAdvancedHighScore", 4096695561039636336L);
        setLongField(term120253, term120253.getClass(), "sumTechExpertHighScore", -1644373261371071226L);
        setLongField(term120253, term120253.getClass(), "sumTechMasterHighScore", 5000934326886384107L);
        setLongField(term120253, term120253.getClass(), "sumTechLunaticHighScore", -4297212176638829440L);
        setLongField(term120253, term120253.getClass(), "sumBattleHighScore", 8215651910912029934L);
        setLongField(term120253, term120253.getClass(), "sumBattleBasicHighScore", -3920613380913851875L);
        setLongField(term120253, term120253.getClass(), "sumBattleAdvancedHighScore", -440755498557401601L);
        setLongField(term120253, term120253.getClass(), "sumBattleExpertHighScore", -5218993020177690425L);
        setLongField(term120253, term120253.getClass(), "sumBattleMasterHighScore", -5010811251033649416L);
        setLongField(term120253, term120253.getClass(), "sumBattleLunaticHighScore", -3608698424858065799L);
        setField(term120253, term120253.getClass(), "eventWatchedDate", "comITQlWZO");
        setField(term120253, term120253.getClass(), "cmEventWatchedDate", "NsaFgLGmdm");
        setField(term120253, term120253.getClass(), "firstGameId", "NpeQNuPyKD");
        setField(term120253, term120253.getClass(), "firstRomVersion", "PWrDivLkwt");
        setField(term120253, term120253.getClass(), "firstDataVersion", "oyymZILKkI");
        setField(term120253, term120253.getClass(), "firstPlayDate", "yIAqrFHbcK");
        setField(term120253, term120253.getClass(), "lastGameId", "qoqkuSpUdQ");
        setField(term120253, term120253.getClass(), "lastRomVersion", "cuOkblUYnI");
        setField(term120253, term120253.getClass(), "lastDataVersion", "FpMNcPTbIL");
        setField(term120253, term120253.getClass(), "compatibleCmVersion", "xLwIZPJWuC");
        setField(term120253, term120253.getClass(), "lastPlayDate", "nWudcjLvSq");
        setIntField(term120253, term120253.getClass(), "lastPlaceId", -2006897036);
        setField(term120253, term120253.getClass(), "lastPlaceName", "WdAMelVmvU");
        setIntField(term120253, term120253.getClass(), "lastRegionId", 99466182);
        setField(term120253, term120253.getClass(), "lastRegionName", "FSZMcVNHZZ");
        setIntField(term120253, term120253.getClass(), "lastAllNetId", -1520548826);
        setField(term120253, term120253.getClass(), "lastClientId", "uasckiUYzs");
        setIntField(term120253, term120253.getClass(), "lastUsedDeckId", 1183263051);
        setIntField(term120253, term120253.getClass(), "lastPlayMusicLevel", 626039325);
        setIntField(term120253, term120253.getClass(), "lastEmoneyBrand", -1990497476);
        setField(term120251, term120251.getClass(), "user", term120253);
        setIntField(term120251, term120251.getClass(), "cardId", -1);
        setIntField(term120251, term120251.getClass(), "digitalStock", 1);
        setIntField(term120251, term120251.getClass(), "analogStock", 304456317);
        setIntField(term120251, term120251.getClass(), "level", -352562026);
        setIntField(term120251, term120251.getClass(), "maxLevel", 10);
        setIntField(term120251, term120251.getClass(), "exp", -1805465595);
        setIntField(term120251, term120251.getClass(), "printCount", 887599888);
        setIntField(term120251, term120251.getClass(), "useCount", 1751900954);
        setBooleanField(term120251, term120251.getClass(), "isNew", true);
        setField(term120251, term120251.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term120251, term120251.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term120251, term120251.getClass(), "skillId", 2134772267);
        setBooleanField(term120251, term120251.getClass(), "isAcquired", true);
        setField(term120251, term120251.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCreated", argTypes, term120251, args);
    }

};


