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

public class UserDetail_setLastRegionName_814913872112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258704;

    public UserDetail_setLastRegionName_814913872112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term258708 = new Long(1867943942587005261L);
        Integer term258771 = new Integer(1402881126);
        Integer term258773 = new Integer(786987666);
        Integer term258775 = new Integer(1810592574);
        Integer term258777 = new Integer(1394978641);
        ArrayList term258769 = new ArrayList();
        ((ArrayList) term258769).add(term258771);
        ((ArrayList) term258769).add(term258773);
        ((ArrayList) term258769).add(term258775);
        ((ArrayList) term258769).add(term258777);
        ArrayList term258781 = new ArrayList();
        term258704 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term258706 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term258722 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term258723 = newInstance(Class.forName("java.time.LocalDate"));
        Object term258727 = newInstance(Class.forName("java.time.LocalTime"));
        Object term258732 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term258733 = newInstance(Class.forName("java.time.LocalDate"));
        Object term258737 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term258704, term258704.getClass(), "id", -1437997109979003671L);
        setLongField(term258706, term258706.getClass(), "id", -5081900717044794087L);
        setField(term258706, term258706.getClass(), "extId", term258708);
        setField(term258706, term258706.getClass(), "luid", "SHSHsYUaOc");
        setIntField(term258723, term258723.getClass(), "year", 2021);
        setShortField(term258723, term258723.getClass(), "month", (short) 3);
        setShortField(term258723, term258723.getClass(), "day", (short) 14);
        setField(term258722, term258722.getClass(), "date", term258723);
        setByteField(term258727, term258727.getClass(), "hour", (byte) 19);
        setByteField(term258727, term258727.getClass(), "minute", (byte) 26);
        setByteField(term258727, term258727.getClass(), "second", (byte) 19);
        setIntField(term258727, term258727.getClass(), "nano", 18560091);
        setField(term258722, term258722.getClass(), "time", term258727);
        setField(term258706, term258706.getClass(), "registerTime", term258722);
        setIntField(term258733, term258733.getClass(), "year", 2022);
        setShortField(term258733, term258733.getClass(), "month", (short) 7);
        setShortField(term258733, term258733.getClass(), "day", (short) 30);
        setField(term258732, term258732.getClass(), "date", term258733);
        setByteField(term258737, term258737.getClass(), "hour", (byte) 14);
        setByteField(term258737, term258737.getClass(), "minute", (byte) 34);
        setByteField(term258737, term258737.getClass(), "second", (byte) 38);
        setIntField(term258737, term258737.getClass(), "nano", 597227850);
        setField(term258732, term258732.getClass(), "time", term258737);
        setField(term258706, term258706.getClass(), "accessTime", term258732);
        setField(term258704, term258704.getClass(), "card", term258706);
        setField(term258704, term258704.getClass(), "userName", "jXMTXHvttw");
        setIntField(term258704, term258704.getClass(), "isNetMember", 1874497920);
        setIntField(term258704, term258704.getClass(), "iconId", -218105407);
        setIntField(term258704, term258704.getClass(), "plateId", 471265365);
        setIntField(term258704, term258704.getClass(), "titleId", 385397789);
        setIntField(term258704, term258704.getClass(), "partnerId", 2024833795);
        setIntField(term258704, term258704.getClass(), "frameId", 8463116);
        setIntField(term258704, term258704.getClass(), "selectMapId", -620071954);
        setIntField(term258704, term258704.getClass(), "totalAwake", -205569196);
        setIntField(term258704, term258704.getClass(), "gradeRating", -230037651);
        setIntField(term258704, term258704.getClass(), "musicRating", -1357010359);
        setIntField(term258704, term258704.getClass(), "playerRating", 369666332);
        setIntField(term258704, term258704.getClass(), "highestRating", 1996656026);
        setIntField(term258704, term258704.getClass(), "gradeRank", 1730103539);
        setIntField(term258704, term258704.getClass(), "classRank", 832305588);
        setIntField(term258704, term258704.getClass(), "courseRank", -123081780);
        setField(term258704, term258704.getClass(), "charaSlot", term258769);
        setField(term258704, term258704.getClass(), "charaLockSlot", term258781);
        setLongField(term258704, term258704.getClass(), "contentBit", 6868159008243265383L);
        setIntField(term258704, term258704.getClass(), "playCount", 722335040);
        setField(term258704, term258704.getClass(), "eventWatchedDate", "WOqkLnLgei");
        setField(term258704, term258704.getClass(), "lastGameId", "xiCFEluOSq");
        setField(term258704, term258704.getClass(), "lastRomVersion", "EDeReFiqFY");
        setField(term258704, term258704.getClass(), "lastDataVersion", "uWHxeGcEwu");
        setField(term258704, term258704.getClass(), "lastLoginDate", "GVkEKlhcrr");
        setField(term258704, term258704.getClass(), "lastPlayDate", "uNKWJhnHHl");
        setIntField(term258704, term258704.getClass(), "lastPlayCredit", 1652760387);
        setIntField(term258704, term258704.getClass(), "lastPlayMode", 200148872);
        setIntField(term258704, term258704.getClass(), "lastPlaceId", 111642393);
        setField(term258704, term258704.getClass(), "lastPlaceName", "wjhYcpvRUu");
        setIntField(term258704, term258704.getClass(), "lastAllNetId", -1858518841);
        setIntField(term258704, term258704.getClass(), "lastRegionId", 351914623);
        setField(term258704, term258704.getClass(), "lastRegionName", "YqeXdoWJfV");
        setField(term258704, term258704.getClass(), "lastClientId", "qEABplGAwB");
        setField(term258704, term258704.getClass(), "lastCountryCode", "crdvuBefUh");
        setIntField(term258704, term258704.getClass(), "lastSelectEMoney", -981676366);
        setIntField(term258704, term258704.getClass(), "lastSelectTicket", 845140465);
        setIntField(term258704, term258704.getClass(), "lastSelectCourse", 152315062);
        setIntField(term258704, term258704.getClass(), "lastCountCourse", -955794807);
        setField(term258704, term258704.getClass(), "firstGameId", "DmSGIaLFxy");
        setField(term258704, term258704.getClass(), "firstRomVersion", "EIfTZcAWvK");
        setField(term258704, term258704.getClass(), "firstDataVersion", "UTxMkvUfrZ");
        setField(term258704, term258704.getClass(), "firstPlayDate", "NQsrTzOjPP");
        setField(term258704, term258704.getClass(), "compatibleCmVersion", "AaBJKKMloo");
        setField(term258704, term258704.getClass(), "dailyBonusDate", "xPudQMxgBM");
        setField(term258704, term258704.getClass(), "dailyCourseBonusDate", "dZjsEGIcWz");
        setField(term258704, term258704.getClass(), "lastPairLoginDate", "svjpGAjnRN");
        setField(term258704, term258704.getClass(), "lastTrialPlayDate", "pttzoCMsTO");
        setIntField(term258704, term258704.getClass(), "playVsCount", 753278662);
        setIntField(term258704, term258704.getClass(), "playSyncCount", -1972571656);
        setIntField(term258704, term258704.getClass(), "winCount", -1897916755);
        setIntField(term258704, term258704.getClass(), "helpCount", 1428440705);
        setIntField(term258704, term258704.getClass(), "comboCount", 1907554102);
        setLongField(term258704, term258704.getClass(), "totalDeluxscore", -3992190668634057880L);
        setLongField(term258704, term258704.getClass(), "totalBasicDeluxscore", -8552471339809164810L);
        setLongField(term258704, term258704.getClass(), "totalAdvancedDeluxscore", 1701633599508976862L);
        setLongField(term258704, term258704.getClass(), "totalExpertDeluxscore", -4649194936760353644L);
        setLongField(term258704, term258704.getClass(), "totalMasterDeluxscore", -3047509816514324913L);
        setLongField(term258704, term258704.getClass(), "totalReMasterDeluxscore", 1323456383717340978L);
        setIntField(term258704, term258704.getClass(), "totalSync", 774531243);
        setIntField(term258704, term258704.getClass(), "totalBasicSync", 711703993);
        setIntField(term258704, term258704.getClass(), "totalAdvancedSync", -276563829);
        setIntField(term258704, term258704.getClass(), "totalExpertSync", 1580982720);
        setIntField(term258704, term258704.getClass(), "totalMasterSync", 404999880);
        setIntField(term258704, term258704.getClass(), "totalReMasterSync", 348427240);
        setLongField(term258704, term258704.getClass(), "totalAchievement", 8031984989480064368L);
        setLongField(term258704, term258704.getClass(), "totalBasicAchievement", -1122804970653505900L);
        setLongField(term258704, term258704.getClass(), "totalAdvancedAchievement", -6194139084439928239L);
        setLongField(term258704, term258704.getClass(), "totalExpertAchievement", -5794532839091897476L);
        setLongField(term258704, term258704.getClass(), "totalMasterAchievement", -6621106520532755159L);
        setLongField(term258704, term258704.getClass(), "totalReMasterAchievement", -4856454074164203514L);
        setLongField(term258704, term258704.getClass(), "playerOldRating", 4678367789853076569L);
        setLongField(term258704, term258704.getClass(), "playerNewRating", -516383574368151723L);
        setIntField(term258704, term258704.getClass(), "banState", 173363669);
        setLongField(term258704, term258704.getClass(), "dateTime", 9028955969453444779L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UZDKpgGSjX";
        callMethod(klass, "setLastRegionName", argTypes, term258704, args);
    }

};


