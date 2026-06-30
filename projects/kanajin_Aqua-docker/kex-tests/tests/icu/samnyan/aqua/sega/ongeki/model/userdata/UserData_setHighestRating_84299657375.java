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

public class UserData_setHighestRating_84299657375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53733;
     Object term53996;

    public UserData_setHighestRating_84299657375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term53737 = new Long(3620247240684476031L);
        term53733 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term53735 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term53751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53756 = newInstance(Class.forName("java.time.LocalTime"));
        Object term53761 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term53762 = newInstance(Class.forName("java.time.LocalDate"));
        Object term53766 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term53733, term53733.getClass(), "id", -1836910095716864258L);
        setLongField(term53735, term53735.getClass(), "id", 6409577068638937956L);
        setField(term53735, term53735.getClass(), "extId", term53737);
        setField(term53735, term53735.getClass(), "luid", "RlIgxHiNOB");
        setIntField(term53752, term53752.getClass(), "year", 2025);
        setShortField(term53752, term53752.getClass(), "month", (short) 2);
        setShortField(term53752, term53752.getClass(), "day", (short) 23);
        setField(term53751, term53751.getClass(), "date", term53752);
        setByteField(term53756, term53756.getClass(), "hour", (byte) 16);
        setByteField(term53756, term53756.getClass(), "minute", (byte) 39);
        setByteField(term53756, term53756.getClass(), "second", (byte) 42);
        setIntField(term53756, term53756.getClass(), "nano", 342777686);
        setField(term53751, term53751.getClass(), "time", term53756);
        setField(term53735, term53735.getClass(), "registerTime", term53751);
        setIntField(term53762, term53762.getClass(), "year", 2029);
        setShortField(term53762, term53762.getClass(), "month", (short) 8);
        setShortField(term53762, term53762.getClass(), "day", (short) 14);
        setField(term53761, term53761.getClass(), "date", term53762);
        setByteField(term53766, term53766.getClass(), "hour", (byte) 10);
        setByteField(term53766, term53766.getClass(), "minute", (byte) 28);
        setByteField(term53766, term53766.getClass(), "second", (byte) 23);
        setIntField(term53766, term53766.getClass(), "nano", 676524979);
        setField(term53761, term53761.getClass(), "time", term53766);
        setField(term53735, term53735.getClass(), "accessTime", term53761);
        setField(term53733, term53733.getClass(), "card", term53735);
        setField(term53733, term53733.getClass(), "userName", "kSpBCSqyfl");
        setIntField(term53733, term53733.getClass(), "level", -2033199492);
        setIntField(term53733, term53733.getClass(), "reincarnationNum", 350096397);
        setLongField(term53733, term53733.getClass(), "exp", -1680886152207238363L);
        setLongField(term53733, term53733.getClass(), "point", 1147867669908260197L);
        setLongField(term53733, term53733.getClass(), "totalPoint", -4547752041588255808L);
        setIntField(term53733, term53733.getClass(), "playCount", -325295536);
        setIntField(term53733, term53733.getClass(), "jewelCount", -411068820);
        setIntField(term53733, term53733.getClass(), "totalJewelCount", -608484309);
        setIntField(term53733, term53733.getClass(), "medalCount", -396456847);
        setIntField(term53733, term53733.getClass(), "playerRating", 1826615515);
        setIntField(term53733, term53733.getClass(), "highestRating", 1129458600);
        setIntField(term53733, term53733.getClass(), "battlePoint", -1559804880);
        setIntField(term53733, term53733.getClass(), "bestBattlePoint", 420300457);
        setIntField(term53733, term53733.getClass(), "overDamageBattlePoint", 804843661);
        setBooleanField(term53733, term53733.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term53733, term53733.getClass(), "nameplateId", 1968236726);
        setIntField(term53733, term53733.getClass(), "trophyId", -1080686915);
        setIntField(term53733, term53733.getClass(), "cardId", -1329496162);
        setIntField(term53733, term53733.getClass(), "characterId", -1181178091);
        setIntField(term53733, term53733.getClass(), "characterVoiceNo", 797166053);
        setIntField(term53733, term53733.getClass(), "tabSetting", -1145342603);
        setIntField(term53733, term53733.getClass(), "tabSortSetting", -1135326582);
        setIntField(term53733, term53733.getClass(), "cardCategorySetting", 594267051);
        setIntField(term53733, term53733.getClass(), "cardSortSetting", -1225303838);
        setIntField(term53733, term53733.getClass(), "rivalScoreCategorySetting", 1093956146);
        setIntField(term53733, term53733.getClass(), "playedTutorialBit", 1459247713);
        setIntField(term53733, term53733.getClass(), "firstTutorialCancelNum", 1400302967);
        setLongField(term53733, term53733.getClass(), "sumTechHighScore", -3197677601690573647L);
        setLongField(term53733, term53733.getClass(), "sumTechBasicHighScore", 6425336229882388159L);
        setLongField(term53733, term53733.getClass(), "sumTechAdvancedHighScore", -616423180949048118L);
        setLongField(term53733, term53733.getClass(), "sumTechExpertHighScore", -8090281978105887179L);
        setLongField(term53733, term53733.getClass(), "sumTechMasterHighScore", -5381866975637720642L);
        setLongField(term53733, term53733.getClass(), "sumTechLunaticHighScore", -3951751659567091652L);
        setLongField(term53733, term53733.getClass(), "sumBattleHighScore", 3805208480992130216L);
        setLongField(term53733, term53733.getClass(), "sumBattleBasicHighScore", 3075555699272634645L);
        setLongField(term53733, term53733.getClass(), "sumBattleAdvancedHighScore", -7014938412778189699L);
        setLongField(term53733, term53733.getClass(), "sumBattleExpertHighScore", -5238153807729345644L);
        setLongField(term53733, term53733.getClass(), "sumBattleMasterHighScore", -2355117979885740284L);
        setLongField(term53733, term53733.getClass(), "sumBattleLunaticHighScore", -7496552559644191814L);
        setField(term53733, term53733.getClass(), "eventWatchedDate", "OUrtbTvuiW");
        setField(term53733, term53733.getClass(), "cmEventWatchedDate", "UnkpYLSsCR");
        setField(term53733, term53733.getClass(), "firstGameId", "AaxnITALtd");
        setField(term53733, term53733.getClass(), "firstRomVersion", "RdnRRpWglh");
        setField(term53733, term53733.getClass(), "firstDataVersion", "YcXTXuOFYV");
        setField(term53733, term53733.getClass(), "firstPlayDate", "HGhIlMCaKM");
        setField(term53733, term53733.getClass(), "lastGameId", "pPxivEPfHY");
        setField(term53733, term53733.getClass(), "lastRomVersion", "BiitfiJmRW");
        setField(term53733, term53733.getClass(), "lastDataVersion", "ILHarzuGbn");
        setField(term53733, term53733.getClass(), "compatibleCmVersion", "uNGHHAwCFL");
        setField(term53733, term53733.getClass(), "lastPlayDate", "fbshyuUfqy");
        setIntField(term53733, term53733.getClass(), "lastPlaceId", 692198729);
        setField(term53733, term53733.getClass(), "lastPlaceName", "eupNcihLEw");
        setIntField(term53733, term53733.getClass(), "lastRegionId", -1232290301);
        setField(term53733, term53733.getClass(), "lastRegionName", "iFFcolxwcm");
        setIntField(term53733, term53733.getClass(), "lastAllNetId", -1411058034);
        setField(term53733, term53733.getClass(), "lastClientId", "bAsZBSqnyM");
        setIntField(term53733, term53733.getClass(), "lastUsedDeckId", -144155597);
        setIntField(term53733, term53733.getClass(), "lastPlayMusicLevel", -996670851);
        setIntField(term53733, term53733.getClass(), "lastEmoneyBrand", 340642931);
        term53996 = new Integer(-2018441502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term53996;
        callMethod(klass, "setHighestRating", argTypes, term53733, args);
    }

};


