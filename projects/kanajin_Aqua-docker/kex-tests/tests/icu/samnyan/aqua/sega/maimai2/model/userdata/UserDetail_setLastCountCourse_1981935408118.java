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

public class UserDetail_setLastCountCourse_1981935408118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term262148;
     Object term262509;

    public UserDetail_setLastCountCourse_1981935408118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term262152 = new Long(4115148503664117517L);
        Integer term262215 = new Integer(-652818479);
        Integer term262217 = new Integer(909221962);
        Integer term262219 = new Integer(1036562171);
        Integer term262221 = new Integer(-1176098787);
        Integer term262223 = new Integer(-1108621848);
        Integer term262225 = new Integer(1868049133);
        ArrayList term262213 = new ArrayList();
        ((ArrayList) term262213).add(term262215);
        ((ArrayList) term262213).add(term262217);
        ((ArrayList) term262213).add(term262219);
        ((ArrayList) term262213).add(term262221);
        ((ArrayList) term262213).add(term262223);
        ((ArrayList) term262213).add(term262225);
        Integer term262231 = new Integer(-2041713971);
        Integer term262233 = new Integer(752002755);
        Integer term262235 = new Integer(-975157064);
        Integer term262237 = new Integer(-378255267);
        Integer term262239 = new Integer(-1205835103);
        ArrayList term262229 = new ArrayList();
        ((ArrayList) term262229).add(term262231);
        ((ArrayList) term262229).add(term262233);
        ((ArrayList) term262229).add(term262235);
        ((ArrayList) term262229).add(term262237);
        ((ArrayList) term262229).add(term262239);
        term262148 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term262150 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term262166 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term262167 = newInstance(Class.forName("java.time.LocalDate"));
        Object term262171 = newInstance(Class.forName("java.time.LocalTime"));
        Object term262176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term262177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term262181 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term262148, term262148.getClass(), "id", -7287321734834680689L);
        setLongField(term262150, term262150.getClass(), "id", -8784075933645837906L);
        setField(term262150, term262150.getClass(), "extId", term262152);
        setField(term262150, term262150.getClass(), "luid", "ZLOPgKhMdJ");
        setIntField(term262167, term262167.getClass(), "year", 2014);
        setShortField(term262167, term262167.getClass(), "month", (short) 9);
        setShortField(term262167, term262167.getClass(), "day", (short) 25);
        setField(term262166, term262166.getClass(), "date", term262167);
        setByteField(term262171, term262171.getClass(), "hour", (byte) 11);
        setByteField(term262171, term262171.getClass(), "minute", (byte) 31);
        setByteField(term262171, term262171.getClass(), "second", (byte) 8);
        setIntField(term262171, term262171.getClass(), "nano", 872565929);
        setField(term262166, term262166.getClass(), "time", term262171);
        setField(term262150, term262150.getClass(), "registerTime", term262166);
        setIntField(term262177, term262177.getClass(), "year", 2016);
        setShortField(term262177, term262177.getClass(), "month", (short) 7);
        setShortField(term262177, term262177.getClass(), "day", (short) 13);
        setField(term262176, term262176.getClass(), "date", term262177);
        setByteField(term262181, term262181.getClass(), "hour", (byte) 22);
        setByteField(term262181, term262181.getClass(), "minute", (byte) 34);
        setByteField(term262181, term262181.getClass(), "second", (byte) 48);
        setIntField(term262181, term262181.getClass(), "nano", 138454110);
        setField(term262176, term262176.getClass(), "time", term262181);
        setField(term262150, term262150.getClass(), "accessTime", term262176);
        setField(term262148, term262148.getClass(), "card", term262150);
        setField(term262148, term262148.getClass(), "userName", "ZbWdzNDrkG");
        setIntField(term262148, term262148.getClass(), "isNetMember", 1485756799);
        setIntField(term262148, term262148.getClass(), "iconId", 546047763);
        setIntField(term262148, term262148.getClass(), "plateId", -1457910913);
        setIntField(term262148, term262148.getClass(), "titleId", 855873150);
        setIntField(term262148, term262148.getClass(), "partnerId", -756508779);
        setIntField(term262148, term262148.getClass(), "frameId", 1499179754);
        setIntField(term262148, term262148.getClass(), "selectMapId", 813945887);
        setIntField(term262148, term262148.getClass(), "totalAwake", -35003186);
        setIntField(term262148, term262148.getClass(), "gradeRating", -595721425);
        setIntField(term262148, term262148.getClass(), "musicRating", -439609584);
        setIntField(term262148, term262148.getClass(), "playerRating", -1502962234);
        setIntField(term262148, term262148.getClass(), "highestRating", -1873626416);
        setIntField(term262148, term262148.getClass(), "gradeRank", 1896977196);
        setIntField(term262148, term262148.getClass(), "classRank", -1792266722);
        setIntField(term262148, term262148.getClass(), "courseRank", 1396274905);
        setField(term262148, term262148.getClass(), "charaSlot", term262213);
        setField(term262148, term262148.getClass(), "charaLockSlot", term262229);
        setLongField(term262148, term262148.getClass(), "contentBit", -242294065719868274L);
        setIntField(term262148, term262148.getClass(), "playCount", -1779394164);
        setField(term262148, term262148.getClass(), "eventWatchedDate", "qXWvyFwoKF");
        setField(term262148, term262148.getClass(), "lastGameId", "NkogXiHtJk");
        setField(term262148, term262148.getClass(), "lastRomVersion", "OacTmTWbcB");
        setField(term262148, term262148.getClass(), "lastDataVersion", "xLFRUxoUve");
        setField(term262148, term262148.getClass(), "lastLoginDate", "OadUkgqJIf");
        setField(term262148, term262148.getClass(), "lastPlayDate", "LVRLcJfRsa");
        setIntField(term262148, term262148.getClass(), "lastPlayCredit", 1284222670);
        setIntField(term262148, term262148.getClass(), "lastPlayMode", -1909014850);
        setIntField(term262148, term262148.getClass(), "lastPlaceId", -418988719);
        setField(term262148, term262148.getClass(), "lastPlaceName", "kssWCPGFlA");
        setIntField(term262148, term262148.getClass(), "lastAllNetId", 1464492645);
        setIntField(term262148, term262148.getClass(), "lastRegionId", 1487670377);
        setField(term262148, term262148.getClass(), "lastRegionName", "MswayHAKlw");
        setField(term262148, term262148.getClass(), "lastClientId", "qICSGozwUr");
        setField(term262148, term262148.getClass(), "lastCountryCode", "dTLPQyRkQI");
        setIntField(term262148, term262148.getClass(), "lastSelectEMoney", -996307380);
        setIntField(term262148, term262148.getClass(), "lastSelectTicket", 2022112906);
        setIntField(term262148, term262148.getClass(), "lastSelectCourse", -1414718374);
        setIntField(term262148, term262148.getClass(), "lastCountCourse", -1159346345);
        setField(term262148, term262148.getClass(), "firstGameId", "bLgBVBwSSr");
        setField(term262148, term262148.getClass(), "firstRomVersion", "LoKsDbhNbo");
        setField(term262148, term262148.getClass(), "firstDataVersion", "GWRasXJpVB");
        setField(term262148, term262148.getClass(), "firstPlayDate", "NxETFVBNah");
        setField(term262148, term262148.getClass(), "compatibleCmVersion", "djQXCEqeOZ");
        setField(term262148, term262148.getClass(), "dailyBonusDate", "jQItbqdgru");
        setField(term262148, term262148.getClass(), "dailyCourseBonusDate", "eESpOcBzik");
        setField(term262148, term262148.getClass(), "lastPairLoginDate", "xTQmAOqrKo");
        setField(term262148, term262148.getClass(), "lastTrialPlayDate", "pJPSrRkLki");
        setIntField(term262148, term262148.getClass(), "playVsCount", 1885858233);
        setIntField(term262148, term262148.getClass(), "playSyncCount", -1733459877);
        setIntField(term262148, term262148.getClass(), "winCount", 1176390024);
        setIntField(term262148, term262148.getClass(), "helpCount", -1642962642);
        setIntField(term262148, term262148.getClass(), "comboCount", -164699981);
        setLongField(term262148, term262148.getClass(), "totalDeluxscore", 9016497484282571758L);
        setLongField(term262148, term262148.getClass(), "totalBasicDeluxscore", -6225738086522353914L);
        setLongField(term262148, term262148.getClass(), "totalAdvancedDeluxscore", 2836904091171932659L);
        setLongField(term262148, term262148.getClass(), "totalExpertDeluxscore", -8856147846094949239L);
        setLongField(term262148, term262148.getClass(), "totalMasterDeluxscore", -939002149395260187L);
        setLongField(term262148, term262148.getClass(), "totalReMasterDeluxscore", 3086252205729999222L);
        setIntField(term262148, term262148.getClass(), "totalSync", 245614438);
        setIntField(term262148, term262148.getClass(), "totalBasicSync", -840986382);
        setIntField(term262148, term262148.getClass(), "totalAdvancedSync", 1706500660);
        setIntField(term262148, term262148.getClass(), "totalExpertSync", -1824551166);
        setIntField(term262148, term262148.getClass(), "totalMasterSync", 1350741680);
        setIntField(term262148, term262148.getClass(), "totalReMasterSync", -1529036668);
        setLongField(term262148, term262148.getClass(), "totalAchievement", 1461653948317624926L);
        setLongField(term262148, term262148.getClass(), "totalBasicAchievement", 2821305427355928662L);
        setLongField(term262148, term262148.getClass(), "totalAdvancedAchievement", -48169106452885644L);
        setLongField(term262148, term262148.getClass(), "totalExpertAchievement", 180524963512288905L);
        setLongField(term262148, term262148.getClass(), "totalMasterAchievement", 6736435636515067894L);
        setLongField(term262148, term262148.getClass(), "totalReMasterAchievement", -2557737530297000159L);
        setLongField(term262148, term262148.getClass(), "playerOldRating", 1975975263666587124L);
        setLongField(term262148, term262148.getClass(), "playerNewRating", -6096422224755404787L);
        setIntField(term262148, term262148.getClass(), "banState", 1415286034);
        setLongField(term262148, term262148.getClass(), "dateTime", -6051227412662563452L);
        term262509 = new Integer(-1639049163);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term262509;
        callMethod(klass, "setLastCountCourse", argTypes, term262148, args);
    }

};


