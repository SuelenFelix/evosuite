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

public class UserCard_setId_62516873118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120819;
     Object term121164;

    public UserCard_setId_62516873118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term120825 = new Long(8708846223293804408L);
        term120819 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term120821 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term120823 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term120839 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120840 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120844 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120849 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120850 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120854 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term120819, term120819.getClass(), "id", -1824018949914106101L);
        setLongField(term120821, term120821.getClass(), "id", -8481652492431239971L);
        setLongField(term120823, term120823.getClass(), "id", 3802850938772527111L);
        setField(term120823, term120823.getClass(), "extId", term120825);
        setField(term120823, term120823.getClass(), "luid", "dyPJplpZGY");
        setIntField(term120840, term120840.getClass(), "year", 2015);
        setShortField(term120840, term120840.getClass(), "month", (short) 10);
        setShortField(term120840, term120840.getClass(), "day", (short) 4);
        setField(term120839, term120839.getClass(), "date", term120840);
        setByteField(term120844, term120844.getClass(), "hour", (byte) 4);
        setByteField(term120844, term120844.getClass(), "minute", (byte) 28);
        setByteField(term120844, term120844.getClass(), "second", (byte) 5);
        setIntField(term120844, term120844.getClass(), "nano", 457950228);
        setField(term120839, term120839.getClass(), "time", term120844);
        setField(term120823, term120823.getClass(), "registerTime", term120839);
        setIntField(term120850, term120850.getClass(), "year", 2017);
        setShortField(term120850, term120850.getClass(), "month", (short) 2);
        setShortField(term120850, term120850.getClass(), "day", (short) 8);
        setField(term120849, term120849.getClass(), "date", term120850);
        setByteField(term120854, term120854.getClass(), "hour", (byte) 12);
        setByteField(term120854, term120854.getClass(), "minute", (byte) 5);
        setByteField(term120854, term120854.getClass(), "second", (byte) 46);
        setIntField(term120854, term120854.getClass(), "nano", 847487783);
        setField(term120849, term120849.getClass(), "time", term120854);
        setField(term120823, term120823.getClass(), "accessTime", term120849);
        setField(term120821, term120821.getClass(), "card", term120823);
        setField(term120821, term120821.getClass(), "userName", "FidoqFOZww");
        setIntField(term120821, term120821.getClass(), "level", -1444419310);
        setIntField(term120821, term120821.getClass(), "reincarnationNum", 1149220041);
        setLongField(term120821, term120821.getClass(), "exp", 6738059813256349238L);
        setLongField(term120821, term120821.getClass(), "point", -278816731242466343L);
        setLongField(term120821, term120821.getClass(), "totalPoint", -8659357574528547713L);
        setIntField(term120821, term120821.getClass(), "playCount", 934382905);
        setIntField(term120821, term120821.getClass(), "jewelCount", -464797117);
        setIntField(term120821, term120821.getClass(), "totalJewelCount", -1417713070);
        setIntField(term120821, term120821.getClass(), "medalCount", 545747490);
        setIntField(term120821, term120821.getClass(), "playerRating", -922198860);
        setIntField(term120821, term120821.getClass(), "highestRating", 369166807);
        setIntField(term120821, term120821.getClass(), "battlePoint", 568150061);
        setIntField(term120821, term120821.getClass(), "bestBattlePoint", -1014042063);
        setIntField(term120821, term120821.getClass(), "overDamageBattlePoint", -1581094320);
        setBooleanField(term120821, term120821.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term120821, term120821.getClass(), "nameplateId", 861218402);
        setIntField(term120821, term120821.getClass(), "trophyId", 2041897178);
        setIntField(term120821, term120821.getClass(), "cardId", -766372661);
        setIntField(term120821, term120821.getClass(), "characterId", 729482578);
        setIntField(term120821, term120821.getClass(), "characterVoiceNo", -368397845);
        setIntField(term120821, term120821.getClass(), "tabSetting", -279315948);
        setIntField(term120821, term120821.getClass(), "tabSortSetting", -195577818);
        setIntField(term120821, term120821.getClass(), "cardCategorySetting", 1457197657);
        setIntField(term120821, term120821.getClass(), "cardSortSetting", 1961784130);
        setIntField(term120821, term120821.getClass(), "rivalScoreCategorySetting", -1669337588);
        setIntField(term120821, term120821.getClass(), "playedTutorialBit", 2041255104);
        setIntField(term120821, term120821.getClass(), "firstTutorialCancelNum", 574882663);
        setLongField(term120821, term120821.getClass(), "sumTechHighScore", 9014585525331582548L);
        setLongField(term120821, term120821.getClass(), "sumTechBasicHighScore", -8738722461167485740L);
        setLongField(term120821, term120821.getClass(), "sumTechAdvancedHighScore", 6778039702742785844L);
        setLongField(term120821, term120821.getClass(), "sumTechExpertHighScore", 1384579917116205329L);
        setLongField(term120821, term120821.getClass(), "sumTechMasterHighScore", 999891730378035296L);
        setLongField(term120821, term120821.getClass(), "sumTechLunaticHighScore", 393462815993868728L);
        setLongField(term120821, term120821.getClass(), "sumBattleHighScore", 897612082862894190L);
        setLongField(term120821, term120821.getClass(), "sumBattleBasicHighScore", 2623942808725113368L);
        setLongField(term120821, term120821.getClass(), "sumBattleAdvancedHighScore", 4912276009450668396L);
        setLongField(term120821, term120821.getClass(), "sumBattleExpertHighScore", 397379342822222506L);
        setLongField(term120821, term120821.getClass(), "sumBattleMasterHighScore", 7156931544541547485L);
        setLongField(term120821, term120821.getClass(), "sumBattleLunaticHighScore", 7824834056315358653L);
        setField(term120821, term120821.getClass(), "eventWatchedDate", "VthnTywRxB");
        setField(term120821, term120821.getClass(), "cmEventWatchedDate", "yHLHaopFRB");
        setField(term120821, term120821.getClass(), "firstGameId", "dYnLcyZTKV");
        setField(term120821, term120821.getClass(), "firstRomVersion", "EuhpauGeVe");
        setField(term120821, term120821.getClass(), "firstDataVersion", "kgFJtzMrPn");
        setField(term120821, term120821.getClass(), "firstPlayDate", "NIkocNvjmy");
        setField(term120821, term120821.getClass(), "lastGameId", "slAGCmeSHy");
        setField(term120821, term120821.getClass(), "lastRomVersion", "DRgskGEoHQ");
        setField(term120821, term120821.getClass(), "lastDataVersion", "EnWOFmweOs");
        setField(term120821, term120821.getClass(), "compatibleCmVersion", "kBoIUinjBw");
        setField(term120821, term120821.getClass(), "lastPlayDate", "DrCWSqTYSn");
        setIntField(term120821, term120821.getClass(), "lastPlaceId", -1745553783);
        setField(term120821, term120821.getClass(), "lastPlaceName", "porFPgKTrM");
        setIntField(term120821, term120821.getClass(), "lastRegionId", 2039100321);
        setField(term120821, term120821.getClass(), "lastRegionName", "PvoRpvEjZQ");
        setIntField(term120821, term120821.getClass(), "lastAllNetId", -327912576);
        setField(term120821, term120821.getClass(), "lastClientId", "usnNnhdlFi");
        setIntField(term120821, term120821.getClass(), "lastUsedDeckId", -324420288);
        setIntField(term120821, term120821.getClass(), "lastPlayMusicLevel", -327505418);
        setIntField(term120821, term120821.getClass(), "lastEmoneyBrand", -345983538);
        setField(term120819, term120819.getClass(), "user", term120821);
        setIntField(term120819, term120819.getClass(), "cardId", -1);
        setIntField(term120819, term120819.getClass(), "digitalStock", 1);
        setIntField(term120819, term120819.getClass(), "analogStock", 1910809114);
        setIntField(term120819, term120819.getClass(), "level", 1217723895);
        setIntField(term120819, term120819.getClass(), "maxLevel", 10);
        setIntField(term120819, term120819.getClass(), "exp", -907902250);
        setIntField(term120819, term120819.getClass(), "printCount", -286413213);
        setIntField(term120819, term120819.getClass(), "useCount", 389597623);
        setBooleanField(term120819, term120819.getClass(), "isNew", true);
        setField(term120819, term120819.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term120819, term120819.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term120819, term120819.getClass(), "skillId", 1355618501);
        setBooleanField(term120819, term120819.getClass(), "isAcquired", true);
        setField(term120819, term120819.getClass(), "created", "0000-00-00 00:00:00.0");
        term121164 = new Long(1831087939813293570L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term121164;
        callMethod(klass, "setId", argTypes, term120819, args);
    }

};


