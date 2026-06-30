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

public class UserWebOption_setDispHomeRanker_26229413215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41607;
     Object term41789;

    public UserWebOption_setDispHomeRanker_26229413215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term41613 = new Long(4513004407927379358L);
        term41607 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term41609 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term41611 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term41627 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41628 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41632 = newInstance(Class.forName("java.time.LocalTime"));
        Object term41637 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41638 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41642 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term41607, term41607.getClass(), "id", -6521561238735301071L);
        setLongField(term41609, term41609.getClass(), "id", -6609679920238945303L);
        setLongField(term41611, term41611.getClass(), "id", -7296330380944173376L);
        setField(term41611, term41611.getClass(), "extId", term41613);
        setField(term41611, term41611.getClass(), "luid", "FbBMtntDbw");
        setIntField(term41628, term41628.getClass(), "year", 2015);
        setShortField(term41628, term41628.getClass(), "month", (short) 1);
        setShortField(term41628, term41628.getClass(), "day", (short) 7);
        setField(term41627, term41627.getClass(), "date", term41628);
        setByteField(term41632, term41632.getClass(), "hour", (byte) 10);
        setByteField(term41632, term41632.getClass(), "minute", (byte) 8);
        setByteField(term41632, term41632.getClass(), "second", (byte) 31);
        setIntField(term41632, term41632.getClass(), "nano", 617142943);
        setField(term41627, term41627.getClass(), "time", term41632);
        setField(term41611, term41611.getClass(), "registerTime", term41627);
        setIntField(term41638, term41638.getClass(), "year", 2024);
        setShortField(term41638, term41638.getClass(), "month", (short) 2);
        setShortField(term41638, term41638.getClass(), "day", (short) 2);
        setField(term41637, term41637.getClass(), "date", term41638);
        setByteField(term41642, term41642.getClass(), "hour", (byte) 5);
        setByteField(term41642, term41642.getClass(), "minute", (byte) 8);
        setByteField(term41642, term41642.getClass(), "second", (byte) 10);
        setIntField(term41642, term41642.getClass(), "nano", 897554578);
        setField(term41637, term41637.getClass(), "time", term41642);
        setField(term41611, term41611.getClass(), "accessTime", term41637);
        setField(term41609, term41609.getClass(), "card", term41611);
        setIntField(term41609, term41609.getClass(), "lastDataVersion", -271936794);
        setField(term41609, term41609.getClass(), "userName", "zRnpRGaHlI");
        setIntField(term41609, term41609.getClass(), "point", -732944429);
        setIntField(term41609, term41609.getClass(), "totalPoint", 1929605024);
        setIntField(term41609, term41609.getClass(), "iconId", 1011940597);
        setIntField(term41609, term41609.getClass(), "nameplateId", -404969989);
        setIntField(term41609, term41609.getClass(), "frameId", 1371124822);
        setIntField(term41609, term41609.getClass(), "trophyId", 1936895143);
        setIntField(term41609, term41609.getClass(), "playCount", 1980832536);
        setIntField(term41609, term41609.getClass(), "playVsCount", 1221783561);
        setIntField(term41609, term41609.getClass(), "playSyncCount", 1025766530);
        setIntField(term41609, term41609.getClass(), "winCount", 1023561050);
        setIntField(term41609, term41609.getClass(), "helpCount", -661014919);
        setIntField(term41609, term41609.getClass(), "comboCount", 1431348538);
        setIntField(term41609, term41609.getClass(), "feverCount", -352388461);
        setIntField(term41609, term41609.getClass(), "totalHiScore", -476722971);
        setIntField(term41609, term41609.getClass(), "totalEasyHighScore", -1727779935);
        setIntField(term41609, term41609.getClass(), "totalBasicHighScore", 621731188);
        setIntField(term41609, term41609.getClass(), "totalAdvancedHighScore", 23497506);
        setIntField(term41609, term41609.getClass(), "totalExpertHighScore", 1359512268);
        setIntField(term41609, term41609.getClass(), "totalMasterHighScore", 738561796);
        setIntField(term41609, term41609.getClass(), "totalReMasterHighScore", 1485449254);
        setIntField(term41609, term41609.getClass(), "totalHighSync", 477896598);
        setIntField(term41609, term41609.getClass(), "totalEasySync", -123400618);
        setIntField(term41609, term41609.getClass(), "totalBasicSync", -1368246630);
        setIntField(term41609, term41609.getClass(), "totalAdvancedSync", -217114557);
        setIntField(term41609, term41609.getClass(), "totalExpertSync", 2000296922);
        setIntField(term41609, term41609.getClass(), "totalMasterSync", 356697128);
        setIntField(term41609, term41609.getClass(), "totalReMasterSync", 393726126);
        setIntField(term41609, term41609.getClass(), "playerRating", 1781861518);
        setIntField(term41609, term41609.getClass(), "highestRating", 1767385935);
        setIntField(term41609, term41609.getClass(), "rankAuthTailId", -1208709585);
        setField(term41609, term41609.getClass(), "eventWatchedDate", "dVHfxjbMRK");
        setField(term41609, term41609.getClass(), "webLimitDate", "LzwyLxKJpw");
        setIntField(term41609, term41609.getClass(), "challengeTrackPhase", 845734901);
        setIntField(term41609, term41609.getClass(), "firstPlayBits", 1158068248);
        setField(term41609, term41609.getClass(), "lastPlayDate", "ZhWJlplAVK");
        setIntField(term41609, term41609.getClass(), "lastPlaceId", -404489980);
        setField(term41609, term41609.getClass(), "lastPlaceName", "pnmjTuTojv");
        setIntField(term41609, term41609.getClass(), "lastRegionId", -1501688381);
        setField(term41609, term41609.getClass(), "lastRegionName", "eMtshhmGEm");
        setField(term41609, term41609.getClass(), "lastClientId", "VJUbzHGOvg");
        setField(term41609, term41609.getClass(), "lastCountryCode", "SiwcigIrfD");
        setIntField(term41609, term41609.getClass(), "eventPoint", -132991775);
        setIntField(term41609, term41609.getClass(), "totalLv", -1962135802);
        setIntField(term41609, term41609.getClass(), "lastLoginBonusDay", -1867466972);
        setIntField(term41609, term41609.getClass(), "lastSurvivalBonusDay", -462258168);
        setIntField(term41609, term41609.getClass(), "loginBonusLv", -163181513);
        setField(term41607, term41607.getClass(), "user", term41609);
        setBooleanField(term41607, term41607.getClass(), "isNetMember", true);
        setIntField(term41607, term41607.getClass(), "dispRate", 744651672);
        setIntField(term41607, term41607.getClass(), "dispJudgeStyle", 66267567);
        setIntField(term41607, term41607.getClass(), "dispRank", 36897944);
        setIntField(term41607, term41607.getClass(), "dispHomeRanker", -1128084769);
        setIntField(term41607, term41607.getClass(), "dispTotalLv", 608763750);
        term41789 = new Integer(1116153965);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term41789;
        callMethod(klass, "setDispHomeRanker", argTypes, term41607, args);
    }

};


