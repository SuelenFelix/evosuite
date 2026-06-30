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

public class UserDetail_setLastSelectCourse_1233323405117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261575;
     Object term261936;

    public UserDetail_setLastSelectCourse_1233323405117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term261579 = new Long(-1647156882669215876L);
        Integer term261642 = new Integer(-1735958377);
        Integer term261644 = new Integer(-477618469);
        Integer term261646 = new Integer(117739625);
        Integer term261648 = new Integer(-314816968);
        Integer term261650 = new Integer(-1478972076);
        Integer term261652 = new Integer(828708445);
        Integer term261654 = new Integer(-1198357943);
        ArrayList term261640 = new ArrayList();
        ((ArrayList) term261640).add(term261642);
        ((ArrayList) term261640).add(term261644);
        ((ArrayList) term261640).add(term261646);
        ((ArrayList) term261640).add(term261648);
        ((ArrayList) term261640).add(term261650);
        ((ArrayList) term261640).add(term261652);
        ((ArrayList) term261640).add(term261654);
        Integer term261660 = new Integer(407342373);
        Integer term261662 = new Integer(633857490);
        Integer term261664 = new Integer(-602285518);
        Integer term261666 = new Integer(95548457);
        ArrayList term261658 = new ArrayList();
        ((ArrayList) term261658).add(term261660);
        ((ArrayList) term261658).add(term261662);
        ((ArrayList) term261658).add(term261664);
        ((ArrayList) term261658).add(term261666);
        term261575 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term261577 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term261593 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term261594 = newInstance(Class.forName("java.time.LocalDate"));
        Object term261598 = newInstance(Class.forName("java.time.LocalTime"));
        Object term261603 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term261604 = newInstance(Class.forName("java.time.LocalDate"));
        Object term261608 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term261575, term261575.getClass(), "id", 3400787166903305535L);
        setLongField(term261577, term261577.getClass(), "id", 3729519008245218034L);
        setField(term261577, term261577.getClass(), "extId", term261579);
        setField(term261577, term261577.getClass(), "luid", "YHHJhPAXoN");
        setIntField(term261594, term261594.getClass(), "year", 2028);
        setShortField(term261594, term261594.getClass(), "month", (short) 10);
        setShortField(term261594, term261594.getClass(), "day", (short) 11);
        setField(term261593, term261593.getClass(), "date", term261594);
        setByteField(term261598, term261598.getClass(), "hour", (byte) 1);
        setByteField(term261598, term261598.getClass(), "minute", (byte) 5);
        setByteField(term261598, term261598.getClass(), "second", (byte) 29);
        setIntField(term261598, term261598.getClass(), "nano", 688086203);
        setField(term261593, term261593.getClass(), "time", term261598);
        setField(term261577, term261577.getClass(), "registerTime", term261593);
        setIntField(term261604, term261604.getClass(), "year", 2029);
        setShortField(term261604, term261604.getClass(), "month", (short) 4);
        setShortField(term261604, term261604.getClass(), "day", (short) 26);
        setField(term261603, term261603.getClass(), "date", term261604);
        setByteField(term261608, term261608.getClass(), "hour", (byte) 19);
        setByteField(term261608, term261608.getClass(), "minute", (byte) 30);
        setByteField(term261608, term261608.getClass(), "second", (byte) 13);
        setIntField(term261608, term261608.getClass(), "nano", 883683186);
        setField(term261603, term261603.getClass(), "time", term261608);
        setField(term261577, term261577.getClass(), "accessTime", term261603);
        setField(term261575, term261575.getClass(), "card", term261577);
        setField(term261575, term261575.getClass(), "userName", "nFsigFFmWc");
        setIntField(term261575, term261575.getClass(), "isNetMember", -57698122);
        setIntField(term261575, term261575.getClass(), "iconId", -1666963978);
        setIntField(term261575, term261575.getClass(), "plateId", -1478575974);
        setIntField(term261575, term261575.getClass(), "titleId", -291257868);
        setIntField(term261575, term261575.getClass(), "partnerId", 1065083099);
        setIntField(term261575, term261575.getClass(), "frameId", 1427499273);
        setIntField(term261575, term261575.getClass(), "selectMapId", -59151213);
        setIntField(term261575, term261575.getClass(), "totalAwake", -707379580);
        setIntField(term261575, term261575.getClass(), "gradeRating", -57580085);
        setIntField(term261575, term261575.getClass(), "musicRating", -1154633550);
        setIntField(term261575, term261575.getClass(), "playerRating", 578387870);
        setIntField(term261575, term261575.getClass(), "highestRating", -573536134);
        setIntField(term261575, term261575.getClass(), "gradeRank", 1508235726);
        setIntField(term261575, term261575.getClass(), "classRank", -1903521501);
        setIntField(term261575, term261575.getClass(), "courseRank", 83577512);
        setField(term261575, term261575.getClass(), "charaSlot", term261640);
        setField(term261575, term261575.getClass(), "charaLockSlot", term261658);
        setLongField(term261575, term261575.getClass(), "contentBit", -9016637224611437807L);
        setIntField(term261575, term261575.getClass(), "playCount", -190486139);
        setField(term261575, term261575.getClass(), "eventWatchedDate", "qehgMPhJMU");
        setField(term261575, term261575.getClass(), "lastGameId", "IjpmHZDGJg");
        setField(term261575, term261575.getClass(), "lastRomVersion", "kNKLoDsbIJ");
        setField(term261575, term261575.getClass(), "lastDataVersion", "QETULvuUfM");
        setField(term261575, term261575.getClass(), "lastLoginDate", "erGLJPrSFu");
        setField(term261575, term261575.getClass(), "lastPlayDate", "hClrkDuclb");
        setIntField(term261575, term261575.getClass(), "lastPlayCredit", -1583452879);
        setIntField(term261575, term261575.getClass(), "lastPlayMode", 1252497408);
        setIntField(term261575, term261575.getClass(), "lastPlaceId", -1193659161);
        setField(term261575, term261575.getClass(), "lastPlaceName", "RQGjkjoJid");
        setIntField(term261575, term261575.getClass(), "lastAllNetId", 611802335);
        setIntField(term261575, term261575.getClass(), "lastRegionId", -117170783);
        setField(term261575, term261575.getClass(), "lastRegionName", "fqFCsfbRxM");
        setField(term261575, term261575.getClass(), "lastClientId", "VxtdFZGhCL");
        setField(term261575, term261575.getClass(), "lastCountryCode", "NdCqWFAKtC");
        setIntField(term261575, term261575.getClass(), "lastSelectEMoney", 1396116256);
        setIntField(term261575, term261575.getClass(), "lastSelectTicket", 782140754);
        setIntField(term261575, term261575.getClass(), "lastSelectCourse", -1361513040);
        setIntField(term261575, term261575.getClass(), "lastCountCourse", -1061345604);
        setField(term261575, term261575.getClass(), "firstGameId", "brggoDHwgJ");
        setField(term261575, term261575.getClass(), "firstRomVersion", "mDOxbNsMUA");
        setField(term261575, term261575.getClass(), "firstDataVersion", "wmcOIwaOzF");
        setField(term261575, term261575.getClass(), "firstPlayDate", "tvKxAKjRmt");
        setField(term261575, term261575.getClass(), "compatibleCmVersion", "YqKucvfPsH");
        setField(term261575, term261575.getClass(), "dailyBonusDate", "yJJLpUySXp");
        setField(term261575, term261575.getClass(), "dailyCourseBonusDate", "ZoRLfUSUqr");
        setField(term261575, term261575.getClass(), "lastPairLoginDate", "OvmJqKnwXe");
        setField(term261575, term261575.getClass(), "lastTrialPlayDate", "nrshoMEpRL");
        setIntField(term261575, term261575.getClass(), "playVsCount", -1473491051);
        setIntField(term261575, term261575.getClass(), "playSyncCount", 804411219);
        setIntField(term261575, term261575.getClass(), "winCount", -1184708689);
        setIntField(term261575, term261575.getClass(), "helpCount", 1859413989);
        setIntField(term261575, term261575.getClass(), "comboCount", 399424745);
        setLongField(term261575, term261575.getClass(), "totalDeluxscore", -2960879904932893879L);
        setLongField(term261575, term261575.getClass(), "totalBasicDeluxscore", -1315122419383725045L);
        setLongField(term261575, term261575.getClass(), "totalAdvancedDeluxscore", 7252428075442233244L);
        setLongField(term261575, term261575.getClass(), "totalExpertDeluxscore", -6273432065800856840L);
        setLongField(term261575, term261575.getClass(), "totalMasterDeluxscore", 8306179105614309233L);
        setLongField(term261575, term261575.getClass(), "totalReMasterDeluxscore", 1567219667287116329L);
        setIntField(term261575, term261575.getClass(), "totalSync", 1445242555);
        setIntField(term261575, term261575.getClass(), "totalBasicSync", -1658014193);
        setIntField(term261575, term261575.getClass(), "totalAdvancedSync", -730803369);
        setIntField(term261575, term261575.getClass(), "totalExpertSync", 2047860906);
        setIntField(term261575, term261575.getClass(), "totalMasterSync", -2076399882);
        setIntField(term261575, term261575.getClass(), "totalReMasterSync", -1118647144);
        setLongField(term261575, term261575.getClass(), "totalAchievement", -8498213738953298211L);
        setLongField(term261575, term261575.getClass(), "totalBasicAchievement", -2128497815151735399L);
        setLongField(term261575, term261575.getClass(), "totalAdvancedAchievement", -1098101593853276342L);
        setLongField(term261575, term261575.getClass(), "totalExpertAchievement", 7373123211001951056L);
        setLongField(term261575, term261575.getClass(), "totalMasterAchievement", 5481659296093333625L);
        setLongField(term261575, term261575.getClass(), "totalReMasterAchievement", 1105006028820649483L);
        setLongField(term261575, term261575.getClass(), "playerOldRating", -8447569958434404918L);
        setLongField(term261575, term261575.getClass(), "playerNewRating", 7980744282905497116L);
        setIntField(term261575, term261575.getClass(), "banState", 883702396);
        setLongField(term261575, term261575.getClass(), "dateTime", -2618439104559639621L);
        term261936 = new Integer(-1694239191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term261936;
        callMethod(klass, "setLastSelectCourse", argTypes, term261575, args);
    }

};


