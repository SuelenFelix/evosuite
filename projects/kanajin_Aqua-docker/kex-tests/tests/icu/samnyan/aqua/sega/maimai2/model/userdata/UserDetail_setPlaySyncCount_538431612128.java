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

public class UserDetail_setPlaySyncCount_538431612128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4302625;
     Object term4302978;

    public UserDetail_setPlaySyncCount_538431612128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4302629 = new Long(5139914115068593411L);
        Integer term4302692 = new Integer(1904125756);
        Integer term4302694 = new Integer(-174814025);
        Integer term4302696 = new Integer(958303322);
        Integer term4302698 = new Integer(1228479658);
        Integer term4302700 = new Integer(129520433);
        ArrayList term4302690 = new ArrayList();
        ((ArrayList) term4302690).add(term4302692);
        ((ArrayList) term4302690).add(term4302694);
        ((ArrayList) term4302690).add(term4302696);
        ((ArrayList) term4302690).add(term4302698);
        ((ArrayList) term4302690).add(term4302700);
        Integer term4302706 = new Integer(390437953);
        Integer term4302708 = new Integer(-1928220499);
        ArrayList term4302704 = new ArrayList();
        ((ArrayList) term4302704).add(term4302706);
        ((ArrayList) term4302704).add(term4302708);
        term4302625 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4302627 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4302643 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4302644 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4302648 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4302653 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4302654 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4302658 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4302625, term4302625.getClass(), "id", -5151491028206590883L);
        setLongField(term4302627, term4302627.getClass(), "id", 576809730566885661L);
        setField(term4302627, term4302627.getClass(), "extId", term4302629);
        setField(term4302627, term4302627.getClass(), "luid", "zSLTxlylba");
        setIntField(term4302644, term4302644.getClass(), "year", 2027);
        setShortField(term4302644, term4302644.getClass(), "month", (short) 1);
        setShortField(term4302644, term4302644.getClass(), "day", (short) 21);
        setField(term4302643, term4302643.getClass(), "date", term4302644);
        setByteField(term4302648, term4302648.getClass(), "hour", (byte) 18);
        setByteField(term4302648, term4302648.getClass(), "minute", (byte) 24);
        setByteField(term4302648, term4302648.getClass(), "second", (byte) 7);
        setIntField(term4302648, term4302648.getClass(), "nano", 245919520);
        setField(term4302643, term4302643.getClass(), "time", term4302648);
        setField(term4302627, term4302627.getClass(), "registerTime", term4302643);
        setIntField(term4302654, term4302654.getClass(), "year", 2024);
        setShortField(term4302654, term4302654.getClass(), "month", (short) 9);
        setShortField(term4302654, term4302654.getClass(), "day", (short) 26);
        setField(term4302653, term4302653.getClass(), "date", term4302654);
        setByteField(term4302658, term4302658.getClass(), "hour", (byte) 21);
        setByteField(term4302658, term4302658.getClass(), "minute", (byte) 20);
        setByteField(term4302658, term4302658.getClass(), "second", (byte) 46);
        setIntField(term4302658, term4302658.getClass(), "nano", 87900396);
        setField(term4302653, term4302653.getClass(), "time", term4302658);
        setField(term4302627, term4302627.getClass(), "accessTime", term4302653);
        setField(term4302625, term4302625.getClass(), "card", term4302627);
        setField(term4302625, term4302625.getClass(), "userName", "zwJJWEEzKb");
        setIntField(term4302625, term4302625.getClass(), "isNetMember", -1704240050);
        setIntField(term4302625, term4302625.getClass(), "iconId", 1405957709);
        setIntField(term4302625, term4302625.getClass(), "plateId", -1643252773);
        setIntField(term4302625, term4302625.getClass(), "titleId", -763081343);
        setIntField(term4302625, term4302625.getClass(), "partnerId", 1104760090);
        setIntField(term4302625, term4302625.getClass(), "frameId", -21434468);
        setIntField(term4302625, term4302625.getClass(), "selectMapId", 633458821);
        setIntField(term4302625, term4302625.getClass(), "totalAwake", 1086040910);
        setIntField(term4302625, term4302625.getClass(), "gradeRating", -1343344461);
        setIntField(term4302625, term4302625.getClass(), "musicRating", 177869372);
        setIntField(term4302625, term4302625.getClass(), "playerRating", 1260117860);
        setIntField(term4302625, term4302625.getClass(), "highestRating", -159835471);
        setIntField(term4302625, term4302625.getClass(), "gradeRank", -662563504);
        setIntField(term4302625, term4302625.getClass(), "classRank", 1264830770);
        setIntField(term4302625, term4302625.getClass(), "courseRank", 96049969);
        setField(term4302625, term4302625.getClass(), "charaSlot", term4302690);
        setField(term4302625, term4302625.getClass(), "charaLockSlot", term4302704);
        setLongField(term4302625, term4302625.getClass(), "contentBit", 2307538731473922225L);
        setIntField(term4302625, term4302625.getClass(), "playCount", 1383788449);
        setField(term4302625, term4302625.getClass(), "eventWatchedDate", "tIgzkIdBNO");
        setField(term4302625, term4302625.getClass(), "lastGameId", "rmShxzwqNW");
        setField(term4302625, term4302625.getClass(), "lastRomVersion", "VtXNvmwTgT");
        setField(term4302625, term4302625.getClass(), "lastDataVersion", "EZhyKAtDDA");
        setField(term4302625, term4302625.getClass(), "lastLoginDate", "HInXTLUYDi");
        setField(term4302625, term4302625.getClass(), "lastPlayDate", "PaJvdgSSzq");
        setIntField(term4302625, term4302625.getClass(), "lastPlayCredit", -897251563);
        setIntField(term4302625, term4302625.getClass(), "lastPlayMode", -508715367);
        setIntField(term4302625, term4302625.getClass(), "lastPlaceId", -1349329142);
        setField(term4302625, term4302625.getClass(), "lastPlaceName", "XfqTDYaqJg");
        setIntField(term4302625, term4302625.getClass(), "lastAllNetId", -1873189091);
        setIntField(term4302625, term4302625.getClass(), "lastRegionId", 2132056725);
        setField(term4302625, term4302625.getClass(), "lastRegionName", "WMzIGMxrtv");
        setField(term4302625, term4302625.getClass(), "lastClientId", "VhOXkAZalW");
        setField(term4302625, term4302625.getClass(), "lastCountryCode", "CHlHXsHogL");
        setIntField(term4302625, term4302625.getClass(), "lastSelectEMoney", -352186920);
        setIntField(term4302625, term4302625.getClass(), "lastSelectTicket", -1917264231);
        setIntField(term4302625, term4302625.getClass(), "lastSelectCourse", -1913215359);
        setIntField(term4302625, term4302625.getClass(), "lastCountCourse", -1023337577);
        setField(term4302625, term4302625.getClass(), "firstGameId", "OydouBDqUg");
        setField(term4302625, term4302625.getClass(), "firstRomVersion", "HqXKYJQjUN");
        setField(term4302625, term4302625.getClass(), "firstDataVersion", "lFbmCnUXkb");
        setField(term4302625, term4302625.getClass(), "firstPlayDate", "oRwJIxQTzB");
        setField(term4302625, term4302625.getClass(), "compatibleCmVersion", "dUnzVZCqza");
        setField(term4302625, term4302625.getClass(), "dailyBonusDate", "JDqUgRaDLL");
        setField(term4302625, term4302625.getClass(), "dailyCourseBonusDate", "jXWFBpsSlH");
        setField(term4302625, term4302625.getClass(), "lastPairLoginDate", "HouaMauHNk");
        setField(term4302625, term4302625.getClass(), "lastTrialPlayDate", "gQlYfGyiCk");
        setIntField(term4302625, term4302625.getClass(), "playVsCount", -1404599017);
        setIntField(term4302625, term4302625.getClass(), "playSyncCount", 625605748);
        setIntField(term4302625, term4302625.getClass(), "winCount", 1713298458);
        setIntField(term4302625, term4302625.getClass(), "helpCount", 1253073949);
        setIntField(term4302625, term4302625.getClass(), "comboCount", -2043442706);
        setLongField(term4302625, term4302625.getClass(), "totalDeluxscore", 8752932558034395396L);
        setLongField(term4302625, term4302625.getClass(), "totalBasicDeluxscore", -365900220107034488L);
        setLongField(term4302625, term4302625.getClass(), "totalAdvancedDeluxscore", 4517645624775283129L);
        setLongField(term4302625, term4302625.getClass(), "totalExpertDeluxscore", -6160362154440274446L);
        setLongField(term4302625, term4302625.getClass(), "totalMasterDeluxscore", -4723703435503897993L);
        setLongField(term4302625, term4302625.getClass(), "totalReMasterDeluxscore", 7685674548395593958L);
        setIntField(term4302625, term4302625.getClass(), "totalSync", -1318968634);
        setIntField(term4302625, term4302625.getClass(), "totalBasicSync", -2035198723);
        setIntField(term4302625, term4302625.getClass(), "totalAdvancedSync", 44605345);
        setIntField(term4302625, term4302625.getClass(), "totalExpertSync", -427887265);
        setIntField(term4302625, term4302625.getClass(), "totalMasterSync", -1591377361);
        setIntField(term4302625, term4302625.getClass(), "totalReMasterSync", -1260086252);
        setLongField(term4302625, term4302625.getClass(), "totalAchievement", 1932216566349624426L);
        setLongField(term4302625, term4302625.getClass(), "totalBasicAchievement", 4126153648943109989L);
        setLongField(term4302625, term4302625.getClass(), "totalAdvancedAchievement", -4219556723421286032L);
        setLongField(term4302625, term4302625.getClass(), "totalExpertAchievement", -5769641709567231010L);
        setLongField(term4302625, term4302625.getClass(), "totalMasterAchievement", 4110685173445630755L);
        setLongField(term4302625, term4302625.getClass(), "totalReMasterAchievement", -4632768878408825388L);
        setLongField(term4302625, term4302625.getClass(), "playerOldRating", 3537750003892770327L);
        setLongField(term4302625, term4302625.getClass(), "playerNewRating", 7252262759203897533L);
        setIntField(term4302625, term4302625.getClass(), "banState", 317554337);
        setLongField(term4302625, term4302625.getClass(), "dateTime", 3756138311430341984L);
        term4302978 = new Integer(1754102534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4302978;
        callMethod(klass, "setPlaySyncCount", argTypes, term4302625, args);
    }

};


