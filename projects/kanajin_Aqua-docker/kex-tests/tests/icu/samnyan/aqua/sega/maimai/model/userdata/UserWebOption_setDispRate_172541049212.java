package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserWebOption_setDispRate_172541049212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40785;
     Object term40967;

    public UserWebOption_setDispRate_172541049212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term40791 = new Long(-1616722610139554082L);
        term40785 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term40787 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term40789 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term40805 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40806 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40810 = newInstance(Class.forName("java.time.LocalTime"));
        Object term40815 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term40816 = newInstance(Class.forName("java.time.LocalDate"));
        Object term40820 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term40785, term40785.getClass(), "id", 4689907154423223972L);
        setLongField(term40787, term40787.getClass(), "id", 8512025621149521819L);
        setLongField(term40789, term40789.getClass(), "id", 2022482096970820459L);
        setField(term40789, term40789.getClass(), "extId", term40791);
        setField(term40789, term40789.getClass(), "luid", "MzXzaqaiHW");
        setIntField(term40806, term40806.getClass(), "year", 2022);
        setShortField(term40806, term40806.getClass(), "month", (short) 8);
        setShortField(term40806, term40806.getClass(), "day", (short) 16);
        setField(term40805, term40805.getClass(), "date", term40806);
        setByteField(term40810, term40810.getClass(), "hour", (byte) 4);
        setByteField(term40810, term40810.getClass(), "minute", (byte) 38);
        setByteField(term40810, term40810.getClass(), "second", (byte) 51);
        setIntField(term40810, term40810.getClass(), "nano", 348952212);
        setField(term40805, term40805.getClass(), "time", term40810);
        setField(term40789, term40789.getClass(), "registerTime", term40805);
        setIntField(term40816, term40816.getClass(), "year", 2016);
        setShortField(term40816, term40816.getClass(), "month", (short) 7);
        setShortField(term40816, term40816.getClass(), "day", (short) 21);
        setField(term40815, term40815.getClass(), "date", term40816);
        setByteField(term40820, term40820.getClass(), "hour", (byte) 22);
        setByteField(term40820, term40820.getClass(), "minute", (byte) 2);
        setByteField(term40820, term40820.getClass(), "second", (byte) 21);
        setIntField(term40820, term40820.getClass(), "nano", 729266668);
        setField(term40815, term40815.getClass(), "time", term40820);
        setField(term40789, term40789.getClass(), "accessTime", term40815);
        setField(term40787, term40787.getClass(), "card", term40789);
        setIntField(term40787, term40787.getClass(), "lastDataVersion", -1562955063);
        setField(term40787, term40787.getClass(), "userName", "jWOWtrhVkA");
        setIntField(term40787, term40787.getClass(), "point", -1549644922);
        setIntField(term40787, term40787.getClass(), "totalPoint", 1217352889);
        setIntField(term40787, term40787.getClass(), "iconId", 159996093);
        setIntField(term40787, term40787.getClass(), "nameplateId", 1937937383);
        setIntField(term40787, term40787.getClass(), "frameId", -639813848);
        setIntField(term40787, term40787.getClass(), "trophyId", 1894367611);
        setIntField(term40787, term40787.getClass(), "playCount", 2121003177);
        setIntField(term40787, term40787.getClass(), "playVsCount", 1093708386);
        setIntField(term40787, term40787.getClass(), "playSyncCount", 1609837057);
        setIntField(term40787, term40787.getClass(), "winCount", 895453282);
        setIntField(term40787, term40787.getClass(), "helpCount", -1488970453);
        setIntField(term40787, term40787.getClass(), "comboCount", -289323354);
        setIntField(term40787, term40787.getClass(), "feverCount", 1649025249);
        setIntField(term40787, term40787.getClass(), "totalHiScore", -937498214);
        setIntField(term40787, term40787.getClass(), "totalEasyHighScore", 1605317373);
        setIntField(term40787, term40787.getClass(), "totalBasicHighScore", 904392784);
        setIntField(term40787, term40787.getClass(), "totalAdvancedHighScore", -165829430);
        setIntField(term40787, term40787.getClass(), "totalExpertHighScore", -206826041);
        setIntField(term40787, term40787.getClass(), "totalMasterHighScore", -866061427);
        setIntField(term40787, term40787.getClass(), "totalReMasterHighScore", 1628734156);
        setIntField(term40787, term40787.getClass(), "totalHighSync", -578890556);
        setIntField(term40787, term40787.getClass(), "totalEasySync", 2129122634);
        setIntField(term40787, term40787.getClass(), "totalBasicSync", 382196976);
        setIntField(term40787, term40787.getClass(), "totalAdvancedSync", 506884160);
        setIntField(term40787, term40787.getClass(), "totalExpertSync", 347846893);
        setIntField(term40787, term40787.getClass(), "totalMasterSync", -1522343998);
        setIntField(term40787, term40787.getClass(), "totalReMasterSync", -514980586);
        setIntField(term40787, term40787.getClass(), "playerRating", 1857474216);
        setIntField(term40787, term40787.getClass(), "highestRating", -53071149);
        setIntField(term40787, term40787.getClass(), "rankAuthTailId", -2041534507);
        setField(term40787, term40787.getClass(), "eventWatchedDate", "IyOhWYyaDV");
        setField(term40787, term40787.getClass(), "webLimitDate", "omWrkCSFzy");
        setIntField(term40787, term40787.getClass(), "challengeTrackPhase", 2090333247);
        setIntField(term40787, term40787.getClass(), "firstPlayBits", 1612944193);
        setField(term40787, term40787.getClass(), "lastPlayDate", "VFYvUTgYFB");
        setIntField(term40787, term40787.getClass(), "lastPlaceId", 1274552070);
        setField(term40787, term40787.getClass(), "lastPlaceName", "BrWqhEIUUj");
        setIntField(term40787, term40787.getClass(), "lastRegionId", 701800239);
        setField(term40787, term40787.getClass(), "lastRegionName", "WfUmxdiHcU");
        setField(term40787, term40787.getClass(), "lastClientId", "BRrftvRvmF");
        setField(term40787, term40787.getClass(), "lastCountryCode", "fvoyRbZTsm");
        setIntField(term40787, term40787.getClass(), "eventPoint", -1208601938);
        setIntField(term40787, term40787.getClass(), "totalLv", -1949786069);
        setIntField(term40787, term40787.getClass(), "lastLoginBonusDay", -1357939737);
        setIntField(term40787, term40787.getClass(), "lastSurvivalBonusDay", 1032926922);
        setIntField(term40787, term40787.getClass(), "loginBonusLv", -478839397);
        setField(term40785, term40785.getClass(), "user", term40787);
        setBooleanField(term40785, term40785.getClass(), "isNetMember", true);
        setIntField(term40785, term40785.getClass(), "dispRate", -266762167);
        setIntField(term40785, term40785.getClass(), "dispJudgeStyle", -1341806138);
        setIntField(term40785, term40785.getClass(), "dispRank", 684728176);
        setIntField(term40785, term40785.getClass(), "dispHomeRanker", 2089342829);
        setIntField(term40785, term40785.getClass(), "dispTotalLv", 1201220971);
        term40967 = new Integer(-811460564);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term40967;
        callMethod(klass, "setDispRate", argTypes, term40785, args);
    }

};


