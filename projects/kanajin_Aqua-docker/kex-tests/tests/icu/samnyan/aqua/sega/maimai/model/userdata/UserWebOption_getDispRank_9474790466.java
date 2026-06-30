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

public class UserWebOption_getDispRank_9474790466 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38885;

    public UserWebOption_getDispRank_9474790466() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term38891 = new Long(-6432617521836576658L);
        term38885 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption"));
        Object term38887 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term38889 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term38905 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38906 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38910 = newInstance(Class.forName("java.time.LocalTime"));
        Object term38915 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term38916 = newInstance(Class.forName("java.time.LocalDate"));
        Object term38920 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term38885, term38885.getClass(), "id", 3423965054378869855L);
        setLongField(term38887, term38887.getClass(), "id", -593735869267672817L);
        setLongField(term38889, term38889.getClass(), "id", 6041374912351843923L);
        setField(term38889, term38889.getClass(), "extId", term38891);
        setField(term38889, term38889.getClass(), "luid", "BdsLFSRWda");
        setIntField(term38906, term38906.getClass(), "year", 2013);
        setShortField(term38906, term38906.getClass(), "month", (short) 9);
        setShortField(term38906, term38906.getClass(), "day", (short) 27);
        setField(term38905, term38905.getClass(), "date", term38906);
        setByteField(term38910, term38910.getClass(), "hour", (byte) 9);
        setByteField(term38910, term38910.getClass(), "minute", (byte) 30);
        setByteField(term38910, term38910.getClass(), "second", (byte) 6);
        setIntField(term38910, term38910.getClass(), "nano", 647438502);
        setField(term38905, term38905.getClass(), "time", term38910);
        setField(term38889, term38889.getClass(), "registerTime", term38905);
        setIntField(term38916, term38916.getClass(), "year", 2021);
        setShortField(term38916, term38916.getClass(), "month", (short) 10);
        setShortField(term38916, term38916.getClass(), "day", (short) 16);
        setField(term38915, term38915.getClass(), "date", term38916);
        setByteField(term38920, term38920.getClass(), "hour", (byte) 5);
        setByteField(term38920, term38920.getClass(), "minute", (byte) 6);
        setByteField(term38920, term38920.getClass(), "second", (byte) 17);
        setIntField(term38920, term38920.getClass(), "nano", 631786532);
        setField(term38915, term38915.getClass(), "time", term38920);
        setField(term38889, term38889.getClass(), "accessTime", term38915);
        setField(term38887, term38887.getClass(), "card", term38889);
        setIntField(term38887, term38887.getClass(), "lastDataVersion", -1181229958);
        setField(term38887, term38887.getClass(), "userName", "tMhhBYonAI");
        setIntField(term38887, term38887.getClass(), "point", -341744470);
        setIntField(term38887, term38887.getClass(), "totalPoint", -1112768944);
        setIntField(term38887, term38887.getClass(), "iconId", -1300523076);
        setIntField(term38887, term38887.getClass(), "nameplateId", -1136236336);
        setIntField(term38887, term38887.getClass(), "frameId", 935191824);
        setIntField(term38887, term38887.getClass(), "trophyId", 290423749);
        setIntField(term38887, term38887.getClass(), "playCount", -2055991020);
        setIntField(term38887, term38887.getClass(), "playVsCount", 2087954544);
        setIntField(term38887, term38887.getClass(), "playSyncCount", 885858505);
        setIntField(term38887, term38887.getClass(), "winCount", -178058161);
        setIntField(term38887, term38887.getClass(), "helpCount", -1275142809);
        setIntField(term38887, term38887.getClass(), "comboCount", 1175936070);
        setIntField(term38887, term38887.getClass(), "feverCount", -479776378);
        setIntField(term38887, term38887.getClass(), "totalHiScore", 947385214);
        setIntField(term38887, term38887.getClass(), "totalEasyHighScore", -76877870);
        setIntField(term38887, term38887.getClass(), "totalBasicHighScore", 2104799551);
        setIntField(term38887, term38887.getClass(), "totalAdvancedHighScore", 1728341653);
        setIntField(term38887, term38887.getClass(), "totalExpertHighScore", 1063150462);
        setIntField(term38887, term38887.getClass(), "totalMasterHighScore", 1817004190);
        setIntField(term38887, term38887.getClass(), "totalReMasterHighScore", -1901062134);
        setIntField(term38887, term38887.getClass(), "totalHighSync", -1990968496);
        setIntField(term38887, term38887.getClass(), "totalEasySync", -578225035);
        setIntField(term38887, term38887.getClass(), "totalBasicSync", -1437822250);
        setIntField(term38887, term38887.getClass(), "totalAdvancedSync", -1551608541);
        setIntField(term38887, term38887.getClass(), "totalExpertSync", 6865110);
        setIntField(term38887, term38887.getClass(), "totalMasterSync", -1066365393);
        setIntField(term38887, term38887.getClass(), "totalReMasterSync", -1718581479);
        setIntField(term38887, term38887.getClass(), "playerRating", -2115367668);
        setIntField(term38887, term38887.getClass(), "highestRating", 180514557);
        setIntField(term38887, term38887.getClass(), "rankAuthTailId", -1220065283);
        setField(term38887, term38887.getClass(), "eventWatchedDate", "AaQRshwIQC");
        setField(term38887, term38887.getClass(), "webLimitDate", "rHgKCfgCsg");
        setIntField(term38887, term38887.getClass(), "challengeTrackPhase", -1052497999);
        setIntField(term38887, term38887.getClass(), "firstPlayBits", 972378333);
        setField(term38887, term38887.getClass(), "lastPlayDate", "AWtIUOuutt");
        setIntField(term38887, term38887.getClass(), "lastPlaceId", -2070703994);
        setField(term38887, term38887.getClass(), "lastPlaceName", "jBgJZpHifl");
        setIntField(term38887, term38887.getClass(), "lastRegionId", 735347417);
        setField(term38887, term38887.getClass(), "lastRegionName", "azMTTmEXnh");
        setField(term38887, term38887.getClass(), "lastClientId", "BjJtxwsIpt");
        setField(term38887, term38887.getClass(), "lastCountryCode", "gUQhOyGfzF");
        setIntField(term38887, term38887.getClass(), "eventPoint", -906548765);
        setIntField(term38887, term38887.getClass(), "totalLv", 1801514751);
        setIntField(term38887, term38887.getClass(), "lastLoginBonusDay", 458342034);
        setIntField(term38887, term38887.getClass(), "lastSurvivalBonusDay", 859867598);
        setIntField(term38887, term38887.getClass(), "loginBonusLv", 781983880);
        setField(term38885, term38885.getClass(), "user", term38887);
        setBooleanField(term38885, term38885.getClass(), "isNetMember", true);
        setIntField(term38885, term38885.getClass(), "dispRate", -1804104652);
        setIntField(term38885, term38885.getClass(), "dispJudgeStyle", -618717355);
        setIntField(term38885, term38885.getClass(), "dispRank", 942277782);
        setIntField(term38885, term38885.getClass(), "dispHomeRanker", 1822833628);
        setIntField(term38885, term38885.getClass(), "dispTotalLv", -125384487);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserWebOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispRank", argTypes, term38885, args);
    }

};


