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

public class UserCard_getAnalogStock_16794517846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114003;

    public UserCard_getAnalogStock_16794517846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term114009 = new Long(5806367330808555223L);
        term114003 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term114005 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term114007 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term114023 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114024 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114028 = newInstance(Class.forName("java.time.LocalTime"));
        Object term114033 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term114034 = newInstance(Class.forName("java.time.LocalDate"));
        Object term114038 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term114003, term114003.getClass(), "id", -3801921402004685424L);
        setLongField(term114005, term114005.getClass(), "id", -3463644926354732324L);
        setLongField(term114007, term114007.getClass(), "id", 5656583897055752640L);
        setField(term114007, term114007.getClass(), "extId", term114009);
        setField(term114007, term114007.getClass(), "luid", "UXtNgOITuj");
        setIntField(term114024, term114024.getClass(), "year", 2016);
        setShortField(term114024, term114024.getClass(), "month", (short) 5);
        setShortField(term114024, term114024.getClass(), "day", (short) 9);
        setField(term114023, term114023.getClass(), "date", term114024);
        setByteField(term114028, term114028.getClass(), "hour", (byte) 22);
        setByteField(term114028, term114028.getClass(), "minute", (byte) 50);
        setByteField(term114028, term114028.getClass(), "second", (byte) 14);
        setIntField(term114028, term114028.getClass(), "nano", 185148211);
        setField(term114023, term114023.getClass(), "time", term114028);
        setField(term114007, term114007.getClass(), "registerTime", term114023);
        setIntField(term114034, term114034.getClass(), "year", 2014);
        setShortField(term114034, term114034.getClass(), "month", (short) 3);
        setShortField(term114034, term114034.getClass(), "day", (short) 7);
        setField(term114033, term114033.getClass(), "date", term114034);
        setByteField(term114038, term114038.getClass(), "hour", (byte) 2);
        setByteField(term114038, term114038.getClass(), "minute", (byte) 57);
        setByteField(term114038, term114038.getClass(), "second", (byte) 26);
        setIntField(term114038, term114038.getClass(), "nano", 493613741);
        setField(term114033, term114033.getClass(), "time", term114038);
        setField(term114007, term114007.getClass(), "accessTime", term114033);
        setField(term114005, term114005.getClass(), "card", term114007);
        setField(term114005, term114005.getClass(), "userName", "NpmLmrGTHj");
        setIntField(term114005, term114005.getClass(), "level", 867331913);
        setIntField(term114005, term114005.getClass(), "reincarnationNum", -1360909976);
        setLongField(term114005, term114005.getClass(), "exp", 2829178288741613600L);
        setLongField(term114005, term114005.getClass(), "point", -6491997440899828260L);
        setLongField(term114005, term114005.getClass(), "totalPoint", 6604515146366453758L);
        setIntField(term114005, term114005.getClass(), "playCount", 507026333);
        setIntField(term114005, term114005.getClass(), "jewelCount", 632908451);
        setIntField(term114005, term114005.getClass(), "totalJewelCount", -1776006683);
        setIntField(term114005, term114005.getClass(), "medalCount", 7927502);
        setIntField(term114005, term114005.getClass(), "playerRating", 1449735015);
        setIntField(term114005, term114005.getClass(), "highestRating", -2039500407);
        setIntField(term114005, term114005.getClass(), "battlePoint", -968543680);
        setIntField(term114005, term114005.getClass(), "bestBattlePoint", -1689022557);
        setIntField(term114005, term114005.getClass(), "overDamageBattlePoint", 1722389932);
        setBooleanField(term114005, term114005.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term114005, term114005.getClass(), "nameplateId", 944378703);
        setIntField(term114005, term114005.getClass(), "trophyId", 69559711);
        setIntField(term114005, term114005.getClass(), "cardId", -1086780030);
        setIntField(term114005, term114005.getClass(), "characterId", 250290750);
        setIntField(term114005, term114005.getClass(), "characterVoiceNo", 248490601);
        setIntField(term114005, term114005.getClass(), "tabSetting", 2110976760);
        setIntField(term114005, term114005.getClass(), "tabSortSetting", -1837808345);
        setIntField(term114005, term114005.getClass(), "cardCategorySetting", 1898123858);
        setIntField(term114005, term114005.getClass(), "cardSortSetting", 161447730);
        setIntField(term114005, term114005.getClass(), "rivalScoreCategorySetting", -1595547996);
        setIntField(term114005, term114005.getClass(), "playedTutorialBit", -997740019);
        setIntField(term114005, term114005.getClass(), "firstTutorialCancelNum", -257284782);
        setLongField(term114005, term114005.getClass(), "sumTechHighScore", -6870471517414180813L);
        setLongField(term114005, term114005.getClass(), "sumTechBasicHighScore", -2730925245414211883L);
        setLongField(term114005, term114005.getClass(), "sumTechAdvancedHighScore", 4916484987595412942L);
        setLongField(term114005, term114005.getClass(), "sumTechExpertHighScore", 1694006504988171543L);
        setLongField(term114005, term114005.getClass(), "sumTechMasterHighScore", 6240836714377799088L);
        setLongField(term114005, term114005.getClass(), "sumTechLunaticHighScore", -8873620250963771859L);
        setLongField(term114005, term114005.getClass(), "sumBattleHighScore", -1472323836689877922L);
        setLongField(term114005, term114005.getClass(), "sumBattleBasicHighScore", 7622376820753838488L);
        setLongField(term114005, term114005.getClass(), "sumBattleAdvancedHighScore", 8351327195058320289L);
        setLongField(term114005, term114005.getClass(), "sumBattleExpertHighScore", -1243769387042129320L);
        setLongField(term114005, term114005.getClass(), "sumBattleMasterHighScore", 2444421751746962057L);
        setLongField(term114005, term114005.getClass(), "sumBattleLunaticHighScore", -6752863710428340080L);
        setField(term114005, term114005.getClass(), "eventWatchedDate", "BPWhlQnFCE");
        setField(term114005, term114005.getClass(), "cmEventWatchedDate", "CPQejCPAgr");
        setField(term114005, term114005.getClass(), "firstGameId", "epVEZIxJwk");
        setField(term114005, term114005.getClass(), "firstRomVersion", "BXROAUdJLA");
        setField(term114005, term114005.getClass(), "firstDataVersion", "hGaZkCaPVx");
        setField(term114005, term114005.getClass(), "firstPlayDate", "NuXhRMHMqg");
        setField(term114005, term114005.getClass(), "lastGameId", "XZoFaqRxkb");
        setField(term114005, term114005.getClass(), "lastRomVersion", "LpERFmEphm");
        setField(term114005, term114005.getClass(), "lastDataVersion", "ZtXtZNcDRU");
        setField(term114005, term114005.getClass(), "compatibleCmVersion", "ZHBibLHikD");
        setField(term114005, term114005.getClass(), "lastPlayDate", "ytpYllcFQh");
        setIntField(term114005, term114005.getClass(), "lastPlaceId", -1864133072);
        setField(term114005, term114005.getClass(), "lastPlaceName", "VogiBHEnKP");
        setIntField(term114005, term114005.getClass(), "lastRegionId", 1425952082);
        setField(term114005, term114005.getClass(), "lastRegionName", "PCeXUuZyQa");
        setIntField(term114005, term114005.getClass(), "lastAllNetId", 23263320);
        setField(term114005, term114005.getClass(), "lastClientId", "uencoVszfi");
        setIntField(term114005, term114005.getClass(), "lastUsedDeckId", -920008974);
        setIntField(term114005, term114005.getClass(), "lastPlayMusicLevel", 988815004);
        setIntField(term114005, term114005.getClass(), "lastEmoneyBrand", 2114316862);
        setField(term114003, term114003.getClass(), "user", term114005);
        setIntField(term114003, term114003.getClass(), "cardId", -1);
        setIntField(term114003, term114003.getClass(), "digitalStock", 1);
        setIntField(term114003, term114003.getClass(), "analogStock", 2030575861);
        setIntField(term114003, term114003.getClass(), "level", -320011647);
        setIntField(term114003, term114003.getClass(), "maxLevel", 10);
        setIntField(term114003, term114003.getClass(), "exp", 1489536288);
        setIntField(term114003, term114003.getClass(), "printCount", -1536885597);
        setIntField(term114003, term114003.getClass(), "useCount", -1906904065);
        setBooleanField(term114003, term114003.getClass(), "isNew", true);
        setField(term114003, term114003.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term114003, term114003.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term114003, term114003.getClass(), "skillId", -1325607039);
        setBooleanField(term114003, term114003.getClass(), "isAcquired", true);
        setField(term114003, term114003.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getAnalogStock", argTypes, term114003, args);
    }

};


