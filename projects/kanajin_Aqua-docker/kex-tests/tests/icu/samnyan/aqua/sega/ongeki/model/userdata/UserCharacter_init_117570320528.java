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
import java.lang.Boolean;

public class UserCharacter_init_117570320528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180459;
     Object term180461;
     Object term180724;
     Object term180726;
     Object term180728;
     Object term180730;
     Object term180732;
     Object term180734;
     Object term180736;
     Object term180750;

    public UserCharacter_init_117570320528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180459 = new Long(-1530333245013304595L);
        Long term180465 = new Long(-7400951017937830861L);
        term180461 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term180463 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term180479 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term180480 = newInstance(Class.forName("java.time.LocalDate"));
        Object term180484 = newInstance(Class.forName("java.time.LocalTime"));
        Object term180489 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term180490 = newInstance(Class.forName("java.time.LocalDate"));
        Object term180494 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term180461, term180461.getClass(), "id", -1090685640573822657L);
        setLongField(term180463, term180463.getClass(), "id", 8481202509052388559L);
        setField(term180463, term180463.getClass(), "extId", term180465);
        setField(term180463, term180463.getClass(), "luid", "ewVmyurtun");
        setIntField(term180480, term180480.getClass(), "year", 2012);
        setShortField(term180480, term180480.getClass(), "month", (short) 3);
        setShortField(term180480, term180480.getClass(), "day", (short) 6);
        setField(term180479, term180479.getClass(), "date", term180480);
        setByteField(term180484, term180484.getClass(), "hour", (byte) 8);
        setByteField(term180484, term180484.getClass(), "minute", (byte) 53);
        setByteField(term180484, term180484.getClass(), "second", (byte) 27);
        setIntField(term180484, term180484.getClass(), "nano", 49638302);
        setField(term180479, term180479.getClass(), "time", term180484);
        setField(term180463, term180463.getClass(), "registerTime", term180479);
        setIntField(term180490, term180490.getClass(), "year", 2026);
        setShortField(term180490, term180490.getClass(), "month", (short) 5);
        setShortField(term180490, term180490.getClass(), "day", (short) 4);
        setField(term180489, term180489.getClass(), "date", term180490);
        setByteField(term180494, term180494.getClass(), "hour", (byte) 4);
        setByteField(term180494, term180494.getClass(), "minute", (byte) 39);
        setByteField(term180494, term180494.getClass(), "second", (byte) 57);
        setIntField(term180494, term180494.getClass(), "nano", 807455541);
        setField(term180489, term180489.getClass(), "time", term180494);
        setField(term180463, term180463.getClass(), "accessTime", term180489);
        setField(term180461, term180461.getClass(), "card", term180463);
        setField(term180461, term180461.getClass(), "userName", "RJISIoHieW");
        setIntField(term180461, term180461.getClass(), "level", -1852734181);
        setIntField(term180461, term180461.getClass(), "reincarnationNum", -1308471159);
        setLongField(term180461, term180461.getClass(), "exp", 7721367588958130964L);
        setLongField(term180461, term180461.getClass(), "point", -6789574876678140919L);
        setLongField(term180461, term180461.getClass(), "totalPoint", 4235835302914779558L);
        setIntField(term180461, term180461.getClass(), "playCount", -268958262);
        setIntField(term180461, term180461.getClass(), "jewelCount", -180125474);
        setIntField(term180461, term180461.getClass(), "totalJewelCount", 1811860572);
        setIntField(term180461, term180461.getClass(), "medalCount", 2147225333);
        setIntField(term180461, term180461.getClass(), "playerRating", 10666427);
        setIntField(term180461, term180461.getClass(), "highestRating", 1920948808);
        setIntField(term180461, term180461.getClass(), "battlePoint", 1619000643);
        setIntField(term180461, term180461.getClass(), "bestBattlePoint", 121958929);
        setIntField(term180461, term180461.getClass(), "overDamageBattlePoint", 2041749592);
        setBooleanField(term180461, term180461.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term180461, term180461.getClass(), "nameplateId", 783358809);
        setIntField(term180461, term180461.getClass(), "trophyId", 769701019);
        setIntField(term180461, term180461.getClass(), "cardId", 1125915526);
        setIntField(term180461, term180461.getClass(), "characterId", 965765161);
        setIntField(term180461, term180461.getClass(), "characterVoiceNo", -81419574);
        setIntField(term180461, term180461.getClass(), "tabSetting", 350041482);
        setIntField(term180461, term180461.getClass(), "tabSortSetting", -1772120343);
        setIntField(term180461, term180461.getClass(), "cardCategorySetting", -1481596613);
        setIntField(term180461, term180461.getClass(), "cardSortSetting", -395114974);
        setIntField(term180461, term180461.getClass(), "rivalScoreCategorySetting", -1876210443);
        setIntField(term180461, term180461.getClass(), "playedTutorialBit", 2077295439);
        setIntField(term180461, term180461.getClass(), "firstTutorialCancelNum", 513458467);
        setLongField(term180461, term180461.getClass(), "sumTechHighScore", 5789812911203527529L);
        setLongField(term180461, term180461.getClass(), "sumTechBasicHighScore", -2921396027918856479L);
        setLongField(term180461, term180461.getClass(), "sumTechAdvancedHighScore", 8769968545433324623L);
        setLongField(term180461, term180461.getClass(), "sumTechExpertHighScore", 8714017236816228053L);
        setLongField(term180461, term180461.getClass(), "sumTechMasterHighScore", -2138860539097099816L);
        setLongField(term180461, term180461.getClass(), "sumTechLunaticHighScore", 618190787574958453L);
        setLongField(term180461, term180461.getClass(), "sumBattleHighScore", 6155219870602408510L);
        setLongField(term180461, term180461.getClass(), "sumBattleBasicHighScore", -3408269754908466021L);
        setLongField(term180461, term180461.getClass(), "sumBattleAdvancedHighScore", -8672632881497791875L);
        setLongField(term180461, term180461.getClass(), "sumBattleExpertHighScore", 8521036802644417102L);
        setLongField(term180461, term180461.getClass(), "sumBattleMasterHighScore", -5475408143560615878L);
        setLongField(term180461, term180461.getClass(), "sumBattleLunaticHighScore", 4925350046977345351L);
        setField(term180461, term180461.getClass(), "eventWatchedDate", "GuAJIPitoi");
        setField(term180461, term180461.getClass(), "cmEventWatchedDate", "jdbenJidCP");
        setField(term180461, term180461.getClass(), "firstGameId", "bndQoQMcMY");
        setField(term180461, term180461.getClass(), "firstRomVersion", "nSplWTTcpK");
        setField(term180461, term180461.getClass(), "firstDataVersion", "DkUVQMwabd");
        setField(term180461, term180461.getClass(), "firstPlayDate", "TppVynnXqE");
        setField(term180461, term180461.getClass(), "lastGameId", "hXhrtjjyMT");
        setField(term180461, term180461.getClass(), "lastRomVersion", "dFjGRrTSwA");
        setField(term180461, term180461.getClass(), "lastDataVersion", "JeyCaLwPkU");
        setField(term180461, term180461.getClass(), "compatibleCmVersion", "zJsYcxwHIa");
        setField(term180461, term180461.getClass(), "lastPlayDate", "XyEGzjfDis");
        setIntField(term180461, term180461.getClass(), "lastPlaceId", -389945492);
        setField(term180461, term180461.getClass(), "lastPlaceName", "UomrevUDWL");
        setIntField(term180461, term180461.getClass(), "lastRegionId", 1789101859);
        setField(term180461, term180461.getClass(), "lastRegionName", "YjsbwAVpyC");
        setIntField(term180461, term180461.getClass(), "lastAllNetId", -1492991450);
        setField(term180461, term180461.getClass(), "lastClientId", "dxknmmbwXv");
        setIntField(term180461, term180461.getClass(), "lastUsedDeckId", 208180035);
        setIntField(term180461, term180461.getClass(), "lastPlayMusicLevel", 879358506);
        setIntField(term180461, term180461.getClass(), "lastEmoneyBrand", -149578848);
        term180724 = new Integer(-790053054);
        term180726 = new Integer(-358784693);
        term180728 = new Integer(-257641591);
        term180730 = new Integer(547173219);
        term180732 = new Integer(-1222302154);
        term180734 = new Integer(-567762942);
        term180736 = new Integer(-191282731);
        term180750 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[11];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = int.class;
        argTypes[9] = Class.forName("java.lang.String");
        argTypes[10] = boolean.class;
        Object[] args = new Object[11];
        args[0] = term180459;
        args[1] = term180461;
        args[2] = term180724;
        args[3] = term180726;
        args[4] = term180728;
        args[5] = term180730;
        args[6] = term180732;
        args[7] = term180734;
        args[8] = term180736;
        args[9] = "MNrIwQpgeA";
        args[10] = term180750;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


