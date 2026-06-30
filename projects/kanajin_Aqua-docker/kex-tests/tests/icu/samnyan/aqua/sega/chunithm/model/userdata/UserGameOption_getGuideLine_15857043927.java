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

public class UserGameOption_getGuideLine_15857043927 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51871;

    public UserGameOption_getGuideLine_15857043927() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term51877 = new Long(4474998035090263139L);
        term51871 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term51873 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term51875 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term51891 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51892 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51896 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51906 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51923 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51924 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51928 = newInstance(Class.forName("java.time.LocalTime"));
        Object term51984 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term51985 = newInstance(Class.forName("java.time.LocalDate"));
        Object term51989 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52032 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52033 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52037 = newInstance(Class.forName("java.time.LocalTime"));
        Object term52078 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term52079 = newInstance(Class.forName("java.time.LocalDate"));
        Object term52083 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term51871, term51871.getClass(), "id", -7089384741512135431L);
        setLongField(term51873, term51873.getClass(), "id", 7207062884131909895L);
        setLongField(term51875, term51875.getClass(), "id", 9005525882295990505L);
        setField(term51875, term51875.getClass(), "extId", term51877);
        setField(term51875, term51875.getClass(), "luid", "fViQeyMrrL");
        setIntField(term51892, term51892.getClass(), "year", 2013);
        setShortField(term51892, term51892.getClass(), "month", (short) 11);
        setShortField(term51892, term51892.getClass(), "day", (short) 15);
        setField(term51891, term51891.getClass(), "date", term51892);
        setByteField(term51896, term51896.getClass(), "hour", (byte) 16);
        setByteField(term51896, term51896.getClass(), "minute", (byte) 0);
        setByteField(term51896, term51896.getClass(), "second", (byte) 59);
        setIntField(term51896, term51896.getClass(), "nano", 823311700);
        setField(term51891, term51891.getClass(), "time", term51896);
        setField(term51875, term51875.getClass(), "registerTime", term51891);
        setIntField(term51902, term51902.getClass(), "year", 2017);
        setShortField(term51902, term51902.getClass(), "month", (short) 11);
        setShortField(term51902, term51902.getClass(), "day", (short) 30);
        setField(term51901, term51901.getClass(), "date", term51902);
        setByteField(term51906, term51906.getClass(), "hour", (byte) 23);
        setByteField(term51906, term51906.getClass(), "minute", (byte) 28);
        setByteField(term51906, term51906.getClass(), "second", (byte) 34);
        setIntField(term51906, term51906.getClass(), "nano", 684347789);
        setField(term51901, term51901.getClass(), "time", term51906);
        setField(term51875, term51875.getClass(), "accessTime", term51901);
        setField(term51873, term51873.getClass(), "card", term51875);
        setField(term51873, term51873.getClass(), "userName", "zzeaToyLmI");
        setIntField(term51924, term51924.getClass(), "year", 2013);
        setShortField(term51924, term51924.getClass(), "month", (short) 5);
        setShortField(term51924, term51924.getClass(), "day", (short) 9);
        setField(term51923, term51923.getClass(), "date", term51924);
        setByteField(term51928, term51928.getClass(), "hour", (byte) 21);
        setByteField(term51928, term51928.getClass(), "minute", (byte) 29);
        setByteField(term51928, term51928.getClass(), "second", (byte) 31);
        setIntField(term51928, term51928.getClass(), "nano", 674914044);
        setField(term51923, term51923.getClass(), "time", term51928);
        setField(term51873, term51873.getClass(), "lastLoginDate", term51923);
        setBooleanField(term51873, term51873.getClass(), "isWebJoin", false);
        setField(term51873, term51873.getClass(), "webLimitDate", "sKYWhmRMLx");
        setIntField(term51873, term51873.getClass(), "level", 2111644026);
        setIntField(term51873, term51873.getClass(), "reincarnationNum", 1000189054);
        setField(term51873, term51873.getClass(), "exp", "SOJpgWUZCf");
        setLongField(term51873, term51873.getClass(), "point", -604910205679247392L);
        setLongField(term51873, term51873.getClass(), "totalPoint", 2280240558714436788L);
        setIntField(term51873, term51873.getClass(), "playCount", 832500285);
        setIntField(term51873, term51873.getClass(), "multiPlayCount", 1519973734);
        setIntField(term51873, term51873.getClass(), "multiWinCount", -988300994);
        setIntField(term51873, term51873.getClass(), "requestResCount", 1939692211);
        setIntField(term51873, term51873.getClass(), "acceptResCount", 121806851);
        setIntField(term51873, term51873.getClass(), "successResCount", 1753247664);
        setIntField(term51873, term51873.getClass(), "playerRating", 521507971);
        setIntField(term51873, term51873.getClass(), "highestRating", 1760654275);
        setIntField(term51873, term51873.getClass(), "nameplateId", -1048247843);
        setIntField(term51873, term51873.getClass(), "frameId", -545135207);
        setIntField(term51873, term51873.getClass(), "characterId", 969786656);
        setIntField(term51873, term51873.getClass(), "trophyId", -1568320050);
        setIntField(term51873, term51873.getClass(), "playedTutorialBit", 398869857);
        setIntField(term51873, term51873.getClass(), "firstTutorialCancelNum", -2011847985);
        setIntField(term51873, term51873.getClass(), "masterTutorialCancelNum", 1113480119);
        setIntField(term51873, term51873.getClass(), "totalRepertoireCount", -159235116);
        setIntField(term51873, term51873.getClass(), "totalMapNum", 1280384723);
        setLongField(term51873, term51873.getClass(), "totalHiScore", 9164041864010757052L);
        setLongField(term51873, term51873.getClass(), "totalBasicHighScore", -4710087184100544875L);
        setLongField(term51873, term51873.getClass(), "totalAdvancedHighScore", 8351267378333718210L);
        setLongField(term51873, term51873.getClass(), "totalExpertHighScore", 9162413454188628116L);
        setLongField(term51873, term51873.getClass(), "totalMasterHighScore", 6077385331237778943L);
        setIntField(term51985, term51985.getClass(), "year", 2029);
        setShortField(term51985, term51985.getClass(), "month", (short) 10);
        setShortField(term51985, term51985.getClass(), "day", (short) 7);
        setField(term51984, term51984.getClass(), "date", term51985);
        setByteField(term51989, term51989.getClass(), "hour", (byte) 8);
        setByteField(term51989, term51989.getClass(), "minute", (byte) 43);
        setByteField(term51989, term51989.getClass(), "second", (byte) 49);
        setIntField(term51989, term51989.getClass(), "nano", 733700043);
        setField(term51984, term51984.getClass(), "time", term51989);
        setField(term51873, term51873.getClass(), "eventWatchedDate", term51984);
        setIntField(term51873, term51873.getClass(), "friendCount", 1755299610);
        setBooleanField(term51873, term51873.getClass(), "isMaimai", true);
        setField(term51873, term51873.getClass(), "firstGameId", "jgywFOzBDw");
        setField(term51873, term51873.getClass(), "firstRomVersion", "yKIXLtCWYi");
        setField(term51873, term51873.getClass(), "firstDataVersion", "EhuyRKrUJu");
        setIntField(term52033, term52033.getClass(), "year", 2015);
        setShortField(term52033, term52033.getClass(), "month", (short) 10);
        setShortField(term52033, term52033.getClass(), "day", (short) 4);
        setField(term52032, term52032.getClass(), "date", term52033);
        setByteField(term52037, term52037.getClass(), "hour", (byte) 4);
        setByteField(term52037, term52037.getClass(), "minute", (byte) 28);
        setByteField(term52037, term52037.getClass(), "second", (byte) 5);
        setIntField(term52037, term52037.getClass(), "nano", 457950228);
        setField(term52032, term52032.getClass(), "time", term52037);
        setField(term51873, term51873.getClass(), "firstPlayDate", term52032);
        setField(term51873, term51873.getClass(), "lastGameId", "UlBxuoBXcJ");
        setField(term51873, term51873.getClass(), "lastRomVersion", "PqduvNFXXw");
        setField(term51873, term51873.getClass(), "lastDataVersion", "bMQrxvaBAI");
        setIntField(term52079, term52079.getClass(), "year", 2017);
        setShortField(term52079, term52079.getClass(), "month", (short) 2);
        setShortField(term52079, term52079.getClass(), "day", (short) 8);
        setField(term52078, term52078.getClass(), "date", term52079);
        setByteField(term52083, term52083.getClass(), "hour", (byte) 12);
        setByteField(term52083, term52083.getClass(), "minute", (byte) 5);
        setByteField(term52083, term52083.getClass(), "second", (byte) 46);
        setIntField(term52083, term52083.getClass(), "nano", 847487783);
        setField(term52078, term52078.getClass(), "time", term52083);
        setField(term51873, term51873.getClass(), "lastPlayDate", term52078);
        setIntField(term51873, term51873.getClass(), "lastPlaceId", 1141997389);
        setField(term51873, term51873.getClass(), "lastPlaceName", "StFtysZlWm");
        setField(term51873, term51873.getClass(), "lastRegionId", "CoqUcmjnkF");
        setField(term51873, term51873.getClass(), "lastRegionName", "oOrXvGaFwa");
        setField(term51873, term51873.getClass(), "lastAllNetId", "KJSTLGsSvO");
        setField(term51873, term51873.getClass(), "lastClientId", "kSkiIpaepq");
        setField(term51871, term51871.getClass(), "user", term51873);
        setIntField(term51871, term51871.getClass(), "bgInfo", -1491507262);
        setIntField(term51871, term51871.getClass(), "fieldColor", 1071463645);
        setIntField(term51871, term51871.getClass(), "guideSound", 165616136);
        setIntField(term51871, term51871.getClass(), "soundEffect", 887351836);
        setIntField(term51871, term51871.getClass(), "guideLine", 2002612399);
        setIntField(term51871, term51871.getClass(), "speed", -1256668289);
        setIntField(term51871, term51871.getClass(), "optionSet", -1377964851);
        setIntField(term51871, term51871.getClass(), "matching", -1288314969);
        setIntField(term51871, term51871.getClass(), "judgePos", -1625206430);
        setIntField(term51871, term51871.getClass(), "rating", 1599734340);
        setIntField(term51871, term51871.getClass(), "judgeJustice", 1262425699);
        setIntField(term51871, term51871.getClass(), "judgeAttack", -515051505);
        setIntField(term51871, term51871.getClass(), "headphone", -1071258857);
        setIntField(term51871, term51871.getClass(), "playerLevel", 1274665398);
        setIntField(term51871, term51871.getClass(), "successTap", -1093564935);
        setIntField(term51871, term51871.getClass(), "successExTap", -1092739931);
        setIntField(term51871, term51871.getClass(), "successSlideHold", 859336834);
        setIntField(term51871, term51871.getClass(), "successAir", -924154861);
        setIntField(term51871, term51871.getClass(), "successFlick", -1878694006);
        setIntField(term51871, term51871.getClass(), "successSkill", 1950167487);
        setIntField(term51871, term51871.getClass(), "successTapTimbre", 1031826708);
        setIntField(term51871, term51871.getClass(), "privacy", -735726273);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getGuideLine", argTypes, term51871, args);
    }

};


