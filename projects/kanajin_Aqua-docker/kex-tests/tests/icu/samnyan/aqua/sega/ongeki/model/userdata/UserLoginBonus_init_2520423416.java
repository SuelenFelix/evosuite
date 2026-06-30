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
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public class UserLoginBonus_init_2520423416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307971;
     Object term307973;
     Object term308236;
     Object term308238;

    public UserLoginBonus_init_2520423416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307971 = new Long(5165835000942630222L);
        Long term307977 = new Long(4947643967691976731L);
        term307973 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term307975 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term307991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term307992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term307996 = newInstance(Class.forName("java.time.LocalTime"));
        Object term308001 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term308002 = newInstance(Class.forName("java.time.LocalDate"));
        Object term308006 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term307973, term307973.getClass(), "id", 6427321329688987667L);
        setLongField(term307975, term307975.getClass(), "id", -7235666391989121038L);
        setField(term307975, term307975.getClass(), "extId", term307977);
        setField(term307975, term307975.getClass(), "luid", "VhckgJdJBP");
        setIntField(term307992, term307992.getClass(), "year", 2013);
        setShortField(term307992, term307992.getClass(), "month", (short) 11);
        setShortField(term307992, term307992.getClass(), "day", (short) 18);
        setField(term307991, term307991.getClass(), "date", term307992);
        setByteField(term307996, term307996.getClass(), "hour", (byte) 5);
        setByteField(term307996, term307996.getClass(), "minute", (byte) 52);
        setByteField(term307996, term307996.getClass(), "second", (byte) 28);
        setIntField(term307996, term307996.getClass(), "nano", 861263775);
        setField(term307991, term307991.getClass(), "time", term307996);
        setField(term307975, term307975.getClass(), "registerTime", term307991);
        setIntField(term308002, term308002.getClass(), "year", 2028);
        setShortField(term308002, term308002.getClass(), "month", (short) 11);
        setShortField(term308002, term308002.getClass(), "day", (short) 7);
        setField(term308001, term308001.getClass(), "date", term308002);
        setByteField(term308006, term308006.getClass(), "hour", (byte) 11);
        setByteField(term308006, term308006.getClass(), "minute", (byte) 57);
        setByteField(term308006, term308006.getClass(), "second", (byte) 10);
        setIntField(term308006, term308006.getClass(), "nano", 547411849);
        setField(term308001, term308001.getClass(), "time", term308006);
        setField(term307975, term307975.getClass(), "accessTime", term308001);
        setField(term307973, term307973.getClass(), "card", term307975);
        setField(term307973, term307973.getClass(), "userName", "hYCtzoYTvH");
        setIntField(term307973, term307973.getClass(), "level", 601928914);
        setIntField(term307973, term307973.getClass(), "reincarnationNum", -136782583);
        setLongField(term307973, term307973.getClass(), "exp", -174682611148486006L);
        setLongField(term307973, term307973.getClass(), "point", 215269487619180106L);
        setLongField(term307973, term307973.getClass(), "totalPoint", -284885488070169090L);
        setIntField(term307973, term307973.getClass(), "playCount", 1555048573);
        setIntField(term307973, term307973.getClass(), "jewelCount", -18895625);
        setIntField(term307973, term307973.getClass(), "totalJewelCount", 647195359);
        setIntField(term307973, term307973.getClass(), "medalCount", -1574973049);
        setIntField(term307973, term307973.getClass(), "playerRating", 2116654690);
        setIntField(term307973, term307973.getClass(), "highestRating", -1058719664);
        setIntField(term307973, term307973.getClass(), "battlePoint", 463983332);
        setIntField(term307973, term307973.getClass(), "bestBattlePoint", -2132833047);
        setIntField(term307973, term307973.getClass(), "overDamageBattlePoint", 1270931140);
        setBooleanField(term307973, term307973.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term307973, term307973.getClass(), "nameplateId", 1238962538);
        setIntField(term307973, term307973.getClass(), "trophyId", 681751473);
        setIntField(term307973, term307973.getClass(), "cardId", -144291893);
        setIntField(term307973, term307973.getClass(), "characterId", 117129544);
        setIntField(term307973, term307973.getClass(), "characterVoiceNo", 1848381831);
        setIntField(term307973, term307973.getClass(), "tabSetting", -778102076);
        setIntField(term307973, term307973.getClass(), "tabSortSetting", -1713689291);
        setIntField(term307973, term307973.getClass(), "cardCategorySetting", -2063881648);
        setIntField(term307973, term307973.getClass(), "cardSortSetting", 563783162);
        setIntField(term307973, term307973.getClass(), "rivalScoreCategorySetting", 656102329);
        setIntField(term307973, term307973.getClass(), "playedTutorialBit", -1966739717);
        setIntField(term307973, term307973.getClass(), "firstTutorialCancelNum", 1421785489);
        setLongField(term307973, term307973.getClass(), "sumTechHighScore", -2555888999758825329L);
        setLongField(term307973, term307973.getClass(), "sumTechBasicHighScore", -7900272362861741347L);
        setLongField(term307973, term307973.getClass(), "sumTechAdvancedHighScore", 2469068941509849047L);
        setLongField(term307973, term307973.getClass(), "sumTechExpertHighScore", -7665208548890801346L);
        setLongField(term307973, term307973.getClass(), "sumTechMasterHighScore", 5616263318509815226L);
        setLongField(term307973, term307973.getClass(), "sumTechLunaticHighScore", 4931286962006578469L);
        setLongField(term307973, term307973.getClass(), "sumBattleHighScore", 7803969382575260216L);
        setLongField(term307973, term307973.getClass(), "sumBattleBasicHighScore", 6817581553694758149L);
        setLongField(term307973, term307973.getClass(), "sumBattleAdvancedHighScore", -3258640067389623335L);
        setLongField(term307973, term307973.getClass(), "sumBattleExpertHighScore", -596321255074194299L);
        setLongField(term307973, term307973.getClass(), "sumBattleMasterHighScore", -6409310329477306858L);
        setLongField(term307973, term307973.getClass(), "sumBattleLunaticHighScore", -2664410162258622074L);
        setField(term307973, term307973.getClass(), "eventWatchedDate", "kfRcItQbtN");
        setField(term307973, term307973.getClass(), "cmEventWatchedDate", "fYaxUKcsVQ");
        setField(term307973, term307973.getClass(), "firstGameId", "eWZDcRfvlB");
        setField(term307973, term307973.getClass(), "firstRomVersion", "FcOqUdaewM");
        setField(term307973, term307973.getClass(), "firstDataVersion", "nCMWfNNKRI");
        setField(term307973, term307973.getClass(), "firstPlayDate", "RNOGCUJUXh");
        setField(term307973, term307973.getClass(), "lastGameId", "XmTFjIFbur");
        setField(term307973, term307973.getClass(), "lastRomVersion", "dTboFubXEV");
        setField(term307973, term307973.getClass(), "lastDataVersion", "zWYdDhOIUq");
        setField(term307973, term307973.getClass(), "compatibleCmVersion", "kHZZLOQmnm");
        setField(term307973, term307973.getClass(), "lastPlayDate", "oshqKCgvpB");
        setIntField(term307973, term307973.getClass(), "lastPlaceId", 353670452);
        setField(term307973, term307973.getClass(), "lastPlaceName", "HJDtyPLFgE");
        setIntField(term307973, term307973.getClass(), "lastRegionId", 1415144193);
        setField(term307973, term307973.getClass(), "lastRegionName", "dFmJxbLTYH");
        setIntField(term307973, term307973.getClass(), "lastAllNetId", -28263322);
        setField(term307973, term307973.getClass(), "lastClientId", "XFMEZbiUJt");
        setIntField(term307973, term307973.getClass(), "lastUsedDeckId", 2096635362);
        setIntField(term307973, term307973.getClass(), "lastPlayMusicLevel", -303198211);
        setIntField(term307973, term307973.getClass(), "lastEmoneyBrand", -1539311662);
        term308236 = new Integer(207650579);
        term308238 = new Integer(-1857463721);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserLoginBonus");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term307971;
        args[1] = term307973;
        args[2] = term308236;
        args[3] = term308238;
        args[4] = "bMUTgRJrfr";
        Object instance = callConstructor(klass, argTypes, args);
    }

};


