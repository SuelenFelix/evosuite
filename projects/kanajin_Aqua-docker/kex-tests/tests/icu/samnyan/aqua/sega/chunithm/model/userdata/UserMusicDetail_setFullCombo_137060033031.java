package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Boolean;

public class UserMusicDetail_setFullCombo_137060033031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101865;
     Object term102159;

    public UserMusicDetail_setFullCombo_137060033031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term101871 = new Long(4394651392080968777L);
        term101865 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail"));
        Object term101867 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term101869 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term101885 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101886 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101890 = newInstance(Class.forName("java.time.LocalTime"));
        Object term101895 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101896 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101900 = newInstance(Class.forName("java.time.LocalTime"));
        Object term101917 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101918 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101922 = newInstance(Class.forName("java.time.LocalTime"));
        Object term101978 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term101979 = newInstance(Class.forName("java.time.LocalDate"));
        Object term101983 = newInstance(Class.forName("java.time.LocalTime"));
        Object term102026 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102027 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102031 = newInstance(Class.forName("java.time.LocalTime"));
        Object term102072 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term102073 = newInstance(Class.forName("java.time.LocalDate"));
        Object term102077 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term101865, term101865.getClass(), "id", -6648383051825562915L);
        setLongField(term101867, term101867.getClass(), "id", -4486155849590836885L);
        setLongField(term101869, term101869.getClass(), "id", -6012687164779285598L);
        setField(term101869, term101869.getClass(), "extId", term101871);
        setField(term101869, term101869.getClass(), "luid", "fmFvklptLM");
        setIntField(term101886, term101886.getClass(), "year", 2025);
        setShortField(term101886, term101886.getClass(), "month", (short) 11);
        setShortField(term101886, term101886.getClass(), "day", (short) 9);
        setField(term101885, term101885.getClass(), "date", term101886);
        setByteField(term101890, term101890.getClass(), "hour", (byte) 12);
        setByteField(term101890, term101890.getClass(), "minute", (byte) 38);
        setByteField(term101890, term101890.getClass(), "second", (byte) 0);
        setIntField(term101890, term101890.getClass(), "nano", 390237133);
        setField(term101885, term101885.getClass(), "time", term101890);
        setField(term101869, term101869.getClass(), "registerTime", term101885);
        setIntField(term101896, term101896.getClass(), "year", 2015);
        setShortField(term101896, term101896.getClass(), "month", (short) 7);
        setShortField(term101896, term101896.getClass(), "day", (short) 8);
        setField(term101895, term101895.getClass(), "date", term101896);
        setByteField(term101900, term101900.getClass(), "hour", (byte) 16);
        setByteField(term101900, term101900.getClass(), "minute", (byte) 24);
        setByteField(term101900, term101900.getClass(), "second", (byte) 2);
        setIntField(term101900, term101900.getClass(), "nano", 743809138);
        setField(term101895, term101895.getClass(), "time", term101900);
        setField(term101869, term101869.getClass(), "accessTime", term101895);
        setField(term101867, term101867.getClass(), "card", term101869);
        setField(term101867, term101867.getClass(), "userName", "CYfPHswxIT");
        setIntField(term101918, term101918.getClass(), "year", 2010);
        setShortField(term101918, term101918.getClass(), "month", (short) 3);
        setShortField(term101918, term101918.getClass(), "day", (short) 7);
        setField(term101917, term101917.getClass(), "date", term101918);
        setByteField(term101922, term101922.getClass(), "hour", (byte) 4);
        setByteField(term101922, term101922.getClass(), "minute", (byte) 22);
        setByteField(term101922, term101922.getClass(), "second", (byte) 55);
        setIntField(term101922, term101922.getClass(), "nano", 880504824);
        setField(term101917, term101917.getClass(), "time", term101922);
        setField(term101867, term101867.getClass(), "lastLoginDate", term101917);
        setBooleanField(term101867, term101867.getClass(), "isWebJoin", true);
        setField(term101867, term101867.getClass(), "webLimitDate", "IDibKvfdDt");
        setIntField(term101867, term101867.getClass(), "level", -935931812);
        setIntField(term101867, term101867.getClass(), "reincarnationNum", 1486721984);
        setField(term101867, term101867.getClass(), "exp", "sKLtBTAssF");
        setLongField(term101867, term101867.getClass(), "point", 2233851663671602704L);
        setLongField(term101867, term101867.getClass(), "totalPoint", 6887740911666145680L);
        setIntField(term101867, term101867.getClass(), "playCount", 279609538);
        setIntField(term101867, term101867.getClass(), "multiPlayCount", -1364161498);
        setIntField(term101867, term101867.getClass(), "multiWinCount", -1602874517);
        setIntField(term101867, term101867.getClass(), "requestResCount", 522533128);
        setIntField(term101867, term101867.getClass(), "acceptResCount", 2076616628);
        setIntField(term101867, term101867.getClass(), "successResCount", -138960474);
        setIntField(term101867, term101867.getClass(), "playerRating", 541109635);
        setIntField(term101867, term101867.getClass(), "highestRating", -1533186568);
        setIntField(term101867, term101867.getClass(), "nameplateId", 916419043);
        setIntField(term101867, term101867.getClass(), "frameId", 467264395);
        setIntField(term101867, term101867.getClass(), "characterId", 943715309);
        setIntField(term101867, term101867.getClass(), "trophyId", 2013085557);
        setIntField(term101867, term101867.getClass(), "playedTutorialBit", -1067501154);
        setIntField(term101867, term101867.getClass(), "firstTutorialCancelNum", -479195168);
        setIntField(term101867, term101867.getClass(), "masterTutorialCancelNum", -1151891321);
        setIntField(term101867, term101867.getClass(), "totalRepertoireCount", 1141278466);
        setIntField(term101867, term101867.getClass(), "totalMapNum", -1649439614);
        setLongField(term101867, term101867.getClass(), "totalHiScore", -4871907458438465560L);
        setLongField(term101867, term101867.getClass(), "totalBasicHighScore", 7748272685716656724L);
        setLongField(term101867, term101867.getClass(), "totalAdvancedHighScore", -304168856452232538L);
        setLongField(term101867, term101867.getClass(), "totalExpertHighScore", -6655020803769744426L);
        setLongField(term101867, term101867.getClass(), "totalMasterHighScore", -6267313683795118791L);
        setIntField(term101979, term101979.getClass(), "year", 2024);
        setShortField(term101979, term101979.getClass(), "month", (short) 11);
        setShortField(term101979, term101979.getClass(), "day", (short) 25);
        setField(term101978, term101978.getClass(), "date", term101979);
        setByteField(term101983, term101983.getClass(), "hour", (byte) 1);
        setByteField(term101983, term101983.getClass(), "minute", (byte) 3);
        setByteField(term101983, term101983.getClass(), "second", (byte) 51);
        setIntField(term101983, term101983.getClass(), "nano", 384548224);
        setField(term101978, term101978.getClass(), "time", term101983);
        setField(term101867, term101867.getClass(), "eventWatchedDate", term101978);
        setIntField(term101867, term101867.getClass(), "friendCount", 498535038);
        setBooleanField(term101867, term101867.getClass(), "isMaimai", false);
        setField(term101867, term101867.getClass(), "firstGameId", "ROGqSdboUf");
        setField(term101867, term101867.getClass(), "firstRomVersion", "NfGNgrTcyY");
        setField(term101867, term101867.getClass(), "firstDataVersion", "uPuFIjvpsv");
        setIntField(term102027, term102027.getClass(), "year", 2027);
        setShortField(term102027, term102027.getClass(), "month", (short) 7);
        setShortField(term102027, term102027.getClass(), "day", (short) 14);
        setField(term102026, term102026.getClass(), "date", term102027);
        setByteField(term102031, term102031.getClass(), "hour", (byte) 9);
        setByteField(term102031, term102031.getClass(), "minute", (byte) 3);
        setByteField(term102031, term102031.getClass(), "second", (byte) 26);
        setIntField(term102031, term102031.getClass(), "nano", 381789355);
        setField(term102026, term102026.getClass(), "time", term102031);
        setField(term101867, term101867.getClass(), "firstPlayDate", term102026);
        setField(term101867, term101867.getClass(), "lastGameId", "zNKHFvTvNQ");
        setField(term101867, term101867.getClass(), "lastRomVersion", "cyqgSKerVH");
        setField(term101867, term101867.getClass(), "lastDataVersion", "KMFbAPDgQN");
        setIntField(term102073, term102073.getClass(), "year", 2029);
        setShortField(term102073, term102073.getClass(), "month", (short) 5);
        setShortField(term102073, term102073.getClass(), "day", (short) 19);
        setField(term102072, term102072.getClass(), "date", term102073);
        setByteField(term102077, term102077.getClass(), "hour", (byte) 1);
        setByteField(term102077, term102077.getClass(), "minute", (byte) 7);
        setByteField(term102077, term102077.getClass(), "second", (byte) 58);
        setIntField(term102077, term102077.getClass(), "nano", 949916065);
        setField(term102072, term102072.getClass(), "time", term102077);
        setField(term101867, term101867.getClass(), "lastPlayDate", term102072);
        setIntField(term101867, term101867.getClass(), "lastPlaceId", -135256376);
        setField(term101867, term101867.getClass(), "lastPlaceName", "pOXTylvole");
        setField(term101867, term101867.getClass(), "lastRegionId", "kfguTpQAqI");
        setField(term101867, term101867.getClass(), "lastRegionName", "YcPukufpJs");
        setField(term101867, term101867.getClass(), "lastAllNetId", "vvGshYKSpj");
        setField(term101867, term101867.getClass(), "lastClientId", "haqqYHJKqP");
        setField(term101865, term101865.getClass(), "user", term101867);
        setIntField(term101865, term101865.getClass(), "musicId", -1073689224);
        setIntField(term101865, term101865.getClass(), "level", -706123233);
        setIntField(term101865, term101865.getClass(), "playCount", 1037164777);
        setIntField(term101865, term101865.getClass(), "scoreMax", -1061962496);
        setIntField(term101865, term101865.getClass(), "resRequestCount", -1456265994);
        setIntField(term101865, term101865.getClass(), "resAcceptCount", 716720347);
        setIntField(term101865, term101865.getClass(), "resSuccessCount", -1144539304);
        setIntField(term101865, term101865.getClass(), "missCount", -1038395932);
        setIntField(term101865, term101865.getClass(), "maxComboCount", 1842163221);
        setBooleanField(term101865, term101865.getClass(), "isFullCombo", false);
        setBooleanField(term101865, term101865.getClass(), "isAllJustice", true);
        setBooleanField(term101865, term101865.getClass(), "isSuccess", true);
        setIntField(term101865, term101865.getClass(), "fullChain", 468583702);
        setIntField(term101865, term101865.getClass(), "maxChain", -875891947);
        setIntField(term101865, term101865.getClass(), "scoreRank", 1496553034);
        setBooleanField(term101865, term101865.getClass(), "isLock", false);
        term102159 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term102159;
        callMethod(klass, "setFullCombo", argTypes, term101865, args);
    }

};


