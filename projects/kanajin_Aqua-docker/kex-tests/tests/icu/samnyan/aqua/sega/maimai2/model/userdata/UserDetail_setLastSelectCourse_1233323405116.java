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

public class UserDetail_setLastSelectCourse_1233323405116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261520;
     Object term261881;

    public UserDetail_setLastSelectCourse_1233323405116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term261524 = new Long(-1647156882669215876L);
        Integer term261587 = new Integer(-1735958377);
        Integer term261589 = new Integer(-477618469);
        Integer term261591 = new Integer(117739625);
        Integer term261593 = new Integer(-314816968);
        Integer term261595 = new Integer(-1478972076);
        Integer term261597 = new Integer(828708445);
        Integer term261599 = new Integer(-1198357943);
        ArrayList term261585 = new ArrayList();
        ((ArrayList) term261585).add(term261587);
        ((ArrayList) term261585).add(term261589);
        ((ArrayList) term261585).add(term261591);
        ((ArrayList) term261585).add(term261593);
        ((ArrayList) term261585).add(term261595);
        ((ArrayList) term261585).add(term261597);
        ((ArrayList) term261585).add(term261599);
        Integer term261605 = new Integer(407342373);
        Integer term261607 = new Integer(633857490);
        Integer term261609 = new Integer(-602285518);
        Integer term261611 = new Integer(95548457);
        ArrayList term261603 = new ArrayList();
        ((ArrayList) term261603).add(term261605);
        ((ArrayList) term261603).add(term261607);
        ((ArrayList) term261603).add(term261609);
        ((ArrayList) term261603).add(term261611);
        term261520 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term261522 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term261538 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term261539 = newInstance(Class.forName("java.time.LocalDate"));
        Object term261543 = newInstance(Class.forName("java.time.LocalTime"));
        Object term261548 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term261549 = newInstance(Class.forName("java.time.LocalDate"));
        Object term261553 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term261520, term261520.getClass(), "id", 3400787166903305535L);
        setLongField(term261522, term261522.getClass(), "id", 3729519008245218034L);
        setField(term261522, term261522.getClass(), "extId", term261524);
        setField(term261522, term261522.getClass(), "luid", "YHHJhPAXoN");
        setIntField(term261539, term261539.getClass(), "year", 2028);
        setShortField(term261539, term261539.getClass(), "month", (short) 10);
        setShortField(term261539, term261539.getClass(), "day", (short) 11);
        setField(term261538, term261538.getClass(), "date", term261539);
        setByteField(term261543, term261543.getClass(), "hour", (byte) 1);
        setByteField(term261543, term261543.getClass(), "minute", (byte) 5);
        setByteField(term261543, term261543.getClass(), "second", (byte) 29);
        setIntField(term261543, term261543.getClass(), "nano", 688086203);
        setField(term261538, term261538.getClass(), "time", term261543);
        setField(term261522, term261522.getClass(), "registerTime", term261538);
        setIntField(term261549, term261549.getClass(), "year", 2029);
        setShortField(term261549, term261549.getClass(), "month", (short) 4);
        setShortField(term261549, term261549.getClass(), "day", (short) 26);
        setField(term261548, term261548.getClass(), "date", term261549);
        setByteField(term261553, term261553.getClass(), "hour", (byte) 19);
        setByteField(term261553, term261553.getClass(), "minute", (byte) 30);
        setByteField(term261553, term261553.getClass(), "second", (byte) 13);
        setIntField(term261553, term261553.getClass(), "nano", 883683186);
        setField(term261548, term261548.getClass(), "time", term261553);
        setField(term261522, term261522.getClass(), "accessTime", term261548);
        setField(term261520, term261520.getClass(), "card", term261522);
        setField(term261520, term261520.getClass(), "userName", "nFsigFFmWc");
        setIntField(term261520, term261520.getClass(), "isNetMember", -57698122);
        setIntField(term261520, term261520.getClass(), "iconId", -1666963978);
        setIntField(term261520, term261520.getClass(), "plateId", -1478575974);
        setIntField(term261520, term261520.getClass(), "titleId", -291257868);
        setIntField(term261520, term261520.getClass(), "partnerId", 1065083099);
        setIntField(term261520, term261520.getClass(), "frameId", 1427499273);
        setIntField(term261520, term261520.getClass(), "selectMapId", -59151213);
        setIntField(term261520, term261520.getClass(), "totalAwake", -707379580);
        setIntField(term261520, term261520.getClass(), "gradeRating", -57580085);
        setIntField(term261520, term261520.getClass(), "musicRating", -1154633550);
        setIntField(term261520, term261520.getClass(), "playerRating", 578387870);
        setIntField(term261520, term261520.getClass(), "highestRating", -573536134);
        setIntField(term261520, term261520.getClass(), "gradeRank", 1508235726);
        setIntField(term261520, term261520.getClass(), "classRank", -1903521501);
        setIntField(term261520, term261520.getClass(), "courseRank", 83577512);
        setField(term261520, term261520.getClass(), "charaSlot", term261585);
        setField(term261520, term261520.getClass(), "charaLockSlot", term261603);
        setLongField(term261520, term261520.getClass(), "contentBit", -9016637224611437807L);
        setIntField(term261520, term261520.getClass(), "playCount", -190486139);
        setField(term261520, term261520.getClass(), "eventWatchedDate", "qehgMPhJMU");
        setField(term261520, term261520.getClass(), "lastGameId", "IjpmHZDGJg");
        setField(term261520, term261520.getClass(), "lastRomVersion", "kNKLoDsbIJ");
        setField(term261520, term261520.getClass(), "lastDataVersion", "QETULvuUfM");
        setField(term261520, term261520.getClass(), "lastLoginDate", "erGLJPrSFu");
        setField(term261520, term261520.getClass(), "lastPlayDate", "hClrkDuclb");
        setIntField(term261520, term261520.getClass(), "lastPlayCredit", -1583452879);
        setIntField(term261520, term261520.getClass(), "lastPlayMode", 1252497408);
        setIntField(term261520, term261520.getClass(), "lastPlaceId", -1193659161);
        setField(term261520, term261520.getClass(), "lastPlaceName", "RQGjkjoJid");
        setIntField(term261520, term261520.getClass(), "lastAllNetId", 611802335);
        setIntField(term261520, term261520.getClass(), "lastRegionId", -117170783);
        setField(term261520, term261520.getClass(), "lastRegionName", "fqFCsfbRxM");
        setField(term261520, term261520.getClass(), "lastClientId", "VxtdFZGhCL");
        setField(term261520, term261520.getClass(), "lastCountryCode", "NdCqWFAKtC");
        setIntField(term261520, term261520.getClass(), "lastSelectEMoney", 1396116256);
        setIntField(term261520, term261520.getClass(), "lastSelectTicket", 782140754);
        setIntField(term261520, term261520.getClass(), "lastSelectCourse", -1361513040);
        setIntField(term261520, term261520.getClass(), "lastCountCourse", -1061345604);
        setField(term261520, term261520.getClass(), "firstGameId", "brggoDHwgJ");
        setField(term261520, term261520.getClass(), "firstRomVersion", "mDOxbNsMUA");
        setField(term261520, term261520.getClass(), "firstDataVersion", "wmcOIwaOzF");
        setField(term261520, term261520.getClass(), "firstPlayDate", "tvKxAKjRmt");
        setField(term261520, term261520.getClass(), "compatibleCmVersion", "YqKucvfPsH");
        setField(term261520, term261520.getClass(), "dailyBonusDate", "yJJLpUySXp");
        setField(term261520, term261520.getClass(), "dailyCourseBonusDate", "ZoRLfUSUqr");
        setField(term261520, term261520.getClass(), "lastPairLoginDate", "OvmJqKnwXe");
        setField(term261520, term261520.getClass(), "lastTrialPlayDate", "nrshoMEpRL");
        setIntField(term261520, term261520.getClass(), "playVsCount", -1473491051);
        setIntField(term261520, term261520.getClass(), "playSyncCount", 804411219);
        setIntField(term261520, term261520.getClass(), "winCount", -1184708689);
        setIntField(term261520, term261520.getClass(), "helpCount", 1859413989);
        setIntField(term261520, term261520.getClass(), "comboCount", 399424745);
        setLongField(term261520, term261520.getClass(), "totalDeluxscore", -2960879904932893879L);
        setLongField(term261520, term261520.getClass(), "totalBasicDeluxscore", -1315122419383725045L);
        setLongField(term261520, term261520.getClass(), "totalAdvancedDeluxscore", 7252428075442233244L);
        setLongField(term261520, term261520.getClass(), "totalExpertDeluxscore", -6273432065800856840L);
        setLongField(term261520, term261520.getClass(), "totalMasterDeluxscore", 8306179105614309233L);
        setLongField(term261520, term261520.getClass(), "totalReMasterDeluxscore", 1567219667287116329L);
        setIntField(term261520, term261520.getClass(), "totalSync", 1445242555);
        setIntField(term261520, term261520.getClass(), "totalBasicSync", -1658014193);
        setIntField(term261520, term261520.getClass(), "totalAdvancedSync", -730803369);
        setIntField(term261520, term261520.getClass(), "totalExpertSync", 2047860906);
        setIntField(term261520, term261520.getClass(), "totalMasterSync", -2076399882);
        setIntField(term261520, term261520.getClass(), "totalReMasterSync", -1118647144);
        setLongField(term261520, term261520.getClass(), "totalAchievement", -8498213738953298211L);
        setLongField(term261520, term261520.getClass(), "totalBasicAchievement", -2128497815151735399L);
        setLongField(term261520, term261520.getClass(), "totalAdvancedAchievement", -1098101593853276342L);
        setLongField(term261520, term261520.getClass(), "totalExpertAchievement", 7373123211001951056L);
        setLongField(term261520, term261520.getClass(), "totalMasterAchievement", 5481659296093333625L);
        setLongField(term261520, term261520.getClass(), "totalReMasterAchievement", 1105006028820649483L);
        setLongField(term261520, term261520.getClass(), "playerOldRating", -8447569958434404918L);
        setLongField(term261520, term261520.getClass(), "playerNewRating", 7980744282905497116L);
        setIntField(term261520, term261520.getClass(), "banState", 883702396);
        setLongField(term261520, term261520.getClass(), "dateTime", -2618439104559639621L);
        term261881 = new Integer(-1694239191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term261881;
        callMethod(klass, "setLastSelectCourse", argTypes, term261520, args);
    }

};


