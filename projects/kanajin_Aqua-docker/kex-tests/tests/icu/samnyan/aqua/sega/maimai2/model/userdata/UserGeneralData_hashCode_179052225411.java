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

public class UserGeneralData_hashCode_179052225411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term139517;

    public UserGeneralData_hashCode_179052225411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term139523 = new Long(-1820639665251914495L);
        Integer term139586 = new Integer(-1396233580);
        Integer term139588 = new Integer(-654234892);
        Integer term139590 = new Integer(-50930731);
        ArrayList term139584 = new ArrayList();
        ((ArrayList) term139584).add(term139586);
        ((ArrayList) term139584).add(term139588);
        ((ArrayList) term139584).add(term139590);
        Integer term139596 = new Integer(-1067876039);
        Integer term139598 = new Integer(-1143749623);
        Integer term139600 = new Integer(1961561878);
        Integer term139602 = new Integer(1235809050);
        Integer term139604 = new Integer(1370082921);
        ArrayList term139594 = new ArrayList();
        ((ArrayList) term139594).add(term139596);
        ((ArrayList) term139594).add(term139598);
        ((ArrayList) term139594).add(term139600);
        ((ArrayList) term139594).add(term139602);
        ((ArrayList) term139594).add(term139604);
        term139517 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData"));
        Object term139519 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term139521 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term139537 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term139538 = newInstance(Class.forName("java.time.LocalDate"));
        Object term139542 = newInstance(Class.forName("java.time.LocalTime"));
        Object term139547 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term139548 = newInstance(Class.forName("java.time.LocalDate"));
        Object term139552 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term139517, term139517.getClass(), "id", -8720576105608818998L);
        setLongField(term139519, term139519.getClass(), "id", -5843172964391342496L);
        setLongField(term139521, term139521.getClass(), "id", 3128444972440094090L);
        setField(term139521, term139521.getClass(), "extId", term139523);
        setField(term139521, term139521.getClass(), "luid", "ktWbLulnVh");
        setIntField(term139538, term139538.getClass(), "year", 2024);
        setShortField(term139538, term139538.getClass(), "month", (short) 3);
        setShortField(term139538, term139538.getClass(), "day", (short) 30);
        setField(term139537, term139537.getClass(), "date", term139538);
        setByteField(term139542, term139542.getClass(), "hour", (byte) 7);
        setByteField(term139542, term139542.getClass(), "minute", (byte) 18);
        setByteField(term139542, term139542.getClass(), "second", (byte) 30);
        setIntField(term139542, term139542.getClass(), "nano", 930626265);
        setField(term139537, term139537.getClass(), "time", term139542);
        setField(term139521, term139521.getClass(), "registerTime", term139537);
        setIntField(term139548, term139548.getClass(), "year", 2017);
        setShortField(term139548, term139548.getClass(), "month", (short) 10);
        setShortField(term139548, term139548.getClass(), "day", (short) 18);
        setField(term139547, term139547.getClass(), "date", term139548);
        setByteField(term139552, term139552.getClass(), "hour", (byte) 20);
        setByteField(term139552, term139552.getClass(), "minute", (byte) 35);
        setByteField(term139552, term139552.getClass(), "second", (byte) 5);
        setIntField(term139552, term139552.getClass(), "nano", 697625538);
        setField(term139547, term139547.getClass(), "time", term139552);
        setField(term139521, term139521.getClass(), "accessTime", term139547);
        setField(term139519, term139519.getClass(), "card", term139521);
        setField(term139519, term139519.getClass(), "userName", "iUWVVoBCUJ");
        setIntField(term139519, term139519.getClass(), "isNetMember", 1099125651);
        setIntField(term139519, term139519.getClass(), "iconId", 338123354);
        setIntField(term139519, term139519.getClass(), "plateId", -830092964);
        setIntField(term139519, term139519.getClass(), "titleId", 2137377172);
        setIntField(term139519, term139519.getClass(), "partnerId", 1981927891);
        setIntField(term139519, term139519.getClass(), "frameId", -1835063179);
        setIntField(term139519, term139519.getClass(), "selectMapId", -184092475);
        setIntField(term139519, term139519.getClass(), "totalAwake", -1002047965);
        setIntField(term139519, term139519.getClass(), "gradeRating", 1634880098);
        setIntField(term139519, term139519.getClass(), "musicRating", 1459664470);
        setIntField(term139519, term139519.getClass(), "playerRating", 390456498);
        setIntField(term139519, term139519.getClass(), "highestRating", -75818278);
        setIntField(term139519, term139519.getClass(), "gradeRank", -638713910);
        setIntField(term139519, term139519.getClass(), "classRank", 1047195730);
        setIntField(term139519, term139519.getClass(), "courseRank", -1089490394);
        setField(term139519, term139519.getClass(), "charaSlot", term139584);
        setField(term139519, term139519.getClass(), "charaLockSlot", term139594);
        setLongField(term139519, term139519.getClass(), "contentBit", 1874976089380311441L);
        setIntField(term139519, term139519.getClass(), "playCount", 1288764916);
        setField(term139519, term139519.getClass(), "eventWatchedDate", "CdhhQSeUxx");
        setField(term139519, term139519.getClass(), "lastGameId", "ibLGcUvUaQ");
        setField(term139519, term139519.getClass(), "lastRomVersion", "NFQfoAnLge");
        setField(term139519, term139519.getClass(), "lastDataVersion", "FECGrszMje");
        setField(term139519, term139519.getClass(), "lastLoginDate", "uYvUMAqudy");
        setField(term139519, term139519.getClass(), "lastPlayDate", "ynxbUIshhw");
        setIntField(term139519, term139519.getClass(), "lastPlayCredit", -1590776943);
        setIntField(term139519, term139519.getClass(), "lastPlayMode", -55708653);
        setIntField(term139519, term139519.getClass(), "lastPlaceId", -618645376);
        setField(term139519, term139519.getClass(), "lastPlaceName", "YLRmtmCngx");
        setIntField(term139519, term139519.getClass(), "lastAllNetId", -1757025350);
        setIntField(term139519, term139519.getClass(), "lastRegionId", 241494222);
        setField(term139519, term139519.getClass(), "lastRegionName", "nrdzzTSWFF");
        setField(term139519, term139519.getClass(), "lastClientId", "KoJHLBVrxX");
        setField(term139519, term139519.getClass(), "lastCountryCode", "HkLucnnsSl");
        setIntField(term139519, term139519.getClass(), "lastSelectEMoney", -1394120293);
        setIntField(term139519, term139519.getClass(), "lastSelectTicket", 1365082165);
        setIntField(term139519, term139519.getClass(), "lastSelectCourse", 237330727);
        setIntField(term139519, term139519.getClass(), "lastCountCourse", 1865561086);
        setField(term139519, term139519.getClass(), "firstGameId", "VdhooJgKjD");
        setField(term139519, term139519.getClass(), "firstRomVersion", "glIybxsQbc");
        setField(term139519, term139519.getClass(), "firstDataVersion", "nWUrJaIrWY");
        setField(term139519, term139519.getClass(), "firstPlayDate", "azfYXqXuep");
        setField(term139519, term139519.getClass(), "compatibleCmVersion", "RUDKjRvYEj");
        setField(term139519, term139519.getClass(), "dailyBonusDate", "qqfmBAQNbi");
        setField(term139519, term139519.getClass(), "dailyCourseBonusDate", "ZazUKKNrNz");
        setField(term139519, term139519.getClass(), "lastPairLoginDate", "adJVCgKQux");
        setField(term139519, term139519.getClass(), "lastTrialPlayDate", "PQibUERIvR");
        setIntField(term139519, term139519.getClass(), "playVsCount", -1717770104);
        setIntField(term139519, term139519.getClass(), "playSyncCount", 1002436799);
        setIntField(term139519, term139519.getClass(), "winCount", 491797710);
        setIntField(term139519, term139519.getClass(), "helpCount", -528313320);
        setIntField(term139519, term139519.getClass(), "comboCount", 1438707097);
        setLongField(term139519, term139519.getClass(), "totalDeluxscore", -6405468446402425599L);
        setLongField(term139519, term139519.getClass(), "totalBasicDeluxscore", 3371469305315842795L);
        setLongField(term139519, term139519.getClass(), "totalAdvancedDeluxscore", 2613121483651232843L);
        setLongField(term139519, term139519.getClass(), "totalExpertDeluxscore", 7369885657645743862L);
        setLongField(term139519, term139519.getClass(), "totalMasterDeluxscore", -1748584930648029253L);
        setLongField(term139519, term139519.getClass(), "totalReMasterDeluxscore", 2016830289356150171L);
        setIntField(term139519, term139519.getClass(), "totalSync", -776758828);
        setIntField(term139519, term139519.getClass(), "totalBasicSync", -1084450309);
        setIntField(term139519, term139519.getClass(), "totalAdvancedSync", -701546274);
        setIntField(term139519, term139519.getClass(), "totalExpertSync", -875355024);
        setIntField(term139519, term139519.getClass(), "totalMasterSync", -741514277);
        setIntField(term139519, term139519.getClass(), "totalReMasterSync", 1849014808);
        setLongField(term139519, term139519.getClass(), "totalAchievement", -8988533053281123772L);
        setLongField(term139519, term139519.getClass(), "totalBasicAchievement", -6505574982283705297L);
        setLongField(term139519, term139519.getClass(), "totalAdvancedAchievement", 1520161374621643034L);
        setLongField(term139519, term139519.getClass(), "totalExpertAchievement", 8305046077906092976L);
        setLongField(term139519, term139519.getClass(), "totalMasterAchievement", 4247519809594043800L);
        setLongField(term139519, term139519.getClass(), "totalReMasterAchievement", -5285452288299088051L);
        setLongField(term139519, term139519.getClass(), "playerOldRating", -1468157235147075228L);
        setLongField(term139519, term139519.getClass(), "playerNewRating", 5128145223609108267L);
        setIntField(term139519, term139519.getClass(), "banState", 452254325);
        setLongField(term139519, term139519.getClass(), "dateTime", -7223089829633275696L);
        setField(term139517, term139517.getClass(), "user", term139519);
        setField(term139517, term139517.getClass(), "propertyKey", "HsNjJxtWVg");
        setField(term139517, term139517.getClass(), "propertyValue", "yrkhDRBntk");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserGeneralData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term139517, args);
    }

};


