package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserUdemae_getClassValue_5281517255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97234;

    public UserUdemae_getClassValue_5281517255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term97240 = new Long(3452833434644634217L);
        Integer term97303 = new Integer(-1550025613);
        Integer term97305 = new Integer(814617314);
        Integer term97307 = new Integer(-159489307);
        Integer term97309 = new Integer(1317020952);
        Integer term97311 = new Integer(-742710703);
        Integer term97313 = new Integer(-355505521);
        ArrayList term97301 = new ArrayList();
        ((ArrayList) term97301).add(term97303);
        ((ArrayList) term97301).add(term97305);
        ((ArrayList) term97301).add(term97307);
        ((ArrayList) term97301).add(term97309);
        ((ArrayList) term97301).add(term97311);
        ((ArrayList) term97301).add(term97313);
        Integer term97319 = new Integer(1227316523);
        Integer term97321 = new Integer(-58633039);
        Integer term97323 = new Integer(448061908);
        Integer term97325 = new Integer(-1268483887);
        Integer term97327 = new Integer(-1929689681);
        Integer term97329 = new Integer(-91240911);
        Integer term97331 = new Integer(-321227954);
        Integer term97333 = new Integer(373810833);
        ArrayList term97317 = new ArrayList();
        ((ArrayList) term97317).add(term97319);
        ((ArrayList) term97317).add(term97321);
        ((ArrayList) term97317).add(term97323);
        ((ArrayList) term97317).add(term97325);
        ((ArrayList) term97317).add(term97327);
        ((ArrayList) term97317).add(term97329);
        ((ArrayList) term97317).add(term97331);
        ((ArrayList) term97317).add(term97333);
        term97234 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae"));
        Object term97236 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term97238 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term97254 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97255 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97259 = newInstance(Class.forName("java.time.LocalTime"));
        Object term97264 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term97265 = newInstance(Class.forName("java.time.LocalDate"));
        Object term97269 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term97234, term97234.getClass(), "id", -3843490164753656521L);
        setLongField(term97236, term97236.getClass(), "id", -284029314740948763L);
        setLongField(term97238, term97238.getClass(), "id", 4860332338697838407L);
        setField(term97238, term97238.getClass(), "extId", term97240);
        setField(term97238, term97238.getClass(), "luid", "rMzkpEMgIm");
        setIntField(term97255, term97255.getClass(), "year", 2025);
        setShortField(term97255, term97255.getClass(), "month", (short) 4);
        setShortField(term97255, term97255.getClass(), "day", (short) 6);
        setField(term97254, term97254.getClass(), "date", term97255);
        setByteField(term97259, term97259.getClass(), "hour", (byte) 23);
        setByteField(term97259, term97259.getClass(), "minute", (byte) 17);
        setByteField(term97259, term97259.getClass(), "second", (byte) 11);
        setIntField(term97259, term97259.getClass(), "nano", 928165672);
        setField(term97254, term97254.getClass(), "time", term97259);
        setField(term97238, term97238.getClass(), "registerTime", term97254);
        setIntField(term97265, term97265.getClass(), "year", 2022);
        setShortField(term97265, term97265.getClass(), "month", (short) 3);
        setShortField(term97265, term97265.getClass(), "day", (short) 20);
        setField(term97264, term97264.getClass(), "date", term97265);
        setByteField(term97269, term97269.getClass(), "hour", (byte) 20);
        setByteField(term97269, term97269.getClass(), "minute", (byte) 31);
        setByteField(term97269, term97269.getClass(), "second", (byte) 56);
        setIntField(term97269, term97269.getClass(), "nano", 682853702);
        setField(term97264, term97264.getClass(), "time", term97269);
        setField(term97238, term97238.getClass(), "accessTime", term97264);
        setField(term97236, term97236.getClass(), "card", term97238);
        setField(term97236, term97236.getClass(), "userName", "pNGFuoPYQr");
        setIntField(term97236, term97236.getClass(), "isNetMember", -1987739959);
        setIntField(term97236, term97236.getClass(), "iconId", -1921996045);
        setIntField(term97236, term97236.getClass(), "plateId", 1689248062);
        setIntField(term97236, term97236.getClass(), "titleId", -155559246);
        setIntField(term97236, term97236.getClass(), "partnerId", -2121439077);
        setIntField(term97236, term97236.getClass(), "frameId", 1640516155);
        setIntField(term97236, term97236.getClass(), "selectMapId", 338143917);
        setIntField(term97236, term97236.getClass(), "totalAwake", 392977323);
        setIntField(term97236, term97236.getClass(), "gradeRating", -794722040);
        setIntField(term97236, term97236.getClass(), "musicRating", 464722569);
        setIntField(term97236, term97236.getClass(), "playerRating", -12715882);
        setIntField(term97236, term97236.getClass(), "highestRating", -1629082667);
        setIntField(term97236, term97236.getClass(), "gradeRank", 1938805252);
        setIntField(term97236, term97236.getClass(), "classRank", 892926651);
        setIntField(term97236, term97236.getClass(), "courseRank", 324394779);
        setField(term97236, term97236.getClass(), "charaSlot", term97301);
        setField(term97236, term97236.getClass(), "charaLockSlot", term97317);
        setLongField(term97236, term97236.getClass(), "contentBit", 7957736606041323894L);
        setIntField(term97236, term97236.getClass(), "playCount", 1334207398);
        setField(term97236, term97236.getClass(), "eventWatchedDate", "kCjOAdClxu");
        setField(term97236, term97236.getClass(), "lastGameId", "UqDmRiivsD");
        setField(term97236, term97236.getClass(), "lastRomVersion", "lbuoMbJEmY");
        setField(term97236, term97236.getClass(), "lastDataVersion", "mlYqXpLxYN");
        setField(term97236, term97236.getClass(), "lastLoginDate", "NUmCDjLJOd");
        setField(term97236, term97236.getClass(), "lastPlayDate", "miAgzoWkiV");
        setIntField(term97236, term97236.getClass(), "lastPlayCredit", 1899917071);
        setIntField(term97236, term97236.getClass(), "lastPlayMode", 2010556609);
        setIntField(term97236, term97236.getClass(), "lastPlaceId", -328864713);
        setField(term97236, term97236.getClass(), "lastPlaceName", "teJJZHDWWb");
        setIntField(term97236, term97236.getClass(), "lastAllNetId", -624310741);
        setIntField(term97236, term97236.getClass(), "lastRegionId", -336930851);
        setField(term97236, term97236.getClass(), "lastRegionName", "QDGurdhyNf");
        setField(term97236, term97236.getClass(), "lastClientId", "FnxmVYYBUu");
        setField(term97236, term97236.getClass(), "lastCountryCode", "FcaMVDYJay");
        setIntField(term97236, term97236.getClass(), "lastSelectEMoney", 1850349935);
        setIntField(term97236, term97236.getClass(), "lastSelectTicket", -1353579264);
        setIntField(term97236, term97236.getClass(), "lastSelectCourse", -1995862281);
        setIntField(term97236, term97236.getClass(), "lastCountCourse", -64331464);
        setField(term97236, term97236.getClass(), "firstGameId", "pLLUuhaofY");
        setField(term97236, term97236.getClass(), "firstRomVersion", "dCIHiLfkJL");
        setField(term97236, term97236.getClass(), "firstDataVersion", "bMYsCPikwh");
        setField(term97236, term97236.getClass(), "firstPlayDate", "hZENcMRjJX");
        setField(term97236, term97236.getClass(), "compatibleCmVersion", "iUsNqPEgsp");
        setField(term97236, term97236.getClass(), "dailyBonusDate", "ODyqlitqRS");
        setField(term97236, term97236.getClass(), "dailyCourseBonusDate", "BKEyXkrXND");
        setField(term97236, term97236.getClass(), "lastPairLoginDate", "xpmkTXUaIW");
        setField(term97236, term97236.getClass(), "lastTrialPlayDate", "mkwXyNcVfj");
        setIntField(term97236, term97236.getClass(), "playVsCount", 1814821269);
        setIntField(term97236, term97236.getClass(), "playSyncCount", -2035330261);
        setIntField(term97236, term97236.getClass(), "winCount", -839111848);
        setIntField(term97236, term97236.getClass(), "helpCount", 1712179237);
        setIntField(term97236, term97236.getClass(), "comboCount", -2122863540);
        setLongField(term97236, term97236.getClass(), "totalDeluxscore", -774227429807654813L);
        setLongField(term97236, term97236.getClass(), "totalBasicDeluxscore", -5319860952452203184L);
        setLongField(term97236, term97236.getClass(), "totalAdvancedDeluxscore", -6281514459098412431L);
        setLongField(term97236, term97236.getClass(), "totalExpertDeluxscore", 5567722699288031168L);
        setLongField(term97236, term97236.getClass(), "totalMasterDeluxscore", 1180545199518658689L);
        setLongField(term97236, term97236.getClass(), "totalReMasterDeluxscore", 2030253959753351191L);
        setIntField(term97236, term97236.getClass(), "totalSync", -811923755);
        setIntField(term97236, term97236.getClass(), "totalBasicSync", -353643828);
        setIntField(term97236, term97236.getClass(), "totalAdvancedSync", -632794298);
        setIntField(term97236, term97236.getClass(), "totalExpertSync", -530294126);
        setIntField(term97236, term97236.getClass(), "totalMasterSync", 798290048);
        setIntField(term97236, term97236.getClass(), "totalReMasterSync", 383365811);
        setLongField(term97236, term97236.getClass(), "totalAchievement", 6362772764317235471L);
        setLongField(term97236, term97236.getClass(), "totalBasicAchievement", 1215709099559006092L);
        setLongField(term97236, term97236.getClass(), "totalAdvancedAchievement", -172822749745985404L);
        setLongField(term97236, term97236.getClass(), "totalExpertAchievement", -2843381080508194463L);
        setLongField(term97236, term97236.getClass(), "totalMasterAchievement", 3880291114635681794L);
        setLongField(term97236, term97236.getClass(), "totalReMasterAchievement", 5004839268187097411L);
        setLongField(term97236, term97236.getClass(), "playerOldRating", -6710070540839416735L);
        setLongField(term97236, term97236.getClass(), "playerNewRating", -8433345414293758986L);
        setIntField(term97236, term97236.getClass(), "banState", 140322430);
        setLongField(term97236, term97236.getClass(), "dateTime", 1110155966563942771L);
        setField(term97234, term97234.getClass(), "user", term97236);
        setIntField(term97234, term97234.getClass(), "rate", -1492719591);
        setIntField(term97234, term97234.getClass(), "maxRate", 2077964123);
        setIntField(term97234, term97234.getClass(), "classValue", 1694212421);
        setIntField(term97234, term97234.getClass(), "maxClassValue", 1104915674);
        setIntField(term97234, term97234.getClass(), "totalWinNum", -44179109);
        setIntField(term97234, term97234.getClass(), "totalLoseNum", 248819653);
        setIntField(term97234, term97234.getClass(), "maxWinNum", -429028411);
        setIntField(term97234, term97234.getClass(), "maxLoseNum", -337757010);
        setIntField(term97234, term97234.getClass(), "winNum", -1192904975);
        setIntField(term97234, term97234.getClass(), "loseNum", 619419155);
        setIntField(term97234, term97234.getClass(), "npcTotalWinNum", -607185930);
        setIntField(term97234, term97234.getClass(), "npcTotalLoseNum", -108242433);
        setIntField(term97234, term97234.getClass(), "npcMaxWinNum", 2045041189);
        setIntField(term97234, term97234.getClass(), "npcMaxLoseNum", 1746055569);
        setIntField(term97234, term97234.getClass(), "npcWinNum", 2048463054);
        setIntField(term97234, term97234.getClass(), "npcLoseNum", 1251228448);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserUdemae");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getClassValue", argTypes, term97234, args);
    }

};


