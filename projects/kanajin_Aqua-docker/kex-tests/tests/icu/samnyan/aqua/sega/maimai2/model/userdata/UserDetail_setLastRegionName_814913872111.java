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

public class UserDetail_setLastRegionName_814913872111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258649;

    public UserDetail_setLastRegionName_814913872111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term258653 = new Long(1867943942587005261L);
        Integer term258716 = new Integer(1402881126);
        Integer term258718 = new Integer(786987666);
        Integer term258720 = new Integer(1810592574);
        Integer term258722 = new Integer(1394978641);
        ArrayList term258714 = new ArrayList();
        ((ArrayList) term258714).add(term258716);
        ((ArrayList) term258714).add(term258718);
        ((ArrayList) term258714).add(term258720);
        ((ArrayList) term258714).add(term258722);
        ArrayList term258726 = new ArrayList();
        term258649 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term258651 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term258667 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term258668 = newInstance(Class.forName("java.time.LocalDate"));
        Object term258672 = newInstance(Class.forName("java.time.LocalTime"));
        Object term258677 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term258678 = newInstance(Class.forName("java.time.LocalDate"));
        Object term258682 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term258649, term258649.getClass(), "id", -1437997109979003671L);
        setLongField(term258651, term258651.getClass(), "id", -5081900717044794087L);
        setField(term258651, term258651.getClass(), "extId", term258653);
        setField(term258651, term258651.getClass(), "luid", "SHSHsYUaOc");
        setIntField(term258668, term258668.getClass(), "year", 2021);
        setShortField(term258668, term258668.getClass(), "month", (short) 3);
        setShortField(term258668, term258668.getClass(), "day", (short) 14);
        setField(term258667, term258667.getClass(), "date", term258668);
        setByteField(term258672, term258672.getClass(), "hour", (byte) 19);
        setByteField(term258672, term258672.getClass(), "minute", (byte) 26);
        setByteField(term258672, term258672.getClass(), "second", (byte) 19);
        setIntField(term258672, term258672.getClass(), "nano", 18560091);
        setField(term258667, term258667.getClass(), "time", term258672);
        setField(term258651, term258651.getClass(), "registerTime", term258667);
        setIntField(term258678, term258678.getClass(), "year", 2022);
        setShortField(term258678, term258678.getClass(), "month", (short) 7);
        setShortField(term258678, term258678.getClass(), "day", (short) 30);
        setField(term258677, term258677.getClass(), "date", term258678);
        setByteField(term258682, term258682.getClass(), "hour", (byte) 14);
        setByteField(term258682, term258682.getClass(), "minute", (byte) 34);
        setByteField(term258682, term258682.getClass(), "second", (byte) 38);
        setIntField(term258682, term258682.getClass(), "nano", 597227850);
        setField(term258677, term258677.getClass(), "time", term258682);
        setField(term258651, term258651.getClass(), "accessTime", term258677);
        setField(term258649, term258649.getClass(), "card", term258651);
        setField(term258649, term258649.getClass(), "userName", "jXMTXHvttw");
        setIntField(term258649, term258649.getClass(), "isNetMember", 1874497920);
        setIntField(term258649, term258649.getClass(), "iconId", -218105407);
        setIntField(term258649, term258649.getClass(), "plateId", 471265365);
        setIntField(term258649, term258649.getClass(), "titleId", 385397789);
        setIntField(term258649, term258649.getClass(), "partnerId", 2024833795);
        setIntField(term258649, term258649.getClass(), "frameId", 8463116);
        setIntField(term258649, term258649.getClass(), "selectMapId", -620071954);
        setIntField(term258649, term258649.getClass(), "totalAwake", -205569196);
        setIntField(term258649, term258649.getClass(), "gradeRating", -230037651);
        setIntField(term258649, term258649.getClass(), "musicRating", -1357010359);
        setIntField(term258649, term258649.getClass(), "playerRating", 369666332);
        setIntField(term258649, term258649.getClass(), "highestRating", 1996656026);
        setIntField(term258649, term258649.getClass(), "gradeRank", 1730103539);
        setIntField(term258649, term258649.getClass(), "classRank", 832305588);
        setIntField(term258649, term258649.getClass(), "courseRank", -123081780);
        setField(term258649, term258649.getClass(), "charaSlot", term258714);
        setField(term258649, term258649.getClass(), "charaLockSlot", term258726);
        setLongField(term258649, term258649.getClass(), "contentBit", 6868159008243265383L);
        setIntField(term258649, term258649.getClass(), "playCount", 722335040);
        setField(term258649, term258649.getClass(), "eventWatchedDate", "WOqkLnLgei");
        setField(term258649, term258649.getClass(), "lastGameId", "xiCFEluOSq");
        setField(term258649, term258649.getClass(), "lastRomVersion", "EDeReFiqFY");
        setField(term258649, term258649.getClass(), "lastDataVersion", "uWHxeGcEwu");
        setField(term258649, term258649.getClass(), "lastLoginDate", "GVkEKlhcrr");
        setField(term258649, term258649.getClass(), "lastPlayDate", "uNKWJhnHHl");
        setIntField(term258649, term258649.getClass(), "lastPlayCredit", 1652760387);
        setIntField(term258649, term258649.getClass(), "lastPlayMode", 200148872);
        setIntField(term258649, term258649.getClass(), "lastPlaceId", 111642393);
        setField(term258649, term258649.getClass(), "lastPlaceName", "wjhYcpvRUu");
        setIntField(term258649, term258649.getClass(), "lastAllNetId", -1858518841);
        setIntField(term258649, term258649.getClass(), "lastRegionId", 351914623);
        setField(term258649, term258649.getClass(), "lastRegionName", "YqeXdoWJfV");
        setField(term258649, term258649.getClass(), "lastClientId", "qEABplGAwB");
        setField(term258649, term258649.getClass(), "lastCountryCode", "crdvuBefUh");
        setIntField(term258649, term258649.getClass(), "lastSelectEMoney", -981676366);
        setIntField(term258649, term258649.getClass(), "lastSelectTicket", 845140465);
        setIntField(term258649, term258649.getClass(), "lastSelectCourse", 152315062);
        setIntField(term258649, term258649.getClass(), "lastCountCourse", -955794807);
        setField(term258649, term258649.getClass(), "firstGameId", "DmSGIaLFxy");
        setField(term258649, term258649.getClass(), "firstRomVersion", "EIfTZcAWvK");
        setField(term258649, term258649.getClass(), "firstDataVersion", "UTxMkvUfrZ");
        setField(term258649, term258649.getClass(), "firstPlayDate", "NQsrTzOjPP");
        setField(term258649, term258649.getClass(), "compatibleCmVersion", "AaBJKKMloo");
        setField(term258649, term258649.getClass(), "dailyBonusDate", "xPudQMxgBM");
        setField(term258649, term258649.getClass(), "dailyCourseBonusDate", "dZjsEGIcWz");
        setField(term258649, term258649.getClass(), "lastPairLoginDate", "svjpGAjnRN");
        setField(term258649, term258649.getClass(), "lastTrialPlayDate", "pttzoCMsTO");
        setIntField(term258649, term258649.getClass(), "playVsCount", 753278662);
        setIntField(term258649, term258649.getClass(), "playSyncCount", -1972571656);
        setIntField(term258649, term258649.getClass(), "winCount", -1897916755);
        setIntField(term258649, term258649.getClass(), "helpCount", 1428440705);
        setIntField(term258649, term258649.getClass(), "comboCount", 1907554102);
        setLongField(term258649, term258649.getClass(), "totalDeluxscore", -3992190668634057880L);
        setLongField(term258649, term258649.getClass(), "totalBasicDeluxscore", -8552471339809164810L);
        setLongField(term258649, term258649.getClass(), "totalAdvancedDeluxscore", 1701633599508976862L);
        setLongField(term258649, term258649.getClass(), "totalExpertDeluxscore", -4649194936760353644L);
        setLongField(term258649, term258649.getClass(), "totalMasterDeluxscore", -3047509816514324913L);
        setLongField(term258649, term258649.getClass(), "totalReMasterDeluxscore", 1323456383717340978L);
        setIntField(term258649, term258649.getClass(), "totalSync", 774531243);
        setIntField(term258649, term258649.getClass(), "totalBasicSync", 711703993);
        setIntField(term258649, term258649.getClass(), "totalAdvancedSync", -276563829);
        setIntField(term258649, term258649.getClass(), "totalExpertSync", 1580982720);
        setIntField(term258649, term258649.getClass(), "totalMasterSync", 404999880);
        setIntField(term258649, term258649.getClass(), "totalReMasterSync", 348427240);
        setLongField(term258649, term258649.getClass(), "totalAchievement", 8031984989480064368L);
        setLongField(term258649, term258649.getClass(), "totalBasicAchievement", -1122804970653505900L);
        setLongField(term258649, term258649.getClass(), "totalAdvancedAchievement", -6194139084439928239L);
        setLongField(term258649, term258649.getClass(), "totalExpertAchievement", -5794532839091897476L);
        setLongField(term258649, term258649.getClass(), "totalMasterAchievement", -6621106520532755159L);
        setLongField(term258649, term258649.getClass(), "totalReMasterAchievement", -4856454074164203514L);
        setLongField(term258649, term258649.getClass(), "playerOldRating", 4678367789853076569L);
        setLongField(term258649, term258649.getClass(), "playerNewRating", -516383574368151723L);
        setIntField(term258649, term258649.getClass(), "banState", 173363669);
        setLongField(term258649, term258649.getClass(), "dateTime", 9028955969453444779L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UZDKpgGSjX";
        callMethod(klass, "setLastRegionName", argTypes, term258649, args);
    }

};


