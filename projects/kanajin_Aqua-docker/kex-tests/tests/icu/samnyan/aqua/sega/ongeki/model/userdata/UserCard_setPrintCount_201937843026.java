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
import java.lang.Integer;

public class UserCard_setPrintCount_201937843026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125800;
     Object term126145;

    public UserCard_setPrintCount_201937843026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term125806 = new Long(5315236285592892506L);
        term125800 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term125802 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term125804 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term125820 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125821 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125825 = newInstance(Class.forName("java.time.LocalTime"));
        Object term125830 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term125831 = newInstance(Class.forName("java.time.LocalDate"));
        Object term125835 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term125800, term125800.getClass(), "id", 431959231991869310L);
        setLongField(term125802, term125802.getClass(), "id", 7742578467573007524L);
        setLongField(term125804, term125804.getClass(), "id", 5490531178926231657L);
        setField(term125804, term125804.getClass(), "extId", term125806);
        setField(term125804, term125804.getClass(), "luid", "BATrPAXgpa");
        setIntField(term125821, term125821.getClass(), "year", 2010);
        setShortField(term125821, term125821.getClass(), "month", (short) 8);
        setShortField(term125821, term125821.getClass(), "day", (short) 29);
        setField(term125820, term125820.getClass(), "date", term125821);
        setByteField(term125825, term125825.getClass(), "hour", (byte) 14);
        setByteField(term125825, term125825.getClass(), "minute", (byte) 6);
        setByteField(term125825, term125825.getClass(), "second", (byte) 52);
        setIntField(term125825, term125825.getClass(), "nano", 882272618);
        setField(term125820, term125820.getClass(), "time", term125825);
        setField(term125804, term125804.getClass(), "registerTime", term125820);
        setIntField(term125831, term125831.getClass(), "year", 2011);
        setShortField(term125831, term125831.getClass(), "month", (short) 3);
        setShortField(term125831, term125831.getClass(), "day", (short) 21);
        setField(term125830, term125830.getClass(), "date", term125831);
        setByteField(term125835, term125835.getClass(), "hour", (byte) 10);
        setByteField(term125835, term125835.getClass(), "minute", (byte) 56);
        setByteField(term125835, term125835.getClass(), "second", (byte) 39);
        setIntField(term125835, term125835.getClass(), "nano", 54553750);
        setField(term125830, term125830.getClass(), "time", term125835);
        setField(term125804, term125804.getClass(), "accessTime", term125830);
        setField(term125802, term125802.getClass(), "card", term125804);
        setField(term125802, term125802.getClass(), "userName", "vgwMeHgaql");
        setIntField(term125802, term125802.getClass(), "level", 1248328125);
        setIntField(term125802, term125802.getClass(), "reincarnationNum", 395562077);
        setLongField(term125802, term125802.getClass(), "exp", 7349241518543084416L);
        setLongField(term125802, term125802.getClass(), "point", -7524558276915655834L);
        setLongField(term125802, term125802.getClass(), "totalPoint", -4953857987297910207L);
        setIntField(term125802, term125802.getClass(), "playCount", -294800497);
        setIntField(term125802, term125802.getClass(), "jewelCount", 979334169);
        setIntField(term125802, term125802.getClass(), "totalJewelCount", 840412156);
        setIntField(term125802, term125802.getClass(), "medalCount", 788624942);
        setIntField(term125802, term125802.getClass(), "playerRating", -1174113610);
        setIntField(term125802, term125802.getClass(), "highestRating", -438676054);
        setIntField(term125802, term125802.getClass(), "battlePoint", -1032395364);
        setIntField(term125802, term125802.getClass(), "bestBattlePoint", -552556865);
        setIntField(term125802, term125802.getClass(), "overDamageBattlePoint", -1908071026);
        setBooleanField(term125802, term125802.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term125802, term125802.getClass(), "nameplateId", 737590127);
        setIntField(term125802, term125802.getClass(), "trophyId", 1091000908);
        setIntField(term125802, term125802.getClass(), "cardId", 417959197);
        setIntField(term125802, term125802.getClass(), "characterId", 736672515);
        setIntField(term125802, term125802.getClass(), "characterVoiceNo", 1093266289);
        setIntField(term125802, term125802.getClass(), "tabSetting", -1407865478);
        setIntField(term125802, term125802.getClass(), "tabSortSetting", 1207025764);
        setIntField(term125802, term125802.getClass(), "cardCategorySetting", -220584965);
        setIntField(term125802, term125802.getClass(), "cardSortSetting", -1579060613);
        setIntField(term125802, term125802.getClass(), "rivalScoreCategorySetting", -975355295);
        setIntField(term125802, term125802.getClass(), "playedTutorialBit", 2023713138);
        setIntField(term125802, term125802.getClass(), "firstTutorialCancelNum", -1417229054);
        setLongField(term125802, term125802.getClass(), "sumTechHighScore", 4214319798732205922L);
        setLongField(term125802, term125802.getClass(), "sumTechBasicHighScore", -7308137124405752041L);
        setLongField(term125802, term125802.getClass(), "sumTechAdvancedHighScore", 5673723329802902713L);
        setLongField(term125802, term125802.getClass(), "sumTechExpertHighScore", 4232179660817954841L);
        setLongField(term125802, term125802.getClass(), "sumTechMasterHighScore", 2532454606869645239L);
        setLongField(term125802, term125802.getClass(), "sumTechLunaticHighScore", -505603752841149592L);
        setLongField(term125802, term125802.getClass(), "sumBattleHighScore", 7190386249953353562L);
        setLongField(term125802, term125802.getClass(), "sumBattleBasicHighScore", 8407673239374263700L);
        setLongField(term125802, term125802.getClass(), "sumBattleAdvancedHighScore", 3951335457851481181L);
        setLongField(term125802, term125802.getClass(), "sumBattleExpertHighScore", -3489557962375298499L);
        setLongField(term125802, term125802.getClass(), "sumBattleMasterHighScore", 2330815779321986161L);
        setLongField(term125802, term125802.getClass(), "sumBattleLunaticHighScore", 5435713560616813309L);
        setField(term125802, term125802.getClass(), "eventWatchedDate", "apRNMfAeJs");
        setField(term125802, term125802.getClass(), "cmEventWatchedDate", "xXjFLOrnwn");
        setField(term125802, term125802.getClass(), "firstGameId", "EwHXheApdJ");
        setField(term125802, term125802.getClass(), "firstRomVersion", "FSxGuVZthC");
        setField(term125802, term125802.getClass(), "firstDataVersion", "vZxqxBKdGD");
        setField(term125802, term125802.getClass(), "firstPlayDate", "ScVMeCBvvv");
        setField(term125802, term125802.getClass(), "lastGameId", "xysssjuOdh");
        setField(term125802, term125802.getClass(), "lastRomVersion", "LQWvIhnGeL");
        setField(term125802, term125802.getClass(), "lastDataVersion", "fSsmODkNFb");
        setField(term125802, term125802.getClass(), "compatibleCmVersion", "jXaYbKgogd");
        setField(term125802, term125802.getClass(), "lastPlayDate", "MxPRraPVdF");
        setIntField(term125802, term125802.getClass(), "lastPlaceId", 1916815084);
        setField(term125802, term125802.getClass(), "lastPlaceName", "dnWHLTYWVU");
        setIntField(term125802, term125802.getClass(), "lastRegionId", -1194686394);
        setField(term125802, term125802.getClass(), "lastRegionName", "AOSOeWGCwi");
        setIntField(term125802, term125802.getClass(), "lastAllNetId", 535352285);
        setField(term125802, term125802.getClass(), "lastClientId", "pBmevrFCmp");
        setIntField(term125802, term125802.getClass(), "lastUsedDeckId", -427127256);
        setIntField(term125802, term125802.getClass(), "lastPlayMusicLevel", -1844788019);
        setIntField(term125802, term125802.getClass(), "lastEmoneyBrand", 1373587197);
        setField(term125800, term125800.getClass(), "user", term125802);
        setIntField(term125800, term125800.getClass(), "cardId", -1);
        setIntField(term125800, term125800.getClass(), "digitalStock", 1);
        setIntField(term125800, term125800.getClass(), "analogStock", 375888422);
        setIntField(term125800, term125800.getClass(), "level", 1548760361);
        setIntField(term125800, term125800.getClass(), "maxLevel", 10);
        setIntField(term125800, term125800.getClass(), "exp", 558749477);
        setIntField(term125800, term125800.getClass(), "printCount", -1670336590);
        setIntField(term125800, term125800.getClass(), "useCount", 403038510);
        setBooleanField(term125800, term125800.getClass(), "isNew", true);
        setField(term125800, term125800.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term125800, term125800.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term125800, term125800.getClass(), "skillId", 1412304335);
        setBooleanField(term125800, term125800.getClass(), "isAcquired", true);
        setField(term125800, term125800.getClass(), "created", "0000-00-00 00:00:00.0");
        term126145 = new Integer(2118050444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term126145;
        callMethod(klass, "setPrintCount", argTypes, term125800, args);
    }

};


