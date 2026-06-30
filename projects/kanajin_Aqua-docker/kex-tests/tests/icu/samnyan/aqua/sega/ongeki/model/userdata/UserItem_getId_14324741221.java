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

public class UserItem_getId_14324741221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103011;

    public UserItem_getId_14324741221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term103017 = new Long(-1592696983130738594L);
        term103011 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem"));
        Object term103013 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term103015 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term103031 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103032 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103036 = newInstance(Class.forName("java.time.LocalTime"));
        Object term103041 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term103042 = newInstance(Class.forName("java.time.LocalDate"));
        Object term103046 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term103011, term103011.getClass(), "id", -8163957580883746071L);
        setLongField(term103013, term103013.getClass(), "id", -6949688986087480988L);
        setLongField(term103015, term103015.getClass(), "id", 6113513716640890192L);
        setField(term103015, term103015.getClass(), "extId", term103017);
        setField(term103015, term103015.getClass(), "luid", "wqMYxsvXwx");
        setIntField(term103032, term103032.getClass(), "year", 2015);
        setShortField(term103032, term103032.getClass(), "month", (short) 7);
        setShortField(term103032, term103032.getClass(), "day", (short) 16);
        setField(term103031, term103031.getClass(), "date", term103032);
        setByteField(term103036, term103036.getClass(), "hour", (byte) 15);
        setByteField(term103036, term103036.getClass(), "minute", (byte) 28);
        setByteField(term103036, term103036.getClass(), "second", (byte) 35);
        setIntField(term103036, term103036.getClass(), "nano", 374805749);
        setField(term103031, term103031.getClass(), "time", term103036);
        setField(term103015, term103015.getClass(), "registerTime", term103031);
        setIntField(term103042, term103042.getClass(), "year", 2021);
        setShortField(term103042, term103042.getClass(), "month", (short) 6);
        setShortField(term103042, term103042.getClass(), "day", (short) 19);
        setField(term103041, term103041.getClass(), "date", term103042);
        setByteField(term103046, term103046.getClass(), "hour", (byte) 17);
        setByteField(term103046, term103046.getClass(), "minute", (byte) 58);
        setByteField(term103046, term103046.getClass(), "second", (byte) 4);
        setIntField(term103046, term103046.getClass(), "nano", 753905173);
        setField(term103041, term103041.getClass(), "time", term103046);
        setField(term103015, term103015.getClass(), "accessTime", term103041);
        setField(term103013, term103013.getClass(), "card", term103015);
        setField(term103013, term103013.getClass(), "userName", "qUfONYtlAU");
        setIntField(term103013, term103013.getClass(), "level", 1514556613);
        setIntField(term103013, term103013.getClass(), "reincarnationNum", 678621067);
        setLongField(term103013, term103013.getClass(), "exp", 2616780148536850399L);
        setLongField(term103013, term103013.getClass(), "point", -930669719815118399L);
        setLongField(term103013, term103013.getClass(), "totalPoint", -459556958930554436L);
        setIntField(term103013, term103013.getClass(), "playCount", -133223081);
        setIntField(term103013, term103013.getClass(), "jewelCount", 1890767141);
        setIntField(term103013, term103013.getClass(), "totalJewelCount", -1943101906);
        setIntField(term103013, term103013.getClass(), "medalCount", 2055548921);
        setIntField(term103013, term103013.getClass(), "playerRating", -946368228);
        setIntField(term103013, term103013.getClass(), "highestRating", -1303810032);
        setIntField(term103013, term103013.getClass(), "battlePoint", -489320904);
        setIntField(term103013, term103013.getClass(), "bestBattlePoint", -1264556218);
        setIntField(term103013, term103013.getClass(), "overDamageBattlePoint", 989594530);
        setBooleanField(term103013, term103013.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term103013, term103013.getClass(), "nameplateId", -1044228796);
        setIntField(term103013, term103013.getClass(), "trophyId", -1143503114);
        setIntField(term103013, term103013.getClass(), "cardId", -1645386867);
        setIntField(term103013, term103013.getClass(), "characterId", -176403451);
        setIntField(term103013, term103013.getClass(), "characterVoiceNo", 546610816);
        setIntField(term103013, term103013.getClass(), "tabSetting", -100412540);
        setIntField(term103013, term103013.getClass(), "tabSortSetting", 1721386623);
        setIntField(term103013, term103013.getClass(), "cardCategorySetting", -1262959141);
        setIntField(term103013, term103013.getClass(), "cardSortSetting", -1778216800);
        setIntField(term103013, term103013.getClass(), "rivalScoreCategorySetting", 101409079);
        setIntField(term103013, term103013.getClass(), "playedTutorialBit", 667385993);
        setIntField(term103013, term103013.getClass(), "firstTutorialCancelNum", 1869326215);
        setLongField(term103013, term103013.getClass(), "sumTechHighScore", -4113760893823813984L);
        setLongField(term103013, term103013.getClass(), "sumTechBasicHighScore", 8557768502080217431L);
        setLongField(term103013, term103013.getClass(), "sumTechAdvancedHighScore", -7539710751720581143L);
        setLongField(term103013, term103013.getClass(), "sumTechExpertHighScore", -2461598468198829919L);
        setLongField(term103013, term103013.getClass(), "sumTechMasterHighScore", -7257139660876337988L);
        setLongField(term103013, term103013.getClass(), "sumTechLunaticHighScore", -6901803450497229752L);
        setLongField(term103013, term103013.getClass(), "sumBattleHighScore", 1760230848835014940L);
        setLongField(term103013, term103013.getClass(), "sumBattleBasicHighScore", 6314136474162855188L);
        setLongField(term103013, term103013.getClass(), "sumBattleAdvancedHighScore", 2947550046251980787L);
        setLongField(term103013, term103013.getClass(), "sumBattleExpertHighScore", 2187521172156334996L);
        setLongField(term103013, term103013.getClass(), "sumBattleMasterHighScore", 573728130321279321L);
        setLongField(term103013, term103013.getClass(), "sumBattleLunaticHighScore", -8226322725745391111L);
        setField(term103013, term103013.getClass(), "eventWatchedDate", "QMHmlsCFoq");
        setField(term103013, term103013.getClass(), "cmEventWatchedDate", "JlgbBmNibu");
        setField(term103013, term103013.getClass(), "firstGameId", "igRVOATJPd");
        setField(term103013, term103013.getClass(), "firstRomVersion", "DYaMGxxqDk");
        setField(term103013, term103013.getClass(), "firstDataVersion", "kTRmkTQpRx");
        setField(term103013, term103013.getClass(), "firstPlayDate", "NmXGFQkgMo");
        setField(term103013, term103013.getClass(), "lastGameId", "lBruaTAkIt");
        setField(term103013, term103013.getClass(), "lastRomVersion", "pIQQBEGLOF");
        setField(term103013, term103013.getClass(), "lastDataVersion", "DLYPXnIorY");
        setField(term103013, term103013.getClass(), "compatibleCmVersion", "MaEbckWDBJ");
        setField(term103013, term103013.getClass(), "lastPlayDate", "kxuScrxaGm");
        setIntField(term103013, term103013.getClass(), "lastPlaceId", 1721500010);
        setField(term103013, term103013.getClass(), "lastPlaceName", "ItamIWoOLr");
        setIntField(term103013, term103013.getClass(), "lastRegionId", 347987989);
        setField(term103013, term103013.getClass(), "lastRegionName", "YeemjiDgab");
        setIntField(term103013, term103013.getClass(), "lastAllNetId", 967236150);
        setField(term103013, term103013.getClass(), "lastClientId", "tihFwBkjdt");
        setIntField(term103013, term103013.getClass(), "lastUsedDeckId", 1128257999);
        setIntField(term103013, term103013.getClass(), "lastPlayMusicLevel", -1294526073);
        setIntField(term103013, term103013.getClass(), "lastEmoneyBrand", 1308295);
        setField(term103011, term103011.getClass(), "user", term103013);
        setIntField(term103011, term103011.getClass(), "itemKind", -1992871983);
        setIntField(term103011, term103011.getClass(), "itemId", -746244948);
        setIntField(term103011, term103011.getClass(), "stock", -1545293106);
        setBooleanField(term103011, term103011.getClass(), "isValid", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term103011, args);
    }

};


