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

public class UserData_getUserName_19831909432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22764;

    public UserData_getUserName_19831909432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term22768 = new Long(2936323121573284007L);
        term22764 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term22766 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term22782 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22783 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22787 = newInstance(Class.forName("java.time.LocalTime"));
        Object term22792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term22793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term22797 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term22764, term22764.getClass(), "id", -7055293192926325895L);
        setLongField(term22766, term22766.getClass(), "id", 9121171957554652661L);
        setField(term22766, term22766.getClass(), "extId", term22768);
        setField(term22766, term22766.getClass(), "luid", "bbHWyibNmy");
        setIntField(term22783, term22783.getClass(), "year", 2013);
        setShortField(term22783, term22783.getClass(), "month", (short) 11);
        setShortField(term22783, term22783.getClass(), "day", (short) 19);
        setField(term22782, term22782.getClass(), "date", term22783);
        setByteField(term22787, term22787.getClass(), "hour", (byte) 6);
        setByteField(term22787, term22787.getClass(), "minute", (byte) 45);
        setByteField(term22787, term22787.getClass(), "second", (byte) 10);
        setIntField(term22787, term22787.getClass(), "nano", 288981190);
        setField(term22782, term22782.getClass(), "time", term22787);
        setField(term22766, term22766.getClass(), "registerTime", term22782);
        setIntField(term22793, term22793.getClass(), "year", 2025);
        setShortField(term22793, term22793.getClass(), "month", (short) 9);
        setShortField(term22793, term22793.getClass(), "day", (short) 18);
        setField(term22792, term22792.getClass(), "date", term22793);
        setByteField(term22797, term22797.getClass(), "hour", (byte) 16);
        setByteField(term22797, term22797.getClass(), "minute", (byte) 1);
        setByteField(term22797, term22797.getClass(), "second", (byte) 23);
        setIntField(term22797, term22797.getClass(), "nano", 178285726);
        setField(term22792, term22792.getClass(), "time", term22797);
        setField(term22766, term22766.getClass(), "accessTime", term22792);
        setField(term22764, term22764.getClass(), "card", term22766);
        setField(term22764, term22764.getClass(), "userName", "vYYOYhWMWZ");
        setIntField(term22764, term22764.getClass(), "level", 346282818);
        setIntField(term22764, term22764.getClass(), "reincarnationNum", -857876056);
        setLongField(term22764, term22764.getClass(), "exp", -2752058965354731489L);
        setLongField(term22764, term22764.getClass(), "point", -4723024480537897669L);
        setLongField(term22764, term22764.getClass(), "totalPoint", -8609587218393726408L);
        setIntField(term22764, term22764.getClass(), "playCount", 1392910876);
        setIntField(term22764, term22764.getClass(), "jewelCount", 1086383182);
        setIntField(term22764, term22764.getClass(), "totalJewelCount", 1425319286);
        setIntField(term22764, term22764.getClass(), "medalCount", 1729919228);
        setIntField(term22764, term22764.getClass(), "playerRating", 872351195);
        setIntField(term22764, term22764.getClass(), "highestRating", -1664328399);
        setIntField(term22764, term22764.getClass(), "battlePoint", 1422430512);
        setIntField(term22764, term22764.getClass(), "bestBattlePoint", 1796581482);
        setIntField(term22764, term22764.getClass(), "overDamageBattlePoint", 1286440081);
        setBooleanField(term22764, term22764.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term22764, term22764.getClass(), "nameplateId", -928538452);
        setIntField(term22764, term22764.getClass(), "trophyId", -1313207353);
        setIntField(term22764, term22764.getClass(), "cardId", 402612318);
        setIntField(term22764, term22764.getClass(), "characterId", -1628481565);
        setIntField(term22764, term22764.getClass(), "characterVoiceNo", -217226756);
        setIntField(term22764, term22764.getClass(), "tabSetting", 1608000247);
        setIntField(term22764, term22764.getClass(), "tabSortSetting", 1354560887);
        setIntField(term22764, term22764.getClass(), "cardCategorySetting", -749474542);
        setIntField(term22764, term22764.getClass(), "cardSortSetting", -47907780);
        setIntField(term22764, term22764.getClass(), "rivalScoreCategorySetting", 1131462369);
        setIntField(term22764, term22764.getClass(), "playedTutorialBit", -1161206731);
        setIntField(term22764, term22764.getClass(), "firstTutorialCancelNum", -992847709);
        setLongField(term22764, term22764.getClass(), "sumTechHighScore", 4133412897876628646L);
        setLongField(term22764, term22764.getClass(), "sumTechBasicHighScore", -4233021136506075526L);
        setLongField(term22764, term22764.getClass(), "sumTechAdvancedHighScore", 9041534029896652168L);
        setLongField(term22764, term22764.getClass(), "sumTechExpertHighScore", 1342629750107593698L);
        setLongField(term22764, term22764.getClass(), "sumTechMasterHighScore", -2050224942342343039L);
        setLongField(term22764, term22764.getClass(), "sumTechLunaticHighScore", -2456427474561523240L);
        setLongField(term22764, term22764.getClass(), "sumBattleHighScore", -7010338441819086776L);
        setLongField(term22764, term22764.getClass(), "sumBattleBasicHighScore", 1881020230556705937L);
        setLongField(term22764, term22764.getClass(), "sumBattleAdvancedHighScore", -2937192447508714837L);
        setLongField(term22764, term22764.getClass(), "sumBattleExpertHighScore", 3804352102719959988L);
        setLongField(term22764, term22764.getClass(), "sumBattleMasterHighScore", -5317408542996378156L);
        setLongField(term22764, term22764.getClass(), "sumBattleLunaticHighScore", 3345606904545902400L);
        setField(term22764, term22764.getClass(), "eventWatchedDate", "FLQJOzEXff");
        setField(term22764, term22764.getClass(), "cmEventWatchedDate", "qlaIVJBSfQ");
        setField(term22764, term22764.getClass(), "firstGameId", "lYvIWBFFsq");
        setField(term22764, term22764.getClass(), "firstRomVersion", "tThwsqWKcE");
        setField(term22764, term22764.getClass(), "firstDataVersion", "bkSgsDrkCN");
        setField(term22764, term22764.getClass(), "firstPlayDate", "hwjlcimgJH");
        setField(term22764, term22764.getClass(), "lastGameId", "TLxQzxvizR");
        setField(term22764, term22764.getClass(), "lastRomVersion", "uUgJfKAzDM");
        setField(term22764, term22764.getClass(), "lastDataVersion", "gZPZNkweEp");
        setField(term22764, term22764.getClass(), "compatibleCmVersion", "vfennwtmqe");
        setField(term22764, term22764.getClass(), "lastPlayDate", "zZxoNkohbw");
        setIntField(term22764, term22764.getClass(), "lastPlaceId", 1125156671);
        setField(term22764, term22764.getClass(), "lastPlaceName", "DQrjPcLysX");
        setIntField(term22764, term22764.getClass(), "lastRegionId", 1203107925);
        setField(term22764, term22764.getClass(), "lastRegionName", "VWPFyrpmmb");
        setIntField(term22764, term22764.getClass(), "lastAllNetId", 1825448944);
        setField(term22764, term22764.getClass(), "lastClientId", "gYYKrIeThw");
        setIntField(term22764, term22764.getClass(), "lastUsedDeckId", 1769496642);
        setIntField(term22764, term22764.getClass(), "lastPlayMusicLevel", -947460705);
        setIntField(term22764, term22764.getClass(), "lastEmoneyBrand", -1435758764);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term22764, args);
    }

};


