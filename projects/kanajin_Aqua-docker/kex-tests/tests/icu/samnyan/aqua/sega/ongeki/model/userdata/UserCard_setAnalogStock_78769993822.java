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

public class UserCard_setAnalogStock_78769993822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123520;
     Object term123865;

    public UserCard_setAnalogStock_78769993822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term123526 = new Long(8403492202041709902L);
        term123520 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term123522 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term123524 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term123540 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123541 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123545 = newInstance(Class.forName("java.time.LocalTime"));
        Object term123550 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term123551 = newInstance(Class.forName("java.time.LocalDate"));
        Object term123555 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term123520, term123520.getClass(), "id", -7178730042193345514L);
        setLongField(term123522, term123522.getClass(), "id", 1966338447677234785L);
        setLongField(term123524, term123524.getClass(), "id", -5183301625200604169L);
        setField(term123524, term123524.getClass(), "extId", term123526);
        setField(term123524, term123524.getClass(), "luid", "ZLdlevjZxO");
        setIntField(term123541, term123541.getClass(), "year", 2012);
        setShortField(term123541, term123541.getClass(), "month", (short) 5);
        setShortField(term123541, term123541.getClass(), "day", (short) 9);
        setField(term123540, term123540.getClass(), "date", term123541);
        setByteField(term123545, term123545.getClass(), "hour", (byte) 4);
        setByteField(term123545, term123545.getClass(), "minute", (byte) 24);
        setByteField(term123545, term123545.getClass(), "second", (byte) 51);
        setIntField(term123545, term123545.getClass(), "nano", 768693356);
        setField(term123540, term123540.getClass(), "time", term123545);
        setField(term123524, term123524.getClass(), "registerTime", term123540);
        setIntField(term123551, term123551.getClass(), "year", 2026);
        setShortField(term123551, term123551.getClass(), "month", (short) 3);
        setShortField(term123551, term123551.getClass(), "day", (short) 10);
        setField(term123550, term123550.getClass(), "date", term123551);
        setByteField(term123555, term123555.getClass(), "hour", (byte) 20);
        setByteField(term123555, term123555.getClass(), "minute", (byte) 16);
        setByteField(term123555, term123555.getClass(), "second", (byte) 6);
        setIntField(term123555, term123555.getClass(), "nano", 559277183);
        setField(term123550, term123550.getClass(), "time", term123555);
        setField(term123524, term123524.getClass(), "accessTime", term123550);
        setField(term123522, term123522.getClass(), "card", term123524);
        setField(term123522, term123522.getClass(), "userName", "xFTRWovmcb");
        setIntField(term123522, term123522.getClass(), "level", -161036428);
        setIntField(term123522, term123522.getClass(), "reincarnationNum", 1219123477);
        setLongField(term123522, term123522.getClass(), "exp", 372928803593383103L);
        setLongField(term123522, term123522.getClass(), "point", 8689934280338030812L);
        setLongField(term123522, term123522.getClass(), "totalPoint", 5848187819182842782L);
        setIntField(term123522, term123522.getClass(), "playCount", 11646624);
        setIntField(term123522, term123522.getClass(), "jewelCount", -330936660);
        setIntField(term123522, term123522.getClass(), "totalJewelCount", 2055839448);
        setIntField(term123522, term123522.getClass(), "medalCount", -384754498);
        setIntField(term123522, term123522.getClass(), "playerRating", 264487081);
        setIntField(term123522, term123522.getClass(), "highestRating", -834904279);
        setIntField(term123522, term123522.getClass(), "battlePoint", 1040056537);
        setIntField(term123522, term123522.getClass(), "bestBattlePoint", 2036195661);
        setIntField(term123522, term123522.getClass(), "overDamageBattlePoint", -1622316712);
        setBooleanField(term123522, term123522.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term123522, term123522.getClass(), "nameplateId", -1235123974);
        setIntField(term123522, term123522.getClass(), "trophyId", -898215180);
        setIntField(term123522, term123522.getClass(), "cardId", 537429234);
        setIntField(term123522, term123522.getClass(), "characterId", -2003655808);
        setIntField(term123522, term123522.getClass(), "characterVoiceNo", 483470724);
        setIntField(term123522, term123522.getClass(), "tabSetting", -2146772904);
        setIntField(term123522, term123522.getClass(), "tabSortSetting", -1010615015);
        setIntField(term123522, term123522.getClass(), "cardCategorySetting", 1876974431);
        setIntField(term123522, term123522.getClass(), "cardSortSetting", -910876771);
        setIntField(term123522, term123522.getClass(), "rivalScoreCategorySetting", 1838706925);
        setIntField(term123522, term123522.getClass(), "playedTutorialBit", -618691801);
        setIntField(term123522, term123522.getClass(), "firstTutorialCancelNum", -1470171320);
        setLongField(term123522, term123522.getClass(), "sumTechHighScore", -7228700862839101215L);
        setLongField(term123522, term123522.getClass(), "sumTechBasicHighScore", -8317886865882517132L);
        setLongField(term123522, term123522.getClass(), "sumTechAdvancedHighScore", 353917339772354433L);
        setLongField(term123522, term123522.getClass(), "sumTechExpertHighScore", 641902932376879631L);
        setLongField(term123522, term123522.getClass(), "sumTechMasterHighScore", -5077377635651041514L);
        setLongField(term123522, term123522.getClass(), "sumTechLunaticHighScore", -793364689450412616L);
        setLongField(term123522, term123522.getClass(), "sumBattleHighScore", -5839238070077460832L);
        setLongField(term123522, term123522.getClass(), "sumBattleBasicHighScore", -869129150372436331L);
        setLongField(term123522, term123522.getClass(), "sumBattleAdvancedHighScore", 5732037843206000580L);
        setLongField(term123522, term123522.getClass(), "sumBattleExpertHighScore", -1389669562728562609L);
        setLongField(term123522, term123522.getClass(), "sumBattleMasterHighScore", 2565710926143785240L);
        setLongField(term123522, term123522.getClass(), "sumBattleLunaticHighScore", -2442379737819976204L);
        setField(term123522, term123522.getClass(), "eventWatchedDate", "fDNpBZJcEK");
        setField(term123522, term123522.getClass(), "cmEventWatchedDate", "jURNSwGUrp");
        setField(term123522, term123522.getClass(), "firstGameId", "nIWnIRXTGB");
        setField(term123522, term123522.getClass(), "firstRomVersion", "cjGGcykErb");
        setField(term123522, term123522.getClass(), "firstDataVersion", "ahJJxxxyVu");
        setField(term123522, term123522.getClass(), "firstPlayDate", "IABlyhoUtz");
        setField(term123522, term123522.getClass(), "lastGameId", "QDgkRKDgSY");
        setField(term123522, term123522.getClass(), "lastRomVersion", "SptxbRhzuT");
        setField(term123522, term123522.getClass(), "lastDataVersion", "mIFDQhdALu");
        setField(term123522, term123522.getClass(), "compatibleCmVersion", "IfjNTGtdwY");
        setField(term123522, term123522.getClass(), "lastPlayDate", "ToupqTNDBq");
        setIntField(term123522, term123522.getClass(), "lastPlaceId", -995528354);
        setField(term123522, term123522.getClass(), "lastPlaceName", "yzFbLpPTrq");
        setIntField(term123522, term123522.getClass(), "lastRegionId", -2002926440);
        setField(term123522, term123522.getClass(), "lastRegionName", "iYRIEjEhxB");
        setIntField(term123522, term123522.getClass(), "lastAllNetId", -985098142);
        setField(term123522, term123522.getClass(), "lastClientId", "EyLarnQiro");
        setIntField(term123522, term123522.getClass(), "lastUsedDeckId", -889602431);
        setIntField(term123522, term123522.getClass(), "lastPlayMusicLevel", 233063229);
        setIntField(term123522, term123522.getClass(), "lastEmoneyBrand", -2119606595);
        setField(term123520, term123520.getClass(), "user", term123522);
        setIntField(term123520, term123520.getClass(), "cardId", -1);
        setIntField(term123520, term123520.getClass(), "digitalStock", 1);
        setIntField(term123520, term123520.getClass(), "analogStock", -11676368);
        setIntField(term123520, term123520.getClass(), "level", 1176193646);
        setIntField(term123520, term123520.getClass(), "maxLevel", 10);
        setIntField(term123520, term123520.getClass(), "exp", -1538768806);
        setIntField(term123520, term123520.getClass(), "printCount", -762348027);
        setIntField(term123520, term123520.getClass(), "useCount", 174471043);
        setBooleanField(term123520, term123520.getClass(), "isNew", true);
        setField(term123520, term123520.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term123520, term123520.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term123520, term123520.getClass(), "skillId", 90007022);
        setBooleanField(term123520, term123520.getClass(), "isAcquired", true);
        setField(term123520, term123520.getClass(), "created", "0000-00-00 00:00:00.0");
        term123865 = new Integer(-1775594472);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term123865;
        callMethod(klass, "setAnalogStock", argTypes, term123520, args);
    }

};


