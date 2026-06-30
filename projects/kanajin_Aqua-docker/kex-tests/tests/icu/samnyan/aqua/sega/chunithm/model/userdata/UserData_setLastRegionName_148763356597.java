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

public class UserData_setLastRegionName_148763356597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171093;

    public UserData_setLastRegionName_148763356597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term171097 = new Long(-432424084523104253L);
        term171093 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term171095 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term171111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171116 = newInstance(Class.forName("java.time.LocalTime"));
        Object term171121 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171122 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171126 = newInstance(Class.forName("java.time.LocalTime"));
        Object term171143 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171144 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171148 = newInstance(Class.forName("java.time.LocalTime"));
        Object term171204 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171205 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171209 = newInstance(Class.forName("java.time.LocalTime"));
        Object term171252 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171253 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171257 = newInstance(Class.forName("java.time.LocalTime"));
        Object term171298 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term171299 = newInstance(Class.forName("java.time.LocalDate"));
        Object term171303 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term171093, term171093.getClass(), "id", 1428981907548987584L);
        setLongField(term171095, term171095.getClass(), "id", 8237319232825837512L);
        setField(term171095, term171095.getClass(), "extId", term171097);
        setField(term171095, term171095.getClass(), "luid", "qSBOaqyZCf");
        setIntField(term171112, term171112.getClass(), "year", 2025);
        setShortField(term171112, term171112.getClass(), "month", (short) 5);
        setShortField(term171112, term171112.getClass(), "day", (short) 8);
        setField(term171111, term171111.getClass(), "date", term171112);
        setByteField(term171116, term171116.getClass(), "hour", (byte) 1);
        setByteField(term171116, term171116.getClass(), "minute", (byte) 55);
        setByteField(term171116, term171116.getClass(), "second", (byte) 26);
        setIntField(term171116, term171116.getClass(), "nano", 681035584);
        setField(term171111, term171111.getClass(), "time", term171116);
        setField(term171095, term171095.getClass(), "registerTime", term171111);
        setIntField(term171122, term171122.getClass(), "year", 2017);
        setShortField(term171122, term171122.getClass(), "month", (short) 4);
        setShortField(term171122, term171122.getClass(), "day", (short) 18);
        setField(term171121, term171121.getClass(), "date", term171122);
        setByteField(term171126, term171126.getClass(), "hour", (byte) 23);
        setByteField(term171126, term171126.getClass(), "minute", (byte) 3);
        setByteField(term171126, term171126.getClass(), "second", (byte) 9);
        setIntField(term171126, term171126.getClass(), "nano", 371565512);
        setField(term171121, term171121.getClass(), "time", term171126);
        setField(term171095, term171095.getClass(), "accessTime", term171121);
        setField(term171093, term171093.getClass(), "card", term171095);
        setField(term171093, term171093.getClass(), "userName", "iYkstxuhcz");
        setIntField(term171144, term171144.getClass(), "year", 2014);
        setShortField(term171144, term171144.getClass(), "month", (short) 6);
        setShortField(term171144, term171144.getClass(), "day", (short) 24);
        setField(term171143, term171143.getClass(), "date", term171144);
        setByteField(term171148, term171148.getClass(), "hour", (byte) 7);
        setByteField(term171148, term171148.getClass(), "minute", (byte) 42);
        setByteField(term171148, term171148.getClass(), "second", (byte) 49);
        setIntField(term171148, term171148.getClass(), "nano", 656159620);
        setField(term171143, term171143.getClass(), "time", term171148);
        setField(term171093, term171093.getClass(), "lastLoginDate", term171143);
        setBooleanField(term171093, term171093.getClass(), "isWebJoin", true);
        setField(term171093, term171093.getClass(), "webLimitDate", "ZjUBmbXewJ");
        setIntField(term171093, term171093.getClass(), "level", -1414495690);
        setIntField(term171093, term171093.getClass(), "reincarnationNum", -1835290975);
        setField(term171093, term171093.getClass(), "exp", "qIhzUowsTu");
        setLongField(term171093, term171093.getClass(), "point", -6127827855081859363L);
        setLongField(term171093, term171093.getClass(), "totalPoint", -7995755881860007512L);
        setIntField(term171093, term171093.getClass(), "playCount", 801385795);
        setIntField(term171093, term171093.getClass(), "multiPlayCount", -629922950);
        setIntField(term171093, term171093.getClass(), "multiWinCount", 1161572908);
        setIntField(term171093, term171093.getClass(), "requestResCount", -861910530);
        setIntField(term171093, term171093.getClass(), "acceptResCount", 243055128);
        setIntField(term171093, term171093.getClass(), "successResCount", -345324675);
        setIntField(term171093, term171093.getClass(), "playerRating", 1865838980);
        setIntField(term171093, term171093.getClass(), "highestRating", -269402208);
        setIntField(term171093, term171093.getClass(), "nameplateId", 714123083);
        setIntField(term171093, term171093.getClass(), "frameId", -1608554992);
        setIntField(term171093, term171093.getClass(), "characterId", -174955872);
        setIntField(term171093, term171093.getClass(), "trophyId", 1429537897);
        setIntField(term171093, term171093.getClass(), "playedTutorialBit", 216290703);
        setIntField(term171093, term171093.getClass(), "firstTutorialCancelNum", -294229148);
        setIntField(term171093, term171093.getClass(), "masterTutorialCancelNum", -1249763145);
        setIntField(term171093, term171093.getClass(), "totalRepertoireCount", -1872599962);
        setIntField(term171093, term171093.getClass(), "totalMapNum", 1889574494);
        setLongField(term171093, term171093.getClass(), "totalHiScore", 8748765904759083100L);
        setLongField(term171093, term171093.getClass(), "totalBasicHighScore", 6385422299803844802L);
        setLongField(term171093, term171093.getClass(), "totalAdvancedHighScore", -5859029021975243925L);
        setLongField(term171093, term171093.getClass(), "totalExpertHighScore", 2244262697913198516L);
        setLongField(term171093, term171093.getClass(), "totalMasterHighScore", -596830690725548669L);
        setIntField(term171205, term171205.getClass(), "year", 2028);
        setShortField(term171205, term171205.getClass(), "month", (short) 12);
        setShortField(term171205, term171205.getClass(), "day", (short) 16);
        setField(term171204, term171204.getClass(), "date", term171205);
        setByteField(term171209, term171209.getClass(), "hour", (byte) 19);
        setByteField(term171209, term171209.getClass(), "minute", (byte) 34);
        setByteField(term171209, term171209.getClass(), "second", (byte) 30);
        setIntField(term171209, term171209.getClass(), "nano", 480929932);
        setField(term171204, term171204.getClass(), "time", term171209);
        setField(term171093, term171093.getClass(), "eventWatchedDate", term171204);
        setIntField(term171093, term171093.getClass(), "friendCount", -687378216);
        setBooleanField(term171093, term171093.getClass(), "isMaimai", false);
        setField(term171093, term171093.getClass(), "firstGameId", "TzJKUbeSkU");
        setField(term171093, term171093.getClass(), "firstRomVersion", "lcNxBgxdPz");
        setField(term171093, term171093.getClass(), "firstDataVersion", "tCJUSNFwrz");
        setIntField(term171253, term171253.getClass(), "year", 2015);
        setShortField(term171253, term171253.getClass(), "month", (short) 1);
        setShortField(term171253, term171253.getClass(), "day", (short) 24);
        setField(term171252, term171252.getClass(), "date", term171253);
        setByteField(term171257, term171257.getClass(), "hour", (byte) 2);
        setByteField(term171257, term171257.getClass(), "minute", (byte) 28);
        setByteField(term171257, term171257.getClass(), "second", (byte) 5);
        setIntField(term171257, term171257.getClass(), "nano", 540506845);
        setField(term171252, term171252.getClass(), "time", term171257);
        setField(term171093, term171093.getClass(), "firstPlayDate", term171252);
        setField(term171093, term171093.getClass(), "lastGameId", "gtIsCrPlcG");
        setField(term171093, term171093.getClass(), "lastRomVersion", "GVOpFGDgdb");
        setField(term171093, term171093.getClass(), "lastDataVersion", "qaCabhijXy");
        setIntField(term171299, term171299.getClass(), "year", 2015);
        setShortField(term171299, term171299.getClass(), "month", (short) 11);
        setShortField(term171299, term171299.getClass(), "day", (short) 26);
        setField(term171298, term171298.getClass(), "date", term171299);
        setByteField(term171303, term171303.getClass(), "hour", (byte) 15);
        setByteField(term171303, term171303.getClass(), "minute", (byte) 52);
        setByteField(term171303, term171303.getClass(), "second", (byte) 13);
        setIntField(term171303, term171303.getClass(), "nano", 773904435);
        setField(term171298, term171298.getClass(), "time", term171303);
        setField(term171093, term171093.getClass(), "lastPlayDate", term171298);
        setIntField(term171093, term171093.getClass(), "lastPlaceId", -1552077299);
        setField(term171093, term171093.getClass(), "lastPlaceName", "gbsOQXxQpC");
        setField(term171093, term171093.getClass(), "lastRegionId", "LWdCGlgTfg");
        setField(term171093, term171093.getClass(), "lastRegionName", "UpyBgDHcdi");
        setField(term171093, term171093.getClass(), "lastAllNetId", "RqaFAWpQyj");
        setField(term171093, term171093.getClass(), "lastClientId", "QQKFcxEaGP");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wFsiyFrJKB";
        callMethod(klass, "setLastRegionName", argTypes, term171093, args);
    }

};


