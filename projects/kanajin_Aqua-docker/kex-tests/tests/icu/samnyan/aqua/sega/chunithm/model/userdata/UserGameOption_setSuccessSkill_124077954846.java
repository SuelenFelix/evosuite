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
import java.lang.Integer;

public class UserGameOption_setSuccessSkill_124077954846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69887;
     Object term70187;

    public UserGameOption_setSuccessSkill_124077954846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term69893 = new Long(8313800941204938919L);
        term69887 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term69889 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term69891 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term69907 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69908 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69912 = newInstance(Class.forName("java.time.LocalTime"));
        Object term69917 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69918 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69922 = newInstance(Class.forName("java.time.LocalTime"));
        Object term69939 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term69940 = newInstance(Class.forName("java.time.LocalDate"));
        Object term69944 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70000 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70001 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70005 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70048 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70049 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70053 = newInstance(Class.forName("java.time.LocalTime"));
        Object term70094 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term70095 = newInstance(Class.forName("java.time.LocalDate"));
        Object term70099 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term69887, term69887.getClass(), "id", -447638576776090708L);
        setLongField(term69889, term69889.getClass(), "id", -3876284999950409934L);
        setLongField(term69891, term69891.getClass(), "id", 219518058983770018L);
        setField(term69891, term69891.getClass(), "extId", term69893);
        setField(term69891, term69891.getClass(), "luid", "HHAcgDPghN");
        setIntField(term69908, term69908.getClass(), "year", 2023);
        setShortField(term69908, term69908.getClass(), "month", (short) 12);
        setShortField(term69908, term69908.getClass(), "day", (short) 26);
        setField(term69907, term69907.getClass(), "date", term69908);
        setByteField(term69912, term69912.getClass(), "hour", (byte) 17);
        setByteField(term69912, term69912.getClass(), "minute", (byte) 38);
        setByteField(term69912, term69912.getClass(), "second", (byte) 54);
        setIntField(term69912, term69912.getClass(), "nano", 703000129);
        setField(term69907, term69907.getClass(), "time", term69912);
        setField(term69891, term69891.getClass(), "registerTime", term69907);
        setIntField(term69918, term69918.getClass(), "year", 2013);
        setShortField(term69918, term69918.getClass(), "month", (short) 8);
        setShortField(term69918, term69918.getClass(), "day", (short) 24);
        setField(term69917, term69917.getClass(), "date", term69918);
        setByteField(term69922, term69922.getClass(), "hour", (byte) 15);
        setByteField(term69922, term69922.getClass(), "minute", (byte) 52);
        setByteField(term69922, term69922.getClass(), "second", (byte) 16);
        setIntField(term69922, term69922.getClass(), "nano", 996842360);
        setField(term69917, term69917.getClass(), "time", term69922);
        setField(term69891, term69891.getClass(), "accessTime", term69917);
        setField(term69889, term69889.getClass(), "card", term69891);
        setField(term69889, term69889.getClass(), "userName", "GzmFcFoYft");
        setIntField(term69940, term69940.getClass(), "year", 2010);
        setShortField(term69940, term69940.getClass(), "month", (short) 5);
        setShortField(term69940, term69940.getClass(), "day", (short) 27);
        setField(term69939, term69939.getClass(), "date", term69940);
        setByteField(term69944, term69944.getClass(), "hour", (byte) 20);
        setByteField(term69944, term69944.getClass(), "minute", (byte) 55);
        setByteField(term69944, term69944.getClass(), "second", (byte) 13);
        setIntField(term69944, term69944.getClass(), "nano", 375773979);
        setField(term69939, term69939.getClass(), "time", term69944);
        setField(term69889, term69889.getClass(), "lastLoginDate", term69939);
        setBooleanField(term69889, term69889.getClass(), "isWebJoin", false);
        setField(term69889, term69889.getClass(), "webLimitDate", "LYRdIFgbgt");
        setIntField(term69889, term69889.getClass(), "level", 1256591052);
        setIntField(term69889, term69889.getClass(), "reincarnationNum", -281058594);
        setField(term69889, term69889.getClass(), "exp", "NiKeRXajei");
        setLongField(term69889, term69889.getClass(), "point", 1549908057368393138L);
        setLongField(term69889, term69889.getClass(), "totalPoint", 1779727837594554817L);
        setIntField(term69889, term69889.getClass(), "playCount", -924330297);
        setIntField(term69889, term69889.getClass(), "multiPlayCount", -798738362);
        setIntField(term69889, term69889.getClass(), "multiWinCount", 280855495);
        setIntField(term69889, term69889.getClass(), "requestResCount", -1336475116);
        setIntField(term69889, term69889.getClass(), "acceptResCount", -229094004);
        setIntField(term69889, term69889.getClass(), "successResCount", 1055966732);
        setIntField(term69889, term69889.getClass(), "playerRating", -159550312);
        setIntField(term69889, term69889.getClass(), "highestRating", -376455725);
        setIntField(term69889, term69889.getClass(), "nameplateId", -522518067);
        setIntField(term69889, term69889.getClass(), "frameId", 513188923);
        setIntField(term69889, term69889.getClass(), "characterId", 1331840981);
        setIntField(term69889, term69889.getClass(), "trophyId", -1781235207);
        setIntField(term69889, term69889.getClass(), "playedTutorialBit", 1513185438);
        setIntField(term69889, term69889.getClass(), "firstTutorialCancelNum", 2065870022);
        setIntField(term69889, term69889.getClass(), "masterTutorialCancelNum", 945426732);
        setIntField(term69889, term69889.getClass(), "totalRepertoireCount", 202749749);
        setIntField(term69889, term69889.getClass(), "totalMapNum", -992491384);
        setLongField(term69889, term69889.getClass(), "totalHiScore", -6445063982585716818L);
        setLongField(term69889, term69889.getClass(), "totalBasicHighScore", -4609129422862658333L);
        setLongField(term69889, term69889.getClass(), "totalAdvancedHighScore", 4606742231634944447L);
        setLongField(term69889, term69889.getClass(), "totalExpertHighScore", 1182124670479030227L);
        setLongField(term69889, term69889.getClass(), "totalMasterHighScore", -7781300974767589244L);
        setIntField(term70001, term70001.getClass(), "year", 2023);
        setShortField(term70001, term70001.getClass(), "month", (short) 5);
        setShortField(term70001, term70001.getClass(), "day", (short) 21);
        setField(term70000, term70000.getClass(), "date", term70001);
        setByteField(term70005, term70005.getClass(), "hour", (byte) 7);
        setByteField(term70005, term70005.getClass(), "minute", (byte) 54);
        setByteField(term70005, term70005.getClass(), "second", (byte) 55);
        setIntField(term70005, term70005.getClass(), "nano", 241590130);
        setField(term70000, term70000.getClass(), "time", term70005);
        setField(term69889, term69889.getClass(), "eventWatchedDate", term70000);
        setIntField(term69889, term69889.getClass(), "friendCount", -1380307770);
        setBooleanField(term69889, term69889.getClass(), "isMaimai", false);
        setField(term69889, term69889.getClass(), "firstGameId", "fDNtdfDzQh");
        setField(term69889, term69889.getClass(), "firstRomVersion", "VbIydgisyZ");
        setField(term69889, term69889.getClass(), "firstDataVersion", "vigaMWRpCA");
        setIntField(term70049, term70049.getClass(), "year", 2017);
        setShortField(term70049, term70049.getClass(), "month", (short) 4);
        setShortField(term70049, term70049.getClass(), "day", (short) 7);
        setField(term70048, term70048.getClass(), "date", term70049);
        setByteField(term70053, term70053.getClass(), "hour", (byte) 21);
        setByteField(term70053, term70053.getClass(), "minute", (byte) 7);
        setByteField(term70053, term70053.getClass(), "second", (byte) 57);
        setIntField(term70053, term70053.getClass(), "nano", 229024114);
        setField(term70048, term70048.getClass(), "time", term70053);
        setField(term69889, term69889.getClass(), "firstPlayDate", term70048);
        setField(term69889, term69889.getClass(), "lastGameId", "sgVVVUpnau");
        setField(term69889, term69889.getClass(), "lastRomVersion", "xwVTgDhNdW");
        setField(term69889, term69889.getClass(), "lastDataVersion", "ruqGjVRVlD");
        setIntField(term70095, term70095.getClass(), "year", 2019);
        setShortField(term70095, term70095.getClass(), "month", (short) 2);
        setShortField(term70095, term70095.getClass(), "day", (short) 24);
        setField(term70094, term70094.getClass(), "date", term70095);
        setByteField(term70099, term70099.getClass(), "hour", (byte) 1);
        setByteField(term70099, term70099.getClass(), "minute", (byte) 34);
        setByteField(term70099, term70099.getClass(), "second", (byte) 39);
        setIntField(term70099, term70099.getClass(), "nano", 549100800);
        setField(term70094, term70094.getClass(), "time", term70099);
        setField(term69889, term69889.getClass(), "lastPlayDate", term70094);
        setIntField(term69889, term69889.getClass(), "lastPlaceId", -398040410);
        setField(term69889, term69889.getClass(), "lastPlaceName", "oeoFYkQLVk");
        setField(term69889, term69889.getClass(), "lastRegionId", "fibZqjUmdU");
        setField(term69889, term69889.getClass(), "lastRegionName", "DvLIPKnbCV");
        setField(term69889, term69889.getClass(), "lastAllNetId", "QwAMZyCIhS");
        setField(term69889, term69889.getClass(), "lastClientId", "TnLDXZoBoo");
        setField(term69887, term69887.getClass(), "user", term69889);
        setIntField(term69887, term69887.getClass(), "bgInfo", 805467390);
        setIntField(term69887, term69887.getClass(), "fieldColor", -290388375);
        setIntField(term69887, term69887.getClass(), "guideSound", -532420212);
        setIntField(term69887, term69887.getClass(), "soundEffect", 78868015);
        setIntField(term69887, term69887.getClass(), "guideLine", 1775132358);
        setIntField(term69887, term69887.getClass(), "speed", 1425161368);
        setIntField(term69887, term69887.getClass(), "optionSet", -340532486);
        setIntField(term69887, term69887.getClass(), "matching", 1445018453);
        setIntField(term69887, term69887.getClass(), "judgePos", -1201954705);
        setIntField(term69887, term69887.getClass(), "rating", -339503028);
        setIntField(term69887, term69887.getClass(), "judgeJustice", -1432328434);
        setIntField(term69887, term69887.getClass(), "judgeAttack", 1166275920);
        setIntField(term69887, term69887.getClass(), "headphone", -895238659);
        setIntField(term69887, term69887.getClass(), "playerLevel", -1402177219);
        setIntField(term69887, term69887.getClass(), "successTap", -253998401);
        setIntField(term69887, term69887.getClass(), "successExTap", 325883202);
        setIntField(term69887, term69887.getClass(), "successSlideHold", -206493043);
        setIntField(term69887, term69887.getClass(), "successAir", 1965551499);
        setIntField(term69887, term69887.getClass(), "successFlick", -2009375732);
        setIntField(term69887, term69887.getClass(), "successSkill", 2023451839);
        setIntField(term69887, term69887.getClass(), "successTapTimbre", 1529272966);
        setIntField(term69887, term69887.getClass(), "privacy", 1613280223);
        term70187 = new Integer(-949788335);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term70187;
        callMethod(klass, "setSuccessSkill", argTypes, term69887, args);
    }

};


