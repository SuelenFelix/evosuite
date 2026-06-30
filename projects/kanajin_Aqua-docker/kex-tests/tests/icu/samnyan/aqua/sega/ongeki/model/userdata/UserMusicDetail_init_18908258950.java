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

public class UserMusicDetail_init_18908258950 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403748;

    public UserMusicDetail_init_18908258950() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term403752 = new Long(-2097210721190032076L);
        term403748 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term403750 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term403766 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term403767 = newInstance(Class.forName("java.time.LocalDate"));
        Object term403771 = newInstance(Class.forName("java.time.LocalTime"));
        Object term403776 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term403777 = newInstance(Class.forName("java.time.LocalDate"));
        Object term403781 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term403748, term403748.getClass(), "id", -1434316050735076219L);
        setLongField(term403750, term403750.getClass(), "id", -5375722573779961660L);
        setField(term403750, term403750.getClass(), "extId", term403752);
        setField(term403750, term403750.getClass(), "luid", "RiAELwgpuT");
        setIntField(term403767, term403767.getClass(), "year", 2020);
        setShortField(term403767, term403767.getClass(), "month", (short) 12);
        setShortField(term403767, term403767.getClass(), "day", (short) 3);
        setField(term403766, term403766.getClass(), "date", term403767);
        setByteField(term403771, term403771.getClass(), "hour", (byte) 1);
        setByteField(term403771, term403771.getClass(), "minute", (byte) 33);
        setByteField(term403771, term403771.getClass(), "second", (byte) 21);
        setIntField(term403771, term403771.getClass(), "nano", 954639334);
        setField(term403766, term403766.getClass(), "time", term403771);
        setField(term403750, term403750.getClass(), "registerTime", term403766);
        setIntField(term403777, term403777.getClass(), "year", 2015);
        setShortField(term403777, term403777.getClass(), "month", (short) 1);
        setShortField(term403777, term403777.getClass(), "day", (short) 25);
        setField(term403776, term403776.getClass(), "date", term403777);
        setByteField(term403781, term403781.getClass(), "hour", (byte) 18);
        setByteField(term403781, term403781.getClass(), "minute", (byte) 44);
        setByteField(term403781, term403781.getClass(), "second", (byte) 8);
        setIntField(term403781, term403781.getClass(), "nano", 166791078);
        setField(term403776, term403776.getClass(), "time", term403781);
        setField(term403750, term403750.getClass(), "accessTime", term403776);
        setField(term403748, term403748.getClass(), "card", term403750);
        setField(term403748, term403748.getClass(), "userName", "TnUWGhiBJG");
        setIntField(term403748, term403748.getClass(), "level", -1810432564);
        setIntField(term403748, term403748.getClass(), "reincarnationNum", -403924176);
        setLongField(term403748, term403748.getClass(), "exp", -6304168127691353469L);
        setLongField(term403748, term403748.getClass(), "point", -4319775030389096180L);
        setLongField(term403748, term403748.getClass(), "totalPoint", 8440135551086448673L);
        setIntField(term403748, term403748.getClass(), "playCount", 1029987063);
        setIntField(term403748, term403748.getClass(), "jewelCount", -26564822);
        setIntField(term403748, term403748.getClass(), "totalJewelCount", 1881725988);
        setIntField(term403748, term403748.getClass(), "medalCount", -1802238988);
        setIntField(term403748, term403748.getClass(), "playerRating", 1436863976);
        setIntField(term403748, term403748.getClass(), "highestRating", -1286962366);
        setIntField(term403748, term403748.getClass(), "battlePoint", -499753284);
        setIntField(term403748, term403748.getClass(), "bestBattlePoint", -144419120);
        setIntField(term403748, term403748.getClass(), "overDamageBattlePoint", -32392153);
        setBooleanField(term403748, term403748.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term403748, term403748.getClass(), "nameplateId", -384370029);
        setIntField(term403748, term403748.getClass(), "trophyId", 1870975673);
        setIntField(term403748, term403748.getClass(), "cardId", -1889336200);
        setIntField(term403748, term403748.getClass(), "characterId", -79909779);
        setIntField(term403748, term403748.getClass(), "characterVoiceNo", -2068451256);
        setIntField(term403748, term403748.getClass(), "tabSetting", -1715128975);
        setIntField(term403748, term403748.getClass(), "tabSortSetting", 359232869);
        setIntField(term403748, term403748.getClass(), "cardCategorySetting", -1621330591);
        setIntField(term403748, term403748.getClass(), "cardSortSetting", -882680447);
        setIntField(term403748, term403748.getClass(), "rivalScoreCategorySetting", -286418059);
        setIntField(term403748, term403748.getClass(), "playedTutorialBit", -34374016);
        setIntField(term403748, term403748.getClass(), "firstTutorialCancelNum", 972990012);
        setLongField(term403748, term403748.getClass(), "sumTechHighScore", -1672229233068843874L);
        setLongField(term403748, term403748.getClass(), "sumTechBasicHighScore", 3159179241617765315L);
        setLongField(term403748, term403748.getClass(), "sumTechAdvancedHighScore", -1618481608996124894L);
        setLongField(term403748, term403748.getClass(), "sumTechExpertHighScore", -7044858981045809848L);
        setLongField(term403748, term403748.getClass(), "sumTechMasterHighScore", -2399581411225761909L);
        setLongField(term403748, term403748.getClass(), "sumTechLunaticHighScore", 6838360539524603827L);
        setLongField(term403748, term403748.getClass(), "sumBattleHighScore", 3645049769064707157L);
        setLongField(term403748, term403748.getClass(), "sumBattleBasicHighScore", -5403608159440697074L);
        setLongField(term403748, term403748.getClass(), "sumBattleAdvancedHighScore", -1325819407199766515L);
        setLongField(term403748, term403748.getClass(), "sumBattleExpertHighScore", 6448648790433973386L);
        setLongField(term403748, term403748.getClass(), "sumBattleMasterHighScore", -8369210930627405290L);
        setLongField(term403748, term403748.getClass(), "sumBattleLunaticHighScore", -3991405205763855637L);
        setField(term403748, term403748.getClass(), "eventWatchedDate", "AVgRkUclIn");
        setField(term403748, term403748.getClass(), "cmEventWatchedDate", "RsOHwiPcSn");
        setField(term403748, term403748.getClass(), "firstGameId", "jYdZJbYNXQ");
        setField(term403748, term403748.getClass(), "firstRomVersion", "OFNVOrcZaF");
        setField(term403748, term403748.getClass(), "firstDataVersion", "pzZIIWrnvc");
        setField(term403748, term403748.getClass(), "firstPlayDate", "xMnRPHjMzF");
        setField(term403748, term403748.getClass(), "lastGameId", "ExrRWdHRFr");
        setField(term403748, term403748.getClass(), "lastRomVersion", "YmGaBRxVhO");
        setField(term403748, term403748.getClass(), "lastDataVersion", "YjJtHesNkx");
        setField(term403748, term403748.getClass(), "compatibleCmVersion", "RQZPJcxkLc");
        setField(term403748, term403748.getClass(), "lastPlayDate", "HctIXPJDrL");
        setIntField(term403748, term403748.getClass(), "lastPlaceId", 74331935);
        setField(term403748, term403748.getClass(), "lastPlaceName", "QYOlWgVvVF");
        setIntField(term403748, term403748.getClass(), "lastRegionId", 1418953681);
        setField(term403748, term403748.getClass(), "lastRegionName", "mbwHuNQIGU");
        setIntField(term403748, term403748.getClass(), "lastAllNetId", 1880354073);
        setField(term403748, term403748.getClass(), "lastClientId", "GUryqobLpc");
        setIntField(term403748, term403748.getClass(), "lastUsedDeckId", -1865132625);
        setIntField(term403748, term403748.getClass(), "lastPlayMusicLevel", 1551719647);
        setIntField(term403748, term403748.getClass(), "lastEmoneyBrand", 2038537105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Object[] args = new Object[1];
        args[0] = term403748;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


