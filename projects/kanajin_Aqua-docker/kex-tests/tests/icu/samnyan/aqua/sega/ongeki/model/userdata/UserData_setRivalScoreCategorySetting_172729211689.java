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

public class UserData_setRivalScoreCategorySetting_172729211689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59683;
     Object term59946;

    public UserData_setRivalScoreCategorySetting_172729211689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term59687 = new Long(4513004407927379358L);
        term59683 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term59685 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term59701 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59702 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59706 = newInstance(Class.forName("java.time.LocalTime"));
        Object term59711 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term59712 = newInstance(Class.forName("java.time.LocalDate"));
        Object term59716 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term59683, term59683.getClass(), "id", -6775652378184115310L);
        setLongField(term59685, term59685.getClass(), "id", -535777060253904232L);
        setField(term59685, term59685.getClass(), "extId", term59687);
        setField(term59685, term59685.getClass(), "luid", "UDZJbJPmCC");
        setIntField(term59702, term59702.getClass(), "year", 2015);
        setShortField(term59702, term59702.getClass(), "month", (short) 1);
        setShortField(term59702, term59702.getClass(), "day", (short) 7);
        setField(term59701, term59701.getClass(), "date", term59702);
        setByteField(term59706, term59706.getClass(), "hour", (byte) 10);
        setByteField(term59706, term59706.getClass(), "minute", (byte) 8);
        setByteField(term59706, term59706.getClass(), "second", (byte) 31);
        setIntField(term59706, term59706.getClass(), "nano", 617142943);
        setField(term59701, term59701.getClass(), "time", term59706);
        setField(term59685, term59685.getClass(), "registerTime", term59701);
        setIntField(term59712, term59712.getClass(), "year", 2024);
        setShortField(term59712, term59712.getClass(), "month", (short) 2);
        setShortField(term59712, term59712.getClass(), "day", (short) 2);
        setField(term59711, term59711.getClass(), "date", term59712);
        setByteField(term59716, term59716.getClass(), "hour", (byte) 5);
        setByteField(term59716, term59716.getClass(), "minute", (byte) 8);
        setByteField(term59716, term59716.getClass(), "second", (byte) 10);
        setIntField(term59716, term59716.getClass(), "nano", 897554578);
        setField(term59711, term59711.getClass(), "time", term59716);
        setField(term59685, term59685.getClass(), "accessTime", term59711);
        setField(term59683, term59683.getClass(), "card", term59685);
        setField(term59683, term59683.getClass(), "userName", "oVkgUUfHis");
        setIntField(term59683, term59683.getClass(), "level", -659361866);
        setIntField(term59683, term59683.getClass(), "reincarnationNum", -2010825883);
        setLongField(term59683, term59683.getClass(), "exp", 4972929179004921399L);
        setLongField(term59683, term59683.getClass(), "point", -5802883249742613414L);
        setLongField(term59683, term59683.getClass(), "totalPoint", 4726334691946813488L);
        setIntField(term59683, term59683.getClass(), "playCount", 1230224947);
        setIntField(term59683, term59683.getClass(), "jewelCount", 739759836);
        setIntField(term59683, term59683.getClass(), "totalJewelCount", -1233408249);
        setIntField(term59683, term59683.getClass(), "medalCount", 1252145496);
        setIntField(term59683, term59683.getClass(), "playerRating", -469940082);
        setIntField(term59683, term59683.getClass(), "highestRating", -821294367);
        setIntField(term59683, term59683.getClass(), "battlePoint", -1260916319);
        setIntField(term59683, term59683.getClass(), "bestBattlePoint", 740454987);
        setIntField(term59683, term59683.getClass(), "overDamageBattlePoint", -2100331324);
        setBooleanField(term59683, term59683.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term59683, term59683.getClass(), "nameplateId", 2062095733);
        setIntField(term59683, term59683.getClass(), "trophyId", -7331803);
        setIntField(term59683, term59683.getClass(), "cardId", 1725012686);
        setIntField(term59683, term59683.getClass(), "characterId", -309653587);
        setIntField(term59683, term59683.getClass(), "characterVoiceNo", 1988824012);
        setIntField(term59683, term59683.getClass(), "tabSetting", 365061041);
        setIntField(term59683, term59683.getClass(), "tabSortSetting", 205907008);
        setIntField(term59683, term59683.getClass(), "cardCategorySetting", -1281782269);
        setIntField(term59683, term59683.getClass(), "cardSortSetting", -1728872282);
        setIntField(term59683, term59683.getClass(), "rivalScoreCategorySetting", -537646987);
        setIntField(term59683, term59683.getClass(), "playedTutorialBit", -558527010);
        setIntField(term59683, term59683.getClass(), "firstTutorialCancelNum", -271207664);
        setLongField(term59683, term59683.getClass(), "sumTechHighScore", 7039937488188266115L);
        setLongField(term59683, term59683.getClass(), "sumTechBasicHighScore", 5633164298056555566L);
        setLongField(term59683, term59683.getClass(), "sumTechAdvancedHighScore", 2267983741813300411L);
        setLongField(term59683, term59683.getClass(), "sumTechExpertHighScore", 3267279074161136958L);
        setLongField(term59683, term59683.getClass(), "sumTechMasterHighScore", -6468321967097989167L);
        setLongField(term59683, term59683.getClass(), "sumTechLunaticHighScore", 6323359401571442289L);
        setLongField(term59683, term59683.getClass(), "sumBattleHighScore", 7638813071144658944L);
        setLongField(term59683, term59683.getClass(), "sumBattleBasicHighScore", -343909632322232131L);
        setLongField(term59683, term59683.getClass(), "sumBattleAdvancedHighScore", 497796069271117684L);
        setLongField(term59683, term59683.getClass(), "sumBattleExpertHighScore", 2708256063920153381L);
        setLongField(term59683, term59683.getClass(), "sumBattleMasterHighScore", -4680821240344884981L);
        setLongField(term59683, term59683.getClass(), "sumBattleLunaticHighScore", -8385708193105823464L);
        setField(term59683, term59683.getClass(), "eventWatchedDate", "hoCKQzIOhx");
        setField(term59683, term59683.getClass(), "cmEventWatchedDate", "znUxTdEvUD");
        setField(term59683, term59683.getClass(), "firstGameId", "PvtJhtGffh");
        setField(term59683, term59683.getClass(), "firstRomVersion", "KReGJTSQuY");
        setField(term59683, term59683.getClass(), "firstDataVersion", "hqZmoXoMuS");
        setField(term59683, term59683.getClass(), "firstPlayDate", "PUPJWadLXP");
        setField(term59683, term59683.getClass(), "lastGameId", "TBNsemBBKA");
        setField(term59683, term59683.getClass(), "lastRomVersion", "DpNDxwXKkX");
        setField(term59683, term59683.getClass(), "lastDataVersion", "uxoFwkPfXf");
        setField(term59683, term59683.getClass(), "compatibleCmVersion", "OoVnZTvxUt");
        setField(term59683, term59683.getClass(), "lastPlayDate", "MnqnyndkhF");
        setIntField(term59683, term59683.getClass(), "lastPlaceId", -1452529928);
        setField(term59683, term59683.getClass(), "lastPlaceName", "MZzoPKpFlh");
        setIntField(term59683, term59683.getClass(), "lastRegionId", -467618426);
        setField(term59683, term59683.getClass(), "lastRegionName", "skVZETaBKX");
        setIntField(term59683, term59683.getClass(), "lastAllNetId", 1728446971);
        setField(term59683, term59683.getClass(), "lastClientId", "jcJNIBACPb");
        setIntField(term59683, term59683.getClass(), "lastUsedDeckId", 871757481);
        setIntField(term59683, term59683.getClass(), "lastPlayMusicLevel", -866223414);
        setIntField(term59683, term59683.getClass(), "lastEmoneyBrand", -914821646);
        term59946 = new Integer(-1420229744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term59946;
        callMethod(klass, "setRivalScoreCategorySetting", argTypes, term59683, args);
    }

};


