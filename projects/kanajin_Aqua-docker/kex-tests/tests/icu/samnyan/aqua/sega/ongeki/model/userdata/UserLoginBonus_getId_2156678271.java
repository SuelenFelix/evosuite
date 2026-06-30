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

public class UserLoginBonus_getId_2156678271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301232;

    public UserLoginBonus_getId_2156678271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term301238 = new Long(-4029227951294167228L);
        term301232 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus"));
        Object term301234 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term301236 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term301252 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term301253 = newInstance(Class.forName("java.time.LocalDate"));
        Object term301257 = newInstance(Class.forName("java.time.LocalTime"));
        Object term301262 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term301263 = newInstance(Class.forName("java.time.LocalDate"));
        Object term301267 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term301232, term301232.getClass(), "id", 7435382039497076144L);
        setLongField(term301234, term301234.getClass(), "id", -3803015245821255746L);
        setLongField(term301236, term301236.getClass(), "id", -4805266612758703832L);
        setField(term301236, term301236.getClass(), "extId", term301238);
        setField(term301236, term301236.getClass(), "luid", "gUxWMTfcxo");
        setIntField(term301253, term301253.getClass(), "year", 2025);
        setShortField(term301253, term301253.getClass(), "month", (short) 10);
        setShortField(term301253, term301253.getClass(), "day", (short) 31);
        setField(term301252, term301252.getClass(), "date", term301253);
        setByteField(term301257, term301257.getClass(), "hour", (byte) 4);
        setByteField(term301257, term301257.getClass(), "minute", (byte) 25);
        setByteField(term301257, term301257.getClass(), "second", (byte) 54);
        setIntField(term301257, term301257.getClass(), "nano", 91940440);
        setField(term301252, term301252.getClass(), "time", term301257);
        setField(term301236, term301236.getClass(), "registerTime", term301252);
        setIntField(term301263, term301263.getClass(), "year", 2024);
        setShortField(term301263, term301263.getClass(), "month", (short) 11);
        setShortField(term301263, term301263.getClass(), "day", (short) 3);
        setField(term301262, term301262.getClass(), "date", term301263);
        setByteField(term301267, term301267.getClass(), "hour", (byte) 11);
        setByteField(term301267, term301267.getClass(), "minute", (byte) 49);
        setByteField(term301267, term301267.getClass(), "second", (byte) 52);
        setIntField(term301267, term301267.getClass(), "nano", 784744896);
        setField(term301262, term301262.getClass(), "time", term301267);
        setField(term301236, term301236.getClass(), "accessTime", term301262);
        setField(term301234, term301234.getClass(), "card", term301236);
        setField(term301234, term301234.getClass(), "userName", "JJbWybZFwv");
        setIntField(term301234, term301234.getClass(), "level", -476264306);
        setIntField(term301234, term301234.getClass(), "reincarnationNum", 1205905378);
        setLongField(term301234, term301234.getClass(), "exp", -2460448350692163243L);
        setLongField(term301234, term301234.getClass(), "point", 6456870862769120808L);
        setLongField(term301234, term301234.getClass(), "totalPoint", -2388994362201071609L);
        setIntField(term301234, term301234.getClass(), "playCount", 612842147);
        setIntField(term301234, term301234.getClass(), "jewelCount", -206245330);
        setIntField(term301234, term301234.getClass(), "totalJewelCount", -66386110);
        setIntField(term301234, term301234.getClass(), "medalCount", 1046745876);
        setIntField(term301234, term301234.getClass(), "playerRating", 1232342064);
        setIntField(term301234, term301234.getClass(), "highestRating", 802799657);
        setIntField(term301234, term301234.getClass(), "battlePoint", 1517810658);
        setIntField(term301234, term301234.getClass(), "bestBattlePoint", 1741316866);
        setIntField(term301234, term301234.getClass(), "overDamageBattlePoint", -1808168018);
        setBooleanField(term301234, term301234.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term301234, term301234.getClass(), "nameplateId", 1733288542);
        setIntField(term301234, term301234.getClass(), "trophyId", 702641803);
        setIntField(term301234, term301234.getClass(), "cardId", 29327563);
        setIntField(term301234, term301234.getClass(), "characterId", -59340963);
        setIntField(term301234, term301234.getClass(), "characterVoiceNo", -1264533286);
        setIntField(term301234, term301234.getClass(), "tabSetting", -222419367);
        setIntField(term301234, term301234.getClass(), "tabSortSetting", 1330057772);
        setIntField(term301234, term301234.getClass(), "cardCategorySetting", 1412929302);
        setIntField(term301234, term301234.getClass(), "cardSortSetting", -1276629034);
        setIntField(term301234, term301234.getClass(), "rivalScoreCategorySetting", 759451950);
        setIntField(term301234, term301234.getClass(), "playedTutorialBit", -760946704);
        setIntField(term301234, term301234.getClass(), "firstTutorialCancelNum", -957942862);
        setLongField(term301234, term301234.getClass(), "sumTechHighScore", -2610841491099113563L);
        setLongField(term301234, term301234.getClass(), "sumTechBasicHighScore", -216200540995242504L);
        setLongField(term301234, term301234.getClass(), "sumTechAdvancedHighScore", -7916059522473975562L);
        setLongField(term301234, term301234.getClass(), "sumTechExpertHighScore", 6880312646915542041L);
        setLongField(term301234, term301234.getClass(), "sumTechMasterHighScore", 286445412939803063L);
        setLongField(term301234, term301234.getClass(), "sumTechLunaticHighScore", -5109144262993251668L);
        setLongField(term301234, term301234.getClass(), "sumBattleHighScore", 1409866739321666544L);
        setLongField(term301234, term301234.getClass(), "sumBattleBasicHighScore", -7736933988081025529L);
        setLongField(term301234, term301234.getClass(), "sumBattleAdvancedHighScore", -221241920183580555L);
        setLongField(term301234, term301234.getClass(), "sumBattleExpertHighScore", -5554169674632787049L);
        setLongField(term301234, term301234.getClass(), "sumBattleMasterHighScore", 556020797730336143L);
        setLongField(term301234, term301234.getClass(), "sumBattleLunaticHighScore", -3837819015914679513L);
        setField(term301234, term301234.getClass(), "eventWatchedDate", "OFVygCZPpR");
        setField(term301234, term301234.getClass(), "cmEventWatchedDate", "ERTUvcHbLH");
        setField(term301234, term301234.getClass(), "firstGameId", "jKiphxsuJM");
        setField(term301234, term301234.getClass(), "firstRomVersion", "uujNxYFnZF");
        setField(term301234, term301234.getClass(), "firstDataVersion", "MXcfAuvVvj");
        setField(term301234, term301234.getClass(), "firstPlayDate", "IlgJTdCcvV");
        setField(term301234, term301234.getClass(), "lastGameId", "IEcNveAzGf");
        setField(term301234, term301234.getClass(), "lastRomVersion", "rAOwMnTIRo");
        setField(term301234, term301234.getClass(), "lastDataVersion", "wiCOTHLgkY");
        setField(term301234, term301234.getClass(), "compatibleCmVersion", "xXIZkppQGj");
        setField(term301234, term301234.getClass(), "lastPlayDate", "htqYpwgttl");
        setIntField(term301234, term301234.getClass(), "lastPlaceId", 1386675533);
        setField(term301234, term301234.getClass(), "lastPlaceName", "mtxJReaVzv");
        setIntField(term301234, term301234.getClass(), "lastRegionId", -978109517);
        setField(term301234, term301234.getClass(), "lastRegionName", "zsUxsLbtqp");
        setIntField(term301234, term301234.getClass(), "lastAllNetId", -339693657);
        setField(term301234, term301234.getClass(), "lastClientId", "Dflpnxyaws");
        setIntField(term301234, term301234.getClass(), "lastUsedDeckId", -916987732);
        setIntField(term301234, term301234.getClass(), "lastPlayMusicLevel", -524794930);
        setIntField(term301234, term301234.getClass(), "lastEmoneyBrand", -257827428);
        setField(term301232, term301232.getClass(), "user", term301234);
        setIntField(term301232, term301232.getClass(), "bonusId", -2122218347);
        setIntField(term301232, term301232.getClass(), "bonusCount", -1427338236);
        setField(term301232, term301232.getClass(), "lastUpdateDate", "sBVtXchAVo");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term301232, args);
    }

};


