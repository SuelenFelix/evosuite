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

public class UserData_setFrameId_211104596170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term159353;
     Object term159629;

    public UserData_setFrameId_211104596170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term159357 = new Long(5797412846146719084L);
        term159353 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term159355 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term159371 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159372 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159376 = newInstance(Class.forName("java.time.LocalTime"));
        Object term159381 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159382 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159386 = newInstance(Class.forName("java.time.LocalTime"));
        Object term159403 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159404 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159408 = newInstance(Class.forName("java.time.LocalTime"));
        Object term159464 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159465 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159469 = newInstance(Class.forName("java.time.LocalTime"));
        Object term159512 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159513 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159517 = newInstance(Class.forName("java.time.LocalTime"));
        Object term159558 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term159559 = newInstance(Class.forName("java.time.LocalDate"));
        Object term159563 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term159353, term159353.getClass(), "id", 5372227829409893821L);
        setLongField(term159355, term159355.getClass(), "id", -546626977716687964L);
        setField(term159355, term159355.getClass(), "extId", term159357);
        setField(term159355, term159355.getClass(), "luid", "XkQUchkoze");
        setIntField(term159372, term159372.getClass(), "year", 2022);
        setShortField(term159372, term159372.getClass(), "month", (short) 9);
        setShortField(term159372, term159372.getClass(), "day", (short) 22);
        setField(term159371, term159371.getClass(), "date", term159372);
        setByteField(term159376, term159376.getClass(), "hour", (byte) 16);
        setByteField(term159376, term159376.getClass(), "minute", (byte) 7);
        setByteField(term159376, term159376.getClass(), "second", (byte) 40);
        setIntField(term159376, term159376.getClass(), "nano", 313058778);
        setField(term159371, term159371.getClass(), "time", term159376);
        setField(term159355, term159355.getClass(), "registerTime", term159371);
        setIntField(term159382, term159382.getClass(), "year", 2024);
        setShortField(term159382, term159382.getClass(), "month", (short) 9);
        setShortField(term159382, term159382.getClass(), "day", (short) 7);
        setField(term159381, term159381.getClass(), "date", term159382);
        setByteField(term159386, term159386.getClass(), "hour", (byte) 12);
        setByteField(term159386, term159386.getClass(), "minute", (byte) 36);
        setByteField(term159386, term159386.getClass(), "second", (byte) 49);
        setIntField(term159386, term159386.getClass(), "nano", 552948933);
        setField(term159381, term159381.getClass(), "time", term159386);
        setField(term159355, term159355.getClass(), "accessTime", term159381);
        setField(term159353, term159353.getClass(), "card", term159355);
        setField(term159353, term159353.getClass(), "userName", "xHufEneCSu");
        setIntField(term159404, term159404.getClass(), "year", 2026);
        setShortField(term159404, term159404.getClass(), "month", (short) 6);
        setShortField(term159404, term159404.getClass(), "day", (short) 22);
        setField(term159403, term159403.getClass(), "date", term159404);
        setByteField(term159408, term159408.getClass(), "hour", (byte) 3);
        setByteField(term159408, term159408.getClass(), "minute", (byte) 22);
        setByteField(term159408, term159408.getClass(), "second", (byte) 28);
        setIntField(term159408, term159408.getClass(), "nano", 238207974);
        setField(term159403, term159403.getClass(), "time", term159408);
        setField(term159353, term159353.getClass(), "lastLoginDate", term159403);
        setBooleanField(term159353, term159353.getClass(), "isWebJoin", false);
        setField(term159353, term159353.getClass(), "webLimitDate", "dcNBqbQVSa");
        setIntField(term159353, term159353.getClass(), "level", -1434914663);
        setIntField(term159353, term159353.getClass(), "reincarnationNum", -1057659831);
        setField(term159353, term159353.getClass(), "exp", "voFZMRWdRg");
        setLongField(term159353, term159353.getClass(), "point", 6528524159745127222L);
        setLongField(term159353, term159353.getClass(), "totalPoint", -2675518906672937671L);
        setIntField(term159353, term159353.getClass(), "playCount", -1734417411);
        setIntField(term159353, term159353.getClass(), "multiPlayCount", 2082696095);
        setIntField(term159353, term159353.getClass(), "multiWinCount", 1962199891);
        setIntField(term159353, term159353.getClass(), "requestResCount", 47146584);
        setIntField(term159353, term159353.getClass(), "acceptResCount", 2101216461);
        setIntField(term159353, term159353.getClass(), "successResCount", 1476730674);
        setIntField(term159353, term159353.getClass(), "playerRating", 1325210683);
        setIntField(term159353, term159353.getClass(), "highestRating", 794195150);
        setIntField(term159353, term159353.getClass(), "nameplateId", -84410522);
        setIntField(term159353, term159353.getClass(), "frameId", 512600470);
        setIntField(term159353, term159353.getClass(), "characterId", -694618352);
        setIntField(term159353, term159353.getClass(), "trophyId", -656718439);
        setIntField(term159353, term159353.getClass(), "playedTutorialBit", 1609229129);
        setIntField(term159353, term159353.getClass(), "firstTutorialCancelNum", 558262249);
        setIntField(term159353, term159353.getClass(), "masterTutorialCancelNum", 105201149);
        setIntField(term159353, term159353.getClass(), "totalRepertoireCount", 848802875);
        setIntField(term159353, term159353.getClass(), "totalMapNum", 103720158);
        setLongField(term159353, term159353.getClass(), "totalHiScore", -6799873058539741971L);
        setLongField(term159353, term159353.getClass(), "totalBasicHighScore", -3154740942935891531L);
        setLongField(term159353, term159353.getClass(), "totalAdvancedHighScore", 531850285907925304L);
        setLongField(term159353, term159353.getClass(), "totalExpertHighScore", -189236760210129272L);
        setLongField(term159353, term159353.getClass(), "totalMasterHighScore", 6932423689998612298L);
        setIntField(term159465, term159465.getClass(), "year", 2016);
        setShortField(term159465, term159465.getClass(), "month", (short) 4);
        setShortField(term159465, term159465.getClass(), "day", (short) 22);
        setField(term159464, term159464.getClass(), "date", term159465);
        setByteField(term159469, term159469.getClass(), "hour", (byte) 18);
        setByteField(term159469, term159469.getClass(), "minute", (byte) 15);
        setByteField(term159469, term159469.getClass(), "second", (byte) 47);
        setIntField(term159469, term159469.getClass(), "nano", 274665218);
        setField(term159464, term159464.getClass(), "time", term159469);
        setField(term159353, term159353.getClass(), "eventWatchedDate", term159464);
        setIntField(term159353, term159353.getClass(), "friendCount", 1049168594);
        setBooleanField(term159353, term159353.getClass(), "isMaimai", false);
        setField(term159353, term159353.getClass(), "firstGameId", "xUCRGyGVPj");
        setField(term159353, term159353.getClass(), "firstRomVersion", "mODhKHNihX");
        setField(term159353, term159353.getClass(), "firstDataVersion", "JuAcOfOxNL");
        setIntField(term159513, term159513.getClass(), "year", 2019);
        setShortField(term159513, term159513.getClass(), "month", (short) 9);
        setShortField(term159513, term159513.getClass(), "day", (short) 9);
        setField(term159512, term159512.getClass(), "date", term159513);
        setByteField(term159517, term159517.getClass(), "hour", (byte) 12);
        setByteField(term159517, term159517.getClass(), "minute", (byte) 18);
        setByteField(term159517, term159517.getClass(), "second", (byte) 25);
        setIntField(term159517, term159517.getClass(), "nano", 849446569);
        setField(term159512, term159512.getClass(), "time", term159517);
        setField(term159353, term159353.getClass(), "firstPlayDate", term159512);
        setField(term159353, term159353.getClass(), "lastGameId", "XaqYbQZIGI");
        setField(term159353, term159353.getClass(), "lastRomVersion", "grTooFWhNl");
        setField(term159353, term159353.getClass(), "lastDataVersion", "ndJgNFVDzv");
        setIntField(term159559, term159559.getClass(), "year", 2011);
        setShortField(term159559, term159559.getClass(), "month", (short) 8);
        setShortField(term159559, term159559.getClass(), "day", (short) 7);
        setField(term159558, term159558.getClass(), "date", term159559);
        setByteField(term159563, term159563.getClass(), "hour", (byte) 5);
        setByteField(term159563, term159563.getClass(), "minute", (byte) 35);
        setByteField(term159563, term159563.getClass(), "second", (byte) 41);
        setIntField(term159563, term159563.getClass(), "nano", 631567277);
        setField(term159558, term159558.getClass(), "time", term159563);
        setField(term159353, term159353.getClass(), "lastPlayDate", term159558);
        setIntField(term159353, term159353.getClass(), "lastPlaceId", 1078375453);
        setField(term159353, term159353.getClass(), "lastPlaceName", "GLSpCLEiGN");
        setField(term159353, term159353.getClass(), "lastRegionId", "JiekpKxKqu");
        setField(term159353, term159353.getClass(), "lastRegionName", "fZAngeuZqR");
        setField(term159353, term159353.getClass(), "lastAllNetId", "zlkNfxvlVJ");
        setField(term159353, term159353.getClass(), "lastClientId", "RWefwvwipX");
        term159629 = new Integer(687029252);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term159629;
        callMethod(klass, "setFrameId", argTypes, term159353, args);
    }

};


