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

public class UserData_getFirstDataVersion_119064874346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41376;

    public UserData_getFirstDataVersion_119064874346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term41380 = new Long(7247160664318067468L);
        term41376 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term41378 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term41394 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41395 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41399 = newInstance(Class.forName("java.time.LocalTime"));
        Object term41404 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41405 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41409 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term41376, term41376.getClass(), "id", -3791275881622301002L);
        setLongField(term41378, term41378.getClass(), "id", -3269743329730619135L);
        setField(term41378, term41378.getClass(), "extId", term41380);
        setField(term41378, term41378.getClass(), "luid", "OPJlqMJxdq");
        setIntField(term41395, term41395.getClass(), "year", 2025);
        setShortField(term41395, term41395.getClass(), "month", (short) 11);
        setShortField(term41395, term41395.getClass(), "day", (short) 16);
        setField(term41394, term41394.getClass(), "date", term41395);
        setByteField(term41399, term41399.getClass(), "hour", (byte) 12);
        setByteField(term41399, term41399.getClass(), "minute", (byte) 27);
        setByteField(term41399, term41399.getClass(), "second", (byte) 36);
        setIntField(term41399, term41399.getClass(), "nano", 699989217);
        setField(term41394, term41394.getClass(), "time", term41399);
        setField(term41378, term41378.getClass(), "registerTime", term41394);
        setIntField(term41405, term41405.getClass(), "year", 2018);
        setShortField(term41405, term41405.getClass(), "month", (short) 10);
        setShortField(term41405, term41405.getClass(), "day", (short) 3);
        setField(term41404, term41404.getClass(), "date", term41405);
        setByteField(term41409, term41409.getClass(), "hour", (byte) 12);
        setByteField(term41409, term41409.getClass(), "minute", (byte) 49);
        setByteField(term41409, term41409.getClass(), "second", (byte) 38);
        setIntField(term41409, term41409.getClass(), "nano", 549840711);
        setField(term41404, term41404.getClass(), "time", term41409);
        setField(term41378, term41378.getClass(), "accessTime", term41404);
        setField(term41376, term41376.getClass(), "card", term41378);
        setField(term41376, term41376.getClass(), "userName", "COhzwXcfds");
        setIntField(term41376, term41376.getClass(), "level", 348263044);
        setIntField(term41376, term41376.getClass(), "reincarnationNum", 1394815305);
        setLongField(term41376, term41376.getClass(), "exp", 7289941847234084104L);
        setLongField(term41376, term41376.getClass(), "point", 852818663192057236L);
        setLongField(term41376, term41376.getClass(), "totalPoint", -4175022778768613863L);
        setIntField(term41376, term41376.getClass(), "playCount", -315070279);
        setIntField(term41376, term41376.getClass(), "jewelCount", 62449386);
        setIntField(term41376, term41376.getClass(), "totalJewelCount", -1488558129);
        setIntField(term41376, term41376.getClass(), "medalCount", -929614389);
        setIntField(term41376, term41376.getClass(), "playerRating", 1585326879);
        setIntField(term41376, term41376.getClass(), "highestRating", 1161195592);
        setIntField(term41376, term41376.getClass(), "battlePoint", -1012640616);
        setIntField(term41376, term41376.getClass(), "bestBattlePoint", -552664740);
        setIntField(term41376, term41376.getClass(), "overDamageBattlePoint", -1639838200);
        setBooleanField(term41376, term41376.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term41376, term41376.getClass(), "nameplateId", -60462175);
        setIntField(term41376, term41376.getClass(), "trophyId", 1315997028);
        setIntField(term41376, term41376.getClass(), "cardId", 1268210239);
        setIntField(term41376, term41376.getClass(), "characterId", -697986260);
        setIntField(term41376, term41376.getClass(), "characterVoiceNo", -672315403);
        setIntField(term41376, term41376.getClass(), "tabSetting", 507507290);
        setIntField(term41376, term41376.getClass(), "tabSortSetting", 9057138);
        setIntField(term41376, term41376.getClass(), "cardCategorySetting", 2130019201);
        setIntField(term41376, term41376.getClass(), "cardSortSetting", 504634766);
        setIntField(term41376, term41376.getClass(), "rivalScoreCategorySetting", 1963462917);
        setIntField(term41376, term41376.getClass(), "playedTutorialBit", 552203554);
        setIntField(term41376, term41376.getClass(), "firstTutorialCancelNum", 1645215896);
        setLongField(term41376, term41376.getClass(), "sumTechHighScore", -4902671035184844892L);
        setLongField(term41376, term41376.getClass(), "sumTechBasicHighScore", -9006928175378855684L);
        setLongField(term41376, term41376.getClass(), "sumTechAdvancedHighScore", 4672743577102213082L);
        setLongField(term41376, term41376.getClass(), "sumTechExpertHighScore", -359180515829782685L);
        setLongField(term41376, term41376.getClass(), "sumTechMasterHighScore", 9051152709789005898L);
        setLongField(term41376, term41376.getClass(), "sumTechLunaticHighScore", 7523325429211619652L);
        setLongField(term41376, term41376.getClass(), "sumBattleHighScore", 2129332791275186868L);
        setLongField(term41376, term41376.getClass(), "sumBattleBasicHighScore", 5292512705125717689L);
        setLongField(term41376, term41376.getClass(), "sumBattleAdvancedHighScore", -4100892279770468602L);
        setLongField(term41376, term41376.getClass(), "sumBattleExpertHighScore", -459560970226052057L);
        setLongField(term41376, term41376.getClass(), "sumBattleMasterHighScore", 7829682507826908709L);
        setLongField(term41376, term41376.getClass(), "sumBattleLunaticHighScore", 2414820119632962722L);
        setField(term41376, term41376.getClass(), "eventWatchedDate", "anncJTnzrg");
        setField(term41376, term41376.getClass(), "cmEventWatchedDate", "GMylOocLnB");
        setField(term41376, term41376.getClass(), "firstGameId", "spOehuHwSl");
        setField(term41376, term41376.getClass(), "firstRomVersion", "cyobgydTWP");
        setField(term41376, term41376.getClass(), "firstDataVersion", "moHYQFfLnp");
        setField(term41376, term41376.getClass(), "firstPlayDate", "BrPqlvIbEQ");
        setField(term41376, term41376.getClass(), "lastGameId", "JDTrhGRsDT");
        setField(term41376, term41376.getClass(), "lastRomVersion", "vHxsVQImjS");
        setField(term41376, term41376.getClass(), "lastDataVersion", "jkVaRrZHQX");
        setField(term41376, term41376.getClass(), "compatibleCmVersion", "gSFFUuJipG");
        setField(term41376, term41376.getClass(), "lastPlayDate", "bQWfIFvxkQ");
        setIntField(term41376, term41376.getClass(), "lastPlaceId", -914100840);
        setField(term41376, term41376.getClass(), "lastPlaceName", "aDoBLXfFQI");
        setIntField(term41376, term41376.getClass(), "lastRegionId", 1806294616);
        setField(term41376, term41376.getClass(), "lastRegionName", "HTimNhSNVi");
        setIntField(term41376, term41376.getClass(), "lastAllNetId", 1766086753);
        setField(term41376, term41376.getClass(), "lastClientId", "IWJWbrHcqm");
        setIntField(term41376, term41376.getClass(), "lastUsedDeckId", -1211119545);
        setIntField(term41376, term41376.getClass(), "lastPlayMusicLevel", 1584121590);
        setIntField(term41376, term41376.getClass(), "lastEmoneyBrand", 1133839602);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFirstDataVersion", argTypes, term41376, args);
    }

};


