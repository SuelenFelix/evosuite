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

public class UserCard_hashCode_116053503736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131558;

    public UserCard_hashCode_116053503736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term131564 = new Long(3423965054378869855L);
        term131558 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term131560 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term131562 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term131578 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131579 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131583 = newInstance(Class.forName("java.time.LocalTime"));
        Object term131588 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term131589 = newInstance(Class.forName("java.time.LocalDate"));
        Object term131593 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term131558, term131558.getClass(), "id", 529093208672644693L);
        setLongField(term131560, term131560.getClass(), "id", -2273969036758191240L);
        setLongField(term131562, term131562.getClass(), "id", 8467225225335859164L);
        setField(term131562, term131562.getClass(), "extId", term131564);
        setField(term131562, term131562.getClass(), "luid", "GdZWpscDov");
        setIntField(term131579, term131579.getClass(), "year", 2013);
        setShortField(term131579, term131579.getClass(), "month", (short) 1);
        setShortField(term131579, term131579.getClass(), "day", (short) 25);
        setField(term131578, term131578.getClass(), "date", term131579);
        setByteField(term131583, term131583.getClass(), "hour", (byte) 11);
        setByteField(term131583, term131583.getClass(), "minute", (byte) 5);
        setByteField(term131583, term131583.getClass(), "second", (byte) 35);
        setIntField(term131583, term131583.getClass(), "nano", 914812579);
        setField(term131578, term131578.getClass(), "time", term131583);
        setField(term131562, term131562.getClass(), "registerTime", term131578);
        setIntField(term131589, term131589.getClass(), "year", 2020);
        setShortField(term131589, term131589.getClass(), "month", (short) 11);
        setShortField(term131589, term131589.getClass(), "day", (short) 6);
        setField(term131588, term131588.getClass(), "date", term131589);
        setByteField(term131593, term131593.getClass(), "hour", (byte) 20);
        setByteField(term131593, term131593.getClass(), "minute", (byte) 26);
        setByteField(term131593, term131593.getClass(), "second", (byte) 26);
        setIntField(term131593, term131593.getClass(), "nano", 961202696);
        setField(term131588, term131588.getClass(), "time", term131593);
        setField(term131562, term131562.getClass(), "accessTime", term131588);
        setField(term131560, term131560.getClass(), "card", term131562);
        setField(term131560, term131560.getClass(), "userName", "RzzlJFJcij");
        setIntField(term131560, term131560.getClass(), "level", 1126163407);
        setIntField(term131560, term131560.getClass(), "reincarnationNum", -851263541);
        setLongField(term131560, term131560.getClass(), "exp", 9024458491641782107L);
        setLongField(term131560, term131560.getClass(), "point", -6117016617567898848L);
        setLongField(term131560, term131560.getClass(), "totalPoint", 4842247741615837059L);
        setIntField(term131560, term131560.getClass(), "playCount", 1001758052);
        setIntField(term131560, term131560.getClass(), "jewelCount", -1481470185);
        setIntField(term131560, term131560.getClass(), "totalJewelCount", -1112833662);
        setIntField(term131560, term131560.getClass(), "medalCount", -944322051);
        setIntField(term131560, term131560.getClass(), "playerRating", 986554477);
        setIntField(term131560, term131560.getClass(), "highestRating", 1420310686);
        setIntField(term131560, term131560.getClass(), "battlePoint", -1255448879);
        setIntField(term131560, term131560.getClass(), "bestBattlePoint", -332881327);
        setIntField(term131560, term131560.getClass(), "overDamageBattlePoint", -314472912);
        setBooleanField(term131560, term131560.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term131560, term131560.getClass(), "nameplateId", -2084560012);
        setIntField(term131560, term131560.getClass(), "trophyId", 910881174);
        setIntField(term131560, term131560.getClass(), "cardId", -1917095576);
        setIntField(term131560, term131560.getClass(), "characterId", 1449306932);
        setIntField(term131560, term131560.getClass(), "characterVoiceNo", 56212143);
        setIntField(term131560, term131560.getClass(), "tabSetting", 618002074);
        setIntField(term131560, term131560.getClass(), "tabSortSetting", -1239775423);
        setIntField(term131560, term131560.getClass(), "cardCategorySetting", -885203807);
        setIntField(term131560, term131560.getClass(), "cardSortSetting", -644989552);
        setIntField(term131560, term131560.getClass(), "rivalScoreCategorySetting", -806442678);
        setIntField(term131560, term131560.getClass(), "playedTutorialBit", 1753926364);
        setIntField(term131560, term131560.getClass(), "firstTutorialCancelNum", 1317026070);
        setLongField(term131560, term131560.getClass(), "sumTechHighScore", -2533772733372888013L);
        setLongField(term131560, term131560.getClass(), "sumTechBasicHighScore", -2417758228864199096L);
        setLongField(term131560, term131560.getClass(), "sumTechAdvancedHighScore", -5856331080463916998L);
        setLongField(term131560, term131560.getClass(), "sumTechExpertHighScore", 7407503809123627471L);
        setLongField(term131560, term131560.getClass(), "sumTechMasterHighScore", -8655373211914558860L);
        setLongField(term131560, term131560.getClass(), "sumTechLunaticHighScore", 6473536307520967343L);
        setLongField(term131560, term131560.getClass(), "sumBattleHighScore", 7016822698178522491L);
        setLongField(term131560, term131560.getClass(), "sumBattleBasicHighScore", 860722971234330838L);
        setLongField(term131560, term131560.getClass(), "sumBattleAdvancedHighScore", -2871767722678946614L);
        setLongField(term131560, term131560.getClass(), "sumBattleExpertHighScore", -3302823797103338835L);
        setLongField(term131560, term131560.getClass(), "sumBattleMasterHighScore", 8470440582565546623L);
        setLongField(term131560, term131560.getClass(), "sumBattleLunaticHighScore", 8037024271065074298L);
        setField(term131560, term131560.getClass(), "eventWatchedDate", "eADknKlQVd");
        setField(term131560, term131560.getClass(), "cmEventWatchedDate", "hfwLnDHizJ");
        setField(term131560, term131560.getClass(), "firstGameId", "eZGPUdohTF");
        setField(term131560, term131560.getClass(), "firstRomVersion", "NyINyLwoLC");
        setField(term131560, term131560.getClass(), "firstDataVersion", "VdHJiosxsv");
        setField(term131560, term131560.getClass(), "firstPlayDate", "wOuPdBQeOx");
        setField(term131560, term131560.getClass(), "lastGameId", "qKKlbLWTDU");
        setField(term131560, term131560.getClass(), "lastRomVersion", "vtiTWIgEVa");
        setField(term131560, term131560.getClass(), "lastDataVersion", "eLERRBMHza");
        setField(term131560, term131560.getClass(), "compatibleCmVersion", "nNDwdMSbzC");
        setField(term131560, term131560.getClass(), "lastPlayDate", "cIeVoTDYCV");
        setIntField(term131560, term131560.getClass(), "lastPlaceId", -1573654080);
        setField(term131560, term131560.getClass(), "lastPlaceName", "zHjWGfGucL");
        setIntField(term131560, term131560.getClass(), "lastRegionId", 658719402);
        setField(term131560, term131560.getClass(), "lastRegionName", "BrQDOXlSKX");
        setIntField(term131560, term131560.getClass(), "lastAllNetId", -89063392);
        setField(term131560, term131560.getClass(), "lastClientId", "rqZXFCcyZu");
        setIntField(term131560, term131560.getClass(), "lastUsedDeckId", -1511535943);
        setIntField(term131560, term131560.getClass(), "lastPlayMusicLevel", 1013691868);
        setIntField(term131560, term131560.getClass(), "lastEmoneyBrand", 1537733513);
        setField(term131558, term131558.getClass(), "user", term131560);
        setIntField(term131558, term131558.getClass(), "cardId", -1);
        setIntField(term131558, term131558.getClass(), "digitalStock", 1);
        setIntField(term131558, term131558.getClass(), "analogStock", -1931737090);
        setIntField(term131558, term131558.getClass(), "level", -1599656306);
        setIntField(term131558, term131558.getClass(), "maxLevel", 10);
        setIntField(term131558, term131558.getClass(), "exp", 1695987763);
        setIntField(term131558, term131558.getClass(), "printCount", -635843083);
        setIntField(term131558, term131558.getClass(), "useCount", 1458601685);
        setBooleanField(term131558, term131558.getClass(), "isNew", true);
        setField(term131558, term131558.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term131558, term131558.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term131558, term131558.getClass(), "skillId", 1144708364);
        setBooleanField(term131558, term131558.getClass(), "isAcquired", true);
        setField(term131558, term131558.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term131558, args);
    }

};


