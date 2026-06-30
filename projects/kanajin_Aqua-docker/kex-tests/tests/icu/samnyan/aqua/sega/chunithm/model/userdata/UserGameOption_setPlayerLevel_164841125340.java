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

public class UserGameOption_setPlayerLevel_164841125340 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67175;
     Object term67475;

    public UserGameOption_setPlayerLevel_164841125340() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term67181 = new Long(5671808784468963649L);
        term67175 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption"));
        Object term67177 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term67179 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term67195 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67196 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67200 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67205 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67206 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67210 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67227 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67228 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67232 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67288 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67289 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67293 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67336 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67337 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67341 = newInstance(Class.forName("java.time.LocalTime"));
        Object term67382 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term67383 = newInstance(Class.forName("java.time.LocalDate"));
        Object term67387 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term67175, term67175.getClass(), "id", -6245769757887186092L);
        setLongField(term67177, term67177.getClass(), "id", -180231083568368234L);
        setLongField(term67179, term67179.getClass(), "id", -1658464487289836175L);
        setField(term67179, term67179.getClass(), "extId", term67181);
        setField(term67179, term67179.getClass(), "luid", "qociGUMzem");
        setIntField(term67196, term67196.getClass(), "year", 2026);
        setShortField(term67196, term67196.getClass(), "month", (short) 11);
        setShortField(term67196, term67196.getClass(), "day", (short) 25);
        setField(term67195, term67195.getClass(), "date", term67196);
        setByteField(term67200, term67200.getClass(), "hour", (byte) 12);
        setByteField(term67200, term67200.getClass(), "minute", (byte) 39);
        setByteField(term67200, term67200.getClass(), "second", (byte) 8);
        setIntField(term67200, term67200.getClass(), "nano", 444272669);
        setField(term67195, term67195.getClass(), "time", term67200);
        setField(term67179, term67179.getClass(), "registerTime", term67195);
        setIntField(term67206, term67206.getClass(), "year", 2023);
        setShortField(term67206, term67206.getClass(), "month", (short) 1);
        setShortField(term67206, term67206.getClass(), "day", (short) 9);
        setField(term67205, term67205.getClass(), "date", term67206);
        setByteField(term67210, term67210.getClass(), "hour", (byte) 5);
        setByteField(term67210, term67210.getClass(), "minute", (byte) 45);
        setByteField(term67210, term67210.getClass(), "second", (byte) 39);
        setIntField(term67210, term67210.getClass(), "nano", 734895244);
        setField(term67205, term67205.getClass(), "time", term67210);
        setField(term67179, term67179.getClass(), "accessTime", term67205);
        setField(term67177, term67177.getClass(), "card", term67179);
        setField(term67177, term67177.getClass(), "userName", "HHAfSjIdNi");
        setIntField(term67228, term67228.getClass(), "year", 2017);
        setShortField(term67228, term67228.getClass(), "month", (short) 2);
        setShortField(term67228, term67228.getClass(), "day", (short) 9);
        setField(term67227, term67227.getClass(), "date", term67228);
        setByteField(term67232, term67232.getClass(), "hour", (byte) 16);
        setByteField(term67232, term67232.getClass(), "minute", (byte) 11);
        setByteField(term67232, term67232.getClass(), "second", (byte) 59);
        setIntField(term67232, term67232.getClass(), "nano", 660290526);
        setField(term67227, term67227.getClass(), "time", term67232);
        setField(term67177, term67177.getClass(), "lastLoginDate", term67227);
        setBooleanField(term67177, term67177.getClass(), "isWebJoin", false);
        setField(term67177, term67177.getClass(), "webLimitDate", "oTqQEKklHi");
        setIntField(term67177, term67177.getClass(), "level", -1391162351);
        setIntField(term67177, term67177.getClass(), "reincarnationNum", 863863650);
        setField(term67177, term67177.getClass(), "exp", "riyKkxMvWm");
        setLongField(term67177, term67177.getClass(), "point", -8555339910220884151L);
        setLongField(term67177, term67177.getClass(), "totalPoint", 8483270362078349289L);
        setIntField(term67177, term67177.getClass(), "playCount", 326665488);
        setIntField(term67177, term67177.getClass(), "multiPlayCount", -556521634);
        setIntField(term67177, term67177.getClass(), "multiWinCount", -904069976);
        setIntField(term67177, term67177.getClass(), "requestResCount", 1492540298);
        setIntField(term67177, term67177.getClass(), "acceptResCount", 751340602);
        setIntField(term67177, term67177.getClass(), "successResCount", 123770182);
        setIntField(term67177, term67177.getClass(), "playerRating", -813178856);
        setIntField(term67177, term67177.getClass(), "highestRating", 1591732055);
        setIntField(term67177, term67177.getClass(), "nameplateId", -1580446775);
        setIntField(term67177, term67177.getClass(), "frameId", -1008507790);
        setIntField(term67177, term67177.getClass(), "characterId", -1382203900);
        setIntField(term67177, term67177.getClass(), "trophyId", -2140997236);
        setIntField(term67177, term67177.getClass(), "playedTutorialBit", -1868254835);
        setIntField(term67177, term67177.getClass(), "firstTutorialCancelNum", -660465161);
        setIntField(term67177, term67177.getClass(), "masterTutorialCancelNum", -967958435);
        setIntField(term67177, term67177.getClass(), "totalRepertoireCount", 791509654);
        setIntField(term67177, term67177.getClass(), "totalMapNum", -1695301446);
        setLongField(term67177, term67177.getClass(), "totalHiScore", -2660365005868686870L);
        setLongField(term67177, term67177.getClass(), "totalBasicHighScore", 79870604313788787L);
        setLongField(term67177, term67177.getClass(), "totalAdvancedHighScore", -5116722010996804482L);
        setLongField(term67177, term67177.getClass(), "totalExpertHighScore", 1713582982697786878L);
        setLongField(term67177, term67177.getClass(), "totalMasterHighScore", -815959191072093025L);
        setIntField(term67289, term67289.getClass(), "year", 2013);
        setShortField(term67289, term67289.getClass(), "month", (short) 8);
        setShortField(term67289, term67289.getClass(), "day", (short) 19);
        setField(term67288, term67288.getClass(), "date", term67289);
        setByteField(term67293, term67293.getClass(), "hour", (byte) 23);
        setByteField(term67293, term67293.getClass(), "minute", (byte) 0);
        setByteField(term67293, term67293.getClass(), "second", (byte) 13);
        setIntField(term67293, term67293.getClass(), "nano", 134992386);
        setField(term67288, term67288.getClass(), "time", term67293);
        setField(term67177, term67177.getClass(), "eventWatchedDate", term67288);
        setIntField(term67177, term67177.getClass(), "friendCount", 579391144);
        setBooleanField(term67177, term67177.getClass(), "isMaimai", true);
        setField(term67177, term67177.getClass(), "firstGameId", "WENnGcBSTd");
        setField(term67177, term67177.getClass(), "firstRomVersion", "juEYcOCxLW");
        setField(term67177, term67177.getClass(), "firstDataVersion", "YsWgGEhEmC");
        setIntField(term67337, term67337.getClass(), "year", 2019);
        setShortField(term67337, term67337.getClass(), "month", (short) 4);
        setShortField(term67337, term67337.getClass(), "day", (short) 21);
        setField(term67336, term67336.getClass(), "date", term67337);
        setByteField(term67341, term67341.getClass(), "hour", (byte) 17);
        setByteField(term67341, term67341.getClass(), "minute", (byte) 1);
        setByteField(term67341, term67341.getClass(), "second", (byte) 1);
        setIntField(term67341, term67341.getClass(), "nano", 802156649);
        setField(term67336, term67336.getClass(), "time", term67341);
        setField(term67177, term67177.getClass(), "firstPlayDate", term67336);
        setField(term67177, term67177.getClass(), "lastGameId", "PBcepqkBBV");
        setField(term67177, term67177.getClass(), "lastRomVersion", "mukHRKZmND");
        setField(term67177, term67177.getClass(), "lastDataVersion", "WVPSokrFPV");
        setIntField(term67383, term67383.getClass(), "year", 2029);
        setShortField(term67383, term67383.getClass(), "month", (short) 8);
        setShortField(term67383, term67383.getClass(), "day", (short) 7);
        setField(term67382, term67382.getClass(), "date", term67383);
        setByteField(term67387, term67387.getClass(), "hour", (byte) 5);
        setByteField(term67387, term67387.getClass(), "minute", (byte) 54);
        setByteField(term67387, term67387.getClass(), "second", (byte) 5);
        setIntField(term67387, term67387.getClass(), "nano", 873009584);
        setField(term67382, term67382.getClass(), "time", term67387);
        setField(term67177, term67177.getClass(), "lastPlayDate", term67382);
        setIntField(term67177, term67177.getClass(), "lastPlaceId", 858488872);
        setField(term67177, term67177.getClass(), "lastPlaceName", "jELmrpQCNf");
        setField(term67177, term67177.getClass(), "lastRegionId", "NkjAcBXmmT");
        setField(term67177, term67177.getClass(), "lastRegionName", "KgtGJGInhu");
        setField(term67177, term67177.getClass(), "lastAllNetId", "mVHDjrsMAV");
        setField(term67177, term67177.getClass(), "lastClientId", "rjWnqcjYuU");
        setField(term67175, term67175.getClass(), "user", term67177);
        setIntField(term67175, term67175.getClass(), "bgInfo", -218279934);
        setIntField(term67175, term67175.getClass(), "fieldColor", -689744296);
        setIntField(term67175, term67175.getClass(), "guideSound", 263038376);
        setIntField(term67175, term67175.getClass(), "soundEffect", -631719292);
        setIntField(term67175, term67175.getClass(), "guideLine", -2119317714);
        setIntField(term67175, term67175.getClass(), "speed", -1867952163);
        setIntField(term67175, term67175.getClass(), "optionSet", -1770219455);
        setIntField(term67175, term67175.getClass(), "matching", -993930773);
        setIntField(term67175, term67175.getClass(), "judgePos", 1436841795);
        setIntField(term67175, term67175.getClass(), "rating", 248838167);
        setIntField(term67175, term67175.getClass(), "judgeJustice", 1957931763);
        setIntField(term67175, term67175.getClass(), "judgeAttack", -845283401);
        setIntField(term67175, term67175.getClass(), "headphone", 1423298146);
        setIntField(term67175, term67175.getClass(), "playerLevel", 168549967);
        setIntField(term67175, term67175.getClass(), "successTap", 1631903694);
        setIntField(term67175, term67175.getClass(), "successExTap", 483088872);
        setIntField(term67175, term67175.getClass(), "successSlideHold", 157859356);
        setIntField(term67175, term67175.getClass(), "successAir", 1788509099);
        setIntField(term67175, term67175.getClass(), "successFlick", -407602685);
        setIntField(term67175, term67175.getClass(), "successSkill", -484929244);
        setIntField(term67175, term67175.getClass(), "successTapTimbre", -1316734168);
        setIntField(term67175, term67175.getClass(), "privacy", 1973373652);
        term67475 = new Integer(1574921912);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term67475;
        callMethod(klass, "setPlayerLevel", argTypes, term67175, args);
    }

};


