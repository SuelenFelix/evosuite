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

public class UserDetail_setLastCountCourse_1981935408117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262093;
     Object term262454;

    public UserDetail_setLastCountCourse_1981935408117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term262097 = new Long(4115148503664117517L);
        Integer term262160 = new Integer(-652818479);
        Integer term262162 = new Integer(909221962);
        Integer term262164 = new Integer(1036562171);
        Integer term262166 = new Integer(-1176098787);
        Integer term262168 = new Integer(-1108621848);
        Integer term262170 = new Integer(1868049133);
        ArrayList term262158 = new ArrayList();
        ((ArrayList) term262158).add(term262160);
        ((ArrayList) term262158).add(term262162);
        ((ArrayList) term262158).add(term262164);
        ((ArrayList) term262158).add(term262166);
        ((ArrayList) term262158).add(term262168);
        ((ArrayList) term262158).add(term262170);
        Integer term262176 = new Integer(-2041713971);
        Integer term262178 = new Integer(752002755);
        Integer term262180 = new Integer(-975157064);
        Integer term262182 = new Integer(-378255267);
        Integer term262184 = new Integer(-1205835103);
        ArrayList term262174 = new ArrayList();
        ((ArrayList) term262174).add(term262176);
        ((ArrayList) term262174).add(term262178);
        ((ArrayList) term262174).add(term262180);
        ((ArrayList) term262174).add(term262182);
        ((ArrayList) term262174).add(term262184);
        term262093 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term262095 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term262111 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term262112 = newInstance(Class.forName("java.time.LocalDate"));
        Object term262116 = newInstance(Class.forName("java.time.LocalTime"));
        Object term262121 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term262122 = newInstance(Class.forName("java.time.LocalDate"));
        Object term262126 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term262093, term262093.getClass(), "id", -7287321734834680689L);
        setLongField(term262095, term262095.getClass(), "id", -8784075933645837906L);
        setField(term262095, term262095.getClass(), "extId", term262097);
        setField(term262095, term262095.getClass(), "luid", "ZLOPgKhMdJ");
        setIntField(term262112, term262112.getClass(), "year", 2014);
        setShortField(term262112, term262112.getClass(), "month", (short) 9);
        setShortField(term262112, term262112.getClass(), "day", (short) 25);
        setField(term262111, term262111.getClass(), "date", term262112);
        setByteField(term262116, term262116.getClass(), "hour", (byte) 11);
        setByteField(term262116, term262116.getClass(), "minute", (byte) 31);
        setByteField(term262116, term262116.getClass(), "second", (byte) 8);
        setIntField(term262116, term262116.getClass(), "nano", 872565929);
        setField(term262111, term262111.getClass(), "time", term262116);
        setField(term262095, term262095.getClass(), "registerTime", term262111);
        setIntField(term262122, term262122.getClass(), "year", 2016);
        setShortField(term262122, term262122.getClass(), "month", (short) 7);
        setShortField(term262122, term262122.getClass(), "day", (short) 13);
        setField(term262121, term262121.getClass(), "date", term262122);
        setByteField(term262126, term262126.getClass(), "hour", (byte) 22);
        setByteField(term262126, term262126.getClass(), "minute", (byte) 34);
        setByteField(term262126, term262126.getClass(), "second", (byte) 48);
        setIntField(term262126, term262126.getClass(), "nano", 138454110);
        setField(term262121, term262121.getClass(), "time", term262126);
        setField(term262095, term262095.getClass(), "accessTime", term262121);
        setField(term262093, term262093.getClass(), "card", term262095);
        setField(term262093, term262093.getClass(), "userName", "ZbWdzNDrkG");
        setIntField(term262093, term262093.getClass(), "isNetMember", 1485756799);
        setIntField(term262093, term262093.getClass(), "iconId", 546047763);
        setIntField(term262093, term262093.getClass(), "plateId", -1457910913);
        setIntField(term262093, term262093.getClass(), "titleId", 855873150);
        setIntField(term262093, term262093.getClass(), "partnerId", -756508779);
        setIntField(term262093, term262093.getClass(), "frameId", 1499179754);
        setIntField(term262093, term262093.getClass(), "selectMapId", 813945887);
        setIntField(term262093, term262093.getClass(), "totalAwake", -35003186);
        setIntField(term262093, term262093.getClass(), "gradeRating", -595721425);
        setIntField(term262093, term262093.getClass(), "musicRating", -439609584);
        setIntField(term262093, term262093.getClass(), "playerRating", -1502962234);
        setIntField(term262093, term262093.getClass(), "highestRating", -1873626416);
        setIntField(term262093, term262093.getClass(), "gradeRank", 1896977196);
        setIntField(term262093, term262093.getClass(), "classRank", -1792266722);
        setIntField(term262093, term262093.getClass(), "courseRank", 1396274905);
        setField(term262093, term262093.getClass(), "charaSlot", term262158);
        setField(term262093, term262093.getClass(), "charaLockSlot", term262174);
        setLongField(term262093, term262093.getClass(), "contentBit", -242294065719868274L);
        setIntField(term262093, term262093.getClass(), "playCount", -1779394164);
        setField(term262093, term262093.getClass(), "eventWatchedDate", "qXWvyFwoKF");
        setField(term262093, term262093.getClass(), "lastGameId", "NkogXiHtJk");
        setField(term262093, term262093.getClass(), "lastRomVersion", "OacTmTWbcB");
        setField(term262093, term262093.getClass(), "lastDataVersion", "xLFRUxoUve");
        setField(term262093, term262093.getClass(), "lastLoginDate", "OadUkgqJIf");
        setField(term262093, term262093.getClass(), "lastPlayDate", "LVRLcJfRsa");
        setIntField(term262093, term262093.getClass(), "lastPlayCredit", 1284222670);
        setIntField(term262093, term262093.getClass(), "lastPlayMode", -1909014850);
        setIntField(term262093, term262093.getClass(), "lastPlaceId", -418988719);
        setField(term262093, term262093.getClass(), "lastPlaceName", "kssWCPGFlA");
        setIntField(term262093, term262093.getClass(), "lastAllNetId", 1464492645);
        setIntField(term262093, term262093.getClass(), "lastRegionId", 1487670377);
        setField(term262093, term262093.getClass(), "lastRegionName", "MswayHAKlw");
        setField(term262093, term262093.getClass(), "lastClientId", "qICSGozwUr");
        setField(term262093, term262093.getClass(), "lastCountryCode", "dTLPQyRkQI");
        setIntField(term262093, term262093.getClass(), "lastSelectEMoney", -996307380);
        setIntField(term262093, term262093.getClass(), "lastSelectTicket", 2022112906);
        setIntField(term262093, term262093.getClass(), "lastSelectCourse", -1414718374);
        setIntField(term262093, term262093.getClass(), "lastCountCourse", -1159346345);
        setField(term262093, term262093.getClass(), "firstGameId", "bLgBVBwSSr");
        setField(term262093, term262093.getClass(), "firstRomVersion", "LoKsDbhNbo");
        setField(term262093, term262093.getClass(), "firstDataVersion", "GWRasXJpVB");
        setField(term262093, term262093.getClass(), "firstPlayDate", "NxETFVBNah");
        setField(term262093, term262093.getClass(), "compatibleCmVersion", "djQXCEqeOZ");
        setField(term262093, term262093.getClass(), "dailyBonusDate", "jQItbqdgru");
        setField(term262093, term262093.getClass(), "dailyCourseBonusDate", "eESpOcBzik");
        setField(term262093, term262093.getClass(), "lastPairLoginDate", "xTQmAOqrKo");
        setField(term262093, term262093.getClass(), "lastTrialPlayDate", "pJPSrRkLki");
        setIntField(term262093, term262093.getClass(), "playVsCount", 1885858233);
        setIntField(term262093, term262093.getClass(), "playSyncCount", -1733459877);
        setIntField(term262093, term262093.getClass(), "winCount", 1176390024);
        setIntField(term262093, term262093.getClass(), "helpCount", -1642962642);
        setIntField(term262093, term262093.getClass(), "comboCount", -164699981);
        setLongField(term262093, term262093.getClass(), "totalDeluxscore", 9016497484282571758L);
        setLongField(term262093, term262093.getClass(), "totalBasicDeluxscore", -6225738086522353914L);
        setLongField(term262093, term262093.getClass(), "totalAdvancedDeluxscore", 2836904091171932659L);
        setLongField(term262093, term262093.getClass(), "totalExpertDeluxscore", -8856147846094949239L);
        setLongField(term262093, term262093.getClass(), "totalMasterDeluxscore", -939002149395260187L);
        setLongField(term262093, term262093.getClass(), "totalReMasterDeluxscore", 3086252205729999222L);
        setIntField(term262093, term262093.getClass(), "totalSync", 245614438);
        setIntField(term262093, term262093.getClass(), "totalBasicSync", -840986382);
        setIntField(term262093, term262093.getClass(), "totalAdvancedSync", 1706500660);
        setIntField(term262093, term262093.getClass(), "totalExpertSync", -1824551166);
        setIntField(term262093, term262093.getClass(), "totalMasterSync", 1350741680);
        setIntField(term262093, term262093.getClass(), "totalReMasterSync", -1529036668);
        setLongField(term262093, term262093.getClass(), "totalAchievement", 1461653948317624926L);
        setLongField(term262093, term262093.getClass(), "totalBasicAchievement", 2821305427355928662L);
        setLongField(term262093, term262093.getClass(), "totalAdvancedAchievement", -48169106452885644L);
        setLongField(term262093, term262093.getClass(), "totalExpertAchievement", 180524963512288905L);
        setLongField(term262093, term262093.getClass(), "totalMasterAchievement", 6736435636515067894L);
        setLongField(term262093, term262093.getClass(), "totalReMasterAchievement", -2557737530297000159L);
        setLongField(term262093, term262093.getClass(), "playerOldRating", 1975975263666587124L);
        setLongField(term262093, term262093.getClass(), "playerNewRating", -6096422224755404787L);
        setIntField(term262093, term262093.getClass(), "banState", 1415286034);
        setLongField(term262093, term262093.getClass(), "dateTime", -6051227412662563452L);
        term262454 = new Integer(-1639049163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term262454;
        callMethod(klass, "setLastCountCourse", argTypes, term262093, args);
    }

};


