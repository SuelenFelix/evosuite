package icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ExternalUserData_getNameplateId_8998151518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7219;

    public ExternalUserData_getNameplateId_8998151518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7219 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData"));
        Object term7244 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7245 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7249 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7305 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7306 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7310 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7353 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7354 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7358 = newInstance(Class.forName("java.time.LocalTime"));
        Object term7399 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term7400 = newInstance(Class.forName("java.time.LocalDate"));
        Object term7404 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term7219, term7219.getClass(), "accessCode", "SPtPatHeOm");
        setField(term7219, term7219.getClass(), "userName", "ywmcuThdfL");
        setIntField(term7245, term7245.getClass(), "year", 2022);
        setShortField(term7245, term7245.getClass(), "month", (short) 11);
        setShortField(term7245, term7245.getClass(), "day", (short) 10);
        setField(term7244, term7244.getClass(), "date", term7245);
        setByteField(term7249, term7249.getClass(), "hour", (byte) 20);
        setByteField(term7249, term7249.getClass(), "minute", (byte) 8);
        setByteField(term7249, term7249.getClass(), "second", (byte) 35);
        setIntField(term7249, term7249.getClass(), "nano", 658416570);
        setField(term7244, term7244.getClass(), "time", term7249);
        setField(term7219, term7219.getClass(), "lastLoginDate", term7244);
        setBooleanField(term7219, term7219.getClass(), "isWebJoin", true);
        setField(term7219, term7219.getClass(), "webLimitDate", "GBOEuByOfr");
        setIntField(term7219, term7219.getClass(), "level", -100825168);
        setIntField(term7219, term7219.getClass(), "reincarnationNum", 768407648);
        setField(term7219, term7219.getClass(), "exp", "NHbOFFjyVK");
        setLongField(term7219, term7219.getClass(), "point", 8313800941204938919L);
        setLongField(term7219, term7219.getClass(), "totalPoint", -1214968196781083707L);
        setIntField(term7219, term7219.getClass(), "playCount", -350454594);
        setIntField(term7219, term7219.getClass(), "multiPlayCount", -1148142995);
        setIntField(term7219, term7219.getClass(), "multiWinCount", -233024044);
        setIntField(term7219, term7219.getClass(), "requestResCount", 1820784228);
        setIntField(term7219, term7219.getClass(), "acceptResCount", 1390820006);
        setIntField(term7219, term7219.getClass(), "successResCount", -828982065);
        setIntField(term7219, term7219.getClass(), "playerRating", 1221443226);
        setIntField(term7219, term7219.getClass(), "highestRating", 908108726);
        setIntField(term7219, term7219.getClass(), "nameplateId", 1023209512);
        setIntField(term7219, term7219.getClass(), "frameId", 1084849225);
        setIntField(term7219, term7219.getClass(), "characterId", -1702055571);
        setIntField(term7219, term7219.getClass(), "trophyId", -944542900);
        setIntField(term7219, term7219.getClass(), "playedTutorialBit", 2063762142);
        setIntField(term7219, term7219.getClass(), "firstTutorialCancelNum", 1658391716);
        setIntField(term7219, term7219.getClass(), "masterTutorialCancelNum", 2143282300);
        setIntField(term7219, term7219.getClass(), "totalRepertoireCount", 1137624258);
        setIntField(term7219, term7219.getClass(), "totalMapNum", 977862393);
        setLongField(term7219, term7219.getClass(), "totalHiScore", -1804015692891701666L);
        setLongField(term7219, term7219.getClass(), "totalBasicHighScore", -6432617521836576658L);
        setLongField(term7219, term7219.getClass(), "totalAdvancedHighScore", -2255965562447970862L);
        setLongField(term7219, term7219.getClass(), "totalExpertHighScore", 148047808219672941L);
        setLongField(term7219, term7219.getClass(), "totalMasterHighScore", 7489064039921396098L);
        setIntField(term7306, term7306.getClass(), "year", 2018);
        setShortField(term7306, term7306.getClass(), "month", (short) 11);
        setShortField(term7306, term7306.getClass(), "day", (short) 9);
        setField(term7305, term7305.getClass(), "date", term7306);
        setByteField(term7310, term7310.getClass(), "hour", (byte) 6);
        setByteField(term7310, term7310.getClass(), "minute", (byte) 8);
        setByteField(term7310, term7310.getClass(), "second", (byte) 32);
        setIntField(term7310, term7310.getClass(), "nano", 750733310);
        setField(term7305, term7305.getClass(), "time", term7310);
        setField(term7219, term7219.getClass(), "eventWatchedDate", term7305);
        setIntField(term7219, term7219.getClass(), "friendCount", 301401782);
        setBooleanField(term7219, term7219.getClass(), "isMaimai", true);
        setField(term7219, term7219.getClass(), "firstGameId", "zaloBqlrSo");
        setField(term7219, term7219.getClass(), "firstRomVersion", "vvoLrMGCoN");
        setField(term7219, term7219.getClass(), "firstDataVersion", "pXdglvyrQe");
        setIntField(term7354, term7354.getClass(), "year", 2010);
        setShortField(term7354, term7354.getClass(), "month", (short) 2);
        setShortField(term7354, term7354.getClass(), "day", (short) 24);
        setField(term7353, term7353.getClass(), "date", term7354);
        setByteField(term7358, term7358.getClass(), "hour", (byte) 17);
        setByteField(term7358, term7358.getClass(), "minute", (byte) 58);
        setByteField(term7358, term7358.getClass(), "second", (byte) 56);
        setIntField(term7358, term7358.getClass(), "nano", 291725532);
        setField(term7353, term7353.getClass(), "time", term7358);
        setField(term7219, term7219.getClass(), "firstPlayDate", term7353);
        setField(term7219, term7219.getClass(), "lastGameId", "OcfNzHYdki");
        setField(term7219, term7219.getClass(), "lastRomVersion", "uPuCVuZYOI");
        setField(term7219, term7219.getClass(), "lastDataVersion", "TweMFhxNdj");
        setIntField(term7400, term7400.getClass(), "year", 2028);
        setShortField(term7400, term7400.getClass(), "month", (short) 7);
        setShortField(term7400, term7400.getClass(), "day", (short) 22);
        setField(term7399, term7399.getClass(), "date", term7400);
        setByteField(term7404, term7404.getClass(), "hour", (byte) 18);
        setByteField(term7404, term7404.getClass(), "minute", (byte) 33);
        setByteField(term7404, term7404.getClass(), "second", (byte) 7);
        setIntField(term7404, term7404.getClass(), "nano", 763613074);
        setField(term7399, term7399.getClass(), "time", term7404);
        setField(term7219, term7219.getClass(), "lastPlayDate", term7399);
        setIntField(term7219, term7219.getClass(), "lastPlaceId", 1988605357);
        setField(term7219, term7219.getClass(), "lastPlaceName", "NBrvVzvQHe");
        setField(term7219, term7219.getClass(), "lastRegionId", "FjOiNAfBOc");
        setField(term7219, term7219.getClass(), "lastRegionName", "iCCsaLHohG");
        setField(term7219, term7219.getClass(), "lastAllNetId", "NJhGgctbdj");
        setField(term7219, term7219.getClass(), "lastClientId", "MYWYUeLGOp");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v1.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNameplateId", argTypes, term7219, args);
    }

};


