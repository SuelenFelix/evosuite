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

public class UserWebOption_setDispTotalLv_175286816216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41881;
     Object term42063;

    public UserWebOption_setDispTotalLv_175286816216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term41887 = new Long(-7115418542247301000L);
        term41881 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term41883 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term41885 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term41901 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41902 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41906 = newInstance(Class.forName("java.time.LocalTime"));
        Object term41911 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41912 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41916 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term41881, term41881.getClass(), "id", -8890284990655172580L);
        setLongField(term41883, term41883.getClass(), "id", -5951743062322506095L);
        setLongField(term41885, term41885.getClass(), "id", 768144790810175653L);
        setField(term41885, term41885.getClass(), "extId", term41887);
        setField(term41885, term41885.getClass(), "luid", "MFIdGVLoDo");
        setIntField(term41902, term41902.getClass(), "year", 2016);
        setShortField(term41902, term41902.getClass(), "month", (short) 1);
        setShortField(term41902, term41902.getClass(), "day", (short) 24);
        setField(term41901, term41901.getClass(), "date", term41902);
        setByteField(term41906, term41906.getClass(), "hour", (byte) 23);
        setByteField(term41906, term41906.getClass(), "minute", (byte) 15);
        setByteField(term41906, term41906.getClass(), "second", (byte) 43);
        setIntField(term41906, term41906.getClass(), "nano", 860277753);
        setField(term41901, term41901.getClass(), "time", term41906);
        setField(term41885, term41885.getClass(), "registerTime", term41901);
        setIntField(term41912, term41912.getClass(), "year", 2016);
        setShortField(term41912, term41912.getClass(), "month", (short) 2);
        setShortField(term41912, term41912.getClass(), "day", (short) 2);
        setField(term41911, term41911.getClass(), "date", term41912);
        setByteField(term41916, term41916.getClass(), "hour", (byte) 16);
        setByteField(term41916, term41916.getClass(), "minute", (byte) 51);
        setByteField(term41916, term41916.getClass(), "second", (byte) 8);
        setIntField(term41916, term41916.getClass(), "nano", 991355221);
        setField(term41911, term41911.getClass(), "time", term41916);
        setField(term41885, term41885.getClass(), "accessTime", term41911);
        setField(term41883, term41883.getClass(), "card", term41885);
        setIntField(term41883, term41883.getClass(), "lastDataVersion", 406334046);
        setField(term41883, term41883.getClass(), "userName", "kbxgTcnXyU");
        setIntField(term41883, term41883.getClass(), "point", -1974618374);
        setIntField(term41883, term41883.getClass(), "totalPoint", -1890769685);
        setIntField(term41883, term41883.getClass(), "iconId", 2109131806);
        setIntField(term41883, term41883.getClass(), "nameplateId", -177412412);
        setIntField(term41883, term41883.getClass(), "frameId", -794423751);
        setIntField(term41883, term41883.getClass(), "trophyId", 968959303);
        setIntField(term41883, term41883.getClass(), "playCount", -1104495882);
        setIntField(term41883, term41883.getClass(), "playVsCount", 723475216);
        setIntField(term41883, term41883.getClass(), "playSyncCount", 1267820908);
        setIntField(term41883, term41883.getClass(), "winCount", 1119020608);
        setIntField(term41883, term41883.getClass(), "helpCount", 909002823);
        setIntField(term41883, term41883.getClass(), "comboCount", -1704063989);
        setIntField(term41883, term41883.getClass(), "feverCount", -611728039);
        setIntField(term41883, term41883.getClass(), "totalHiScore", -1889258359);
        setIntField(term41883, term41883.getClass(), "totalEasyHighScore", 518609792);
        setIntField(term41883, term41883.getClass(), "totalBasicHighScore", 744386531);
        setIntField(term41883, term41883.getClass(), "totalAdvancedHighScore", -1325218609);
        setIntField(term41883, term41883.getClass(), "totalExpertHighScore", -1282023865);
        setIntField(term41883, term41883.getClass(), "totalMasterHighScore", 64836181);
        setIntField(term41883, term41883.getClass(), "totalReMasterHighScore", -919341486);
        setIntField(term41883, term41883.getClass(), "totalHighSync", -2030534662);
        setIntField(term41883, term41883.getClass(), "totalEasySync", 671838672);
        setIntField(term41883, term41883.getClass(), "totalBasicSync", 722555455);
        setIntField(term41883, term41883.getClass(), "totalAdvancedSync", 862777086);
        setIntField(term41883, term41883.getClass(), "totalExpertSync", 868971767);
        setIntField(term41883, term41883.getClass(), "totalMasterSync", -1295670091);
        setIntField(term41883, term41883.getClass(), "totalReMasterSync", -567427801);
        setIntField(term41883, term41883.getClass(), "playerRating", -2126712285);
        setIntField(term41883, term41883.getClass(), "highestRating", 194145706);
        setIntField(term41883, term41883.getClass(), "rankAuthTailId", -1882347774);
        setField(term41883, term41883.getClass(), "eventWatchedDate", "lnJvDbbuwo");
        setField(term41883, term41883.getClass(), "webLimitDate", "KExnWkKGvF");
        setIntField(term41883, term41883.getClass(), "challengeTrackPhase", 814595421);
        setIntField(term41883, term41883.getClass(), "firstPlayBits", -760041618);
        setField(term41883, term41883.getClass(), "lastPlayDate", "luGUNfvmKk");
        setIntField(term41883, term41883.getClass(), "lastPlaceId", -666603825);
        setField(term41883, term41883.getClass(), "lastPlaceName", "oOUHomyJff");
        setIntField(term41883, term41883.getClass(), "lastRegionId", -2041846076);
        setField(term41883, term41883.getClass(), "lastRegionName", "KnnoLMOuur");
        setField(term41883, term41883.getClass(), "lastClientId", "buRpVghIvt");
        setField(term41883, term41883.getClass(), "lastCountryCode", "oTGxFdiaIW");
        setIntField(term41883, term41883.getClass(), "eventPoint", 591994062);
        setIntField(term41883, term41883.getClass(), "totalLv", -47102164);
        setIntField(term41883, term41883.getClass(), "lastLoginBonusDay", 1202324559);
        setIntField(term41883, term41883.getClass(), "lastSurvivalBonusDay", -1203173430);
        setIntField(term41883, term41883.getClass(), "loginBonusLv", -643310730);
        setField(term41881, term41881.getClass(), "user", term41883);
        setBooleanField(term41881, term41881.getClass(), "isNetMember", true);
        setIntField(term41881, term41881.getClass(), "dispRate", 79925667);
        setIntField(term41881, term41881.getClass(), "dispJudgeStyle", -299467052);
        setIntField(term41881, term41881.getClass(), "dispRank", -1138748496);
        setIntField(term41881, term41881.getClass(), "dispHomeRanker", -1047250669);
        setIntField(term41881, term41881.getClass(), "dispTotalLv", -749602624);
        term42063 = new Integer(-2057374049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term42063;
        callMethod(klass, "setDispTotalLv", argTypes, term41881, args);
    }

};


